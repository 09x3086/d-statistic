package domain.model.statisticsdata.representativevalue;

import java.util.Collections;
import java.util.List;
import lombok.Getter;

/**
 * 観測値クラス.
 *
 * @author 13r4123
 */
@Getter
public class ObservationValues {

  private List<Value> observationValues;

  public void sort() {
    observationValues.sort(Collections.reverseOrder());
  }
}
