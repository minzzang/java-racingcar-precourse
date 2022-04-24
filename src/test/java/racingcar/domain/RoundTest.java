package racingcar.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class RoundTest {

    @DisplayName("자동차의 주행 거리를 기록한다.")
    @Test
    public void record() {
        // given
        Round round = new Round();
        CarName carName = new CarName("그랜져");
        Mileage mileage = Mileage.init().plus();
        // when
        round.record(carName, mileage);
        // then
        assertThat(mileage).isEqualTo(round.getMileage(carName));
    }

}