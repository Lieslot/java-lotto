package lotto;

import lotto.vo.Money;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class MoneyTest {

    @DisplayName("금액이 1000원 단위가 아닐 경우 예외를 발생시킨다")
    @Test
    void moneyUnitExceptionTest() {


        assertThatThrownBy(()-> new Money(1500));



    }
    @DisplayName("금액이 1000원 단위이면서 음수일 경우 예외를 발생시킨다.")
    @Test
    void moneyNegativeExceptionTest() {


        assertThatThrownBy(()-> new Money(-1000));



    }
}
