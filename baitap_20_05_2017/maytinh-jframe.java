package frametinhtong;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class frametinhtong1 extends JFrame {

	private JPanel contentPane;
	private JTextField txtA;
	private JTextField txtB;
	private JTextField txtKQ;
	protected Object getText;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frametinhtong1 frame = new frametinhtong1();
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
	public frametinhtong1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.PINK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[][][][grow][][][][]", "[][][][][][][][][]"));
		
		JLabel lblMyTnhCa = new JLabel("M\u00C1Y T\u00CDNH C\u1EE6A LINH !!!");
		lblMyTnhCa.setForeground(Color.BLACK);
		lblMyTnhCa.setFont(new Font("Tahoma", Font.BOLD, 13));
		contentPane.add(lblMyTnhCa, "cell 3 0");
		
		JLabel lblA = new JLabel("S\u1ED0 a:");
		lblA.setFont(new Font("Tahoma", Font.BOLD, 13));
		contentPane.add(lblA, "cell 1 2");
		
		txtA = new JTextField();
		contentPane.add(txtA, "cell 3 2 2 1,growx");
		txtA.setColumns(10);
		
		JLabel lblB = new JLabel("S\u1ED0 b :");
		lblB.setFont(new Font("Tahoma", Font.BOLD, 13));
		contentPane.add(lblB, "cell 1 4");
		
		txtB = new JTextField();
		txtB.setColumns(10);
		contentPane.add(txtB, "cell 3 4 2 1,growx");
		
		JButton btnNewButton = new JButton("C\u1ED8NG");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int a = Integer.parseInt(txtA.getText());
				int b = Integer.parseInt(txtB.getText());
				int c = a+b;
				txtKQ.setText(c+"");
					
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		contentPane.add(btnNewButton, "cell 1 6");
		
		JButton btnTr = new JButton("TR\u1EEA");
		btnTr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int a = Integer.parseInt(txtA.getText());
				int b = Integer.parseInt(txtB.getText());
				int c = a-b;
				txtKQ.setText(c+"");
			}
		});
		btnTr.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		contentPane.add(btnTr, "cell 3 6");
		
		JButton btnNhn = new JButton("NH\u00C2N");
		btnNhn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a = Integer.parseInt(txtA.getText());
				int b = Integer.parseInt(txtB.getText());
				int c = a*b;
				txtKQ.setText(c+"");
			}
		});
		btnNhn.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		contentPane.add(btnNhn, "cell 4 6 2 1");
		
		JButton btnChia = new JButton("CHIA");
		btnChia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a = Integer.parseInt(txtA.getText());
				int b = Integer.parseInt(txtB.getText());
				float c = (float) a/b ;
				txtKQ.setText(c+"");
			}
		});
		btnChia.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		contentPane.add(btnChia, "cell 7 6");
		
		JLabel lblKQ = new JLabel("K\u1EBET QU\u1EA2");
		lblKQ.setForeground(Color.BLUE);
		lblKQ.setFont(new Font("Tahoma", Font.BOLD, 13));
		contentPane.add(lblKQ, "cell 1 8");
		
		txtKQ = new JTextField();
		txtKQ.setEnabled(false);
		txtKQ.setColumns(10);
		contentPane.add(txtKQ, "cell 3 8 2 1,growx");
	}

}
