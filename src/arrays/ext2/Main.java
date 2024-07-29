package arrays.ext2;

public class Main {
    public static void main(String[] args) {
        int[] quantity=new int[] {2,5,8,17,45,0,17,42,19,22,0,17,14,25,12};

        //вывод каждого второго элемента массива
        for (int i = 0; i < quantity.length; i++) {
            if (i%2!=0) {
                continue;
            }
            System.out.println(quantity[i]);
        }
        System.out.println("---------------");

        //вывод каждого второго элемента массива до 0-го значения
        for (int i = 0; i < quantity.length; i++) {
            if (i%2!=0) {
                continue;
            }
            else {
                if (quantity[i]==0){
                    break;
                }
            }
            System.out.println(quantity[i]);
        }
    }
}
