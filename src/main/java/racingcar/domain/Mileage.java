package racingcar.domain;

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
}
