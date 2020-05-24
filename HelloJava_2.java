/*
 * This program will do the same as HelloJava_1 
 * Instead of printing to the command line
 * This program will create a GUI (Guided User Interface)
 * And print text out to the gui
 * Imported javax.swing
 * Javax is a prefix used by java to define an extension of java packages
 * swing is "Swing is a GUI widget toolkit for Java. It is part of Oracle's Java Foundation Classes "
 * 
 * 
 * The Frame section of code creates the outline of the box for which the program will be set to
 * it has the title "Hello Java!"
 * It is also set so the size of 300px by 300px
 * its visibility is set to true
 * The frame is also adding the object label which has text that is set to appear in the center
 * of the program.
 * 
 */
import javax.swing.*;
public class HelloJava_2 {
	public static void main( String[] args) {
		JFrame frame = new JFrame ( "Hello Java!" );
		JLabel label = new JLabel( " Hello Connor", JLabel.CENTER);
		frame.add(label);
		frame.setSize(300,300);
		frame.setVisible(true);
		
	}
	
}
