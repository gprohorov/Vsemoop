package pro.edu;

import java.util.Objects;

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
public class Rhombus implements IGeometry{

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

    @Override
    public double getLinearLength() {
        return this.getPerimeter();
    }

    public double getPerimeter(){
        return 4 * this.getSide();
    }
    // The longest diagonal
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


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rhombus rhombus = (Rhombus) o;
        return getSide() == rhombus.getSide() &&
                Double.compare(rhombus.getAngle(), getAngle()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getSide(), getAngle());
    }

}
