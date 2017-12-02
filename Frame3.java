import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextPane;
import javax.swing.JScrollBar;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Frame3 {

	JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame3 window = new Frame3();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Frame3() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 500, 450);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblPleaseEnter = new JLabel("Student Evaluation System");
		lblPleaseEnter.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblPleaseEnter.setBounds(90, 11, 335, 25);
		frame.getContentPane().add(lblPleaseEnter);
		
		JLabel lblInitialization = new JLabel("3. Scores");
		lblInitialization.setFont(new Font("Arial Black", Font.PLAIN, 14));
		lblInitialization.setBounds(10, 70, 120, 14);
		frame.getContentPane().add(lblInitialization);
		
		JLabel lblNewLabel_1 = new JLabel("Your Score - ");
		lblNewLabel_1.setBounds(10, 100, 233, 25);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Brad Pitt Score - ");
		lblNewLabel_2.setBounds(10, 136, 233, 25);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Will Smith Score - ");
		lblNewLabel_3.setBounds(10, 172, 233, 25);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Jhonny Depp Score - ");
		lblNewLabel_4.setBounds(10, 208, 233, 25);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Matt Damon Score - ");
		lblNewLabel_5.setBounds(10, 244, 233, 25);
		frame.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Tom Cruise Score - ");
		lblNewLabel_6.setBounds(10, 280, 233, 25);
		frame.getContentPane().add(lblNewLabel_6);
		
		JButton btnBack = new JButton("BACK");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Frame2_6 link = new Frame2_6();
				link.frame.setVisible(true);
								
			}
		});
		btnBack.setBounds(60, 325, 156, 31);
		frame.getContentPane().add(btnBack);
		
		JButton btnQuit = new JButton("Quit");
		btnQuit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				System.exit(0);				
			}
		});
		btnQuit.setBounds(268, 325, 156, 31);
		frame.getContentPane().add(btnQuit);
		
					
 }
}
