
public class Test {
    public static void main(String[] args) {
        double startingAng = 45;
        double startingVel = 100;
        System.out.println(calculateRange(startingVel,startingAng));
    }
    public static double calculateRange(double v, double o) {
        return (v*v*Math.sin(Math.toRadians(2*o))/9.81);
    }
}