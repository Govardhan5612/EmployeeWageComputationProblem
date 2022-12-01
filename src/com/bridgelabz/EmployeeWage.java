package com.bridgelabz;
import java.util.Scanner;
/**
 * @author GovardhanReddy
 */
public class EmployeeWage {
    /**
     * compute the employee wage and working hours use random method
     * use class method functions
     */
    public static final int FULL_DAY = 1;
    public static final int HALF_DAY = 2;
    public static final int FULL_DAY_HOUR=8;
    public static final int HALF_DAY_HOUR=4;
    public static void employee(String companyName ,int wagePerHour ,int monthlyWorkingDays ,int monthlyWorkingHours ) {
        /**
         * find the total wage and hours in month.
         */
        System.out.println("Company name is "+companyName +" : ");
        int empWage;
        int hour;
        int totalEmpWage = 0;
        int totalHours = 0;
        int days = 1;
        while (days<=monthlyWorkingDays && totalHours<monthlyWorkingHours){
            /**
             * use the Math class and random(static method).
             */
        int randomNumber = (int) (Math.random() * 10) % 3;
        switch (randomNumber) {
            case (FULL_DAY):
                empWage = FULL_DAY_HOUR * wagePerHour;
                hour=FULL_DAY_HOUR;
                System.out.println("Day - "+days+" : Employee wage is "+empWage+" and hour is "+hour);
                break;
            case (HALF_DAY):
                empWage = HALF_DAY_HOUR * wagePerHour;
                hour=HALF_DAY_HOUR;
                System.out.println("Day - "+days+" : Employee wage is "+empWage+" and hours is "+hour);
                break;
            default:
                hour=0;
                empWage=0;
                System.out.println("Day - "+days+" : Employee is Absent");
        }
        totalEmpWage=totalEmpWage+empWage;
        totalHours=totalHours+hour;
        days++;
        }
        System.out.println(companyName+" company total Employee wage : "+totalEmpWage);
        System.out.println(companyName+" company total Employee working hours : "+totalHours);
    }
    public static void main(String[] args) {
        /**
         * static method calling directly
         */
        Scanner input = new Scanner(System.in);
        System.out.print("Enter how many company details : ");
        int numberOfCompanies = input.nextInt();
        for (int i=1;i<=numberOfCompanies;i++){
            System.out.print("Enter "+i+" company name : ");
            String name = input.next();
            System.out.print("Enter wage per hour : ");
            int wagePerHour = input.nextInt();
            System.out.print("Enter monthly working days : ");
            int monthlyWorkingDays = input.nextInt();
            System.out.print("Enter monthly working hour : ");
            int monthlyWorkingHours = input.nextInt();
            employee(name,wagePerHour,monthlyWorkingDays,monthlyWorkingHours);
        }
    }
}
