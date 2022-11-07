public class Main {
    public static void main(String[] x) {
        System.out.println("Example 9!");
        System.out.println("------------");
        //----------------------------------
        double sum = 0;
        for (int i = 1; i < 60000; i++) {
            sum += 1.0/(i*i);
        }
        System.out.println(sum);
        System.out.println(Math.PI*Math.PI/6);
        System.out.println("Example 10!");
        System.out.println("------------");
        double a1 = 1;
        System.out.println("1st number in Fib series is " +1);
        double a2 = 1;
        System.out.println("2nd number in Fib series is " +1);
        double a3;
        for (int i = 1; i <= 10; i++) {
            a3 = a1 + a2;
            System.out.println((i+2) + "th number in Fib series is " +a3);
            a1 = a2;
            a2 = a3;
        }
        System.out.println(calculateFib(10));
    }
    public static double calculateFib(int n) {
        return Math.round(Math.pow(1.618034,n)/Math.sqrt(5));
    }
}
