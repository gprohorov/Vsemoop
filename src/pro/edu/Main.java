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

        Triangle tr1 = new Triangle(3,4,5);
        Triangle tr2 = new Triangle(2,4,8);
        Triangle tr3 = new Triangle(1,1,1);

        tr2.setB(9);

        System.out.println(tr3.getC());

        EqileteralTriangle eTriangle = new EqileteralTriangle(4);
      System.out.println(eTriangle.getLinearLength());


    }






}
