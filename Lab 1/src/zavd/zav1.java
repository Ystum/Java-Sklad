package zavd;

import static java.lang.Math.abs;
import static java.lang.Math.exp;
import static java.lang.Math.sin;
import static java.lang.Math.cos;
import static java.lang.Math.tan;
import static java.lang.Math.min;
import static java.lang.Math.log1p;

public class zav1 {
final private double A=1.45;
private double B;
private double C;

public void go()
{
        B=min(sin(A),exp(2.14*A)/Math.pow(Math.pow(A,2)-1.2,1/3));
    System.out.printf("B=%4.2f\n",B);
    if (abs(A+B)>1)
        C=log1p(Math.pow(A,2)-Math.pow(B-1.42,2));
    else
    if (abs(A+B)<1)
        C=sin(A+1.1)-Math.pow(cos(B),2)*tan(1/(A+abs(B)));
    else
        C=sin(A+1.1);
    System.out.printf("C=%4.2f\n",C);
}




}
