package web.service;

import org.springframework.stereotype.Service;
import web.models.Car;

import java.util.List;

@Service
public class CarServiseImpl implements CarService {
    private final List<Car> cars = List.of(
            new Car(1, "BMW", 1),
            new Car(2, "BMW", 3),
            new Car(3, "BMW", 4),
            new Car(4, "BMW", 5),
            new Car(5, "BMW", 7));


    @Override
    public List<Car> getCars(int count) {
        if (count < 0) {
            return List.of();
        }
        return cars.subList(0, Math.min(count, cars.size()));
    }
}
