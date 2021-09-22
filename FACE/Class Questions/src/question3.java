//Three musketeers question involving midpoint theorem
import java.util.Scanner;

public class question3 {
    public static void main(String[] args) {
        int x1, y1, x2, y2;
        Scanner s = new Scanner(System.in);
        x1 = s.nextInt();
        y1 = s.nextInt();
        x2 = s.nextInt();
        y2 = s.nextInt();
        System.out.println((double) (x1+x2)/2);
        System.out.println((double) (y1+y2)/2);
    }
}
