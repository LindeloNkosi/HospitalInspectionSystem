package question2test;

/**
 *
 * @author lindelo Desiree Nkosi
 */
public class Hospital_Inspections extends Inspection {
    
     //a contructor
  public Hospital_Inspections(String location,String name, int years){
      super(location, name, years);
}
  
  public void printInspectionReport(){
      System.out.println("HOSPITAL INSPECTION REPORT");
      System.out.println("**************************");
      System.out.println("HOSPITAL LOCATION : " + this.getLocation() );
      System.out.println("HOSPTTAL NAME : " + this. getHospitalName() );
      System.out.println("YEARS SINCE INSPECTION : " + this.getYearsSinceInspection() );
      System.out.println("INSPECTION NEEDED : "  +getInspectionNeeded());
  }
  
 public String getInspectionNeeded(){
      if( this.years > 2){
       return "YES";
     }
     else{
     return "NO";
     }
 }
 
 public String getLocation(){
     return this.location;
 }
 
 public String getHospitalName(){
     return this.name;
 }
  public int  getYearsSinceInspection(){
      return this.years;
  }
}