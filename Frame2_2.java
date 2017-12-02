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

public class Frame2_2 {

	JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame2_2 window = new Frame2_2();
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
	public Frame2_2() {
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
		
		JLabel lblInitialization = new JLabel("2. Grading");
		lblInitialization.setFont(new Font("Arial Black", Font.PLAIN, 14));
		lblInitialization.setBounds(10, 65, 120, 25);
		frame.getContentPane().add(lblInitialization);
		
		JLabel lblNewLabel_1 = new JLabel("Enter Scores for Yourself");
		lblNewLabel_1.setBounds(10, 101, 233, 25);
		frame.getContentPane().add(lblNewLabel_1);
	
		JSpinner spinner21 = new JSpinner();
		spinner21.setModel(new SpinnerNumberModel(0, 0, 5, 1));
		spinner21.setBounds(282, 103, 29, 20);
		frame.getContentPane().add(spinner21);
		
		JSpinner spinner22 = new JSpinner();
		spinner22.setModel(new SpinnerNumberModel(0, 0, 5, 1));
		spinner22.setBounds(350, 103, 29, 20);
		frame.getContentPane().add(spinner22);
		
		JSpinner spinner23 = new JSpinner();
		spinner23.setModel(new SpinnerNumberModel(0, 0, 5, 1));
		spinner23.setBounds(417, 103, 29, 20);
		frame.getContentPane().add(spinner23);
		
		JLabel lblEnterScoresFor = new JLabel("Enter Scores for Team Member 2");
		lblEnterScoresFor.setBounds(10, 138, 233, 25);
		frame.getContentPane().add(lblEnterScoresFor);
			
		JSpinner spinner24 = new JSpinner();
		spinner24.setModel(new SpinnerNumberModel(0, 0, 5, 1));
		spinner24.setBounds(282, 138, 29, 20);
		frame.getContentPane().add(spinner24);
		
		JSpinner spinner25 = new JSpinner();
		spinner25.setModel(new SpinnerNumberModel(0, 0, 5, 1));
		spinner25.setBounds(350, 138, 29, 20);
		frame.getContentPane().add(spinner25);
		
		JSpinner spinner26 = new JSpinner();
		spinner26.setModel(new SpinnerNumberModel(0, 0, 5, 1));
		spinner26.setBounds(417, 138, 29, 20);
		frame.getContentPane().add(spinner26);
		
		JButton btnSubmit = new JButton("SUBMIT");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Frame3 link = new Frame3();
				link.frame.setVisible(true);
								
			}
		});
		btnSubmit.setBounds(60, 285, 156, 31);
		frame.getContentPane().add(btnSubmit);
		
		JButton btnBack = new JButton("BACK");
		btnBack.setSize(156, 31);
		btnBack.setLocation(318, 285);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Frame1 link = new Frame1();
				link.frame.setVisible(true);
								
			}
		});
		btnBack.setBounds(268, 285, 156, 31);
		frame.getContentPane().add(btnBack);
						
 }

	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		
	}
}
