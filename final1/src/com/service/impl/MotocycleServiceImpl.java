package com.service.impl;

import java.io.Serializable;
import java.util.Scanner;

import com.dao.impl.MotocycleDaoImpl;
import com.model.Car;
import com.model.Motorcycle;
import com.service.MotocycleSevice;

public class MotocycleServiceImpl extends VehicleServiceImpl implements MotocycleSevice {
	MotocycleDaoImpl motocycleDaoImpl = new MotocycleDaoImpl();
	Motorcycle[] arrMotocycle;
	Scanner scanner = new Scanner(System.in);
	
	
	public MotocycleServiceImpl() {
		super();
	this.arrMotocycle = motocycleDaoImpl.findAll();
	}
	void inputinfoMotocycle(Motorcycle moto) {
		super.inputInfo(moto);
		System.out.println("moi nhap cong suat: ");
		int congsuat = scanner.nextInt();
		moto.setCongSuat(congsuat);
		
	}
	void displayInfoMotocycle(Motorcycle motocycle) {
		super.displayInfo(motocycle);
		System.out.println("cong suat la: " + motocycle.getCongSuat());
	}
	@Override
	public void displayAll() {
		if(arrMotocycle != null) {
			for(int i=0;i<arrMotocycle.length;i++) {
				displayInfoMotocycle(arrMotocycle[i]);
			}
		}
		else {
			System.out.println("mang rong!! can add vao truoc");
		}
		
		
	}

	@Override
	public Motorcycle findMotocycleTheoSoXe(String soXe) {
		for(int i=0;i<arrMotocycle.length;i++) {
			if(arrMotocycle[i].getSoXe().equals(soXe)) {
				return arrMotocycle[i];
			}
			else {
				 System.out.println("khong tim thay so xe phu hop!!");
			}
		}
		return null;
	}

	@Override
	public Motorcycle[] add(int indexAdd) {
		Motorcycle motocycle = new Motorcycle();
		inputinfoMotocycle(motocycle);
		Motorcycle[] newArrMoto = arrMotocycle == null ? new Motorcycle[1]: new Motorcycle[arrMotocycle.length+1];
		for(int i=0;i<indexAdd;i++) {
			newArrMoto[i]=arrMotocycle[i];
		}
		newArrMoto[indexAdd] = motocycle;
		
		for(int i=indexAdd+1;i<newArrMoto.length;i++) {
			newArrMoto[i]=arrMotocycle[i-1];
		}
		motocycleDaoImpl.save(newArrMoto);
		return newArrMoto;
	}

	@Override
	public Motorcycle[] remove(String soxe) {
		Motorcycle[] motoRemoveArr = new Motorcycle[arrMotocycle.length-1];
		for(int i=0;i<arrMotocycle.length-1;i++) {
			
			motoRemoveArr[i]=arrMotocycle[i];
			
			if(arrMotocycle[i].getSoXe().equals(soxe)) {
				motoRemoveArr[i]= arrMotocycle[i+1];
				System.out.println("remove complete :))");
				
			}
			
			
		}
		motocycleDaoImpl.save(motoRemoveArr);
		return motoRemoveArr;
	}

	@Override
	public Motorcycle[] findmotoTheoSoXeVaNhapLai(String soxe) {
		for(int i=0;i<arrMotocycle.length;i++) {
			if(arrMotocycle[i].getSoXe().equals(soxe)) {
				arrMotocycle[i].toString();
				Motorcycle[] arrr =add(i);
				arrMotocycle[i]=arrr[i];
				
			}
		}
		return arrMotocycle;
		
	}

	@Override
	public Motorcycle[] sortTheoCongSuat() {
		for (int i = 0; i < arrMotocycle.length - 1; i++) {
			for (int j = i + 1; j < arrMotocycle.length; j++) {
				if ((arrMotocycle[i].getCongSuat()) > (arrMotocycle[j].getCongSuat())) {
					Motorcycle tam = arrMotocycle[i];
					arrMotocycle[i] = arrMotocycle[j];
					arrMotocycle[j] = tam;
				}
			}
		}
		motocycleDaoImpl.save(arrMotocycle);
		return arrMotocycle;
		
	}
	
	public void displayMenuMotocycle() {
		boolean isExit=true;
		while (isExit) {
			System.out.println("1.display all \n 2.find moto theo so xe va xuat ra \n 3.add \n 4.remove \n 5.find moto va nhap lai thong tin \n 6.sort moto theo cho cong suat \n 7.Exit");
			int value = scanner.nextInt();
			switch (value) {
			case 1: 
				displayAll();
				break;
			case 2: 
				System.out.println("moi nhap so xe can xuat: ");
				String soXe = scanner.next();
				Motorcycle moto = findMotocycleTheoSoXe(soXe);
				if(moto != null) {
					displayInfoMotocycle(moto);
				}
				
				
				break;
			case 3: 
				System.out.println("moi nhap vi tri can add vao mang bat dau tu 0");
				int vitri = scanner.nextInt();
				Motorcycle[] newArrMoto = add(vitri);
				arrMotocycle = newArrMoto;
				break;
			case 4: 
				System.out.println("nhap so xe can remove:");
				String indexRemove = scanner.next();
				Motorcycle[] arrayRemove =remove(indexRemove);
				arrMotocycle=arrayRemove;
				break;
			case 5: 
				System.out.println("moi nhap so xe can tim va thay the:");
				String soXeFind= scanner.next();
				Motorcycle[] motoFind=findmotoTheoSoXeVaNhapLai(soXeFind);
				arrMotocycle=motoFind;
				break;
			case 6: 
				arrMotocycle=sortTheoCongSuat();
					displayAll();
					break;
			case 7: 
				isExit=false;
				break;
			default:
				throw new IllegalArgumentException("Unexpected value: " + value);
			}
		}
	}

}
