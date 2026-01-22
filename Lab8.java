import java.util.Scanner;

public class Lab8 {

    
    public static void main(String[] args) {
      double [][] rainfall;
      double sum ,avg;
      int week,day;
      
      rainfall= new double[4][7];
      sum=0;
      avg=0;
      week=0;
      day=0;
      
      Scanner Ahmed=new Scanner(System.in);
      System.out.println("Enter the rainfall reates for 4 weeks :  ");
      
      
      for( week=0 ; week<4;week++ ){
       System.out.print(" week# "+(week+1)+":");
       for(day=0;day<7;day++){
       rainfall [week][day]=Ahmed.nextDouble();
        }
      }
      
      for( week=0 ; week<4;week++ ){
          sum=0;
          for(day=0;day<7;day++){
              sum+=rainfall [week][day];
          }
          avg=sum/7;
          System.out.print(" week# "+(week+1)+":");
          getClassification(avg);
      }      
    }
    public static void getClassification(double average){
        if(average>=6)
        System.out.println("High("+average+")");
        else if(average>=3)
        System.out.println("Medium("+average+")"); 
        else
        System.out.println("Low("+average+")");     
    }
}
