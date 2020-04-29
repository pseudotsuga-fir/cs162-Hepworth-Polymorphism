import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class Owner {
    private ArrayList<Employee> employees;

    public Owner (){
        employees = new ArrayList<Employee>();
    }

    public void addEmployee(Employee employee){
        employees.add(employee);
    }

    public void giveRaise(double raise, Employee employee){
        employee.setBaseSalary(employee.getBaseSalary() * raise);
    }

    public void giveEngineerRaise(double raise, Employee employee){
            if(employee instanceof Engineer) employee.setBaseSalary(employee.getBaseSalary() * raise);
    }

}
