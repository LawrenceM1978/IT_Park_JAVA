package lesson3;
import java.util.Scanner;
import java.math.*;

public class lesson3 {

    public static int factorial(int N) {
        int Factor = 1;
        for (int i = 2; i <= N; i++)
            Factor = Factor * i;

        return Factor;
    }


    public static void equetion (double a, double b, double c) {

        // найдём дискриминант
        double D = b * b - 4 * a * c;

        // если A равно нулю, то уравнение линейное: Bx + C = 0 и если b!=0 то корень есть -с/b
        // но согласно тех заданию:
        if (a == 0) {
            System.out.println("Первый коэффициент не может быть 0");
        } else if (D < 0) {

            System.out.println("Нет действительных решений уравнения");
        } else if (D == 0) {  // случай с нулевым дискриминантом

            // корень ровно один
            double r1 = -b / (2 * a);
            System.out.println("корень уравнения: " + r1);


        } else if (D > 0) {  // в случае с положительным дискриминантом корня два

            double r1 = (-b + Math.sqrt(D)) / (2 * a);
            double r2 = (-b - Math.sqrt(D)) / (2 * a);

            System.out.println("корни уравнения: " + r1 + " " + r2);


        }
    }



    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("выберите вариант вычислений:");
        System.out.println("1: факториал");
        System.out.println("2: корни квадратного уравнения");
        int n = in.nextInt();

        switch (n) {
            case 1:
                System.out.print("введите число а:");
                int a = in.nextInt();
                int b = factorial(a);
                System.out.println("результат вычисления: " + b);
                break;

            case 2:
                double A, B, C;
                System.out.println("вычисляем корни квадратного уравнения: ax^2 + bx+ c =0");
                System.out.println("введите число а:");
                A = in.nextInt();

                System.out.println("введите число b:");
                B = in.nextInt();

                System.out.println("введите число c:");
                C = in.nextInt();

                equetion (A, B, C);
                break;
        }



        }
}


