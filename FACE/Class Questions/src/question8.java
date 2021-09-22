import java.util.Scanner;

public class question8 {
    public static void main(String[] args) {
        int num;
        String s;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        s = (num % 2 == 0)? "Even" : "Odd";
        System.out.println(s);
    }
}
