import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<Employee>();

        //TechnicalWriter technicalWriter = new TechnicalWriter("Mark", 50000, 4, 2);
        //Engineer engineer = new Engineer("Natashia", 50000, 7, 2);
        //ProductManager productManager = new ProductManager("Carlos", 50000, 8, 5);

        employees.add(new TechnicalWriter("Mark", 50000, 4, 2));
        employees.add(new Engineer("Natashia", 50000, 7, 2));
        employees.add(new ProductManager("Carlos", 50000, 8, 5));
        for(Employee employee: employees){
            System.out.println(employee.toString());
            System.out.println();
        }
    }
}