package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.models.Car;
import web.sevice.CarServiceImpl;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarsController {
    @GetMapping(value = "/car")
    public String printWelcome(@RequestParam(value = "count", defaultValue="5") int allCars, ModelMap model) {
        List<Car> carsList = new ArrayList<>();
        carsList.add((new Car("Toyota", "BLACK", 2008)));
        carsList.add((new Car("Ford", "RED", 1976)));
        carsList.add((new Car("Renault", "WHITE", 2015)));
        carsList.add((new Car("Lada", "BLUE", 2024)));
        carsList.add((new Car("Nissan", "YELLOW", 2005)));
        carsList = CarServiceImpl.carsCount(carsList, allCars);
        model.addAttribute( "carList", carsList);
        return "car";
    }
}
