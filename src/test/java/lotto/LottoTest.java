package lotto;

import camp.nextstep.edu.missionutils.Console;
import lotto.Exception.BonusNumberFormatException;
import lotto.domain.Lotto;
import lotto.domain.WinningLotto;
import lotto.utils.Utils;
import lotto.vo.BonusNumber;
import lotto.vo.Money;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

class LottoTest {
    @DisplayName("로또 번호의 개수가 6개가 넘어가면 예외가 발생한다.")
    @Test
    void createLottoByOverSize() {
        assertThatThrownBy(() -> new Lotto(List.of(1, 2, 3, 4, 5, 6, 7)))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @DisplayName("로또 번호에 중복된 숫자가 있으면 예외가 발생한다.")
    @Test
    void createLottoByDuplicatedNumber() {
        // TODO: 이 테스트가 통과할 수 있게 구현 코드 작성
        assertThatThrownBy(() -> new Lotto(List.of(1, 2, 3, 4, 5, 5)))
                .isInstanceOf(IllegalArgumentException.class);
    }
    @DisplayName("로또 번호와 보너스 번호가 중복될 경우 예외를 발생시킨다")
    @Test
    void bonusNumberDuplicationTest() {


        assertThatThrownBy(()-> new WinningLotto(List.of(1, 2, 3, 4, 5, 6),new BonusNumber(6)))
                .isInstanceOf(IllegalArgumentException.class);



    }

    @DisplayName("로또 번호가 범위를 넘어갈 때 예외를 발생시킨다")
    @Test
    void numberRangeExceptionTest() {


        assertThatThrownBy(()-> new Lotto(List.of(1, 2, 3, 4, 50, 6)));



    }



    @DisplayName("금액이 1000원 단위이면서 음수일 경우 예외를 발생시킨다.")
    @Test
    void moneyNegativeExceptionTest() {


        assertThatThrownBy(()-> new Money(-1000));



    }






}
