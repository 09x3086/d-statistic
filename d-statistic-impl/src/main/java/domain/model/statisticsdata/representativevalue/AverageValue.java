package domain.model.statisticsdata.representativevalue;

import domain.model.Population;
import java.math.BigDecimal;
import java.math.RoundingMode;
import lombok.AllArgsConstructor;

/**
 * 平均値クラス.
 *
 * @author 09x3086
 */
@AllArgsConstructor
public class AverageValue {

  private final Population population;

  private final Total total;

  /**
   * 平均値
   *
   * @return 平均値
   */
  public BigDecimal getAverageValue(){
    return total.getTotalValue().divide(population.getValue(), RoundingMode.HALF_UP);
  }
}
