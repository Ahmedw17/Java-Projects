import java.util.Scanner;
public class Lab02 {
    public static void main(String[] args) {
     double num1 , num2 , num3 , max , min ,average ;
     Scanner Ahmed = new Scanner(System.in);
     
     while(true){
        System.out.print("Enter the first number :");
        num1= Ahmed.nextDouble();
         System.out.print("Enter the second number :");
        num2= Ahmed.nextDouble();
         System.out.print("Enter the third number :");
        num3= Ahmed.nextDouble();
        
        if(num1 < 0   || num2 < 0 ||  num3 < 0 ){
            System.out.print(" Negtive numbers is detected! Plese enter another numbers. ");
            continue;
        }else{
            break;
        }   
    }
     average=( num1 + num2 + num3 ) /3;
     max=Math.max( num1 ,Math.max(num2,num3));
      min=Math.min( num1 ,Math.min(num2,num3));
      
     System.out.println("The averge is :"+average);
      System.out.println("The max is :"+max);
       System.out.println("The min is :"+ min);
    }
    }

