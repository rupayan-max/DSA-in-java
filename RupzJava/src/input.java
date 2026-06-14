import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        // Hard Coded Values
        int a = 90;
        int b = 90;
        System.out.println(a + b);

        // Taking Input from user
        Scanner sc = new Scanner(System.in); // This line make scanner class's object . Object name is sc
        // Working of this object -> This object helps me to take input from user.
        System.out.println("Enter Integer Value -> ");
        int firstuserinput = sc.nextInt();
        System.out.println("The value is ->"+firstuserinput);

        sc.close();
    }
}
