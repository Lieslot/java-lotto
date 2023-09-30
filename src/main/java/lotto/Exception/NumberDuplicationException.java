package lotto.Exception;

public class NumberDuplicationException extends IllegalArgumentException{

    private static final String ERROR_MESSAGE = "[ERROR] 로또 숫자는 중복되어선 안됩니다.";

    public NumberDuplicationException() {
        super(ERROR_MESSAGE);
        System.out.println(ERROR_MESSAGE);

    }
}
