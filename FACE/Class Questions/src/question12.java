import java.util.Scanner;

public class question12 {
    public static void main(String[] args) {
        int x1, y1, x2, y2, x3, y3;
        Scanner sc = new Scanner(System.in);
        x1 = sc.nextInt();
        y1 = sc.nextInt();
        x2 = sc.nextInt();
        y2 = sc.nextInt();
        x3 = sc.nextInt();
        y3 = sc.nextInt();
        System.out.println(((double)(x1+x2+x3)/3));
        System.out.println(((double)(y1+y2+y3)/3));
    }
}
