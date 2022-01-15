import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.FlowLayout;
import java.awt.Image;

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
import javax.swing.WindowConstants;
import javax.imageio.ImageIO;
import java.io.IOException;

public class MultiplePanels implements ActionListener{

	JFrame frame = new JFrame("GRallery");
	JFrame HintFrame = new JFrame("Hint");
	JFrame AnswerFrame = new JFrame("Answer");
	
	JButton[][] b = new JButton[10][4];
	JButton NextQuestion = new JButton("Next Question");
	
	JLabel messageLabel = new JLabel();
	
    	//create 3 different panels to place our labels (image-text-buttons)
	JPanel panel1 = new JPanel(); 
   	JPanel panel2 = new JPanel();
    	JPanel panel3  = new JPanel();
    
	String CorrectAnswers [] = new String[10];
	String[][] answers = new String[10][4];
	String[][] questions = new String[10][2];
	ArrayList<ImageIcon> images = new ArrayList<ImageIcon>();
	ArrayList<String> AnswerTexts = new ArrayList<String>();
	ArrayList<String>Hints = new ArrayList<String>();
	
	int AnsweredQuestions = 0;//counts questions the player answered
	int question_number;
	
	public void ConstructImages() {
		images.add(new ImageIcon(getClass().getResource("/1.jpg")));
		images.add(new ImageIcon(getClass().getResource("/2.jpg")));
		images.add(new ImageIcon(getClass().getResource("/3.jpg")));
		images.add(new ImageIcon(getClass().getResource("/4.jpg")));
		images.add(new ImageIcon(getClass().getResource("/5.jpg")));
		images.add(new ImageIcon(getClass().getResource("/6.jpg")));
		images.add(new ImageIcon(getClass().getResource("/7.jpg")));
		images.add(new ImageIcon(getClass().getResource("/8.jpg")));
		images.add(new ImageIcon(getClass().getResource("/9.jpg")));
		images.add(new ImageIcon(getClass().getResource("/10.jpg")));
		images.add(new ImageIcon(getClass().getResource("/11.jpg")));
		images.add(new ImageIcon(getClass().getResource("/12.jpg")));
		images.add(new ImageIcon(getClass().getResource("/13.jpg")));
		images.add(new ImageIcon(getClass().getResource("/14.jpg")));		
		images.add(new ImageIcon(getClass().getResource("/15.jpg")));
		images.add(new ImageIcon(getClass().getResource("/16.jpg")));
		images.add(new ImageIcon(getClass().getResource("/17.jpg")));
		images.add(new ImageIcon(getClass().getResource("/18.jpg")));
		images.add(new ImageIcon(getClass().getResource("/19.jpg")));
		images.add(new ImageIcon(getClass().getResource("/20.jpg")));
		images.add(new ImageIcon(getClass().getResource("/21.jpg")));
		images.add(new ImageIcon(getClass().getResource("/22.jpg")));
		images.add(new ImageIcon(getClass().getResource("/23.jpg")));
		images.add(new ImageIcon(getClass().getResource("/24.jpg")));
		images.add(new ImageIcon(getClass().getResource("/25.jpg")));
		
		images.add(new ImageIcon(getClass().getResource("/26.jpg")));
		images.add(new ImageIcon(getClass().getResource("/27.jpg")));
		images.add(new ImageIcon(getClass().getResource("/28.jpg")));
		images.add(new ImageIcon(getClass().getResource("/29.jpg")));
		images.add(new ImageIcon(getClass().getResource("/30.jpg")));
		images.add(new ImageIcon(getClass().getResource("/31.jpg")));
		images.add(new ImageIcon(getClass().getResource("/32.jpg")));		
		images.add(new ImageIcon(getClass().getResource("/33.jpg")));
		images.add(new ImageIcon(getClass().getResource("/34.jpg")));
		images.add(new ImageIcon(getClass().getResource("/35.jpg")));
		images.add(new ImageIcon(getClass().getResource("/36.jpg")));
		images.add(new ImageIcon(getClass().getResource("/37.jpg")));	
		images.add(new ImageIcon(getClass().getResource("/38.jpg")));
		images.add(new ImageIcon(getClass().getResource("/39.jpg")));	
		images.add(new ImageIcon(getClass().getResource("/40.jpg")));
		images.add(new ImageIcon(getClass().getResource("/41.jpg")));
		images.add(new ImageIcon(getClass().getResource("/42.jpg")));
		images.add(new ImageIcon(getClass().getResource("/43.jpg")));		
		images.add(new ImageIcon(getClass().getResource("/44.jpg")));		
		images.add(new ImageIcon(getClass().getResource("/45.jpg")));
		images.add(new ImageIcon(getClass().getResource("/46.jpg")));		
		images.add(new ImageIcon(getClass().getResource("/47.jpg")));
		images.add(new ImageIcon(getClass().getResource("/48.jpg")));
		images.add(new ImageIcon(getClass().getResource("/49.jpg")));
		images.add(new ImageIcon(getClass().getResource("/50.jpg")));
		
		images.add(new ImageIcon(getClass().getResource("/51.jpg")));
		images.add(new ImageIcon(getClass().getResource("/52.jpg")));
		images.add(new ImageIcon(getClass().getResource("/53.jpg")));
		images.add(new ImageIcon(getClass().getResource("/54.jpg")));
		images.add(new ImageIcon(getClass().getResource("/55.jpg")));
		images.add(new ImageIcon(getClass().getResource("/56.jpg")));
		images.add(new ImageIcon(getClass().getResource("/57.jpg")));
		images.add(new ImageIcon(getClass().getResource("/58.jpg")));
		images.add(new ImageIcon(getClass().getResource("/59.jpg")));
		images.add(new ImageIcon(getClass().getResource("/60.jpg")));
		images.add(new ImageIcon(getClass().getResource("/61.jpg")));
		images.add(new ImageIcon(getClass().getResource("/62.jpg")));
		images.add(new ImageIcon(getClass().getResource("/63.jpg")));
		images.add(new ImageIcon(getClass().getResource("/64.jpg")));
		images.add(new ImageIcon(getClass().getResource("/65.jpg")));
		images.add(new ImageIcon(getClass().getResource("/66.jpg")));
		images.add(new ImageIcon(getClass().getResource("/67.jpg")));
		images.add(new ImageIcon(getClass().getResource("/68.jpg")));
		images.add(new ImageIcon(getClass().getResource("/69.jpg")));
		images.add(new ImageIcon(getClass().getResource("/70.jpg")));
		images.add(new ImageIcon(getClass().getResource("/71.jpg")));
		images.add(new ImageIcon(getClass().getResource("/72.jpg")));
		images.add(new ImageIcon(getClass().getResource("/73.jpg")));
		images.add(new ImageIcon(getClass().getResource("/74.jpg")));
		images.add(new ImageIcon(getClass().getResource("/75.jpg")));

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
		questions[0][0] = "Ο «Φάρος» εικάζεται πως αποτελεί μία απεικόνιση ενός πραγματικού φάρου σε κάποιο κυκλαδίτικο\n νησί με σκοπό σε συνδυασμό με άλλα έργα να αναδειχθεί το ελληνικό καλοκαίρι.Σε ποιον γνωστό\n Έλληνα ζωγράφο με καταγωγή από την Τήνο ανήκει ο συγκεκριμένος πίνακας;";
		questions[1][0] = "Η σύνθεση του πίνακα διαμορφώνεται στη βάση της αντίθεσης φωτεινού και σκοτεινού και στο χωρισμό της επιφάνειας\nσε μεγάλες χρωματικές ενότητες με τα χρώματα να εναλλάσσονται από πορτοκαλί και κεραμιδί σε ανοιχτό γκρίζο, \nγαλάζιο και πράσινο. Τα έντονα και φωτεινά χρώματα που χρησιμοποιεί ο Κωνσταντίνος Μαλέας, τόσο στο \nσυγκεκριμένο όσο και σε άλλα έργα του, και οι πλατιές πινελιές του αποτέλεσαν αφορμή για να χαρακτηριστούν τα \nέργα του από τους συντηρητικούς κριτικούς εκείνης της εποχής ως:\n ";
		questions[2][0] = "Η ιστορία πίσω από τον συγκεκριμένο πίνακα όπως αφηγείται ο ίδιος ο ζωγράφος, Περικλής Βυζάντιος, είναι η εξής:\n“H μεγαλύτερή μου χαρά ήταν όταν η Oρελί μου έλεγε:«Allons nous coucher» και μ’ έπαιρνε από το χέρι και πηγαίναμε\nγια ύπνο στην κρεβατοκάμαρή μας. Άναβε ένα κερί σε ένα μπρούτζινο σαμντάνι επάνω στον κομό.Εγώ γρήγορα\nγρήγορα γδυνόμουνα και φόραγα τη μακριά πουκαμίσα κι έμπαινα στο κρεβάτι κι έκανα πως κοιμόμουνα, ενώ με το\nένα μάτι ανοιχτό παρακολουθούσα το γδύσιμο της Oρελί μπροστά στον καθρέφτη και τη θαύμαζα. H Oρελί ήτανε \nκαλοφτιαγμένη, ψηλή, με άφθονα καστανά μαλλιά. Βέβαιη πως εγώ κοιμάμαι, γδυνότανε σιγά σιγά, γυρίζοντάς μου\n την πλάτη. Τα διάφορα νταντελωτά μεσοφόρια, μεγάλα λεπτά εσώρουχα περασμένα με ροζ κορδέλες,της έπεφταν\n στα ωραία της πόδια, και γυμνή εντελώς σκούπιζε με μια κρέμα το πρόσωπό της σκυμμένη προς τον καθρέφτη. Μα\nεγώ δεν έβλεπα μονάχα τη ράχη της μέσα στον καθρέφτη διέκρινα και το σφιχτό και στέριο στήθος, που πολλές φορές\nτο κρατούσε με τα ωραία της χέρια και το καμάρωνε και η ίδια.Στο τέλος φορούσε μια μακριά νυχτικιά με κεντήματα \nστο στήθος και στις άκρες των μανικιών, πλησίαζε το κερί, το έσβηνε, κι ερχότανε στο μικτό κρεβάτι μου να με\n σκεπάσει καλά.Έσκυβε και με φιλούσε στο μέτωπο. Εγώ, φυσικά,έκανα πως κοιμόμουνα, και ούτε ανέπνεα, γιατί\n φοβόμουνα μήπως ακούσει την καρδιά μου που χτυπούσε δυνατά…” Ποιος πιστεύετε ότι είναι ο τίτλος του έργου;";
		questions[0][1] = "Hint: Ο πατέρας του ήταν επίσης ζωγράφος και \nθεωρείται πρωτοπόρος στην διαμόρφωση της \nδιδασκαλίας των Καλών Τεχνών στην Ελλάδα.";
		questions[1][1] = " ";
		questions[2][1] = " ";
	}
	
