package domain.probability;

import java.math.BigDecimal;
import java.math.RoundingMode;
import lombok.AllArgsConstructor;

/**
 * 古典的確率.
 *
 * @author 13r4123
 */
@AllArgsConstructor
public class ClassicalProbability {

  private final ElementaryEvents satisfiedElementaryEvents;

  private final AllEvents allEvents;

  /**
   * 古典的確率を計算する.
   *
   * @return 古典的確率
   */
  public BigDecimal calculateClassicalProbability() {
    return this.satisfiedElementaryEvents.calculateElementaryEventsSize()
        .divide(this.allEvents.calculateElementaryEventsSize(), RoundingMode.UNNECESSARY);
  }
}
