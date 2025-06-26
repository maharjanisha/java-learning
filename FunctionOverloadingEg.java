class Students {
    String name;
    int age;

    // Function overloading example: same function name, different parameters
    public void printInfo(String name) {
        System.out.println(name);
    }

    public void printInfo(int age) {
        System.out.println(age);
    }

    public void printInfo(String name, int age) {
        System.out.println(name + " " + age);
    }
}

public class FunctionOverloadingEg {
    public static void main(String[] args) {
        Students s1 = new Students();
        s1.name = "isha";
        s1.age = 21;
        s1.printInfo(s1.age); // Outputs: 21
    }
}
