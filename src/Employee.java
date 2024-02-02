 class Employee1 {
    String name;
    int salary;
    int id ;
    int annual;

   public int getSalary(){
      annual =  salary*12;
      return annual;

    }
    public void display(){
        System.out.println("name of employee is "+name);
        System.out.println("salary of employe is "+salary);
        System.out.println("annual salary of employee is "+annual);
    }

}
public class Employee {
    public static void main(String[] args) {
        Employee1 sc = new Employee1();
        sc.name="sahil";
        sc.salary=10000;
        sc.id=17;

        sc.getSalary();
        sc.display();

    }
}
