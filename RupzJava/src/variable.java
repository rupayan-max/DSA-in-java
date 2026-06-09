public class variable {
   public static void main(String[] args) {
    char num1='a';
    float num2=90.09f;
    System.out.println(((Object) num1).getClass().getName());
    System.out.println((char)(num1+2 ));
    System.out.println(num2);
   }
}
