class Shape{
    String color;
    public void DisplayColor(){
        System.out.println(this.color);
    }

}
class Triangle extends Shape{
public void Area(int b, int h){
    System.out.println("Area of Triangle: "+ 0.5*b*h);
}
}

class Circle extends Shape{
    public void Area(int r){
        System.out.println( "Area of Circle: "+3.14*r*r);
    }
}

public class InheritanceExample {
    public static void main(String[] args) {
        Triangle t1= new Triangle();
        t1.color="red";
        t1.DisplayColor();
        t1.Area(10, 2);
        Circle c1= new Circle();
        c1.Area(5);
    }
    
}
