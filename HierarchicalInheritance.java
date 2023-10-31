package corejavapracticeproject;
class Shape {
    void draw() {
        System.out.println("Drawing a shape");
    }
}

class Circle extends Shape {
    void calculateArea() {
        System.out.println("Calculating circle area");
    }
}

class Rectangle extends Shape {
    void calculateArea() {
        System.out.println("Calculating rectangle area");
    }
}

public class HierarchicalInheritance {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();
        
        circle.draw();          
        circle.calculateArea(); 

        rectangle.draw();          
        rectangle.calculateArea(); 


	}

}
