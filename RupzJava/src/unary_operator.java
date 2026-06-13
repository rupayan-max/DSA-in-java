public class unary_operator {
    public static void main(String[] args) {
        // Unary Operator in Java
        System.out.println("Unary Operator");

        int newvalue = 20;
        System.out.println(-newvalue);

        // Pre-Increment
        int newsssignvalue = 90;
        int generatedvalue = ++newsssignvalue;
        System.out.println(generatedvalue); // Value is 91
        System.out.println(newsssignvalue); // value is 91

        // Post-Increment
        int secondassignvalue = 40;
        int secondgeneratedvalue = secondassignvalue++;
        System.out.println(secondgeneratedvalue); // Ans is 40
        System.out.println(secondassignvalue); // Ans is 41 To print 41 while still using the post-increment operator
                                               // (++), you simply need to access the variable after the increment step
                                               // has already executed.

                                              
    }
}
