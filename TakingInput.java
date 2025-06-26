import java.util.Scanner;

public class TakingInput {
    public static void main(String[] args) {
        System.out.println("Enter your name");
        Scanner sc= new Scanner(System.in); //to take input from user
        String name=sc.next();
        System.out.println(name);

        System.out.println("enter your age: ");
        Scanner sc1= new Scanner(System.in);
        int age= sc1.nextInt();
        System.out.println(age);

    }
}
