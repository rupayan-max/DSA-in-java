public class arrinput {
    public static void main(String[] args) {
        // First Array Creation
        System.out.println("Array creation");

        // // Decleration
        // int arr[];

        // // Allocation
        // int arr = new int[5];

        int arr[];
        arr = new int[5];

        int brr[];
        brr = new int[4];

        int crr[] = new int[7];

        // insert data in element

        int lovebbaar[] = { 76, 39, 20, 21 };
        System.out.println(lovebbaar[3]);

        // For loop in array
        int size = lovebbaar.length;
        for (int i = 0; i < size; i++) {
            System.out.println(lovebbaar[i]);
        }


        // for each loop in java 

        int nrr []= {39,30,49,45,89};
        for(int naku :nrr){
            System.out.println("Entry");
            System.out.println(naku);
        }
    }
}
