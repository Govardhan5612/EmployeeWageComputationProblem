package com.bridgelabz;

public class EmployeeWage {

    static final int PRESENT = 1;
    static final int ABSENT = 0;

    public static void employee(){
        int randomNumber = (int) Math.floor(Math.random()*10)%2;
        if (randomNumber ==1){
            System.out.println("Employee is Present");
        }
        else {
            System.out.println("Employee is Absent");
        }
    }

    public static void main(String[] args) {
        employee();
    }

}
