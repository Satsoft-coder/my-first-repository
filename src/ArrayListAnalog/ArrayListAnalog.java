package ArrayListAnalog;

import java.util.ArrayList;

public class ArrayListAnalog {
    private static Object[]data;
    private int size=0;

    public ArrayListAnalog(int capacity){
        data=new Object[capacity];
    }

    public void AddElement(Object element) {
        if (size == data.length) {
            increase();
            data[size + 1] = element;
        }
        else {
            data[size]=element;
        }
        size++;
    }

    private void increase(){
        int oldDataLength= data.length;
        Object [] oldData=new Object[oldDataLength+10];
        System.arraycopy(data,0,oldData,0,oldDataLength);
        data=new Object[oldDataLength+10];
        System.arraycopy(oldData,0,data,0,oldDataLength+10);
    }

    public int Size(){return size;}

}
