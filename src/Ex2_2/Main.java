package Ex2_2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        // Реализовать поиск слов и определённого текста в книге "Война и мир" (Война и мир.txt) при помощи
        //обычного поиска по строке и при помощи регулярных выражений.
        //Реализацию поиска сделать при помощи классов и интерфейсов.
        //Вывести информацию как часто встречаются строки "война", "и" (как союз), "мир". Дать возможность через
        //аргументы программы выбрать какое слово будем искать в тексте.

        try(BufferedReader br = new BufferedReader(new FileReader("src\\Ex2_2\\Война и мир.txt")))
        {
            //чтение построчно
            String s;
            String searchWord="война";
            int sumReg=0;
            int sumOrdinary=0;


            while((s=br.readLine())!=null){
                SearchReg searchReg=new SearchReg();
                SearchOrdinary searchOrdinary=new SearchOrdinary();

               // sumReg+=searchReg.sum(s,searchWord);
                sumOrdinary+= searchOrdinary.sum(s,searchWord);

            }

            System.out.println("Слово \""+searchWord+"\""+"в тексте: \n");
            System.out.println("при помощи регулярных выражений: "+sumReg);
            System.out.println("при помощи обычного поиска: " +sumOrdinary);
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
    }
}
