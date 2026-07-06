public class callbyvalue {
    
    public static void main(String[] args) {
        // Call By value 
         int num = 5 ;
         solve(num);
         System.out.println(num);  
    }

    // Solve Method 

    static void solve(int num){
          int calculation = num*10;
          System.out.println(calculation);
    }
}
