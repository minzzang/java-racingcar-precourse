package racingcar.domain;

import java.util.Objects;

public class CarName {

    public static final int NAME_SIZE_LIMIT = 5;

    private final String name;

    public CarName(String name) {
        if (isNotCreate(name)) {
            throw new IllegalArgumentException("1자 이상 5자 이하의 이름만 가능합니다.");
        }
        this.name = name;
    }

    private boolean isNotCreate(String name) {
        if (name == null) return true;

        name = name.trim();
        return name.isEmpty() || name.length() > NAME_SIZE_LIMIT;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CarName carName = (CarName) o;
        return Objects.equals(name, carName.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
