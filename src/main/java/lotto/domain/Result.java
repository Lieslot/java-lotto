package lotto.domain;

import lotto.RankingEnum;
import lotto.vo.Money;

import java.util.Collections;
import java.util.Map;

public class Result {


    Map<RankingEnum, Integer> rankingCount;
    Money customerMoney;

    public Result(Map<RankingEnum, Integer> rankingCount, Money customerMoney) {
        this.rankingCount = rankingCount;
        this.customerMoney = customerMoney;
    }


    public Map<RankingEnum, Integer> getRankingCount() {
        return Collections.unmodifiableMap(rankingCount);
    }
    public double getRateOfReturn() {

        return calRateOfReturn();

    }


    public double calRateOfReturn() {

        long revenue =  rankingCount.entrySet()
                .stream()
                .map(entry -> entry.getKey().showMultipleReward(entry.getValue()))
                .reduce(0L, Long::sum);
        return (double)revenue*100 / customerMoney.showMoney();
    }





}
