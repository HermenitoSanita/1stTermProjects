public class CollatzConjecture {
    public static void main(String[] args) {
        double n = 9999999999999999999;
        System.out.println(n);
        while (n != 1) {
            if (n % 2 == 0) {
                n = n/2;
            } else {
                n = 3*n + 1;
            }
            System.out.println(" -> " + n);
        }
    }
}

