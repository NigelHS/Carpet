/*
 * Nigel HS
 * Carpet.java
 * 28/02/2018
 * this program calculates the cost of a carpet according to its area.
 */

package carpet;

/**
 *
 * @author nihow4926
 */
public class Carpet {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        double cLength = 8.5;  
        double cWidth = 6; 
        double price = 19.95;
        double cArea = cLength*cWidth;
        double cPrice = price*cArea; 
      
        System.out.println ("The carpet costs $" + cPrice);
        
        
                
    }
    
}
