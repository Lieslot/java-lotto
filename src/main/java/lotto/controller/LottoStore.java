package lotto.controller;

import lotto.domain.Lotto;
import lotto.domain.Result;
import lotto.domain.WinningLotto;
import lotto.service.LottoService;
import lotto.service.PrizeService;
import lotto.service.ResultOutputService;
import lotto.view.WinningLottoInputView;
import lotto.vo.Money;

import java.util.List;

public class LottoStore {
    private final LottoService lottoService;

    public LottoStore() {
        lottoService= new LottoService();
    }

    public Lotto generateLotto() {

       Lotto newLotto  = lottoService.generateLotto();

        return newLotto;

    }

    public void checkLotto(List<Lotto> lottoList) {

        lottoService.outputGeneratedLottoList(lottoList);
    }

    public void showResult(List<Lotto> lottoList, Money customerMoney) {
        WinningLotto winningLotto = getWinningLotto();
        PrizeService prizeService = new PrizeService(winningLotto);
        ResultOutputService resultOutputService = new ResultOutputService();

        Result result = new Result(prizeService.calRankingCount(lottoList), customerMoney);


        resultOutputService.showResult(result);

    }

    private WinningLotto getWinningLotto() {

        return WinningLottoInputView.input();
    }



}
