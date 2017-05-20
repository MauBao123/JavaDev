package chonCTNC;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class chonCTNC extends JFrame {

	private JPanel contentPane;
	private JTextField txta;
	private JTextField txtb;
	private JTextField txtKQ;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					chonCTNC frame = new chonCTNC();
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
	public chonCTNC() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\User\\Desktop\\y-nghia-hoa-lan-ho-diep-7.jpg"));
		setTitle("T\u00CDNH CH\u1ECCN - M\u1EF8 LINH");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 440, 373);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(173, 255, 47));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("");
		label.setBounds(34, 49, 46, 14);
		contentPane.add(label);
		
		JLabel lblSA = new JLabel("S\u1ED0 a :");
		lblSA.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblSA.setBounds(75, 33, 46, 14);
		contentPane.add(lblSA);
		
		JLabel lblSB = new JLabel("S\u1ED0 b :");
		lblSB.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblSB.setBounds(75, 74, 46, 14);
		contentPane.add(lblSB);
		
		txta = new JTextField();
		txta.setBounds(167, 32, 152, 20);
		contentPane.add(txta);
		txta.setColumns(10);
		
		txtb = new JTextField();
		txtb.setColumns(10);
		txtb.setBounds(167, 73, 152, 20);
		contentPane.add(txtb);
		
		JLabel lblNewLabel = new JLabel("CH\u1ECCN ");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setBounds(75, 113, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblKtQu = new JLabel("K\u1EBET QU\u1EA2 :");
		lblKtQu.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		lblKtQu.setBounds(52, 285, 87, 14);
		contentPane.add(lblKtQu);
		
		txtKQ = new JTextField();
		txtKQ.setEditable(false);
		txtKQ.setBounds(167, 284, 152, 20);
		contentPane.add(txtKQ);
		txtKQ.setColumns(10);
		
		JRadioButton radcong = new JRadioButton("C\u1ED8NG");
		radcong.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		radcong.setBounds(148, 125, 109, 23);
		contentPane.add(radcong);
		
		
		JRadioButton radtru = new JRadioButton("TR\u1EEA");
		radtru.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		radtru.setBounds(148, 163, 109, 23);
		contentPane.add(radtru);
		
		JRadioButton radnhan = new JRadioButton("NH\u00C2N");
		radnhan.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		radnhan.setBounds(148, 206, 109, 23);
		contentPane.add(radnhan);
		
		JRadioButton radchia = new JRadioButton("CHIA");
		radchia.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		radchia.setBounds(148, 242, 109, 23);
		contentPane.add(radchia);
		
		JButton btnNewButton = new JButton("TH\u1EF0C HI\u1EC6N");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int a=Integer.parseInt(txta.getText());
				int b=Integer.parseInt(txtb.getText());
				{
					if (radcong.isSelected())
					{
						int c=0;
						c=a+b;
						txtKQ.setText(c+"");
					}
					if (radtru.isSelected())
					{
						int d=0;
						d=a-b;
						txtKQ.setText(d+"");
					}
					if (radnhan.isSelected())
					{
						int e=0;
						e=a*b;
						txtKQ.setText(e+"");
					}
					if (radchia.isSelected())
					{
						float f=0;
						f=(float) a/b;
						txtKQ.setText(f+"");
					}
				}
				
			}
		});
		btnNewButton.setForeground(new Color(255, 0, 255));
		btnNewButton.setFont(new Font("Cambria", Font.BOLD | Font.ITALIC, 12));
		btnNewButton.setBounds(310, 250, 104, 23);
		contentPane.add(btnNewButton);
	}
}
