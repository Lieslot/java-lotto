package lotto.domain;

import lotto.Exception.LottoNumberCountException;
import lotto.Exception.LottoNumberRangeException;
import lotto.Exception.NumberDuplicationException;
import lotto.LottoEnum;

import java.util.Collections;
import java.util.List;

import static lotto.LottoEnum.*;

public class Lotto {


    private final List<Integer> numbers;

    public Lotto(List<Integer> numbers) {
        validate(numbers);

        this.numbers = numbers;
    }

    public List<Integer> getNumbers() {

        return Collections.unmodifiableList(numbers);
    }

    private void validate(List<Integer> numbers) {
        validateCount(numbers);
        validateRange(numbers);
        validateDuplication(numbers);
    }

    private void validateCount(List<Integer> numbers) {
        if (numbers.size() != LOTTO_NUMBER_COUNT.getValue()) {
            throw new LottoNumberCountException();
        }
    }

    private void validateRange(List<Integer> numbers) {

        numbers.forEach(this::checkRange);
    }
    private void validateDuplication(List<Integer> numbers) {
        if (hasDuplication(numbers)) {
            throw  new NumberDuplicationException();
        }
    }
    private boolean hasDuplication(List<Integer> numbers) {
        return numbers.stream()
                .distinct()
                .count() != numbers.size();
    }

    private void checkRange(Integer number) {
        if (number > MAX_RANGE.getValue()
                || number < MIN_RANGE.getValue()) {
            throw new LottoNumberRangeException();
        }

    }


    @Override
    public String toString() {
        return numbers.toString();
    }

    public Boolean contains(Integer number) {
        return numbers.contains(number);
    }



}
