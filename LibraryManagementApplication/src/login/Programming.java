package login;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Programming extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Programming frame = new Programming();
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
	public Programming() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblProgramming = new JLabel("Programming");
		lblProgramming.setForeground(Color.WHITE);
		lblProgramming.setFont(new Font("Noteworthy", Font.BOLD, 25));
		lblProgramming.setBounds(120, 6, 143, 56);
		contentPane.add(lblProgramming);
		
		JLabel lblNewLabel_2 = new JLabel("Back to menu");
		lblNewLabel_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ViewCategories obj = new ViewCategories();
				obj.setVisible(true);
				dispose();
			}
		});
		lblNewLabel_2.setOpaque(true);
		lblNewLabel_2.setForeground(Color.BLACK);
		lblNewLabel_2.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(313, 6, 119, 29);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_1 = new JLabel("Choose the book:");
		lblNewLabel_1.setOpaque(true);
		lblNewLabel_1.setForeground(Color.BLACK);
		lblNewLabel_1.setFont(new Font("Lucida Grande", Font.BOLD, 16));
		lblNewLabel_1.setBounds(6, 87, 162, 23);
		contentPane.add(lblNewLabel_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"1. Types and Programming Languages", "2. Algorithms", "3. Introduction to Computer Science Using Python", "4. JavaScript: The Good Parts", "5. The Pragmatic Programmer ", "6. Modern Operating Systems"}));
		comboBox.setBounds(192, 87, 52, 27);
		contentPane.add(comboBox);
		
		JButton btnNewButton = new JButton("OK");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				btnNewButton.setText(comboBox.getSelectedItem().toString());
				JOptionPane.showMessageDialog(rootPane, " The book has been issued.");
			}
		});
		btnNewButton.setOpaque(true);
		btnNewButton.setBounds(248, 156, 75, 29);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_2_1 = new JLabel("Back to shelves");
		lblNewLabel_2_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ViewShelves obj = new ViewShelves();
				obj.setVisible(true);
				dispose();
			}
		});
		lblNewLabel_2_1.setOpaque(true);
		lblNewLabel_2_1.setForeground(Color.BLACK);
		lblNewLabel_2_1.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblNewLabel_2_1.setBounds(313, 44, 119, 29);
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("/Users/juliaflorea/Downloads/Library_Book_532388_1366x768.jpg"));
		lblNewLabel.setBounds(0, 0, 450, 272);
		contentPane.add(lblNewLabel);
	}

}