	public void CorrectAnswers() {
		CorrectAnswers[0] = answers[0][1];
		CorrectAnswers[1] = answers[1][1];
		CorrectAnswers[2] = answers[2][0];
	}
	
	public void ConstructAnswerTexts() {
		AnswerTexts.add("Ο Νίκος Λύτρας ήταν διακεκριμένος Έλληνας ζωγράφος των αρχών \nτου 20ού αιώνα. Σπούδασε ζωγραφική στο Σχολείο των Τεχνών \n(την μετέπειτα Ανωτάτη Σχολή Καλών Τεχνών) της Αθήνας από το \n1902 έως το 1906, με δάσκαλους τον πατέρα του Νικηφόρο Λύτρα και \nτον Γεώργιο Ιακωβίδη. Συνέχισε τις σπουδές του στην Ακαδημία \nτου Μονάχου από το 1907 έως το 1912, με δάσκαλο τον Λούντβιχ φον \nΛοφτς.Θεωρείται πως με την ιδιαίτερη τεχνοτροπία του σε σχέση με το \nχρώμα, εισήγαγε στην Ελλάδα τον εξπρεσιονισμό. ");
		AnswerTexts.add(" ");
		AnswerTexts.add(" ");
	}
	
	public void ConstructHints() {
		for(int i = 0; i < 27; i++) {
			Hints.add(" ");
		}
		Hints.add("Hint: Είναι ο πλησιέστερος σταθμός του \nηλεκτρικού στο Οικονομικό Πανεπιστήμιο Αθηνών.");
		for(int i = 0; i < 5; i++) {
			Hints.add(" ");
		}
		Hints.add("Hint: Αυτή η πόλη είναι ο τόπος καταγωγής \nτου ποιητή Γιάννη Ρίτσου");
		Hints.add(" ");
		Hints.add(" ");
		Hints.add(" ");
		Hints.add(" ");
		Hints.add("Hint: Το μουσικό όργανο που απεικονίζεται \nστον πίνακα ήταν και το αγαπημένο όργανο \nτου ήρωα Μακρυγιάννη.");
		for(int i = 0; i < 8; i++) {
			Hints.add(" ");
		}
		Hints.add("Hint: Υπάρχει πίνακας του γνωστού ζωγράφου \nΝικολάου Γύζη με τον ίδιο τίτλο και το \nάκουσμα του παραπέμπει στην μουσική.");
		for(int i = 0; i < 8; i++) {
			Hints.add(" ");
		}
		Hints.add("Hint: Κατά τη διάρκεια των Βαλκανικών \nΠολέμων πολέμησε ως έφεδρος αξιωματικός και \nπαρασημοφορήθηκε για τη δράση του, ενώ το \n1923 κέρδισε την έδρα ζωγραφικής της Σχολής \nΚαλών Τεχνών.");
		for(int i = 0; i < 8; i++) {
			Hints.add(" ");
		}
		Hints.add("Hint: Αυτά ήταν τα κυρίαρχα καλλιτεχνικά \nκινήματα στα τέλη του 19ου και αρχές του 20ου \nαιώνα με βασικούς εκπροσώπους τους τους \nΈντβαρτ Μουνκ, Γκουστάβ Μορώ και Όμπρεϊ \nΜπίρντσλι.");
		Hints.add("Hint: Ο πατέρας του ήταν επίσης ζωγράφος και \nθεωρείται πρωτοπόρος στην διαμόρφωση της \nδιδασκαλίας των Καλών Τεχνών στην Ελλάδα.");
		Hints.add("Hint: Αποτέλεσε έναν από τους πιο σημαντικούς \nΈλληνες ζωγράφους του 19ου αιώνα της λεγόμενης \n«Σχολής του Μονάχου».");
		Hints.add("Hint: Γνωστή ποιητική συλλογή του Γιάννη \nΡίτσου φέρει τον ίδιο τίτλο.");
		for(int i = 0; i < 5; i++) {
			Hints.add(" ");
		}
		Hints.add("Hint: Στα ελληνικά ονομάζεται λαϊκή τέχνη.");
	}
	
