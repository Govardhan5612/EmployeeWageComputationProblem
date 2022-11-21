package com.bridgelabz;

public class EmployeeWage {

    static final int FULL_DAY = 1;
    static final int HALF_DAY = 2;
    static final int FULL_DAY_HOUR=8;
    static final int HALF_DAY_HOUR=4;
    static final int WAGE_PER_HOUR=20;

    static final int ABSENT = 0;

    public static void employee() {
        int empWage = 0;
        int hour = 0;
        int totalEmpWage = 0;
        int totalHours = 0;
        int monthWorkingDays=20;
        int days = 1;
        while (days<=monthWorkingDays && totalHours<100){

        int randomNumber = (int) Math.floor(Math.random() * 10) % 3;
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
        employee();
    }

}
