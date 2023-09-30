package lotto.view;
import camp.nextstep.edu.missionutils.Console;
import lotto.Exception.MoneyNegativeException;
import lotto.Exception.MoneyTypeException;
import lotto.Exception.MoneyUnitException;
import lotto.LottoEnum;
import lotto.vo.Money;

import java.util.NoSuchElementException;

import static lotto.LottoEnum.MONEY_UNIT;

public class MoneyInputView {




    public static Money inputMoney() {
        System.out.println("구입금액을 입력해 주세요.");
        String moneyStr = Console.readLine();


        Money money = new Money(validateMoneyInput(moneyStr));


        return money;


    }

    public static Long validateMoneyInput(String moneyStr) {
        long money;

        try {
            checkMoneyType(moneyStr);
        } catch(MoneyTypeException e) {
            throw new NoSuchElementException(e.getMessage());
        }

        money = Long.parseLong(moneyStr);


        return money;

    }

    private static void checkMoneyType(String moneyStr) throws MoneyTypeException {
        boolean isNumeric = moneyStr.chars().allMatch(Character::isDigit);

        if (isNumeric == false) {

            throw new MoneyTypeException();
        }
    }





}
