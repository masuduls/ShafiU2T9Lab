public class CircleRunner {
    public static void main(String[] args) {
        Circle circle1 = new Circle(5.0);
        System.out.println(circle1.getInfo());
        circle1.setRadius(9.2);
        System.out.println(circle1.getInfo());
        System.out.println(Math.round(12.11));
    }
}
