package racingcar.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RacingTest {

    @DisplayName("레이싱 경기는 n회차(round) 진행된다.")
    @Test
    public void play() {
        // given
        int totalRound = 3;
        MockCars mockCars = new MockCars();
        Racing racing = new Racing(mockCars, totalRound);
        // when
        racing.play();
        // then
        assertThat(totalRound).isEqualTo(mockCars.count);
    }

    static class MockCars extends RacingCars {

        int count;

        @Override
        public void run() {
            count++;
        }
    }
}
