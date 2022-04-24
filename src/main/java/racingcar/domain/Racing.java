package racingcar.domain;

public class Racing {

    private final RacingCars cars;
    private final RoundManager roundManager;

    public Racing(RacingCars cars, int totalRound) {
        this.cars = cars;
        roundManager = new RoundManager(totalRound);
    }

    public void play() {
        while (roundManager.isNotEnded()) {
            cars.run(roundManager.getCurrentRound());
            roundManager.nextRound();
        }
    }
}
