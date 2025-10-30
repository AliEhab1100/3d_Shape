package OOP.java;

import java.util.Date;

public abstract class Shape implements Drawable {
    private Date dateCreated;
    private String color;

    public Shape() {
        this.dateCreated = new Date();
        this.color = "Red";
    }
    
    protected Shape(String color) {
        this.dateCreated = new Date();
        this.color = color;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    @Override
    public abstract double getVolume();
    public abstract double getPerimeter();
    @Override
    public abstract String getName();
    @Override
    public String toString() {
        return "Shape created on " + dateCreated + " with color " + color;
    }
}
