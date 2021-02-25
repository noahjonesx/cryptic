import java.util.Scanner;
import java.io.IOException;
import java.util.ArrayList;

/** Project 6 - Cone List Menu App.
*@author Noah Jones
*@version 02/24
*/
public class ConeListMenuApp {
/**param / throw.
*@throws IOException in main Command Line
*@param args Command Line is not used
*/ 
   public static void main(String[] args) throws IOException {
      
      String tListName = "no list name";
      ArrayList<Cone> coneList = new ArrayList<Cone>();
      ConeList myConeList = new ConeList(tListName, coneList);
      String fileName = "no file name";
      
      double s1, s2, s3;
      String code = "";
      Scanner scan = new Scanner(System.in);
      System.out.println("Cone List System Menu\n"
         + "R - Read file and Create Cone List\n"
         + "P - Print Cone List\n"
         + "S - Print Summary\n"
         + "A - Add Cone\n"
         + "D - Delete Cone\n"
         + "F - Find Cone\n"
         + "E - Edit Cone\n"
         + "Q - Quit\n");
      do {  
         System.out.println("Enter Code [R, P, S, A, D, F, E, or Q]");
         code = scan.nextLine();
         if (code.length() == 0) {
            continue;
         }
         code = code.toUpperCase();
         char codeChar = code.charAt(0);
         switch (codeChar) {
            case 'R' : //readFile to scan and creates ConeList
               System.out.print("\tFile Name:  ");
               fileName = scan.nextLine();
               
               myConeList = myConeList.readFile(fileName);
               System.out.println("\tFile read in and " 
                  + "ConeList object created\n");
               break;
                  
            case 'P': //Prints ConeList
               System.out.println(coneList);
               break;
            
         //         case 'S': //Prints Summary
            
         //         case 'A' //Adds cone to ConeList based on 
                      //scanned user input of double variable 
                      
         //         case 'D' //Deletes cone from ConeList using delete 
                      //function from Java API
            
         //         case 'F' //Find Cone in ConeList
            
         //         case 'E' // Edits Cone in ConeList
            
         //         case 'Q' // Quit
            
            default: //invalid user input, loop again 
               break;
         }
      } while (!code.equalsIgnoreCase("Q"));
   }
}