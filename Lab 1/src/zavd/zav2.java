package zavd;


public class zav2 {

    private double xp = -3.78;
    final private double xk = 4.91;
    final private double krok = 0.63;

    public void go() {
        double x;
        System.out.printf("+-----------+\n");
        System.out.printf("| Табуляция |\n");
        System.out.printf("+-----------+\n");
        System.out.printf("|    X|    Y|\n");
        while (xp <= xk) {
            x = Math.pow((Math.log(Math.abs(2 * xp - 3)) / Math.log(3)), 2);
            System.out.printf("|%5.2f|%5.2f|\n", xp, x);
            System.out.printf("+-----------+\n");
            xp = xp + krok;
        }
    }
}
