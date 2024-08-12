package Ex1;

public class Ex1_2 {
    public static void main(String[] args) {

        //Вывести в консоль строку посимвольно
        String stroka ="Мама мыла раму";
        char []symbol=stroka.toCharArray();
        for (int i = 0; i < symbol.length; i++) {
            System.out.println(symbol[i]);
        }
    }
}
