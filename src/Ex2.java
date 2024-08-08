import java.util.Random;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        //bubble sorted

        //create and fill massive
        int [] array1=new int[100000];
        Random random = new Random();
        for (int i = 0; i < array1.length; i++) {
            array1[i] = random.nextInt(1,5000);
        }

        //sorted massive (bubble metod)
        System.out.println("Sorted start");
        boolean result=true;
        while (result){
            result=false;
            for (int i = 1; i < array1.length; i++) {
                if (array1[i]>array1[i-1]){
                    int r=array1[i];
                    array1[i]=array1[i-1];
                    array1[i-1]=r;
                    result=true;
                }
            }
        }
        System.out.println("Sorted end.");
        System.out.println("Введите начало и конец диапазона вывода через пробел:");

        //input data from console
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        int j = scanner.nextInt();

        //out result in console
        for (int k = i; k <j ; k++) {
            System.out.println("index="+k+"; value="+array1[k]);
        }
    }
}
