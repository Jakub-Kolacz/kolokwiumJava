package pl.jakubkolacz.algorithm;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;

public class Taylor {

    public static void main(String[] args) {
        NumberFormat formatter = new DecimalFormat("#0.000000");
        double val[] = {0, Math.PI / 3, Math.PI / 4, Math.PI / 6, Math.PI / 2, Math.PI};

        for (int i = 0; i < val.length; i++) {
            System.out.println("With Taylor method: " + formatter.format(Taylor(val[i])));
        }
    }

    public static double Taylor(double val) {
        ArrayList<Double> memory = new ArrayList<Double>();
        double row = val;
        for (int i = 0, s = 3; i < 16; i++, s = s + 2) {
            double mth = Math.pow(val, s);
            double result = mth / factorial(s);
            memory.add(result);
        }

        for (int i = 0; i < 16; i++) {
            if (i % 2 == 0) {
                double d = memory.get(i);

                row = row - d;

            } else {
                double d = memory.get(i);

                row = row + d;

            }
        }
        return row;

    }

    public static long factorial(double n) {
        long fact = 1;
        for (int i = 2; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }
}
