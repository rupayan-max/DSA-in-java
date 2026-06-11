public class logical_operator {
    public static void main(String[] args) {
        System.out.println("Logical Operator");
        
        // Logical Operator

        boolean firstvalue = true;
        boolean secondvalue =  false;

        System.out.println(firstvalue && secondvalue); // False
        System.out.println(firstvalue&&firstvalue); // true
        System.out.println((firstvalue == secondvalue) && (firstvalue == firstvalue)); //false
        System.out.println((firstvalue == secondvalue) || (firstvalue == firstvalue));  // true
        System.out.println(!firstvalue); // false


    }
}
