package com.Main;

import java.util.Scanner;

import com.model.Vehicle;
import com.model.xeHoi;
import com.service.impl.xeHoiImpl;

public class main {

	public static void main(String[] args) {
		Vehicle vehicle = new Vehicle();
		xeHoiImpl xeHoiImpl = new xeHoiImpl();
		boolean isExit = true;
		while (isExit) {
			System.out.println(".1:Thao tac voi xe hoi. /n .2:thao tac voi xe may. /n .3:Thoat chuong trinh.");
			Scanner scanner = new Scanner(System.in);
			int nhap = scanner.nextInt();
			switch (nhap) {
			case 1: 
				xeHoiImpl.displayMenuXeHoi();
				break;
			default:
				throw new IllegalArgumentException("Unexpected value: " + nhap);
			}
		}

	}

}
