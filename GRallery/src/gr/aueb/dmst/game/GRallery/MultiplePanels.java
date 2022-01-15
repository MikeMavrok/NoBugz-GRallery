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
	
	JButton[][] b = new JButton[75][4];
	JButton NextQuestion = new JButton("Next Question");
	
	JLabel messageLabel = new JLabel();
	
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



		answers[27][0] = "Ο Μενέλαος";
		answers[27][1] = "Ο Αγέλαος";
		answers[27][2] = "Ο Πηλέας";
		answers[27][3] = "Ο Πάρης";



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



		answers[39][0] = "Τα ιδιοτροπότερα σε χρώμα και σχέδιο";
		answers[39][1] = "Τα πιο ιδιαίτερα σε χρώμα και σχέδιο";
		answers[39][2] = "Τα πιο εντυπωσιακά σε χρώμα και σχέδιο";
		answers[39][3] = "Τα ομορφότερα σε χρώμα και σχέδιο";



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
		answers[44][2] = "Η Ελλάδα πάνω στα ερείπια του Μεσολογγίου";
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



		answers[60][0] = "Την επέμβαση του ανθρώπου στο φυσικό περιβάλλον";
		answers[60][1] = "Την ομορφιά του ελληνικού καλοκαιριού";
		answers[60][2] = "Την ισότιμη συμμετοχή φυσικού και δομημένου περιβάλλοντος";
		answers[60][3] = "Την ομορφιά μόνο του φυσικού περιβάλλοντος ";



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
		answers[65][3] = "Αρ Ντεκώ και Κονστρουκτιβισμό";



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



		answers[72][0] = "Η ωραία Ελένη1";
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
	

	
	
	public void ConstructQuestions() { questions.add("Ποια άλλη διάσημη ζωγράφο που γνωρίζετε \n σας θυμίζει η εικονιζόμενη;");
	questions.add("Πρόκειται για έναν Άγγλο αριστοκράτη με ταραχώδη βίο, \n λόγιο, πολιτικό, και μια εμβληματική μορφή του ρομαντισμού.\n Συγκαταλέγεται στους μεγαλύτερους Βρετανούς ποιητές και παραμένει ακόμα και σήμερα δημοφιλής.\n Χαρακτηριστικό του έργο αποτελεί το ποίημα «Don Juan».\n Ποιο είναι το όνομά του;");
	questions.add("Ποια ευαγγελική σκηνή αποτυπώνεται στην παραπάνω εικόνα;");
	questions.add("Ο παραπάνω πίνακας του Νικόλαου Οθωναίου αναφέρεται σε μία συγκεκριμένη \n εποχή του χρόνου. Με βάση τα χρώματα που χρησιμοποιεί και τα φυσικά \n στοιχεία που παρουσιάζει ποια πιστεύετε πως είναι αυτή;");
	questions.add("Ο Κωνσταντίνος Μαλέας έστησε το καβαλέτο του στο ύψωμα \n αυτού του κυκλαδίτικου νησιού για να ζωγραφίσει το λευκό όμορφο εκκλησάκι περιτριγυρισμένο \n από ταπεινά νησιώτικα σπίτια γύρω στα 1924-1928. Παρατηρώντας \n προσεκτικά τις λεπτομέρειες του πίνακα, ποιο νησί των Κυκλάδων \n πιστεύετε πως απεικονίζεται;");
	questions.add("Πώς ονομάζεται στη ζωγραφική και στις άλλες τέχνες,\n η εύστοχη απεικόνιση ενός \n προσώπου, αλλά και της προσωπικότητας, των συναισθημάτων και \n του ψυχικού κόσμου αυτού του προσώπου όπως το αντιλαμβάνεται ο δημιουργός;");
	questions.add("Ποιος αρχαίος ναός απεικονίζεται στον πίνακα;");
	questions.add(" 8");
	questions.add("Τι είδους εκδήλωση αναπαρίσταται στον \n συγκεκριμένο πίνακα;");
	questions.add("Με βάση την ενδυμασία του εικονιζόμενου και την πίπα που κρατάει,\n ποια θα λέγατε ότι είναι η καταγωγή του;");
	questions.add("Πώς ονομάζεται στην εικαστική τέχνη η \n απεικόνιση του θαλασσινού θέματος;");
	questions.add("«Στων Ψαρών την ολόμαυρη ράχη περπατώντας η Δόξα μονάχη,\n μελετά τα λαμπρά παλικάρια και στην κόμη στεφάνι φορεί\n γινωμένο από λίγα χορτάρια που ’χαν μείνει στην έρημη γη.»\n Ποιος έγραψε το ποίημα «Η Καταστροφή των Ψαρών» από το οποίο \n εμπνεύστηκε ο Νικόλαος Γύζης\n για να δημιουργήσει τη «Δόξα των Ψαρών»;");
	questions.add("Η ελληνική ………..εμπνέεται από τα ήθη και τα έθιμα του ελληνικού λαού,\n όπως συμβαίνει και με την αντίστοιχη λογοτεχνία της εποχής. Δεν είναι τυχαίο ότι \n την ίδια περίοδο δημιουργούνται οι επιστήμες της Λαογραφίας και της Γλωσσολογίας,\n ενώ ταυτόχρονα αρχίζει η διαμάχη για την αξία της δημοτικής γλώσσας.\n Ποια λέξη λείπει;");
	questions.add("14");
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
	questions.add("27");
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
	questions.add("40");
	questions.add("Με ποια τεχνική ζωγραφικής έχει φτιαχτεί ο παραπάνω πίνακας;");
	questions.add("Η Ελισάβετ Μουτζάν-Μαρτινέγκου (1801-1832),από μικρή είχε ιδιαίτερο ενδιαφέρον για \n την μάθηση και τα γράμματα και, παρόλο που η εκπαίδευσή της ήταν περιορισμένη η ίδια με προσωπική μελέτη \n απέκτησε γνώσεις της αρχαίας ελληνικής, της ιταλικής και της γαλλικής γλώσσας. \n Η Ελισάβετ Μουτζάν-Μαρτινέγκου είναι η πρώτη ελληνίδα:");
	questions.add("Ο συγκεκριμένος πίνακας δημιουργήθηκε το 1819. \n Σε ποιο καλλιτεχνικό ρεύμα θεωρείτε ότι ανήκει;");
	questions.add("44");
	questions.add("Πασίγνωστος πίνακας του Έλληνα ζωγράφου Θεόδωρου Βρυζάκη, του έτους 1858. \n Πρόκειται για έργο με ιδιαίτερο συμβολισμό, αφού απεικονίζει την Ελλάδα με τη μορφή νέας στεφανωμένης γυναίκας, \n ενδεδυμένης αρχαιοπρεπώς, εν μέσω αγωνιστών της Επανάστασης του 1821, να έχει σπάσει \n τις αλυσίδες της σκλαβιάς από τα πόδια της. \n Ποιο είναι το όνομα αυτού του πίνακα;");
	questions.add("46");
	questions.add("Το «Εμπρός στο τζάκι» αποτελεί ένα από τα πιο γνωστά έργα της ζωγράφου Σοφίας Λασκαρίδου \n καθώς δέχθηκε πολύ ευνοϊκά σχόλια από Γάλλους κριτικούς, όταν παρουσιάστηκε το 1914 στο Salon των Γάλλων καλλιτεχνών. \n Ποια τεχνική πιστεύετε πως έχει χρησιμοποιήσει η καλλιτέχνης στον συγκεκριμένο πίνακα;");
	questions.add("Ο Παύλος Ροδοκανάκης φιλοτέχνησε τον συγκεκριμένο πίνακα γύρω στο 1919. Το έργο θεωρείται \n συμβολιστικό και διακρίνεται για την καθαρά ιδεαλιστική φωνή και το ποιητικό του περιεχόμενο. \n Ποιος πιστεύετε ότι είναι ο τίτλος του;");
	questions.add("49");
	questions.add("Πρόκεται για νησί του Αργοσαρωνικού. Οι \n άνθρωποί του ασχολούνται κυρίως με την ναυτιλία, την αλιεία και τον τουρισμό. \n Είναι εξαιρετικά γραφικό, αρχοντικό και κοσμοπολίτικο νησί, το \n οποίο μάλιστα διαδραμάτισε σπουδαίο ρόλο στην ελληνική επανάσταση του ‘21. \n Ποιο είναι το όνομα του νησιού, το οποίο αποτελεί και τον τίτλο του πίνακα;");
	questions.add("Ποιο μουσικό όργανο μπορείτε να διακρίνετε μέσα στον πίνακα;");
	questions.add("52");
	//////////////DYSKOLO
	questions.add("Ποια τεχνική ζωγραφικής έχει χρησιμοποιηθεί στον παραπάνω πίνακα;");
	questions.add("54");
	questions.add("55");
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
	questions.add("70");
	questions.add("71");
	questions.add("Με ποια τεχνική ζωγραφικής εκτιμάτε \n ότι έχει δημιουργηθεί αυτός ο πίνακας;");
	questions.add("Ποια πιστεύετε ότι είναι η γυναίκα που έχει \n απεικονίσει στο έργο του ο Κωνσταντίνος Παρθένης;");
	questions.add("Η ανθρώπινη φιγούρα στον πίνακα είναι ανάγλυφη.\n Από τι υλικό μπορεί να έχει φτιαχτεί;");
	questions.add("75"); }


	
	
	public void CorrectAnswers() {
		CorrectAnswers[0] = answers[0][1];
		CorrectAnswers[1] = answers[1][1];
		CorrectAnswers[2] = answers[2][0];
	}
	
	public void ConstructAnswerTexts() {
		//AnswerTexts.add("Ο Νίκος Λύτρας ήταν διακεκριμένος Έλληνας ζωγράφος των αρχών \nτου 20ού αιώνα. Σπούδασε ζωγραφική στο Σχολείο των Τεχνών \n(την μετέπειτα Ανωτάτη Σχολή Καλών Τεχνών) της Αθήνας από το \n1902 έως το 1906, με δάσκαλους τον πατέρα του Νικηφόρο Λύτρα και \nτον Γεώργιο Ιακωβίδη. Συνέχισε τις σπουδές του στην Ακαδημία \nτου Μονάχου από το 1907 έως το 1912, με δάσκαλο τον Λούντβιχ φον \nΛοφτς.Θεωρείται πως με την ιδιαίτερη τεχνοτροπία του σε σχέση με το \nχρώμα, εισήγαγε στην Ελλάδα τον εξπρεσιονισμό. ");
		for (int i=0; i<75 ; i++){
 		AnswerTexts.add(" ");
		AnswerTexts.add(" ");
		}
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
    		if(AnsweredQuestions < 5) {
			question_number = rand.nextInt(26);//ερωτήσεις 0-25  rand.nextInt(26);
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

