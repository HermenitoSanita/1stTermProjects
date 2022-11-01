public class LabWork {
    public static void main(String[] args) {
        int n = 97;
        boolean flag = true;
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println(n + " is prime!");
        } else {
            System.out.println(n + " is not prime!");
        }
    }
}
