package cycles.ext3;

import java.util.Scanner;

public class Main {
    //Все цифры из числа введенного через аргумент к исполняемой
    //программе перемножить между собой и вывести ход вычислений в консоль

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число");
        int chislo = scan.nextInt();
        int numZ = 0;
        int numX = chislo;
        int rezult = 1;

        while (numX != 0) {    // Разделил на числа цифру
            numZ = numX % 10;
            numX /= 10;
            rezult = rezult * numZ;
            System.out.println(numZ);
            if (numX!=0) {
                System.out.println("x");
            }
        }
        System.out.println("="+rezult);
    }
}
        //неправильное решение
//        if (args.length < 1) {
//            System.out.println("Использование: введите несколько чисел");
//            return;
//        }
//        for (String arg : args) {
//            double num1 = Double.parseDouble(arg);
//            for (String s : args) {
//                double num2 = Double.parseDouble(s);
//                System.out.println(num1 + " * " + num2 + " = " + num1 * num2);
//            }
//            System.out.println("");
//        }
//
//    }

