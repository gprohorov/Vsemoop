package pro.edu;

public class Tringle {

    private float sideA;
    private float sideB;
    private float sideC;

    public Tringle() {
    }
    public Tringle(float sideA) {
        this.sideA = sideA;
        this.sideB = sideA;
        this.sideC = sideA;
    }


    public Tringle(float sideA, float sideB, float sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        if(sideA + sideB < sideC){
            System.out.println(" Not valid");
        }
    }

    public Tringle(float sideA, float sideB, double alpha) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = (float) Math.sqrt(sideA*sideA + sideB*sideB - 2* sideA*sideB* Math.cos(alpha));
    }



    public float getSideA() {
        return sideA;
    }

    public void setSideA(float sideA) {
        this.sideA = sideA;
    }

    public float getSideB() {
        return sideB;
    }

    public void setSideB(float sideB) {
        this.sideB = sideB;
    }

    public float getSideC() {
        return sideC;
    }

    public void setSideC(float sideC) {
        this.sideC = sideC;
    }

    @Override
    public String toString() {
        return "Tringle{" +
                "sideA=" + sideA +
                ", sideB=" + sideB +
                ", sideC=" + sideC +
                '}';
    }
}
