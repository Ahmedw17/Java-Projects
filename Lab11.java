import java.util.Scanner;

public class Lap11 {
       enum Machine{
           ON,OFF,START,IN_PROGRESS,DONE
       }
    
    public static void main(String[] args) {
        Machine status;
        String userInput;
        Scanner input;
        
        status =Machine.OFF;
        userInput="";
        input =new Scanner(System.in);
        
        System.out.print("Enter machine ststus (ON,OFF,START,IN_PROGRESS,DONE) :");
        userInput=input.nextLine().toUpperCase();
        status = Machine.valueOf(userInput);
        
        switch(status){
            case ON:
            System.out.println("The machine is ON. ");
            break;
            case OFF:
            System.out.println("The machine is OFF,GOOD BYE. ");
            break;
            case IN_PROGRESS:
            System.out.println("The machine is in progress. ");
            break;
            case DONE:
            System.out.println("The machine has completed the task. ");
            break;
            
        }
    }
    
}
