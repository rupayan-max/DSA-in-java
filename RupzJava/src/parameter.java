public class parameter {
    public static void main(String[] args) {
        // Method with Parameter
      //  parameterfunc(1, 3); // User Provided Data is Called arguement
        int ans =multiply(2,5);
        System.out.println(ans);
    }

    static void parameterfunc(int a, int b) {  // in this part called Parameter
        System.err.println(a + b);
    }
     static int multiply(int value1, int value2){  // Non Void Function
         int result = value1*value2;
         return result;
     }

}
