package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.models.Car;
import web.sevice.CarService;
import java.util.List;

@Controller
public class CarsController {
    private CarService carService;
    private List<Car> carList;

    @Autowired
    public CarsController(CarService carService, List<Car> carList) {
        this.carService = carService;
        this.carList = carList;
    }

    @GetMapping(value = "/car")
    public String printCars(@RequestParam(value = "count", defaultValue="5") int allCars, ModelMap model) {
        model.addAttribute( "carList", carService.carsCount(carList, allCars));
        return "car";
    }
}
