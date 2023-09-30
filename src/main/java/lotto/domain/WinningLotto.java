package lotto.domain;

import lotto.Exception.NumberDuplicationException;
import lotto.vo.BonusNumber;

import java.util.List;

public class WinningLotto extends Lotto{


    private final BonusNumber bonusNumber;


    public WinningLotto(List<Integer> numbers, BonusNumber bonusNumber) {
        super(numbers);
        validateDuplication(bonusNumber);

        this.bonusNumber = bonusNumber;
    }



    private void validateDuplication(BonusNumber bonusNumber) {
        List<Integer> numbers = this.getNumbers();

        if (numbers.contains(bonusNumber.getBonusNumber())) {
            throw new NumberDuplicationException();
        }


    }

    public int getBonusNumber() {

        return bonusNumber.getBonusNumber();
    }


}
