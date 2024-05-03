/* Chapter 8 Ex8.4
 * Create a class Rectangle with attributes length and width, 
 * each of which defaults to 1. Provide methods that calculate the 
 * rectangle’s perimeter and area. It has set and get methods for both 
 * length and width. The set methods should verify that length and 
 * width are each floating-point numbers larger than 0.0 and less than 20.0. 
 * Write a program to test class Rectangle.
 */

 class Rectangle {
    private double length;
    private double width;

    // Constructor with default values
    public Rectangle() {
        this.length = 1.0;
        this.width = 1.0;
    }

    // Method to calculate perimeter
    public double calculatePerimeter() {
        return 2 * (length + width);
    }

    // Method to calculate area
    public double calculateArea() {
        return length * width;
    }

    // Getter and setter for length
    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if (isValidDimension(length)) {
            this.length = length;
        } else {
            System.out.println("Invalid length. Length should be a floating-point number larger than 0.0 and less than 20.0.");
        }
    }

    // Getter and setter for width
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (isValidDimension(width)) {
            this.width = width;
        } else {
            System.out.println("Invalid width. Width should be a floating-point number larger than 0.0 and less than 20.0.");
        }
    }

    // Method to validate dimension (length or width)
    private boolean isValidDimension(double dimension) {
        return dimension > 0.0 && dimension < 20.0;
    }
}

public class ex84RectangleTest {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();

        // Initial values
        System.out.println("Initial Length: " + rectangle.getLength());
        System.out.println("Initial Width: " + rectangle.getWidth());

        // Set new values
        rectangle.setLength(5.5);
        rectangle.setWidth(3.0);

        // Display new values
        System.out.println("\nNew Length: " + rectangle.getLength());
        System.out.println("New Width: " + rectangle.getWidth());

        // Calculate and display perimeter and area
        System.out.println("\nPerimeter: " + rectangle.calculatePerimeter());
        System.out.println("Area: " + rectangle.calculateArea());
    }
}
