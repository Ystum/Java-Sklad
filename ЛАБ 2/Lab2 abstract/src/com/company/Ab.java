package com.company;
import lab.Abs;
import java.util.Scanner;

public class Ab extends Abs {
    public int N;
    public int[] mas;

    @Override
    public void new1()
    {
        Scanner inpt= new Scanner(System.in);
        System.out.printf("Enter array length:");
        N=inpt.nextInt();
        mas=new int[N];
        System.out.printf("Enter array:");
        for(int i=0;i<N;i++)
            mas[i]=inpt.nextInt();
    }
    @Override
    public void out(int n)
    {
        System.out.printf("Array [%d]:\n",n);
        for(int i=0;i<n;i++)
            System.out.printf("%d\n",mas[i]);

    }
    public void zam0()
    {
        Scanner inpt= new Scanner(System.in);
        System.out.printf("Enter number witch will be change zero:");
        int a=inpt.nextInt();
        for (int i=0;i<N;i++)
            if (mas[i]==0) mas[i]=a;
    }
    public int krat2()
    {
        int k=0;
        for (int i=0;i<N;i++)
            if (mas[i]%2==0) k++;
        return k;
    }
    public int minp()
    {
        int min=1000;
        for (int i=1;i<N;i++)
            if (mas[i]>0)
                if (mas[i]<min) min=mas[i];
        return min;
    }
    public int sym()
    {
        int S=0;
        for (int i=0;i<N;i++)
            S=S+mas[i];
        return S;
    }
    public void sort()
    {
        int i,j,P;
        for(i=0;i<N-1;i++)
            for(j=i+1;j<N;j++)
                if(mas[i]<mas[j]) {
                    P = mas[i];
                    mas[i] = mas[j];
                    mas[j] = P;
                }
    }


}