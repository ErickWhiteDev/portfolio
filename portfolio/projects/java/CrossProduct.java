/*
    A program to calculate the cross-product of two vectors, a × b.
    Can be utilized in physics and mathematics.
*/

package projects.java;

public class CrossProduct{

    public static void main(String[] args){

        double[] vectorA = {3, 1, 2}; // First vector
        double[] vectorB = {2, -3, -5}; // Second vector

        System.out.print("The cross product of ");
        printVector(vectorA);
        System.out.print(" and ");
        printVector(vectorB);
        System.out.print(" is ");
        printVector(crossProduct(vectorA, vectorB));
    }

    private static void printVector(double[] vector){
        System.out.printf("%.2fi - %.2fj + %.2fk", vector[0], vector[1], vector[2]); // Formats vector
    }

    private static double[] crossProduct(double[] vectorA, double[] vectorB){

        double i = (vectorA[1] * vectorB[2]) - (vectorA[2] * vectorB[1]); // Calculates i component of cross product
        double j = (vectorA[2] * vectorB[0]) - (vectorA[0] * vectorB[2]); // Calculates j component of cross product
        double k = (vectorA[0] * vectorB[1]) - (vectorA[1] * vectorB[0]); // Calculates k component of cross product

        return new double[] {i, j, k};
    }
}