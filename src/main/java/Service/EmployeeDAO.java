package Service;

import Model.Employee;

import java.util.List;

public interface EmployeeDAO {

    void create(Employee employee);

    Employee getById(int id);

    List<Employee> getAll();

    void updateEmployee(int id, Employee employee);

    void deleteEmployee(int id);
}
