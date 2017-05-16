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

		
public class CVDThtron extends JFrame {
	final float PI = (float) 3.141592654;
	JTextField txta, txtcv, txtdt;
	JLabel lbl,lbla, lblcv, lbldt;
	JButton btnkq;
	
	public CVDThtron()
	{
		setTitle("Tính chu vi và diện tích hình tròn");
		setSize(300, 220);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setLayout(null);
		lbl = new JLabel("Tính chu vi và diện tích hình tròn");
		lbl.setBounds(50, 10, 300, 20);//(x, y, width, height)
		this.add(lbl);
		
		lbla = new JLabel("Bán Kính: ");
		lbla.setBounds(10,40,200,20);
		this.add(lbla);
		
		lblcv =new JLabel("Chu vi: ");
		lblcv.setBounds(10, 70, 200, 20);
		add(lblcv);
		
		lbldt =new JLabel("Diện tích: ");
		lbldt.setBounds(10, 100, 200, 20);
		add(lbldt);
		
		txta= new JTextField(30); 
		add(txta);
		
		txtcv= new JTextField(30); 
		txtcv.setEditable(false);// khong cho phep nhap du lieu
		add(txtcv);
		
		txtdt= new JTextField(30); 
		txtdt.setEditable(false);// khong cho phep nhap du lieu
		add(txtdt);
		
		//vị trí
		txta.setBounds(110, 40, 100, 20);
		txtcv.setBounds(110, 70, 100, 20);
		txtdt.setBounds(110, 100, 100, 20);
		
		btnkq = new JButton("Tính");
		btnkq.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				float a = Integer.parseInt(txta.getText());
				
				float cv = 0; cv = 2*a*PI; //java cung cấp hằng số 
				float dt = 0; dt = a*a*PI; //Math.PI
				txtcv.setText(String.valueOf(cv));;
				txtdt.setText(String.valueOf(dt));;
			}
		});
		btnkq.setSize(100, 30);	
		add(btnkq);
		btnkq.setLocation(90, 130);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			CVDThtron cv = new CVDThtron();
	}

}
