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
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.util.concurrent.ThreadLocalRandom;

public class Frame3 
{
	JFrame frame;
	
	public int team;
	public boolean flag;
	public ArrayList<Integer> list;
	
	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() 
			{
				try 
				{
					Frame3 window = new Frame3();
					window.frame.setVisible(true);
				} 
				catch (Exception e) 
				{
					e.printStackTrace();
				}
			}
		});
	}

	public Frame3(int team,boolean flag, ArrayList<Integer> list) 
	{
		this.team = team;
		this.flag=flag;
		this.list=list;
		initialize();
	}
	
	public Frame3() {
		initialize();
	}
	
	private void initialize() 
	{
		double score = 0;
		double marks = ThreadLocalRandom.current().nextInt(80, 100 + 1);
		
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
		
		while(true)
		{
		score = (list.get(0)+list.get(1)+list.get(2));	
		score = (score/15) * 100;
		score = score*marks/100;
		JLabel lblNewLabel_1 = new JLabel("Your Score - " + Math.ceil(score));
		lblNewLabel_1.setBounds(10, 100, 233, 25);
		frame.getContentPane().add(lblNewLabel_1);
		
		score = (list.get(3)+list.get(4)+list.get(5));	
		score = (score/15) * 100;
		score = score*marks/100;
		JLabel lblNewLabel_2 = new JLabel("Brad Pitt Score - " + Math.ceil(score));
		lblNewLabel_2.setBounds(10, 136, 233, 25);
		frame.getContentPane().add(lblNewLabel_2);
		
		score = (list.get(6)+list.get(7)+list.get(8));	
		score = (score/15) * 100;
		score = score*marks/100;
		JLabel lblNewLabel_3 = new JLabel("Will Smith Score - " + Math.ceil(score));
		lblNewLabel_3.setBounds(10, 172, 233, 25);
		frame.getContentPane().add(lblNewLabel_3);
		
		if(team==3) {break;}
		
		score = (list.get(9)+list.get(10)+list.get(11));	
		score = (score/15) * 100;
		score = score*marks/100;
		JLabel lblNewLabel_4 = new JLabel("Jhonny Depp Score - " + Math.ceil(score));
		lblNewLabel_4.setBounds(10, 208, 233, 25);
		frame.getContentPane().add(lblNewLabel_4);
		
		if(team==4) {break;}
		
		score = (list.get(12)+list.get(13)+list.get(14));	
		score = (score/15) * 100;
		score = score*marks/100;
		JLabel lblNewLabel_5 = new JLabel("Matt Damon Score - " + Math.ceil(score));
		lblNewLabel_5.setBounds(10, 244, 233, 25);
		frame.getContentPane().add(lblNewLabel_5);
		
		if(team==5) {break;}
		
		score = (list.get(15)+list.get(16)+list.get(17));	
		score = (score/15) * 100;
		score = score*marks/100;
		JLabel lblNewLabel_6 = new JLabel("Tom Cruise Score - " + Math.ceil(score));
		lblNewLabel_6.setBounds(10, 280, 233, 25);
		frame.getContentPane().add(lblNewLabel_6);
		break;
		}
		/*
		JButton btnBack = new JButton("BACK");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Frame2 link = new Frame2(team,flag);
				link.frame.setVisible(true);
								
			}
		});
		btnBack.setBounds(60, 325, 156, 31);
		frame.getContentPane().add(btnBack);
		*/
		
		JButton btnQuit = new JButton("Quit");
		btnQuit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				System.exit(0);				
			}
		});
		btnQuit.setBounds(168, 325, 156, 31);
		frame.getContentPane().add(btnQuit);
	
	}

}
