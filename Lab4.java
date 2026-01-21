import java.util.Scanner;

public class Lab4 {

    
    public static void main(String[] args) {
     String name1 , name2 , name3 , longest ;
     Scanner Ahmed = new Scanner(System.in);
     
     System.out.print("Enter the first name :");
     name1=Ahmed.next();
     System.out.print("Enter the second name :");
     name2=Ahmed.next();
     System.out.print("Enter the third name :");
     name3=Ahmed.next();
     
     longest=name1;
     
     if( name2.length()>  longest.length()){
         longest=name2;
     }
    if( name3.length()>  longest.length()){
         longest=name3;
     }
    System.out.print(" The longest is: "+longest);
}
}
