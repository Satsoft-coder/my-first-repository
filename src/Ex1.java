import java.util.Random;

public class Ex1 {
    public static void main(String[] args) {
        //binary search
        int [] array1=new int[1000000];
        for (int i = 0; i < array1.length; i++) {
            array1[i]=i+1000000;
        }

        Random random = new Random();
        int randomInt = random.nextInt(1_000_000,2_000_000);
        System.out.println("Ищем в массиве число "+randomInt);

        int beginRegion=0;
        int endRegion=array1.length;

        int rezult=-1;

        while (beginRegion<=endRegion) {
            int mid=beginRegion+(endRegion-beginRegion)/2;
            if (array1[mid] > randomInt) {
                endRegion = mid - 1;
            } else {
                if (array1[mid] < randomInt) {
                    beginRegion = mid + 1;
                } else {
                    rezult = mid;
                    break;
                }
            }
        }

        if (rezult>=0) {
            System.out.println("Искомое значение найдено в ячейке " + rezult);
        }
        else {
            System.out.println("Искомое значение в массиве не найдено");
        }
    }

}
