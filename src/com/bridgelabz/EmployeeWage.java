package com.bridgelabz;

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
    public static final int FULL_DAY_HOUR = 8;
    public static final int HALF_DAY_HOUR = 4;
    String companyName;
    int wagePerHour;
    int monthlyWorkingDays;
    int monthlyWorkingHours;

    /**
     * use parameterized constructor
     *
     * @param companyName
     * @param wagePerHour
     * @param monthlyWorkingDays
     * @param monthlyWorkingHours
     */
    public EmployeeWage(String companyName, int wagePerHour, int monthlyWorkingDays, int monthlyWorkingHours) {
        this.companyName = companyName;
        this.wagePerHour = wagePerHour;
        this.monthlyWorkingDays = monthlyWorkingDays;
        this.monthlyWorkingHours = monthlyWorkingHours;
    }

    public void employee() {
        /**
         * find the total wage and hours in month.
         */
        System.out.println("Company name is " + companyName + " : ");
        int empWage;
        int hour;
        int totalEmpWage = 0;
        int totalHours = 0;
        int days = 1;
        while (days <= monthlyWorkingDays && totalHours < monthlyWorkingHours) {
            /**
             * use the Math class and random(static method).
             */
            int randomNumber = (int) (Math.random() * 10) % 3;
            switch (randomNumber) {
                case (FULL_DAY):
                    empWage = FULL_DAY_HOUR * wagePerHour;
                    hour = FULL_DAY_HOUR;
                    System.out.println("Day - " + days + " : Employee wage is " + empWage + " and hour is " + hour);
                    break;
                case (HALF_DAY):
                    empWage = HALF_DAY_HOUR * wagePerHour;
                    hour = HALF_DAY_HOUR;
                    System.out.println("Day - " + days + " : Employee wage is " + empWage + " and hours is " + hour);
                    break;
                default:
                    hour = 0;
                    empWage = 0;
                    System.out.println("Day - " + days + " : Employee is Absent");
            }
            totalEmpWage = totalEmpWage + empWage;
            totalHours = totalHours + hour;
            days++;
        }
        System.out.println(companyName + " company total Employee wage : " + totalEmpWage);
        System.out.println(companyName + " company total Employee working hours : " + totalHours);
    }

    public static void main(String[] args) {
        /**
         * object level method calling through object reference name
         */
        EmployeeWage firstCompany = new EmployeeWage("Tata", 20, 25, 125);
        EmployeeWage secondCompany = new EmployeeWage("jio", 18, 20, 100);
        firstCompany.employee();
        secondCompany.employee();
    }

}
