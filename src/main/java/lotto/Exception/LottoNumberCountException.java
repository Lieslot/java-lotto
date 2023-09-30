package lotto.Exception;

import lotto.LottoEnum;

import static lotto.LottoEnum.LOTTO_NUMBER_COUNT;

public class LottoNumberCountException extends IllegalArgumentException{

    private static final String ERROR_MESSAGE = String.format("[ERROR] 로또에 입력되는 숫자는 %d개여야 합니다.", LOTTO_NUMBER_COUNT.getValue());


    public LottoNumberCountException() {

        super(ERROR_MESSAGE);
        System.out.println(ERROR_MESSAGE);
    }
}
