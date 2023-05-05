package Service;

import Model.Employee;

import java.util.List;

public interface EmployeeDAO {

    Integer add(Employee employee);

    Employee getById (int id);

    List<Employee> getAll();

    void updateEmployee(int id, Employee employee);

    void deleteEmployee(Employee employee);
}
