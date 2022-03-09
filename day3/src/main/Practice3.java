package main;

public class Practice3 {

	public static void main(String[] args) {
		int a = 0;
		int b = 1;
		int c = 3;
		soChanSoLe(a);
		giamDanTangDan(a,b,c);
		soLonNhat(a,b,c);
		giaiPhuongTrinh(a,b);
		
		
		int g = 99;	
		kiemTraNamTrongKhoang(g);
		
		int month = 3;
		double tong=tinhLuong(month);
		
		int year=2021;
		int thangvanam=nhapThangvaNam(month,year);
		
	}

	public static int soChanSoLe(int a) {
		if (a % 2 == 0) {
			System.out.println("số chẵn");
		} else {
			System.out.println("số lẻ");
		}
		return a;
	}

	public static void soLonNhat(int a, int b, int c) {
		if (a > b && a > c) {
			System.out.println("a là số lớn nhất");
		} else if (b > a && b > c) {
			System.out.println("b là số lớn nhất");
		} else {
			System.out.println("c là số lớn nhất");
		}

	}

	public static void kiemTraNamTrongKhoang(int g) {

		if (g >= 10 && g <= 100) {
			System.out.println("g nằm trong khoảng từ 10 đến 100");
		} else {
			System.out.println("g không nằm trong khoảng");
		}
	}

	public static void giamDanTangDan(int a, int b, int c) {

		if (a > b && b > c) {
			System.out.println("giảm dần");
		} else if (c > b && b > a) {
			System.out.println("tăng dần");
		} else {
			System.out.println("không giảm cũng không tăng");
		}
	}

	public static double tinhLuong(int month) {
		double Luong = 0;
		if (month < 12) {
			Luong = 1.92 * 650000;
		} else if (12 <= month && month < 36) {
			Luong = 2.34 * 650000;
		} else if (month >= 36 && month < 60) {
			Luong = 3 * 650000;
		} else {
		    Luong = 4.5 * 650000;
		}
		System.out.println("Tổng Số Lương Là: "+Luong);
		return Luong;

	}
	
	public static void giaiPhuongTrinh(int a,int b) {
		if(a==0) {
			if(b==0) {
				System.out.println("Phương Trinh Vô Số Nghiệm");
			}
			else {
				System.out.println("Phương Trình Vô Nghiệm");
			}
		}
		else {
			int x = -b/a;
			System.out.println("Nghiệm X = "+x);
			
		}
	}
	
	public static int nhapThangvaNam(int month,int year) {
		switch (month) {
		case 1: 
		case 3: 
		case 5: 
		case 7: 
		case 8: 
		case 10: 
		case 12: 
			System.out.println("có 31 days");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("có 30 days");
		case 2:
			if(year%400==0||year%4==0) {
				System.out.println("là năm nhuần");
				break;
			}
			else {
				System.out.println("năm không nhuần");
				break;
			}
			
		default:System.out.println("không đúng mời nhập lại");
			
		}
		return month;
	}

}
