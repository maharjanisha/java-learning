import java.util.Scanner;

public class SimpleProgram {
    public static void main(String[] args) {
        System.out.println("Enter the money you have:  ");
        Scanner sc= new Scanner(System.in);
        int money=sc.nextInt();

        if(money < 10 )
        System.out.println("not enough money");
        else if (money>10 && money<40){
        System.out.println("can buy pen");} 
        else
        System.out.println("can buy both item");

    }
}
