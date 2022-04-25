package racingcar.view;

public enum ErrorMessage {

      DEFAULT("[ERROR]")
    , ONLY_NUMBER_INPUT("숫자만 입력이 가능합니다.")
    , NAME_LESS_FIVE("1자 이상 5자 이하의 이름만 가능합니다.")
    , DUPLICATE_NAME("자동차 이름이 중복되었습니다.")
    ;

    private final String message;

    ErrorMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
