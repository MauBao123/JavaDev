import java.awt.*;
import java.awt.event.*;
 
// Chương trình GUI AWT kế thừa từ các thùng chứa hàng đầu java.awt.Frame
public class MouseMotionDemo extends Frame
      implements MouseListener, MouseMotionListener {
	// Lớp này hoạt động như MouseListener và MouseMotionListener
 
   // Để hiển thị (x, y) của con chuột nhấp chuột
   private TextField tfMouseClickX;
   private TextField tfMouseClickY;
   // Để hiển thị (x, y) vị trí con trỏ chuột hiện tại
   private TextField tfMousePositionX;
   private TextField tfMousePositionY;
 
   // Constructor để thiết lập các thành phần GUI và xử lý sự kiện
   public MouseMotionDemo() {
      setLayout(new FlowLayout()); // Bộ khung FlowLayout
 
      add(new Label("X-Click: "));
      tfMouseClickX = new TextField(10);
      tfMouseClickX.setEditable(false);
      add(tfMouseClickX);
      add(new Label("Y-Click: "));
      tfMouseClickY = new TextField(10);
      tfMouseClickY.setEditable(false);
      add(tfMouseClickY);
 
      add(new Label("X-Position: "));
      tfMousePositionX = new TextField(10);
      tfMousePositionX.setEditable(false);
      add(tfMousePositionX);
      add(new Label("Y-Position: "));
      tfMousePositionY = new TextField(10);
      tfMousePositionY.setEditable(false);
      add(tfMousePositionY);
 
      addMouseListener(this);
      addMouseMotionListener(this);
 
      setTitle("MouseMotion Demo"); // Khung tiêu đề
      setSize(400, 120);            // Kích thước
      setVisible(true);             // Hiển thị khung
   }
 
   // Phương thức main() method
   public static void main(String[] args) {
      new MouseMotionDemo();  // cho phép thực hiện cviec
   }
 
   /** Xử lý MouseListener */
   // Được gọi trở lại khi nhấp chuột
   @Override
   public void mouseClicked(MouseEvent evt) {
      tfMouseClickX.setText(evt.getX() + "");
      tfMouseClickY.setText(evt.getY() + "");
   }
 
   // Not Used, but need to provide an empty body for compilation
   @Override public void mousePressed(MouseEvent evt) { }
   @Override public void mouseReleased(MouseEvent evt) { }
   @Override public void mouseEntered(MouseEvent evt) { }
   @Override public void mouseExited(MouseEvent evt) { }
 
   /** Xử lý  MouseMotionEvent */
   // Called back when the mouse-pointer has been moved
   @Override
   public void mouseMoved(MouseEvent evt) {
      tfMousePositionX.setText(evt.getX() + "");
      tfMousePositionY.setText(evt.getY() + "");
   }
 
   // Not Used, but need to provide an empty body for compilation
   @Override public void mouseDragged(MouseEvent evt) { }
}