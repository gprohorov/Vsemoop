package pro.edu;

public class TriangleFactory {

    public static Tringle create(float a, float b, float c) {

        if (a +b > c) {
            return new Tringle(a,b,c);
        } else {
            return null;
        }
    }
}
