package lotto.service;

import lotto.domain.Lotto;
import lotto.domain.LottoNumberGenerator;

import java.util.List;

public class LottoService {



    public Lotto generateLotto() {
        LottoNumberGenerator lottoNumberGenerator = new LottoNumberGenerator();

        Lotto lotto = new Lotto(lottoNumberGenerator.generateLotto());

        return lotto;
    }

    public void outputGeneratedLottoList(List<Lotto> lottoList) {

        System.out.printf("\n%d개를 구매했습니다.\n", lottoList.size());

        lottoList.forEach(System.out::println);



    }

}
