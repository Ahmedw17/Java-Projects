import java.util.Scanner;

public class Lab07 {

    
    public static void main(String[] args) {
        Scanner Ahmed = new Scanner(System.in);
        String text;
        int count;
        
        System.out.print("Enter a string :");
        text=Ahmed.nextLine();
        
        String[] words = text.trim().split("\\s+");
        count=words.length;
        System.out.println("Number of words : "+count);
        
        
        
    }
    
}
