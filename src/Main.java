import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<Employee>();
        employees.add(new TechnicalWriter("Mark", 50000, 4, 2));
        employees.add(new Engineer("Natashia", 50000, 7, 2));
        employees.add(new ProductManager("Carlos", 50000, 8, 5));

        Owner owner = new Owner();
        for(Employee employee : employees){
            owner.addEmployee(employee);
        }

//        for(Employee employee : employees){
//            owner.giveRaise(1.25, employee);
//        }

        for(Employee employee : employees){
            owner.giveEngineerRaise(1.25, employee);
        }

        for(Employee employee: employees){
            System.out.println(employee.toString());
            System.out.println();
        }

    }
}