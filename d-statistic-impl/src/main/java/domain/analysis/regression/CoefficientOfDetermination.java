package domain.analysis.regression;

import domain.model.statisticsdata.representativevalue.CalculationResult;
import java.math.BigDecimal;
import lombok.Getter;

/**
 * 決定係数.
 *
 * @author 13r4123
 */
public class CoefficientOfDetermination {

  private final RegressionSumOfSquares regressionSumOfSquares;

  private final TotalSumOfSquares totalSumOfSquares;

  @Getter
  private CalculationResult calculationResult;

  /**
   * <pre>
   *   決定係数を計算する.
   *   回帰平方和 / 総平方和
   * </pre>
   */
  public void calculateCoefficientOfDetermination() {
    this.calculationResult = new CalculationResult(
        this.regressionSumOfSquares.calculateRegressionSumOfSquares()
            .divide(this.totalSumOfSquares.calculateTotalSumOfSquares(), BigDecimal.ROUND_HALF_UP));
  }

  /**
   * コンストラクタ.
   *
   * @param regressionSumOfSquares RegressionSumOfSquares
   * @param totalSumOfSquares      TotalSumOfSquares
   */
  public CoefficientOfDetermination(RegressionSumOfSquares regressionSumOfSquares,
      TotalSumOfSquares totalSumOfSquares) {
    this.regressionSumOfSquares = regressionSumOfSquares;
    this.totalSumOfSquares = totalSumOfSquares;
  }
}
