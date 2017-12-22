/**<h1>Project Title: Groceries</h1>
*<b>Purpose of Project:</b><br>
*<p>Class Design</p>
*<b>How to start the project instructions:</b><br>
*<p>In CMD</p>
*<b>User Instructions:<b/><br>
*<p>Does not use args[]</P>
*<br>
*@author Gareth Elder
*@version 1
*@since 2017-12-08
*/

import javax.swing.JOptionPane;
import java.util.Scanner;

public class Groceries {
  /**<b>Class Description: Driver Class</b><br>
  *<p></p>
  *@param
  *@return
  *@throws
  */

  public String printMoney (double money) {
    String pM = String.format ("$%.2f", money);
    System.out.println(pM);
    return pM;
  }

  public int stringDecInt (String userNumber1) {
    String userNumber2 = new String(); //Creating new String Object different than numbers
    userNumber2 = ""; //need to assign for IF inside Try-Catch
    int item_int = 0; //default value for fruit
    double item_double = 0.0; //used to catch user entry if value has a decimal
    try { //note: once a line fails, rest of try will not run b/c line needs "catching"
        item_double = Double.parseDouble(userNumber1);
        //If parseDouble fails, user probably entered a string
        //If parseDouble passes, user probably entered an integer
        item_double = 0.0; //reset this value and further test userNumber1
    }
    catch (NumberFormatException ne3) {
        System.out.println ("User has failed first attempt at entering item number");
        userNumber2 = JOptionPane.showInputDialog ("Please enter how many " +
                "whole items.\nFor example: \' 3 \'");
        try {
          item_double = Double.parseDouble(userNumber2);
          userNumber1 = userNumber2;
          item_double = 0.0; //reset this value and further test userNumber1
        }
        catch (NumberFormatException ne4) {
          System.out.println ("User failed a second attempt for " +
                             "an integer value of items.");
          JOptionPane.showMessageDialog (null, "Please restart the program and " +
                     "enter a whole number of items, as a whole number.", "ERROR " +
                     "MESSAGE", JOptionPane.ERROR_MESSAGE);
          System.exit(0);
        }
    }
    try {
      System.out.println ("User entered a double or int for number of items.");
      item_int = Integer.parseInt(userNumber1);
      //If parseInt fails, user probably entered a decimal
      System.out.println ("User entered an int for number of items.");
    }
    catch (NumberFormatException ne6) {
      System.out.println ("User entered a decimal value for the number of items.");
      userNumber2 = JOptionPane.showInputDialog ("It seems you have entered " +
              " a decimal number.\nPlease enter a number of whole items.\n" +
              "For example: \' 3 \'");
      try {
        item_int = Integer.parseInt(userNumber2);
        item_double = 0.0;
      }
      catch (NumberFormatException ne7) {
        System.out.println ("User failed a second attempt for " +
                           "the whole number of items.");
        JOptionPane.showMessageDialog (null, "Please restart the program and " +
                   "enter a whole number of items, as a whole number.", "ERROR " +
                   "MESSAGE", JOptionPane.ERROR_MESSAGE);
        System.exit(0);
      }
    }

    System.out.println ("Tracking Variables of Procedure for debugging");
    //Output all the variales to check values and reset if necessary
    System.out.println (item_int);
    System.out.println (item_double);
    System.out.println (userNumber1);
    System.out.println (userNumber2);
    return item_int;
 }

  /**<b>Method Description: Driver</b><br>
  *<p></p>
  *@param args unused
  *@return
  *@throws
  */

   public static void main(String[] args)
   throws NumberFormatException
   {

     Groceries obj = new Groceries(); //Accesses all methods here;

     String moneyYouHave_string1 = JOptionPane.showInputDialog ("Tell me how much money you have.\n" +
                    "Please enter only dollars and cents, \n" +
                    "For Example: \'\'14.50\'\'");
     Double moneyYouHave_double = 0.00;

     try {
       moneyYouHave_double = Double.parseDouble(moneyYouHave_string1);
     }
     catch (NumberFormatException ne1) {
       System.out.println("User failed first attempt inputing money value.");
       String moneyYouHave_string2 = JOptionPane.showInputDialog ("Tell me how much money you have.\n" +
              "Please enter only dollars and cents, \n" +
              "For Example: \'\'14.50\'\'");
       try{
         moneyYouHave_double = Double.parseDouble(moneyYouHave_string2);
       }
       catch (NumberFormatException ne2) {
         System.out.println("User failed a second attempt for the total money spend");
         JOptionPane.showMessageDialog (null, "Please restart the program", "Second Attempt Failed", JOptionPane.ERROR_MESSAGE);
         System.exit(0);
       }
     }

     double totalMoneyIn = moneyYouHave_double;
     if ( moneyYouHave_double == Math.abs(0.0) ) {
       System.out.println("User failed to enter a total amount of money to spend");
       JOptionPane.showMessageDialog (null, "You have not entered a total amount of money to spend", "Please restart the program", JOptionPane.ERROR_MESSAGE);
       System.exit(0);
     } else {
       System.out.println("User entered: " + totalMoneyIn);
       JOptionPane.showMessageDialog (null, "I understand you entered " +
            obj.printMoney(totalMoneyIn), "Money entered", JOptionPane.INFORMATION_MESSAGE);
     }
     System.out.println("User enters a number of apples");
     String apples_string1 = JOptionPane.showInputDialog ("Let's fill the box\n" +
                            "Please enter how many whole apples you would like.");
     int apples_int = obj.stringDecInt(apples_string1);

     System.out.println("This is the end of the TryCatch for Apples");
     System.out.println(apples_int);
     System.out.println(apples_string1);

     System.out.println("User enters a number of oranges");
     String oranges_string1 = JOptionPane.showInputDialog ("Please enter how many whole oranges you would like.");
     int oranges_int = obj.stringDecInt(oranges_string1);

     System.out.println("This is the end of the TryCatch for Oranges");
     System.out.println(oranges_int);
     System.out.println(oranges_string1);

     System.out.println("User enters a number of chocolate");
     String chocolate_string1 = JOptionPane.showInputDialog ("Please enter how many whole oranges you would like.");
     int chocolate_int = obj.stringDecInt(chocolate_string1);

     System.out.println("This is the end of the TryCatch for Chocolate");
     System.out.println(chocolate_int);
     System.out.println(chocolate_string1);
   }
}

//Asking for groceries amount: apples , oranges, cheese
//System.out.println();
//JOptionPane
//tryCatch: string to an int, through a doule (decimanl)

/*//Formating decimals to two decimal places
String s = String.format ("$%.2f", totalMoneyIn);
System.out.println("You have entered " + s);
*/
//Double input_double = Double.parseDouble(moneyYouHave_string1);

//System.out.println(input_double+2.50);

//JOptionPane.showMessageDialog (null, "$" + moneyYouHave_string1, "You told me you have: ", JOptionPane.INFORMATION_MESSAGE);
//INFORMATION_MESSAGE
//ERROR_MESSAGE
//WARNING_MESSAGE
//QUESTION_MESSAGE

//System.out.println("$" + input_double);


//Scanner input = new Scanner ( System.in );
//String statement = input.nextLine();

//String input = JOptionPane.showInputDialog ("Press 1 for Monday");
