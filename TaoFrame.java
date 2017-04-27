import java.awt.*;
import java.awt.event.*;

import javax.annotation.processing.Messager;
import javax.swing.JOptionPane;
import javax.xml.ws.handler.MessageContext;

public class awt extends Frame implements ActionListener
	{//kế thừa từ hàm frame //implements bắt sự kiện
	Label l=new Label("Họ tên: ");
	TextField t =new TextField(25);
	//TextArea t1=new TextArea(3,10);
	//Checkbox c1=new Checkbox("red", true);
	//Checkbox c2=new Checkbox("black", false);
	CheckboxGroup cbg1=new CheckboxGroup();
	Checkbox c3=new Checkbox("nam",cbg1, true);
	Checkbox c4=new Checkbox("nu",cbg1, false);
	Button b1 = new Button("OK");
	
	public awt(String title){
		super(title);//gọi hàm tạo của frame
		setLayout(new FlowLayout());
		this.add(l);
		this.add(t);
		//this.add(t1);
		//this.add(c1);
		//this.add(c2);
		this.add(c3);
		this.add(c4);
		this.add(b1);
		b1.addActionListener(this);//bắt sự kiên vào nút b1
	}
		//Chuong trinh xu ly bo lang nghe
	public void actionPerformed(ActionEvent e)
	{
		JOptionPane.showMessageDialog(null,"Xin chào "+t.getText() +" đã đăng nhập");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		awt f = new awt("Ung dung");
		f.setSize(300, 200);
		f.setVisible(true);
	}

}

/*
 * import java.awt.*;

public class awt extends Frame {
	Label l=new Label("Họ tên: ");
	TextField t =new TextField();
	
	public awt(String title){
		super(title);
		setLayout(new FlowLayout());
		this.add(l);
		this.add(t);
		t.setEditable(false);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		awt f = new awt("Ung dung");
		f.setSize(300, 200);
		f.setVisible(true);
	}

}
*/
