package gr.aueb.dmst.game.GRallery;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class WelcomePage extends JScrollPane implements ActionListener {
	JFrame frame = new JFrame("Welcome");
	JButton startButton = new JButton("Έναρξη");
	String username;
	
	WelcomePage(String userName) {
		this.username = userName;

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
		 		+ "Ξεκινώντας από το πρώτο επίπεδο, καλείσαι να επιλέξεις τις σωστές απαντήσεις σε ερωτήσεις πολλαπλής επιλογής, "
		 		+ "με βάση στοιχεία που σου δίνονται ή τις γενικότερες γνώσεις σου.\r\n"
		 		+ "Θα χρειαστεί να απαντήσεις σύνολο 10 ερωτήσεις. Οι 3 πρώτες θα είναι από το εύκολο επίπεδο,\n"
		 		+ "οι 4 επόμενες από το μεσαίο και οι 3 τελευταίες από το δύσκολο επίπεδο.\n"
		 		+ "Κάθε σωστή απάντηση από το εύκολο επίπεδο βαθμολογείται με +10, από το μεσαίο με +20 και από το δύσκολο με +30 !\r\n"
		 		+ "Έχεις τη δυνατότητα για βοήθεια (hints) που παρέχονται σε συγκεκριμένες ερωτήσεις."
		 		+ "Στο τέλος, θα μπορείς να δεις την επίδοσή σου σε σύγκριση με την καλύτερη προσπάθεια άλλων παικτών (Highscore)\r\n");
		
		
		panel.add(textArea,BorderLayout.BEFORE_FIRST_LINE); 
		textArea.setLineWrap(true);
		textArea.setWrapStyleWord(true);
		textArea.setOpaque(false);
	    textArea.setEditable(false);
	    panel.add(textArea);
	    final JScrollPane scroll =new JScrollPane(textArea,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		panel.add(scroll);

		getViewport().add(panel); 
		scroll.getHorizontalScrollBar().setValue(0); 
		
	
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
		   public void run() { 
		       scroll.getVerticalScrollBar().setValue(0);
		   }
		});
		

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
		frame.dispose();
			if(e.getSource() == startButton) {
				MultiplePanels multiplePanels = new MultiplePanels(username);
				multiplePanels.setPanels();
				multiplePanels.setAllFrames();
			}
	}
}
	
