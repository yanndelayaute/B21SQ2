package vue;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class EntreeJeu extends JFrame {

	private JPanel contentPane;
	private JTextField txtIp;


	/**
	 * Create the frame.
	 */
	public EntreeJeu() {
		setTitle("Urban Marginal");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 308, 158);
		contentPane = new JPanel();
		this.getContentPane().setPreferredSize(new Dimension(308, 152));
		this.pack();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Start a server :");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setBounds(10, 11, 106, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Connect an existing server :");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1.setBounds(10, 36, 181, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("IP server :");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2.setBounds(10, 61, 73, 14);
		contentPane.add(lblNewLabel_2);
		
		txtIp = new JTextField();
		txtIp.setBounds(81, 61, 110, 20);
		contentPane.add(txtIp);
		txtIp.setColumns(10);
		txtIp.setText("127.0.0.1");
		
		JButton btnConnect = new JButton("Connect");
		btnConnect.addActionListener(new ActionListener() {
			private ChoixJoueur frmChoix;

			public void actionPerformed(ActionEvent e) {
				this.frmChoix = new ChoixJoueur();
				this.frmChoix.setVisible(true);
			}
		});
		btnConnect.setBounds(201, 58, 89, 23);
		contentPane.add(btnConnect);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setBounds(201, 92, 89, 23);
		contentPane.add(btnExit);
		
		JButton btnStart = new JButton("Start");
		btnStart.addActionListener(new ActionListener() {
			private Arene frmArene;

			public void actionPerformed(ActionEvent e) {
				this.frmArene = new Arene() ;
				this.frmArene.setVisible(true);
			}
		});
		btnStart.setBounds(201, 8, 89, 23);
		contentPane.add(btnStart);
		
		txtIp = new JTextField();
		txtIp.setBounds(80, 61, 86, 20);
		contentPane.add(txtIp);
		txtIp.setColumns(10);
	}

}
