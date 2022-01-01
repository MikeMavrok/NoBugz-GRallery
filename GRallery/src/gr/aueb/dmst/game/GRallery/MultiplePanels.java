import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;
import java.util.Iterator;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.EtchedBorder;

public class MultiplePanels implements ActionListener{



	JFrame frame = new JFrame("GRallery");
	JButton[][] b = new JButton[10][4];
	JButton NextQuestion = new JButton("Next Question");
	ArrayList <String> CorrectAnswers  = new ArrayList<String>();
	String[][] answers = new String[10][4];
	ArrayList<String> questions = new ArrayList<String>();
	ArrayList<ImageIcon> images = new ArrayList<ImageIcon>();
	int question_number = 0;


	public void ConstructImages() {
		images.add(new ImageIcon(getClass().getResource("/faros.jpg")));
		images.add(new ImageIcon(getClass().getResource("/delfoi.jpg")));
		images.add(new ImageIcon(getClass().getResource("/oreli.jpg")));
	}

	public void ConstructAnswers() {
		for(int i = 0; i<questions.size() ; i++) {
			answers[i][0] = "answer1";
			answers[i][1] = "answer2";
			answers[i][2] = "answer3";
			answers[i][3] = "answer4";
		}
	}
/* adding questions in the ArrayList named questions,the empty cells will be filled if this is running properly*/
	public void ConstructQuestions() {
		questions.add("What other famous painter do you know that the one depicted reminds you of?");
		questions.add("He is one of the greatest British poets and remains popular even today.His characteristic work is the poem <<Don Juan>>. What's his name;");
		questions.add("Which evangelical scene is depicted in the picture above?");
		questions.add("The above painting by Nikolaos Othoneos refers to a specific time of year.Based on the colors he uses and the natural elements he presents, what do you think it is?");
		questions.add("Looking carefully at the details of the painting,which Cycladic island do you think is depicted?");
		questions.add("What is it called in painting and other arts, the apt depiction of a person,but also of the personality, emotions and psychic world of that person as perceived by the creator?");
		questions.add("Which ancient temple is depicted in the painting?");
		questions.add("This emblematic element refers to the occupation of the depicted.Based on this information, what do you think was Psarianos' profession?");
		questions.add("What kind of event is represented in this painting?");
		questions.add("Based on the clothes of the person depicted and the pipe he is holding,what would you say is his origin?");
		questions.add("What is the name of the depiction of the marine theme in the visual arts?");
		questions.add("Who wrote the poem <<The Destruction of the Fishermen>> from which Nikolaos Gyzis was inspired to create the Glory of the <<Fishermen>>?");
		questions.add("Greek ___ is inspired by the manners and customs of the Greek people,as is the case with the corresponding literature of the time. It is no coincidencethat at the same time the sciences of Folklore and Linguistics were created,while at the same time the controversy over the value of the vernacular began.");
		questions.add("Which celebration about this painting is described in the text?");
		questions.add("A work by Dimitrios Galanis that was created around 1924.What do you think is its title?");
		questions.add("What is the name of the custom depicted in this work?");
		questions.add("What do you think the gentleman on the board is doing?");
		questions.add("Also known as <<the Mountain of Centaurs>>. It is located very close to the city of Volos and uniquely combines the mountain with the sea. It consists of many small villagesand is famous for its unique architecture. What is the name of this place?");
		/*questions.add();
		questions.add();
		questions.add();
		questions.add();
		questions.add();
		questions.add();
		questions.add();
		questions.add();
		questions.add();
		questions.add();
		questions.add();
		questions.add();
		questions.add();
		questions.add();
		questions.add();
		questions.add();
		questions.add();
		questions.add();
		questions.add();
		questions.add();
		questions.add();
		questions.add();
		questions.add();
		questions.add();
		questions.add();
		questions.add();
		questions.add();
		questions.add();
		questions.add();
		questions.add();
		questions.add();
		questions.add();
		questions.add();
		questions.add();
		questions.add();
		questions.add();
		questions.add();
		questions.add();
		questions.add();
		questions.add();
		questions.add();
		questions.add();
		questions.add();
		questions.add();
		questions.add();
		questions.add();
		questions.add();
		questions.add();
		questions.add();
		questions.add();
		questions.add();
		questions.add();
		questions.add();
		questions.add();
		questions.add();
		questions.add();
		questions.add();
		questions.add();
		questions.add();
		questions.add();
		questions.add();*/
	}

/* adding the CorrectAnswers in the ArrayList named CorrectAnswers ,the empty cells will be filled if this is running properly*/
	public void CorrectAnswers() {
		CorrectAnswers.add("Frida Kahlo");
		CorrectAnswers.add("Lord Byron");
		CorrectAnswers.add("The Assumption of the Virgin");
		CorrectAnswers.add("Spring");
		CorrectAnswers.add("Santorini");
		CorrectAnswers.add("Portrait");
		CorrectAnswers.add("The Acropolis");
		CorrectAnswers.add("Captain");
		CorrectAnswers.add("Circus");
		CorrectAnswers.add("East");
		CorrectAnswers.add("Seascape");
		CorrectAnswers.add("Dionysios Solomos");
		CorrectAnswers.add("Ethography");
		CorrectAnswers.add("Carnival");
		CorrectAnswers.add("The hunter");
		CorrectAnswers.add("Child engagements");
		CorrectAnswers.add("He is looking at the painting");
		CorrectAnswers.add("Pelion");
		/*CorrectAnswers.add();
		CorrectAnswers.add();
		CorrectAnswers.add();
		CorrectAnswers.add();
		CorrectAnswers.add();
		CorrectAnswers.add();
		CorrectAnswers.add();
		CorrectAnswers.add();
		CorrectAnswers.add();
		CorrectAnswers.add();
		CorrectAnswers.add();
		CorrectAnswers.add();
		CorrectAnswers.add();
		CorrectAnswers.add();
		CorrectAnswers.add();
		CorrectAnswers.add();
		CorrectAnswers.add();
		CorrectAnswers.add();
		CorrectAnswers.add();
		CorrectAnswers.add();
		CorrectAnswers.add();
		CorrectAnswers.add();
		CorrectAnswers.add();
		CorrectAnswers.add();
		CorrectAnswers.add();
		CorrectAnswers.add();
		CorrectAnswers.add();
		CorrectAnswers.add();
		CorrectAnswers.add();
		CorrectAnswers.add();
		CorrectAnswers.add();
		CorrectAnswers.add();
		CorrectAnswers.add();
		CorrectAnswers.add();
		CorrectAnswers.add();
		CorrectAnswers.add();
		CorrectAnswers.add();
		CorrectAnswers.add();
		CorrectAnswers.add();
		CorrectAnswers.add();
		CorrectAnswers.add();
		CorrectAnswers.add();
		CorrectAnswers.add();
		CorrectAnswers.add();
		CorrectAnswers.add();
		CorrectAnswers.add();
		CorrectAnswers.add();
		CorrectAnswers.add();
		CorrectAnswers.add();
		CorrectAnswers.add();
		CorrectAnswers.add();
		CorrectAnswers.add();
		CorrectAnswers.add();
		CorrectAnswers.add();
		CorrectAnswers.add();
		CorrectAnswers.add();
		CorrectAnswers.add();
		CorrectAnswers.add();
		CorrectAnswers.add();
		CorrectAnswers.add();
		CorrectAnswers.add();
		CorrectAnswers.add();
		CorrectAnswers.add();
		CorrectAnswers.add();
		CorrectAnswers.add();
		CorrectAnswers.add();
		CorrectAnswers.add();
		CorrectAnswers.add();
		CorrectAnswers.add();
		CorrectAnswers.add();
		CorrectAnswers.add();
		CorrectAnswers.add();
		CorrectAnswers.add();
		CorrectAnswers.add();
		CorrectAnswers.add();
		CorrectAnswers.add();
		CorrectAnswers.add();*/
	}


