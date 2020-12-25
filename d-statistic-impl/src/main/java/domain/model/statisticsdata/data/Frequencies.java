package domain.model.statisticsdata.data;

import java.math.BigDecimal;
import java.util.List;
import lombok.AllArgsConstructor;

/**
 * 度数一覧クラス.
 *
 * @author 13r4123
 */
@AllArgsConstructor
public class Frequencies {

  private final List<Frequency> frequencies;

  /**
   * 度数総和の計算
   *
   * @return 度数総和
   */
  public BigDecimal calcTotalFrequencies() {
    return frequencies.stream()
        .map(Frequency::getValue)
        .reduce(BigDecimal.ZERO, BigDecimal::add);
  }
}
