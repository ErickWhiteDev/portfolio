/*
    A program to calculate the cross-product of two vectors, a × b.
    Can be utilized in physics and mathematics.
*/

package projects.java;

public class CrossProduct{

    public static void main(String[] args){

        double[] vectorA = {1, 3, 5}; // First vector
        double[] vectorB = {1, -2, -3}; // Second vector

        System.out.print("The cross product of ");
        printVector(vectorA);
        System.out.print(" and ");
        printVector(vectorB);
        System.out.print(" is ");
        printVector(crossProduct(vectorA, vectorB));
    }

    private static void printVector(double[] vector){
        String a = String.format("%.2fi ", vector[0]);
        String b = vector[1] > 0 ? String.format("+ %.2fj ", vector[1]) : String.format("- %.2fj ", 0 - vector[1]);
        String c = vector[2] > 0 ? String.format("+ %.2fk", vector[2]) : String.format("- %.2fk", 0 - vector[2]);

        System.out.print(a + b + c); // Formats vector
    }

    private static double[] crossProduct(double[] vectorA, double[] vectorB){

        double i = (vectorA[1] * vectorB[2]) - (vectorA[2] * vectorB[1]); // Calculates i component of cross product
        double j = (vectorA[0] * vectorB[2]) - (vectorA[2] * vectorB[0]); // Calculates j component of cross product
        double k = (vectorA[0] * vectorB[1]) - (vectorA[1] * vectorB[0]); // Calculates k component of cross product

        return new double[] {i, 0 - j, k};
    }
}