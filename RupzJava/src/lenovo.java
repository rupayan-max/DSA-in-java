import java.util.Scanner;

public class lenovo {
    public static void main(String[] args) {
        System.out.println("Switch Statement");

        // Switch Statement in Java
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number for days--->  ");
        int days = sc.nextInt();
        switch (days) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;

            default:
                System.out.println("Sunday");

        }

    }
}
