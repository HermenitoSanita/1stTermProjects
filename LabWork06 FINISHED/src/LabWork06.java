public class Main {
    /**
     * @param x
     */
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
        System.out.println(calculateFib(10));

    public static double calculateFib(int n) {
        return Math.round(Math.pow(1.618034,n)/Math.sqrt(5));
    }
}
