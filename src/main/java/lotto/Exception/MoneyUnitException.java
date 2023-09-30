package lotto.Exception;

import lotto.LottoEnum;

import static lotto.LottoEnum.MONEY_UNIT;

public class MoneyUnitException extends IllegalArgumentException{

    private static final String ERROR_MESSAGE = String.format("[ERROR] 금액은 %d원 단위로 입력해야 합니다", MONEY_UNIT.getValue());

    public MoneyUnitException() {

        super(ERROR_MESSAGE);
        System.out.println(ERROR_MESSAGE);
    }

}
