import java.util.Scanner;

public class Lab6 {
 
    public static void main(String[] args) {
        Scanner Ahmed=new Scanner(System.in);
        String str;
        String result;
        int count;
        char ch;
        int i ;        
        
        System.out.print("Enter a string: ");
        str=Ahmed.nextLine();
        
        result="";
        count=0;
      
        
        for( i=0 ; i < str.length(); i++ ){
            ch=str.charAt(i);
            if((ch=='m'|| ch=='M')&& count<3){
             count++;
             continue;
            }
            result +=ch;
        }
        System.out.println("The new string is :"+result);
    }
    
}
