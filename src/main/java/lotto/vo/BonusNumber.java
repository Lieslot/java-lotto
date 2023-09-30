package lotto.vo;

import lotto.Exception.BonusNumberFormatException;
import lotto.Exception.LottoNumberRangeException;
import lotto.LottoEnum;

import static lotto.LottoEnum.MAX_RANGE;
import static lotto.LottoEnum.MIN_RANGE;

public class BonusNumber {

    private final int bonusNumber;



    public BonusNumber(int bonusNumber) {

        checkRange(bonusNumber);
        this.bonusNumber = bonusNumber;
    }

    public int getBonusNumber() {
        return this.bonusNumber;
    }


    private void checkRange(int bonusNumber) {

        if (bonusNumber < MIN_RANGE.getValue() || bonusNumber > MAX_RANGE.getValue()) {
            throw new LottoNumberRangeException();
        }

    }
}
