public class overload {
    public static void main(String[] args) {
        // Method OverLoading

        // Method Calling Space 
         int output = add(1,2,3);
         System.out.println("Output 1 -------->"+ output);
        int output2 = add(1,2);
        System.out.println("Output2----->"+output2);
    }

    // Method Creation
    // Method One with Same Name 
    static int add(int a , int b , int c){
        int result = a+b+c;
        return result;
    }
    // Metthod Two with Same Name  
    static int add(int a , int b){
        int ans = a+b;
        return ans;
    }
}
