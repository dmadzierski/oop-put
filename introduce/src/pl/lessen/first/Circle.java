package pl.lessen.first;



public class Circle extends Figure {

    private final double radius;

    public Circle(double radius, double x, double y) throws Exception {
        super(0, 0, x, y);
        this.radius = radius;
    }

    @Override
    protected double countField() {
        return Math.pow(this.radius, 2) * Math.PI;
    }

    @Override
    protected double countPerimeter() {
        return Math.PI * 2 * this.radius;
    }

}
