package main;
//enum WeekDay{

//	MON,TUE,WED,THUR,FRI,SAT,SUN;
//}

public class Lession9 {
// String str = "" khai báo thời cổđại,Stack,chung vùng nhớ
//String str = new String("ajkjskas") heap,đối tượng,có 2 vùng nhớ khác nhau lưu trên heap
// so sánh == là so sánh địa chỉ 
//so sánh equal là so sánh nội dung

//charAt là trả về ký tự tương ứng với index
// s7.concat("...") nối chuỗi s7 vào dấu 3 chấm
// s7.indexOf("...") kiểm tra từ trái sang phải xem có khớp với dấu 3 chấm 
// s7.lastIndexOf("") ngược lại của index of là kiểm từ phải qua trái
// s7.replace('w','1') là thay thế chữ w trong chuỗi thành số 1
//	s7.split(",") cắt chuỗi theo dấu phẩy
	public static void main(String[] args) {
		// chuyển chuỗi thành số
		String str = "12345";
		int numb = Integer.parseInt(str);
		System.out.println(numb);
		float numbFloat = Float.parseFloat(str);
		System.out.println(numbFloat);
		System.out.println("===================================");
		// chuyển số thành chuỗi

		// cách 1
		int number = 12345;
		String string = String.valueOf(number);
		System.out.println(string);
		// cách 2
		String Sching = "" + number;
		System.out.println(Sching);

		// cách 3
		String stri = Integer.toString(number);
		System.out.println(stri);

		String s1 = "Hello";
		String s2 = "hahaha";
		String s3 = s1;

		String s4 = new String("Hello");
		String s5 = new String("hahaha");
		String s6 = s5;

		boolean c1 = s1 == s3;
		boolean c2 = s4 == s3;
		boolean c3 = s4 == s6;

		boolean c4 = s1.equals(s6);
		boolean c5 = s3.equals(s4);
		boolean c6 = s5.equals(s2);
		System.out.println(c6);
//		for(WeekDay day : WeekDay.values())
		// WeekDay day = WeekDay.SUN;
		// ctrl shift i để xem enum ,tô đen
//		System.out.println(day);

		WeekDay d1 = WeekDay.sjs(1);
		System.out.println(d1);
		WeekDay sjs = WeekDay.TUE;

		switch (sjs) {
		case MON:
			System.out.println("monday");
			break;
		case TUE:
			System.out.println("tuesday");
			break;

		}

	}
}
