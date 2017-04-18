import java.util.Scanner;

public class SLNhat {

	public static void main(String[] args) {
	
/*		
//==================SO SÁNH SỐ LỚN NHẤT GIŨA 2 SỐ=================
		
		// TODO Auto-generated method stub
		System.out.print("Số thứ nhất:");
		Scanner scanner = new Scanner(System.in);
		int sothunhat = scanner.nextInt();
		
		System.out.print("Số thứ hai:");
		int sothuhai = scanner.nextInt();
	
		int max = 0;
		if(sothunhat==sothuhai)
			System.out.println("Hai số bạn vừa nhập bằng nhau");
		else
			{
				if(sothunhat>sothuhai)
				max=sothunhat;
			else
				max=sothuhai;
			
			System.out.println("Số lớn nhất giữa " +sothunhat + " và số " +sothuhai + " là: " +max);
			}	
*/
		
/*//==================SO SÁNH SỐ LỚN NHẤT GIỮA 3 SỐ=================
		
			// TODO Auto-generated method stub
			System.out.print("Số thứ nhất:");
			Scanner scanner = new Scanner(System.in);
			int sothunhat = scanner.nextInt();
				
			System.out.print("Số thứ hai:");
			int sothuhai = scanner.nextInt();
				
			System.out.print("Số thứ ba:");
			int sothuba = scanner.nextInt();
			
			int max = 0;
			
			if(sothunhat>sothuhai && sothunhat>sothuba)
					max=sothunhat;
			else if(sothuhai>sothunhat && sothuhai>sothuba)
					max=sothuhai;
			else max=sothuba;
	
		System.out.println("Số lớn nhất là: " +max);	

*/
//==================SO SÁNH SỐ LỚN NHẤT GIỮA 3 SỐ=================
		
		// TODO Auto-generated method stub
		System.out.print("Số thứ nhất:");
		Scanner scanner = new Scanner(System.in);
		int sothunhat = scanner.nextInt();
			
		System.out.print("Số thứ hai:");
		int sothuhai = scanner.nextInt();
			
		System.out.print("Số thứ ba:");
		int sothuba = scanner.nextInt();
		
		int max = 0;
		
		if(timsolonnhat(sothunhat,sothuhai)>sothuba)
			max=timsolonnhat(sothunhat,sothuhai);
		else
			max=sothuba;

	System.out.println("Số lớn nhất là: " +max);	
	}
	
		public static int timsolonnhat(int sothunhat, int sothuhai){
			int max = 0;
			if(sothunhat>sothuhai)
				max=sothunhat;
			else
				max=sothuhai;	
			return max;
		}
	
}
