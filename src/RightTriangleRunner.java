public class RightTriangleRunner {
    public static void main(String[] args) {
        RightTriangle triangle1 = new RightTriangle(3.0, 4.0);
        RightTriangle triangle2 = new RightTriangle(6.5, 10.7);
        System.out.println(triangle1.hypotenuse());
        System.out.println(triangle2.hypotenuse());
        System.out.println(Math.random() * 75 + 25);
    }
}
