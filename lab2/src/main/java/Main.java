import static java.lang.Math.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        double y = 0;
        //эти строчки ниже для ввода значения переменной с клавиатуры
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число х: ");
        float x = in.nextFloat();

        //уравнение 1
        if (x<=1){
            y = log((abs(pow(7, x)) - abs(pow(x - 3, 7)))) / log(7);
        }
        //уравнение 2
        if ((x>1)&(x<3)){
            y = (double) log(pow(x,8)/(1+pow(x,2)));
        }
        if(x>=3){
            y = (double) asin(x/(1+pow(x,2)));
        }
        System.out.println(y);
    }

}
