package com.bridgelabz;

/**
 * @author GovardhanReddy
 */
public class EmployeeWage {
    /**
     * compute the employee wage and working hours use random method
     * use class level variables
     */
    public static final int ABSENT = 0;
    public static final int FULL_DAY = 1;
    public static final int HALF_DAY = 2;
    public static final int FULL_DAY_HOUR=8;
    public static final int HALF_DAY_HOUR=4;
    public static final int WAGE_PER_HOUR=20;
    public static final int MONTHLY_WORKING_HOURS =92;
    public static final int MONTHLY_WORKING_DAYS =20;
    static int empWage;
    static int hour;
    static int totalEmpWage = 0;
    static int totalHours = 0;
    public static void employee() {
        /**
         * find the total wage and hours in month.
         */
        int days = 1;
        while (days<=MONTHLY_WORKING_DAYS && totalHours<MONTHLY_WORKING_HOURS){
            /**
             * use the Math class and random(static method).
             */
        int randomNumber = (int) (Math.random() * 10) % 3;
        switch (randomNumber) {
            case (FULL_DAY):
                empWage = FULL_DAY_HOUR * WAGE_PER_HOUR;
                hour=FULL_DAY_HOUR;
                System.out.println("Day - "+days+" : Employee wage is "+empWage+" and hour is "+hour);
                break;
            case (HALF_DAY):
                empWage = HALF_DAY_HOUR * WAGE_PER_HOUR;
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
        System.out.println("Total Employee wage : "+totalEmpWage);
        System.out.println("Total Employee working hours : "+totalHours);
    }
    public static void main(String[] args) {
        /**
         * method calling directly
         */
        employee();
    }

}
