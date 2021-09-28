import java.util.Scanner;

public class question23 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n, r;
        int sum=0;
        n = sc.nextInt();

        for(int i=1; i<n;i++){
         int num =i;
            while(num>0){
                r = num % 10;
                sum+= (r*r*r);
                num = num/10;
            }
            if(sum == i)
                System.out.println(i);
            sum =0;
        }

    }
}
