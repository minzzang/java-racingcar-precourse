package racingcar.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class RacingCarsTest {

    @DisplayName("여러 레이싱 카들이 경기를 진행한다.")
    @Test
    public void run() {
        // given
        MockCars cars = new MockCars("그랜져", "제네시스");
        // when
        cars.run();
        // then
        assertThat(2).isEqualTo(cars.count);
    }

    static class MockCars extends RacingCars {

        int count;

        public MockCars(String... carNames) {
            super(carNames);
        }

        @Override
        public void run() {
            for (Car car : cars) {
                count++;
            }
        }
    }
}