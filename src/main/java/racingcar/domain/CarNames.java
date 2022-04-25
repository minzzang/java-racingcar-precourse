package racingcar.domain;

import java.util.HashSet;
import java.util.Set;

import static racingcar.view.ErrorMessage.DEFAULT;
import static racingcar.view.ErrorMessage.DUPLICATE_NAME;

public class CarNames {

    public static final String COMMA = ",";

    private final String[] carNames;

    public CarNames(String names) {
        this.carNames = names.split(COMMA);
        checkDuplicates();
    }

    private void checkDuplicates() {
        Set<String> set = new HashSet<>();
        for (String name : carNames) {
            set.add(name.trim());
        }

        if (set.size() != carNames.length) {
            throw new IllegalArgumentException(DEFAULT.getMessage() + DUPLICATE_NAME.getMessage());
        }
    }

    public String[] getCarNames() {
        return carNames;
    }
}
