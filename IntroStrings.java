/**<h1>Project Title: Introduction to String Functions</h1>
*<b>Purpose of Project:</b><br>
*<p>Use String Funtinos</p>
*<b>How to start the project instructions:</b><br>
*<p>Pass four names in camelCasing as a asrgs[0] string</p>
*<b>User Instructions:<b/><br>
*<p>Let the program run, Prints out strings using </P>
*<br>
*@author Gareth Elder
*@version 1
*@since 2017-11-18
*/


public class IntroStrings {

  /**<b>Class Description: Beginning Template</b><br>
  *<p></p>
  *@param
  *@return
  *@throws
  */

  /**<b>Method Description: Driver</b><br>
  *<p></p>
  *@param args 4 names
  *@return
  *@throws
  */

  public static void main (String[] args)
  throws ArrayIndexOutOfBoundsException
  {
    try {
      while (args[0]=="");
    }
    catch (ArrayIndexOutOfBoundsException e) {
      System.out.println ("Start the Program with\n" +
                          "4 Names, no spaces");
      System.exit(0);
    }
    String name [] = new String[8];
    System.out.println("Your beginning string is: \n" + args[0]);
    for(int i = 0; i < args[0].length(); i++){
      if(i >= 10){
        System.out.print(i-10);
      } else {
        System.out.print(i);
      }
    }

    System.out.println(" ");
    System.out.println(" ");

    //Looking at the first String

    System.out.println(args[0].substring(10));//start counting at 0 to 10
    System.out.println(args[0].substring(7, 10));//
    System.out.println(args[0].substring(3, 7));
    System.out.println(args[0].substring(0, 3));

    //Array structure to resave data (Data Structure)
    System.out.println(" ");
    System.out.println(" ");
    name[0]=args[0];
    name[1]=args[0].substring(0, 3);
    name[2]=args[0].substring(3, 7);
    name[3]=args[0].substring(7, 10);
    name[4]=args[0].substring(10);

    name[5]=name[1].toLowerCase();
    System.out.println(name[5]);
    System.out.println(name[5].toUpperCase());

    System.out.println(name[1] == args[0].substring(0, 3));
    System.out.println(name[1].equals(args[0].substring(0, 3)));

    System.out.println(" ");
    System.out.println(" ");

    System.out.println("Compare Ben to John: " + name[1].compareTo(name[2]));
    System.out.println("BcdefghiJ" + "\n87654321");
    System.out.println("Compare John to Ben: " + name[2].compareTo(name[1]));
    System.out.println("BcdefghiJ" + "\n12345678");

    name[6]="      (6) Spaces (2)  ";
    System.out.println(name[6] + ", the length is " + name[6].length());
    System.out.println(name[6].trim() + ", the length is " + name[6].length());
    name[7]= name[6].trim();
    System.out.println(name[7] + ", the length is " + name[7].length());



  }
}
