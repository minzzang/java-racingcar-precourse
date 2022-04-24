package racingcar.domain;

public class RoundManager {

    public static final int FIRST_ROUND = 0;

    private final int totalRound;
    private int currentRound;

    public RoundManager(int totalRound) {
        this.totalRound = totalRound;
        this.currentRound = FIRST_ROUND;
    }

    public boolean isNotEnded() {
        return totalRound != currentRound;
    }

    public void nextRound() {
        currentRound++;
    }
}
