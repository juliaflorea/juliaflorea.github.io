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
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Adventure extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Adventure frame = new Adventure();
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
	public Adventure() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblAdventure = new JLabel("Adventure");
		lblAdventure.setForeground(Color.WHITE);
		lblAdventure.setFont(new Font("Noteworthy", Font.BOLD, 25));
		lblAdventure.setBounds(153, 22, 197, 56);
		contentPane.add(lblAdventure);
		
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
		lblNewLabel_2.setBounds(304, 17, 119, 29);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_1 = new JLabel("Choose the book:");
		lblNewLabel_1.setOpaque(true);
		lblNewLabel_1.setForeground(Color.BLACK);
		lblNewLabel_1.setFont(new Font("Lucida Grande", Font.BOLD, 16));
		lblNewLabel_1.setBounds(16, 102, 162, 23);
		contentPane.add(lblNewLabel_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"1. The Odyssey", "2. Gulliver's Travels", "3. Moby-Dick", "4. Treasure Island", "5. King Solomon's Mines"}));
		comboBox.setBounds(190, 102, 52, 27);
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
		btnNewButton.setBounds(235, 166, 75, 29);
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
		lblNewLabel_2_1.setBounds(304, 58, 119, 29);
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("/Users/juliaflorea/Downloads/Library_Book_532388_1366x768.jpg"));
		lblNewLabel.setBounds(0, 0, 450, 272);
		contentPane.add(lblNewLabel);
	}

}
