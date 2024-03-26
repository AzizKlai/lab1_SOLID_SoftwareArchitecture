package com.directi.training.srp.exercice_refactored.classes;

import java.util.List;

public class CarFinder {

    private List<Car> _cars;

    public CarFinder(List<Car> cars) {
        _cars = cars;
    }

    public Car getBestCar() {
        Car bestCar = null;
        for (Car car : _cars) {
            if (bestCar == null || car.getModel().compareTo(bestCar.getModel()) > 0) {
                bestCar = car;
            }
        }
        return bestCar;
    }
}
