package onetuti;

import java.util.Scanner;

public class onetuti {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("====================================");
		System.out.println("================TEXT================");
		System.out.println("=========1:Búa==2:Bao==3:Kéo========");
		System.out.println("================TEXT================");
		System.out.println("====================================");
		Scanner sc = new Scanner(System.in);
		String kq = null;
			
		while (true){
			// Bạn
			System.out.println("Bạn ra:");
			byte ban=sc.nextByte();
			if((ban<4)&&(ban>0))
				{
				//Tôi
					byte toi = (byte)(Math.random()*4);
					System.out.println("Tôi ra: "+toi);
				//Xử lý thắng thua ở đây
					if (ban==toi) kq= "hòa";
					else {
						if ((ban==1)&&(toi==2)) kq="tôi thắng";
						if ((ban==1)&&(toi==3)) kq="bạn thắng";
						if ((ban==2)&&(toi==1)) kq="bạn thắng";
						if ((ban==2)&&(toi==3)) kq="tôi thắng";
						if ((ban==3)&&(toi==1)) kq="tôi thắng";
						if ((ban==3)&&(toi==2)) kq="bạn thắng";
						}
					System.out.println("Người thắng là:" + kq);
				//Hỏi có tiếp tục
				System.out.println("Tiếp tục:?(C/K)");
				//	System.out.println("Tiếp tục:?(C/K)" +(Yes/No));
			
				String tiep = sc.nextLine();
				if (tiep.contains("K")) break;
				}
			else
	 System.out.println("Bạn nhập chưa đúng nhé ===1:Búa==2:Bao==3:Kéo===");
	}}
}
