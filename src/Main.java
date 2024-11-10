import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter number");

            long number = scanner.nextInt();
            System.out.println("Enter a second number");
            long secondnumber = scanner.nextInt();

            for (int i = 2; i < number; i++){
               if(number%i == 0 && secondnumber%1 ==0) {
                   System.out.println(i);
                   break;
               }
            }
    }
}


