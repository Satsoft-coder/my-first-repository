package ArrayListAnalog;

import java.util.ArrayList;

public class ArrayListAnalog {
    private Object[]data;
    private int size=0;

    public ArrayListAnalog(int capacity){
        data=new Object[capacity];
    }

    public void AddElement(Object element) {
        if (size == data.length) {
            increase(3);
            }
        data[size]=element;
        size++;
    }

    public void AddArray(Object [] elementArray) {
        if (elementArray.length+size> data.length){
            increase(elementArray.length);
        }
        for (Object o : elementArray) {
            data[size] = o;
            size++;
        }
    }

    //добавление по индексу
    public void AddElementOnIndex(Object element,int index){
        if (size == data.length) {
            increase(3);
        }
        Object [] nextData=new Object[data.length];
            for (int i = 0; i < (size-index); i++) {
                nextData[i]=data[i+index];
            }
            data[index]=element;
            for (int i = 0; i < size-index; i++) {
                data[index+i+1]=nextData[i];
            }
            size++;
    }

    //удаление по индексу
    public void RemoveElementOnIndex(int index){
        if (index<=size) {
            Object[] nextData = new Object[data.length];
            for (int i = 0; i < (size - index - 1); i++) {
                nextData[i] = data[i + index + 1];
            }
            for (int i = 0; i < size - index; i++) {
                data[index + i] = nextData[i];
            }
            data[size]=null;
            size--;
        }
        else {
            System.out.println("В массиве нет элемента с таким индексом");
        }
    }

    private void increase(int addedCapacity){
        int oldDataLength= data.length;
        int newDataLength=addedCapacity+oldDataLength;

        Object [] oldData=new Object[newDataLength];
        //System.arraycopy(data,0,oldData,0,oldDataLength);
        for (int i = 0; i < oldDataLength; i++) {
            oldData[i]=data[i];
        }

        data=oldData;
//        data=new Object[newDataLength];
//        for (int i = 0; i < newDataLength; i++) {
//            data[i]=oldData[i];
//        }
    }

    //удаление всех элементов
    public void RemoveAll(){
        for (int i = 0; i < size; i++) {
            data[i]=null;
        }
        size=0;  //по сути можно только size=0 оставить, но что бы освободить память чистим и массив ?! Capacity остается.
    }

    public int Size(){return size;}

}
