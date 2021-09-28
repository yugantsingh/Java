import java.util.Scanner;

public class question24 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n,c=0;
        n = sc.nextInt();

        for(int i=1; i<n;i++){
            for(int j=1;j<=i;j++){
                if(i%j==0)
                    c++;
            }
            if(c==2)
                System.out.println(i);
            c=0;
        }

    }
}
