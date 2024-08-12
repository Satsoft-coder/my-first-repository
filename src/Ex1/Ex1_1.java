package Ex1;

public class Ex1_1 {
    public static void main(String[] args) {

//Сравнить две строки: "Мама мыла раму" и "Мама" + " мыла " + "раму" при помощи оператора == и получить
//результаты сравнения true и false.
        String str = new String("Мама мыла раму");
        String strInPool = "Мама"+" мыла"+" раму";
        String strInPool2 = "Мама мыла раму";

        System.out.println(str == strInPool);
        System.out.println(strInPool == strInPool2);
    }
}
