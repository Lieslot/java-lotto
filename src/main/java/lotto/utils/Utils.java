package lotto.utils;

import lotto.Exception.LottoInputFormatException;
import lotto.Exception.MoneyTypeException;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Utils {

    public static List<Integer> ArraystrToIntegerList(String[] strArray) throws NumberFormatException {

            return Arrays.stream(strArray)
                    .map(Integer::parseInt)
                    .collect(Collectors.toList());




    }

    public static Integer strToInteger(String str) throws NumberFormatException {

        return Integer.parseInt(str);

    }


}
