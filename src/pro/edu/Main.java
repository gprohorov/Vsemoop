package pro.edu;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello, OOP");

        // Task without OOP
        // Calculate the area of a rectangle
        int length = 3;
        int width = 4;
        int area = length * width;
        System.out.println(area);

        int tableArea = Rectangle.getArea(1,2);

        Rectangle table = new Rectangle(1,2);

        double Pi = table.PI;


        double x = Math.sqrt(6);

        //=====================================================
        System.out.println(" -------   OOP -----------------");

        Rectangle wall = new Rectangle(3, 4);
        System.out.println(wall);

        Tringle tringle = new Tringle(3,4,5);
        Tringle triangle2 = TriangleFactory.create(1,1,10);
        System.out.println(triangle2);


    }
}
