package main;

public class Taobien {

	public static void main(String[] args) {
		// DataType varName [ = value]
		String myName = "Nguyễn Văn Lâm Sơn";
		int age = 20;
		boolean a = false;
		float chieuCao = 167.7f;

		System.out.println("Tôi Tên là: " + myName);
		System.out.println("Năm nay tôi: " + age + " tuổi");
		System.out.println("tôi cao " + chieuCao + " cm");
		System.out.println("tôi có phải là học sinh không? :" + a);
		if (a == true) {
			System.out.println("phải đi học thôi");
		} else {
			System.out.println("ở nhà thôi");
		}
		System.out.println("1+1= " + phepToan());
		System.out.println("Pho ren ti nô: " + phailoila());
		System.out.println("em ăn cơm chưa?" + emAnComChua());
		System.out.println("Hàm Trả về 100+100 là: "+ hamTraVe(100));
		System.out.println(hamTraVeChuoi("mắc cười quá "));
		System.out.println(tong2So(343,234));
	}

	public static int phepToan() {
		int a = 1;
		int b = 10;
		int c = a + b;
		return c;
	}

	public static String phailoila() {
		String a = "phải lói là 1 tìn huốn cựt rắt";
		return a;
	}

	public static String emAnComChua() {
		Boolean a = true;
		if (a == true) {
			return "Ăn Rồi";
		} else {
			return "Chưa Ăn";
		}

	}

	public static int hamTraVe(int a) {
		return a + 100;

	}
	public static String hamTraVeChuoi(String a) {
		return a + "hahahahaha";

	}
	public static int tong2So(int a,int b) {
		return a+b;

	}
	

}
