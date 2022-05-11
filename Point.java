public class Point {
    double x;
    double y;

    void print() {
        System.out.println("Class Point. ");
        System.out.println("X = " + x);
        System.out.println("Y = " + y);
    }

    double length() {
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    }
}
