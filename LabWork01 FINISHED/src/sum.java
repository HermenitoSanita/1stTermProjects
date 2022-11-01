public class sum {
    public static void main(String[] args) {
        long sum = 0;
        for (int i = 1; i <= 1000000; i++) {
            if (i % 3 == 0 && i % 7 != 0) {
                sum += i;
            }
        }
        System.out.println(sum);
        long betterSum = 0;
        for (int i = 0; i <= 999999; i += 3) {
            if (i % 7 != 0) {
                betterSum += i;
            }
        }
        System.out.println("BETTER SUM " + betterSum);
    }
}
