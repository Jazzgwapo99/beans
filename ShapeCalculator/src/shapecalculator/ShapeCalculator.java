/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package shapecalculator;
import javax.swing.*;

/**
 *
 * @author CISCO 01
 */
public class ShapeCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                    String widString, hgtString;
                int w, h, a;

                // read in width as a String
                widString = JOptionPane.showInputDialog( "Enter the width as an integer" );
                // convert the String to an integer
                w = Integer.parseInt( widString );

                // read in height as a String
                hgtString = JOptionPane.showInputDialog( "Enter the height as an integer" );
                // convert the String to an integer
                h = Integer.parseInt( hgtString );

                // compute the area
                a = w * h;

                // display the area as a String
                JOptionPane.showMessageDialog( null, "The area of the square equals " + a, "Results", JOptionPane.PLAIN_MESSAGE );

                System.exit( 0 );
                
    }
}
