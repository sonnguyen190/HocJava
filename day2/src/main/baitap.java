package main;

public class baitap {
	//biến hằng là khi gán giá trị thì nó sẽ không thay đổi những lần sau(khai báo với từ khóa final)
static int age = 20;
	public static void main(String[] args) {
	int a = 500;
	int b = 200;
	int length =5;
	int width =4;
	
	
	
		
		System.out.println("tổng là "+tinhtong(a,b));
		System.out.println("hiệu là "+tinhhieu(a,b));
		System.out.println("tích là "+tinhtich(a,b));
		System.out.println("thương là "+tinhthuong(a,b));
		System.out.println("Chu vi hình chữ nhật là "+chuvihinhchunhat(length,width));
		System.out.println("Diện Tích hình chữ nhật là "+dientichhinhchunhat(length,width));
		myName();
		
		
		
		
	}
	public static int tinhtong(int firstNum , int secondNum) {
		int a= firstNum+secondNum ;
		return a;
	}
	public static void myName() {
		System.out.println("Nguyễn Văn Lâm Sơn");
		System.out.println("tôi "+age+" tuổi");
	}
	public static int tinhhieu(int firstNum , int secondNum) {
		int a= firstNum-secondNum ;
		return a;
	}
	public static int tinhtich(int firstNum , int secondNum) {
		int a= firstNum*secondNum ;
		return a;
	}
	public static float tinhthuong(float firstNum , float secondNum) {
		float a= firstNum/secondNum ;
		return a;
	}
	public static int chuvihinhchunhat(int length , int width) {
		int a= 2*(length+width) ;
		return a;
	}
	public static int dientichhinhchunhat(int length , int width) {
		int a= length*width ;
		return a;
	}
	
	
	
 	


	

}
