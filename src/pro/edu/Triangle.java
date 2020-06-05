package pro.edu;

public class Triangle implements  IGeometry{

    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Triangle() {
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double chislo) {

        if (b >0 ) this.b = chislo;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    @Override
    public double getArea() {
        double semi = this.getLinearLength() /2;
        return  Math.sqrt(semi * (semi - a) * (semi -b) * (semi -c) );
    }

    @Override
    public double getLinearLength() {
        return a + b + c;
    }
}
