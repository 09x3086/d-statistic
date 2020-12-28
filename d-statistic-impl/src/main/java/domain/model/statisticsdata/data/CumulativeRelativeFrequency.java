package domain.model.statisticsdata.data;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

/**
 * 累積相対度数クラス.
 *
 * @author 13r4123
 */
public class CumulativeRelativeFrequency {

  private Map<RelativeFrequency, BigDecimal> relativeFrequencyBigDecimalMap;

  /**
   * 累積相対度数の計算
   *
   * @return 累積相対度数
   */
  public BigDecimal calcCumulativeRelativeFrequency(List<RelativeFrequency> relativeFrequencies) {
    return relativeFrequencies.stream()
        .map(RelativeFrequency::calcRelativeFrequency)
        .reduce(BigDecimal.ZERO, BigDecimal::add);
  }
}
