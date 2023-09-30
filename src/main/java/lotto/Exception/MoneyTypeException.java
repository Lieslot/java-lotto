package lotto.Exception;

public class MoneyTypeException extends IllegalArgumentException{

    private static final String ERROR_MESSAGE = "[ERROR] 금액에는 숫자를 입력해주십시오";


    public MoneyTypeException() {

        super(ERROR_MESSAGE);
        System.out.println(ERROR_MESSAGE);

    }



}
