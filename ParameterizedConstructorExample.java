class Student{
    String name;
    int age;
    
    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }

    Student( String name, int age){   //parameterized constructor
        this.name=name;
        this.age=age;

    }
}


public class ParameterizedConstructorExample {
    public static void main(String[] args) {
        Student s1= new Student("isha", 20);
        s1.printInfo();
    }
    
}
