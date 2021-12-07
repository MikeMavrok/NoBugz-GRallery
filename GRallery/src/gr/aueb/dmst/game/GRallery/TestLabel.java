package gr.aueb.dmst.game.GRallery;
import java.awt.*;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.EtchedBorder;

import java.util.Random;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.net.URL;

public class TestLabel extends JPanel {
	
	static JFrame frame;
	JPanel panel;
	JPanel panel1;
	String[] questions = new String[10];
	String[][] answers = new String[10][4];
	ImageIcon [] images = new ImageIcon[10];
	JButton NextQuestion = new JButton("Next Question");
	JButton[][] b = new JButton[10][4];
	String CorrectAnswers [] = new String[10];
	
	public void ConstructQuestions() {
		questions[0] = "giati o zwgrafos?";
		questions[1] = "poia texniki xrisimopoiei?";
		questions[2] = "poia periodo filotexnithike?";
	}
	
	public void ConstructImages() {
		images[0] = new ImageIcon(getClass().getResource("/faros.jpg"));
		images[1] = new ImageIcon(getClass().getResource("/delfoi.jpg"));
		images[2] = new ImageIcon(getClass().getResource("/oreli.jpg"));
	}
	
	public void ConstructAnswers() {
		for(int i = 0; i<questions.length ; i++) {
			answers[i][0] = "answer1";
			answers[i][1] = "answer2";
			answers[i][2] = "answer3";
			answers[i][3] = "answer4";
		}
	}
	
	public void CorrectAnswers() {
		CorrectAnswers[0] = answers[0][1];
		CorrectAnswers[1] = answers[1][1];
		CorrectAnswers[2] = answers[2][0];
	}
	
		
	
    public TestLabel() {
    	
    	ConstructQuestions();
    	ConstructImages();
    	ConstructAnswers();
    	CorrectAnswers();
    	
    	Random rand = new Random();
    	int question_number = rand.nextInt(3);
    	
    	//den mporei o xristis na proxwrisei stin epomeni erwtisi xwris na apantisei auti
    	NextQuestion.setEnabled(false);
    	
    	//create label that contains a message
	JLabel messageLabel = new JLabel();
    	messageLabel.setSize(100, 100);
    	messageLabel.setLocation(10, 15);
    	messageLabel.setBounds(2000,200,10,10);
	messageLabel.setFont(new Font(null,Font.ITALIC,25));
	messageLabel.setHorizontalTextPosition(JLabel.CENTER);
	messageLabel.setVerticalTextPosition(JLabel.CENTER);
	//messageLabel.setLayout(null);
	//add(messageLabel);
	//messageLabel.setVisible(true);
		
	panel1 =new JPanel(); 
    	panel1.add(messageLabel);
    	panel1.setBounds(-100,100,-220,20);
    	add(panel1);
		
    	//create label than contains an image
	JLabel imageLabel = new JLabel(images[question_number]);
	imageLabel.setSize(100,100);
	imageLabel.setBorder(BorderFactory.createLineBorder(Color.black));
	imageLabel.setVerticalAlignment(JLabel.BOTTOM);
	imageLabel.setHorizontalAlignment(JLabel.LEFT);
	imageLabel.setBounds(0,0,100,100);
	imageLabel.setLocation(200,200);
	//add(imageLabel);
		
	panel =new JPanel(); 
    	panel.add(imageLabel);
    	panel.setBounds(0,0,20,20);
    	add(panel);
	
    	//create label that contains text(question for user)
	JTextArea textLabel = new JTextArea("Test ", 10,10);
	textLabel.setSize(1000,5000);
	textLabel.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
	textLabel.setBounds(10,10,20,20);
	textLabel.setBackground(Color.WHITE);
	textLabel.setText(questions[question_number]);
	textLabel.setFont(new Font(null, Font.PLAIN, 18));
	textLabel.setVisible(true);
	add(textLabel);  
		
	//create buttons with suggested answers
	b[question_number][0]= new JButton(answers[question_number][0]);
	b[question_number][0].setBounds(10,40,160,40);
		
	b[question_number][1] = new JButton(answers[question_number][1]);
	b[question_number][1].setBounds(10,400,160,40);
		
	b[question_number][2] = new JButton(answers[question_number][2]);
	b[question_number][2].setBounds(100,200,100,200);
		
	b[question_number][3] = new JButton(answers[question_number][3]);
	b[question_number][3].setBounds(100,200,100,200);

		 
	for(int answer_number=0; answer_number<4; answer_number++) {
			
		//b[question_number][answer_number] = new JButton(answers[question_number][answer_number]);
		//b[question_number][answer_number].setBounds(100,200,100,200);
		//setLayout(new GridLayout(2,2,20,25));
			
		b[question_number][answer_number].setFocusable(false);
		add(b[question_number][answer_number]); 
			
		b[question_number][answer_number].setSize(new Dimension(500, 50));
		b[question_number][answer_number].setLocation(100,100);
		b[question_number][answer_number].setFont(new Font(null,Font.ITALIC,18));
		b[question_number][answer_number].setBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED));
		//b[question_number][answer_number].setBorder(BorderFactory.createRaisedBevelBorder());
		//b[question_number][answer_number].setLayout(null);
			
