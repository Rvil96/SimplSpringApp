package web.service;

import org.springframework.stereotype.Component;
import web.dao.CarsDao;
import web.dao.CarsDaolmp;
import web.model.Car;

import java.util.List;

@Component
public class CarServiceIpml implements CarService {
    private CarsDao carsDAO;

    public CarServiceIpml() {
        carsDAO = new CarsDaolmp();
    }

    @Override
    public List<Car> getCars() {
        return carsDAO.getCars();
    }

    @Override
    public List<Car> getSomeCarsByCount(byte count) {
        return carsDAO.getSomeCarsByCount(count);
    }
}
