package frametinhtong;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import java.awt.Window.Type;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FRAMETINH extends JFrame {

	private JPanel contentPane;
	private JTextField txtN;
	private JTextField txtTN;
	private JTextField txtTL;
	private JTextField txtSNT;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FRAMETINH frame = new FRAMETINH();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public FRAMETINH() {
		setType(Type.POPUP);
		setTitle("NGUY\u1EC4N TH\u1ECA M\u1EF8 LINH");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 503, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(154, 205, 50));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTngTn = new JLabel("T\u1ED4NG T\u1EEA 1->N :");
		lblTngTn.setForeground(Color.BLUE);
		lblTngTn.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblTngTn.setBounds(78, 85, 115, 14);
		contentPane.add(lblTngTn);
		
		JLabel lblN = new JLabel("NH\u1EACP N :");
		lblN.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblN.setForeground(Color.BLUE);
		lblN.setBounds(128, 39, 65, 14);
		contentPane.add(lblN);
		
		txtN = new JTextField();
		txtN.setBounds(234, 38, 132, 20);
		contentPane.add(txtN);
		txtN.setColumns(10);
		
		txtTN = new JTextField();
		txtTN.setEditable(false);
		txtTN.setColumns(10);
		txtTN.setBounds(234, 84, 132, 20);
		contentPane.add(txtTN);
		
		txtTL = new JTextField();
		txtTL.setEditable(false);
		txtTL.setColumns(10);
		txtTL.setBounds(234, 138, 132, 20);
		contentPane.add(txtTL);
		
		txtSNT = new JTextField();
		txtSNT.setEditable(false);
		txtSNT.setColumns(10);
		txtSNT.setBounds(234, 197, 132, 20);
		contentPane.add(txtSNT);
		
		JLabel lblTL = new JLabel("T\u1ED4NG L\u1EBA T\u1EEA 1 ->N :");
		lblTL.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblTL.setForeground(Color.BLUE);
		lblTL.setBounds(49, 139, 152, 14);
		contentPane.add(lblTL);
		
		JLabel lblSNguynT = new JLabel("T\u1ED4NG S\u1ED0 NGUY\u00CAN T\u1ED0 :");
		lblSNguynT.setForeground(Color.BLUE);
		lblSNguynT.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblSNguynT.setBounds(30, 198, 171, 14);
		contentPane.add(lblSNguynT);
		
		JButton btnOk = new JButton("OK");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				int n=Integer.parseInt(txtN.getText());
				int i;
				{
					int c = 0;
					for (i=0;i<n;i++)
					{ 
						c = c + i;	
					}
					txtTN.setText(c+ "");	
				}
				{
					int d = 0;
					for (i=0;i<=n;i++)
						if (i%2!=0)
						{
							d = d +i;
						}
					txtTL.setText(d+ "");
				}
				{
				int tong=0;
				for (i=0 ;i<=n;i++)
					if (songuyento (i)==true)
					tong = tong + i;
				txtSNT.setText(tong+ "");
				}
				}
		});
		
		btnOk.setBackground(new Color(255, 69, 0));
		btnOk.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		btnOk.setForeground(new Color(0, 0, 0));
		btnOk.setBounds(388, 107, 89, 23);
		contentPane.add(btnOk);
	}
	public boolean songuyento (int a)
	{if (a==1) return false;
		if (a==2) return true;
		else 
			for (int i=2;i<=a-1;i++)
				if (a%i==0) return false;
		return true;
	}
}
