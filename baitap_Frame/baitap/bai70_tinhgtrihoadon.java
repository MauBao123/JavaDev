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


public class gtrihoadon extends JFrame{
	JTextField txta, txtb, txtkq;
	JLabel lbl,lbla, lblb, lblkq;
	JButton btnkq;
	
	public gtrihoadon()
	{
		setTitle("Tính giá trị hóa đơn");
		setSize(400, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setLayout(null);
		lbl = new JLabel("Tính giá trị hóa đơn");
		lbl.setBounds(130, 10, 300, 20);
		this.add(lbl);
		
		lbla = new JLabel("Số lượng: ");
		lbla.setBounds(10, 40, 200, 20);
		add(lbla);
		
		lblb =new JLabel("Đơn giá: ");
		lblb.setBounds(10, 70, 200, 20);
		add(lblb);
		lblb =new JLabel("VND");
		lblb.setBounds(320, 70, 200, 20);
		add(lblb);
		
		lblkq =new JLabel("Thành tiền: ");
		lblkq.setBounds(10, 100, 200, 20);
		add(lblkq);
		lblb =new JLabel("VND");
		lblb.setBounds(320, 100, 200, 20);
		add(lblb);
		
		txta= new JTextField(30); 
		add(txta);
		
		txtb= new JTextField(30); 
		add(txtb);
		
		txtkq= new JTextField(30); 
		txtkq.setEditable(false);// khong cho phep nhap du lieu
		add(txtkq);
		
		//vị trí
		txta.setBounds(110, 40, 200, 20);
		txtb.setBounds(110, 70, 200, 20);
		txtkq.setBounds(110, 100, 200, 20);
		
		btnkq = new JButton("Tính tiền");
		btnkq.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				float a = Integer.parseInt(txta.getText());
				float b = Integer.parseInt(txtb.getText());
				long kq = 0; kq = (long) (a*b);
				txtkq.setText(String.valueOf(kq));;
			}
		});
		btnkq.setSize(150, 30);	
		add(btnkq);
		btnkq.setLocation(130, 130);
	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		gtrihoadon gt = new gtrihoadon();
	}

}
