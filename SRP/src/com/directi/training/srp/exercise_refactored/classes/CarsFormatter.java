package com.directi.training.srp.exercice_refactored.classes;

import java.util.List;

public class CarsFormatter {
    private final List<Car> _cars;

    public CarsFormatter(List<Car> cars)
    {
        _cars = cars;
    }
 
    public String getCarsNames() {
        StringBuilder sb = new StringBuilder();
        for (Car car : _cars) {
            sb.append(car.getBrand()).append(" ").append(car.getModel()).append(", ");
        }
        return sb.substring(0, sb.length() - 2);
    }
}