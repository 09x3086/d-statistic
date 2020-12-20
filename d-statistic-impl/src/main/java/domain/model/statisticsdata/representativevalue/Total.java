package domain.model.statisticsdata.representativevalue;

import java.math.BigDecimal;
import java.util.List;
import lombok.AllArgsConstructor;

/**
 * 合計クラス.
 *
 * @author 09x3086
 */
@AllArgsConstructor
public class Total {

  private BigDecimal totalValue;

  private final List<BigDecimal> bigDecimalList;

  /**
   * 合計
   *
   * @return 合計
   */
  public BigDecimal getTotalValue() {
    for (BigDecimal bigDecimal : this.bigDecimalList) {
      this.totalValue = this.totalValue.add(bigDecimal);
    }
    return this.totalValue;
  }
}
