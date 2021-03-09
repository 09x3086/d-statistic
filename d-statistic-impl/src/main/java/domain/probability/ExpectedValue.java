package domain.probability;

import domain.model.statisticsdata.representativevalue.CalculationResult;
import java.math.BigDecimal;

/**
 * 期待値.
 *
 * @author 13r4123
 */
public class ExpectedValue {

  private CalculationResult calculationResult;

  /**
   * 確率平均値を計算する.
   *
   * @param probabilityDistribution 確率分布
   */
  public void calculateProbabilityAverage(ProbabilityDistribution probabilityDistribution) {
    this.calculationResult = new CalculationResult(
        probabilityDistribution.getProbabilityVariableMap().entrySet().stream()
            .map(e -> BigDecimal.valueOf(e.getKey()).multiply(e.getValue().getValue()))
            .reduce(BigDecimal.ZERO, BigDecimal::add));
  }
}
