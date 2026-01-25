import java.util.Scanner;

public class Lab09 {

   
    public static void main(String[] args) {
      String password;
      int digitCount;
      char ch;
      
      digitCount=0;
      password="";
      ch=' ';
      
      
      Scanner Ahmed =new Scanner(System.in);
      
      System.out.println("1. A password must have at least eight characters :");
      System.out.println("2. A password  consists pf only letters and digits :");
      System.out.println("3. A password  must contain at least two digit :");
      System.out.print("Input a password :");
      password=Ahmed.nextLine();
      
      if(password.length()<8){
          System.out.println(" password is too short :");
          return;
      }
      for( int i = 0 ; i < password.length() ; i++){
          ch=password.charAt(i);
          if(!Character.isLetterOrDigit(ch)){
              System.out.println("Password contains invalid characters.");
              return;
          }
          if(Character.isDigit(ch)){
              digitCount++;
          }
      }
      if(digitCount <2){
          System.out.println(" password  must contain at least two digit");
      }else{
          System.out.println("Password is valid: "+password);
      }
      
    }
    
}
