package com.company;
import lab.face;
import java.util.Scanner;

public class fake implements face {
    public int N;
    public int M;
    public int[][] mas;

    @Override
    public void new1(int N,int M)
    {
        Scanner inpt= new Scanner(System.in);
        System.out.printf("Enter array [%d][%d]:\n",N,M);
        mas=new int[N][M];
        for(int i=0;i<N;i++)
            for(int j=0;j<M;j++)
                mas[i][j]=inpt.nextInt();
    }

    @Override
    public void out()
    {
        System.out.printf("Array [%d][%d]:\n",N,M);
        for(int i=0;i<N;i++)
        {
            for(int j=0;j<M;j++)
                System.out.printf("%4d",mas[i][j]);
            System.out.printf("\n");
        }
    }

    public int dob()
    {
        System.out.printf("\nArray [%d][%d]:\n",N,M);
        out();
        int D=1;
        for (int i=0;i<N;i++)
            for(int j=0;j<M;j++)
                D=D*mas[i][j];
        return D;
    }
    public void task2()
    {
        int[][] P=new int[4][4];
        int[][] T=new int[4][M+4];
        Scanner inpt= new Scanner(System.in);
        System.out.printf("Enter new array [4][4]:\n");
        for (int i=0;i<4;i++)
            for(int j=0;j<4;j++)
                P[i][j]=inpt.nextInt();

        for (int i=0;i<N;i++)
            for(int j=0;j<M;j++)
            {
                T[i][j]=mas[i][j];
                T[i][j+4]=P[i][j];
            }

        System.out.printf("\n P array [4][4]:\n");
        for (int i=0;i<4;i++) {
            for (int j = 0; j < 4; j++)
                System.out.printf("%4d",P[i][j]);
            System.out.printf("\n");
        }

        System.out.printf("\nFirst array [%d][%d]:\n",N,M);
        out();

        System.out.printf("\nTotal array [4][8]:\n");
        for (int i=0;i<4;i++) {
            for (int j = 0; j < M+4; j++)
                System.out.printf("%4d",T[i][j]);
            System.out.printf("\n");
        }
    }


    public void diag()
    {
        int i,j,max=-1000,maxi=0,maxj=0;
        out();
        for(i=0;i<N;i++)
            if (mas[i][i]<0)
            if (mas[i][i]>max)
            {
                max=mas[i][i];
                maxi=i;
                maxj=i;
            }
        System.out.printf("Max element of firstt diagonal[%d][%d]=%d\n",maxi,maxj,max);
    }

}