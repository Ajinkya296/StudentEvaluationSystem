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
import java.util.*;
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
	public int value;
	
	JSpinner spinner211 = new JSpinner();
	JSpinner spinner212 = new JSpinner();
	JSpinner spinner213 = new JSpinner();
	JSpinner spinner221 = new JSpinner();
	JSpinner spinner222 = new JSpinner();
	JSpinner spinner223 = new JSpinner();
	JSpinner spinner231 = new JSpinner();
	JSpinner spinner232 = new JSpinner();
	JSpinner spinner233 = new JSpinner();
	JSpinner spinner241 = new JSpinner();
	JSpinner spinner242 = new JSpinner();
	JSpinner spinner243 = new JSpinner();
	JSpinner spinner251 = new JSpinner();
	JSpinner spinner252 = new JSpinner();
	JSpinner spinner253 = new JSpinner();
	JSpinner spinner261 = new JSpinner();
	JSpinner spinner262 = new JSpinner();
	JSpinner spinner263 = new JSpinner();

	ArrayList<Integer> list = new ArrayList<Integer>();
	
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
		
		list.add(0);
		list.add(0);
		list.add(0);
		list.add(0);
		list.add(0);
		list.add(0);
		list.add(0);
		list.add(0);
		list.add(0);
		list.add(0);
		list.add(0);
		list.add(0);
		list.add(0);
		list.add(0);
		list.add(0);
		list.add(0);
		list.add(0);
		list.add(0);
		
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
		
		while(true)
		{
		JLabel lblNewLabel_1 = new JLabel("Enter Scores for Yourself");
		lblNewLabel_1.setBounds(10, 100, 233, 25);
		frame.getContentPane().add(lblNewLabel_1);
		
		if(flag) {spinner211.setModel(new SpinnerNumberModel(random(), 0, 5, 1));}
		else {spinner211.setModel(new SpinnerNumberModel(0, 0, 5, 1));}
		spinner211.setBounds(272, 100, 29, 20);
		frame.getContentPane().add(spinner211);
		spinner211.setEditor(new JSpinner.DefaultEditor(spinner211));
		
		if(flag) {spinner212.setModel(new SpinnerNumberModel(random(), 0, 5, 1));}
		else {spinner212.setModel(new SpinnerNumberModel(0, 0, 5, 1));}
		spinner212.setBounds(350, 100, 29, 20);
		frame.getContentPane().add(spinner212);
		spinner212.setEditor(new JSpinner.DefaultEditor(spinner212));
		
		if(flag) {spinner213.setModel(new SpinnerNumberModel(random(), 0, 5, 1));}
		else {spinner213.setModel(new SpinnerNumberModel(0, 0, 5, 1));}
		spinner213.setBounds(417, 100, 29, 20);
		frame.getContentPane().add(spinner213);
		spinner213.setEditor(new JSpinner.DefaultEditor(spinner213));
		
		JLabel lblNewLabel_2 = new JLabel("Enter Scores for Team Member Brad");
		lblNewLabel_2.setBounds(10, 136, 233, 25);
		frame.getContentPane().add(lblNewLabel_2);
		
		if(flag) {spinner221.setModel(new SpinnerNumberModel(random(), 0, 5, 1));}
		else {spinner221.setModel(new SpinnerNumberModel(0, 0, 5, 1));}
		spinner221.setBounds(272, 136, 29, 20);
		frame.getContentPane().add(spinner221);
		spinner221.setEditor(new JSpinner.DefaultEditor(spinner221));
		
		if(flag) {spinner222.setModel(new SpinnerNumberModel(random(), 0, 5, 1));}
		else {spinner222.setModel(new SpinnerNumberModel(0, 0, 5, 1));}
		spinner222.setBounds(350, 136, 29, 20);
		frame.getContentPane().add(spinner222);
		spinner222.setEditor(new JSpinner.DefaultEditor(spinner222));
		
		if(flag) {spinner223.setModel(new SpinnerNumberModel(random(), 0, 5, 1));}
		else {spinner223.setModel(new SpinnerNumberModel(0, 0, 5, 1));}
		spinner223.setBounds(417, 136, 29, 20);
		frame.getContentPane().add(spinner223);
		spinner223.setEditor(new JSpinner.DefaultEditor(spinner223));
		
		JLabel lblNewLabel_3 = new JLabel("Enter Scores for Team Member Will");
		lblNewLabel_3.setBounds(10, 172, 233, 25);
		frame.getContentPane().add(lblNewLabel_3);
	
		if(flag) {spinner231.setModel(new SpinnerNumberModel(random(), 0, 5, 1));}
		else {spinner231.setModel(new SpinnerNumberModel(0, 0, 5, 1));}
		spinner231.setBounds(272, 172, 29, 20);
		frame.getContentPane().add(spinner231);
		spinner231.setEditor(new JSpinner.DefaultEditor(spinner231));
		
		if(flag) {spinner232.setModel(new SpinnerNumberModel(random(), 0, 5, 1));}
		else {spinner232.setModel(new SpinnerNumberModel(0, 0, 5, 1));}
		spinner232.setBounds(350, 172, 29, 20);
		frame.getContentPane().add(spinner232);
		spinner232.setEditor(new JSpinner.DefaultEditor(spinner232));
		
		if(flag) {spinner233.setModel(new SpinnerNumberModel(random(), 0, 5, 1));}
		else {spinner233.setModel(new SpinnerNumberModel(0, 0, 5, 1));}
		spinner233.setBounds(417, 172, 29, 20);
		frame.getContentPane().add(spinner233);
		spinner233.setEditor(new JSpinner.DefaultEditor(spinner233));
		
		if(team==3) {break;}
		
		JLabel lblNewLabel_4 = new JLabel("Enter Scores for Team Member Jhonny");
		lblNewLabel_4.setBounds(10, 208, 233, 25);
		frame.getContentPane().add(lblNewLabel_4);

		if(flag) {spinner241.setModel(new SpinnerNumberModel(random(), 0, 5, 1));}
		else {spinner241.setModel(new SpinnerNumberModel(0, 0, 5, 1));}
		spinner241.setBounds(272, 208, 29, 20);
		frame.getContentPane().add(spinner241);
		spinner241.setEditor(new JSpinner.DefaultEditor(spinner241));
		
		if(flag) {spinner242.setModel(new SpinnerNumberModel(random(), 0, 5, 1));}
		else {spinner242.setModel(new SpinnerNumberModel(0, 0, 5, 1));}
		spinner242.setBounds(350, 208, 29, 20);
		frame.getContentPane().add(spinner242);
		spinner242.setEditor(new JSpinner.DefaultEditor(spinner242));
		
		if(flag) {spinner243.setModel(new SpinnerNumberModel(random(), 0, 5, 1));}
		else {spinner243.setModel(new SpinnerNumberModel(0, 0, 5, 1));}
		spinner243.setBounds(417, 208, 29, 20);
		frame.getContentPane().add(spinner243);
		spinner243.setEditor(new JSpinner.DefaultEditor(spinner243));
		
		if(team==4) {break;}
		
		JLabel lblNewLabel_5 = new JLabel("Enter Scores for Team Member Matt");
		lblNewLabel_5.setBounds(10, 244, 233, 25);
		frame.getContentPane().add(lblNewLabel_5);

		if(flag) {spinner251.setModel(new SpinnerNumberModel(random(), 0, 5, 1));}
		else {spinner251.setModel(new SpinnerNumberModel(0, 0, 5, 1));}
		spinner251.setBounds(272, 244, 29, 20);
		frame.getContentPane().add(spinner251);
		spinner251.setEditor(new JSpinner.DefaultEditor(spinner251));

		if(flag) {spinner252.setModel(new SpinnerNumberModel(random(), 0, 5, 1));}
		else {spinner252.setModel(new SpinnerNumberModel(0, 0, 5, 1));}
		spinner252.setBounds(350, 244, 29, 20);
		frame.getContentPane().add(spinner252);
		spinner252.setEditor(new JSpinner.DefaultEditor(spinner252));
		
		if(flag) {spinner253.setModel(new SpinnerNumberModel(random(), 0, 5, 1));}
		else {spinner253.setModel(new SpinnerNumberModel(0, 0, 5, 1));}
		spinner253.setBounds(417, 244, 29, 20);
		frame.getContentPane().add(spinner253);
		spinner253.setEditor(new JSpinner.DefaultEditor(spinner253));
		
		if(team==5) {break;}
		
		JLabel lblNewLabel_6 = new JLabel("Enter Scores for Team Member Tom");
		lblNewLabel_6.setBounds(10, 280, 233, 25);
		frame.getContentPane().add(lblNewLabel_6);
		
		if(flag) {spinner261.setModel(new SpinnerNumberModel(random(), 0, 5, 1));}
		else {spinner261.setModel(new SpinnerNumberModel(0, 0, 5, 1));}
		spinner261.setBounds(272, 280, 29, 20);
		frame.getContentPane().add(spinner261);
		spinner261.setEditor(new JSpinner.DefaultEditor(spinner261));
		
		if(flag) {spinner262.setModel(new SpinnerNumberModel(random(), 0, 5, 1));}
		else {spinner262.setModel(new SpinnerNumberModel(0, 0, 5, 1));}
		spinner262.setBounds(350, 280, 29, 20);
		frame.getContentPane().add(spinner262);
		spinner262.setEditor(new JSpinner.DefaultEditor(spinner262));
		
		if(flag) {spinner263.setModel(new SpinnerNumberModel(random(), 0, 5, 1));}
		else {spinner263.setModel(new SpinnerNumberModel(0, 0, 5, 1));}
		spinner263.setBounds(417, 280, 29, 20);
		frame.getContentPane().add(spinner263);
		spinner263.setEditor(new JSpinner.DefaultEditor(spinner263));
		
		break;
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

				list.set(0,(int) spinner211.getValue());
				list.set(1,(int) spinner212.getValue());
				list.set(2,(int) spinner213.getValue());
				list.set(3,(int) spinner221.getValue());
				list.set(4,(int) spinner222.getValue());
				list.set(5,(int) spinner223.getValue());
				list.set(6,(int) spinner231.getValue());
				list.set(7,(int) spinner232.getValue());
				list.set(8,(int) spinner233.getValue());
				list.set(9,(int) spinner241.getValue());
				list.set(10,(int) spinner242.getValue());
				list.set(11,(int) spinner243.getValue());
				list.set(12,(int) spinner251.getValue());
				list.set(13,(int) spinner252.getValue());
				list.set(14,(int) spinner253.getValue());
				list.set(15,(int) spinner261.getValue());
				list.set(16,(int) spinner262.getValue());
				list.set(17,(int) spinner263.getValue());
				
				Frame3 link = new Frame3(team,flag,list);
				link.frame.setVisible(true);
								
			}
		});
		btnSubmit.setBounds(268, 325, 156, 31);
		frame.getContentPane().add(btnSubmit);
		
	}    
}


