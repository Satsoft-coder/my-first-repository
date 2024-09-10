package org.example;

import java.security.spec.RSAOtherPrimeInfo;

public class Main {

    public static void main(String[] args) {

        //Изучить конструкцию try - catch - finally. Попробовать разделить число на 0 и обработать эту ситуацию
        //при помощи:

        //try - catch
        Task1(3,0);

        //try - finally
        Task2(4,4);

        //try - catch - finally
        Task3(34,0);
    }

    private static void Task1(int a,int b) {
        System.out.println("Task1!");
        try{
            double c=a/b;
            System.out.println(a+"/"+b+"="+c);
        } catch (ArithmeticException e) {
            //throw new RuntimeException(e);
            System.out.println("Ошибка деления: "+e+"\n");
        }
    }

    private static void Task2(int a,int b){
        System.out.println("Task2!");
        try {
            double c= a/b;
            System.out.println(a+"/"+b+"="+c);
        } finally {
            System.out.println("End Task2\n");
        }

    }
    private static void Task3(int a,int b){
        System.out.println("Task3!");
        try{
            double c= a /b;
            System.out.println(a+"/"+b+"="+c);
        } catch (ArithmeticException e) {
            //throw new RuntimeException(e);
            System.out.println("Ошибка деления: "+e);
        } finally {
            System.out.println("End Task3");
        }

    }

}