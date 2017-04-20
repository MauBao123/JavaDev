import java.util.Date;
import java.util.Scanner;

/*	Bẫy nhập
 * 	Nhập vào một tuổi của sinh viên (qui định:>=13, <=100)
 *	Tính ra năm sinh 	
 */
public class while1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int tuoi;
		Scanner sc = new Scanner(System.in); 
		do {
			System.out.println("Nhập tuổi SV (>=13, <=65)");
			tuoi=sc.nextInt();
			if ((tuoi<=13)||(tuoi>65))
			{System.out.println("Tuổi của SV không phù hợp");}
			
			}	
		while((tuoi<=13)||(tuoi>65));
			System.out.println("Tuổi của SV là: "+tuoi);
		//Tính năm sinh ở đây
			 // khoi tao mot doi tuong Date
		       Date date = new Date();
		        
		       // Hien thi date da duoc dinh dang
		       System.out.printf("%s %tB %<te, %<tY", "Ngày hôm nay là:", date);	}

}
