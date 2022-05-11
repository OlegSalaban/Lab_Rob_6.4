public class Main {
    public static void main(String[] args) {
        Point pointObj = new Point();
        pointObj.x = 5;
        pointObj.y = -10.2;

        Line lineObj = new Line();
        lineObj.x1 = 5;
        lineObj.y1 = -5;
        lineObj.x2 = 22.25;
        lineObj.y2 = 10.8;

        Person personObj = new Person();
        personObj.name = "Max";
        personObj.surname = "Smith";
        personObj.age = 32;

        pointObj.print();
        System.out.println("Length from (0;0) to point: " + pointObj.length());
        System.out.println();

        lineObj.print();
        System.out.println("Length: " + lineObj.length());
        System.out.println();

        personObj.print();
        System.out.println("Count of month: " + personObj.countOfMonth());
    }
}
