import java.util.Scanner;

public class question14 {
    public static void main(String[] args) {
        int a,b;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        if(a>b){
            System.out.println(a + " greater than "+ b);
        }
        else if(b>a){
            System.out.println(a + " less than " +b);
        }
        else
            System.out.println(a + " equal to "+b);
    }
}
