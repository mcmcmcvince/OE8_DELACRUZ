package copl_ex1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;

public class Dashboard extends JFrame {

	private JPanel contentPane;
	JLabel lbluserT;
	private JLabel lblHaveAGreat;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Dashboard frame = new Dashboard();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public Dashboard() {
		setTitle("Dashboard");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 519, 258);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GRAY);
		contentPane.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("WELCOME!");
		lblNewLabel.setFont(new Font("Microsoft Himalaya", Font.BOLD, 63));
		lblNewLabel.setBounds(121, 11, 274, 78);
		contentPane.add(lblNewLabel);
		
		lbluserT = new JLabel();
		lbluserT.setFont(new Font("Microsoft Himalaya", Font.BOLD, 40));
		lbluserT.setBounds(219, 68, 142, 46);
		contentPane.add(lbluserT);
		
		lblHaveAGreat = new JLabel("Have a great day ahead!");
		lblHaveAGreat.setFont(new Font("Microsoft Himalaya", Font.BOLD, 30));
		lblHaveAGreat.setBounds(138, 98, 223, 56);
		contentPane.add(lblHaveAGreat);
	}
}