import java.util.Scanner;

class Circle {
    double radius;
    double area;
    Circle() {
        radius = 0;
    }
    Circle(double radius) {
        this.radius = radius;
    }
    double findArea() {
        area = 2*3.14*radius;
        return area;
    }
}

public class constructorOverloadingCircle {
    public static void main(String args[]) {
        double radius;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the radius to find area of a circle : ");
        radius = in.nextDouble();
        Circle obj = new Circle(radius);
        System.out.println("Area of the circle : " + obj.findArea());
        in.close();
    }
}
