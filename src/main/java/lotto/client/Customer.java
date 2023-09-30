package lotto.client;

import lotto.LottoEnum;
import lotto.controller.LottoStore;
import lotto.domain.Lotto;
import lotto.view.MoneyInputView;
import lotto.vo.Money;

import java.util.ArrayList;
import java.util.List;

import static lotto.LottoEnum.MONEY_UNIT;

public class Customer {
    private List<Lotto> lottoInventory;
    private LottoStore lottoStore;
    private Money money;

    public Customer() {
        lottoInventory = new ArrayList<>();
        lottoStore = new LottoStore();
    }


    private Lotto pickLotto() {

        return lottoStore.generateLotto();

    }

    private void addLottoToInventory() {

        lottoInventory.add(pickLotto());
    }

    public void purchaseLotto() {
        money = MoneyInputView.inputMoney();
        long lottoCount = money.showMoney() / MONEY_UNIT.getValue();

        while (lottoCount != 0) {
            addLottoToInventory();
            lottoCount--;
        }


        lottoStore.checkLotto(lottoInventory);

    }

    public void getWinningCount() {

        lottoStore.showResult(lottoInventory, money);
    }

}