	MultiplePanels(){

		ConstructQuestions();
    		ConstructImages();
    		ConstructAnswers();
    		CorrectAnswers();

    		//create 3 different panels to place our labels (image-text-buttons)
    		JPanel panel1 = new JPanel();
    		JPanel panel2 = new JPanel();
    		JPanel panel3 = new JPanel();

    		//disable button NextQuestion so as to the user not be able to press it unless they first answer existed question
		NextQuestion.setEnabled(false);
		//randomly choose a question
		Random rand = new Random();
    		question_number = rand.nextInt(3);

		panel1.setBackground(Color.white);
		panel2.setBackground(Color.white);
		panel3.setBackground(Color.white);

		//add image to panel1
		JLabel imageLabel = new JLabel(images.get(question_number));
		panel1.add(imageLabel);

		//add question to label3
		JTextArea questionLabel = new JTextArea(10,65);
		questionLabel.setEditable(false);
		questionLabel.setSize(200, 200);
		questionLabel.setFont(new Font(null,Font.LAYOUT_LEFT_TO_RIGHT,20));
		questionLabel.setText(questions.get(question_number));
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

	                	if((b[question_number][0].getText()) == CorrectAnswers.get(question_number)) {
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

	                	if(b[question_number][1].getText() == CorrectAnswers.get(question_number)) {
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

	                	if(b[question_number][2].getText() == CorrectAnswers.get(question_number)) {
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

	                	if(b[question_number][3].getText() == CorrectAnswers.get(question_number)) {
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

			NextQuestion.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(e.getSource()==NextQuestion) {
						//if NextQuestion button is pressed a new frame shows up with different question
						frame.dispose();
						MultiplePanels m =new MultiplePanels();
					}
				}
			});
			//add panels to frame
			frame.add(panel1,BorderLayout.BEFORE_FIRST_LINE);
			frame.add(panel2,BorderLayout.PAGE_END);
			frame.add(panel3,BorderLayout.CENTER);
			frame.setSize(1200,1000);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub

	}

}