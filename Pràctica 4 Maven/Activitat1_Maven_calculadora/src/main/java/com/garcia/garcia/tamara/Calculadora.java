package com.tamara.edd;

public class Calculadora {

    public static int suma(int a, int b){
        return a + b;
    }
    public static int resta(int a, int b){
        return a-b;
    }
    public static int multiplica(int a, int b){
        return a*b;
    }
    public static int divideix(int a, int b){
        if (b == 0){
            System.out.println("Error, no pots dividir entre 0.");
            return 0;
        }
        else {
            return a/b;
        }
    }
}



