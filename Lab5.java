import java.util.Scanner;

public class Lab5 {

 
    public static void main(String[] args) {
       double score;
       double highestscore=-1;
       String topstudent="";
       int numberOfStudents;
       Scanner ahmed=new Scanner(System.in);
       
        System.out.print("Enter  number of student :");
        numberOfStudents=ahmed.nextInt();
        
       for(int i = 0 ; i <numberOfStudents ; i++){
        System.out.print("Enter name :");
        String name=ahmed.next();
        System.out.print("Enter  score :");
         score=ahmed.nextDouble();
         
         
          if(score>highestscore){
             highestscore=score;
             topstudent=name;
          }      
        }
        System.out.println("Top topstudent:"+topstudent+"with score:"+highestscore);
    }  
}
