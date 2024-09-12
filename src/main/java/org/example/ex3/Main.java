package org.example.ex3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

//3. Написать программу которая будет обрабатывать ввод в консоль.
//3.1.Наполнять массив int тем что введут из консоли, давать не более трёх ошибочных попыток
//подряд на ввод через консоль.
//3.2. Полученный массив через консоль преобразовать в коллекцию и отсортировать данную
//коллекцию по возрастанию с помощью Stream API.
public class Main {
    public static void main(String[] args) {
        String line = null;
        int count = 3;
        List<Integer> list=new ArrayList<>();
        System.out.print("Введите целые числа или слово \"стоп\": ");
        Scanner in = new Scanner(System.in);

            while (!(line = in.nextLine()).equals("стоп")) {
                int num = 0;
                try {num = Integer.parseInt(line);
                    list.add(num);
                    System.out.printf("Ваше число: %d \n", num);
                }catch (NumberFormatException e) {
                    count--;
                    if (count==0){break;}
                    System.out.println("Вы ввели не число, повторите ещё. Попыток "+count);
                }
            }

        in.close();
         Stream<Integer> stream= list.stream();
         stream.sorted()
         .forEach(System.out::println);
    }
}
