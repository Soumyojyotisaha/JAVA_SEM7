class Rectangle {
    int length;   // Field to store the length of the rectangle
    int width;    // Field to store the width of the rectangle

    // Method to set the values of length and width
    void insert(int l, int w) {
        length = l;
        width = w;
    }

    // Method to calculate and print the area of the rectangle
    void calculateArea() {
        System.out.println(length * width);
    }
}

class TestRectangle1 {
    public static void main(String args[]) {
        // Creating two objects of the Rectangle class
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle();

        // Inserting values for the first rectangle
        r1.insert(11, 5);

        // Inserting values for the second rectangle
        r2.insert(3, 15);

        // Calculating and printing the area for both rectangles
        r1.calculateArea();  // Output: 55
        r2.calculateArea();  // Output: 45
    }
}
