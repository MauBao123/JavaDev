package dangnhap;

import java.util.Scanner;

public class dangnhap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		String tenDN="", mk="";
		Scanner ban_phim = new Scanner(System.in);

		do{
			System.out.print("Tên DN:");
			tenDN = ban_phim.nextLine();
			System.out.print("Mật Khẩu:");
			mk = ban_phim.nextLine();
			if((tenDN.compareTo("DHCN1B")!=0)||(mk.compareTo("123")!=0))
				{System.out.println("Bạn đã nhập sai Tên DN và Mật Khẩu");}
		}
		while((tenDN.compareTo("DHCN1B")!=0)||(mk.compareTo("123")!=0));
		System.out.println("Welcom to DHCN1B");
	}

}
