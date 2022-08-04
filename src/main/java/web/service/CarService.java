package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarService implements CarServiceInterface {

    private final List<Car> carList;

    public CarService() {
        this.carList = new ArrayList<>();
        carList.add(new Car("hyundai", "IX-35", 789));
        carList.add(new Car("honda", "fit", 147));
        carList.add(new Car("toyota", "wish", 236));
        carList.add(new Car("nissan", "koshkai", 369));
        carList.add(new Car("reno", "logan", 456));
    }

    @Override
    public List<Car> getCars(int count) {
        if (count >= carList.size() || count <= 0) {
            return carList;
        } else {
            return carList.subList(0, count);
        }
    }
}
