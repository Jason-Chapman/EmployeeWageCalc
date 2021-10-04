package com.company;
import java.util.Scanner;
import java.math.RoundingMode;
import java.text.DecimalFormat;
public class Main {

    private static DecimalFormat df = new DecimalFormat("0.00");

    public static void main(String[] args) {
        int loop = 0;
        while (loop == 0) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter Name:");
            String employeeName = input.next();

            System.out.println("Enter Hours Worked This Week:");
            double hoursWorked = input.nextDouble();

            System.out.println("Enter Hourly Wage:");
            double wage = input.nextDouble();

            if (hoursWorked > 45) {
                double extraHours = hoursWorked - 45;
                double pay = (double) ((45 * wage) + (extraHours * (wage * 1.5)));
                System.out.println("Before Tax, you earned $" + df.format(pay));
                double taxedPay = (double) (pay * 0.8);
                System.out.println("After Tax, you earned $" + df.format(taxedPay));
            }

            else {
                double pay = hoursWorked * wage;
                System.out.println("Before Tax, you earned $" + df.format(pay));
                double taxedPay = (double) (pay * 0.8);
                System.out.println("After Tax, you earned $" + df.format(taxedPay));
            }
        }
    }
}
