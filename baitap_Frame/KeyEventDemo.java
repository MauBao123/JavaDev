import java.awt.*;
import java.awt.event.*;
 
//Chương trình GUI AWT kế thừa từ các thùng chứa hàng đầu java.awt.Frame
//
public class KeyEventDemo extends Frame implements KeyListener {
      // cách hoạt động giống KeyEvent Listener
 
   private TextField tfInput;  // Single-line TextField nhận phím tfInput key
   private TextArea taDisplay; // Multi-line TextArea hiển thị kết quả
 
   // Constructor để thiết lập các thành phần GUI và xử lý sự kiện

   public KeyEventDemo() {
      setLayout(new FlowLayout()); // "super"khung FlowLayout
 
      add(new Label("Nhập văn bản: "));
      tfInput = new TextField(10);
      add(tfInput);
      taDisplay = new TextArea(5, 40); // 5 hàng, 40 cột
      add(taDisplay);
 
      tfInput.addKeyListener(this);
 
      setTitle("KeyEvent Demo"); // tiêu đề
      setSize(400, 200);         // khích thước
      setVisible(true);          // hiển thị khung
   }
 
   // phương thức main() method
   public static void main(String[] args) {
      new KeyEventDemo();  
   }
 
   /** Xử lý KeyEvent */
   // Được gọi lại khi một phím đã được gõ(nhấn thả)
   @Override
   public void keyTyped(KeyEvent evt) {
      taDisplay.append("Bạn vừa gõ: " + evt.getKeyChar() + "\n");
   }
 
   // Not Used, but need to provide an empty body for compilation
   @Override public void keyPressed(KeyEvent evt) { }
   @Override public void keyReleased(KeyEvent evt) { }
}