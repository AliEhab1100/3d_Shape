Shape Area and Volume Calculator (Java OOP + GUI)

This Java project demonstrates the use of Object-Oriented Programming (OOP) principles — including abstraction, inheritance, and polymorphism — to calculate and display the area and volume of geometric shapes such as circles and cubes. It also features a simple GUI built with Swing to allow users to create shapes interactively and compute the total area.

-------------------------------------------------------------------------------
Features
-------------------------------------------------------------------------------
- Interface (Drawable): Defines the contract for drawable shapes.
- Abstract class (Shape): Implements shared attributes such as color and creation date.
- Concrete classes (Circle, Cube): Implement shape-specific calculations.
- 3D Shape abstraction (ThreeDShape): For future extension.
- Swing GUI (DrawableGUI):
  * Add shapes by type and dimension.
  * Display a list of shapes and their individual areas.
  * Compute and show the total area of all shapes added.
- Console testing class (DrawableTest):
  * Run shape calculations via command line arguments.

-------------------------------------------------------------------------------
Example (Console)
-------------------------------------------------------------------------------
To run from the terminal:

javac *.java
java DrawableTest 2 circle 5 cube 3

Output Example:
Circle
Area of 78.53981633974483
Cube
Area of 54.0
Total area of all drawables: 132.53981633974485

-------------------------------------------------------------------------------
Example (GUI)
-------------------------------------------------------------------------------
Run the graphical interface with:

java DrawableGUI

Then:
1. Enter a shape type (circle or cube).
2. Enter its dimension (radius or side).
3. Click "Add Shape" to list it.
4. Click "Calculate Total Area" to view the sum of all shapes’ areas.

-------------------------------------------------------------------------------
Concepts Demonstrated
-------------------------------------------------------------------------------
- Abstraction and Interfaces
- Inheritance
- Polymorphism
- GUI Programming (Swing)
- Data Encapsulation
- Dynamic Lists (ArrayList)
- Event Handling (ActionListeners)

-------------------------------------------------------------------------------
Recommended Project Structure
-------------------------------------------------------------------------------
src/
 ├── Drawable.java
 ├── Shape.java
 ├── ThreeDShape.java
 ├── Circle.java
 ├── Cube.java
 ├── DrawableGUI.java
 └── DrawableTest.java

-------------------------------------------------------------------------------
Author
-------------------------------------------------------------------------------
Ali Ehab Ali
Faculty of Computer Science, Asyut University
Email: aliehab762@gmail.com
LinkedIn: https://www.linkedin.com/in/ali-ehab-b857722ba

-------------------------------------------------------------------------------
License
-------------------------------------------------------------------------------
This project is open-source and available under the MIT License.
