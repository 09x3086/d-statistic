package domain.model;

import java.math.BigDecimal;
import java.util.List;
import lombok.Getter;

/**
 * PopulationMean class.
 * 母平均 クラス
 *
 * @author 09x3086
 */
@Getter
public class PopulationMean {

  private BigDecimal populationMean;

  /**
   * Constructor.
   *
   * @param population Population
   * @param list       BigDecimalList
   */
  public PopulationMean(BigDecimal population, List<BigDecimal> list) {
    this.populationMean = new BigDecimal(0);
    for (BigDecimal bigDecimalValue : list) {
      this.populationMean = this.populationMean.add(bigDecimalValue);
    }

    this.populationMean = population.divide(this.populationMean, 2, BigDecimal.ROUND_HALF_UP);
  }
}
