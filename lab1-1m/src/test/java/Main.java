import static java.lang.Math.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {

        Scanner str = new Scanner(System.in);
        double y;
        double a;
        double b;
        double d;
        double x;
        System.out.print("Print X: ");
        x=str.nextDouble();

        double s = cos(sqrt(abs(x)));
        double c = pow(s, 2) +5;

        b = pow(4,(1/tan(4*x))) +5;
        a = (log10(b)/log10(2)) ;

        //d = pow(acos(s/a),5);
        d = pow(acos(s/c),6) ;
        y =pow(d, 1/5) +a;

        System.out.printf("%.2f", y);

    }
}
