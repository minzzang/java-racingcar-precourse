package racingcar.domain;

import java.util.HashMap;
import java.util.Map;

public class Round {

    private Map<CarName, Mileage> record = new HashMap<>();

    public void record(CarName carName, Mileage mileage) {
        record.put(carName, mileage);
    }

    public Mileage getMileage(CarName carName) {
        return record.get(carName);
    }
}
