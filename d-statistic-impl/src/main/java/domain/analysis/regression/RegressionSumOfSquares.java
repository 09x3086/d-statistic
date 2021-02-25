package domain.analysis.regression;

import domain.model.statisticsdata.representativevalue.AverageValue;
import java.math.BigDecimal;
import lombok.AllArgsConstructor;

/**
 * 回帰平方和.
 *
 * @author 13r4123
 */
@AllArgsConstructor
public class RegressionSumOfSquares {

  private final EstimatedValues estimatedValues;

  private final AverageValue averageValue;

  /**
   * <pre>
   *   回帰平方和を計算する.
   *   (予測値1 - 平均値)^2 + ... + (予測値i - 平均値)^2
   * </pre>
   *
   * @return 回帰平方和
   */
  public BigDecimal calculateRegressionSumOfSquares() {

    this.averageValue.calculateAverageValue();

    return this.estimatedValues.getEstimatedValueMap().values().stream()
        .map(e -> e.getValue().subtract(this.averageValue.getCalculationResult().getValue()).pow(2))
        .reduce(BigDecimal.ZERO, BigDecimal::add);
  }
}
