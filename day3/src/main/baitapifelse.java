package main;

public class baitapifelse {

	public static void main(String[] args) {
		int a = 10;
		int b = 50;
		int c = a < b ? a + b : a - b;

		System.out.println(c);

		char chanLe = 'e';
		switch (chanLe) {
		case 'l':
			System.out.println("Lờ");
		case 'e':
			System.out.println("E");
		case 5:
		case 7:
		case 9:
		case 11:
			System.out.println("số lẻ");
		case 2:
		case 4:
		case 6:
		case 8:
		case 10:
			System.out.println("số chẵn");
		default:
			System.out.println("default");
			break;
		}

	}

}
