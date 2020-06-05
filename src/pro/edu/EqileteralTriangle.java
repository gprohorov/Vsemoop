package pro.edu;

public class EqileteralTriangle extends  Triangle{
    private int sideA;

    public EqileteralTriangle( int sideA) {
        super(sideA, sideA, sideA);
        this.sideA = sideA;
    }

    public int getSideA() {
        return sideA;
    }

    public void setSideA(int sideA) {
        this.sideA = sideA;
    }

    @Override
    public String toString() {
        return "EqileteralTriangle{" +
                "sideA=" + sideA +
                '}';
    }
}
