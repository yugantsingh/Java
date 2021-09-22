import java.util.Scanner;

public class question1 {
    public static void main(String[] args) {
        double x,r,CI,amt,finalAmt;
        int y;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Principle Value, Year and Rate of interest");
        x = sc.nextDouble();
        y = sc.nextInt();
        r = sc.nextDouble();
        CI =   x *(Math.pow((1 + r / 100), y)) - x;
        amt = x + CI;
        finalAmt = amt - (CI*0.02);
        System.out.println(CI);
        System.out.println(amt);
        System.out.println((CI*0.02));
        System.out.println(finalAmt);

    }
}
