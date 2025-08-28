class Employee{
    public String name;
    public double salary;

    Employee(String name,double salary){
        this.name = name;
        this.salary = salary;
    }
    public void getName(){
        System.out.println(name);
    }
    public void getSalary(){
        System.out.println(salary);
    }
    public void setSalary(double salary){
        this.salary = salary;
    }
    public void giveHike(double percentage){
        salary = salary * (1 + percentage / 100);
        System.out.println("The new salary is "+salary);
    }

}



public class Ques33 {
    public static void main(String[] args) {
        Employee e1 = new Employee("ABC",12500);
        e1.getName();
        e1.getSalary();
        e1.setSalary(25000);
        e1.getSalary();
        e1.giveHike(10);
        e1.getSalary();
    }
}
