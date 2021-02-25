package domain.analysis;

import domain.model.statisticsdata.deviation.StandardDeviation;
import domain.model.statisticsdata.representativevalue.AverageValue;
import domain.model.statisticsdata.representativevalue.ObservationValues;
import java.math.BigDecimal;
import lombok.AllArgsConstructor;

/**
 * 標準化.
 *
 * @author 13r4123
 */
@AllArgsConstructor
public class Standardization {

  private final ObservationValues observationValues;

  private final AverageValue averageValue;

  private final StandardDeviation standardDeviation;

  /**
   * <pre>
   *   標準化を計算する.
   *   (観測値 - 平均値) / 標準偏差
   * </pre>
   * @param i 観測値 i
   * @return 標準化
   */
  public BigDecimal calculateStandardization(Integer i) {
    return this.observationValues.getObservationValue(i).getValue()
        .subtract(this.averageValue.getAverageValue())
        .divide(this.standardDeviation.calcStandardDeviation(), BigDecimal.ROUND_HALF_UP);
  }
}
