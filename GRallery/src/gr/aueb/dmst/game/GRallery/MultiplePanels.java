import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.EventObject;
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

public class MultiplePanels implements ActionListener{
	
	JFrame frame = new JFrame("GRallery");
	JButton[][] b = new JButton[10][4];
	JButton NextQuestion = new JButton("Next Question");
	
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
		questions[0] = "Ο «Φάρος» εικάζεται πως αποτελεί μία απεικόνιση ενός πραγματικού φάρου σε κάποιο κυκλαδίτικο\n νησί με σκοπό σε συνδυασμό με άλλα έργα να αναδειχθεί το ελληνικό καλοκαίρι.Σε ποιον γνωστό\n Έλληνα ζωγράφο με καταγωγή από την Τήνο ανήκει ο συγκεκριμένος πίνακας;";
		questions[1] = "Η σύνθεση του πίνακα διαμορφώνεται στη βάση της αντίθεσης φωτεινού και σκοτεινού και στο χωρισμό\n της επιφάνειας σε μεγάλες χρωματικές ενότητες με τα χρώματα να εναλλάσσονται από πορτοκαλί και\n κεραμιδί σε ανοιχτό γκρίζο, γαλάζιο και πράσινο. Τα έντονα και φωτεινά χρώματα που χρησιμοποιεί\n ο Κωνσταντίνος Μαλέας, τόσο στο συγκεκριμένο όσο και σε άλλα έργα του, και οι πλατιές πινελιές\n του αποτέλεσαν αφορμή για να χαρακτηριστούν τα έργα του από τους συντηρητικούς\n κριτικούς εκείνης της εποχής ως:\n ";
		questions[2] = "Η ιστορία πίσω από τον συγκεκριμένο πίνακα όπως αφηγείται ο ίδιος ο ζωγράφος, Περικλής Βυζάντιος, είναι η εξής:\nH μεγαλύτερή μου χαρά ήταν όταν η Oρελί μου έλεγε:«Allons nous coucher» και μ έπαιρνε από το χέρι και πηγαίναμε\nγια ύπνο στην κρεβατοκάμαρή μας. ’ναβε ένα κερί σε ένα μπρούτζινο σαμντάνι επάνω στον κομό.Εγώ γρήγορα\nγρήγορα γδυνόμουνα και φόραγα τη μακριά πουκαμίσα κι έμπαινα στο κρεβάτι κι έκανα πως κοιμόμουνα, ενώ με το\nένα μάτι ανοιχτό παρακολουθούσα το γδύσιμο της Oρελί μπροστά στον καθρέφτη και τη θαύμαζα. H Oρελί ήτανε \nκαλοφτιαγμένη, ψηλή, με άφθονα καστανά μαλλιά. Βέβαιη πως εγώ κοιμάμαι, γδυνότανε σιγά σιγά, γυρίζοντάς μου\n την πλάτη. Τα διάφορα νταντελωτά μεσοφόρια, μεγάλα λεπτά εσώρουχα περασμένα με ροζ κορδέλες,της έπεφταν\n στα ωραία της πόδια, και γυμνή εντελώς σκούπιζε με μια κρέμα το πρόσωπό της σκυμμένη προς τον καθρέφτη. Μα\nεγώ δεν έβλεπα μονάχα τη ράχη της μέσα στον καθρέφτη διέκρινα και το σφιχτό και στέριο στήθος, που πολλές φορές\nτο κρατούσε με τα ωραία της χέρια και το καμάρωνε και η ίδια.Στο τέλος φορούσε μια μακριά νυχτικιά με κεντήματα \nστο στήθος και στις άκρες των μανικιών, πλησίαζε το κερί, το έσβηνε, κι ερχότανε στο μικτό κρεβάτι μου να με\n σκεπάσει καλά.Έσκυβε και με φιλούσε στο μέτωπο. Εγώ, φυσικά,έκανα πως κοιμόμουνα, και ούτε ανέπνεα, γιατί\n φοβόμουνα μήπως ακούσει την καρδιά μου που χτυπούσε δυνατά Ποιος πιστεύετε ότι είναι ο τίτλος του έργου;";
	}
	
	public void CorrectAnswers() {
		CorrectAnswers[0] = answers[0][1];
		CorrectAnswers[1] = answers[1][1];
		CorrectAnswers[2] = answers[2][0];
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
			frame.dispose();
			//if NextQuestion button is pressed a new frame shows up with different question
			MultiplePanels m = new MultiplePanels();
			
		}
		
	}
	
}
