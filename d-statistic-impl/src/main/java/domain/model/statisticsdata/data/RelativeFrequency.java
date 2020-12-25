package domain.model.statisticsdata.data;

import java.math.BigDecimal;
import lombok.AllArgsConstructor;

/**
 * 相対度数 クラス.
 *
 * @author 13r4123
 */
@AllArgsConstructor
public class RelativeFrequency {

  private final Classification classification;

  private final Frequencies frequencies;

  /**
   * <pre>
   * 相対度数の計算
   * 相対度数=階級の度数/度数の合計
   * </pre>
   *
   * @return 相対度数
   */
  public BigDecimal calcRelativeFrequency() {
    return this.classification.getFrequency().getValue()
        .divide(this.frequencies.calcTotalFrequencies(), BigDecimal.ROUND_HALF_UP);
  }
}
