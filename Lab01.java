import java.util.Scanner;

public class Lab01 {

    
    public static void main(String[] args) {
       double celsius, fahrenheit;

        Scanner Hmd = new Scanner(System.in);

        System.out.print("Enter the temperature in Fahrenheit: ");

        fahrenheit = Hmd.nextDouble();

        celsius = (5.0 / 9) * (fahrenheit - 32);

        System.out.println(" The result of celsius " + celsius);
      
        
    }
    
}
