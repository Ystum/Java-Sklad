package com.company;

import java.util.Scanner;
import zavd.zav1;
import zavd.zav2;
import zavd.zav3;


public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.printf("Chose task number 1..3:\n");
        Scanner in=new Scanner(System.in);
        int N=in.nextInt();
        switch (N){
            case 1:
            {
                zav1 A=new zav1();
                A.go();
            }
            case 2:
            {
                zav2 A1=new zav2();
                A1.go();
            }
            case 3:
            {
                zav3 A2=new zav3();
                A2.go();
            }
        }

    }
}
