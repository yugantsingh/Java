import java.util.Scanner;

public class question9 {
    public static void main(String[] args) {
        int w, x, y;
        Scanner sc = new Scanner(System.in);
        w = sc.nextInt();
        x = sc.nextInt();
        y = sc.nextInt();
        System.out.println(w*(x-y)-100);
    }
}
