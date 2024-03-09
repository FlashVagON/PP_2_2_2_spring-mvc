package web.dao;

import org.springframework.stereotype.Repository;
import web.models.Car;
import java.util.List;

@Repository
public interface CarsDao {
    List<Car> carList();
}
