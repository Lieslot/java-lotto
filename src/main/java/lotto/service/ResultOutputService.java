package lotto.service;

import lotto.RankingEnum;
import lotto.domain.Result;

import java.text.DecimalFormat;
import java.util.EnumMap;
import java.util.Map;

public class ResultOutputService {

    public void showResult(Result result) {

        showMatchStatics(result);
        outputRateOfReturn(result.getRateOfReturn());
        
    }
    private void showMatchStatics(Result result) {
        System.out.println("당첨통계");
        System.out.println("---");
        Map<RankingEnum, Integer> rankingCount = result.getRankingCount();
        rankingCount.entrySet()
                .stream()
                .sorted((o1, o2) -> o1.getKey().showCount() - o2.getKey().showCount())
                .forEach(this::outputStatics);
    }

    public void outputStatics(Map.Entry<RankingEnum, Integer> entry) {

        RankingEnum rankingEnum = entry.getKey();
        Integer count = entry.getValue();

        if (rankingEnum.showCount() == 0) return;

        outputRanking(rankingEnum);
        outputMatchCount(count);

    }

    private static void outputRanking(RankingEnum rankingEnum) {



        System.out.printf("%d개 일치", rankingEnum.showCount());

        if (rankingEnum.isBonus()) {
            System.out.print(", 보너스 볼 일치");
        }


        System.out.printf(" (%s원) - ", rankingEnum.showRewardStringFormat());
    }

    private static void outputMatchCount(Integer count) {

        System.out.printf("%d개\n", count);

    }

    private void outputRateOfReturn(double rateOfReturn) {

        System.out.printf("총 수익률은 %.1f%%입니다.", rateOfReturn);


    }


}
