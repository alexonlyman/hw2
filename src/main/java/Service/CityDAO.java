package Service;

import Model.City;
import Model.Employee;

import java.util.List;

public interface CityDAO {
    Integer add(City city);

    City getById (int id);

    List<City> getAll();

    void updateCity(int id, City city);

    void deleteCity(City city);
}
