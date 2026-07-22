import java.util.Scanner;

public class arrinput2 {
    public static void main(String[] args) {
        // First Array Initiliazation

        int arr[] = { 12, 23, 34, 45 };

        // Scanner sc = new Scanner(System.in);

        int sum = 0;
        int len = 4;

        for (int i = 0; i <= len-1; i++) {
            
            System.out.println(arr[i]);
            int arrayvalues = arr[i];
            sum =  sum+arrayvalues;

            
        }
        System.out.println("The Sum value is -> "+sum);
    }
}
