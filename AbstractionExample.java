
abstract class Shape {
    String color;

    abstract void displayShapeInfo();
    abstract void DisplayColor();
}

class Triangle extends Shape {
    public void displayShapeInfo() {
        System.out.println("Triangle has 3 sides");
    }

    public void DisplayColor() {
        System.out.println(this.color);
    }
}

class Square extends Shape {
    public void displayShapeInfo() {
        System.out.println("Square has 4 sides");
    }

    public void DisplayColor() {
        System.out.println(this.color);
    }
}

public class AbstractionExample {
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        t1.color = "red";
        t1.displayShapeInfo();
        t1.DisplayColor();

        Square s1 = new Square();
        s1.color = "blue";
        s1.displayShapeInfo();
        s1.DisplayColor();
    }
}
