package mtinh;

import java.awt.FlowLayout;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import org.omg.CORBA.PRIVATE_MEMBER;


public class tiendien extends JFrame {
	JTextField txta, txtb, txttsd, txttt;
	JLabel lbl, lbla, lblb, lbltsd, lbltt;
	JButton btnkq, btnxoa;
	
	public tiendien() {
		// TODO Auto-generated constructor stub
		setTitle("Tính tiền điện");
		setSize(400, 250);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setLayout(null);
		lbl = new JLabel("Tính tiền điện theo chỉ số đồng hồ");
		lbl.setBounds(100, 10, 300, 20);
		this.add(lbl);
		
		lbla = new JLabel("Chỉ số cũ: ");
		lbla.setBounds(10, 40, 200, 20);
		add(lbla);
		
		lblb =new JLabel("Chỉ số mới: ");
		lblb.setBounds(10, 70, 200, 20);
		add(lblb);
		
		lbltsd =new JLabel("Tổng số điện: ");
		lbltsd.setBounds(10, 100, 200, 20);
		add(lbltsd);
		
		lbltt =new JLabel("Thành tiền: ");
		lbltt.setBounds(10, 130, 200, 20);
		add(lbltt);
		
		lbltt =new JLabel("VND");
		lbltt.setBounds(330, 130, 200, 20);
		add(lbltt);
		
		txta= new JTextField(30); 
		add(txta);
		
		txtb= new JTextField(30); 
		add(txtb);
		
		txttsd= new JTextField(30); 
		txttsd.setEditable(false);// khong cho phep nhap du lieu
		add(txttsd);
		
		txttt= new JTextField(30); 
		txttt.setEditable(false);// khong cho phep nhap du lieu
		add(txttt);
		
		//vị trí
		txta.setBounds(110, 40, 200, 20);
		txtb.setBounds(110, 70, 200, 20);
		txttsd.setBounds(110, 100, 200, 20);
		txttt.setBounds(110, 130, 200, 20);
		
		
		
		btnkq = new JButton("Tính");
		btnkq.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				int a = Integer.parseInt(txta.getText());
				int b = Integer.parseInt(txtb.getText());
				int kq = 0; kq = b-a;
				txttsd.setText(String.valueOf(kq));;
				float tien = 0,tt=0;
				tt=kq;
				/*
				{if(tt>300)
				{tien+= (tt - 300)*4000;
					tt = 300;
				}
				if(tt>200)
				{tien+= (tt - 200)*2500;
					tt = 200;
				}
				if(tt>100)
				{tien+= (tt - 100)*2000;
					tt = 100;
				}
				if(tt>500)
				{tien+= (tt - 50)*1000;
					tt = 50;
				}
				tien+=tt*500;
				
			}*/txttt.setText(String.valueOf(tt));;
				}
			
		});
		btnkq.setSize(150, 30);	
		add(btnkq);
		btnkq.setLocation(180, 170);
		
		btnxoa = new JButton("Xóa");
		btnxoa.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				txta.setText("");
				txtb.setText("");
			}});
		btnxoa.setSize(150, 30);	
		add(btnxoa);
		btnxoa.setLocation(40, 170);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		tiendien t = new tiendien();
	}

}
