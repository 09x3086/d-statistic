package domain.model.statisticsdata.deviation;

import domain.model.Population;
import domain.model.statisticsdata.representativevalue.AverageValue;
import domain.model.statisticsdata.representativevalue.Total;
import java.math.BigDecimal;
import lombok.AllArgsConstructor;

/**
 * 平均偏差 class.
 *
 * @author 13r4123
 */
@AllArgsConstructor
public class MeanAbsoluteDeviation {

  private final Population population;

  private final Total total;

  private final AverageValue averageValue;

  /**
   * 平均偏差の計算
   *
   * @return 平均偏差
   */
  public BigDecimal calcMeanAbsoluteDeviation() {
    return this.total.getTotalValue().subtract(this.averageValue.getAverageValue()).abs()
        .divide(this.population.getValue(), BigDecimal.ROUND_HALF_UP);
  }
}
