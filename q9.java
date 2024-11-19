import java.util.Scanner;

abstract class ThreeDObject {
    public abstract double volume();
    public abstract double wholeSurfaceArea();
}

class Box extends ThreeDObject {
    double length, width, height;

    public Box(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public double volume() {
        return length * width * height;
    }

    public double wholeSurfaceArea() {
        return 2 * (length * width + width * height + height * length);
    }
}

class Cube extends ThreeDObject {
    double side;

    public Cube(double side) {
        this.side = side;
    }

    public double volume() {
        return side * side * side;
    }

    public double wholeSurfaceArea() {
        return 6 * side * side;
    }
}

class Cylinder extends ThreeDObject {
    double radius, height;

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    public double volume() {
        return Math.PI * radius * radius * height;
    }

    public double wholeSurfaceArea() {
        return 2 * Math.PI * radius * (radius + height);
    }
}

class Cone extends ThreeDObject {
    double radius, height;

    public Cone(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    public double volume() {
        return (1.0/3) * Math.PI * radius * radius * height;
    }

    public double wholeSurfaceArea() {
        double slantHeight = Math.sqrt(radius * radius + height * height);
        return Math.PI * radius * (radius + slantHeight);
    }
}

public class q9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter side of cube: ");
        Cube cube = new Cube(scanner.nextDouble());
        System.out.println("Volume of Cube: " + cube.volume());
        System.out.println("Surface Area of Cube: " + cube.wholeSurfaceArea());

        System.out.print("Enter length, width, height of box: ");
        Box box = new Box(scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble());
        System.out.println("Volume of Box: " + box.volume());
        System.out.println("Surface Area of Box: " + box.wholeSurfaceArea());

        System.out.print("Enter radius and height of cylinder: ");
        Cylinder cylinder = new Cylinder(scanner.nextDouble(), scanner.nextDouble());
        System.out.println("Volume of Cylinder: " + cylinder.volume());
        System.out.println("Surface Area of Cylinder: " + cylinder.wholeSurfaceArea());

        System.out.print("Enter radius and height of cone: ");
        Cone cone = new Cone(scanner.nextDouble(), scanner.nextDouble());
        System.out.println("Volume of Cone: " + cone.volume());
        System.out.println("Surface Area of Cone: " + cone.wholeSurfaceArea());
    }
}
