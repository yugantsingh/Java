import java.util.Scanner;

public class question18 {
    public static void main(String[] args) {
        int a,b,age;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        sc.close();
        if(b<=a) {
            b = b + 100;
        }
        age = b-a;
        System.out.println(age);
    }
}
