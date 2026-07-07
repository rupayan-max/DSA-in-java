public class scoping {
    static int num = 1; // In class I can use anywhwere 
    public static void main(String[] args) {
        System.out.println(num);
        scoping();
    }

    static void scoping(){
        System.out.println("In");
        int num = 1;
        System.out.println(num);
    }
}
