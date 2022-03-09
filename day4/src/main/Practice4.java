package main;

import java.util.Scanner;

public class Practice4 {

	public static void main(String[] args) {
		tinhDiemTrungBinh();
		
		tinhTongN();
	}

	public static void tinhDiemTrungBinh() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("mời nhập họ và tên của you:");
		String name = scanner.next();
		System.out.print("mời nhập điểm toán");
		int diemToan = scanner.nextInt();
		System.out.print("mời nhập điểm văn");
		int diemVan = scanner.nextInt();
		int diemTrungBinh = (diemToan + diemVan) / 2;
		System.out.println("bạn tên là " + name);
		System.out.println("điểm của bạn là:" + diemTrungBinh);

	}

	public static void tinhTongN() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("mời nhập N:");
		int n = scanner.nextInt();
		System.out.println("chạy tới số mấy thì ngưng?");
		int end = scanner.nextInt();
		for (int i = n; i == end; i++) {
			int Tong=i+(i+1);
			System.out.println(Tong);
		}
		

	}

}