			b[question_number][answer_number].addActionListener(new ActionListener() {
	        	public void actionPerformed(ActionEvent e) {
	                if(e.getSource() == b[question_number][0] ) {
	                	//den mporei o xristis na allaksei tin apantisi tou kai monadiki tou epilogi na proxwrisei se epomeni erwtisi
	                	b[question_number][1].setEnabled(false);
	                	b[question_number][2].setEnabled(false);
	                	b[question_number][3].setEnabled(false);
	                	NextQuestion.setEnabled(true);
	                	
	                	if((b[question_number][0].getText()) == CorrectAnswers[question_number]) {
	                		//an apantisei swsta to koumpi pou patise ginetai prasino kai emfanizetai minuma CORRECT
	                		messageLabel.setForeground(Color.green);
					messageLabel.setText("CORRECT");
					b[question_number][0].setBackground(Color.GREEN);
	                	}else {
	                		//an apantisei lathos to koumpi pou patise ginetai kokkino kai emfanizetai minuma WRONG
	                		messageLabel.setForeground(Color.red);
	                		messageLabel.setText("WRONG");
	                		b[question_number][0].setBackground(Color.RED);
	                	}
	                }else if(e.getSource() == b[question_number][1] ) {
	                	
	                	b[question_number][0].setEnabled(false);
	                	b[question_number][2].setEnabled(false);
	                	b[question_number][3].setEnabled(false);
	                	NextQuestion.setEnabled(true);
	                	
	                	if(b[question_number][1].getText() == CorrectAnswers[question_number]) {
	                		messageLabel.setForeground(Color.green);
	                		messageLabel.setText("CORRECT");
	                		b[question_number][1].setBackground(Color.GREEN);
	                	}else {
	                		messageLabel.setForeground(Color.red);
	                		messageLabel.setText("WRONG");
	                		b[question_number][1].setBackground(Color.RED);
	                	}
	                }else if(e.getSource() == b[question_number][2] ) {
	                	
	                	b[question_number][0].setEnabled(false);
	                	b[question_number][1].setEnabled(false);
	                	b[question_number][3].setEnabled(false);
	                	NextQuestion.setEnabled(true);
	                	
	                	if(b[question_number][2].getText() == CorrectAnswers[question_number]) {
	                		messageLabel.setForeground(Color.green);
	                		messageLabel.setText("CORRECT");
	                		b[question_number][2].setBackground(Color.GREEN);
	                	}else {
	                		messageLabel.setForeground(Color.red);
	                		messageLabel.setText("WRONG");
	                		b[question_number][2].setBackground(Color.RED);
	                	}
	                }else if(e.getSource() == b[question_number][3] ) {
	                	
	                	b[question_number][0].setEnabled(false);
	                	b[question_number][1].setEnabled(false);
	                	b[question_number][2].setEnabled(false);
	                	NextQuestion.setEnabled(true);
	                	
	                	if(b[question_number][3].getText() == CorrectAnswers[question_number]) {
	                		messageLabel.setForeground(Color.green);
	                		messageLabel.setText("CORRECT");
	                		b[question_number][3].setBackground(Color.GREEN);
	                	}else {
	                		messageLabel.setForeground(Color.red);
	                		messageLabel.setText("WRONG");
	                		b[question_number][3].setBackground(Color.RED);
	                	}
	                }
	        	}
	        	});
			}
		
	NextQuestion.setBounds(0,500,100,100);
	NextQuestion.setBackground(Color.BLACK);//diaforetiko to koumpi NextQuestion gia na ksexwrizei apo auta twn apantisewn
	NextQuestion.setForeground(Color.WHITE);
	NextQuestion.setFont(new Font(null,Font.PLAIN,12));
	add(NextQuestion);
	//add(NextQuestion, BorderLayout.NORTH);

	NextQuestion.addActionListener(new ActionListener() {
	    public void actionPerformed(ActionEvent e) {
	    	if(e.getSource()==NextQuestion) {
	    		//an o xristis epileksei NextQuestion kleinei auto to parathuro kai anoigei neo me alli erwtisi 
	    		frame.dispose();
	    		createAndShowUI();
	    	}
	    }
	 });
    }

	public static void createAndShowUI(){	
		//create a new window
        	frame = new JFrame("GRallery");
       		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        	frame.add( new TestLabel());
        	frame.setSize(1200,1200);
        	frame.setLocationRelativeTo( null );
        	frame.setVisible( true );
    	}

	/**public static void main(String[] args) {
      		EventQueue.invokeLater(new Runnable()
      		{
			public void run()
           	 {
               	 	createAndShowUI();
           	 }
        	});
    	}**/
	
}
