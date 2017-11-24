/**<h1>Project Title: </h1>
*<b>Purpose of Project:</b><br>
*<p></p>
*<b>How to start the project instructions:</b><br>
*<p></p>
*<b>User Instructions:<b/><br>
*<p></P>
*<br>
*@author Gareth ELder
*@version 1
*@since 2017-11-15
*/

import java.util.Scanner;

public class TestingScanner{

  /**<b>Class Description: Beginning Template</b><br>
  *<p></p>
  *@param
  *@return
  *@throws
  */

  /**<b>Method Description: Driver</b><br>
  *<p></p>
  *@param args unused
  *@return
  *@throws
  */
  
  public static void main (String[] args) {

    System.out.println("Type Somenthing");

    Scanner input = new Scanner ( System.in);
    String statement = input.nextLine();

    System.out.println( statement);
  }
}
