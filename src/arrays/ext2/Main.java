package arrays.ext2;

public class Main {
    public static void main(String[] args) {
        Integer [] quantity=new Integer[10];
        quantity[0]=5;
        quantity[1]=0;
        quantity[2]=10;
        quantity[3]=74;
        quantity[4]=12;
        quantity[5]=34;
        quantity[8]=44;
        quantity[9]=4;

        //вывод каждого второго элемента массива
        for (int i = 0; i < quantity.length; i++) {
            if (i%2!=0) {
                continue;
            }
            System.out.println(quantity[i]);
        }
        System.out.println("---------------");

        //вывод каждого второго элемента массива до null значения
        for (int i = 0; i < quantity.length; i++) {
            if (i%2!=0) {
                continue;
            }
            else {
                if (quantity[i]==null){
                    break;
                }
            }
            System.out.println(quantity[i]);
        }
    }
}
