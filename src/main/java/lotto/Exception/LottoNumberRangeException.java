package lotto.Exception;

import lotto.LottoEnum;

import static lotto.LottoEnum.MAX_RANGE;
import static lotto.LottoEnum.MIN_RANGE;

public class LottoNumberRangeException extends IllegalArgumentException {


private static final String ERROR_MESSAGE = String.format("[ERROR] 로또 번호는 %d부터 %d 사이의 숫자여야 합니다.",
                                                                MIN_RANGE.getValue(), MAX_RANGE.getValue());

    public LottoNumberRangeException() {
        super(ERROR_MESSAGE);
        System.out.println(ERROR_MESSAGE);
    }
}
