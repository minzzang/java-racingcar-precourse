package racingcar.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RacingCarsTest {

    @DisplayName("여러 레이싱 카들이 경기를 진행한다.")
    @Test
    public void run() {
        // given
        RacingCars cars = new RacingCars("그랜져", "제네시스");
        // when
        cars.run();
    }

}