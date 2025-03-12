import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите n: ");
        double n = in.nextDouble();
        System.out.println("Введите x: ");
        double x = in.nextDouble();
        double d = 1, b = 0, sum = 1, a = 0;
        for(double j = 0; j<=n;j++) {
            a = (Math.pow(-1,n)*Math.pow(x,2*n));
            d = (2*n)+1;
            for (double i = 1; i <= d; i++) {
                b = b * i;
            }
            if (b>0)
                sum = sum - (a/b);
            b = 1;
        }
        System.out.println(sum);
    }
}