import static java.lang.Math.*;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int i;
        int men = 0;
        int ind = 0;
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число размер матрицы ");
        int x1 = in.nextInt();
        int x2 = in.nextInt();
        System.out.print("Введите индекс: ");
        int y = in.nextInt();

        double [][]mas = new double[x1][x2];

        double max = 50;
        double min = -50;
        Random random = new Random();

        for(i = 0; i < x1; i++) {
            for (int k=0; k<x2;k++){
                mas[i][k] = min +(max - min) * random.nextDouble();
                System.out.print(mas[i][k] + " ");
            }
            System.out.println(" ");
        }
        for(i = 0; i < x1; i++) {
            for (int k=0; k<x2;k++){
                if(mas[i][k] < y){
                    men++;
                    System.out.println("положение чисел в массиве меньше введенного числа" + i + " " + k + " количество чисел  меньше введеного = "+ men);
                }
                if ((abs(i - k)) % 5 == 0){
                    ind++;
                    System.out.println("положение чисел кратных 5 массиве " + i + " " + k + " количество разности чисел кратных 5 индексов = " + ind);
                }
            }
        }

    }
}
