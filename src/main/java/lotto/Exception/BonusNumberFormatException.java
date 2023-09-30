package lotto.Exception;

public class BonusNumberFormatException extends IllegalArgumentException{
    private static final String ERROR_MESSAGE = "[ERROR] 올바른 보너스 숫자 입력형식이 아닙니다.";

    public BonusNumberFormatException() {
        super(ERROR_MESSAGE);
        System.out.println(ERROR_MESSAGE);
    }
}
