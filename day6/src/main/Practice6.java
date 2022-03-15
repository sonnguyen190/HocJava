package main;

import java.util.Scanner;

public class Practice6 {

	public static void main(String[] args) {
//		tinhSn();
//		tichUocSoLe();
//		tinhTongCacUocSoNho();
//		tichChuSoLe();
//		findSoDauTien();
//		findSoDaoNguoc();
	}
	
//	public static void tinhSn() {
//		double S=0;
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("moi nhap n: ");
//		int n = scanner.nextInt();
//		for(int i= 1;i<=n;i++) {
//			S =S+ (double)i/(i+1);
//			
//			System.out.println(S);
//		}
//		System.out.println(S);
//	}
	
//	public static void tichUocSoLe() {
//		int tich=1;
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("moi nhap n: ");
//		int n = scanner.nextInt();
//		for(int i = 1;i<=n;i++) {
//			if(n%i==0&&i%2!=0) {
//				tich*=i;
//				System.out.println(i);
//			}
//			System.out.println(tich);
//		}
//	}
	
//	public static void tinhTongCacUocSoNho() {
//		int tong=0;
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("moi nhap n: ");
//		int n = scanner.nextInt();
//		for(int i = 1;i<n;i++) {
//			if(n%i==0) {
//				tong+=i;
//			}
//		}
//		System.out.println(tong);
//	}
	 
//	public static void tichChuSoLe() {
//		int tich=1;
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("moi nhap n: ");
//		int n = scanner.nextInt();
//		while(n!=0) {
//			int viTriCuoi = n%10;
//			if(viTriCuoi%2!=0) {
//				 tich*=viTriCuoi;
//				 System.out.println(viTriCuoi);
//			}
//			n=n/10;
//		}
//		System.out.println(tich);
//		
//	}
	
//	public static void findSoDauTien() {
//		int sodautien;
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("moi nhap n: ");
//		int n = scanner.nextInt();
//		do {
//			sodautien=n%10;
//			n/=10;
//		} while (n>0);
//		
//		System.out.println(sodautien);
//	}
	
//	public static void findSoDaoNguoc() {
//		int viTriCuoi;
//		int soDaoNguoc=0;
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("moi nhap n: ");
//		int n = scanner.nextInt();
//		while(n>0) {//nếu n ==0 hoặc <0 thì khong chậy
//			viTriCuoi = n%10; // tìm số cuối
//			soDaoNguoc=soDaoNguoc*10+viTriCuoi; //lấy số cuối và gán vào biến soDaoNguoc
//			n/=10;   //bỏ số cuối và chạy lại vòng lặp
//		}
//		System.out.println(soDaoNguoc);
//	}

}
