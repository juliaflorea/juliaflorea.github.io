package login;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ViewCategories extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewCategories frame = new ViewCategories();
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
	public ViewCategories() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("All book categories");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.BOLD, 20));
		lblNewLabel.setBounds(92, 16, 232, 16);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Choose the category:");
		lblNewLabel_1.setBounds(6, 57, 163, 16);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Fantasy");
		lblNewLabel_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Fantasy obj = new Fantasy();
				obj.setVisible(true);
				dispose();
			}
		});
		lblNewLabel_2.setIcon(new ImageIcon("/Users/juliaflorea/Downloads/New book.png"));
		lblNewLabel_2.setForeground(Color.MAGENTA);
		lblNewLabel_2.setFont(new Font("Lucida Grande", Font.BOLD, 15));
		lblNewLabel_2.setBounds(25, 85, 127, 49);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Programming");
		lblNewLabel_2_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Programming obj = new Programming();
				obj.setVisible(true);
				dispose();
				
				
			}
		});
		lblNewLabel_2_1.setForeground(Color.GRAY);
		lblNewLabel_2_1.setFont(new Font("Lucida Grande", Font.BOLD, 15));
		lblNewLabel_2_1.setBounds(176, 101, 111, 16);
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("Psychology");
		lblNewLabel_2_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Psychology obj = new Psychology();
				obj.setVisible(true);
				dispose();
			}
		});
		lblNewLabel_2_2.setFont(new Font("Lucida Grande", Font.BOLD, 15));
		lblNewLabel_2_2.setForeground(Color.GREEN);
		lblNewLabel_2_2.setBounds(187, 161, 100, 16);
		contentPane.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_2_3 = new JLabel("Romance");
		lblNewLabel_2_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Romance obj = new Romance();
				obj.setVisible(true);
				dispose();
			}
		});
		lblNewLabel_2_3.setFont(new Font("Lucida Grande", Font.BOLD, 15));
		lblNewLabel_2_3.setForeground(Color.RED);
		lblNewLabel_2_3.setBounds(317, 98, 111, 22);
		contentPane.add(lblNewLabel_2_3);
		
		JLabel lblNewLabel_2_4 = new JLabel("Adventure");
		lblNewLabel_2_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Adventure obj = new Adventure();
				obj.setVisible(true);
				dispose();
			}
		});
		lblNewLabel_2_4.setBackground(new Color(95, 158, 160));
		lblNewLabel_2_4.setFont(new Font("Lucida Grande", Font.BOLD, 15));
		lblNewLabel_2_4.setForeground(Color.BLUE);
		lblNewLabel_2_4.setBounds(78, 161, 111, 16);
		contentPane.add(lblNewLabel_2_4);
		
		JLabel lblNewLabel_2_5 = new JLabel("Back to menu");
		lblNewLabel_2_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Home obj = new Home();
				obj.setVisible(true);
				dispose();
			}
		});
		lblNewLabel_2_5.setOpaque(true);
		lblNewLabel_2_5.setForeground(Color.BLACK);
		lblNewLabel_2_5.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblNewLabel_2_5.setBounds(317, 16, 119, 29);
		contentPane.add(lblNewLabel_2_5);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("/Users/juliaflorea/Downloads/123456.png"));
		lblNewLabel_3.setBounds(0, 0, 450, 272);
		contentPane.add(lblNewLabel_3);
	}
}
