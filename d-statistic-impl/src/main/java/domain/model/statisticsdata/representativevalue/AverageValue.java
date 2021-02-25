package domain.model.statisticsdata.representativevalue;

import domain.model.Population;
import domain.model.statisticsdata.data.CalculationResult;
import java.math.BigDecimal;
import java.math.RoundingMode;
import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 平均値クラス.
 *
 * @author 09x3086
 */
@AllArgsConstructor
public class AverageValue {

  private final Population population;

  private final Total total;

  @Getter
  private CalculationResult calculationResult;

  /**
   * 平均値
   *
   * @return 平均値
   */
  public BigDecimal getAverageValue() {
    return total.getTotalValue().divide(population.getValue(), RoundingMode.HALF_UP);
  }

  /**
   * 平均値
   */
  public void calculateAverageValue() {
    this.calculationResult = new CalculationResult(
        total.getTotalValue().divide(population.getValue(), RoundingMode.HALF_UP));
  }
}
