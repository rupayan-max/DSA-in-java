public class continuestatement {
    public static void main(String[] args) {
        // Continue Keyword in Java

        for (int i = 1; i<=10;i++){
            if (i==8){
                System.out.println("Skipped -> "+ i);
                continue;
            }
            System.out.println(i);
        }
    }
}
