package com.Java.day21returnMetod;

public class _12_castıng {
    public static void main(String[] args) {
        double x=10.45;

        displayValue((int)x); //x degerini yazdirmak istiyorum
        //Cast sadece yukaridaki gibi parantez ile cast edilecek degisken yazilmasi ile mumkun
    }

    //Verilen parametreyi yazdiran bir parametreli method yazdik
    public static void displayValue(int num1){

        System.out.println("num1 = " + num1);

    }
}
