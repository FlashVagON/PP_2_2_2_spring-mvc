package web.sevice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.CarsDao;
import web.models.Car;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImpl implements CarService{

    private CarsDao carsDao;

    @Autowired
    public CarServiceImpl(CarsDao carsDao) {
        this.carsDao = carsDao;
    }

    @Override
    public List<Car> carsCount(List<Car> list, int number){
        return list.stream().limit(number).collect(Collectors.toList());
    }

    @Override
    public List<Car> carList() {
        return carsDao.carList();
    }
}
