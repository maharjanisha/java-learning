public class ExceptionExample {
    public static void main(String[] args) {
        int num=10;
        try{
             int div= num/0;
        } catch(Exception e){
            System.out.println(e);
        }
       System.out.println("Hello");

    }
}
