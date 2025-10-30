package OOP.java;

public class DrawableTest {
    public static void main(String[] args) {
        if (args.length % 2 != 1) {
            System.out.println("Invalid arguments.");
            return;
        }
        int size = Integer.parseInt(args[0]);
        Drawable[] drawables = new Drawable[size];
        int index = 0;
        for (int i = 1; i < args.length; i += 2) {
            String type = args[i];
            double value = Double.parseDouble(args[i + 1]);
            double value2 = 0 ;
            if (type.equalsIgnoreCase("circle")) {
                drawables[index++] = new Circle(value);
            } else if (type.equalsIgnoreCase("cube")) {
                drawables[index++] = new Cube(value);
            } else {
                System.out.println("Invalid shape type '" + type + "'. Supported types: circle, cube.");
                return; 
            }
        }
        double totalArea = 0;
        for (Drawable drawable : drawables) {
            double area=drawable.getArea();
            System.out.println(drawable.getName());
            System.out.println("Area of " + drawable.getArea());
            totalArea += area;
        }
        System.out.println("Total area of all drawables: " + totalArea);
    }
}
