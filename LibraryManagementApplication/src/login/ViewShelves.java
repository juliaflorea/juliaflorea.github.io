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
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ViewShelves extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewShelves frame = new ViewShelves();
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
	public ViewShelves() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 499, 541);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Library shelves");
		lblNewLabel.setOpaque(true);
		lblNewLabel.setFont(new Font("Lucida Grande", Font.BOLD, 22));
		lblNewLabel.setBounds(133, 21, 172, 27);
		contentPane.add(lblNewLabel);
		
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
		lblNewLabel_2_5.setBounds(349, 6, 119, 29);
		contentPane.add(lblNewLabel_2_5);
		
		JLabel lblNewLabel_1 = new JLabel("Shelf 1");
		lblNewLabel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Fantasy obj = new Fantasy();
				obj.setVisible(true);
				dispose();
			}
		});
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setOpaque(true);
		lblNewLabel_1.setBackground(new Color(245, 222, 179));
		lblNewLabel_1.setForeground(new Color(139, 69, 19));
		lblNewLabel_1.setFont(new Font("Lucida Grande", Font.BOLD, 31));
		lblNewLabel_1.setBounds(0, 85, 499, 41);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Shelf 2");
		lblNewLabel_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Programming obj = new Programming();
				obj.setVisible(true);
				dispose();
			}
		});
		lblNewLabel_1_1.setOpaque(true);
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setForeground(new Color(139, 69, 19));
		lblNewLabel_1_1.setFont(new Font("Lucida Grande", Font.BOLD, 31));
		lblNewLabel_1_1.setBackground(new Color(245, 222, 179));
		lblNewLabel_1_1.setBounds(0, 152, 499, 41);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Shelf 3");
		lblNewLabel_1_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Romance obj = new Romance();
				obj.setVisible(true);
				dispose();
			}
		});
		lblNewLabel_1_2.setOpaque(true);
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2.setForeground(new Color(139, 69, 19));
		lblNewLabel_1_2.setFont(new Font("Lucida Grande", Font.BOLD, 31));
		lblNewLabel_1_2.setBackground(new Color(245, 222, 179));
		lblNewLabel_1_2.setBounds(0, 225, 499, 41);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Shelf 4");
		lblNewLabel_1_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Adventure obj = new Adventure();
				obj.setVisible(true);
				dispose();
			}
		});
		lblNewLabel_1_3.setOpaque(true);
		lblNewLabel_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_3.setForeground(new Color(139, 69, 19));
		lblNewLabel_1_3.setFont(new Font("Lucida Grande", Font.BOLD, 31));
		lblNewLabel_1_3.setBackground(new Color(245, 222, 179));
		lblNewLabel_1_3.setBounds(0, 295, 499, 41);
		contentPane.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("Shelf 5");
		lblNewLabel_1_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Psychology obj = new Psychology();
				obj.setVisible(true);
				dispose();
			}
		});
		lblNewLabel_1_4.setOpaque(true);
		lblNewLabel_1_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_4.setForeground(new Color(139, 69, 19));
		lblNewLabel_1_4.setFont(new Font("Lucida Grande", Font.BOLD, 31));
		lblNewLabel_1_4.setBackground(new Color(245, 222, 179));
		lblNewLabel_1_4.setBounds(0, 364, 499, 41);
		contentPane.add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("/Users/juliaflorea/Downloads/Library_Book_532388_1366x768.jpg"));
		lblNewLabel_2.setBounds(0, -11, 731, 524);
		contentPane.add(lblNewLabel_2);
	}
}
