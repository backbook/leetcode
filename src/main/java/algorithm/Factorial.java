package algorithm;

public class Factorial {
    public static void main(String[] args) {

        int i = factorialSolve(4);
        System.out.println(i);

    }

    public static int  factorialSolve(int order){
        if (order == 1){
            return 1;
        }
        return order * factorialSolve(order-1);
    }


}
