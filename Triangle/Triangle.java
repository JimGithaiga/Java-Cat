import java.util.Scanner;

public class Triangle {
    double base = 0, height = 0;

    private void getDimensions() {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the base:");
        base = input.nextDouble();

        System.out.println("Enter the height:");
        height = input.nextDouble();
    }

    private double getComputedArea() {
        double area = 0.5 * base * height;
        return area;
    }

    private void display() {
        double computedArea = getComputedArea();
        System.out.println("The area is: " + computedArea);
    }

    public static void main(String[] args) {
        Triangle recObj = new Triangle();
        recObj.getDimensions();
        recObj.display();
    }
}
