package gr.aueb.dmst.game.GRallery;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class LabelImage extends JPanel {
	
    public LabelImage() {
    	
    	JLabel messageLabel = new JLabel();
    	//messageLabel.setSize(0, 100);
    	messageLabel.setLocation(15, 15);
    	messageLabel.setBounds(200,200,100,100);
	messageLabel.setFont(new Font(null,Font.ITALIC,25));
	messageLabel.setHorizontalTextPosition(JLabel.CENTER);
	messageLabel.setVerticalTextPosition(JLabel.CENTER);
	//messageLabel.setLayout(null);
	add(messageLabel);
	messageLabel.setVisible(true);
		
		
    	ImageIcon image1 = new ImageIcon(getClass().getResource("/faros.jpg"));
	JLabel label1 = new JLabel(image1);     
	add( label1 );
        
        JTextArea label2 = new JTextArea("Test ", 10,10);
        label2.setText("Ο «Φάρος» εικάζεται πως αποτελεί μία απεικόνιση ενός πραγματικού φάρου σε κάποιο κυκλαδίτικο νησί με σκοπό σε συνδυασμό\n με άλλα έργα να αναδειχθεί το ελληνικό καλοκαίρι. Σε ποιον γνωστό Έλληνα ζωγράφο με καταγωγή από την Τήνο ανήκει ο\n συγκεκριμένος πίνακας;");
        label2.setFont(new Font("Aria", Font.PLAIN, 18));
        add(label2);

        JButton b [] = new JButton[4];
        b[0] = new JButton("Νικόλαος Γύζης");
        b[1] = new JButton("Ιωάννης Δούκας");
        b[2] = new JButton("Νίκος Λύτρας");
        b[3] = new JButton("Άγγελος Θεοδωρόπουλος");
        
        b[0].setBounds(100,200,100,200);
        b[0].setFocusable(false);
        
        b[1].setBounds(100,200,100,200);
        b[1].setFocusable(false);
        
        b[2].setBounds(100,200,100,200);
        b[2].setFocusable(false);
        
        b[3].setBounds(100,200,100,200);
        b[3].setFocusable(false);
       
 
        b[0].addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
                if(e.getSource() == b[0]) {
                	messageLabel.setForeground(Color.green);
			messageLabel.setText("CORRECT");
                }
            }
        });
        
        b[1].addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
                if(e.getSource() == b[1]) {
                	messageLabel.setForeground(Color.red);
			messageLabel.setText("WRONG");
                }    
            }
        });
        
        b[2].addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
                if(e.getSource() == b[2]) {
                	messageLabel.setForeground(Color.red);
			messageLabel.setText("WRONG");
                }
            }
        });
        
        b[3].addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
                if(e.getSource() == b[3]) {
                	messageLabel.setForeground(Color.red);
			messageLabel.setText("WRONG");
                }
            }
        });
        
        add(b[0]);
        add(b[1]);
        add(b[2]);
        add(b[3]);    
    }
    

    public static void createAndShowUI(){	
        JFrame frame = new JFrame("GRallery");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add( new LabelImage() );
        frame.setSize(1050,1400);
        //frame.pack();
        frame.setLocationRelativeTo( null );
        frame.setVisible( true );
    }

   /** public static void main(String[] args) {
       EventQueue.invokeLater(new Runnable()
       {
            public void run()
            {
                createAndShowUI();
            }
        });
    }**/
	
}
