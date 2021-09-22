import java.util.Scanner;

public class question10 {
    public static void main(String[] args) {
        int a,r;
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        while(a>0){
            r = a % 10;
            sum += r;
            a = a/10;
        }
        System.out.println(sum);

    }
}
