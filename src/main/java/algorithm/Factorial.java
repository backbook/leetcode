package algorithm;

public class Factorial {
    static RecursiveFactorial recursiveFactorial;
    public static void main(String[] args) {

        int i = factorialSolve(4);

        //递归调用使用函数式表达
        recursiveFactorial = n -> n == 0 ? 1 : n * recursiveFactorial.factorial(n-1);
        System.out.println(recursiveFactorial.factorial(4));

        System.out.println(i);

    }

    public static int  factorialSolve(int order){
        if (order == 1){
            return 1;
        }
        return order * factorialSolve(order-1);
    }




}

@FunctionalInterface
interface RecursiveFactorial{

    int factorial(int i);

}
