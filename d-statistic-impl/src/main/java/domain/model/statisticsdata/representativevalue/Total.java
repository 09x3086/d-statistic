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

  private final BigDecimal totalValue;

  private final List<BigDecimal> bigDecimalList;

  /**
   * 合計を計算する.
   *
   * @return 合計
   */
  public BigDecimal getTotalValue() {
    return this.bigDecimalList.stream().reduce(this.totalValue, BigDecimal::add);
  }
}
