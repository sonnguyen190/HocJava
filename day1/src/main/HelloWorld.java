package main;

public class HelloWorld {
	

//căn dòng ctr shift F
//xoa 1 dòng ctrl D
//gợi ý là Ctrl space
// tu động import ctrl shift o
	
// git init --> khoi tao (lam 1 lan duy nhat)
//	git add . ->add cac file muon push
// git config --global user.email "sonkute190@gmail.com"	
// git config --global user.name "SonNguyen"
// git commit -m "first commit"(tạo lời nhắn để nhận biết code nào đã commit)
//	git branch -M main(muốn nhánh nào main hay master)
//	git remote add origin https://github.com/sonnguyen190/HocJava.git(add link vào biến origin)
//	git push -u origin main(push code lên mà chọn nhánh push)
// git add src/main/helloem.java src/main/HelloWorld.java	
	public static void main(String[] args) {
		int age = 18;	
		String name = "Nguyễn văn Lâm Sơn";

		System.out.println("My name is" + name );
		
		System.out.println("tuổi " + age);
	}

}