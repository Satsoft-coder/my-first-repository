package Ex1;

import java.util.Scanner;

public class Ex1_3 {
    public static void main(String[] args) {

        //Написать программу которая будет принимать строки введенные в консоли (через Scanner.in) и по
        //окончанию (придумать как окончить выполнение ввода данных) вывести результат в одну строку в консоли
        System.out.print("Введите несколько строк.\nДля окончания введите любое целое число\n");
        Scanner scanner = new Scanner(System.in);
        String rezult="";
        while (!scanner.hasNextInt()) {
            String str = scanner.nextLine();
            rezult = rezult.concat(str).concat(" ");
        }
        scanner.close();
        System.out.println(rezult);
    }
}
