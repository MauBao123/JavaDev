/*Thiết kế giao diện
 * Nhập vào một số nguyên N
 * Tính tổng S=1+2+3+...+N
 * Ước số của N là bao nhiêu
 * Xem số N nhập vào có phải số nguyên tố hay không
 * Phân tích số N nhập vào
 * */

import java.awt.*;

import java.awt.FlowLayout;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Ttong_uocso_snt_pt extends JFrame {

	JTextField txta, txtkq;
	JLabel lbl,lbla, lblkq;
	JButton btnth, btntt, btnthoat;
	JRadioButton tong, uocso, sont, ptich;
	
	public Ttong_uocso_snt_pt(){
		
		setTitle("Bài tập 3");
		setSize(450, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		lbl = new JLabel("Tính Tổng - Ước số - Số nguyên Tố - Phân tích");
		lbl.setBounds(90, 20, 300, 20);
		this.add(lbl);
		setVisible(true);
		
		lbla = new JLabel("Nhập N: ");
		lbla.setBounds(10, 55, 200, 20);
		add(lbla);
		
		lblkq =new JLabel("Kết quả: ");
		lblkq.setBounds(10, 90, 200, 20);
		add(lblkq);
		
		txta= new JTextField(20); 
		add(txta);
		
		txtkq= new JTextField(20); 
		add(txtkq);
		
		//---------vị trí------------//
		txta.setBounds(100, 55, 100, 20);
		txtkq.setBounds(100, 90, 100, 20);
		
//------------------------------------------------
		tong = new JRadioButton("Tổng S=1+2+...+n");
		tong.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				
			}
		});
		tong.setSize(150, 30);	
		add(tong);
		tong.setLocation(270, 45);
//-----------------------------------------------------
		
		uocso = new JRadioButton("Ước số của n");
		uocso.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				
			}
		});
		uocso.setSize(150, 30);	
		add(uocso);
		uocso.setLocation(270, 75);
		
//-----------------------------------------------------

		sont = new JRadioButton("Số nguyên tố");
		sont.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				
			}
		});
		sont.setSize(150, 30);	
		add(sont);
		sont.setLocation(270, 105);
		
//-----------------------------------------------------

		ptich = new JRadioButton("Phân tích");
		ptich.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				
			}
		});
		ptich.setSize(150, 30);	
		add(ptich);
		ptich.setLocation(270, 135);

		
//------------Nút thực hiện và hàm xử lý-------------//
		btnth = new JButton("Thực hiện");
		btnth.addActionListener(new ActionListener() {
	
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				int a = Integer.parseInt(txta.getText());
				int kq = 0; kq = a;
				txtkq.setText(String.valueOf(kq));;
			}
		});
		btnth.setSize(100, 30);	
		add(btnth);
		btnth.setLocation(30, 180);
		
		//------------Nút tiếp tục và hàm xử lý-------------//
		btntt = new JButton("Tiếp tục");
		btntt.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				int a = Integer.parseInt(txta.getText());
				int kq = 0; kq = a;
				txtkq.setText(String.valueOf(kq));;
			}
		});
		btntt.setSize(100, 30);	
		add(btntt);
		btntt.setLocation(160, 180);
		
		//------------Nút Thoát và hàm xử lý-------------//
		btnthoat = new JButton("Thoát");
		btnthoat.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
		});
		btnthoat.setSize(100, 30);	
		add(btnthoat);
		btnthoat.setLocation(285, 180);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ttong_uocso_snt_pt t = new Ttong_uocso_snt_pt();
	}

}
