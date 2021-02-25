package domain.analysis.regression;

import domain.model.statisticsdata.representativevalue.ObservationValue;
import java.math.BigDecimal;
import lombok.AllArgsConstructor;

/**
 * 残差.
 *
 * @author 13r4123
 */
@AllArgsConstructor
public class Residual {

  private final ObservationValue observationValue;

  private final EstimatedValue estimatedValue;

  /**
   * <pre>
   *   残差を計算する.
   *   観測値 - 予測値
   * </pre>
   *
   * @return 残差
   */
  public BigDecimal calculateResidual() {

    return this.observationValue.getValue().subtract(this.estimatedValue.getValue());
  }
}
