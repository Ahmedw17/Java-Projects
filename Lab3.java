import java.util.Scanner;

public class Lab3 {

    public static void main(String[] args) {
       
      int month ,days;
      String monthName ;
      
      Scanner Ahmed = new Scanner(System.in);
      System.out.print("Enter a month number (1-12):");
      
      month= Ahmed.nextInt();
      
      
      if( month < 1  || month > 12 ){
          System.out.println("Invalid month .Plase enter the value from 1 to 12 .");
          return;
      }
      switch(month){
          case 1: monthName ="January";days=30 ; break;
          case 2: monthName ="February";days=28 ; break;
          case 3: monthName ="March";days=31 ; break;
          case 4: monthName ="April";days=30 ; break;
          case 5: monthName ="May";days=31 ; break;
          case 6: monthName ="June";days=30 ; break;
          case 7: monthName ="July";days=31 ; break;
          case 8: monthName ="August";days=31 ; break;
          case 9: monthName ="September";days=30 ; break;   
          case 10: monthName ="October";days=31 ; break;
          case 11: monthName ="November";days=30 ; break;
          case 12: monthName ="December";days=31 ; break;
          default: monthName ="Invalid";days=0 ; break;
    }
    System.out.println("Month : "+ monthName +",Days:"+days);
}
}
