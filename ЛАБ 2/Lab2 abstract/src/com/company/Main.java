package com.company;
import com.company.Ab;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        // write your code here
        Ab A = new Ab();
        A.new1();
        Scanner cod = new Scanner(System.in);
        int c, p;
        for (; ; ) {
            for(int i=0;i<20;i++)
                System.out.println("\n\n\n\n\n\n");
            System.out.printf("Chose actions:\n1.Enter new array\n2.Show array\n3.Change zero elements \n4.Number elements wich div 2\n5.Mininal element from pozitive\n6.Total sym of elements\n7.Sort array\n8.Exit\n ");
            c = cod.nextInt();
            switch (c) {
                case 1: {
                    A.new1();
                    break;
                }
                case 2: {
                    A.out(A.N);
                    break;
                }
                case 3: {
                    A.zam0();
                    break;
                }
                case 4: {
                    int k=A.krat2();
                    System.out.printf("Number elements wich div 2=%d\n",k);
                    break;
                }
                case 5: {
                    int min=A.minp();
                    System.out.printf("Mininal element from pozitive=%d\n",min);
                    break;
                }
                case 6: {
                    int S=A.sym();
                    System.out.printf("Total sym of elements=%d\n",S);
                    break;
                }
                case 7: {
                    A.sort();
                    break;
                }
                case 8: {
                    System.exit(0);
                    break;
                }
                default:
                {
                    System.out.printf("Enter correct action\n");
                }

            }
            System.out.printf("Press any number\n");
            p = cod.nextInt();
        }
    }
}