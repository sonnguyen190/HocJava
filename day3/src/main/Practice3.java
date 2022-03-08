package main;

public class Practice3 {

	public static void main(String[] args) {
		int a = 10;
		int b = 5;
		int c = 3;
		soChanSoLe(a);
		giamDanTangDan(a,b,c);
		
		
		int g = 99;	
		baiBa(g);
		
	}
	public static int soChanSoLe(int a) {
		if (a % 2 == 0) {
			System.out.println("số chẵn");
		} else {
			System.out.println("số lẻ");
		}
		return a;
	}
	
	public static void soLonNhat(int a,int b,int c) {
		if (a > b && a > c ) {
			System.out.println("a là số lớn nhất");
		} else if (b > a && b > c) {
			System.out.println("b là số lớn nhất");
		} else {
			System.out.println("c là số lớn nhất");
		}
		
	}
	
	public static void baiBa(int g) {
		
		if (g>=10&&g<=100) {
			System.out.println("g nằm trong khoảng từ 10 đến 100");
		}
		else {
			System.out.println("g không nằm trong khoảng");
		}
	}
	public static void giamDanTangDan (int a,int b,int c) {
	
		 if(a>b&&b>c) {
			 System.out.println("giảm dần");
		 }
		 else if (c>b&&b>a) {
			 System.out.println("tăng dần");
		 }
		 else {
			 System.out.println("không giảm cũng không tăng");
		 }
	}

}
