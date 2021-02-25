package domain.model.statisticsdata.representativevalue;

import java.util.Collections;
import java.util.Map;
import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 観測値クラス.
 *
 * @author 13r4123
 */
@Getter
@AllArgsConstructor
public class ObservationValues {

  private final Map<Integer, ObservationValue> observationValueMap;

  public ObservationValue getObservationValue(Integer i) {
    return this.observationValueMap.get(i);
  }
}
