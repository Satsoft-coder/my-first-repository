package org.example.ex4;

public class Main {
    public static void main(String[] args) {

        //добавление одного элемента
        ArrayListAnalog list =new ArrayListAnalog(3);
        list.AddElement("10");
        list.AddElement("20");
        list.AddElement("30");
        list.AddElement("40");
        System.out.println(list.Size());

        System.out.println(list.GetElementOnIndex(2));

        //добавление массива элементов
        Object []arrayElement=new Object[]{"90","100","200"};
        list.AddArray(arrayElement);
        System.out.println(list.Size());

        //добавление по индексу
        list.AddElementOnIndex("10",3);
        System.out.println(list.Size());

        //удаление по индексу
        list.RemoveElementOnIndex(5);
        System.out.println(list.Size());
        list.RemoveElementOnIndex(10);

        //удаление всех элементов

    }
}
