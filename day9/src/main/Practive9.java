package main;

import java.util.Arrays;
import java.util.Scanner;

public class Practive9 {

	public static void main(String[] args) {
//		demSoLanXuatHien();
//		demNNhoHon100();
//		sapXepMang1ChieuTangDan();
//		sapXepLeTangDan();
	}

	public static void swap(int a, int b) {
		int tam = a;
		a = b;
		b = tam;

	}
//	public static void demSoLanXuatHien() {
//		int dem=0;
//		Scanner scanner = new Scanner(System.in);
//		
//		System.out.println("moi nhap do dai mang: ");
//		int lenghtarr = scanner.nextInt();
//		System.out.println("moi nhap gia tri can dem: ");
//		int x = scanner.nextInt();
//		System.out.println("moi nhap gia tri cua mang: ");
//		int [] mang =new  int [lenghtarr];
//		for(int i=0;i<lenghtarr;i++) {
//			mang[i]= scanner.nextInt();
//			if(mang[i]==x) {
//				dem+=1;
//			}
//			
//		}
//		System.out.println("x xuat hien:" + dem+" lan");
//	}

//	public static void demNNhoHon100() {
//		int dem = 0;
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("moi nhap do dai mang: ");
//		int lenghtarr = scanner.nextInt();
//		System.out.println("moi nhap gia tri mang: ");
//		int [] mang=new int[lenghtarr];
//		for(int i=0;i<lenghtarr;i++) {
//			mang[i]=scanner.nextInt();
//			if(mang[i]<100&&mang[i]%2==0&&mang[i]>=2) {
//				dem+=1;
//			}
//		}
//		System.out.println("so luong so nguyen to trong mang be hon 100 la: "+dem);
//		
//	}
//	public static void sapXepMang1ChieuTangDan() {
//
//		int a = 2;
//		int b = 1;
//		swap(a, b);
//		System.out.println(a);
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("moi nhap do dai mang: ");
//		int lenghtarr = scanner.nextInt();
//		System.out.println("moi nhap gia tri mang: ");
//		int[] mang = new int[lenghtarr];
//		for (int i = 0; i < lenghtarr; i++) {
//			mang[i] = scanner.nextInt();
//		}
//		for (int i = 0; i < lenghtarr - 1; i++)
//			for (int j = i + 1; j < lenghtarr; j++) {
//				if (mang[i] > mang[j]) {
//					swap(mang[i], mang[j]);
//					System.out.println(Arrays.toString(mang));
//				}
//			}
//	}

//	public static void sapXepLeTangDan() {
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("moi nhap do dai mang: ");
//		int lenghtarr=scanner.nextInt();
//		System.out.println("moi nhap gia tri mang:");
//		int [] mang = new int[lenghtarr];
//		for(int i=0;i<lenghtarr;i++) {
//			mang[i] = scanner.nextInt();
//		}
//			for (int i = 0; i < lenghtarr - 1; i++)
//			for (int j = i + 1; j < lenghtarr; j++) {
//				if (mang[i] > mang[j] && mang[i]%2!=0 && mang[j]%2!=0) {
//					swap(mang[i], mang[j]);
//					System.out.println(Arrays.toString(mang));
//				}
//			}
//	}
	
}
