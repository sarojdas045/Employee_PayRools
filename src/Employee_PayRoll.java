public
class Employee_PayRoll{
    public static
    void main(String[] args){
        System.out.println("Welcome to Employee Wage computation Program");
        int IS_PRESENT= 1;
        int RATE_PER_HOUR = 20;
        int TOTAL_HOUR = 8;

        double checker = Math.floor(Math.random() * 10)%2;

        int employeeDailyWage = RATE_PER_HOUR * TOTAL_HOUR;

        if(checker == IS_PRESENT){
            System.out.println("Employee is present");
            System.out.println("Employee Daily wage is:"+ employeeDailyWage);
        }
        else{
            System.out.println("Employee is absent");
            System.out.println("Employee Daily wage is:"+ 0);
        }
    }
}