	public void AnswerText(int x) {
		AnsweredQuestions = AnsweredQuestions + 1; //one more question gets answered
		if(AnswerTexts.get(x) != " ") {
			//if there is an explanation for the answer it shows up in a new frame
			JTextArea AnswerLabel = new JTextArea();
			AnswerLabel.setText(AnswerTexts.get(x));
			AnswerLabel.setSize(200, 200);
			AnswerLabel.setFont(new Font(null,Font.CENTER_BASELINE,20));	
			AnswerLabel.setEditable(false);
			AnswerFrame.add(AnswerLabel);
			AnswerFrame.setSize(700,300);
			AnswerFrame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			AnswerFrame.getContentPane().setBackground( Color.WHITE );
			AnswerFrame.setLocationRelativeTo(null); 
			AnswerFrame.setVisible(true);
		}
	}
	
	public void AnswerButtonPressed(int QuestionNumber) {
		//since a button is pressed, player can not change their answer and their only choice is to continue with NextQuestion, if HintFrame is opened it gets closed and an answer's explanation shows up if existed
		for(int j = 0; j<4; j++) {
			b[QuestionNumber][j].setEnabled(false);
		}
    		NextQuestion.setEnabled(true);
    		HintFrame.dispose();
    		AnswerText(QuestionNumber);
	}
	public void CorrectButtonPressed(int QuestionNumber,int x) {
		//if they answer correct, pressed button turns green and message "CORRECT" shows up
		messageLabel.setForeground(Color.green);
		messageLabel.setText("CORRECT");
		messageLabel.setVisible(true);
		b[QuestionNumber][x].setBackground(Color.GREEN);
	}

