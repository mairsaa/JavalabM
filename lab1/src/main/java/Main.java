import java.util.Scanner;

import static java.lang.Math.*;
public class Main {
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        double a;
        double b;
        double c;
        double d;
        double f;
        double g;
        double y;
        double x;
        System.out.print("Print X: ");
        x=str.nextDouble();

        a=pow(abs(x), cos(x));//модуль Х в степени cos x
        b=pow(3, 1.0/tan(x));//3в степени ctgx
        c =log((b+a)/log(7.0));

        d = (sqrt(2*abs(x+3))) + 4;//то что под корнем
        f =  pow(d, 1.0/3);
        g = pow(x, 2) / (pow(x, 2)+1);
        y = (pow(asin(g), 7)) + f+c;

        System.out.printf("%.2f", y);//вывод y
    }
}

