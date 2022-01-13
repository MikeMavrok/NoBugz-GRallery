package gr.aueb.dmst.game.GRallery;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class WelcomePage {
	JFrame frame = new JFrame();
	JButton startButton = new JButton("Έναρξη");
	
	WelcomePage(String userName) {

		final JPanel panel = new JPanel();
		JTextArea textArea = new JTextArea(10, 65);
		textArea.setEditable(false);
		textArea.setSize(200,200);
		textArea.setFont(new Font(null,Font.LAYOUT_LEFT_TO_RIGHT,20));
		textArea.setText("Γειά σου " + userName +"!\n\n" + "Είσαι έτοιμος/η να εξερευνήσεις την ζωγραφική έκθεση "
		 		+ "της Εθνικής Πινακοθήκης μέσα από την οθόνη σου;\n"
				+ "Θέλεις να τεστάρεις τις γνώσεις σου στην τέχνη, την ιστορία αλλά και τον ελληνικό πολιτισμό;\n"
		 		+ "Παίξε αυτό το κουίζ με τους φίλους σου και δες ποιος θα είναι ο νικητής!\n\n"
				+ "ΟΔΗΓΙΕΣ ΠΑΙΧΝΙΔΙΟΥ\n"
		 		+"Το παιχνίδι χωρίζεται σε 3 επίπεδα δυσκολίας: εύκολο-μεσαίο-δύσκολο.\r\n"
		 		+ "Ξεκινώντας από το πρώτο επίπεδο, ο παίκτης καλείται να επιλέξει τις σωστές απαντήσεις σε ερωτήσεις πολλαπλής επιλογής, "
		 		+ "με βάση στοιχεία που του δίνονται ή τις γενικότερες γνώσεις του.\r\n"
		 		+ "Έχοντας ολοκληρώσει τις ερωτήσεις του κάθε επιπέδου, για να προκριθεί στο αμέσως επόμενο επίπεδο,\n"
		 		+ "πρέπει να έχει απαντήσει σωστά σε τουλάχιστον το 1/3 των απαντήσεων του προηγούμενου επιπέδου. \r\n"
		 		+ "Αν δεν καταφέρει να περάσει στο επόμενο επίπεδο, το παιχνίδι σταματάει και καταχωρείται η τελική βαθμολογία του παίκτη.\r\n"
		 		+ "Κάθε παίκτης έχει στη διάθεσή του συνολικά 3 ευκαιρίες για βοήθεια (hints) που παρέχονται σε συγκεκριμένες ερωτήσεις.\r\n"
		 		+ "Στο τέλος, θα μπορείς να δεις την επίδοσή σου, καθώς και των υπόλοιπων παικτών.\r\n");
		panel.add(textArea,BorderLayout.BEFORE_FIRST_LINE); 
		textArea.setLineWrap(true);
		textArea.setWrapStyleWord(true);
		textArea.setOpaque(false);
	    textArea.setEditable(false);
	    panel.add(textArea);
	    JScrollPane scroll =new JScrollPane(textArea,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		panel.add(scroll);

	    frame.add(panel);
	    frame.pack();
	    frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(1100,400);
		frame.setLayout(null);
		frame.setVisible(true);
		

		startButton.setBounds(475,290,100,50);
		startButton.setFocusable(false);
		startButton.addActionListener(this);
		
		frame.add(startButton);
	}	
	
	@Override
	public void actionPerformed(ActionEvent e) {
			if(e.getSource() == startButton) {
				MultiplePanels multiplePanels = new MultiplePanels();
			}
	}
}
