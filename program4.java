import java.util.Scanner;

public class program4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1 number: ");
        int a = sc.nextInt();
        System.out.print("Enter 2 number: ");
        int b = sc.nextInt();
        int c = a + b;
        System.out.print("Addition of a and b is : " + c);
    }
}
