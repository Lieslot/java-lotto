package lotto.view;

import lotto.Exception.BonusNumberFormatException;
import lotto.Exception.LottoInputFormatException;
import lotto.domain.Lotto;
import camp.nextstep.edu.missionutils.Console;
import lotto.domain.WinningLotto;
import lotto.utils.Utils;
import lotto.vo.BonusNumber;

import javax.swing.*;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class WinningLottoInputView {


    public static List<Integer> inputNumbers() {

        System.out.println("\n당첨 번호를 입력해 주세요.");

        String lottoInput = Console.readLine();


        String[] numbersStr = lottoInput.split(",");
        List<Integer> numbers;
        try {
            numbers = Utils.ArraystrToIntegerList(numbersStr);
        }
        catch (NumberFormatException e) {

            throw new LottoInputFormatException();

        }


        return numbers;
    }

    public static WinningLotto input() {
        return new WinningLotto(inputNumbers(), inputBonusNumber());
    }


    public static BonusNumber inputBonusNumber() {
        System.out.println("\n보너스 번호를 입력해 주세요.");
        String bonusNumberStr =  Console.readLine();
        BonusNumber bonusNumber;

        try {
            bonusNumber = new BonusNumber(Utils.strToInteger(bonusNumberStr));
        } catch (NumberFormatException e) {
            throw new BonusNumberFormatException();
        }

        return bonusNumber;

    }


}
