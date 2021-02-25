package domain.analysis.regression;

import domain.model.statisticsdata.representativevalue.AverageValue;
import domain.model.statisticsdata.representativevalue.ObservationValues;
import java.math.BigDecimal;
import lombok.AllArgsConstructor;

/**
 * 総平方和.
 *
 * @author 13r4123
 */
@AllArgsConstructor
public class TotalSumOfSquares {

  private final ObservationValues observationValues;

  private final AverageValue averageValue;

  /**
   * <pre>
   *   総平方和を計算する.
   *   (観測値1 - 平均値)^2 + ... + (観測値i - 平均値)^2
   * </pre>
   *
   * @return 総平方和
   */
  public BigDecimal calculateTotalSumOfSquares() {

    this.averageValue.calculateAverageValue();

    return this.observationValues.getObservationValueMap().values().stream()
        .map(e -> e.getValue().subtract(this.averageValue.getCalculationResult().getValue()).pow(2))
        .reduce(BigDecimal.ZERO, BigDecimal::add);
  }
}
