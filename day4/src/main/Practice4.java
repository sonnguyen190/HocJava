package main;

import java.util.Scanner;

public class Practice4 {

	public static void main(String[] args) {
		tinhDiemTrungBinh();
		tinhTongN();
		tinhTongX();
		kiemTraSoNguyenTo();
		lietKeSoNguyenTo();
		uocSoLeLonNhat();
		tongUocSoChan();
		tongChuSoChan();

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
		int tong = 0;
		for (int i = n; i < end + 1; i++) {
			tong += i;
		}
		System.out.println(tong);

	}

	public static void tinhTongX() {
		int tong = 0;
		int luyThua = 1;
		Scanner scanner = new Scanner(System.in);
		System.out.println("mời nhập X: ");
		int x = scanner.nextInt();
		System.out.println("mời nhập N số mũ:");
		int n = scanner.nextInt();

		for (int i = 1; i <= n; i++) {
			luyThua = luyThua * x; // gán số mới vào biến lt khi vòng lặp chạy lại x^1,x^2...
			tong += luyThua;

		}
		System.out.println(tong);

	}

	public static void kiemTraSoNguyenTo() {
		Scanner scanner = new Scanner(System.in);

		System.out.println("mời nhập số N: ");
		int n = scanner.nextInt();
		if (kiemTraSoNguyenToIstrue(n)) {
			System.out.println("n là số nguyên tố");
		} else {
			System.out.println("n không là số nguyên tố");
		}

	}

	public static boolean kiemTraSoNguyenToIstrue(int n) {
		if (n < 2) {
			return false;
		}
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				return false;
			}

		}
		return true;
	}

	public static void lietKeSoNguyenTo() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("mời nhập n: ");
		int n = scanner.nextInt();
		if (n >= 2) {
			System.out.println(2);
		}
		for (int i = 3; i < n; i += 2) {
			if (kiemTraSoNguyenToIstrue(i)) {
				System.out.println(" " + i);
			}
		}

	}

	public static void uocSoLeLonNhat() {
		int a = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("mời nhập n: ");
		int n = scanner.nextInt();
		for (int i = n; i >= 1; i--) {
			if (n % i == 0 && i % 2 != 0) {
				a = i;
				System.out.println("uoc so le lon nhat la: " + a);
				break;
			}
		}

	}

	public static void tongUocSoChan() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("mời nhập n: ");
		int n = scanner.nextInt();
		int tong = 0;
		for (int i = 1; i <= n / 2; i++) {
			if (i % 2 == 0 && n % i == 0) {
				System.out.println(i);
				tong += i;
			}
		}
		System.out.println("Tổng là" + tong);
	}

	public static void tongChuSoChan() {
		int n;
		int sum = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("mời nhập n: ");
		n = scanner.nextInt();
		while (n != 0) {
			int vitriCuoi = n % 10;
			if (vitriCuoi % 2 == 0) {
				sum += vitriCuoi;
			}
			n = n / 10;
		}

		System.out.println("Tổng các số chẵn nguyên dương là: " + sum);
	}

}