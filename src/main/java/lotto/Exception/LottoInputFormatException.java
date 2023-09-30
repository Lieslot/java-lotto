package lotto.Exception;

public class LottoInputFormatException extends IllegalArgumentException {
    private static final String ERROR_MESSAGE = "[ERROR] 올바른 로또 입력형식이 아닙니다.";

    public LottoInputFormatException() {

        super(ERROR_MESSAGE);
        System.out.println(ERROR_MESSAGE);

    }
}
