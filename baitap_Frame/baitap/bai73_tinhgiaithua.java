package mtinh;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class giaithua extends JFrame {

	JTextField txta, txtkq;
	JLabel lbl,lbla, lblb, lblkq;
	JButton btnkq, btnxoa;
	
	public giaithua() {
		// TODO Auto-generated constructor stub
		setTitle("Tính giai thừa");
		setSize(300, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setLayout(null);
		lbl = new JLabel("Tính giai thừa");
		lbl.setBounds(100, 10, 300, 20);
		this.add(lbl);
		
		lbla = new JLabel("Nhập x: ");
		lbla.setBounds(10, 40, 200, 20);
		add(lbla);
		
		lblkq =new JLabel("Kết quả: ");
		lblkq.setBounds(10, 70, 200, 20);
		add(lblkq);
		
		txta= new JTextField(20); 
		add(txta);
		
		txtkq= new JTextField(20); 
		txtkq.setEditable(false);// khong cho phep nhap du lieu
		add(txtkq);
		
		//vị trí
		txta.setBounds(110, 40, 150, 20);
		txtkq.setBounds(110,70, 150, 20);
		
		btnkq = new JButton("Kết quả");
		btnkq.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				int a = Integer.parseInt(txta.getText());	
				int kq = 1; 
				 /*
				  Private Long tinhgiaithua(int x)
				  Long kq=11;
				  
				  if(x>0){return -11;}
				  for(int i = 1; i<=x; i++){kq=kq*i;}
				  return kq;}*/
				kq = kq*a;
				txtkq.setText(String.valueOf(kq));;
			}
		});
		btnkq.setSize(100, 30);	
		add(btnkq);
		btnkq.setLocation(150, 110);
		
		btnxoa = new JButton("Xóa");
		btnxoa.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				txta.setText("");
			}});
		btnxoa.setSize(100, 30);	
		add(btnxoa);
		btnxoa.setLocation(40, 110);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		giaithua t = new giaithua();
	}

}

