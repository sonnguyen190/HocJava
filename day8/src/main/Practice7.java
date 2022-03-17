package main;

import java.util.Arrays;
import java.util.Scanner;

public class Practice7 {

	public static void main(String[] args) {

//		mang1Chieu();
		findMax();
	}

//	public static void mang1Chieu() {
//
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("mời nhập độ dài của mảng: ");
//		int lenght = scanner.nextInt();
//		int[] mang = new int[lenght];
//		System.out.println("mời nhập giá trị mảng tương ứng với độ dài: ");
//
//		for (int i = 0; i < lenght; i++) {
//			mang[i] = scanner.nextInt();
//		}
//		System.out.println(Arrays.toString(mang));
//	}

	public static void findMax() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("mời nhập độ dài của mảng: ");
		int lenght = scanner.nextInt();
		int[] mang = new int[lenght];
		int max = mang[0];
		System.out.println("mời nhập value: ");
		for (int i = 0; i <= lenght; i++) {
			mang[i] = scanner.nextInt();
			if (mang[i] > max) {
				max = mang[i];
				System.out.println(max);
			}
		}

	}

}