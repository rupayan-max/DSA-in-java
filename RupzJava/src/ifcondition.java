import java.util.Scanner;

public class ifcondition {
    public static void main(String[] args) {
        // Conditional Statement (If Statement)
        System.out.println("If Conditional Statement");

       Scanner sc = new Scanner(System.in);
       System.out.println("Please Enter your age :--> ");
       int myage = sc.nextInt();
       if (myage>=18){
        System.out.println("You Can give Vote.");
       }
    }
}
