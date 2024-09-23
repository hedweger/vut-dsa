package org.th.second;

import java.util.Vector;

public class Map {
    private Vector<Car> cars;


    public void pushCar(Car c) {
        cars.add(c);
    } 
    public void removeCar(int i) {
        if (!cars.isEmpty()) {
            cars.remove(i);
        }
    }
    public Car popCar() {
       Car car = cars.getLast();
       cars.removeLast();
       return car;
    }
    public Car getCar(int i) {
        if (!cars.isEmpty()) {
            return cars.get(i);
        }
        return null; // this feels bad
    }
    public int carCount() {
        return cars.size();
    }
}
