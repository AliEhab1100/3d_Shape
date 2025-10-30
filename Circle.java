package OOP.java;

public class Circle extends Shape {
    private double rad;
    private double height;

    Circle(double value) {
        this.rad=value;
    }
    
    public double getRad() {
        return rad;
    }

    public void setRad(double rad) {
        this.rad = rad;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    
    @Override
    public double getArea() {
        return Math.PI * rad * rad;
    }
    
    public Circle(){
        this.rad=1.0;
        String color=this.getColor();
    }

    @Override
    public void howtodraw() {
        System.out.println("Drawing a circle with radius " + rad);
    }

    @Override
    public String toString() {
        return "Circle with radius " + rad + " is: ";
    }

    @Override
    public double getPerimeter() {
        return 2*Math.PI*rad;
    }

    
    @Override
    public double getVolume() {
        return Math.PI*rad*rad*height;
    }

    @Override
    public String getName() {
        return "Circle";
    }
    
}
