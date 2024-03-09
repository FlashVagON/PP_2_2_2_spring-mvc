package web.dao;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;
@Component
public class CarsDaoImpl implements CarsDao{

    @Override
    @Bean
    public List<Car> carList() {
        List<Car> carsList = new ArrayList<>();
        carsList.add((new Car("Toyota", "BLACK", 2008)));
        carsList.add((new Car("Ford", "RED", 1976)));
        carsList.add((new Car("Renault", "WHITE", 2015)));
        carsList.add((new Car("Lada", "BLUE", 2024)));
        carsList.add((new Car("Nissan", "YELLOW", 2005)));
        System.out.println("Created");
        return carsList;
    }
}
