package org.example.ex4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.*;

//4. Протестировать свою реализацию ArrayList при помощи Junit. Минимум 5 тестов. Должны быть
//параметризированые тесты.
class ArrayListAnalogTest {
    ArrayListAnalog arrayListAnalog=new ArrayListAnalog();

    @BeforeEach
    void setUp() {
        arrayListAnalog.RemoveAll();
        arrayListAnalog.AddElement("20");
        arrayListAnalog.AddElement("30");
        arrayListAnalog.AddElement("40");
    }

    @Test
    void addElement_whenOk() {
        //Given
        int element=1;
        int expected=element;

        //When
        int sizeOld = arrayListAnalog.Size();
        for (int i = 0; i < element; i++) {
            arrayListAnalog.AddElement("element"+i);
        }
        int sizeNew = arrayListAnalog.Size();

        //Then
        int actual=sizeNew-sizeOld;
        assertEquals(expected,actual);
    }

    @Test
    void addArray_whenOk() {
        //Given
        Object []arrayInt=new Object[]{1,8,47,52,64,9};
        int expected=6;

        //When
        int sizeOld=arrayListAnalog.Size();
        arrayListAnalog.AddArray(arrayInt);
        int sizeNew=arrayListAnalog.Size();

        //Then
        int actual=sizeNew-sizeOld;
        assertEquals(expected,actual);
    }

    @ParameterizedTest
    @ValueSource(ints = { 1, 0, 3 })
    void addElementOnIndex_whenOk(Integer argument) {
        //Given
        Object element = new Object();
        Object expected = element;
        int index=argument;

        //When
        arrayListAnalog.AddElementOnIndex(element, index);
        Object actual = arrayListAnalog.GetElementOnIndex(index);

        //Then
        assertEquals(expected, actual);
    }

    @Test
    void removeElementOnIndex_whenOk() {
        //Given
        int sizeOld=arrayListAnalog.Size();
        int expected=sizeOld-1;
        int index=2;
        //When
        arrayListAnalog.RemoveElementOnIndex(index);
        //Then
        int actual=arrayListAnalog.Size();
        assertEquals(expected,actual);
    }

    @Test
    void removeAll_whenOk() {
        //Given
        int expected=0;
        //When
        arrayListAnalog.RemoveAll();
        //Then
        int actual=arrayListAnalog.Size();
        assertEquals(expected,actual);
    }

    @Test
    void size_whenOk() {
        //Given
        int size=42;
        int expected=size;
        //When
        arrayListAnalog.RemoveAll();
        for (int i = 0; i < size; i++) {
            arrayListAnalog.AddElement(new Object());
        }
        //Then
        int actual=arrayListAnalog.Size();
        assertEquals(expected,actual);
    }
}