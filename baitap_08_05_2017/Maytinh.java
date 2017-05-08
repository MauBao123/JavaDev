import java.awt.*;

import java.awt.FlowLayout;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class Maytinh extends JFrame {
	
		JTextField txta, txtb, txtkq;
		JLabel lbl,lbla, lblb, lblkq;
		JButton btncong, btntru, btnnhan,btnchia, btnxoa, btnthoat;
		
		public Maytinh(){//Viết hàm tạo giao diện
		
		setTitle("Máy tính của tôi");
		setSize(390, 250);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		lbl = new JLabel("Cộng trừ nhân chia hai số nguyên");
		lbl.setBounds(100, 10, 300, 20);
		this.add(lbl);
		
		lbla = new JLabel("Số a: ");
		lbla.setBounds(10, 40, 200, 20);
		add(lbla);
		
		lblb =new JLabel("Số b: ");
		lblb.setBounds(10, 70, 200, 20);
		add(lblb);
		
		lblkq =new JLabel("Kết quả: ");
		lblkq.setBounds(10, 100, 200, 20);
		add(lblkq);
		
		txta= new JTextField(30); 
		add(txta);
		
		txtb= new JTextField(30); 
		add(txtb);
		
		txtkq= new JTextField(30); 
		add(txtkq);
		
		//---------vị trí------------//
		txta.setBounds(110, 40, 200, 20);
		txtb.setBounds(110, 70, 200, 20);
		txtkq.setBounds(110, 100, 200, 20);
		
		//------------Nút cộng và hàm xử lý-------------//
		btncong = new JButton("Cộng");
		btncong.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				int a = Integer.parseInt(txta.getText());
				int b = Integer.parseInt(txtb.getText());
				int kq = 0; kq = a +b;
				txtkq.setText(String.valueOf(kq));;
			}
		});
		btncong.setSize(80, 30);	
		add(btncong);
		btncong.setLocation(10, 130);
		
		//------------Nút trừ và hàm xử lý-------------//
		btntru = new JButton("Trừ");
		btntru.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				int a = Integer.parseInt(txta.getText());
				int b = Integer.parseInt(txtb.getText());
				int kq = 0; kq = a - b;
				txtkq.setText(String.valueOf(kq));;
			}
		});
		btntru.setSize(80, 30);	
		add(btntru);
		btntru.setLocation(100, 130);
				
		//------------Nút nhân và hàm xử lý-------------//
		btnnhan = new JButton("Nhân");
		btnnhan.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				int a = Integer.parseInt(txta.getText());
				int b = Integer.parseInt(txtb.getText());
				int kq = 0; kq = a * b;
				txtkq.setText(String.valueOf(kq));;
			}
		});
		btnnhan.setSize(80, 30);	
		add(btnnhan);
		btnnhan.setLocation(190, 130);

		//------------Nút Chia và hàm xử lý-------------//
		btnchia = new JButton("Chia");
		btnchia.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				int a = Integer.parseInt(txta.getText());
				int b = Integer.parseInt(txtb.getText());
				float kq = 0; kq = (float)a / b;
				txtkq.setText(String.valueOf(kq));;
			}
		});
		btnchia.setSize(80, 30);	
		add(btnchia);
		btnchia.setLocation(280, 130);
		
		//------------Nút xóa và hàm xử lý-------------//
		btnxoa = new JButton("Xóa");
		btnxoa.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				txta.setText("");
				txtb.setText("");
				txtkq.setText("");
			}
		});
		btnxoa.setSize(130, 30);	
		add(btnxoa);
		btnxoa.setLocation(55, 170);
		
		//------------Nút Thoát và hàm xử lý-------------//
		btnthoat = new JButton("Thoát");
		btnthoat.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
		});
		btnthoat.setSize(130, 30);	
		add(btnthoat);
		btnthoat.setLocation(205, 170);


		setVisible(true);
	//kết thúc hàm tạo
		
		
	}
	
		//------------------------------------------------------------//
	public static void main(String[] args){
		{
			Maytinh mt = new Maytinh();
		}	
	}
}
