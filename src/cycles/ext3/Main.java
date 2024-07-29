package cycles.ext3;

public class Main {
    //Все цифры из числа введенного через аргумент к исполняемой
    //программе перемножить между собой и вывести ход вычислений в консоль

    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Использование: введите несколько чисел");
            return;
        }
        for (String arg : args) {
            double num1 = Double.parseDouble(arg);
            for (String s : args) {
                double num2 = Double.parseDouble(s);
                System.out.println(num1 + " * " + num2 + " = " + num1 * num2);
            }
            System.out.println("");
        }

/*        double rezult=Double.parseDouble(args[0])
        for (int i = 1; i < args.length; i++) {
            double num1 = Double.parseDouble(args[i]);
            System.out.println(num1);
            rezult=
            if (i != args.length-1) {
                System.out.println("*");
            }
        } */
    }
}
