package domain.analysis;

import domain.model.statisticsdata.deviation.StandardDeviation;
import domain.model.statisticsdata.representativevalue.AverageValue;
import java.math.BigDecimal;
import lombok.AllArgsConstructor;

/**
 * 変動係数.
 *
 * @author 13r4123
 */
@AllArgsConstructor
public class CoefficientOfVariance {

  private final StandardDeviation standardDeviation;

  private final AverageValue averageValue;

  /**
   * <pre>
   *   変動係数を計算する.
   *   標準偏差 / 平均値
   * </pre>
   *
   * @return 変動係数
   */
  public BigDecimal calculateCoefficientOfVariance() {
    return this.standardDeviation.calcStandardDeviation()
        .divide(this.averageValue.getAverageValue(), BigDecimal.ROUND_HALF_UP);
  }
}
