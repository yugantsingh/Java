import java.util.Scanner;

public class question19 {
    public static void main(String[] args) {
        int x,y,z,n;
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        y = sc.nextInt();
        z = sc.nextInt();
        n = sc.nextInt();
        if((x-n >=0) && (y-n>=0) && (z-n >=0))
            System.out.println("3");
        else if((x-n>=0) && (y-n>=0))
            System.out.println("2");
        else if((x-n>=0 || (y-n>=0)))
            System.out.println("1");
    }
}
