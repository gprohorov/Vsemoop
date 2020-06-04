package pro.edu;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello, OOP");

      Rhombus rhombus = new Rhombus(4, Math.PI / 6);

        System.out.println(rhombus);
        System.out.println(rhombus.hashCode());

        Rhombus rhomb2 = new Rhombus((7 + 5) /5 , Math.PI / 6 );

        System.out.println(rhombus.equals(rhomb2));

        Wall myWall = new Wall("white",
                "bricks",
                true,
                7,
                5,
                false,
                1);

        myWall.setLength(5);
        myWall.setWidth(3);

    }
}
