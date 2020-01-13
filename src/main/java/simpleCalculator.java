public class simpleCalculator {
    // the main method prints out both methods to the console depending the preference of the user which method he or she likes.
    public static void main(String[] args) {
        System.out.println(Add(1,2));
        System.out.println(Multiply(1,3));

    }
    // this method adds an unlimted number of integers(int...sum).
    public static int Add(int...sum){
        int number = 0;
        for(int output: sum){
            number += output;
        }
        return number;
    }
    //this method multiplies an unlimited numbers of integers(int...sum).
    public static int Multiply(int...sum){
        int number = 1;
        for (int num:sum) {
            number *= num;
        }
        return number;
    }

}
