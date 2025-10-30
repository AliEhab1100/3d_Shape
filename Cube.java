package OOP.java;

public class Cube extends Shape {
    private double side;

    Cube(double value) {
        this.side=value;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
    
    @Override
    public double getArea() {
        return 6 * side * side;
    }
    
    public Cube(){
        this.side=1.0;
        String color=this.getColor();
    }

    @Override
    public void howtodraw() {
        System.out.println("Drawing a cube with side " + side);
    }

    @Override
    public String toString() {
        return "Cube with side: " + side + " is: ";
    }

    @Override
    public double getPerimeter() {
        return 12*side;
    }

    @Override
    public double getVolume() {
        return side*side*side;
    }

    @Override
    public String getName() {
        return "Cube";
    }
    
}
