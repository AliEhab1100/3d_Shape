package OOP.java;

public abstract class ThreeDShape extends Shape {
    private double volume;
    
    public ThreeDShape(double volume, double value) {
        
        this.volume = volume;
    }

    public ThreeDShape() {
        this.volume = 1.0;
    }
    
    @Override
    public abstract double getVolume();

    @Override
    public String toString() {
        return  "volume=" + volume + '}';
    }
    
}
