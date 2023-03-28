package login;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextArea;
import javax.swing.JTable;
import javax.swing.JTabbedPane;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.AbstractListModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextField;
import java.awt.Component;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ViewDetails extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewDetails frame = new ViewDetails();
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
	public ViewDetails() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 540, 540);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(230, 230, 250));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Back to menu");
		lblNewLabel_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Home obj = new Home();
				obj.setVisible(true);
				dispose();
			}
		});
		lblNewLabel_2.setOpaque(true);
		lblNewLabel_2.setForeground(Color.BLACK);
		lblNewLabel_2.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(404, 6, 119, 29);
		contentPane.add(lblNewLabel_2);
		
		JList list = new JList();
		list.setBackground(new Color(230, 230, 250));
		list.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			
				
			}
		              
	         
	         
		});
		list.setModel(new AbstractListModel() {
			String[] values = new String[] {"1. The color of magic", "2. The fifth season", "3. The lord of the rings", "4. The name of the wind", "5. American gods", "6. Types and Programming Languages", "7. Algorithms", "8. Introduction to Computer Science Using Python", "9. JavaScript: The Good Parts", "10. The Pragmatic Programmer ", "11. Modern Operating Systems", "12. Vision in white", "13. The notebook", "14. Tonight and forever", "15. The Odyssey", "16. Gulliver's Travels", "17. Moby-Dick", "18. Treasure Island", "19. King Solomon's Mines", "20. Thinking fast and slow", "21. The power of habit", "22. Predictably irrational ", "23. Influence: the psychology of persuasion", " "};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		list.setBounds(18, 89, 285, 417);
		contentPane.add(list);
		
		
		JLabel lblNewLabel_1 = new JLabel("Choose the book from the list below:");
		lblNewLabel_1.setOpaque(true);
		lblNewLabel_1.setForeground(Color.BLACK);
		lblNewLabel_1.setFont(new Font("Lucida Grande", Font.BOLD, 16));
		lblNewLabel_1.setBounds(6, 54, 343, 23);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("View details");
		btnNewButton.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		btnNewButton.setOpaque(true);
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				btnNewButton.setText(list.getSelectedValue().toString());
			    int index = list.locationToIndex(e.getPoint());
			    if(index == 0)
			    	JOptionPane.showMessageDialog(rootPane, "Author: Terry Pratchett\nPrice: 44.95\nPublish date: 2000-10-01");
			    else if(index ==1)
			    	JOptionPane.showMessageDialog(rootPane, "Author: NK Jemisin\nPrice: 5.95\nPublish date: 2000-12-16");
			    else if(index ==2)
			    	JOptionPane.showMessageDialog(rootPane, "Author: JRR Tolkien\nPrice: 5.95\nPublish date: 2000-11-17");
			    else if(index==3)
			    	JOptionPane.showMessageDialog(rootPane, "Author:Patrick Rothfuss \nPrice:5.95 \nPublish date:2001-03-10  ");
			    else if(index==4)
			    	JOptionPane.showMessageDialog(rootPane, "Author:Neil Gaiman \nPrice:5.95 \nPublish date: 2001-09-10  ");
			    else if(index==5)
			    	JOptionPane.showMessageDialog(rootPane, "Author:C. Pierce \nPrice:4.95 \nPublish date: 2000-09-02 ");
			    else if(index==6)
			    	JOptionPane.showMessageDialog(rootPane, "Author:Robert Sedgewick and Kevin Wayne \nPrice:4.95 \nPublish date: 2000-11-02  ");
			    else if(index==7)
			    	JOptionPane.showMessageDialog(rootPane, "Author:Charles Dierbach \nPrice:4.95 \nPublish date:2000-12-06  ");
			    else if(index==8)
			    	JOptionPane.showMessageDialog(rootPane, "Author:Douglas Crockford \nPrice:6.95 \nPublish date:2000-11-02   ");
			    else if(index==9)
			    	JOptionPane.showMessageDialog(rootPane, "Author:Andrew Hunt and David Thomas \nPrice:36.95 \nPublish date:2000-12-09  ");
			    else if(index==10)
			    	JOptionPane.showMessageDialog(rootPane, "Author:Andrew S. Tanenbaum \nPrice:36.95 \nPublish date: 2000-12-01 ");
			    else if(index==11)
			    	JOptionPane.showMessageDialog(rootPane, "Author:Daniel Kahneman  \nPrice: 36.95\nPublish date: 2002-12-01 ");
			    else if(index==12)
			    	JOptionPane.showMessageDialog(rootPane, "Author:Charles Duhigg \nPrice:12.90 \nPublish date:2005-12-05   ");
			    else if(index==13)
			    	JOptionPane.showMessageDialog(rootPane, "Author:Dan Ariely \nPrice:15.95 \nPublish date: 2005-12-12 ");
			    else if(index==14)
			    	JOptionPane.showMessageDialog(rootPane, "Author: Robert Cialdini\nPrice:40.50 \nPublish date:2005-09-06  ");
			    else if(index==15)
			    	JOptionPane.showMessageDialog(rootPane, "Author:Nora Roberts \nPrice:10.95 \nPublish date:2000-09-06   ");
			    else if(index==16)
			    	JOptionPane.showMessageDialog(rootPane, "Author:Nicolas Sparks \nPrice:30.45  \nPublish date: 1999-10-02 ");
			    else if(index==17)
			    	JOptionPane.showMessageDialog(rootPane, "Author:Brenda Jackson  \nPrice: 30.50\nPublish date: 1998-11-02  ");
			    else if(index==18)
			    	JOptionPane.showMessageDialog(rootPane, "Author:Homer \nPrice:40.50 \nPublish date:1998-10-05  ");
			    else if(index==19)
			    	JOptionPane.showMessageDialog(rootPane, "Author:Jonathan Swift \nPrice: 35.80 \nPublish date:  1999-08-05  ");
			    else if(index==20)
			    	JOptionPane.showMessageDialog(rootPane, "Author:Herman Melville \nPrice:19.50  \nPublish date:1998-12-11  ");
			    else if(index==21)
			    	JOptionPane.showMessageDialog(rootPane, "Author:Robert Louis Stevenson \nPrice:21.50 \nPublish date:2000-10-02  ");
			    else if(index==22)
			    	JOptionPane.showMessageDialog(rootPane, "Author:H. Rider Haggard \nPrice:17.95 \nPublish date:1998-09-10  ");
			    
			    
			    
			    
			    
			    
			}
		});
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(333, 224, 148, 47);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_1_1 = new JLabel("Library");
		lblNewLabel_1_1.setOpaque(true);
		lblNewLabel_1_1.setForeground(Color.BLACK);
		lblNewLabel_1_1.setFont(new Font("Krungthep", Font.BOLD, 16));
		lblNewLabel_1_1.setBounds(220, 9, 171, 23);
		contentPane.add(lblNewLabel_1_1);
	}
}
