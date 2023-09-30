package lotto;

import java.beans.Expression;
import java.text.DecimalFormat;
import java.util.function.BiFunction;
import java.util.function.Function;

public enum RankingEnum {
    FIRST(6, false, 2000000000L, (count, bonus) -> count == 6),
    SECOND(5, true, 30000000L, (count, bonus) -> count == 5 && bonus),
    THIRD(5, false, 1500000L, (count, bonus) -> count == 5 && !bonus),
    FOURTH(4, false, 50000L, (count, bonus) -> count == 4),
    FIFTH(3, false, 5000L, (count, bonus) -> count == 3),
    NONE(0, false, 0L,  (count, bonus) -> count <=2 );


    private final long reward;
    private final int count;
    private final boolean bonus;
    private BiFunction<Integer, Boolean, Boolean> expression;
    RankingEnum(Integer count, Boolean bonus, Long reward, BiFunction<Integer, Boolean, Boolean> expression) {
        this.count = count;
        this.reward = reward;
        this.expression = expression;
        this.bonus = bonus;

    }

    public int showCount() {
        return count;
    }


    public boolean match(int count, boolean bonus) {
        return expression.apply(count, bonus);
    }


    public long showMultipleReward (int count) {
        return (long)count*this.reward;
    }


    public boolean isBonus() {
        return bonus;
    }

    public long showReward() {

        return reward;
    }

    public String showRewardStringFormat() {
        DecimalFormat df = new DecimalFormat("###,###");
        return df.format(showReward());

    }


}
