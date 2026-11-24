
public class Main {

    interface Size {
        int LENGTH = 4;
        int WIDTH = 2;
        int HEIGHT = 5;
        int RADIUS = 3;
    }

    static class Rectangle implements Size {
        int calculateArea() {
            return LENGTH * WIDTH;
        }
    }
    static class Square implements Size {
        int calculateArea() {
            return LENGTH * LENGTH;
        }
    }
    static class Cuboid implements Size {
        int calculateArea() {
            return 2 * (
                    LENGTH * WIDTH +
                            WIDTH * HEIGHT +
                            HEIGHT * LENGTH
            );
        }
    }
    static class Cube implements Size {
        int calculateArea() {
            return 6 * LENGTH * LENGTH;
        }
    }
    static class Circle implements Size {
        double calculateArea() {
            return Math.PI * Math.pow(RADIUS, 2);
        }
    }
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle();
        Square square = new Square();
        Cuboid cuboid = new Cuboid();
        Cube cube = new Cube();
        Circle circle = new Circle();

        System.out.println("Area of Rectangle = " +
                rectangle.calculateArea());

        System.out.println("Area of Square = " +
                square.calculateArea());

        System.out.println("Surface Area of Cuboid = " +
                cuboid.calculateArea());

        System.out.println("Surface Area of Cube = " +
                cube.calculateArea());

        System.out.printf("Area of Circle = %.2f%n",
                circle.calculateArea());
    }
}
