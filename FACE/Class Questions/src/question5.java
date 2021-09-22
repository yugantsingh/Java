//are of square rectangle and circle
import java.util.Scanner;

public class question5 {
    public static void main(String[] args) {
        int s,a,b;
        double r;
        Scanner sc = new Scanner(System.in);
        s = sc.nextInt();
        a = sc.nextInt();
        b = sc.nextInt();
        r = sc.nextDouble();
        sc.close();
        System.out.println((s*s));
        System.out.println((a*b));
        System.out.println((3.14*r*r));
    }
}
