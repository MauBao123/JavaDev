import java.awt.*;
import java.awt.event.*;
 
//Một chương trình GUI AWT kế thừa từ java.awt.Frame
public class AWTCounter3Buttons extends Frame {
   private TextField tfCount;
   private Button btnCountUp, btnCountDown, btnReset;
   private int count = 0;
 
   // Constructor để thiết lập các thành phần GUI và xử lý sự kiện
   public AWTCounter3Buttons () {
      setLayout(new FlowLayout());
      add(new Label("Counter"));   
      tfCount = new TextField("0", 10);
      tfCount.setEditable(false);  
      add(tfCount);                
 
      btnCountUp = new Button("Count Up");
      add(btnCountUp);
      
      btnCountUp.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent evt) {
            ++count;
            tfCount.setText(count + "");
         }
      });
 
      btnCountDown = new Button("Count Down");
      add(btnCountDown);
      btnCountDown.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent evt) {
            count--;
            tfCount.setText(count + "");
         }
      });
 
      btnReset = new Button("Reset");
      add(btnReset);
      btnReset.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent evt) {
            count = 0;
            tfCount.setText("0");
         }
      });
 
      setTitle("Bộ đếm - AWT Counter");
      setSize(400, 100);
      setVisible(true);
   }
 
   // The entry main method
   public static void main(String[] args) {
      new AWTCounter3Buttons();  // Let the constructor do the job
   }
}