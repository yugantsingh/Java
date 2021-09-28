import java.util.Scanner;

public class question22 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n, r, sum=0;
        int num;
        n = sc.nextInt();
        num = n;
        while(num>0){
            r = num % 10;
            sum+= (r*r*r);
            num = num/10;
        }
        if(n == sum){
            System.out.println("Armstrong");
        }
        else
            System.out.println("Not an Armstrong Number");
    }
}
