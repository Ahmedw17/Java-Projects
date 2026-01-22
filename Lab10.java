import java.util.Scanner;

public class Lab10 {
  
    public static void deleteChar(String str1,String str2) {
        char ch;
        String result;
        int i ;
        
        ch=str2.charAt(0);
        result="";
        i = 0 ;
        
        for(i=0; i<str1.length();i++){
            if(str1.charAt(i)!=ch){
                result +=str1.charAt(i);   
            }
        }
        System.out.println("The string after deleting the Character  '"+ ch + "' : " + result);
    }
   
    public static void main(String[] args) {
     String str1,str2;
     str1="";
     str2="";
     
     Scanner Ahmed=new Scanner(System.in);
     
     System.out.print("Type in a string :");
     str1=Ahmed.nextLine();
     System.out.print("Enter a letter to delete:");
     str2=Ahmed.nextLine();
     
     deleteChar(str1,str2); 
        
    }
    
}
