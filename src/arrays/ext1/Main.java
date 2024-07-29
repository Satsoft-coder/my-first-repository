package arrays.ext1;

public class Main {
    public static void main(String[] args) {
        //Перебрать все элементы массива вывести их в консоль при помощи do....while, while, for,
        //foreach

        int [] massive=new int[] {14,20,71,16,82};
        System.out.println("Metod 1:");
        for (int i = 0; i < massive.length; i++) {
            System.out.println(massive[i]);
        }
        System.out.println("Metod 2:");
        int i=0; //massive.length;
        do {
            System.out.println(massive[i]);
            i++;
        }
        while (i < massive.length);
        System.out.println("Metod 3:");
        i=0;
        while (i!=massive.length) {
            System.out.println(massive[i]);
            i++;
        }
        System.out.println("Metod 4");
        for (int k : massive) {
            System.out.println(k);
        }
    }
}
