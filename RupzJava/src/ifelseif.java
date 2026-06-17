import java.util.Scanner;

public class ifelseif {
    public static void main(String[] args) {
        System.out.println("If-Else-If Conditional statement");
       
         // Taking User Input
         Scanner sc = new Scanner(System.in);

         System.out.println("Please Enter your Marks-> ");
         int mymarks= sc.nextInt();
         if (mymarks<=100 && mymarks>=90){
            System.out.println("First Division");
         } else if (mymarks >=60 && mymarks<=89){
            System.out.println("Second Division");
         } else if (mymarks >=40 && mymarks<=59){
            System.out.println("Third Division");
         } else {
            System.out.println("Fail");
         }




    }
}
