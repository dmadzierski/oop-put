package pl.lessen.first;



class Rectangle extends Figure{

    public Rectangle(double a, double b, double x, double y) throws Exception {
        super(a,b,x,y);
    }
    
     public Rectangle(int a, int b, int x, int y) throws Exception {
        super(a,b,x,y);
    }

    public Rectangle(double a, double b) throws Exception {
        super(a,b);
    }
    
    public Rectangle(int a, int b) throws Exception {
        super(a,b);
    }

    @Override
    public double countField() {
        return super.getA() * super.getB();
    }

    @Override
    public double countPerimeter() {
        return (super.getA() + super.getB()) * 2;
    }
}
