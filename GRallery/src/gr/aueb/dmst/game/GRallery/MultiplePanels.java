import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.EtchedBorder;

public class MultiplePanels2 implements ActionListener{


	JFrame frame = new JFrame("GRallery");
	JButton[][] b = new JButton[10][4];
	JButton NextQuestion = new JButton("Next Question");
	
    //create 3 different panels to place our labels (image-text-buttons)
	JPanel panel1 = new JPanel(); 
    JPanel panel2 = new JPanel();
    JPanel panel3  = new JPanel();
    
	String CorrectAnswers [] = new String[10];
	String[][] answers = new String[10][4];
	String[] questions = new String[10];
	ArrayList<ImageIcon> images = new ArrayList<ImageIcon>();
	
	int question_number;
	
	public void ConstructImages() {
		images.add(new ImageIcon(getClass().getResource("/faros.jpg")));
		images.add(new ImageIcon(getClass().getResource("/delfoi.jpg")));
		images.add(new ImageIcon(getClass().getResource("/oreli.jpg")));
	}
	
	public void ConstructAnswers() {
		for(int i = 0; i<questions.length ; i++) {
			answers[i][0] = "answer1";
			answers[i][1] = "answer2";
			answers[i][2] = "answer3";
			answers[i][3] = "answer4";
		}
	}
	
