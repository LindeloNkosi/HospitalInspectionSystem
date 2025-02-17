package question2test;

/**
 *
 * @author lindelo Desiree Nkosi
 */
public abstract class Inspection implements iInspection{
    //variables
    String location;
    String name;
    int years;
    
    //a constructor that accepts variables
    public Inspection(String location, String name, int years){
        this.location = location;
        this.name = name;
        this.years = years;
       }
        
    // a list of get methods for the variables
        public String getLocation(){
            return this.location;
        }
           
        public String getName(){
            return this.name;
        }
           
        public int getYears(){
            return this.years;
        }
}
