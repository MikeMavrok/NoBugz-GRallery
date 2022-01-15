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

