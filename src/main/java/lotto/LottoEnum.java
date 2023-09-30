package lotto;

public enum LottoEnum {
    MAX_RANGE(45),
    MIN_RANGE(1),
    LOTTO_NUMBER_COUNT(6),
    MONEY_UNIT(1000);

    private final int value;


    LottoEnum(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }


}