	public void ConstructQuestions() {
		questions[0] = "Ï «ÖÜñïò» åéêÜæåôáé ðùò áðïôåëåß ìßá áðåéêüíéóç åíüò ðñáãìáôéêïý öÜñïõ óå êÜðïéï êõêëáäßôéêï\n íçóß ìå óêïðü óå óõíäõáóìü ìå Üëëá Ýñãá íá áíáäåé÷èåß ôï åëëçíéêü êáëïêáßñé.Óå ðïéïí ãíùóôü\n ¸ëëçíá æùãñÜöï ìå êáôáãùãÞ áðü ôçí ÔÞíï áíÞêåé ï óõãêåêñéìÝíïò ðßíáêáò;";
		questions[1] = "Ç óýíèåóç ôïõ ðßíáêá äéáìïñöþíåôáé óôç âÜóç ôçò áíôßèåóçò öùôåéíïý êáé óêïôåéíïý êáé óôï ÷ùñéóìü\n ôçò åðéöÜíåéáò óå ìåãÜëåò ÷ñùìáôéêÝò åíüôçôåò ìå ôá ÷ñþìáôá íá åíáëëÜóóïíôáé áðü ðïñôïêáëß êáé\n êåñáìéäß óå áíïé÷ôü ãêñßæï, ãáëÜæéï êáé ðñÜóéíï. Ôá Ýíôïíá êáé öùôåéíÜ ÷ñþìáôá ðïõ ÷ñçóéìïðïéåß\n ï Êùíóôáíôßíïò ÌáëÝáò, ôüóï óôï óõãêåêñéìÝíï üóï êáé óå Üëëá Ýñãá ôïõ, êáé ïé ðëáôéÝò ðéíåëéÝò\n ôïõ áðïôÝëåóáí áöïñìÞ ãéá íá ÷áñáêôçñéóôïýí ôá Ýñãá ôïõ áðü ôïõò óõíôçñçôéêïýò\n êñéôéêïýò åêåßíçò ôçò åðï÷Þò ùò:\n ";
		questions[2] = "Ç éóôïñßá ðßóù áðü ôïí óõãêåêñéìÝíï ðßíáêá üðùò áöçãåßôáé ï ßäéïò ï æùãñÜöïò, ÐåñéêëÞò ÂõæÜíôéïò, åßíáé ç åîÞò:\n“H ìåãáëýôåñÞ ìïõ ÷áñÜ Þôáí üôáí ç Oñåëß ìïõ Ýëåãå:«Allons nous coucher» êáé ì’ Ýðáéñíå áðü ôï ÷Ýñé êáé ðçãáßíáìå\nãéá ýðíï óôçí êñåâáôïêÜìáñÞ ìáò. ¢íáâå Ýíá êåñß óå Ýíá ìðñïýôæéíï óáìíôÜíé åðÜíù óôïí êïìü.Åãþ ãñÞãïñá\nãñÞãïñá ãäõíüìïõíá êáé öüñáãá ôç ìáêñéÜ ðïõêáìßóá êé Ýìðáéíá óôï êñåâÜôé êé Ýêáíá ðùò êïéìüìïõíá, åíþ ìå ôï\nÝíá ìÜôé áíïé÷ôü ðáñáêïëïõèïýóá ôï ãäýóéìï ôçò Oñåëß ìðñïóôÜ óôïí êáèñÝöôç êáé ôç èáýìáæá. H Oñåëß Þôáíå \nêáëïöôéáãìÝíç, øçëÞ, ìå Üöèïíá êáóôáíÜ ìáëëéÜ. ÂÝâáéç ðùò åãþ êïéìÜìáé, ãäõíüôáíå óéãÜ óéãÜ, ãõñßæïíôÜò ìïõ\n ôçí ðëÜôç. Ôá äéÜöïñá íôáíôåëùôÜ ìåóïöüñéá, ìåãÜëá ëåðôÜ åóþñïõ÷á ðåñáóìÝíá ìå ñïæ êïñäÝëåò,ôçò Ýðåöôáí\n óôá ùñáßá ôçò ðüäéá, êáé ãõìíÞ åíôåëþò óêïýðéæå ìå ìéá êñÝìá ôï ðñüóùðü ôçò óêõììÝíç ðñïò ôïí êáèñÝöôç. Ìá\nåãþ äåí Ýâëåðá ìïíÜ÷á ôç ñÜ÷ç ôçò ìÝóá óôïí êáèñÝöôç äéÝêñéíá êáé ôï óöé÷ôü êáé óôÝñéï óôÞèïò, ðïõ ðïëëÝò öïñÝò\nôï êñáôïýóå ìå ôá ùñáßá ôçò ÷Ýñéá êáé ôï êáìÜñùíå êáé ç ßäéá.Óôï ôÝëïò öïñïýóå ìéá ìáêñéÜ íõ÷ôéêéÜ ìå êåíôÞìáôá \nóôï óôÞèïò êáé óôéò Üêñåò ôùí ìáíéêéþí, ðëçóßáæå ôï êåñß, ôï Ýóâçíå, êé åñ÷üôáíå óôï ìéêôü êñåâÜôé ìïõ íá ìå\n óêåðÜóåé êáëÜ.¸óêõâå êáé ìå öéëïýóå óôï ìÝôùðï. Åãþ, öõóéêÜ,Ýêáíá ðùò êïéìüìïõíá, êáé ïýôå áíÝðíåá, ãéáôß\n öïâüìïõíá ìÞðùò áêïýóåé ôçí êáñäéÜ ìïõ ðïõ ÷ôõðïýóå äõíáôÜ…” Ðïéïò ðéóôåýåôå üôé åßíáé ï ôßôëïò ôïõ Ýñãïõ;";
	}
	
	public void CorrectAnswers() {
		CorrectAnswers[0] = answers[0][1];
		CorrectAnswers[1] = answers[1][1];
		CorrectAnswers[2] = answers[2][0];
	}
	
	
	

	MultiplePanels2(){
		
		
			ConstructQuestions();
    		ConstructImages();
    		ConstructAnswers();
    		CorrectAnswers();
    		
    		
	}
	
