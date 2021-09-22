//Average of 5 marks of the students
import java.util.Scanner;

public class question4 {
    public static void main(String[] args) {
        int m1,m2,m3,m4,m5;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Numbers");
        m1 = sc.nextInt();
        m2 = sc.nextInt();
        m3 = sc.nextInt();
        m4 = sc.nextInt();
        m5 = sc.nextInt();
        sc.close();
        System.out.println((double)((m1+m2+m3+m4+m5)/5) );
    }
}
