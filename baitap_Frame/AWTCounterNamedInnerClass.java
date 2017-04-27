import java.awt.*;
import java.awt.event.*;
 
//Chương trình GUI AWT kế thừa từ các thùng chứa hàng đầu java.awt.Frame
public class AWTCounterNamedInnerClass extends Frame {
	// Lớp này KHÔNG phải là một ActionListener, 
	//vì thế nó không thực hiện giao diện ActionListener
 
   // Thao tác xử lý sự kiện () 
	//cần phải truy cập vào các biến "cá nhân"
   private TextField tfCount;
   private Button btnCount;
   private int count = 0;
 
   // Constructor để thiết lập các thành phần GUI và xử lý sự kiện
   public AWTCounterNamedInnerClass () {
      setLayout(new FlowLayout());  // khung FlowLayout
      add(new Label("Counter"));    //
      tfCount = new TextField("0", 10);
      tfCount.setEditable(false);   // 
      add(tfCount);                 // 
 
      btnCount = new Button("Count");
      add(btnCount);                // thêm btnCount vào khung
 
      // Construct an anonymous instance of BtnCountListener (a named inner class).
      // btnCount adds this instance as a ActionListener.
      btnCount.addActionListener(new BtnCountListener());
 
      setTitle("Bộ đếm - AWT Counter");
      setSize(250, 100);
      setVisible(true);
   }
 
   // The entry main method
   public static void main(String[] args) {
      new AWTCounterNamedInnerClass(); // Let the constructor do the job
   }
 
   /**
    * BtnCountListener is a "named inner class" used as ActionListener.
    * This inner class can access private variables of the outer class.
    */
   private class BtnCountListener implements ActionListener {
      @Override
      public void actionPerformed(ActionEvent evt) {
         ++count;
         tfCount.setText(count + "");
      }
   }
}