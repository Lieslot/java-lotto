package lotto.vo;

import lotto.Exception.MoneyNegativeException;
import lotto.Exception.MoneyTypeException;
import lotto.Exception.MoneyUnitException;

import static lotto.LottoEnum.MONEY_UNIT;

public class Money {

    private final long money;

    public Money(long money) {

        validate(money);

        this.money = money;
    }

    private void validate(long money) {
        checkMoneyUnit(money);
        checkNegativeNumber(money);
    }


    private static void checkNegativeNumber(Long money) {

        if (money < 0) {
            throw new MoneyNegativeException();
        }
    }

    private static void checkMoneyUnit(Long money) {

        if (money % MONEY_UNIT.getValue() != 0) {
            throw new MoneyUnitException();
        }

    }

    public long showMoney() {
        return this.money;
    }
}
