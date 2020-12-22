package domain.model.statisticsdata.deviation;

import domain.model.Population;
import domain.model.statisticsdata.representativevalue.AverageValue;
import domain.model.statisticsdata.representativevalue.Total;
import java.math.BigDecimal;
import lombok.AllArgsConstructor;

/**
 * 標準偏差 class.
 *
 * @author 13r4123
 */
@AllArgsConstructor
public class StandardDeviation {

  private final Population population;

  private final Total total;

  private final AverageValue averageValue;

  /**
   * 標準偏差の計算
   *
   * @return 標準偏差
   */
  public BigDecimal calcStandardDeviation() {
    return BigDecimal.valueOf(
        Math.sqrt(this.total.getTotalValue().subtract(this.averageValue.getAverageValue()).pow(2)
            .divide(this.population.getValue(), BigDecimal.ROUND_HALF_UP).doubleValue()));
  }
}
