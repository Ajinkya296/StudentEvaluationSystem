import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.concurrent.ThreadLocalRandom;
//import java.awt.FlowLayout;
//import javax.swing.JTextField;
//import javax.swing.JTextPane;
//import javax.swing.JScrollBar;
//import javax.swing.JRadioButton;
//import javax.swing.SwingConstants;
//import javax.swing.JComboBox;

public class Frame2 
{
	JFrame frame;
    
	public int team;
	public boolean flag;
    
    public Frame2(int team,boolean flag)
    {
    	this.team=team;
    	this.flag=flag;
    	initialize();
    }
    
    public Frame2() 
	{
		initialize();
	}

	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() 
			{
				try 
				{
					Frame2 window = new Frame2();
					window.frame.setVisible(true);
				} 
				catch (Exception e) 
				{
					e.printStackTrace();
				}
			}
		});
	}
	
	private int random()
	{
		int randomNum = ThreadLocalRandom.current().nextInt(0, 5 + 1);
		return randomNum;
	}
	
	private void initialize() 
	{
		frame = new JFrame();
		frame.setBounds(100, 100, 500, 450);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblPleaseEnter = new JLabel("Student Evaluation System");
		lblPleaseEnter.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblPleaseEnter.setBounds(90, 11, 335, 25);
		frame.getContentPane().add(lblPleaseEnter);
		
		JLabel lblGrading = new JLabel("2. Grading");
		lblGrading.setFont(new Font("Arial Black", Font.PLAIN, 14));
		lblGrading.setBounds(10, 65, 120, 25);
		frame.getContentPane().add(lblGrading);
		

		JLabel lblProfessionalism = new JLabel("Professionalism\t");
		lblProfessionalism.setBounds(228, 65, 98, 31);
		frame.getContentPane().add(lblProfessionalism);
		
		JLabel lblMeetingParticipation = new JLabel("Meeting");
		lblMeetingParticipation.setBounds(330, 60, 85, 31);
		frame.getContentPane().add(lblMeetingParticipation);
		
		JLabel lblParicipation = new JLabel("Paricipation");
		lblParicipation.setBounds(330, 75, 85, 25);
		frame.getContentPane().add(lblParicipation);
		
		JLabel lblWork = new JLabel("Work");
		lblWork.setBounds(410, 60, 85, 31);
		frame.getContentPane().add(lblWork);
		
		JLabel lblEvaluation = new JLabel("Evaluation");
		lblEvaluation.setBounds(410, 75, 85, 25);
		frame.getContentPane().add(lblEvaluation);
		
		if(team == 3)
		{
			JLabel lblNewLabel_1 = new JLabel("Enter Scores for Yourself");
			lblNewLabel_1.setBounds(10, 100, 233, 25);
			frame.getContentPane().add(lblNewLabel_1);
		
			JSpinner spinner211 = new JSpinner();
			if(flag) {spinner211.setModel(new SpinnerNumberModel(random(), 0, 5, 1));}
			else {spinner211.setModel(new SpinnerNumberModel(0, 0, 5, 1));}
			spinner211.setBounds(272, 100, 29, 20);
			frame.getContentPane().add(spinner211);
			
			JSpinner spinner212 = new JSpinner();
			if(flag) {spinner212.setModel(new SpinnerNumberModel(random(), 0, 5, 1));}
			else {spinner212.setModel(new SpinnerNumberModel(0, 0, 5, 1));}
			spinner212.setBounds(350, 100, 29, 20);
			frame.getContentPane().add(spinner212);
			
			JSpinner spinner213 = new JSpinner();
			if(flag) {spinner213.setModel(new SpinnerNumberModel(random(), 0, 5, 1));}
			else {spinner213.setModel(new SpinnerNumberModel(0, 0, 5, 1));}
			spinner213.setBounds(417, 100, 29, 20);
			frame.getContentPane().add(spinner213);
			
			JLabel lblNewLabel_2 = new JLabel("Enter Scores for Team Member Brad");
			lblNewLabel_2.setBounds(10, 136, 233, 25);
			frame.getContentPane().add(lblNewLabel_2);
			
			JSpinner spinner221 = new JSpinner();
			if(flag) {spinner221.setModel(new SpinnerNumberModel(random(), 0, 5, 1));}
			else {spinner221.setModel(new SpinnerNumberModel(0, 0, 5, 1));}
			spinner221.setBounds(272, 136, 29, 20);
			frame.getContentPane().add(spinner221);
			
			JSpinner spinner222 = new JSpinner();
			if(flag) {spinner222.setModel(new SpinnerNumberModel(random(), 0, 5, 1));}
			else {spinner222.setModel(new SpinnerNumberModel(0, 0, 5, 1));}
			spinner222.setBounds(350, 136, 29, 20);
			frame.getContentPane().add(spinner222);
			
			JSpinner spinner223 = new JSpinner();
			if(flag) {spinner223.setModel(new SpinnerNumberModel(random(), 0, 5, 1));}
			else {spinner223.setModel(new SpinnerNumberModel(0, 0, 5, 1));}
			spinner223.setBounds(417, 136, 29, 20);
			frame.getContentPane().add(spinner223);

			JLabel lblNewLabel_3 = new JLabel("Enter Scores for Team Member Will");
			lblNewLabel_3.setBounds(10, 172, 233, 25);
			frame.getContentPane().add(lblNewLabel_3);
		
			JSpinner spinner231 = new JSpinner();
			if(flag) {spinner231.setModel(new SpinnerNumberModel(random(), 0, 5, 1));}
			else {spinner231.setModel(new SpinnerNumberModel(0, 0, 5, 1));}
			spinner231.setBounds(272, 172, 29, 20);
			frame.getContentPane().add(spinner231);
			
			JSpinner spinner232 = new JSpinner();
			if(flag) {spinner232.setModel(new SpinnerNumberModel(random(), 0, 5, 1));}
			else {spinner232.setModel(new SpinnerNumberModel(0, 0, 5, 1));}
			spinner232.setBounds(350, 172, 29, 20);
			frame.getContentPane().add(spinner232);
			
			JSpinner spinner233 = new JSpinner();
			if(flag) {spinner233.setModel(new SpinnerNumberModel(random(), 0, 5, 1));}
			else {spinner233.setModel(new SpinnerNumberModel(0, 0, 5, 1));}
			spinner233.setBounds(417, 172, 29, 20);
			frame.getContentPane().add(spinner233);
		}
		else if(team == 4)
		{
			JLabel lblNewLabel_1 = new JLabel("Enter Scores for Yourself");
			lblNewLabel_1.setBounds(10, 100, 233, 25);
			frame.getContentPane().add(lblNewLabel_1);
		
			JSpinner spinner211 = new JSpinner();
			if(flag) {spinner211.setModel(new SpinnerNumberModel(random(), 0, 5, 1));}
			else {spinner211.setModel(new SpinnerNumberModel(0, 0, 5, 1));}
			spinner211.setBounds(272, 100, 29, 20);
			frame.getContentPane().add(spinner211);
			
			JSpinner spinner212 = new JSpinner();
			if(flag) {spinner212.setModel(new SpinnerNumberModel(random(), 0, 5, 1));}
			else {spinner212.setModel(new SpinnerNumberModel(0, 0, 5, 1));}
			spinner212.setBounds(350, 100, 29, 20);
			frame.getContentPane().add(spinner212);
			
			JSpinner spinner213 = new JSpinner();
			if(flag) {spinner213.setModel(new SpinnerNumberModel(random(), 0, 5, 1));}
			else {spinner213.setModel(new SpinnerNumberModel(0, 0, 5, 1));}
			spinner213.setBounds(417, 100, 29, 20);
			frame.getContentPane().add(spinner213);
			
			JLabel lblNewLabel_2 = new JLabel("Enter Scores for Team Member Brad");
			lblNewLabel_2.setBounds(10, 136, 233, 25);
			frame.getContentPane().add(lblNewLabel_2);
			
			JSpinner spinner221 = new JSpinner();
			if(flag) {spinner221.setModel(new SpinnerNumberModel(random(), 0, 5, 1));}
			else {spinner221.setModel(new SpinnerNumberModel(0, 0, 5, 1));}
			spinner221.setBounds(272, 136, 29, 20);
			frame.getContentPane().add(spinner221);
			
			JSpinner spinner222 = new JSpinner();
			if(flag) {spinner222.setModel(new SpinnerNumberModel(random(), 0, 5, 1));}
			else {spinner222.setModel(new SpinnerNumberModel(0, 0, 5, 1));}
			spinner222.setBounds(350, 136, 29, 20);
			frame.getContentPane().add(spinner222);
			
			JSpinner spinner223 = new JSpinner();
			if(flag) {spinner223.setModel(new SpinnerNumberModel(random(), 0, 5, 1));}
			else {spinner223.setModel(new SpinnerNumberModel(0, 0, 5, 1));}
			spinner223.setBounds(417, 136, 29, 20);
			frame.getContentPane().add(spinner223);

			JLabel lblNewLabel_3 = new JLabel("Enter Scores for Team Member Will");
			lblNewLabel_3.setBounds(10, 172, 233, 25);
			frame.getContentPane().add(lblNewLabel_3);
		
			JSpinner spinner231 = new JSpinner();
			if(flag) {spinner231.setModel(new SpinnerNumberModel(random(), 0, 5, 1));}
			else {spinner231.setModel(new SpinnerNumberModel(0, 0, 5, 1));}
			spinner231.setBounds(272, 172, 29, 20);
			frame.getContentPane().add(spinner231);
			
			JSpinner spinner232 = new JSpinner();
			if(flag) {spinner232.setModel(new SpinnerNumberModel(random(), 0, 5, 1));}
			else {spinner232.setModel(new SpinnerNumberModel(0, 0, 5, 1));}
			spinner232.setBounds(350, 172, 29, 20);
			frame.getContentPane().add(spinner232);
			
			JSpinner spinner233 = new JSpinner();
			if(flag) {spinner233.setModel(new SpinnerNumberModel(random(), 0, 5, 1));}
			else {spinner233.setModel(new SpinnerNumberModel(0, 0, 5, 1));}
			spinner233.setBounds(417, 172, 29, 20);
			frame.getContentPane().add(spinner233);
			
			JLabel lblNewLabel_4 = new JLabel("Enter Scores for Team Member Jhonny");
			lblNewLabel_4.setBounds(10, 208, 233, 25);
			frame.getContentPane().add(lblNewLabel_4);
		
			JSpinner spinner241 = new JSpinner();
			if(flag) {spinner241.setModel(new SpinnerNumberModel(random(), 0, 5, 1));}
			else {spinner241.setModel(new SpinnerNumberModel(0, 0, 5, 1));}
			spinner241.setBounds(272, 208, 29, 20);
			frame.getContentPane().add(spinner241);
			
			JSpinner spinner242 = new JSpinner();
			if(flag) {spinner242.setModel(new SpinnerNumberModel(random(), 0, 5, 1));}
			else {spinner242.setModel(new SpinnerNumberModel(0, 0, 5, 1));}
			spinner242.setBounds(350, 208, 29, 20);
			frame.getContentPane().add(spinner242);
			
			JSpinner spinner243 = new JSpinner();
			if(flag) {spinner243.setModel(new SpinnerNumberModel(random(), 0, 5, 1));}
			else {spinner243.setModel(new SpinnerNumberModel(0, 0, 5, 1));}
			spinner243.setBounds(417, 208, 29, 20);
			frame.getContentPane().add(spinner243);
		}
		else if(team == 5)
		{
			JLabel lblNewLabel_1 = new JLabel("Enter Scores for Yourself");
			lblNewLabel_1.setBounds(10, 100, 233, 25);
			frame.getContentPane().add(lblNewLabel_1);
		
			JSpinner spinner211 = new JSpinner();
			if(flag) {spinner211.setModel(new SpinnerNumberModel(random(), 0, 5, 1));}
			else {spinner211.setModel(new SpinnerNumberModel(0, 0, 5, 1));}
			spinner211.setBounds(272, 100, 29, 20);
			frame.getContentPane().add(spinner211);
			
			JSpinner spinner212 = new JSpinner();
			if(flag) {spinner212.setModel(new SpinnerNumberModel(random(), 0, 5, 1));}
			else {spinner212.setModel(new SpinnerNumberModel(0, 0, 5, 1));}
			spinner212.setBounds(350, 100, 29, 20);
			frame.getContentPane().add(spinner212);
			
			JSpinner spinner213 = new JSpinner();
			if(flag) {spinner213.setModel(new SpinnerNumberModel(random(), 0, 5, 1));}
			else {spinner213.setModel(new SpinnerNumberModel(0, 0, 5, 1));}
			spinner213.setBounds(417, 100, 29, 20);
			frame.getContentPane().add(spinner213);
			
			JLabel lblNewLabel_2 = new JLabel("Enter Scores for Team Member Brad");
			lblNewLabel_2.setBounds(10, 136, 233, 25);
			frame.getContentPane().add(lblNewLabel_2);
			
			JSpinner spinner221 = new JSpinner();
			if(flag) {spinner221.setModel(new SpinnerNumberModel(random(), 0, 5, 1));}
			else {spinner221.setModel(new SpinnerNumberModel(0, 0, 5, 1));}
			spinner221.setBounds(272, 136, 29, 20);
			frame.getContentPane().add(spinner221);
			
			JSpinner spinner222 = new JSpinner();
			if(flag) {spinner222.setModel(new SpinnerNumberModel(random(), 0, 5, 1));}
			else {spinner222.setModel(new SpinnerNumberModel(0, 0, 5, 1));}
			spinner222.setBounds(350, 136, 29, 20);
			frame.getContentPane().add(spinner222);
			
			JSpinner spinner223 = new JSpinner();
			if(flag) {spinner223.setModel(new SpinnerNumberModel(random(), 0, 5, 1));}
			else {spinner223.setModel(new SpinnerNumberModel(0, 0, 5, 1));}
			spinner223.setBounds(417, 136, 29, 20);
			frame.getContentPane().add(spinner223);

			JLabel lblNewLabel_3 = new JLabel("Enter Scores for Team Member Will");
			lblNewLabel_3.setBounds(10, 172, 233, 25);
			frame.getContentPane().add(lblNewLabel_3);
		
			JSpinner spinner231 = new JSpinner();
			if(flag) {spinner231.setModel(new SpinnerNumberModel(random(), 0, 5, 1));}
			else {spinner231.setModel(new SpinnerNumberModel(0, 0, 5, 1));}
			spinner231.setBounds(272, 172, 29, 20);
			frame.getContentPane().add(spinner231);
			
			JSpinner spinner232 = new JSpinner();
			if(flag) {spinner232.setModel(new SpinnerNumberModel(random(), 0, 5, 1));}
			else {spinner232.setModel(new SpinnerNumberModel(0, 0, 5, 1));}
			spinner232.setBounds(350, 172, 29, 20);
			frame.getContentPane().add(spinner232);
			
			JSpinner spinner233 = new JSpinner();
			if(flag) {spinner233.setModel(new SpinnerNumberModel(random(), 0, 5, 1));}
			else {spinner233.setModel(new SpinnerNumberModel(0, 0, 5, 1));}
			spinner233.setBounds(417, 172, 29, 20);
			frame.getContentPane().add(spinner233);
			
			JLabel lblNewLabel_4 = new JLabel("Enter Scores for Team Member Jhonny");
			lblNewLabel_4.setBounds(10, 208, 233, 25);
			frame.getContentPane().add(lblNewLabel_4);
		
			JSpinner spinner241 = new JSpinner();
			if(flag) {spinner241.setModel(new SpinnerNumberModel(random(), 0, 5, 1));}
			else {spinner241.setModel(new SpinnerNumberModel(0, 0, 5, 1));}
			spinner241.setBounds(272, 208, 29, 20);
			frame.getContentPane().add(spinner241);
			
			JSpinner spinner242 = new JSpinner();
			if(flag) {spinner242.setModel(new SpinnerNumberModel(random(), 0, 5, 1));}
			else {spinner242.setModel(new SpinnerNumberModel(0, 0, 5, 1));}
			spinner242.setBounds(350, 208, 29, 20);
			frame.getContentPane().add(spinner242);
			
			JSpinner spinner243 = new JSpinner();
			if(flag) {spinner243.setModel(new SpinnerNumberModel(random(), 0, 5, 1));}
			else {spinner243.setModel(new SpinnerNumberModel(0, 0, 5, 1));}
			spinner243.setBounds(417, 208, 29, 20);
			frame.getContentPane().add(spinner243);
			
			JLabel lblNewLabel_5 = new JLabel("Enter Scores for Team Member Matt");
			lblNewLabel_5.setBounds(10, 244, 233, 25);
			frame.getContentPane().add(lblNewLabel_5);
		
			JSpinner spinner251 = new JSpinner();
			if(flag) {spinner251.setModel(new SpinnerNumberModel(random(), 0, 5, 1));}
			else {spinner251.setModel(new SpinnerNumberModel(0, 0, 5, 1));}
			spinner251.setBounds(272, 244, 29, 20);
			frame.getContentPane().add(spinner251);
			
			JSpinner spinner252 = new JSpinner();
			if(flag) {spinner252.setModel(new SpinnerNumberModel(random(), 0, 5, 1));}
			else {spinner252.setModel(new SpinnerNumberModel(0, 0, 5, 1));}
			spinner252.setBounds(350, 244, 29, 20);
			frame.getContentPane().add(spinner252);
			
			JSpinner spinner253 = new JSpinner();
			if(flag) {spinner253.setModel(new SpinnerNumberModel(random(), 0, 5, 1));}
			else {spinner253.setModel(new SpinnerNumberModel(0, 0, 5, 1));}
			spinner253.setBounds(417, 244, 29, 20);
			frame.getContentPane().add(spinner253);
		}
		else
		{
		JLabel lblNewLabel_1 = new JLabel("Enter Scores for Yourself");
		lblNewLabel_1.setBounds(10, 100, 233, 25);
		frame.getContentPane().add(lblNewLabel_1);
	
		JSpinner spinner211 = new JSpinner();
		if(flag) {spinner211.setModel(new SpinnerNumberModel(random(), 0, 5, 1));}
		else {spinner211.setModel(new SpinnerNumberModel(0, 0, 5, 1));}
		spinner211.setBounds(272, 100, 29, 20);
		frame.getContentPane().add(spinner211);
		
		JSpinner spinner212 = new JSpinner();
		if(flag) {spinner212.setModel(new SpinnerNumberModel(random(), 0, 5, 1));}
		else {spinner212.setModel(new SpinnerNumberModel(0, 0, 5, 1));}
		spinner212.setBounds(350, 100, 29, 20);
		frame.getContentPane().add(spinner212);
		
		JSpinner spinner213 = new JSpinner();
		if(flag) {spinner213.setModel(new SpinnerNumberModel(random(), 0, 5, 1));}
		else {spinner213.setModel(new SpinnerNumberModel(0, 0, 5, 1));}
		spinner213.setBounds(417, 100, 29, 20);
		frame.getContentPane().add(spinner213);
		
		JLabel lblNewLabel_2 = new JLabel("Enter Scores for Team Member Brad");
		lblNewLabel_2.setBounds(10, 136, 233, 25);
		frame.getContentPane().add(lblNewLabel_2);
		
		JSpinner spinner221 = new JSpinner();
		if(flag) {spinner221.setModel(new SpinnerNumberModel(random(), 0, 5, 1));}
		else {spinner221.setModel(new SpinnerNumberModel(0, 0, 5, 1));}
		spinner221.setBounds(272, 136, 29, 20);
		frame.getContentPane().add(spinner221);
		
		JSpinner spinner222 = new JSpinner();
		if(flag) {spinner222.setModel(new SpinnerNumberModel(random(), 0, 5, 1));}
		else {spinner222.setModel(new SpinnerNumberModel(0, 0, 5, 1));}
		spinner222.setBounds(350, 136, 29, 20);
		frame.getContentPane().add(spinner222);
		
		JSpinner spinner223 = new JSpinner();
		if(flag) {spinner223.setModel(new SpinnerNumberModel(random(), 0, 5, 1));}
		else {spinner223.setModel(new SpinnerNumberModel(0, 0, 5, 1));}
		spinner223.setBounds(417, 136, 29, 20);
		frame.getContentPane().add(spinner223);

		JLabel lblNewLabel_3 = new JLabel("Enter Scores for Team Member Will");
		lblNewLabel_3.setBounds(10, 172, 233, 25);
		frame.getContentPane().add(lblNewLabel_3);
	
		JSpinner spinner231 = new JSpinner();
		if(flag) {spinner231.setModel(new SpinnerNumberModel(random(), 0, 5, 1));}
		else {spinner231.setModel(new SpinnerNumberModel(0, 0, 5, 1));}
		spinner231.setBounds(272, 172, 29, 20);
		frame.getContentPane().add(spinner231);
		
		JSpinner spinner232 = new JSpinner();
		if(flag) {spinner232.setModel(new SpinnerNumberModel(random(), 0, 5, 1));}
		else {spinner232.setModel(new SpinnerNumberModel(0, 0, 5, 1));}
		spinner232.setBounds(350, 172, 29, 20);
		frame.getContentPane().add(spinner232);
		
		JSpinner spinner233 = new JSpinner();
		if(flag) {spinner233.setModel(new SpinnerNumberModel(random(), 0, 5, 1));}
		else {spinner233.setModel(new SpinnerNumberModel(0, 0, 5, 1));}
		spinner233.setBounds(417, 172, 29, 20);
		frame.getContentPane().add(spinner233);
		
		JLabel lblNewLabel_4 = new JLabel("Enter Scores for Team Member Jhonny");
		lblNewLabel_4.setBounds(10, 208, 233, 25);
		frame.getContentPane().add(lblNewLabel_4);
	
		JSpinner spinner241 = new JSpinner();
		if(flag) {spinner241.setModel(new SpinnerNumberModel(random(), 0, 5, 1));}
		else {spinner241.setModel(new SpinnerNumberModel(0, 0, 5, 1));}
		spinner241.setBounds(272, 208, 29, 20);
		frame.getContentPane().add(spinner241);
		
		JSpinner spinner242 = new JSpinner();
		if(flag) {spinner242.setModel(new SpinnerNumberModel(random(), 0, 5, 1));}
		else {spinner242.setModel(new SpinnerNumberModel(0, 0, 5, 1));}
		spinner242.setBounds(350, 208, 29, 20);
		frame.getContentPane().add(spinner242);
		
		JSpinner spinner243 = new JSpinner();
		if(flag) {spinner243.setModel(new SpinnerNumberModel(random(), 0, 5, 1));}
		else {spinner243.setModel(new SpinnerNumberModel(0, 0, 5, 1));}
		spinner243.setBounds(417, 208, 29, 20);
		frame.getContentPane().add(spinner243);
		
		JLabel lblNewLabel_5 = new JLabel("Enter Scores for Team Member Matt");
		lblNewLabel_5.setBounds(10, 244, 233, 25);
		frame.getContentPane().add(lblNewLabel_5);
	
		JSpinner spinner251 = new JSpinner();
		if(flag) {spinner251.setModel(new SpinnerNumberModel(random(), 0, 5, 1));}
		else {spinner251.setModel(new SpinnerNumberModel(0, 0, 5, 1));}
		spinner251.setBounds(272, 244, 29, 20);
		frame.getContentPane().add(spinner251);
		
		JSpinner spinner252 = new JSpinner();
		if(flag) {spinner252.setModel(new SpinnerNumberModel(random(), 0, 5, 1));}
		else {spinner252.setModel(new SpinnerNumberModel(0, 0, 5, 1));}
		spinner252.setBounds(350, 244, 29, 20);
		frame.getContentPane().add(spinner252);
		
		JSpinner spinner253 = new JSpinner();
		if(flag) {spinner253.setModel(new SpinnerNumberModel(random(), 0, 5, 1));}
		else {spinner253.setModel(new SpinnerNumberModel(0, 0, 5, 1));}
		spinner253.setBounds(417, 244, 29, 20);
		frame.getContentPane().add(spinner253);
		
		JLabel lblNewLabel_6 = new JLabel("Enter Scores for Team Member Tom");
		lblNewLabel_6.setBounds(10, 280, 233, 25);
		frame.getContentPane().add(lblNewLabel_6);
		
		JSpinner spinner261 = new JSpinner();
		if(flag) {spinner261.setModel(new SpinnerNumberModel(random(), 0, 5, 1));}
		else {spinner261.setModel(new SpinnerNumberModel(0, 0, 5, 1));}
		spinner261.setBounds(272, 280, 29, 20);
		frame.getContentPane().add(spinner261);
		
		JSpinner spinner262 = new JSpinner();
		if(flag) {spinner262.setModel(new SpinnerNumberModel(random(), 0, 5, 1));}
		else {spinner262.setModel(new SpinnerNumberModel(0, 0, 5, 1));}
		spinner262.setBounds(350, 280, 29, 20);
		frame.getContentPane().add(spinner262);
		
		JSpinner spinner263 = new JSpinner();
		if(flag) {spinner263.setModel(new SpinnerNumberModel(random(), 0, 5, 1));}
		else {spinner263.setModel(new SpinnerNumberModel(0, 0, 5, 1));}
		spinner263.setBounds(417, 280, 29, 20);
		frame.getContentPane().add(spinner263);
		}
		
		JButton btnBack = new JButton("BACK");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Frame1 link = new Frame1();
				link.frame.setVisible(true);
								
			}
		});
		btnBack.setBounds(60, 325, 156, 31);
		frame.getContentPane().add(btnBack);
		
		JButton btnSubmit = new JButton("SUBMIT");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Frame3 link = new Frame3();
				link.frame.setVisible(true);
								
			}
		});
		btnSubmit.setBounds(268, 325, 156, 31);
		frame.getContentPane().add(btnSubmit);
		
	}    
}


