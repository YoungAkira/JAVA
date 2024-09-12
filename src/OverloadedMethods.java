public class OverloadedMethods {

    public static void main(String[] args) {

        double z = add(1.0,2.0,3.0,4.0);
        System.out.println(z);
    }

    static int add(int a, int b) {
        return a + b;
    }

    static int add(int a, int b, int c) {
        return a + b + c;
    }

    static int add(int a, int b, int c, int d) {
        return a+ b + c + d;
    }

    static double add(double a,double b) {
        return a + b;
    }

    static double add(double a,double b, double c) {
        return a + b + c;
    }

    static double add(double a,double b, double c, double d) {
        return a + b + c + d;
    }
}