package zavd;

import java.util.Scanner;

public class zav3 {


    public void go() {
        System.out.printf("Enter number:\n");
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int N1 = N;
        int P = 0, L = 0,S=0;
        for (int i = 1; i <= 5; i++)
        {
            if (i < 3) {
                P = P + N % 10;
                N = N / 10;
            }
            if (i == 3)
            {
                S=S+N%10;
                N = N / 10;
            }
            if (i > 3) {
                L = L + N % 10;
                N = N / 10;
            }

        }
        if (P==L)
            System.out.printf("Left and right part of number are equal\n");
        else
        {
            S=Math.round((S+P+L)/5);
            N=N1;
            N1=N1/1000;
            if(S>9)
                N1=N1*100;
            else
                N1=N1*10;
            N1=N1+S;
            N1=N1*100;
            N1=N1+N%100;
            System.out.printf("Changed number:%d\n",N1);

        }
    }
}
