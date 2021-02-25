package domain.model.statisticsdata.representativevalue;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map.Entry;
import java.util.stream.Collectors;
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
   * 中央値を計算する.
   *
   * @return 中央値
   */
  public BigDecimal calculateMedian() {
    List<ObservationValue> observationValue = this.observationValues.getObservationValueMap()
        .entrySet().stream()
        .sorted()
        .map(Entry::getValue)
        .collect(Collectors.toList());

    int size = observationValue.size();

    if (size % 2 == 0) {
      return (observationValue.get(size / 2).getValue()
          .add(observationValue.get(size / 2 + 1).getValue()))
          .divide(BigDecimal.valueOf(2), 0);
    }

    return observationValue.get(size / 2).getValue();
  }
}
