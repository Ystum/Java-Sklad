package com.company;
import com.company.fake;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        // write your code here
        fake A = new fake();
        fake B = new fake();
        Scanner cod=new Scanner(System.in);
        for(;;)
        {
        System.out.printf("1.Task 1\n2.Task 2\n3.Task 3\n4.Exit\nChose actions:\n");
        int c = cod.nextInt();
        switch (c) {
            case 1: {
                A.N = 4;
                A.M = 5;
                A.new1(A.N, A.M);
                System.out.printf("Dob=%d\n",A.dob());
                break;
            }
            case 2: {
                A.N = 4;
                A.M = 4;
                A.new1(A.N, A.M);
                A.task2();
                break;
            }
            case 3: {
                A.N = 6;
                A.M = 6;
                A.new1(A.N, A.M);
                A.diag();
                break;
            }
            case 4: {
                System.exit(0);
                break;
            }
            default: {
                System.out.printf("Enter correct action\n");
            }
        }
        }

    }
}