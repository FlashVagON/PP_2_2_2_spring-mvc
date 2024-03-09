package web.sevice;

import web.models.Car;

import java.util.List;
public interface CarService {
    List<Car> carList();
    List<Car> carsCount(List<Car> list, int number);
}
