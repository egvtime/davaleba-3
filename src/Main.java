import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter number");
            int number = scanner.nextInt();

            for(int i = 1; i>0; i++) {
                    if(number<(Math. pow(10, i))){
                        System.out.println(i);
                        break;
                }
                if(number==(Math. pow(10, i))){
                    System.out.println(i+1);
                    break;
                }
                }
            }
    }

