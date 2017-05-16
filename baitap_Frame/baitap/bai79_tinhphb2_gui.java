package mtinh;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

public class GPTB2_GUI  extends JFrame {
private static final long serialVersionUID = 1L;

public GPTB2_GUI(String title)
{
    setTitle(title);
}
// Hiển thị
public void doShow()
{
    setSize(400, 300);
    setLocationRelativeTo(null);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    addControl();
    setResizable(false);
    setVisible(true);
}

// Thiết kế giao diện
public void addControl()
{
    JPanel pnBorder=new JPanel();
    pnBorder.setLayout(new BorderLayout());
    // tiêu đề
    JPanel pnNorth=new JPanel();
    JLabel lblTitle=new JLabel("Giải phương trình bậc 2");
    pnNorth.add(lblTitle);
    pnBorder.add(pnNorth,BorderLayout.NORTH);
    lblTitle.setForeground(Color.BLUE);
    Font ft=new Font("arial", Font.BOLD, 25);
    lblTitle.setFont(ft);
    // button
    JPanel pnSouth=new JPanel();
    JButton btnGiai=new JButton("Giải");
    JButton btnXoa=new JButton("Xóa");
    JButton btnThoat=new JButton("Thoát");
    pnSouth.add(btnGiai);
    pnSouth.add(btnXoa);
    pnSouth.add(btnThoat);
    pnBorder.add(pnSouth,BorderLayout.SOUTH);
    pnSouth.setBackground(Color.LIGHT_GRAY);
    Border  southborder=BorderFactory.createLineBorder(Color.RED);
    TitledBorder southTitleBorder=new TitledBorder(southborder, "Chọn tác vụ");
    pnSouth.setBorder(southTitleBorder);
    // panel nhap
    JPanel pnCenter=new JPanel();
    pnCenter.setLayout(new BoxLayout(pnCenter, BoxLayout.Y_AXIS));
    pnBorder.add(pnCenter,BorderLayout.CENTER);
    Border  centerborder=BorderFactory.createLineBorder(Color.RED);
    TitledBorder centerTitleBorder=new TitledBorder(centerborder, "Nhập hệ số a, b, c:");
    pnCenter.setBorder(centerTitleBorder);
    // hệ số a
    JPanel pna=new JPanel();
    JLabel lbla=new JLabel("Nhập a:");
    final JTextField txta=new  JTextField(15);
    pna.add(lbla);
    pna.add(txta);
    pnCenter.add(pna);
    // hệ số b
    JPanel pnb=new JPanel();
    JLabel lblb=new JLabel("Nhập b:");
    final JTextField txtb=new  JTextField(15);
    pnb.add(lblb);
    pnb.add(txtb);
    pnCenter.add(pnb);
    // hệ số c
    JPanel pnc=new JPanel();
    JLabel lblc=new JLabel("Nhập c:");
    final JTextField txtc=new  JTextField(15);
    pnc.add(lblc);
    pnc.add(txtc);
    pnCenter.add(pnc);
    // hệ số kq
    JPanel pnkq=new JPanel();
    JLabel lblkq=new JLabel("kết quả:");
    final JTextField txtkq=new  JTextField(15);
    pnkq.add(lblkq);
    pnkq.add(txtkq);
    pnCenter.add(pnkq);
    
    lbla.setPreferredSize(lblkq.getPreferredSize());
    lblb.setPreferredSize(lblkq.getPreferredSize());
    lblc.setPreferredSize(lblkq.getPreferredSize());
    
    // sự kiện thoát
    btnThoat.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent arg0) {
            int ret=JOptionPane.showConfirmDialog(null, "Thoát khỏi chương trình ?", "Thoát", JOptionPane.YES_NO_OPTION);
            if(ret==JOptionPane.YES_OPTION)
                System.exit(0);
        }
    });
    // sự kiện xóa
    btnXoa.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent arg0) {
            txta.setText("");
            txtb.setText("");
            txtc.setText("");
            txtkq.setText("");
            txta.requestFocus();
        }
    });
    // sự kiện giải
    btnGiai.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent arg0) {
            String sa=txta.getText();
            float a=0,b=0,c=0;
            try
                {
                    a=Float.parseFloat(sa);;
                }
            catch(Exception ex)
                {
                    JOptionPane.showMessageDialog(null, "Nhập sai định dạng!");
                    txta.selectAll();
                    txta.requestFocus();
                    return;
                }
            String sb=txtb.getText();
            try
            {
                b=Float.parseFloat(sb);
            }
            catch(Exception ex)
            {
                JOptionPane.showMessageDialog(null, "Nhập sai định dạng!");
                txtb.selectAll();
                txtb.requestFocus();
                return;
             }
            String sc=txtc.getText();
            try
            {
                c=Float.parseFloat(sc);
            }
            catch(Exception ex)
            {
                JOptionPane.showMessageDialog(null, "Nhập sai định dạng!");
                txtc.selectAll();
                txtc.requestFocus();
                return;
            }
            String kq="";
            GPTB2 t=new GPTB2(a,b,c);
            kq=t.GiaiPT();
            txtkq.setText(kq);
        }
    });
    Container con=getContentPane();
    con.add(pnBorder);
}

// main method
public static void main(String[] args) {
        GPTB2_GUI ui=new GPTB2_GUI("Phương trình bậc 2");
        ui.doShow();
 }
}