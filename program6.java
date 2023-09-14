import java.util.Scanner;
public class program6 {
    public static void main(String[] args) {
        int a, b, c;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        a = sc.nextInt();
        System.out.print("Enter a number: ");
        b = sc.nextInt();

        c = a + b;
        System.out.println("Addition: " + c);

        c = a - b;
        System.out.println("Subtraction: " + c);

        c = a * b;
        System.out.println("Multiplication: " + c);

        c = a / b;
        System.out.println("Divison: " + c);

        c = a % b;
        System.out.println("Modulo: " + c);

    }   
}
