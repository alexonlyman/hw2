package Service;

import Model.City;
import Model.Employee;

import java.sql.SQLException;
import java.util.Collections;
import java.util.List;

public class Application {
    private static final EmployeeDAO employeeDAO = new EmployeeDAPImpl();
    private static final CityDAO cityDAO = new CityDAOimpl();

    public static void main(String[] args) {


        Employee employee = new Employee(3, "Mikhail", "Verbn", "male", 55, null);
        employeeDAO.add(employee);
        System.out.println(employeeDAO.getById(1));

        List<Employee> list = employeeDAO.getAll();
        for (Employee employee1 : list) {
            System.out.println(employee1);

        }
        Employee employee2 = new Employee(1, "Mikhaili", "Verbna", "male", 45, null);
        employeeDAO.updateEmployee(3, employee2);

        employeeDAO.deleteEmployee(employee);

        City city = new City(1, "Minsk", Collections.singletonList(employee));
        cityDAO.add(city);
        System.out.println(cityDAO.getById(1));


        List<City> list1 = cityDAO.getAll();
        for (City city1 : list1) {
            System.out.println(city1);

        }
        City city2 = new City(3, "Minskr", Collections.singletonList(employee));
        cityDAO.updateCity(3, city2);

        cityDAO.deleteCity(city);




    }

}

