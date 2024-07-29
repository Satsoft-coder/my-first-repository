package cycles.ext2;

public class Main {
    public static void main(String[] args) {
        // Перемножить числа от 1 до числа (включительно) введенного через аргумент к
        //исполняемой программе

        if (args.length != 1) {
            System.out.println("Использование: введите число");
            return;
        }
        int num1 = Integer.parseInt(args[0]);
        int summa = 1;
        for (int i = 0; i < num1; i++) {
            summa = summa * (i+1);
        }
        System.out.println(summa);
    }
}
