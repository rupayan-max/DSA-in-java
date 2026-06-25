public class loopwhile {
    public static void main(String[] args) {
        // while Loop in java

        int marks = 1;
        while (marks <= 10) {
            System.out.println("Marks is -> " + marks);
            marks++;
        }

        // Nested While Loop in java

        int i = 1;
        // int p = 1 ; // can not access this variable while the loop is run
        while (i <= 5) {
            System.out.println("Entered in First Loop");
            int p = 1;
            while (p <= 3) {
                System.out.println("Entered in inner loop");
                p++;

            }
            System.out.println(p);
            i++;
        }
    }
}
