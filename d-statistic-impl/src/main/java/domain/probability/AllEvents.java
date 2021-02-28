package domain.probability;

import java.math.BigDecimal;
import java.util.List;

/**
 * 全事象.
 *
 * @author 13r4123
 */
public class AllEvents {

  List<ElementaryEvent> elementaryEvents;

  /**
   * 全事象の総数を計算する.
   *
   * @return 全事象の総数
   */
  public BigDecimal calculateElementaryEventsSize() {
    return BigDecimal.valueOf(this.elementaryEvents.size());
  }
}
