package Shape;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[5];
        shapes[0] = new Triangle(4, 5, 3, 4, 5);
        shapes[1] = new Rectangle(3, 6);
        shapes[2] = new Circle(2);
        shapes[3] = new Triangle(5, 7, 5, 6, 7);
        shapes[4] = new Rectangle(4, 8);

        double totalPerimeter = 0;

        for (Shape shape : shapes) {
            double perimeter = shape.calculatePerimeter();
            totalPerimeter += perimeter;
        }

        System.out.println("Area of 0 shape: " + shapes[0].calculateArea());
        System.out.println("Area of 1 shape: " + shapes[1].calculateArea());
        System.out.println("Area of 2 shape: " + shapes[2].calculateArea());
        System.out.println("Area of 3 shape: " + shapes[3].calculateArea());
        System.out.println("Area of 4 shape: " + shapes[4].calculateArea());
        System.out.println();

        System.out.println("Perimeter of 0 shape: " + shapes[0].calculatePerimeter());
        System.out.println("Perimeter of 1 shape: " + shapes[1].calculatePerimeter());
        System.out.println("Perimeter of 2 shape: " + shapes[2].calculatePerimeter());
        System.out.println("Perimeter of 3 shape: " + shapes[3].calculatePerimeter());
        System.out.println("Perimeter of 4 shape: " + shapes[4].calculatePerimeter());
        System.out.println();

        System.out.println("The sum of the perimeters of all figures: " + totalPerimeter);
    }
}