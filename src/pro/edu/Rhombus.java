package pro.edu;
/*
*
* Classame : Rhombus
*
*  04 June 2020
*
* Copyright Ivanov Ivan CHNU 543 gr
*
*  Module 2 task 1
*
* Create a class from the attached document according to the order in your group .  The class must contain
1. Constructor.
2.. Getters/Setters.
3. 5 methods.
4. Override toString() method

5. Override hash() and equals() methods.
*
* */
public class Rhombus {

    private int side;
    private double angle;

    public Rhombus() {
    }

    public Rhombus(int side, double angle) {
        this.side = side;
        this.angle = angle;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    public double getAngle() {
        return angle;
    }

    public void setAngle(double angle) {
        this.angle = angle;
    }

    public double getArea(){
        return 0.5 * this.getLongDiagonal() * this.getShortDiagonal();
    }

    public double getPerimeter(){
        return 4 * this.getSide();
    }

    public double getLongDiagonal(){
        return this.getSide() * Math.sqrt( 2 + 2 *  Math.cos(this.getAngle()));
    }

    public double getShortDiagonal(){
        return this.getSide() * Math.sqrt( 2 -  2  * Math.cos(this.getAngle()));
    }

    public boolean isQuadrat(){

/*
        boolean result;

        if (this.getAngle() == 0.5 * Math.PI ) {
            result = true;
        } else {
            result = false;
        }
*/

        return (this.getAngle() == 0.5 * Math.PI) ? true : false ;
    }
    @Override
    public String toString() {
        return "Rhombus{" +
                "side=" + side +
                ", angle=" + angle +
                ", area=" + this.getArea() +
                ", perimeter=" + this.getPerimeter() +
                '}';
    }

}
