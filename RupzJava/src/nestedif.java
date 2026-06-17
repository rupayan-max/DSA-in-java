import java.net.Socket;
import java.util.Scanner;

public class nestedif {
    public static void main(String[] args) {
        System.out.println("Nested if statement");
        // Nested if statement

        Scanner userinput = new Scanner(System.in);
        int marks = userinput.nextInt();
        if (marks >= 80) {
            System.out.println("You will get a chocolate");
            if (marks >= 90) {
                System.out.println("You will get a bike");
            }
        }else{
            System.out.println("Get Out");
        }
    }
}
