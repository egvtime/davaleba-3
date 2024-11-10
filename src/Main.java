import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter number");

            long number = scanner.nextInt();

            boolean prime = false;
            boolean notprime = false;

            for (int i = 2; i < number; i++){
                if (number % i == 0){
                    notprime = true;
                }
                prime = true;
            }
            if (prime == true && notprime == false){
                System.out.println("prime");
            }
            else
            {
                System.out.println("not prime");
            }
    }
}


