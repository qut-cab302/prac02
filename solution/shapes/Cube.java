package shapes;

public class Cube implements Shape {

    double edge;

    public Cube(double edge) {
        this.edge = edge;
    }


    @Override
    public double volume() {
        return Math.pow(edge, 3);
    }

    @Override
    public double surfaceArea() {
        return 6 * Math.pow(edge, 2);
    }
}
