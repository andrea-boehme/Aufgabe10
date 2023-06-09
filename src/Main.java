/**
 * main method creates two vectors with given parameters,
 * calls add and subtract calculation methods (calculates third point with first and second point),
 * also calls scalar, cross product and length calculation methods
 * prints out the results
 * @param args
 */
public class Main {
    public static void main(String[] args) {


        Vector a = new Vector(1, 1, 1);
        Vector b = new Vector(2, 2, 2);

        Vector sum = a.add(b);
        Vector subtract = a.subtract(b);
        Double scalar = a.scalar(b);
        Vector cross = a.cross(b);
        Double length = a.length(b);


        System.out.println("Vector 1: " + a + ", Vector 2: " + b);
        System.out.println("Addition: " + sum);
        System.out.println("Subtraction: " + subtract);

        System.out.println("scalar: " + scalar);
        System.out.println("cross product: " + cross);
        System.out.println("length: " + length);

    }
}