package racingcar.domain;

import java.util.Objects;

public class Mileage {

    private int meter;

    private Mileage() {
    }

    public static Mileage init() {
        return new Mileage();
    }

    public Mileage plus() {
        Mileage mileage = new Mileage();
        mileage.meter = meter + 1;
        return mileage;
    }

    public int getMeter() {
        return meter;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mileage mileage = (Mileage) o;
        return meter == mileage.meter;
    }

    @Override
    public int hashCode() {
        return Objects.hash(meter);
    }
}
