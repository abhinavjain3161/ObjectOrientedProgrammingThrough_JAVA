import java.util.Scanner;

abstract class Shape2D {
    
    // Abstract methods
    abstract double calculateArea();
    abstract double calculatePerimeter();

    // Concrete method
    void showType() {
        System.out.println("This is a 2D Shape.");
    }
}

class Rectangle extends Shape2D {
    double length, width;

    Rectangle(double l, double w) {
        length = l;
        width = w;
    }

    @Override
    double calculateArea() {
        return length * width;
    }

    @Override
    double calculatePerimeter() {
        return 2 * (length + width);
    }
}


class Circle extends Shape2D {
    double radius;

    Circle(double r) {
        radius = r;
    }

    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

class ShapeDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Rectangle input
        System.out.print("Enter length of rectangle: ");
        double l = sc.nextDouble();
        System.out.print("Enter width of rectangle: ");
        double w = sc.nextDouble();

        Shape2D shape;

        // Runtime polymorphism - Rectangle
        shape = new Rectangle(l, w);
        shape.showType();
        System.out.println("Rectangle Area: " + shape.calculateArea());
        System.out.println("Rectangle Perimeter: " + shape.calculatePerimeter());

        // Circle input
        System.out.print("\nEnter radius of circle: ");
        double r = sc.nextDouble();

        // Runtime polymorphism - Circle
        shape = new Circle(r);
        shape.showType();
        System.out.println("Circle Area: " + shape.calculateArea());
        System.out.println("Circle Perimeter: " + shape.calculatePerimeter());

        sc.close();
    }
}
