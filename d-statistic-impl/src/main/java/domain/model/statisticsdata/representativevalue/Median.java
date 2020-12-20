package domain.model.statisticsdata.representativevalue;

import java.math.BigDecimal;
import java.util.List;
import lombok.AllArgsConstructor;

/**
 * 中央値クラス.
 *
 * @author 13r4123
 */
@AllArgsConstructor
public class Median {

  private final ObservationValues observationValues;

  /**
   * 中央値
   *
   * @return 中央値
   */
  public BigDecimal getMedian() {
    this.observationValues.sort();
    List<Value> observationValue = this.observationValues.getObservationValues();
    int size = observationValue.size();

    if (size % 2 == 0) {
      return (observationValue.get(size / 2).getValue()
          .add(observationValue.get(size / 2 + 1).getValue()))
          .divide(BigDecimal.valueOf(2), 0);
    }

    return observationValue.get(size / 2).getValue();
  }
}
