package pro.edu;

import java.util.Objects;

public class Rectangle implements IGeometry, IPackaging{

    private int id;
    private int length;
    private int width;
    public final double PI = 3.14;

    public Rectangle(int id, int length, int width) {
        this.id = id;
        this.length = length;
        this.width = width;
    }



    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public Rectangle() {
    }

    //  POJO  plane old java object

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public double getArea(){
        return this.getLength() * this.getWidth();
    }

    @Override
    public double getPerimeter() {
        return 0;
    }

    public static int  getArea(int length, int width){
        return length * width;
    }

    public boolean isQuadrat(){
        return false;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return getId() == rectangle.getId();
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "id = " + id +
                ", length = " + length +
                ", width = " + width +
                '}';
    }

    @Override
    public String toJSON() {
        return null;
    }

    @Override
    public String toXML() {
        return null;
    }

    @Override
    public void toConsole() {

    }

    @Override
    public int hashCode() {
        return id;
    }
}