	public void setPanels(){ 
			panel1.setBackground(Color.white);
    		panel2.setBackground(Color.white);
    		panel3.setBackground(Color.white);
    		
    		
	}
		
	
	public void setAllFrames() {
    	//disable button NextQuestion so as to the user not be able to press it unless they first answer existed question
		NextQuestion.setEnabled(false);
		//randomly choose a question 
		Random rand = new Random();
    		question_number = rand.nextInt(3);
    
		
		
		//add image to panel1
		JLabel imageLabel = new JLabel(images.get(question_number));
		panel1.add(imageLabel);
		
		//add question to label3
		JTextArea questionLabel = new JTextArea(10,65);
		questionLabel.setEditable(false);
		questionLabel.setSize(200, 200);
		questionLabel.setFont(new Font(null,Font.LAYOUT_LEFT_TO_RIGHT,20));
		questionLabel.setText(questions[question_number]);
		panel3.add(questionLabel,BorderLayout.BEFORE_FIRST_LINE);
		
		//add message that informs the player if their answer was correct or wrong to panel3
		JLabel messageLabel = new JLabel();
    		messageLabel.setSize(100, 100);
		messageLabel.setFont(new Font(null,Font.BOLD,25));
		messageLabel.setHorizontalTextPosition(JLabel.CENTER);
		messageLabel.setVerticalTextPosition(JLabel.CENTER);
		panel3.add(messageLabel,BorderLayout.AFTER_LINE_ENDS);
		//add a scroll pane to panel3 
		JScrollPane scroll =new JScrollPane(questionLabel,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		panel3.add(scroll);
		
		//create buttons which contain 4 suggested answers
		b[question_number][0] = new JButton(answers[question_number][0]);
		b[question_number][0].setBounds(10,40,160,40);
		b[question_number][1] = new JButton(answers[question_number][1]);
		b[question_number][1].setBounds(10,40,160,40);
		b[question_number][2] = new JButton(answers[question_number][2]);
		b[question_number][2].setBounds(10,40,160,40);
		b[question_number][3] = new JButton(answers[question_number][3]);
		b[question_number][3].setBounds(10,40,160,40);
		
		for(int answer_number=0; answer_number<4; answer_number++) {
			//add buttons with suggested answers to panel2
			b[question_number][answer_number].setFocusable(false);
			panel2.add(b[question_number][answer_number]); 
			b[question_number][answer_number].setSize(new Dimension(500, 50));
			b[question_number][answer_number].setLocation(100,100);
			b[question_number][answer_number].setFont(new Font(null,Font.TRUETYPE_FONT,22));
			b[question_number][answer_number].setBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED));
	
			b[question_number][answer_number].addActionListener(new ActionListener() {
	        	public void actionPerformed(ActionEvent e) {
	                if(e.getSource() == b[question_number][0] ) {
	                	//since a button is pressed, player can not change their answer and their only choice is to continue with NextQuestion
	                	b[question_number][1].setEnabled(false);
	                	b[question_number][2].setEnabled(false);
	                	b[question_number][3].setEnabled(false);
	                	NextQuestion.setEnabled(true);
	                	
	                	if((b[question_number][0].getText()) == CorrectAnswers[question_number]) {
	                		//if they answer correct, pressed button turns green and message "CORRECT" shows up
	                		messageLabel.setForeground(Color.green);
					messageLabel.setText("CORRECT");
					b[question_number][0].setBackground(Color.GREEN);
	                	}else {
	                		//if they answer wrong, pressed button turns red and message "WRONG" shows up
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
			//add button NextQuestion to panel2 
			NextQuestion.setBounds(0,500,100,100);
			NextQuestion.setBackground(Color.BLACK);
			NextQuestion.setForeground(Color.WHITE);
			NextQuestion.setFont(new Font(null,Font.PLAIN,12));
			panel2.add(NextQuestion, BorderLayout.SOUTH);

			NextQuestion.addActionListener(this);
				
			
			
			//add panels to frame
			frame.add(panel1,BorderLayout.BEFORE_FIRST_LINE);
			frame.add(panel2,BorderLayout.PAGE_END);
			frame.add(panel3,BorderLayout.CENTER);
			frame.setSize(1200,1000);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setVisible(true);

			
			
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource() == NextQuestion) {
			
			//if NextQuestion button is pressed a new frame shows up with different question
			panel1.setVisible(false);
			panel2.setVisible(false);
			panel3.setVisible(false);
			

			 panel1 = new JPanel(); 
		     panel2 = new JPanel();
		     panel3  = new JPanel();
		     
		     setPanels();
		     setAllFrames();
		
		}


	
	}
	
}
