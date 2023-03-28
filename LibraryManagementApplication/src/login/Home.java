package login;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Home extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home frame = new Home();
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
	public Home() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 752, 536);
		contentPane = new JPanel();
		contentPane.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		contentPane.setBackground(new Color(255, 240, 245));
		contentPane.addComponentListener(new ComponentAdapter() {
			@Override
			public void componentResized(ComponentEvent e) {
			}
		});
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("View all books");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ViewBooks obj = new ViewBooks();
				obj.setVisible(true);
				dispose();
				
			}
		});
		btnNewButton.setBackground(new Color(255, 248, 220));
		btnNewButton.setIcon(new ImageIcon("/Users/juliaflorea/Downloads/issue.png"));
		btnNewButton.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(18, 23, 175, 53);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("View all categories");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ViewCategories obj = new ViewCategories();
				obj.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setIcon(new ImageIcon("/Users/juliaflorea/Downloads/issue book.png"));
		btnNewButton_1.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		btnNewButton_1.setBounds(258, 26, 183, 47);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_3 = new JButton("View shelves by category");
		btnNewButton_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ViewShelves obj = new ViewShelves();
				obj.setVisible(true);
				dispose();
			}
		});
		btnNewButton_3.setIcon(new ImageIcon("/Users/juliaflorea/Downloads/Statics.png"));
		btnNewButton_3.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		btnNewButton_3.setBounds(479, 25, 252, 48);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Logout");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new Login().setVisible(true);
			}
		});
		btnNewButton_4.setIcon(new ImageIcon("/Users/juliaflorea/Downloads/exit.png"));
		btnNewButton_4.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		btnNewButton_4.setBounds(258, 119, 159, 48);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("View book details");
		btnNewButton_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ViewDetails obj = new ViewDetails();
				obj.setVisible(true);
				dispose();
			}
		});
		btnNewButton_5.setIcon(new ImageIcon("/Users/juliaflorea/Downloads/New book.png"));
		btnNewButton_5.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_5.setBounds(18, 119, 194, 48);
		contentPane.add(btnNewButton_5);
	}
}
