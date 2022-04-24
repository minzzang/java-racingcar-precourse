package racingcar.domain;

import racingcar.utils.DrivingCondition;

public class Car {

    private final CarName carName;
    private Mileage mileage;

    public Car(String carName) {
        this.carName = new CarName(carName);
        this.mileage = Mileage.init();
    }

    public void run(int randomNumber) {
        if (DrivingCondition.isPossible(randomNumber)) {
            mileage = mileage.plus();
        }
    }

    public int getMileage() {
        return mileage.getMeter();
    }
}
