import java.awt.*;
import java.awt.event.*;
 
public class MouseEventDemo extends Frame implements MouseListener {
   private TextField tfMouseX; // Hiển thị chuột click x,y
   private TextField tfMouseY; 
 
   // Constructor - Thiết lập các thành phần UI và xử lý sự kiện
   public MouseEventDemo() {
      setLayout(new FlowLayout()); // "super" Thiết lập vị trí FlowLayout
 
      // Label (anonymous)
      add(new Label("X-Click: ")); // "super" thêm thành phần label vào khung
 
      // TextField
      tfMouseX = new TextField(10); // 10 cột
      tfMouseX.setEditable(false);  // read-only
      add(tfMouseX);                // "super" thêm thành phần TextFiled vào khung
 
      // Label (anonymous)
      add(new Label("Y-Click: ")); // "super" thêm thành phần label vào khung
 
      // TextField
      tfMouseY = new TextField(10);
      tfMouseY.setEditable(false);  // read-only
      add(tfMouseY);                // "super" thêm thành phần TextFiled vào khung
 
      addMouseListener(this);
          // triệu gọi MouseEvent.
 
      setTitle("MouseEvent Demo"); //Tiêu đề
      setSize(350, 100);           // Kích thước
      setVisible(true);            // Hiển thị khung
   }
 
   public static void main(String[] args) {
      new MouseEventDemo();  // cho phép xây dựng công việc
   }
 
   /*Xư lý MouseEvent */
   //  Được gọi lại khi nhấp chuột
   @Override
   public void mouseClicked(MouseEvent evt) {
      tfMouseX.setText(evt.getX() + "");
      tfMouseY.setText(evt.getY() + "");
   }
 
   // Not used - need to provide an empty body to compile.
   @Override public void mousePressed(MouseEvent evt) { }
   @Override public void mouseReleased(MouseEvent evt) { }
   @Override public void mouseEntered(MouseEvent evt) { }
   @Override public void mouseExited(MouseEvent evt) { }
}