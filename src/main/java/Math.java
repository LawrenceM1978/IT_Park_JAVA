import java.util.Scanner;
import java.io.*;

public class Math {

    public static int factorial(int N) {
        int Factor = 1;
        for (int i = 2; i <= N; i++)
            Factor = Factor * i;

        return Factor;
    }

    public static int sum(int N) {
        int SUM;
        SUM = (N + 1) * N / 2;

        return SUM;
    }

    public static void main(String[] args) {
        int a;
        int b;
        Scanner in = new Scanner(System.in);
        System.out.print("введите число а:");
        a = in.nextInt();
        System.out.println("выберите операцию вычисления:");
        System.out.println("1: факториал");
        System.out.println("2: арифметическая прогрессия");
        int n = in.nextInt();

        switch (n) {
            case 1:
                b = factorial(a);
                System.out.println("результат вычисления: " + b);
                break;

            case 2:
                b = sum(a);
                System.out.println("результат вычисления: " + b);
                break;
        }
    }
}
