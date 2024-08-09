/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.balexcompany;

/**
 *
 * @author KARL COMPUTERS
 */
public class BalexCompany {

    public static void calculatePay(double basePay, int hoursWorked) {
        // Constants
        final double MIN_WAGE = 8.00;
        final int MAX_HOURS = 60;
        final int REGULAR_HOURS = 40;
        
        if (basePay < MIN_WAGE) {
            System.out.println("Error: Base pay must be at least $" + MIN_WAGE + " an hour.");
            return;
        }
        
        if (hoursWorked > MAX_HOURS) {
            System.out.println("Error: Hours worked must not exceed " + MAX_HOURS + " hours.");
            return;
        }
        
        double totalPay;
        
        if (hoursWorked <= REGULAR_HOURS) {
            totalPay = hoursWorked * basePay;
        } else {
            int overtimeHours = hoursWorked - REGULAR_HOURS;
            totalPay = (REGULAR_HOURS * basePay) + (overtimeHours * basePay * 1.5);
        }
        
        System.out.println("Total pay: $" + totalPay);
 }

    public static void main(String[] args) {
        System.out.println("Employee 1:");
        calculatePay(7.50, 35);
        
        System.out.println("Employee 2:");
        calculatePay(8.20, 47);
        
        System.out.println("Employee 3:");
        calculatePay(10.00, 73);
    }
}

