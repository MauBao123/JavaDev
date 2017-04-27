import java.awt.*;        // Sử dụng kho awt
import java.awt.event.*;  // Sử dụng các lớp sự kiện và giao diện
 
//Một chương trình GUI AWT kế thừa lớp container
//lớp công khai WindowEventDemo
public class WindowEventDemo extends Frame
      implements ActionListener, WindowListener {
	// Lớp này hoạt động như một Listener cho ActionEvent và WindowEvent 
    // Một lớp Java chỉ có thể mở rộng trên một lớp cha nhưng Nó có thể triển khai cho nhiều giao diện.
 
   private TextField tfCount;  // Khai báo một thành phần TextField 
   private Button btnCount;    // Khai báo một thành phần Button 
   private int count = 0;      // giá trị của Counter
 
   // Constructor để thiết lập các thành phần GUI và xử lý sự kiện
   public WindowEventDemo() {
      setLayout(new FlowLayout()); // "super" Frame sets to FlowLayout
 
      add(new Label("Counter"));   // "super" Frame adds an anonymous Label
      
      tfCount = new TextField("0", 10); // Xây dựng TextFiled
      tfCount.setEditable(false); 
      add(tfCount);                     // gán tfCount vào khung
 
      btnCount = new Button("Count");  // xây dựng Button
      add(btnCount);                   // gán btnCount vào khung
 
      btnCount.addActionListener(this);
      // btnCount (đối tượng nguồn) kích hoạt ActionEvent khi kích vào 
      // btnCount thêm đối tượng "this" này như là một người nghe ActionEvent
      
      addWindowListener(this);
      // "Siêu" Khung (nguồn đối tượng) cháy WindowEvent. 
      // "super" Frame cho biết thêm đối tượng "this" như một người nghe WindowEvent.
 
      setTitle("WindowEvent Demo"); // "super" Bộ khung tiêu đề
      setSize(350, 100);            // "super" Thiết lập kích thước khung
      setVisible(true);             // "super" Cho khung hiển thị
   }
 
   // The entry main() method
   public static void main(String[] args) {
      new WindowEventDemo();  // Cho phép cấu trúc thực hiện công việc
   }
 
   /* ActionEvent handler */
   @Override
   public void actionPerformed(ActionEvent evt) {
      ++count;
      tfCount.setText(count + "");
   }
 
   /* Trình xử lý WindowEvent */ 
   // Được gọi trở lại khi nhấn vào nút đóng cửa sổ 
   @Override
   public void windowClosing(WindowEvent evt) {
      System.exit(0);  // Kết thúc chương trình
   }
 
   // Not Used, but need to provide an empty body to compile.
   @Override public void windowOpened(WindowEvent evt) { }
   @Override public void windowClosed(WindowEvent evt) { }
   @Override public void windowIconified(WindowEvent evt) { }
   @Override public void windowDeiconified(WindowEvent evt) { }
   @Override public void windowActivated(WindowEvent evt) { }
   @Override public void windowDeactivated(WindowEvent evt) { }
}