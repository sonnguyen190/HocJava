package main;

import java.util.Arrays;
import java.util.Scanner;

public class Practice7 {

	public static void main(String[] args) {

		mang1Chieu();
		findMax();
		nNhoNhat();
		findChan();
		findChanCuoiCung();
		findSoNguyenTo();
		uocChungLonNhat();
	}

	public static void mang1Chieu() {

		Scanner scanner = new Scanner(System.in);
		System.out.println("mời nhập độ dài của mảng: ");
		int lenght = scanner.nextInt();
		int[] mang = new int[lenght];
		System.out.println("mời nhập giá trị mảng tương ứng với độ dài: ");

		for (int i = 0; i < lenght; i++) {
			mang[i] = scanner.nextInt();
		}
		System.out.println(Arrays.toString(mang));
	}

	public static void findMax() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("mời nhập độ dài của mảng: ");
		int lenght = scanner.nextInt();
		int[] mang = new int[lenght];
		int max = mang[0];
		System.out.println("mời nhập value: ");
		for (int i = 0; i < lenght; i++) {
			mang[i] = scanner.nextInt();
			if (mang[i] > max) {
				max = mang[i];
				
			}
		}
		System.out.println("mang lon nhat la: " + max);

	}

	public static void nNhoNhat() {// kho qua cho qua
		int i = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("moi nhap do dai cua mang: ");
		int lenght = scanner.nextInt();
		int[] arr = new int[lenght];
		int min = arr[0];
		System.out.println("moi nhap value mang: ");
		for (i =0; i <= lenght; i++) {
			arr[i] = scanner.nextInt();
			if (arr[i] < arr[min] && arr[i] > 0) {
				min = arr[i];
				System.out.println(Arrays.toString(arr));
			}
		}
		System.out.println(min);

	}

	public static void findChan(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("mời nhập độ dài của mảng: ");
		int lenght = scanner.nextInt();
		int[] mang = new int[lenght];
		System.out.println("moi nhap gia tri mang: ");
		for(int i =0;i<lenght;i++) {
			mang[i]=scanner.nextInt();
			System.out.println(Arrays.toString(mang));
			if(mang[i]%2==0) {
				System.out.println(mang[i]);
				break;
			}
		}
	}

	public static void findChanCuoiCung() {
		int dem = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("mời nhập độ dài của mảng: ");
		int lenght = scanner.nextInt();
		int[] mang = new int[lenght];
		System.out.println("moi nhap gia tri mang: ");
		for (int i = 0; i < lenght; i++) {
			mang[i] = scanner.nextInt();
			
			if (dem < mang[i]&&mang[i]%2==0) {
				System.out.println(mang[i]);
				dem = mang[i];

			}
			else {
				System.out.println("kh co mang chan");
			}
		}

		System.out.println("mang chaN CUOI CUNG LA: "+dem);
	}

	public static void findSoNguyenTo() {
		int sntMax=0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("moi nhap do dai mang: ");
		int lenght = scanner.nextInt();
		int [] mang = new int [lenght];
		System.out.println("moi nhap gia tri mang: ");
		for(int i=0;i<lenght;i++) {
			mang[i]=scanner.nextInt();
			if(mang[i]==2){
				sntMax=mang[i];
			}
			else if(mang[i]>2&&mang[i]%i!=0) {
				sntMax=mang[i];
			}
			else {
				System.out.println("khong phai la snt");
			}
		}
		System.out.println("so nguyen to lon nhat la: "+sntMax);
		
	}

	public static void uocChungLonNhat() {
		int dem = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("mời nhập độ dài của mảng: ");
		int lenght = scanner.nextInt();
		int[] mang = new int[lenght];
		System.out.println("moi nhap gia tri mang: ");
		for (int i = 0; i < lenght; i++) {
			mang[i] = scanner.nextInt();

		}
		for (int i = 0; i < lenght; i++) {
			if (mang[i] % i  == 0) {
				dem = i;
			}
		}
		System.out.println("uoc chung lon nhat la: "+dem);

	}

}