package main;

import java.util.Scanner;

public class VongLap {

	public static void main(String[] args) {
		kiemTraSoNguyenTo();
		vongLapWhile();
		System.out.println("-------------");
		vongLapFor();
		System.out.println("-------------");
		vongLapDoWhile();
		System.out.println("-------------demo breaK");
		demoBreak();
		System.out.println("-------------demo Continue");
		demoContinue();
	}

	public static void vongLapWhile() {
		int i = 1;
		while (i < 6) {
			System.out.println(i);
			i++;
		}
	}

	public static void vongLapFor() {

		for (int i = 1; i < 6; i += 1) {
			System.out.println(i);
		}
	}

	public static void vongLapDoWhile() {
		int i = 6;// lặp ít nhất 1 lần
		do {
			i--;
			System.out.println(i);
		} while (i > 0);

	}

	public static void demoBreak() {
		for (int i = 0; i < 6; i++) {
			System.out.print(i + ":");
			for (int j = 0; j < 5; j++) {
				if (j == 4) {
					break;
				}
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

	public static void demoContinue() {
		for (int i = 0; i < 6; i++) {
			System.out.print(i + ":");
			for (int j = 0; j < 6; j++) {
				if (j == 4) {
					continue;
				}
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
	
	
	public static void kiemTraSoNguyenTo() {
		Scanner scannner = new Scanner(System.in);
		System.out.println("mời nhập số:");
		int a = scannner.nextInt();
		System.out.println(a);
		if (a/1==1&&a%a==0) {
			System.out.println("là số nguyên tố");
		}
		else {
			System.out.println("không phải là số nguyên tố");
		}
		
	}
}
