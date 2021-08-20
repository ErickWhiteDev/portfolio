/* 
The program calculates the area of a square and a circle using multiple classes and inheritance

Finished 8/18/21
*/

package sololearn_challenges.course_challenges.java;

import java.util.Scanner;

abstract class Shape {
    int width;
    abstract void area();
}

class Circle extends Shape {
    public Circle(int radius){
        this.width = radius;
    }
    @Override
    public void area(){
        System.out.println(Math.PI * width * width);
    }
}

class Square extends Shape {
    public Square(int width){
        this.width = width;
    }
    @Override
    public void area(){
        System.out.println(width * width);
    }
}


class Shapes {
    public static void main(String[ ] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        
        Square a = new Square(x);
        Circle b = new Circle(y);
        a.area();
        b.area();

        sc.close();
    }
}
