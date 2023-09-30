package lotto.domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import camp.nextstep.edu.missionutils.Randoms;
import lotto.LottoEnum;

import static lotto.LottoEnum.*;

public class LottoNumberGenerator {





    public List<Integer> generateLotto() {
        int minRange = MIN_RANGE.getValue();
        int maxRange = MAX_RANGE.getValue();
        int count = LOTTO_NUMBER_COUNT.getValue();

        List<Integer> generatedNumbers =  Randoms.pickUniqueNumbersInRange(minRange, maxRange, count);
        List<Integer> numbers = new ArrayList<>(generatedNumbers);

        sortLottoNumbers(numbers);



        return numbers;
    }

    private void sortLottoNumbers(List<Integer> numbers) {

        Collections.sort(numbers);

    }


}
