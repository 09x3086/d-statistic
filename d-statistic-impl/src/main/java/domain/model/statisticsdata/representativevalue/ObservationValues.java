package domain.model.statisticsdata.representativevalue;

import java.util.Map;
import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 観測値一覧.
 *
 * @author 13r4123
 */
@Getter
@AllArgsConstructor
public class ObservationValues {

  private final Map<Integer, ObservationValue> observationValueMap;

  /**
   * 観測値を取得.
   *
   * @param index 観測値番号
   * @return 観測値
   */
  public ObservationValue getObservationValue(Integer index) {
    return this.observationValueMap.get(index);
  }
}
