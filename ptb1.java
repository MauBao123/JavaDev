package ptb1;

import java.util.Scanner;

public class ptb1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0, b=0;
		System.out.println("Giải phương trình bậc 1 ax+b=0 ");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nhập a: ");
		a=sc.nextInt();
		
		System.out.println("Nhập b: ");
		b=sc.nextInt();
	// Đoạn code xử lý
		String kq="";
		if (a==0){
			if(b==0) kq="Phương trình vô số nghiệm";
			else kq="Phương trình vô nghiệm";
				}
		else {
			double x= -b*1.0/a;	kq="Phương trình có một nghiệm x= " + x;
			}
		//Xuat
		System.out.println("Phương trình " +a + ".x+" +b +"=0");
		System.out.println(kq);
		}				
	}

