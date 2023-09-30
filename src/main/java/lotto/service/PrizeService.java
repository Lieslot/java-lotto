package lotto.service;

import lotto.RankingEnum;
import lotto.domain.Lotto;
import lotto.domain.Result;
import lotto.domain.WinningLotto;
import lotto.vo.Money;

import java.util.*;

public class PrizeService {

    private final WinningLotto winningLotto;

    public PrizeService(WinningLotto winningLotto) {
        this.winningLotto = winningLotto;
    }

    private int calMatchCount(Lotto lotto) {

        return (int) lotto.getNumbers()
                .stream()
                .filter(winningLotto::contains)
                .count();
    }
    private RankingEnum calRanking(Lotto lotto) {
        int count = calMatchCount(lotto);
        boolean bonus = winningLotto.contains(winningLotto.getBonusNumber());

        return Arrays.stream(RankingEnum.values())
                .filter(ranking -> ranking.match(count, bonus))
                .findFirst()
                .orElse(RankingEnum.NONE);
    }

    public Map<RankingEnum, Integer> initRankingCount() {
        Map<RankingEnum, Integer> rankingCount = new EnumMap<>(RankingEnum.class);

        Arrays.stream(RankingEnum.values())
                .forEach(ranking -> rankingCount.put(ranking, rankingCount.getOrDefault(ranking, 0)));

        return rankingCount;
    }

    public Map<RankingEnum, Integer> calRankingCount(List<Lotto> lottoList) {
        Map<RankingEnum, Integer> rankingCount = initRankingCount();

        lottoList.stream()
                .map(this::calRanking)
                .forEach(ranking -> rankingCount.put(ranking, rankingCount.getOrDefault(ranking, 0)+1));

        return rankingCount;
    }



}
