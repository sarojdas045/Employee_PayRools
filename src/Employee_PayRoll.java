public
class Employee_PayRoll{
    public static
    void main(String[] args){
        System.out.println("Welcome to Employee Wage computation Program");
        int IS_PRESENT=1;
        double checker=Math.floor(Math.random()*10)%2;
        if(checker==IS_PRESENT){
            System.out.println("Employee is present:"+checker);
        }
        else{
            System.out.println("Employee is absent:"+checker);
        }
    }
}