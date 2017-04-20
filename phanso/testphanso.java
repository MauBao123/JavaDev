
public class testphanso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			phanso ps1= new phanso(2,3);
			phanso ps2= new phanso(3,2);
			
		System.out.println("Phân số 1: "+ps1.toString());
		System.out.println("Phân số 2: "+ps2.toString());
		
		//Tính tổng 2 phân số và in ra màn hình
		phanso pstong = ps1.congvoi(ps2);
		System.out.println("Tổng là: " +pstong.toString());
		
		//So sánh
		int kq = ps1.sovoi(ps2);
		if (kq==0) System.out.println("Hai phân số bằng nhau");
		if (kq==1) System.out.println("Phân số 1 lớn hơn");
		if (kq==-1) System.out.println("Phân số 1 nhỏ hơn");
	}

}