	public void WrongButtonPressed(int QuestionNumber,int x) {
		//if they answer wrong, pressed button turns red and message "WRONG" shows up
		messageLabel.setForeground(Color.red);
		messageLabel.setText("WRONG");
		messageLabel.setVisible(true);
		b[QuestionNumber][x].setBackground(Color.RED);
	}

	MultiplePanels(){
		
		
		ConstructQuestions();
    		ConstructImages();
    		ConstructAnswers();
    		CorrectAnswers();
		ConstructHints();
    		ConstructAnswerTexts();
    		
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
    		if(AnsweredQuestions < 5) {//trexei mexri 5 erwtiseis mexri na ftiaxtoun oles
			question_number = rand.nextInt(3);//ερωτήσεις 0-25  rand.nextInt(26);
		} else if(AnsweredQuestions < 10) {
			question_number =  26 + rand.nextInt(26);//ερωτήσεις 26-51
		} else {
			question_number = 52 + rand.nextInt(23);//ερωτήσεις 52-74
		}
		
		
		//add image to panel1
		JLabel imageLabel = new JLabel(images.get(question_number));
		panel1.add(imageLabel);
		
		//add question to label3
		JTextArea questionLabel = new JTextArea(10,65);
		questionLabel.setEditable(false);
		questionLabel.setSize(200, 200);
		questionLabel.setFont(new Font(null,Font.LAYOUT_LEFT_TO_RIGHT,20));
		questionLabel.setText(questions[question_number][0]);
		panel3.add(questionLabel,BorderLayout.BEFORE_FIRST_LINE);
		
		//add message that informs the player if their answer was correct or wrong to panel3
    		messageLabel.setSize(100, 100);
		messageLabel.setFont(new Font(null,Font.BOLD,25));
		messageLabel.setHorizontalTextPosition(JLabel.CENTER);
		messageLabel.setVerticalTextPosition(JLabel.CENTER);
		messageLabel.setVisible(false);
		panel3.add(messageLabel,BorderLayout.AFTER_LINE_ENDS);
		
		//add a scroll pane to panel3 
		JScrollPane scroll =new JScrollPane(questionLabel,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		panel3.add(scroll);
		
		//add HintButton to panel2
		if(Hints.get(question_number) != " ") {
			JButton HintButton = new JButton();
			HintButton.setPreferredSize(new Dimension(50, 50));
			HintButton.setBackground(Color.lightGray);
			try {
				Image icon = ImageIO.read(getClass().getResource("hintaki.png"));
				HintButton.setIcon(new ImageIcon(icon));
			} catch (IOException ex) {
			}
			panel2.add(HintButton);
			JTextArea HintLabel = new JTextArea();
			HintFrame.setSize(500,400);
			HintFrame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			HintFrame.getContentPane().setBackground( Color.WHITE );
			HintFrame.setLocationRelativeTo(null);  

			HintLabel.setText(Hints.get(question_number));
			HintLabel.setSize(200, 200);
			HintLabel.setFont(new Font(null,Font.CENTER_BASELINE,20));	
			HintLabel.setEditable(false);
			
				try {
					JLabel background = new JLabel(new ImageIcon((ImageIO.read(getClass().getResource("hint2.png")))));
					HintFrame.add(background);
				    	background.setLayout(new FlowLayout());
				    	background.add(HintLabel);
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			HintButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(e.getSource() == HintButton) {
						HintFrame.setVisible(true);
					}
				}
			});
		}
		
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
	                	AnswerButtonPressed(question_number);
	                	if((b[question_number][0].getText()) == CorrectAnswers[question_number]) {
	                		CorrectButtonPressed(question_number,0);
	                	}else {
	                		WrongButtonPressed(question_number,0);
	                	}
	                }else if(e.getSource() == b[question_number][1] ) {
	                	
	                	AnswerButtonPressed(question_number);
				
	                	if(b[question_number][1].getText() == CorrectAnswers[question_number]) {
	                		CorrectButtonPressed(question_number,1);
	                	}else {
	                		WrongButtonPressed(question_number,1);
	                	}
	                }else if(e.getSource() == b[question_number][2] ) {
	                	
	                	AnswerButtonPressed(question_number);
				
	                	if(b[question_number][2].getText() == CorrectAnswers[question_number]) {
	                		CorrectButtonPressed(question_number,2);
	                	}else {
	                		WrongButtonPressed(question_number,2);
	                	}
	                }else if(e.getSource() == b[question_number][3] ) {
	                	
	                	AnswerButtonPressed(question_number);
				
	                	if(b[question_number][3].getText() == CorrectAnswers[question_number]) {
	                		CorrectButtonPressed(question_number,3);
	                	}else {
	                		WrongButtonPressed(question_number,3);
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
			frame.setSize(1200,1050);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setLocationRelativeTo(null);  
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
			
		     	HintFrame.dispose();
		   	AnswerFrame.dispose();
			
		     	setPanels();
		     	setAllFrames();
		
		}

	
	}
}

