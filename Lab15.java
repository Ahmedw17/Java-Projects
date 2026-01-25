import java.util.Scanner;

public class Lab15 {

    public static void main(String[] args) {
        int age, birthyear, currentyear = 2026;
        Scanner Ahmed = new Scanner(System.in);

        System.out.print("Enter the birth year: ");
        birthyear = Ahmed.nextInt();

        age = currentyear - birthyear;

        System.out.print("Your age is : " + age);
    }
    
}
