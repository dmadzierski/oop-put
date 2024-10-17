package pl.lessen.first;



public abstract class Figure {

    private final double a;
    private final double b;
    private final double x;
    private final double y;

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public Figure(double a, double b, double x, double y) throws Exception {
        if (!sideIsValid(a)) {
            throw new Exception("Side 'a' is not walid");
        }
        if (!sideIsValid(b)) {
            throw new Exception("Side 'b' is not walid");
        }
        this.a = a;
        this.b = b;
        this.x = x;
        this.y = y;
    }

    public Figure(int a, int b, int x, int y) throws Exception {
        this((double) a, (double) b, (double) x, (double) y);
    }

    public Figure(double a, double b) throws Exception {
        this(a, b, 0, 0);
    }

    public Figure(int a, int b) throws Exception {
        this((double) a, (double) b);
    }

    private boolean sideIsValid(double sideLength) {
        return sideLength > 0;
    }

    protected abstract double countField();

    protected abstract double countPerimeter();

    @Override
    public String toString() {
        return """
               Side of figure: %.2f, %.2f
               Coordinates: %.2f, %.2f
               """.formatted(this.a, this.b, this.x, this.y);
    }
}
