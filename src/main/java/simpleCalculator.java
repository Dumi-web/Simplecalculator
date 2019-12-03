public class simpleCalculator {
    public static void main(String[] args) {
        System.out.println(Addition(1,2));
        System.out.println(Multiple(1,3));

    }
    public static int Addition(int...sum){
        int number = 0;
        for(int a: sum){
            number += a;
        }
        return number;
    }
    public static int Multiple(int...sum){
        int number = 1;
        for (int num:sum) {
            number *= num;

        }
        return number;
    }

}
