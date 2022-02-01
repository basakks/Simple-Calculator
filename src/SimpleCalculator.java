import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {

        int number1, number2, select;
        Scanner input = new Scanner(System.in);

        System.out.print("Please write first number : ");
        number1 = input.nextInt();

        System.out.print("Please write second number : ");
        number2 = input.nextInt();

        System.out.println("1-Plus\n2-Minus\n3-Divided by\n4-Multiplied by");
        System.out.print("Your choose : ");
        select = input.nextInt();

        switch (select) {
            case 1:
                System.out.println("Your result : " + (number1 + number2));
                break;
            case 2:
                System.out.println("Your result : " + (number1 - number2));
                break;
            case 3:
                System.out.println("Your result : " + (number1 / number2));
                break;
            case 4:
                System.out.println("Your result : " + (number1 * number2));
                break;

            default:
                System.out.println("Please try again !");
        }

    }
}
