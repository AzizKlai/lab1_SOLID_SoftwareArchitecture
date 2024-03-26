package com.directi.training.srp.exercice_refactored.classes;

import java.util.ArrayList;
import java.util.List;

public class CarRepository {
    private List<Car> _carsDb;

    public CarRepository() {
        _carsDb = new ArrayList<>();
    }

    public Car getCarById(String carId) {
        for (Car car : _carsDb) {
            if (car.getId().equals(carId)) {
                return car;
            }
        }
        return null;
    }

    public List<Car> getAllCars() {
        return _carsDb;
    }
}

