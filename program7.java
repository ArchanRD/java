import java.util.Scanner;

public class program7 {
    public static void main(String[] args) {
    int num;
    Scanner sc = new Scanner(System.in);
    
    System.out.println("enter a num: ");
    num = sc.nextInt();

    if(num % 2 == 0){
        System.out.println("Num is even");
    }else{
        System.out.println("Num is odd");
    }
    
    }
}
