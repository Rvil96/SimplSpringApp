package web.dao;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;


public class CarsDaolmp implements CarsDao {
    private List<Car> cars;

    public CarsDaolmp() {
        cars = new ArrayList<>();
        cars.add(new Car("Mercedes", 5, "black"));
        cars.add(new Car("BMV", 7, "white"));
        cars.add(new Car("Porsche", 19, "red"));
        cars.add(new Car("Toyota", 2, "green"));
        cars.add(new Car("Vaz", 9, "silver"));
    }

    @Override
    public List<Car> getCars() {
        return cars;
    }

    @Override
    public List<Car> getSomeCarsByCount(byte count) {
        return cars.stream().limit(count).toList();
    }
}
