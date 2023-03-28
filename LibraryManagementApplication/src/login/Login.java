package login;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Toolkit;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Component;

public class Login extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblPassword;
	private JTextField textField;
	private JPasswordField passwordField;
	private JLabel lblNewLabel_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
					frame.setSize(1366,768 );  
					frame.setSize(1650,1080);
					frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
					 
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
	public Login() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("/Users/juliaflorea/Downloads/libraryIcon.png"));
		setTitle("Library Management System");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 767, 553);
		contentPane = new JPanel();
		contentPane.setAlignmentY(768.0f);
		contentPane.setAlignmentX(1366.0f);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		//setExtendedState(JFrame.MAXIMIZED_BOTH);
		
		lblNewLabel = new JLabel("Username");
		lblNewLabel.setForeground(new Color(255, 250, 250));
		lblNewLabel.setBounds(20, 19, 79, 16);
		lblNewLabel.setFont(new Font("Kohinoor Telugu", Font.BOLD, 15));
		contentPane.add(lblNewLabel);
		
		lblPassword = new JLabel("Password");
		lblPassword.setForeground(new Color(255, 250, 250));
		lblPassword.setBounds(20, 67, 79, 16);
		lblPassword.setFont(new Font("Lucida Grande", Font.BOLD, 15));
		contentPane.add(lblPassword);
		
		textField = new JTextField();
		textField.setBounds(159, 14, 217, 26);
		textField.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		textField.setBackground(new Color(255, 240, 245));
		contentPane.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(159, 62, 217, 26);
		passwordField.setBackground(new Color(255, 240, 245));
		contentPane.add(passwordField);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().equals("admin")&& passwordField.getText().equals("admin"))  {
					setVisible(false);
					new Home().setVisible(true);
				}
				else 
					JOptionPane.showMessageDialog(null, "Incorrect username or password.");
					
			}
		});
		btnNewButton.setOpaque(true);
		btnNewButton.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		btnNewButton.setBounds(159, 114, 114, 29);
		btnNewButton.setBackground(new Color(255, 240, 245));
		btnNewButton.setIcon(new ImageIcon("/Users/juliaflorea/Downloads/login (1).png"));
		contentPane.add(btnNewButton);
		
		JButton btnClose = new JButton("Close");
		btnClose.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		btnClose.setOpaque(true);
		btnClose.setBounds(286, 114, 104, 29);
		btnClose.setBackground(new Color(255, 240, 245));
		btnClose.setIcon(new ImageIcon("/Users/juliaflorea/Downloads/red-x-mark-transparent-background-3.png"));
		btnClose.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		contentPane.add(btnClose);
		
		lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setAlignmentX(Component.CENTER_ALIGNMENT);
		lblNewLabel_1.setIcon(new ImageIcon("/Users/juliaflorea/Downloads/Login background.PNG"));
		lblNewLabel_1.setBounds(6, 0, 1431, 707);
		contentPane.add(lblNewLabel_1);
	}
}
