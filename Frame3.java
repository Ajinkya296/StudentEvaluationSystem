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
		
		JLabel lblNewLabel = new JLabel("How many students are present in your team including yourself?");
		lblNewLabel.setBounds(10, 120, 391, 25);
		frame.getContentPane().add(lblNewLabel);
		
		JSpinner spinner11 = new JSpinner();
		spinner11.setModel(new SpinnerNumberModel(3, 3, 6, 1));
		spinner11.setBounds(445, 122, 29, 20);
		frame.getContentPane().add(spinner11);
		

		JLabel lblNewLabel_1 = new JLabel("Have you previously entered scores for your team members?");
		lblNewLabel_1.setBounds(10, 200, 355, 25);
		frame.getContentPane().add(lblNewLabel_1);
		
		JRadioButton rdbtnYes = new JRadioButton(" Yes");
		rdbtnYes.setBounds(371, 202, 54, 23);
		frame.getContentPane().add(rdbtnYes);
		
		JRadioButton rdbtnNo = new JRadioButton(" No");
		rdbtnNo.setBounds(430, 202, 54, 23);
		frame.getContentPane().add(rdbtnNo);
		
		JButton btnSubmit = new JButton("SUBMIT");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Frame2 link = new Frame2();
				link.frame.setVisible(true);
					
			}
		});
		btnSubmit.setBounds(180, 285, 156, 31);
		frame.getContentPane().add(btnSubmit);
				
 }
}