public class Labwork {
    public static void main(String[] args) {
        System.out.println("Start of exercise 1! ");//Exercise 1! Up to 1000 list all numbers divisible by 7.
        System.out.println("---------------------");
        for (int i = 7; i <= 1000; i += 7) {
            System.out.println(i);
        }
        System.out.println("---------------------");
        System.out.println("End of exercise 1! ");//End of exercise 1!
        System.out.println("Start of exercise 2! ");// Exercise 2! Find the sum of squares up to 100.
        System.out.println("---------------------");
        int sum = 0;
        for (int i = 1; i < 101; i++) {
            sum += i*i;
        }
        System.out.println(sum);
        System.out.println("---------------------");
        System.out.println("End of exercise 2! ");// End of exercise 2!
        System.out.println("Start of exercise 3! ");// Exercise 3! Find the 3-digit numbers such that sum of the cubes of the digits is equal to the number itself.
        System.out.println("---------------------");
        for (int i = 100; i < 1000; i++) {
            int num = i;
            int c = num % 10;
            num /= 10;
            int b = num % 10;
            num /= 10;
            int a = num % 10;
            if (a*a*a + b*b*b + c*c*c == i) {
                System.out.println(i);
            }
        }
        System.out.println("---------------------");
        System.out.println("End of exercise 3! ");// End of exercise 3!
        System.out.println("Start of exercise 4! ");// Exercise 4! Find the 3-digit numbers such that their decimal digit sum is 25.
        System.out.println("---------------------");
        for (int i = 100; i < 1000; i++) {
            int num = i;
            int c = num % 10;
            num /= 10;
            int b = num % 10;
            num /= 10;
            int a = num % 10;
            if (a + b + c == 25) {
                System.out.println(i);
            }
        }
        System.out.println("---------------------");
        System.out.println("End of exercise 4! ");// End of exercise 4!
        System.out.println("Start of exercise 5! ");// Exercise 5! Find an integer's square root if it is also an integer. Else throw error.
        System.out.println("---------------------");
        int n2 = 99;
        boolean flag = true;
        for (int i = 1; i*i <= n2; i++) {
            if (i*i == n2) {
                System.out.println(i);
                flag = false;
            }
        }
        if (flag) {
           System.out.println("No such number!");
        }
        System.out.println("---------------------");
        System.out.println("End of exercise 5! ");// End of exercise 5!
        System.out.println("Start of exercise 6! ");// Exercise 6! Improved version of the 5th exercise that gives a range.
        System.out.println("---------------------");
        int n3 = 100;
        for (int i = 1; i <= n3; i++) {
            if (i*i == n3) {
                System.out.println(i);
                break;
            } else if (i*i > n3) {
                System.out.println("The square root lies between " + (i-1) + " and " + i);
                break;
            }
        }
        System.out.println("---------------------");
        System.out.println("End of exercise 6! ");// End of exercise 6!
        System.out.println("Start of exercise 7! ");// Exercise 7!
        System.out.println("---------------------");
        System.out.println("---------------------");
        System.out.println("End of exercise 7! ");// End of exercise 7!
        System.out.println("Start of exercise 8! ");// Exercise 8!
        System.out.println("---------------------");
        double fact = 1;
        for (int i = 1; i <= 100; i++) {
            fact *= i;
        }
        System.out.println(fact);
        System.out.println("---------------------");
        System.out.println("End of exercise 8! ");// End of exercise 8!
        System.out.println("Start of exercise 9! ");// Exercise 9!
        System.out.println("---------------------");
        double fact2 = 1;
        double e = 0;
        for (int i = 1; i <= 100; i++) {
            e += 1/fact2;
            fact2 *= i;
        }
        System.out.println(e);
        System.out.println(Math.exp(1));
        System.out.println("---------------------");
        System.out.println("End of exercise 9! ");// End of exercise 9!
    }
}
