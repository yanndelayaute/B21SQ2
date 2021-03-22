package vue;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.URL;

public class ChoixJoueur extends JFrame {

	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public ChoixJoueur() {
		setTitle("Choice");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 416, 316);
		contentPane = new JPanel();
		this.getContentPane().setPreferredSize(new Dimension(400, 275));
		this.pack();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblFonds = new JLabel("");
		String chemin = "fonds/fondchoix.jpg";
		URL resource = getClass().getClassLoader().getResource(chemin);
		lblFonds.setIcon(new ImageIcon(resource));
		lblFonds.setBounds(0, 0, 400, 275);
		contentPane.add(lblFonds);
		
		JLabel lblArrowLeft = new JLabel("");
		lblArrowLeft.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("précédent");
			}
		});
		lblArrowLeft.setBounds(57, 135, 46, 60);
		contentPane.add(lblArrowLeft);
		
		JLabel lblGo = new JLabel("");
		lblGo.addMouseListener(new MouseAdapter() {
			private Arene frmArene;

			@Override
			public void mouseClicked(MouseEvent e) {
				this.frmArene = new Arene() ;
				this.frmArene.setVisible(true);
			}
		});
		lblGo.setBounds(323, 208, 41, 36);
		contentPane.add(lblGo);
		
		JLabel lblArrowRight = new JLabel("");
		lblArrowRight.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("suivant");
			}
		});
		lblArrowRight.setBounds(286, 142, 46, 48);
		contentPane.add(lblArrowRight);
		
	}

}
