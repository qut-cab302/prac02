package shapes;


public class ShapeHandler {

    // Returns the sum of the volumes of the given shapes.
    public static double volumeSum(Shape[] shapes) {
        double sum = 0;
        for (Shape shape : shapes) {
            sum += shape.volume();
        };
        return sum;
    }

    // Returns the sum of the surface areas of the given shapes.
    public static double surfaceAreaSum(Shape[] shapes) {
        double sum = 0;
        for (Shape shape : shapes) {
            sum += shape.surfaceArea();
        };
        return sum;
    }

    public static void main(String[] args) {

        Shape[] shapes = {new Cube(5), new Tetrahedron(10)};

        System.out.println("The volume sum of the shapes is: " + volumeSum(shapes));
        System.out.println("The surface area sum of the shapes is: " + surfaceAreaSum(shapes));
    }

}