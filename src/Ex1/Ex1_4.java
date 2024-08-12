package Ex1;

import java.util.Scanner;

public class Ex1_4 {
    public static void main(String[] args) {

        // Получить из строки "012312" переменную типа Long несколькими способами (изучите структуру класса
        //Long)
        String str = "012312";

        //method 1
        Scanner sc = new Scanner(str);
        Long newLong = sc.nextLong();
        sc.close();
        System.out.println(newLong);

        //method 2
        Long newLong2=Long.parseLong(str);
        System.out.println(newLong2);

        //method 3
        Long newLong3= (long) Integer.parseInt(str);
        System.out.println(newLong3);

        //method 4
        Long newLong4=Long.valueOf(str);
        System.out.println(newLong4);

        //method 5
        Long newLong5=new Long(str);
        System.out.println(newLong5);

    }
}
