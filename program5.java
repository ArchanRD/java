import java.util.Scanner;

public class program5 {
    public static void main(String[] args) {
        System.out.println("Enter a num: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 1; i <= num; i++) {
            System.out.print(i + "\n");
        }
    }
}
