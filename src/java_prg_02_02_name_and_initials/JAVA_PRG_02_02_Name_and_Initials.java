/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_prg_02_02_name_and_initials;

/**
 *
 * @author bluebackdev
 * Write a program that has the following String variables: firstName,
 * middleName, and lastName. Initialize these with your first, middle, and
 * last names. The program should also have the following char variables:
 * firstInitial, middleInitial, and lastInitial. Store your first, middle,
 * and last initials in these variables. The program should display the
 * contents of these variables on the screen.
 */
public class JAVA_PRG_02_02_Name_and_Initials {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Define string literals
        String strFirstName = "Keith";
        String strMiddleName = "B.";
        String strLastName = "Smith";
        
        // Declare character variables
        char chrFirstInitial;
        char chrMiddleInitial;
        char chrLastInitial;
        
        // Get first letter of name components
        chrFirstInitial = strFirstName.charAt(0);
        chrMiddleInitial = strMiddleName.charAt(0);
        chrLastInitial = strLastName.charAt(0);
        
        // Output the characters to the console
        System.out.println("Your initials are: " + chrFirstInitial +
                            chrMiddleInitial + chrLastInitial);
        
        // Convert strings to lower-case for fun
        strFirstName = strFirstName.toLowerCase();
        strMiddleName = strMiddleName.toLowerCase();
        strLastName = strLastName.toLowerCase();
        
        // Redefine characters from lower-case name to get
        // lower-case initials
        chrFirstInitial = strFirstName.charAt(0);
        chrMiddleInitial = strMiddleName.charAt(0);
        chrLastInitial = strLastName.charAt(0);
        
        System.out.println("And in lower-case they are: " + chrFirstInitial +
                            chrMiddleInitial + chrLastInitial);
    }
    
}
