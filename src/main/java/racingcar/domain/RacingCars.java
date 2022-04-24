package racingcar.domain;

import racingcar.utils.RandomNumberPicker;

import java.util.ArrayList;
import java.util.List;

public class RacingCars {

    final List<Car> cars;

    public RacingCars(String... carNames) {
        cars = mapCars(carNames);
    }

    private List<Car> mapCars(String[] carNames) {
        List<Car> cars = new ArrayList<>();
        for (String carName : carNames) {
            cars.add(new Car(carName));
        }
        return cars;
    }

    public void run() {
        for (Car car : cars) {
            int randomNumber = RandomNumberPicker.pick();
            car.run(randomNumber);
        }
    }
}
