public class diffSum {
    public static void main(String[] args) {
        int n = 3756;
        int sum = takeDigit(n,0);
        System.out.println(sum);
    }
     static int takeDigit(int n, int sum) {
       if (n > 0) {
           sum += n % 10;
           return takeDigit(n/10,sum);
       } else {
           return sum;
       }

}
}