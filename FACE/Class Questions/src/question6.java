import java.util.Scanner;

public class question6 {
    public static void main(String[] args) {
        int p,t;
        double r;
        Scanner sc = new Scanner(System.in);
        p = sc.nextInt();
        t = sc.nextInt();
        r = sc.nextDouble();
        System.out.println((p*r*t/100));
    }
}
