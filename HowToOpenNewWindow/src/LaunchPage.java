import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Color;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;*/


public class LaunchPage implements ActionListener{

	JFrame frame = new JFrame();
	JButton bstart= new JButton("START THE GAME");
//	JMenuBar menuBar;
	//JMenu optionsMenu;
	//JMenuItem highscoreItem;
	//JMenuItem aboutUsItem;
	
	
	
	public LaunchPage() {
		
		//create a central button 
		bstart.setBounds(100,160,200,40);
		bstart.addActionListener(this);
		
		//add it in the frame
		frame.add(bstart);
		
		//make the frame
		frame.setTitle("GRallery");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //ïôáí ðáôáìå ÷ êëåéíåé ç åöáñìïãç
		frame.setSize(500, 500);
		frame.setLayout(null);
		
		
		/*dhmiourgoyme menu bar
		
		menuBar =new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		optionsMenu = new JMenu("Options");
		menuBar.add(optionsMenu);
		
		JMenuItem highscoreItem = new JMenuItem("Highscore");
		JMenuItem aboutUsItem = new JMenuItem("About Us");
		
		//the buttons will respond
		highscoreItem.addActionListener(this);
		aboutUsItem.addActionListener(this);
		// the buttons will be added
		optionsMenu.add(highscoreItem);
		optionsMenu.add(aboutUsItem);
		*/
		
		
		
		
		//allazei to ikonidio pano pano(exw la8os eikonidio)
		ImageIcon image = new ImageIcon("Screenshot.png");
		frame.setIconImage(image.getImage());
		frame.getContentPane().setBackground(new Color(50,95,200));
		
		
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==bstart) {
			frame.dispose(); //DISPLAY ONLY ONE WINDOW
			
			
			NewWindow myWindow = new NewWindow();
		}
		/*DEN LITOYRGOUN
		if(e.getSource()== highscoreItem) {
			JLabel label2 = new JLabel();
			label2.setText("The user : x got the highest score");
			frame.add(label2);
			
		}
		
		if(e.getSource()== highscoreItem) {
			JLabel label3 = new JLabel();
			label3.setText("We are a team of experienced programmers in JAVA..");
			frame.add(label3);		}
		*/
	}
	
	
}
