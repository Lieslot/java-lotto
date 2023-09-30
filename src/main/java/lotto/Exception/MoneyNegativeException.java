package lotto.Exception;

public class MoneyNegativeException extends IllegalArgumentException {

    private static final String ERROR_MESSAGE = "[ERROR] 금액에 음수를 입력할 수 없습니다.";


    public MoneyNegativeException() {
        super(ERROR_MESSAGE);
        System.out.println(ERROR_MESSAGE);

    }

}
