public class LabWork {
    public static void main(String[] args) {
        String n = "7129";
        int y = 0;
        int tenMultiple = 1;
        for (int i = n.length()-1; i >= 0; i--) {
            y += (n.charAt(i) - '0') * tenMultiple;
            tenMultiple *= 10;
        }
        System.out.println(y);
    }
}