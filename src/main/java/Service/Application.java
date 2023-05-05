package Service;

import Model.Employee;

import java.sql.SQLException;
import java.util.List;

public class Application {
    public static void main(String[] args) throws SQLException {

        EmployeeDAO employeeDAO = new EmployeeDAPImpl();

        Employee employee1 = new Employee ("Иван","Кузнецов","male", 44, 1);
        employeeDAO.add(employee1);

        // Получаем объект по id
        System.out.println(employeeDAO.getById(4));

        List<Employee> list = employeeDAO.getAll();

        for (Employee employee : list) {
            System.out.println(employee);
        }

        Employee employee3 = new Employee("Коля", "Никифоров", "male", 55, 1);


        employeeDAO.updateEmployee(1, employee3);

        employeeDAO.deleteEmployee(employee3);

    }
}
