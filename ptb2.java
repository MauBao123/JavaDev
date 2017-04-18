package ptbac2;

import java.util.Scanner;

public class ptb2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float a=0, b=0, c=0;
		System.out.println("Giải phương trình bậc 2 ax*x + bx + c=0 ");

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nhập a: ");
		a=sc.nextInt();
		
		System.out.println("Nhập b: ");
		b=sc.nextInt();
		
		System.out.println("Nhập c: ");
		c=sc.nextInt();
	//Xử lý
		
		String kq="";
		if (a==0)

				if(b==0)

					if(c==0)
						System.out.println("Phương trình có vô số nghiệm");
						//	kq="Phương trình có vô số nghiệm";	
					else
						System.out.println("Phương trình vô nghiệm");
						//kq="Phương trình vô nghiệm";	
				
				else	
					System.out.println("Phương trình có một nghiệm x= " + (-c/b));
					//kq="Phương trình có một nghiệm x= " + (-c/b);
				
		else {	
				float d=b*b-4*a*c;
				if(d<0)	kq="Phương trình vô nghiệm";
				
				if(d==0)
								
					kq="Phương trình có nghiệm kép x1=x2= " +(-b/(2*a));
				
				if(d>0)
				{	
					float x1= (-b  + (float)Math.sqrt(d))/(2*a);
					float x2= (-b  - (float)Math.sqrt(d))/(2*a);
					kq="Phương trình có 2 nghiệm x1= " + x1 +"; và x2=" +x2; 
				}
				
		//Xuất
		System.out.println("Phương trình " +a + ".x*x+" +b+".x" + +c + "=0");
		System.out.println(kq);
		}					
	}}
