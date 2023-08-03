package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class carDao {
    private List<Car> carsList;

    {
        carsList = new ArrayList<>();
        carsList.add(new Car(1, "Toyota", 10));
        carsList.add(new Car(2, "BMW", 3));
        carsList.add(new Car(3, "Mercedes", 15));
        carsList.add(new Car(4, "Hyundai", 40));
        carsList.add(new Car(5, "Kia", 20));
    }

    public List<Car> getAll() {
        return carsList;
    }

    public List<Car> show(int count) {
        return carsList.subList(0, count);
    }
}
