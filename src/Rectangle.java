public class Rectangle {
    double width, height;

    public Rectangle() {
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return this.width * this.height;
    }

    public double getPerimeter() {
        return (this.width + this.height) * 2;
    }

    public String display() {
        return "Rectangle{" + "width=" + width + ", height=" + height + "}";
    }

    public void print() {
        System.out.println("Your Rectangle \n" + this.display());
        System.out.println("Perimeter of the Rectangle: " + this.getPerimeter());
        System.out.println("Area of the Rectangle: " + this.getArea());
    }
}
