/*	Xây dựng lớp phân số
 * 		- Tử số
 * 		- Mẫu số
 * 		+ Tối giản ()
 * 		+ Cộng với một phân số
 * 		+ Nhân/ Chia/ So sánh
 * 		+ Xuất dạng chuỗi
 * */
public class phanso {
		private int tuso;
		private int mauso;
		// Hàm tạo
		// Hàm tạo không có tham số
		
		public phanso(){
			tuso = 0;
			mauso = 1;
		}
		// Hàm tạo có tham số
		
		public phanso(int ts, int ms){
			tuso = ts;
			mauso = ms;
		}
		// Xuất phân số dạng chuỗi
		
		public String toString(){
			String tam = "";
			tam = String.valueOf(tuso)+"/"+String.valueOf(mauso);
			return tam;
		}
		
		//Tối giản
		public phanso toigian()
		{
			phanso p =new phanso();
			int ucln =UCLN(tuso, mauso);
			p.tuso = tuso/ucln;
			p.mauso = mauso/ucln;
			return p;
		}
		int UCLN(int a, int b){
			int kq=1;
			int m=Math.min(a, b);
			for(int i = m ; i>0; i--)
				if(b%i==0){
					kq=i; break;
				}
			return kq;
		}
		
		// Cộng với một phân số khác
		public phanso congvoi(phanso ps){
			phanso p= new phanso();
			
			p.tuso= ps.tuso*this.mauso + ps.mauso*this.tuso;
			
			p.mauso= ps.mauso*this.mauso;
			
			return p;
		}
			
		//So sánh với một phân số khác
		public int sovoi(phanso ps){
			int kq=0;
			// quy định: lớn hơn trả về 1, bằng trả về 0 và nhỏ hơn trả về -1
			
			double so1 = (double)this.tuso/this.mauso;
			double so2 = (double)ps.tuso/ps.mauso;
			if(so1==so2) kq=0;
			if(so1<so2) kq=-1;
			if(so1>so2) kq=1;
			return kq;
		}
}








