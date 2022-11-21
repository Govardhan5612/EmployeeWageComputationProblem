package com.bridgelabz;

public class EmployeeWage {

    static final int FULL_DAY = 1;
    static final int FULL_DAY_HOUR=8;
    static final int WAGE_PER_HOUR=20;
    static final int ABSENT = 0;

    public static void employee(){
        int empWage = 0;

        int randomNumber = (int) Math.floor(Math.random()*10)%2;
        if (randomNumber ==FULL_DAY){
            System.out.println("Employee is Present");
            empWage = FULL_DAY_HOUR*WAGE_PER_HOUR;

        }
        else {
            System.out.println("Employee is Absent");
        }
        System.out.println("Employee wage is : "+empWage);
    }

    public static void main(String[] args) {
        employee();
    }

}
