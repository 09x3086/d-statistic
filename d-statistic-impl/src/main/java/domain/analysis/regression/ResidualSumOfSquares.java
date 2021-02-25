package domain.analysis.regression;

import domain.model.statisticsdata.representativevalue.ObservationValues;
import java.math.BigDecimal;
import lombok.AllArgsConstructor;

/**
 * 残差平方和.
 *
 * @author 13r4123
 */
@AllArgsConstructor
public class ResidualSumOfSquares {

  private final ObservationValues observationValues;

  private final EstimatedValues estimatedValues;

  /**
   * <pre>
   *   残差平方和を計算する.
   *   (観測値1 - 予測値1)^2 + ... + (観測値i - 予測値i)^2
   * </pre>
   *
   * @return 残差平方和
   */
  public BigDecimal calculateResidualSumOfSquares() {

    return this.observationValues.getObservationValueMap().entrySet().stream()
        .map(e -> new Residual(e.getValue(),
            this.estimatedValues.getEstimatedValueMap().get(e.getKey())))
        .map(e -> e.calculateResidual().pow(2))
        .reduce(BigDecimal.ZERO, BigDecimal::add);
  }
}
