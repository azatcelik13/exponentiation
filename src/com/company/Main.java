package com.company;

import java.util.Scanner;

public class Main {

    static int exp(int a,int b){
        int expn=1;
        for (int i=1; i<=b;i++){
         expn=expn*a;
        }  return expn;
    }



    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int a,b;
        System.out.print("Bir sayı giriniz=");
        a=inp.nextInt();
        System.out.print("ikinci sayıyı giriniz=");
        b=inp.nextInt();
        System.out.println(exp(a,b));
    }
}
