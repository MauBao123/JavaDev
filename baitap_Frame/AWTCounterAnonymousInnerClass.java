import java.awt.*;
import java.awt.event.*;
 
// Một chương trình GUI AWT kế thừa từ java.awt.Frame
public class AWTCounterAnonymousInnerClass extends Frame {
	   // Lớp này KHÔNG phải là một ActionListener, 
	//vì thế nó không thực hiện giao diện ActionListener
	 
	   // Thao tác xử lý sự kiện () actionPerformed ()
	//cần truy cập vào các biến cá nhân variables
   private TextField tfCount;
   private Button btnCount;
   private int count = 0;
 
   // Constructor để thiết lập các thành phần GUI và xử lý sự kiện
   public AWTCounterAnonymousInnerClass () {
      setLayout(new FlowLayout());  // khung FlowLayout
      add(new Label("Counter"));    // 
      tfCount = new TextField("0", 10);
      tfCount.setEditable(false);   // 
      add(tfCount);                 // 
 
      btnCount = new Button("Count");
      add(btnCount);                // thêm btnCount
 
      // Construct an anonymous instance of an anonymous class.
      // btnCount adds this instance as a ActionListener.
      btnCount.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent evt) {
            ++count;
            tfCount.setText(count + "");
         }
      });
 
      setTitle("Bộ đếm - AWT Counter");
      setSize(250, 100);
      setVisible(true);
   }
 
   // The entry main method
   public static void main(String[] args) {
      new AWTCounterAnonymousInnerClass(); // Let the constructor do the job
   }
}