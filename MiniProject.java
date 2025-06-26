import java.util.Scanner;

public class MiniProject {
    public static void main(String[] args) {
        
        int myNumber= (int)(Math.random()*100);    
        Scanner sc= new Scanner(System.in);
          int userNumber=0;

        do{
            System.out.println("Guess my number: ");
             userNumber= sc.nextInt();

            if(userNumber == myNumber){
            System.out.println("woohoo correct number");
            break;

            }
            
            else if (userNumber >myNumber) {
                System.out.println("your number is too large");
                
            }
            else
            System.out.println("your number is too small");
        }while(userNumber>=0);

        System.out.println("my number was: "+myNumber);
    }
}
