package gr.aueb.dmst.game.GRallery;
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
import javax.swing.JProgressBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.EtchedBorder;
import javax.imageio.ImageIO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class MultiplePanels implements ActionListener{
	//public static final Color DGREEN = new Color(0, 153, 0);

	JFrame frame = new JFrame("GRallery");
	JFrame HintFrame = new JFrame("Hint");
	JFrame AnswerFrame = new JFrame("Answer");
	JTextArea HintLabel = new JTextArea();
	JTextArea AnswerLabel = new JTextArea();
	
	JButton[][] b = new JButton[75][4];
	JButton NextQuestion = new JButton("Επόμενο");
	
	JLabel messageLabel = new JLabel();
    JProgressBar progressbar = new JProgressBar(0,100);
    
    
    JLabel scoreLabel = new JLabel("Score: 0  ");
    JLabel highScoreLabel = new JLabel("High Score " + GetHighScoreValue() );
	
    	//create 3 different panels to place our labels (image-text-buttons)
	JPanel panel1 = new JPanel(); 
   	JPanel panel2 = new JPanel();
    JPanel panel3  = new JPanel();
    
    
    
    	String CorrectAnswers [] = new String[75];
    	String[][] answers = new String[75][4];
    	ArrayList<String> questions = new ArrayList<String>();
    	ArrayList<ImageIcon> images = new ArrayList<ImageIcon>();
    	ArrayList<String> AnswerTexts = new ArrayList<String>();
    	ArrayList<String>Hints = new ArrayList<String>();
    	ArrayList<Integer> q_Numbers = new ArrayList<Integer>(); 
    	
    	ArrayList<Integer>	q_numbers = createRandomNumberList();
	int AnsweredQuestions = 0;//counts questions the player answered
	public int question_number = q_numbers.get(AnsweredQuestions);
	
	public void ConstructProgressBar() {
    	progressbar.setValue(0);
		progressbar.setBounds(1200,400,100,1000);
		progressbar.setStringPainted(true);
		progressbar.setFont(new Font("Casey",Font.BOLD,25));
		progressbar.setForeground(Color.blue);
		progressbar.setBackground(Color.white);
		
    }
	
	public void ConstructScoreLabel() {
		scoreLabel.setBounds(0, 0, 200, 400);
		scoreLabel.setFont(new Font("Serif", Font.BOLD, 28));
		highScoreLabel.setBounds(0, 0, 200, 400);
		highScoreLabel.setFont(new Font("Serif", Font.BOLD, 28));
		scoreLabel.setForeground(Color.DARK_GRAY);
		scoreLabel.setForeground(Color.DARK_GRAY);
	}

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



		answers[0][0] = "Τζόαν Μίτσελ";
		answers[0][1] = "Φρίντα Κάλο";
		answers[0][2] = "Μαίρη Κάσατ";
		answers[0][3] = "Λαβίνια Φοντάνα";



		answers[1][0] = "Λόρδος Μπάιρον";
		answers[1][1] = "Τζωρτζ Όργουελ";
		answers[1][2] = "Τζ. Ρ.Ρ. Τόλκιν";
		answers[1][3] = "Όσκαρ Ουάιλντ";



		answers[2][0] = "Τα εισόδια της Θεοτόκου";
		answers[2][1] = "Ο Ευαγγελισμός";
		answers[2][2] = "Η Κοίμηση της Θεοτόκου";
		answers[2][3] = "Η Ανάσταση";



		answers[3][0] = "Φθινόπωρο";
		answers[3][1] = "Χειμώνας";
		answers[3][2] = "Άνοιξη";
		answers[3][3] = "Καλοκαίρι";



		answers[4][0] = "Νάξος";
		answers[4][1] = "Άνδρος";
		answers[4][2] = "Σύρος";
		answers[4][3] = "Σαντορίνη";



		answers[5][0] = "Σκιτσογραφία";
		answers[5][1] = "Υπερρεαλισμός";
		answers[5][2] = "Προσωπογραφία";
		answers[5][3] = "Εξπρεσιονισμός";



		answers[6][0] = "Ο ναός του Ηφαίστου";
		answers[6][1] = "Η Ακρόπολη";
		answers[6][2] = "Ο ναός του Απόλλωνα";
		answers[6][3] = "Ο ναός του Ποσειδώνα";



		answers[7][0] = "Αρματολός";
		answers[7][1] = "Λόγιος";
		answers[7][2] = "Καπετάνιος";
		answers[7][3] = "Έμπορος";



		answers[8][0] = "Τσίρκο";
		answers[8][1] = "Θεατρικό";
		answers[8][2] = "Πολιτική συγκέντρωση";
		answers[8][3] = "Διαδήλωση";



		answers[9][0] = "Ανατολή";
		answers[9][1] = "Βαλκάνια";
		answers[9][2] = "Νότος";
		answers[9][3] = "Βόρεια Ευρώπη";



		answers[10][0] = "Υδατογραφία";
		answers[10][1] = "Θαλασσογραφία";
		answers[10][2] = "Νωπογραφία";
		answers[10][3] = "Τίποτα από τα παραπάνω";



		answers[11][0] = "Γιάννης Ρίτσος";
		answers[11][1] = "Διονύσιος Σολωμός";
		answers[11][2] = "Κωστής Παλαμάς";
		answers[11][3] = "Οδυσσέας Ελύτης";



		answers[12][0] = "Αναγέννηση";
		answers[12][1] = "Επανάσταση";
		answers[12][2] = "Ηθογραφία";
		answers[12][3] = "Προσωπογραφία";



		answers[13][0] = "Πρωτομαγιά";
		answers[13][1] = "Καθαρά Δευτέρα";
		answers[13][2] = "Απόκριες";
		answers[13][3] = "Χριστούγεννα";



		answers[14][0] = "Το δάσος";
		answers[14][1] = "Ο κυνηγός";
		answers[14][2] = "Ο περίπατος";
		answers[14][3] = "Μοναξιά";



		answers[15][0] = "Βάφτιση";
		answers[15][1] = "Γενέθλια";
		answers[15][2] = "Παιδικοί αρραβώνες";
		answers[15][3] = "Παραδοσιακοί χοροί";



		answers[16][0] = "Βυθίζεται στις σκέψεις του";
		answers[16][1] = "Αναπαύεται";
		answers[16][2] = "Κοιτάζει τον πίνακα";
		answers[16][3] = "Ετοιμάζεται να αποχωρήσει";



		answers[17][0] = "Μάνη";
		answers[17][1] = "Καρδίτσα";
		answers[17][2] = "Ζαχάρω";
		answers[17][3] = "Πήλιο";



		answers[18][0] = "Στον Πειραιά";
		answers[18][1] = "Στα Χανιά";
		answers[18][2] = "Στην Αλεξανδρούπολη";
		answers[18][3] = "Στον Βόλο";



		answers[19][0] = "En Face";
		answers[19][1] = "Προφίλ";
		answers[19][2] = "3/4";
		answers[19][3] = "Πορτρέτο";



		answers[20][0] = "Αριθμάκια";
		answers[20][1] = "Αγάλματα ακούνητα, αμίλητα";
		answers[20][2] = "Αμπάριζα";
		answers[20][3] = "Γύρω- γύρω όλοι";



		answers[21][0] = "Οι γάμοι του Φίγκαρο";
		answers[21][1] = "Ο μαγικός αυλός";
		answers[21][2] = "Ο βαφτιστικός";
		answers[21][3] = "Μαντάμ Μπατερφλάι";



		answers[22][0] = "Στον Μεσαίωνα";
		answers[22][1] = "Στην Αναγέννηση";
		answers[22][2] = "Στην Ελληνική Αρχαιότητα";
		answers[22][3] = "Στη σύγχρονη ιστορία";



		answers[23][0] = "Θεόδωρος Κολοκοτρώνης";
		answers[23][1] = "Γεώργιος Καραϊσκάκης";
		answers[23][2] = "Αλέξανδρος Υψηλάντης";
		answers[23][3] = "Πετρόμπεης Μαυρομιχάλης";



		answers[24][0] = "Γυναικεία μάζωξη";
		answers[24][1] = "Η καφετζού";
		answers[24][2] = "Η χαρτομάντισσα";
		answers[24][3] = "Συνομωσία";



		answers[25][0] = "Παιδομάζωμα";
		answers[25][1] = "Σωματεμπόριο";
		answers[25][2] = "Σκλαβοπάζαρα";
		answers[25][3] = "Μαύρο παζάρι";



		answers[26][0] = "10 χιλ. Ευρώ";
		answers[26][1] = "1 εκατομμύριο ευρώ";
		answers[26][2] = "250 χιλ. Ευρώ ";
		answers[26][3] = "2 χιλ. Ευρώ";
	
		
		answers[27][0] = "Σύνταγμα";
		answers[27][1] = "Ομόνοια";
		answers[27][2] = "Βικτώρια";
		answers[27][3] = "Μοναστηράκι";

		
		answers[28][0] = "Ο Μενέλαος";
		answers[28][1] = "Ο Αγέλαος";
		answers[28][2] = "Ο Πηλέας";
		answers[28][3] = "Ο Πάρης";

		
		answers[29][0] = "Του Αμβούργου";
		answers[29][1] = "Του Ρότερνταμ";
		answers[29][2] = "Του Λίβερπουλ";
		answers[29][3] = "Της Κοπεγχάγης";

		

		answers[30][0] = "Το πορτρέτο μιας αγάπης";
		answers[30][1] = "Έρωτας";
		answers[30][2] = "Ορελί";
		answers[30][3] = "Αναγεννησιακή Ομορφιά";



		answers[31][0] = "Βασιλίσσης Όλγας";
		answers[31][1] = "Βασιλίσσης Αμαλίας";
		answers[31][2] = "Βασιλίσσης Σοφίας";
		answers[31][3] = "Βασιλέως Κωνσταντίνου";



		answers[32][0] = "Γιάννης Μόραλης";
		answers[32][1] = "Αλέκος Φασιανός";
		answers[32][2] = "Δομήνικος Θεοτοκόπουλος";
		answers[32][3] = "Θεόφιλος";



		answers[33][0] = "Μονεμβασιάς";
		answers[33][1] = "Ναυπλίου";
		answers[33][2] = "Νεμέας";
		answers[33][3] = "Μεθώνης";



		answers[34][0] = "Παλαιό Ψυχικό ";
		answers[34][1] = "Μαρούσι";
		answers[34][2] = "Ομόνοια";
		answers[34][3] = "Κηφισιά";



		answers[35][0] = "Πύλη του Ηλίου";
		answers[35][1] = "Πύλη των λεόντων";
		answers[35][2] = "Αρκαδική Πύλη";
		answers[35][3] = "Πύλη της Νάξου (Πορτάρα)";



		answers[36][0] = "Λαϊκοί ζωγράφοι";
		answers[36][1] = "Ακαδημαϊκοί ζωγράφοι";
		answers[36][2] = "Αρχαίοι Έλληνες ζωγράφοι";
		answers[36][3] = "Σύγχρονοι ζωγράφοι";



		answers[37][0] = "Toulouse Lautrec";
		answers[37][1] = "Vincent Van Gogh";
		answers[37][2] = "Joan Miro";
		answers[37][3] = "Claude Monet";



		answers[38][0] = "Λαούτο";
		answers[38][1] = "Μπουζούκι";
		answers[38][2] = "Ταμπουρά";
		answers[38][3] = "Ούτι";



		answers[39][0] = "Τα ιδιοτροπότερα";
		answers[39][1] = "Τα πιο ιδιαίτερα ";
		answers[39][2] = "Τα πιο εντυπωσιακά ";
		answers[39][3] = "Τα ομορφότερα ";



		answers[40][0] = "Υδατογραφία";
		answers[40][1] = "Χαλκογραφία";
		answers[40][2] = "Λάδι σε μουσαμά";
		answers[40][3] = "Τέμπερα";



		answers[41][0] = "Φιλόσοφος";
		answers[41][1] = "Τίποτα από τα υπόλοιπα";
		answers[41][2] = "Ιστορικός";
		answers[41][3] = "Συγγραφέας";



		answers[42][0] = "Επτανησιακή Σχολή";
		answers[42][1] = "Ρομαντισμό";
		answers[42][2] = "Κλασσικισμό";
		answers[42][3] = "Μοντερνισμό";



		answers[43][0] = "Κεφαλονιά";
		answers[43][1] = "Κέρκυρα";
		answers[43][2] = "Ζάκυνθος";
		answers[43][3] = "Κύθηρα";



		answers[44][0] = "Η Ελλάς ευγνωμονούσα";
		answers[44][1] = "Η αυτοθυσία της μάνας";
		answers[44][2] = "Η Ελλάδα στα ερείπια του Μεσολογγίου";
		answers[44][3] = "Ο θάνατος";



		answers[45][0] = "Μετά τη σφαγή στη Σαμοθράκη";
		answers[45][1] = "Η μάχη της Αλαμάνας";
		answers[45][2] = "Η σφαφή της Χίου";
		answers[45][3] = "Η έξοδος του Μεσολλογγίου";



		answers[46][0] = "Ελαιογραφία";
		answers[46][1] = "Νωπογραφία";
		answers[46][2] = "Υδατογραφία";
		answers[46][3] = "Χαλκογραφία";



		answers[47][0] = "Ωδή στη χαρά";
		answers[47][1] = "Αρμονία";
		answers[47][2] = "Ολυμπία";
		answers[47][3] = "Θαλάσσια κόρη";



		answers[48][0] = "Νοσοκόμες";
		answers[48][1] = "Οικιακές βοηθούς";
		answers[48][2] = "Παραμάνες";
		answers[48][3] = "Παιδαγωγούς";



		answers[49][0] = "Πόρος";
		answers[49][1] = "Σπέτσες";
		answers[49][2] = "Ύδρα";
		answers[49][3] = "Σαλαμίνα";



		answers[50][0] = "Δεν υπάρχει μουσικό όργανο";
		answers[50][1] = "Κιθάρα";
		answers[50][2] = "Άρπα";
		answers[50][3] = "Φλογέρα";



		answers[51][0] = "Ρεαλιστικό";
		answers[51][1] = "Συμβατικό-Συντηρητικό";
		answers[51][2] = "Πραγματικό-Υπερβατικό";
		answers[51][3] = "Τίποτα από τα υπόλοιπα";



		answers[52][0] = "Λάδι σε μουσαμά";
		answers[52][1] = "Τέμπερα";
		answers[52][2] = "Υδατογραφία";
		answers[52][3] = "Χαλκογραφία";



		answers[53][0] = "Η θέση του στον πίνακα";
		answers[53][1] = "Οι σκιάσεις";
		answers[53][2] = "Το φως που πέφτει πάνω του";
		answers[53][3] = "Τα περιγράμματα των μορφών";



		answers[54][0] = "Κλασικισμό και Μπαρόκ ";
		answers[54][1] = "Συμβολισμό και Υπερρεαλισμό";
		answers[54][2] = "Ιμπρεσιονισμό και Φοβισμό";
		answers[54][3] = "Εξπρεσιονισμό και Κυβισμό";



		answers[55][0] = "1500-1550";
		answers[55][1] = "1700-1750";
		answers[55][2] = "1900-1950";
		answers[55][3] = "1980-2010";



		answers[56][0] = "Νικόλαος Λύτρας";
		answers[56][1] = "Κωνσταντίνος Παρθένης";
		answers[56][2] = "Δομίνικος Θεοτοκόπουλος";
		answers[56][3] = "Οδυσσέας Φωκάς";



		answers[57][0] = "Φουτουρισμό";
		answers[57][1] = "Σουρεαλισμό";
		answers[57][2] = "Ιμπρεσιονισμό";
		answers[57][3] = "Εξπρεσιονισμό";



		answers[58][0] = "Κάρβουνο";
		answers[58][1] = "Λάδι";
		answers[58][2] = "Τέμπερα";
		answers[58][3] = "Ζεστό Κερί";



		answers[59][0] = "Εξπρεσιονισμό";
		answers[59][1] = "Ιμπρεσιονσιμό";
		answers[59][2] = "Ρομαντισμό";
		answers[59][3] = "Υπερρεαλισμό";



		answers[60][0] = "Την επέμβαση του ανθρώπου";
		answers[60][1] = "Την ομορφιά του ελληνικού καλοκαιριού";
		answers[60][2] = "Φυσικό και δομημένο περιβάλλον";
		answers[60][3] = "Ομορφιά μόνο του φυσικού περιβάλλοντος ";



		answers[61][0] = "1800-1840";
		answers[61][1] = "1840-1900";
		answers[61][2] = "1900-1940";
		answers[61][3] = "1940-1990";



		answers[62][0] = "Σουρεαλισμό";
		answers[62][1] = "Φωβισμό";
		answers[62][2] = "Εξπρεσιονισμό";
		answers[62][3] = "Μοντερνισμό";



		answers[63][0] = "Μητέρα";
		answers[63][1] = "Σύζυγος";
		answers[63][2] = "Αδερφή";
		answers[63][3] = "Κόρη";



		answers[64][0] = "Ξυλογραφία";
		answers[64][1] = "Χαλκογραφία";
		answers[64][2] = "Οξυγραφία";
		answers[64][3] = "Τσιγκογραφία";



		answers[65][0] = "Φωτορεαλισμό και φωβισμό";
		answers[65][1] = "Συμβολισμό και Αρ Νουβώ";
		answers[65][2] = "Μπαουχάους και Ποπ Αρτ";
		answers[65][3] = "Αρ Ντεκώ και Αρ Νουβώ";



		answers[66][0] = "Νικόλαος Γύζης ";
		answers[66][1] = "Ιωάννης Δούκας";
		answers[66][2] = "Νικόλαος Λύτρας";
		answers[66][3] = "Άγγελος Θεοδωρόπουλος";



		answers[67][0] = "Δομήνικος Θεοτοκόπουλος";
		answers[67][1] = "Νικόλαος Γύζης";
		answers[67][2] = "Θεόδωρος Βρυζάκης";
		answers[67][3] = "Παναγιώτης Δοξαράς";



		answers[68][0] = "«9η»";
		answers[68][1] = "«Η»";
		answers[68][2] = "«Ερωτική»";
		answers[68][3] = "«Εαρινή»";



		answers[69][0] = "Προεστοί - Κοτζαμπάσηδες";
		answers[69][1] = "Φαναριώτες";
		answers[69][2] = "Αρματολοί";
		answers[69][3] = "Αντάρτες";



		answers[70][0] = "1920-1950";
		answers[70][1] = "1750-1800";
		answers[70][2] = "2000-2010";
		answers[70][3] = "1800-1900";



		answers[71][0] = "Ελαιογραφία";
		answers[71][1] = "Τέμπερα και παστέλ σε χαρτί";
		answers[71][2] = "Ζεστό κερί";
		answers[71][3] = "Νωπογραφία";



		answers[72][0] = "Η ωραία Ελένη";
		answers[72][1] = "Η Αφροδίτη";
		answers[72][2] = "Η Παναγία";
		answers[72][3] = "Μία λαϊκή γυναίκα";



		answers[73][0] = "Μάρμαρο";
		answers[73][1] = "Γύψο";
		answers[73][2] = "Γυαλί";
		answers[73][3] = "Τσιμέντο";



		answers[74][0] = "Εξπρεσιονισμός";
		answers[74][1] = "Αρτ νουβώ";
		answers[74][2] = "Ποπ αρτ";
		answers[74][3] = "Ντανταϊσμός";



		}
	


	public void ConstructQuestions() { 
		questions.add("Ποια άλλη διάσημη ζωγράφο που γνωρίζετε \n σας θυμίζει η εικονιζόμενη;");
		questions.add("Πρόκειται για έναν Άγγλο αριστοκράτη με ταραχώδη βίο, \n λόγιο, πολιτικό, και μια εμβληματική μορφή του ρομαντισμού.\n Συγκαταλέγεται στους μεγαλύτερους Βρετανούς ποιητές και παραμένει ακόμα και σήμερα δημοφιλής.\n Χαρακτηριστικό του έργο αποτελεί το ποίημα «Don Juan».\n Ποιο είναι το όνομά του;");
		questions.add("Ποια ευαγγελική σκηνή αποτυπώνεται στην παραπάνω εικόνα;");
		questions.add("Ο παραπάνω πίνακας του Νικόλαου Οθωναίου αναφέρεται σε μία συγκεκριμένη \n εποχή του χρόνου. Με βάση τα χρώματα που χρησιμοποιεί και τα φυσικά \n στοιχεία που παρουσιάζει ποια πιστεύετε πως είναι αυτή;");
		questions.add("Ο Κωνσταντίνος Μαλέας έστησε το καβαλέτο του στο ύψωμα \n αυτού του κυκλαδίτικου νησιού για να ζωγραφίσει το λευκό όμορφο εκκλησάκι περιτριγυρισμένο \n από ταπεινά νησιώτικα σπίτια γύρω στα 1924-1928. Παρατηρώντας \n προσεκτικά τις λεπτομέρειες του πίνακα, ποιο νησί των Κυκλάδων \n πιστεύετε πως απεικονίζεται;");
		questions.add("Πώς ονομάζεται στη ζωγραφική και στις άλλες τέχνες,\n η εύστοχη απεικόνιση ενός \n προσώπου, αλλά και της προσωπικότητας, των συναισθημάτων και \n του ψυχικού κόσμου αυτού του προσώπου όπως το αντιλαμβάνεται ο δημιουργός;");
		questions.add("Ποιος αρχαίος ναός απεικονίζεται στον πίνακα;");
		questions.add("Ο Κριεζής, γόνος γνωστής οικογένειας Υδραίων, σπούδασε στο Παρίσι ζωγραφική καi χαρακτική.\n Στην τέχνη του αναμιγνύει λαϊκότροπα και ακαδημαϊκά στοιχεία. \r\n"
				+ "Στο έργο του ο \"Ψαριανός...\" ποζάρει καμαρωτός μετωπικά και κρατάει ένα αναμμένο τσιγάρο.\n Φοράει δε την παραδοσιακή νησιώτικη φορεσιά του. Από το ανοιχτό παράθυρο διακρίνουμε ένα ιστιοφόρο πλησίστιο. Το εμβληματικό αυτό στοιχείο παραπέμπει στην ασχολία του εικονιζομένου.\r\n"
				+ "Με βάση αυτά τα στοιχεία, ποιο εικάζετε ότι ήταν το επάγγελμα του Ψαριανού;\r\n"
				+ "");
		questions.add("Τι είδους εκδήλωση αναπαρίσταται στον \n συγκεκριμένο πίνακα;");
		questions.add("Με βάση την ενδυμασία του εικονιζόμενου και την πίπα που κρατάει,\n ποια θα λέγατε ότι είναι η καταγωγή του;");
		questions.add("Πώς ονομάζεται στην εικαστική τέχνη η \n απεικόνιση του θαλασσινού θέματος;");
		questions.add("«Στων Ψαρών την ολόμαυρη ράχη περπατώντας η Δόξα μονάχη,\n μελετά τα λαμπρά παλικάρια και στην κόμη στεφάνι φορεί\n γινωμένο από λίγα χορτάρια που ’χαν μείνει στην έρημη γη.»\n Ποιος έγραψε το ποίημα «Η Καταστροφή των Ψαρών» από το οποίο \n εμπνεύστηκε ο Νικόλαος Γύζης\n για να δημιουργήσει τη «Δόξα των Ψαρών»;");
		questions.add("Η ελληνική ………..εμπνέεται από τα ήθη και τα έθιμα του ελληνικού λαού,\n όπως συμβαίνει και με την αντίστοιχη λογοτεχνία της εποχής. Δεν είναι τυχαίο ότι \n την ίδια περίοδο δημιουργούνται οι επιστήμες της Λαογραφίας και της Γλωσσολογίας,\n ενώ ταυτόχρονα αρχίζει η διαμάχη για την αξία της δημοτικής γλώσσας.\n Ποια λέξη λείπει;");
		questions.add("Στην Αθήνα του Όθωνα και της Αμαλίας, περίπου στα μέσα του 19ου αιώνα,\n"
				+ " η συγκεκριμένη εορτή είχε ξεχωριστή θέση αφού σε αυτήν λάμβανε μέρος όλος ο λαός.\n"
				+"Γινόταν παρέλαση μασκαράδων,\n με ευρωπαϊκού τύπου μάσκες και στολές αμφίεσης,\n στη λεγόμενη «Μουσική της Κυριακής».\n "
				+ "Ποια γιορτή που αφορά αυτόν τον πίνακα περιγράφει το κείμενο;");
		questions.add("Ένα έργο του Δημήτριου Γαλάνη που δημιουργήθηκε περίπου το 1924. \n Ποιος πιστεύετε ότι είναι ο τίτλος του;");
		questions.add("Ποια είναι η ονομασία του εθίμου που απεικονίζεται στο έργο αυτό;");
		questions.add("Τι πιστεύετε πως κάνει ο κύριος στον πίνακα;");
		questions.add("Γνωστό και ως «το Βουνό των Κενταύρων». Βρίσκεται πολύ κοντά \n στην πόλη του Βόλου και συνδυάζει μοναδικά το βουνό με τη θάλασσα. Αποτελείται από \n πολλά μικρά χωριά και φημίζεται για την μοναδική του αρχιτεκτονική. \n Πώς λέγεται αυτό το μέρος;");
		questions.add("Το λιμάνι αυτό είναι το μεγαλύτερο της Ελλάδας αλλά και \n της Μεσογείου, καθώς και ένα από τα μεγαλύτερα στον κόσμο. \n Σε ποια πόλη ανήκει το λιμάνι του πίνακα;");
		questions.add("Πώς ονομάζεται στα πορτρέτα και τη φωτογραφία η αποτύπωση \n του προσώπου με ελαφριά γωνία ως προς την οπτική γωνία του θεατή;");
		questions.add("Πώς ονομάζεται το παιχνίδι για παιδικές ηλικίες που τα παιδιά κρατούνται από τα χέρια και κινούνται κυκλικά;");
		questions.add("Η φλογέρα, με τις «μαγικές» της ιδιότητες, αποτελεί επίσης θέμα μιας κλασσικής όπερας του Μότσαρτ. \n Γνωρίζετε πώς ονομάζεται αυτή η όπερα;");
		questions.add("Σε ποια ιστορική περίοδο πιστεύετε ότι υπήρχε περισσότερη προκατάληψη απέναντι στην τέχνη του «γυμνού»;");
		questions.add("Ποιος είναι ο απεικονιζόμενος πολεμιστής του ‘21, ο τύμβος του οποίου βρίσκεται στο Νέο Φάληρο;");
		questions.add("Μαντέψτε τον τίτλο του έργου:");
		questions.add("Ο τίτλος του έργου αφορά τα παζάρια στα οποία πωλούνταν άνθρωποι \n (ή αιχμάλωτοι πολέμου) ως σκλάβοι.Ποιος όρος είναι αυτός;");
		////METRIO
		questions.add("Στο πλαίσιο της δημοπρασίας του πίνακα, από τις 20 Νοεμβρίου 2021 και για 4 μέρες οι Γάλλοι \n"
				+ "και το διεθνές κοινό είχαν την ευκαιρία  να θαυμάσουν από κοντά το «Τάμα» του Γύζη, στην 4 Rue de la Paix,\n"
				+ " σχεδόν δύο χλμ. από το Λούβρο. Ο συγκεκριμένος πίνακας θεωρείται ένα από τα αριστουργήματα της νεοελληνικής τέχνης του 19ου αιώνα.\r\n"
				+ "Πόσο πιστεύετε ότι εκτιμήθηκε περίπου η αξία του έργου;\r\n");
		questions.add("Ποιος σταθμός είναι αυτός που απεικονίζεται στον πίνακα;");
		questions.add("Ο γνωστός και με το όνομα Αλέξανδρος, ήταν πρόσωπο της ελληνικής μυθολογίας,\n γιος του Πριάμου, βασιλιά της Τροίας. Ο γνωστότερος μύθος που συνδέεται με τον είναι ο \n σχετικός με την «απαγωγή» της Ωραίας Ελένης από αυτόν, που προκάλεσε τον Τρωικό Πόλεμο. Προς το τέλος αυτού \n του πολέμου, ο ..... πλήγωσε θανάσιμα στη φτέρνα τον Αχιλλέα με ένα βέλος.");
		questions.add("Το απεικονιζόμενο μέρος είναι το λιμάνι της πρωτεύουσας της Δανίας. \n Ποιο λιμάνι είναι;");
		questions.add("31");
		questions.add("Το έργο έχει τίτλο «Μετά τη βροχή» και απεικονίζει μια πολύ γνωστή λεωφόρο της Αθήνας. \n Πρόκειται για τη Λεωφόρο:");
		questions.add("Ο δημιουργός του έργου υπήρξε κορυφαίος Έλληνας λαϊκός ζωγράφος της νεοελληνικής τέχνης και αγιογράφος. \n Κυρίαρχο στοιχείο του έργου του είναι η ελληνικότητα και η εικονογράφηση της ελληνικής \n λαϊκής παράδοσης και ιστορίας.\n Ποιο ήταν το όνομά του;");
		questions.add("Στον παραπάνω πίνακα διακρίνουμε το κάστρο μίας ιστορικής πόλης της Πελοποννήσου. \n Τα τείχη ποιας πόλης απεικονίζονται;");
		questions.add("35");
		questions.add("Στον πίνακα απεικονίζεται η κύρια είσοδος της ακρόπολης των Μυκηνών, \n του κύριου κέντρου του Μυκηναϊκού Πολιτισμού. \n Πώς ονομάζεται η πύλη;");
		questions.add("Παρατηρείστε ότι ο συγκεκριμένος πίνακας του Θεόφιλου είναι σχεδιασμένος πάνω στο «επίπεδο», \n δηλαδή οι 3 διαστάσεις του χώρου δεν αποτυπώνονται σαφώς και απουσιάζει η προοπτική. \n Αντιθέτως, περισσότερη έμφαση έχει δοθεί στα χρώματα. \n Ποια κατηγορία ζωγράφων ακολουθούν συνήθως αυτή την προσέγγιση;");
		questions.add("Το έργο ποιου διάσημου καλλιτέχνη σας θυμίζει ο παραπάνω πίνακας;");
		questions.add("Ποιο παραδοσιακό όργανο παίζει ο γαλατάς;");
		questions.add("Τα έντονα και φωτεινά χρώματα που χρησιμοποιεί ο Μαλέας, καθώς και οι πλατιές πινελιές \n"
				+ "του αποτέλεσαν αφορμή για να χαρακτηριστούν τα έργα του από τους συντηρητικούς κριτικούς εκείνης\n"
				+ " της εποχής ως ...... σε χρώμα και σχέδιο.");
		questions.add("Με ποια τεχνική ζωγραφικής έχει φτιαχτεί ο παραπάνω πίνακας;");
		questions.add("Η Ελισάβετ Μουτζάν-Μαρτινέγκου (1801-1832),από μικρή είχε ιδιαίτερο ενδιαφέρον για \n την μάθηση και τα γράμματα και, παρόλο που η εκπαίδευσή της ήταν περιορισμένη η ίδια με προσωπική μελέτη \n απέκτησε γνώσεις της αρχαίας ελληνικής, της ιταλικής και της γαλλικής γλώσσας. \n Η Ελισάβετ Μουτζάν-Μαρτινέγκου είναι η πρώτη ελληνίδα:");
		questions.add("Ο συγκεκριμένος πίνακας δημιουργήθηκε το 1819. \n Σε ποιο καλλιτεχνικό ρεύμα θεωρείτε ότι ανήκει;");
		questions.add("Ο συγκεκριμένος πίνακας αποτυπώνει ένα έθιμο της Πρωτομαγιάς\n"
				+"Σε ποια περιοχή της Ελλάδας εκτυλίσσεται η δράση στον πίνακα;");
		questions.add("Πασίγνωστος πίνακας του Έλληνα ζωγράφου Θεόδωρου Βρυζάκη, του έτους 1858. \n Πρόκειται για έργο με ιδιαίτερο συμβολισμό, αφού απεικονίζει την Ελλάδα με τη μορφή νέας στεφανωμένης γυναίκας, \n ενδεδυμένης αρχαιοπρεπώς, εν μέσω αγωνιστών της Επανάστασης του 1821, να έχει σπάσει \n τις αλυσίδες της σκλαβιάς από τα πόδια της. \n Ποιο είναι το όνομα αυτού του πίνακα;");
		questions.add("Ο σπουδαίος αυτός πίνακας απομνημονεύει ένα από τα πιο τραγικά και ξακουστά επεισόδια του Αγώνα,\n"
				+ "που έλαβε χώρα τη νύχτα της 10ης Απριλίου 1826.\n "
				+ "Ποιο εμβληματικό ιστορικό γεγονός της ελληνικής επανάστασης απεικονίζεται στον συγκεκριμένο πίνακα;");
		questions.add("Το «Εμπρός στο τζάκι» αποτελεί ένα από τα πιο γνωστά έργα της ζωγράφου Σοφίας Λασκαρίδου \n καθώς δέχθηκε πολύ ευνοϊκά σχόλια από Γάλλους\n κριτικούς, όταν παρουσιάστηκε το 1914 στο Salon των Γάλλων καλλιτεχνών. \n Ποια τεχνική πιστεύετε πως έχει χρησιμοποιήσει η καλλιτέχνης στον συγκεκριμένο πίνακα;\n");
		questions.add("Ο Παύλος Ροδοκανάκης φιλοτέχνησε τον συγκεκριμένο πίνακα γύρω στο 1919. Το έργο θεωρείται \n συμβολιστικό και διακρίνεται για την καθαρά ιδεαλιστική φωνή και το ποιητικό του περιεχόμενο. \n Ποιος πιστεύετε ότι είναι ο τίτλος του;");
		questions.add("Το συγκεκριμένο επάγγελμα της εικονιζόμενης γυναίκας, υπήρχε στην Ελλάδα σε εποχές δύσκολες\n"
				+ " για τους ανθρώπους (πόλεμοι, κατοχή) και ειδικά για τις νέες μητέρες και για τα νεογέννητα μωρά τους.\n"
				+ "Η γυναίκα αυτή φρόντιζε να τραφούν με το μητρικό της γάλα όλα τα παιδιά που της έφερναν, \n"
				+ "καθώς τότε δεν υπήρχε το γάλα του εμπορίου, όπως σήμερα. \n"
				+ "Πώς αποκαλούσαν λαϊκά αυτές τις γυναίκες-τροφούς;");
		questions.add("Πρόκεται για νησί του Αργοσαρωνικού. Οι \n άνθρωποί του ασχολούνται κυρίως με την ναυτιλία, την αλιεία και τον τουρισμό. \n Είναι εξαιρετικά γραφικό, αρχοντικό και κοσμοπολίτικο νησί, το \n οποίο μάλιστα διαδραμάτισε σπουδαίο ρόλο στην ελληνική επανάσταση του ‘21. \n Ποιο είναι το όνομα του νησιού, το οποίο αποτελεί και τον τίτλο του πίνακα;");
		questions.add("Ποιο μουσικό όργανο μπορείτε να διακρίνετε μέσα στον πίνακα;");
		questions.add("Η δεκαετία του ’70 εγκαινιάζεται με την επιστροφή στην παραστατική ζωγραφική,\n"
				+ " η οποία συμπορεύεται με τον αμερικανικό Υπερρεαλισμό (Hyperrealism) και τους ευρωπαϊκούς ρεαλισμούς.\n"
				+ "Η ελληνική εκδοχή ταυτίζεται με αυτά τα ρεύματα σε ό,τι αφορά την καταγωγή \n"
				+ "της νέας εικόνας από τη φωτογραφία και τα μαζικά μέσα.\n"
				+ "Ποιο στοιχείο του πίνακα περιγράφει το κείμενο;");
		//////////////DYSKOLO
		questions.add("Ποια τεχνική ζωγραφικής έχει χρησιμοποιηθεί στον παραπάνω πίνακα;");
		questions.add("Τα «Πρώτα βήματα» είναι ένα από τα πιο γνωστά και αγαπημένα έργα του Ιακωβίδη.\n"
				+ " Η σκηνή ξετυλίγεται σε ένα εσωτερικό βαυαρέζικου χωριάτικου σπιτιού που πλημμυρίζει από φως από το ανοικτό παράθυρο. "
				+ "Ποιο καλλιτεχνικό στοιχείο του πίνακα, μεταξύ άλλων, \n"
				+ "τονίζει ότι το μωρό είναι ο πρωταγωνιστής του πίνακα, αλλά και η συνέχεια και χαρά της ζωής;\n");
		questions.add("Ο Κωνσταντίνος Παρθένης δημιουργεί «Το λιμάνι της Καλαμάτας»  κατά την διάρκεια της παραμονής του στο Παρίσι,\n"
				+ " φανερά επηρεασμένος από την παρισινή πρωτοπορία.\n"
				+ "Από ποια καλλιτεχνικά ρεύματα θεωρείτε πως επηρεάστηκε ο ζωγράφος προτού \nδημιουργήσει τον συγκεκριμένο πίνακα; ");
		questions.add("Ποια χρονική περίοδο εκτιμάτε ότι φιλοτεχνήθηκε ο παραπάνω πίνακας;");
		questions.add("Ποιος είναι ο δημιουργός του συγκεκριμένου πίνακα ο οποίος \n πέθανε νέος σε ηλικία μόλις 44 ετών από φυματίωση;");
		questions.add("Θεωρείται ένα από τα εντυπωσιακά και τολμηρά του έργα, στο οποίο \n κυριαρχούν το κίτρινο και το μπλε χρώμα, σε ποικίλες αποχρώσεις. \n Ο καλλιτέχνης καταφέρνει να μεταδώσει ένα αίσθημα γαλήνης και παράλληλα \n να αποτυπώσει την εικόνα του ελληνικού καλοκαιριού σε ένα κυκλαδίτικο νησί. \n Σε ποιο ρεύμα ζωγραφικής πιστεύετε πως ανήκει ο παραπάνω πίνακας;");
		questions.add("Ποιο από τα παρακάτω υλικά πιστεύετε ότι χρησιμοποίησε ο \n καλλιτέχνης προκειμένου να δημιουργήσει τον παραπάνω πίνακα;");
		questions.add("Ο συγκεκριμένος πίνακας του Συμεών Σαββίδη και ιδιαίτερα τα \n χρώματα που χρησιμοποιεί μας παραπέμπουν στο ρεύμα του:");
		questions.add("Στον πίνακα «Παντάνασσα Νάξου» διακρίνουμε ένα άσπρο εκκλησάκι \n στο κυκλαδίτικο νησί με δέντρα τριγύρω, ενώ στο βάθος μπορούμε να δούμε \n την θάλασσα που συναντά ξανά την στεριά. Τι \n πιστεύετε πως επιδιώκει να αναδείξει ο καλλιτέχνης με την παρουσίαση μερικών \n απλών μορφών στο έργο του (δέντρο – εκκλησία – θάλασσα \n – ουρανός - βουνό);");
		questions.add("Ο Κωνσταντίνος Μαλέας γυρνούσε με το καβαλέτο του στους \n δρόμους της Άνω πόλης της Θεσσαλονίκης και ζωγράφιζε ό,τι \n του κέντριζε το ενδιαφέρον από βυζαντινά \n κάστρα, μικρά σοκάκια με \n παλιά σπίτια και παλιές βυζαντινές εκκλησίες που είχαν μετατραπεί \n σε τζαμιά την εποχή των Οθωμανών και συνέχιζαν να διατηρούν τους μιναρέδες. \n Σε ποια περίοδο θεωρείτε ότι φιλοτεχνήθηκε ο συγκεκριμένος πίνακας;");
		questions.add("Ο Νικόλαος Λύτρας φιλοτέχνησε αυτόν τον πίνακα τις πρώτες \n δεκαετίες του 20ου αιώνα. Επηρεασμένος από τα μεταϊμπρεσιονιστικά \n ρεύματα, οι μορφές που παρουσιάζει στα έργα του αποκτούν \n πλέον αυτοσημία και τα χρώματα γίνονται πιο καθαρά και φωτεινά , \n ενώ η τρίτη διάσταση καταργείται. Με βάση τα παραπάνω σε ποιο ρεύμα \n θα λέγατε πως ανήκει το παραπάνω έργο;");
		questions.add("Η Εθνική Πινακοθήκη σε συνεργασία με το Ίδρυμα Β. & Μ. Θεοχαράκη παρουσίασαν στους \n χώρους του Ιδρύματος το 2019 την έκθεση «Άρωμα Γυναίκας στη \n Ελληνική Ζωγραφική» ανάμεσα σε άλλα έργα και την παραπάνω προσωπογραφία. \n Ποια πιστεύετε ότι είναι η σχέση της απεικονιζόμενης με τον ζωγράφο, \n για τον οποίο και αποτέλεσε σημαντική πηγή έμπνευσης;");
		questions.add("Ο Λυκούργος Κογεβίνας ήταν Έλληνας ζωγράφος και χαράκτης, \n ιδιαίτερα πρωτοπόρος αφού μαζί με τους συμπατριώτες του Ζαβιτσιάνο και \n Βεντούρα συγκαταλέγεται στους πρωτεργάτες της ελληνικής χαρακτικής. \n Ποια τεχνική χαρακτικής θεωρείται ότι εισήγαγε στην Ελλάδα;");
		questions.add("Ο Κωνσταντίνος Μαλέας φαίνεται να χρησιμοποιεί καμπυλόγραμμους ρυθμούς ώστε \n να αναδείξει τον έρημο κάμπο με τους χαμηλούς λόφους, τα πράσινα λιβάδια και τις καλαμιές. \n Από ποια καλλιτεχνικά ρεύματα θεωρείτε ότι επηρεάστηκε με αποτέλεσμα να εφαρμόσει αυτή την τεχνική;");
		questions.add("Ο «Φάρος» εικάζεται πως αποτελεί μία απεικόνιση ενός \n πραγματικού φάρου σε κάποιο κυκλαδίτικο νησί με σκοπό- σε \n συνδυασμό με άλλα έργα - να αναδείξει το ελληνικό καλοκαίρι. \n Ποιος γνωστός Έλληνας ζωγράφος με καταγωγή από την Τήνο \n φιλοτέχνησε το συγκεκριμένο πίνακα;");
		questions.add("Ποιος ζωγράφος δημιούργησε αυτό το πολύ γνωστό έργο με τίτλο «Γιάντες»;");
		questions.add("Στον πίνακα «………Συμφωνία» απεικονίζονται αιθέριες και αγγελικές μορφές.\n Κάποιες παρουσιάζονται να παίζουν βιολί και άρπα, και να κατευθύνονται από την \n ομίχλη προς το εύφορο έδαφος. Ο ουρανός και \n η γη δείχνουν να ενώνονται, με σκοπό την αναγέννηση της φύσης.\n Ποια λέξη λείπει στον τίτλο του έργου; ");
		questions.add("Ο απεικονιζόμενος ανήκε σε μια από τις κοινωνικές ομάδες του ελληνικού έθνους που κατάφεραν\n"
				+ "να αναδειχθούν στον διοικητικό μηχανισμό της Οθωμανικής Αυτοκρατορίας και να αποκτήσουν μεγάλη δύναμη.\n"
				+ "Είχαν στενές επαφές με την Ευρώπη, ήταν μορφωμένοι, πολύγλωσσοι και ικανοί να καλύψουν διοικητικά κενά \n"
				+ "στην οθωμανική διοίκηση ενώ ταυτόχρονα, όντας γύρω από το ελληνορθόδοξο πατριαρχείο, ήταν σε θέση να \n"
				+ "εκλέγουν μέχρι και Πατριάρχη. Ο σουλτάνος τούς επέλεγε για οσποδάρους,\n"
				+ "δηλαδή για ηγεμόνες στις παραδουνάβιες περιοχές, θέση που κράτησαν μέχρι την έναρξη της Επανάστασης\n"
				+ "από τον Υψηλάντη όταν και έχασαν την εμπιστοσύνη του σουλτάνου.\n"
				+ "Με ποια ονομασία είναι γνωστά τα μέλη αυτής της ομάδας;");
		questions.add("Στο συγκεκριμένο πίνακα απεικονίζεται η νεαρή Ρουμπίνα, στο ανοικτό παράθυρο του \n"
				+ "εξοχικού της στα Βλαχάτα της Σάμης.\n"
				+ "Σε ποια χρονική περίοδο πιστεύετε ότι δημιουργήθηκε αυτός ο πίνακας;");
		questions.add("Με ποια τεχνική ζωγραφικής εκτιμάτε \n ότι έχει δημιουργηθεί αυτός ο πίνακας;");
		questions.add("Ποια πιστεύετε ότι είναι η γυναίκα που έχει \n απεικονίσει στο έργο του ο Κωνσταντίνος Παρθένης;");
		questions.add("Η ανθρώπινη φιγούρα στον πίνακα είναι ανάγλυφη.\n Από τι υλικό μπορεί να έχει φτιαχτεί;");
		questions.add("Πρόκειται για καλλιτεχνικό κίνημα που αναπτύχθηκε αρχικά στη Μεγάλη Βρετανία και αργότερα\n"
				+ " στην Αμερική κατά τα μέσα της δεκαετίας του '50.\n"
				+ "Το φωτομοντάζ, το κολάζ και η συναρμολόγηση αποτέλεσαν συνηθισμένες μεθόδους αυτής της τέχνης.\r\n"
				+ "Σε ποιο καλλιτεχνικό κίνημα ανήκει ο συγκεκριμένος πίνακας;\r\n"); 
		}


	

	public void CorrectAnswers() {

		CorrectAnswers [0] = answers[0][1];
		CorrectAnswers [1] = answers[1][0];
		CorrectAnswers [2] = answers[2][2];
		CorrectAnswers [3] = answers[3][2];
		CorrectAnswers [4] = answers[4][3];
		CorrectAnswers [5] = answers[5][2];
		CorrectAnswers [6] = answers[6][1];
		CorrectAnswers [7] = answers[7][2];
		CorrectAnswers [8] = answers[8][0];
		CorrectAnswers [9] = answers[9][0];
		CorrectAnswers [10] = answers[10][1];
		CorrectAnswers [11] = answers[11][1];
		CorrectAnswers [12] = answers[12][2];
		CorrectAnswers [13] = answers[13][2];
		CorrectAnswers [14] = answers[14][1];
		CorrectAnswers [15] = answers[15][2];
		CorrectAnswers [16] = answers[16][2];
		CorrectAnswers [17] = answers[17][3];
		CorrectAnswers [18] = answers[18][0];
		CorrectAnswers [19] = answers[19][2];
		CorrectAnswers [20] = answers[20][3];
		CorrectAnswers [21] = answers[21][1];
		CorrectAnswers [22] = answers[22][0];
		CorrectAnswers [23] = answers[23][1];
		CorrectAnswers [24] = answers[24][2];
		CorrectAnswers [25] = answers[25][2];		
		CorrectAnswers [26] = answers[26][2];

		CorrectAnswers [27] = answers[27][2];
		CorrectAnswers [28] = answers[28][3];
		CorrectAnswers [29] = answers[29][3];
		CorrectAnswers [30] = answers[30][2];
		CorrectAnswers [31] = answers[31][2];
		CorrectAnswers [32] = answers[32][3];
		CorrectAnswers [33] = answers[33][0];
		CorrectAnswers [34] = answers[34][3];
		CorrectAnswers [35] = answers[35][1];
		CorrectAnswers [36] = answers[36][0];
		CorrectAnswers [37] = answers[37][1];
		CorrectAnswers [38] = answers[38][2];
		CorrectAnswers [39] = answers[39][0];
		CorrectAnswers [40] = answers[40][2];
		CorrectAnswers [41] = answers[41][3];
		CorrectAnswers [42] = answers[42][0];
		CorrectAnswers [43] = answers[43][1];
		CorrectAnswers [44] = answers[44][0];
		CorrectAnswers [45] = answers[45][3];
		CorrectAnswers [46] = answers[46][0];
		CorrectAnswers [47] = answers[47][1];
		CorrectAnswers [48] = answers[48][2];
		CorrectAnswers [49] = answers[49][2];
		CorrectAnswers [50] = answers[50][2];
		CorrectAnswers [51] = answers[51][2];
		CorrectAnswers [52] = answers[52][0];
		
		CorrectAnswers [53] = answers[53][2];
		CorrectAnswers [54] = answers[54][2];
		CorrectAnswers [55] = answers[55][2];
		CorrectAnswers [56] = answers[56][0];
		CorrectAnswers [57] = answers[57][3];
		CorrectAnswers [58] = answers[58][1];
		CorrectAnswers [59] = answers[59][1];
		CorrectAnswers [60] = answers[60][2];
		CorrectAnswers [61] = answers[61][2];
		CorrectAnswers [62] = answers[62][3];
		CorrectAnswers [63] = answers[63][1];
		CorrectAnswers [64] = answers[64][2];
		CorrectAnswers [65] = answers[65][1];
		CorrectAnswers [66] = answers[66][2];
		CorrectAnswers [67] = answers[67][2];
		CorrectAnswers [68] = answers[68][3];
		CorrectAnswers [69] = answers[69][1];
		CorrectAnswers [70] = answers[70][1];
		CorrectAnswers [71] = answers[71][1];
		CorrectAnswers [72] = answers[72][2];
		CorrectAnswers [73] = answers[73][1];
		CorrectAnswers [74] = answers[74][2];
	}

	
	public void ConstructAnswerTexts() {
		
		AnswerTexts.add("\r\n"
				+ "Η Φρίντα Κάλο ήταν Μεξικάνα ζωγράφος.\n"
				+ " Γεννήθηκε το 1907 και πέθανε το 1954.\n"
				+ " Επαναστάτρια που απέδωσε σε έργα τέχνης\n"
				+ " τον πόνο της και τις ιδέες της παλεύοντας \n"
				+ " με όλα τα κοινωνικά ταμπού του περασμένου αιώνα!\r\n");
		AnswerTexts.add(" ");
		AnswerTexts.add("Ο Νικόλαος Δοξαράς υπήρξε ζωγράφος της Επτανησιακής Σχολής, \n"
				+ " γιος του ζωγράφου και θεωρητικού της τέχνης Παναγιώτη Δοξαρά. \n"
				+ "Ένα από τα σημαντικότερα έργα του ήταν η διακόσμηση του Θόλου\n"
				+ " του ναού της Φανερωμένης στη Ζάκυνθο.\n"
				+ " Η διακόσμηση του παρουσιάζει ιδιαίτερο ενδιαφέρον γιατί,\n"
				+ "αντί για τη συνηθισμένη παράσταση της μορφής του Παντοκράτορα,\n"
				+ " εικονίζονται η Γέννηση, η Κοίμηση και η Μετάσταση της Θεοτόκου,\n"
				+ " σύμφωνα με τα πρότυπα της καθολικής εκκλησίας! ");
		AnswerTexts.add("Ο τίτλος που έδωσε ο καλλιτέχνης στον πίνακα είναι «Άνοιξη στην Οίτη» \n"
				+ "και προκειμένου να αναδείξει αυτήν την εποχή του χρόνου χρησιμοποίησε διάφορες\n"
				+ "αποχρώσεις του πράσινου και έκανε εμφανή τα πυκνά φύλλα των δέντρων, τις παπαρούνες \n"
				+ "και τα διάφορα λουλούδια στο έδαφος, χαρακτηριστικά στοιχεία της άνοιξης. ");
		AnswerTexts.add("Μετά από τον αυλότοιχο και την εκκλησία οδηγούμαστε στη βαθιά γαλάζια θάλασσα \n"
				+ "στο κέντρο της οποίας βρίσκεται το νησάκι της Καμένης με το σβησμένο ηφαίστειο, \n"
				+ "χαρακτηριστικό γνώρισμα του νησιού της Σαντορίνης. Για αυτό άλλωστε αποτελεί και τον τίτλο του έργου. ");
		AnswerTexts.add("Η προσωπογραφία ήταν ευρύτατα διαδομένη στους αρχαίους Έλληνες και τους Ρωμαίους! \n"
				+ "Ονομαστές στην αρχαιότητα για την τεχνική τους αρτιότητα ήταν μεταξύ άλλων οι προσωπογραφίες του Αρχέλαου,\n"
				+ " όπως και η απεικόνιση του Μεγάλου Αλεξάνδρου από τον ζωγράφο Απελλή. \n"
				+ "Η εξέλιξη της προσωπογραφίας το 15ο αιώνα ήταν επίσης σημαντική, \n"
				+ "καθώς ζωγράφοι όπως ο Μπελίνι και ο Μποτιτσέλι έδωσαν αριστουργήματα του είδους.  ");
		AnswerTexts.add("Ο Λάντσας Βικέντιος, ιταλικής καταγωγής, σπούδασε ζωγραφική στην \n Ακαδημία Καλών Τεχνών της Βενετίας.\n"
				+ " Μετά την αποτυχία της ιταλικής επανάστασης εναντίον των Αυστριακών το 1848, \n"
				+ "στην οποία έλαβε μέρος, κατέφυγε ως πολιτικός εξόριστος στην Ελλάδα. \n"
				+ "Για την προσφορά του στους αγώνες της πατρίδας του τιμήθηκε αργότερα με\n  αργυρό παράσημο και με τρία ιταλικά παράσημα.\n"
				+ " Χρησιμοποιώντας κατά κύριο λόγο την υδατογραφία, απεικόνισε αρχαιολογικούς \nτόπους και μνημεία,"
				+ " καθιερώνοντας ως ιδιαίτερο αυτό το είδος της τοπιογραφίας. ");
		AnswerTexts.add(" ");
		AnswerTexts.add("Ο Κωνσταντίνος Βολανάκης, ο δημιουργός του έργου,\n είναι ο πιο σημαντικός Έλληνας θαλασσογράφος του 19ου αιώνα.\n"
				+ " Το συγκεκριμένο έργο έχει ως θέμα μια σκηνή τσίρκου,\n από ένα φεστιβάλ που οργανώνεται μέχρι και σήμερα κάθε Οκτώβριο στο Μόναχο,\n"
				+ " το Oktoberfest. Από τις κατάμεστες από κόσμο κερκίδες ενός αυτοσχέδιου θεάτρου\n οι θεατές παρακολουθούν τα «ακροβατικά» \n"
				+ " που εκτελούν δύο ελέφαντες σε μια κυκλική εξέδρα, υπό τις εντολές ενός θηριοδαμαστή. ");
		AnswerTexts.add(" ");
		AnswerTexts.add(" ");
		AnswerTexts.add(" ");
		AnswerTexts.add(" ");
		AnswerTexts.add(" ");
		AnswerTexts.add(" ");
		AnswerTexts.add("Τα \"Αρραβωνιάσματα των παιδιών\" είναι ένα έργο που απέσπασε πολλές διακρίσεις,\n"
				+ " απεικονίζει δε ένα έθιμο από τον καιρό της Τουρκοκρατίας.\n Οι γονείς αρραβώνιαζαν τα παιδιά από μικρά,\n"
				+ " ίσως για να τα προστατέψουν από το παιδομάζωμα. \nΣτο εσωτερικό ενός χωριάτικου σπιτιού ξετυλίγεται η χαρούμενη σκηνή\n"
				+ " σε ημικυκλική διάταξη. Στο κέντρο της σκηνής ο ιερέας έχει\n ήδη περάσει το δαχτυλίδι στο ξαφνιασμένο αγοράκι,\n"
				+ " ενώ το κοριτσάκι χαμηλοκοιτάζει ντροπαλό \nστο κάλεσμα του γέροντα να του φορέσει τον αρραβώνα. \n");
		AnswerTexts.add("Ο πίνακας φέρει τον τίτλο «Ο τεχνοκρίτης», που σημαίνει κριτικός έργων τέχνης. ");
		AnswerTexts.add("\r\n"
				+ "Το Πήλιο είναι βουνό στο Νομό Μαγνησίας, με ύψος 1.624 μέτρα. \nΚατά την Ελληνική μυθολογία ήταν θερινή κατοικία των θεών\n"
				+ " και πατρίδα των Κενταύρων.\r\n");
		AnswerTexts.add("Το 2015, το λιμάνι του Πειραιά ήταν το έκτο μεγαλύτερο λιμάνι\n"
				+ " στην Ευρώπη ως προς τον αριθμό διέλευσης των επιβατών\n"
				+ " και το 26ο μεγαλύτερο στον κόσμο ως προς \n"
				+ "τον ετήσιο όγκο των εμπορευματοκιβωτίων!");
		AnswerTexts.add(" ");
		AnswerTexts.add(" ");
		AnswerTexts.add("Η φλογέρα αποτελεί όργανο της κατηγορίας των πνευστών και στα αγγλικά λέγεται recorder!");
		AnswerTexts.add("Το γυμνό ως αυτόνομο είδος ξαναγυρίζει στην τέχνη,\n ύστερα από την έκλειψη του Μεσαίωνα,\n"
				+ " τον καιρό της Αναγέννησης, γύρω στα μέσα του 15ου αιώνα. \nΑπό την εποχή εκείνη έγινε θεσμός κάθε\n"
				+ " γυναικείο γυμνό στη ζωγραφική να έχει πρότυπο την Αφροδίτη, τη θεά του Έρωτα. Οι εξαιρέσεις ήταν πολλές \n"
				+ "και συχνά δημιουργούσαν σκάνδαλα. ");
		AnswerTexts.add(" ");
		AnswerTexts.add(" ");
		AnswerTexts.add(" ");//26
		
		//metrio
		
		AnswerTexts.add(" ");
		AnswerTexts.add(" ");
		AnswerTexts.add("Ο πίνακας φέρει τον τίτλο «Η Κρίση του Πάριδος» και \nαναπαριστά ένα διάσημο μυθικό θέμα που προμήνυε\n"
				+ " τον Τρωικό πόλεμο: την κρίση του Πάρη. Παρουσιάζει έναν\n διαγωνισμό ομορφιάς ανάμεσα στις σημαντικότερες θεές (Ήρα, Αθηνά, Αφροδίτη). \n"
				+ "Ο πρίγκηπας της Τροίας, Πάρης, είχε το ρόλο του κριτή. ");
		AnswerTexts.add(" ");
		AnswerTexts.add(" ");
		AnswerTexts.add(" ");
		AnswerTexts.add(" ");
		AnswerTexts.add(" ");
		AnswerTexts.add(" ");
		AnswerTexts.add(" ");
		AnswerTexts.add(" ");
		AnswerTexts.add("Ο πίνακας του Βυζάντιου Περικλή «Εσωτερικό ή Το δωμάτιο του καλλιτέχνη \nστο Παρίσι» παρουσιάζει αρκετές ομοιότητες \n"
				+ "και σίγουρα φέρνει στο νου του θεατή τον πίνακα «Υπνοδωμάτιο στην Αρλ» \nου Βίνσεντ Βαν Γκογκ, ένα από τα πιο\n"
				+ " διάσημα έργα του καλλιτέχνη.");
		AnswerTexts.add("Ο ταμπουράς είναι ένα έγχορδο μουσικό όργανο με μακριά ταστιέρα,\n απόγονος της αρχαιοελληνικής πανδούρας και πρόγονος άλλων οργάνων \n"
				+ ",όπως το λαούτο και το τούρκικο σάζι.\n"
				+ " Σήμερα στην Ελλάδα διδάσκεται ως υποχρεωτικό παραδοσιακό όργανο σε πολλά μουσικά σχολεία. ");
		AnswerTexts.add(" ");
		AnswerTexts.add(" ");
		AnswerTexts.add("Το γνωστότερο έργο της Ελισάβετ Μουτζάν-Μαρτινέγκου είναι \nη Αυτοβιογραφία της, ενώ από τα υπόλοιπα έργα της \n"
				+ "(θεατρικά έργα και ποιήματα) έχουν σωθεί ελάχιστα. ");
		AnswerTexts.add("Η Επτανησιακή Σχολή αφορά τη καλλιτεχνική παραγωγή στα νησιά του Ιονίου το 18ο\n"
				+ "και στις αρχές του 19ου αιώνα.\n"
				+ " Χαρακτηριστικός εκπρόσωπος της Επτανησιακής Σχολής στο χώρο της ποίησης είναι ο Διονύσιος Σολωμός.");
		AnswerTexts.add("Ο Χαράλαμπος Παχής, ο δημιουργός αυτού του πίνακα, ήταν βραβευμένος Κερκυραίος \nζωγράφος που έζησε τον 19ο αιώνα.\n"
				+ " Η «Πρωτομαγιά στην Κέρκυρα» αποτελεί χαρακτηριστικό έργο της Επτανησιακής Σχολής\n"
				+ " και θεωρείται ένας πραγματικός θησαυρός ελληνικών λαογραφικών πληροφοριών\n για την αστικοποιημένη επτανησιακή κοινωνία. ");
		AnswerTexts.add(" ");
		AnswerTexts.add("Ο Θεόδωρος Βρυζάκης, ο ζωγράφος αυτού του έργου, υπήρξε ορφανό του πολέμου της Ανεξαρτησίας \n"
				+ "(τον πατέρα του τον είχαν κρεμάσει οι Τούρκοι). \nΣπούδασε στο Μόναχο και έγινε ο κυριότερος  έλληνας ζωγράφος ιστορικών σκηνών.");
		AnswerTexts.add(" ");
		AnswerTexts.add(" ");
		AnswerTexts.add("Ήταν γνωστές ως «Παραμάνες», «Ψυχομάνες» ή «Καλομάνες».");
		AnswerTexts.add(" ");
		AnswerTexts.add(" ");
		AnswerTexts.add(" ");//52
		
		//dyskolo
		
		AnswerTexts.add("Η τεχνική του λαδιού σε μουσαμά, γνωστή και ως η τεχνική της ελαιογραφίας,\n"
				+ " η οποία χρησιμοποιείται από την αρχαιότητα, \nείναι ζωγραφική με χρωστικές ουσίες ανακατεμένες με ξηραινόμενο έλαιο,\n"
				+ " συνήθως λινέλαιο, σε ειδικά προετοιμασμένο καμβά. \nΔιαφορετικά έλαια προσδίδουν διάφορες ιδιότητες στο χρώμα,\n"
				+ " όπως  φωτεινότητα,  λάμψη ή  διαφορετικό χρόνο ξήρανσης.  ");
		AnswerTexts.add("Προσέξτε την επίδραση του φωτός πάνω στις μορφές: \nτο μωρό «λαμπαδιάζει» ολόλευκο και ολόξανθο από το φυσικό φως\n"
				+ " που εισβάλλει από το παράθυρο. Γίνεται έτσι το σύμβολο της νέας ζωής που ανατέλλει.\n Το φως που έρχεται αντίθετα «ανάβει»\n"
				+ " και τονίζει με μια φωτεινή αύρα τα περιγράμματα του κοριτσιού. ");
		AnswerTexts.add(" ");
		AnswerTexts.add("Συγκεκριμένα ο πίνακας αυτός δημιουργήθηκε από τον Νικόλαο Λύτρα το 1925,\n"
				+ " μόλις 2 χρόνια πριν τον αιφνίδιο θάνατό του από φυματίωση τον Δεκέμβριο του 1927. ");
		AnswerTexts.add("Ο Ν.Λύτρας θεωρείται ένας από τους κύριους ανανεωτές\n της ελληνικής ζωγραφικής καθώς στα λίγα χρόνια\n"
				+ " που δίδαξε στην Ανώτατη Σχολή Καλών Τεχνών, \nκατάφερε να αλλάξει τη δομή και τον ρόλο των εργαστηρίων \n"
				+ "και πρόλαβε να εισαγάγει στη σχολή τα νέα ρεύματα,\n καθώς και μια νέα οπτική της τέχνης και της διδασκαλίας της. \n"
				+ "Δυστυχώς όμως έφυγε από την ζωή νέος αφήνοντας πίσω του πρωτοποριακό έργο, η αναγνώριση του οποίου ήλθε αργότερα.");
		AnswerTexts.add(" ");
		AnswerTexts.add(" ");
		AnswerTexts.add(" ");
		AnswerTexts.add(" ");
		AnswerTexts.add(" ");
		AnswerTexts.add(" ");
		AnswerTexts.add("Ο Νικόλαος Λύτρας, έπειτα από μία σειρά πορτρέτων που εικονίζουν\n τη μαθήτρια και μελλοντική σύζυγό του,\n"
				+ "το 1917 φιλοτεχνεί αυτό το πορτρέτο το οποίο και αφιερώνει στη γυναίκα του, επίσης ζωγράφο, Μαρία Χορς.\n"
				+ " Αδιαμφισβήτητα αποτελεί μία από τις ωραιότερες προσωπογραφίες της μοντέρνας τέχνης. ");
		AnswerTexts.add(" ");
		AnswerTexts.add(" ");
		AnswerTexts.add("Ο Νικόλαος Λύτρας ήταν διακεκριμένος Έλληνας ζωγράφος των αρχών του 20ού αιώνα. \n"
				+ "Σπούδασε ζωγραφική στην μετέπειτα Ανωτάτη Σχολή Καλών Τεχνών της Αθήνας,\n με δάσκαλους τον πατέρα του Νικηφόρο \n"
				+ "και τον Γ. Ιακωβίδη και έπειτα στο εξωτερικό.\n Θεωρείται πως με την ιδιαίτερη τεχνοτροπία του σε σχέση με το χρώμα,\n"
				+ " εισήγαγε στην Ελλάδα τον εξπρεσιονισμό.  ");
		AnswerTexts.add(" ");
		AnswerTexts.add(" ");
		AnswerTexts.add("Ο πίνακας είναι προσωπογραφία του Φαναριώτη Γεωργίου Κωτσάκη!");
		AnswerTexts.add(" ");
		AnswerTexts.add(" ");
		AnswerTexts.add(" ");
		AnswerTexts.add("Στο έργο του «Το αίνιγμα της φυσιογνωμίας του ανθρώπου»,\n ο Σπαχής συνδυάζει την τεχνική του λαδιού \n"
				+ "σε μουσαμά με μία ανάγλυφη γύψινη φιγούρα, δίνοντας στην εικόνα μία νέα διάσταση. ");
		AnswerTexts.add("Ο Γιάννης Γαΐτης είναι ένας από τους πιο χαρακτηριστικούς \nκαι πρωτότυπους εκπροσώπους της Ποπ-αρτ στην Ελλάδα.\n"
				+ " Δημιούργησε μια αρχετυπική σχηματοποιημένη φιγούρα που συμπύκνωνε\n τα χαρακτηριστικά του ανθρώπου της μαζικής,\n"
				+ "απρόσωπης καταναλωτικής κοινωνίας η οποία τελικά έγινε σήμα κατατεθέν της τέχνης του. \n"
				+ "Με το αρχετυπικό αυτό σύμβολο ο Γαΐτης κατάφερε να διατυπώσει \nένα οξύ κοινωνικό σχόλιο, δημιουργώντας αναγνωρίσιμες \n"
				+ "εικόνες με χιούμορ και φαντασία, που παραμένουν ευχάριστες και διακοσμητικές,\n παρά τη δυσάρεστη πραγματικότητα που καταγγέλλουν.");//75		
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
		AnsweredQuestions = AnsweredQuestions + 1; 
		progressbar.setValue(AnsweredQuestions*10);//one more question gets answered
		if(AnswerTexts.get(x) != " ") {
			//if there is an explanation for the answer it shows up in a new frame
			AnswerLabel.setText(AnswerTexts.get(x));
			AnswerLabel.setSize(200, 200);
			AnswerLabel.setFont(new Font(null,Font.CENTER_BASELINE,20));
			AnswerLabel.setEditable(false);
			AnswerFrame.add(AnswerLabel);
			AnswerFrame.setSize(1000,300);
			AnswerFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			AnswerFrame.getContentPane().setBackground( Color.WHITE );
			AnswerFrame.setLocationRelativeTo(null); 
			AnswerFrame.setVisible(true);
		}
	}

	
		 int score =0;
		 
		 private String highscore = "Nobody:0";
		 
		 public String GetHighScoreValue () {
			
			FileReader readFile = null;
			BufferedReader reader = null;
			 
			 try 
			 {
				readFile = new FileReader("highscore.txt");
				reader = new BufferedReader(readFile);
				return reader.readLine();
			} catch (IOException e) {
				
				return ":0";
			} 
			 finally {
				 
				 try {
					 if (reader != null) {
						 reader.close();
					 }
						 
				} catch (IOException e) {
					e.printStackTrace();
				}
			 }
			 
			 
		 }
		 int counter =0;
		public void AnswerButtonPressed(int QuestionNumber) {
			
			counter++;
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
			//mexri4 1o level mexri7 2o mexri10 3o		
			if (counter < 3) {
				score = score + 10;
			}else if (counter < 7) {
				score= score + 20;
			}else if (counter < 10){
				score = score + 30;
			}
			
			messageLabel.setForeground(Color.GREEN);
			messageLabel.setText("Σωστό");
			messageLabel.setVisible(true);
			b[QuestionNumber][x].setBackground(Color.GREEN);
			//sethighscore and create file
			scoreLabel.setText("Score: " + score + "  "  );
			CheckHighScore();
									
		}
		
		String username;
		
		public void CheckHighScore() {
			if (score > Integer.parseInt(GetHighScoreValue().split(":")[1])) {
				highscore = username + ":" + score;
				System.out.print(username);
				highScoreLabel.setText("Highscore " + highscore);
				File scoreFile = new File("highscore.txt");
				if (!scoreFile.exists()) {
					try {
						scoreFile.createNewFile();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
				FileWriter writeFile  = null;
				BufferedWriter writer = null;
				try {
					writeFile = new FileWriter(scoreFile);
					writer = new BufferedWriter(writeFile);
					writer.write(this.highscore);
				}
				catch (Exception e) {
					//error
				}
				finally {
					try {
						if (writer != null) {
							writer.close();
						}
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
		}

		public void WrongButtonPressed(int QuestionNumber,int x) {
			//if they answer wrong, pressed button turns red and message "WRONG" shows up
			messageLabel.setForeground(Color.red);
			messageLabel.setText("Λάθος");
			messageLabel.setVisible(true);
			b[QuestionNumber][x].setBackground(Color.RED);
		}

		
		public void setCorrectGreen(int QuestionNumber) {
			//if player's answer is wrong this method shows which was the correct one by turning its button green
			int x = -1;
			for(int j = 0; j < 4; j++) {
				if(CorrectAnswers[QuestionNumber] == answers[QuestionNumber][j]) {
					x = j;
				}
			}
			b[QuestionNumber][x].setBackground(Color.green);
		}
		
		MultiplePanels(String username){

			this.username = username;
		
		ConstructQuestions();
    	ConstructImages();
    	ConstructAnswers();
    	CorrectAnswers();
		ConstructHints();
    	ConstructAnswerTexts();
    	ConstructProgressBar();
    	ConstructScoreLabel();
    		
	}
	
	public void setPanels(){ 
		panel1.setBackground(Color.white);
    	panel2.setBackground(Color.white);
    	panel3.setBackground(Color.white);
    		
    		
	}
			
	
	
	//Get selected size number without duplicate
    public static ArrayList<Integer> getRandomNonRepeatingIntegers(int size, int min,
            int max) {
    	ArrayList<Integer> numbers = new ArrayList<Integer>();
        Random random = new Random();
        while (numbers.size() < size) {
            //Get Random numbers between range
            int randomNumber = random.nextInt((max - min) + 1) + min;
            //Check for duplicate values
            if (!numbers.contains(randomNumber)) {
                numbers.add(randomNumber);
            }
        }
		return numbers;
    }  
	
    
	public static ArrayList<Integer> createRandomNumberList() {
		ArrayList<Integer> q_numbers = new ArrayList<Integer>();
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers = getRandomNonRepeatingIntegers(3, 0, 26);
		for (int i = 0 ; i<3 ; i++) {
			q_numbers.add(numbers.get(i));
		}
		numbers = getRandomNonRepeatingIntegers(4, 27, 52);
		for (int i = 3 ; i<7 ; i++) {
			q_numbers.add(numbers.get(i-3));
		}
		numbers = getRandomNonRepeatingIntegers(3, 53, 74);
		for (int i = 7 ; i<10 ; i++) {
			q_numbers.add(numbers.get(i-7));
		}
		//System.out.print(q_numbers);
		return q_numbers;
	}
	
	
	public void setAllFrames() {
    	//disable button NextQuestion so as to the user not be able to press it unless they first answer existed question
		NextQuestion.setEnabled(false);
		
		// add progress bar to panel3
		
    	panel3.add(progressbar);
    	
    	//add score, highscore to panel3
    	
    	panel3.add(scoreLabel,BorderLayout.WEST);
    	panel3.add(highScoreLabel,BorderLayout.NORTH);
    	
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
				Image icon = ImageIO.read(getClass().getResource("/hintaki.png"));
				HintButton.setIcon(new ImageIcon(icon));
			} catch (IOException ex) {
			}
			panel2.add(HintButton);
			
			HintFrame.setSize(500,400);
			HintFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			HintFrame.getContentPane().setBackground( Color.WHITE );
			HintFrame.setLocationRelativeTo(null);  

			HintLabel.setText(Hints.get(question_number));
			HintLabel.setSize(200, 200);
			HintLabel.setFont(new Font(null,Font.CENTER_BASELINE,20));	
			HintLabel.setEditable(false);
			
				try {
					JLabel background = new JLabel(new ImageIcon((ImageIO.read(getClass().getResource("/hint2.png")))));
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
						//score = score - 5;
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
	                		setCorrectGreen(question_number);
	                	}
	                }else if(e.getSource() == b[question_number][1] ) {
	                	
	                	AnswerButtonPressed(question_number);
				
	                	if(b[question_number][1].getText() == CorrectAnswers[question_number]) {
	                		CorrectButtonPressed(question_number,1);
	                	}else {
	                		WrongButtonPressed(question_number,1);
	                		setCorrectGreen(question_number);
	                	}
	                }else if(e.getSource() == b[question_number][2] ) {
	                	
	                	AnswerButtonPressed(question_number);
				
	                	if(b[question_number][2].getText() == CorrectAnswers[question_number]) {
	                		CorrectButtonPressed(question_number,2);
	                	}else {
	                		WrongButtonPressed(question_number,2);
	                		setCorrectGreen(question_number);
	                	}
	                }else if(e.getSource() == b[question_number][3] ) {
	                	
	                	AnswerButtonPressed(question_number);
				
	                	if(b[question_number][3].getText() == CorrectAnswers[question_number]) {
	                		CorrectButtonPressed(question_number,3);
	                	}else {
	                		WrongButtonPressed(question_number,3);
	                		setCorrectGreen(question_number);
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
			frame.setSize(1300,1000);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setLocationRelativeTo(null);  
			frame.setVisible(true);
			
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		if (AnsweredQuestions == 10) {
		panel1.setVisible(false);
		panel2.setVisible(false);
		panel3.setVisible(false);
		
		
		frame.dispose();
		
	    HintFrame.remove(HintLabel);
	   	HintFrame.dispose();

	    AnswerFrame.remove(AnswerLabel);
	   	AnswerFrame.dispose();
		}
		
		if (e.getSource() == NextQuestion) {
			if (AnsweredQuestions <10) {
				question_number = q_numbers.get(AnsweredQuestions);
			
				//if NextQuestion button is pressed a new frame shows up with different question
				panel1.setVisible(false);
				panel2.setVisible(false);
				panel3.setVisible(false);
				
				panel1 = new JPanel(); 
			    panel2 = new JPanel();
			    panel3  = new JPanel();
				
			    HintFrame.remove(HintLabel);
			   	HintFrame.dispose();
	
			    AnswerFrame.remove(AnswerLabel);
			   	AnswerFrame.dispose();
			   	
			    setPanels();
			    setAllFrames();
			}else if (AnsweredQuestions == 10) {			
			   	
			   	AnsweredQuestions +=1; 
			   	//System.out.print("ok");
				YourScore finalscore = new YourScore(score, highscore);
			}
		
		}

	
	}
}
