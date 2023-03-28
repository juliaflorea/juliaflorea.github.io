package login;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ViewBooks extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewBooks frame = new ViewBooks();
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
	public ViewBooks() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 572, 548);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(173, 216, 230));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Library");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.BOLD, 22));
		lblNewLabel.setBounds(213, 17, 168, 25);
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
		lblNewLabel_2_5.setBounds(416, 6, 119, 29);
		contentPane.add(lblNewLabel_2_5);
		
		JLabel lblNewLabel_1 = new JLabel("The list of all books contained in the library:");
		lblNewLabel_1.setBounds(6, 59, 295, 29);
		contentPane.add(lblNewLabel_1);
		
		JTextArea txtrTheColor = new JTextArea();
		txtrTheColor.setFont(new Font("Lucida Grande", Font.PLAIN, 13));
		txtrTheColor.setBackground(new Color(173, 216, 230));
		txtrTheColor.setText("1. The color of magic bY Terry Pratchett\n2. The fifth season by Nk Jemisin\n3. The lord of the rings by Jrr Tolkien\n4. The name of the wind by Patrick Rothfuss\n5. American gods by Neil Gaiman\n6. Types and programming languages by Benjamin C. Pierce\n7. Algorithms by Robert Sedgewick & Kevin Wayne\n8. Introduction to Computer Science using Python by Charles Dierbach\n9. JavaScript: the good parts by Douglas Crockford\n10. The pragmatic programmer by Andrew Hunt and David Thomas\n11. Modern operating systems by Andrew S. Tanenbaum\n12. Thinking fast and slow by Daniel Kahneman\n13. The power of habit by Charles Duhigg\n14. Predictably irrational by Dan Ariely\n15. Influence: the psychology of persuasion by Robert Cialdini\n16. Vision in white by Nora Roberts\n17. The notebook by Nicolas Sparks\n18. Tonight and forever by Brenda Jackson\n19. The Odyssey by Homer\n20. Gulliver's travels by Jonathan Swift\n21. Moby-Dick by Herman Melville\n22. Treasure island by Robert Louis Stevenson\n23. King Solomon's mines by H. Rider Haggard\n");
		txtrTheColor.setBounds(16, 99, 519, 397);
		contentPane.add(txtrTheColor);
	}
}
