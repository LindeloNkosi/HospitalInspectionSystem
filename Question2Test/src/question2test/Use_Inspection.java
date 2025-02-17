package question2test;

import java.util.Scanner;

/**
 *
 * @author lindelo Desiree Nkosi
 */
public class Use_Inspection {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
     Scanner scan = new Scanner(System.in);
     
        System.out.print("Enter the hospital location :" );
        String location = scan.nextLine();
        
        System.out.print("Enter the hospital name : ");
        String name = scan.nextLine();
        
        System.out.print("Enter years since last inspection : ");
        int years = scan.nextInt();
        
        System.out.println();
        
        
         
        //an object
      Hospital_Inspections obj1 = new  Hospital_Inspections(location, name, years);
      
        obj1.printInspectionReport();
      
    }
    
    
    
}
