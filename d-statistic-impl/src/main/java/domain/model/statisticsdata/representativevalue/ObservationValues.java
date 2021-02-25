package domain.model.statisticsdata.representativevalue;

import java.math.BigDecimal;
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

  private List<ObservationValue> observationValues;

  public void sort() {
    this.observationValues.sort(Collections.reverseOrder());
  }

  public ObservationValue getObservationValue(Integer i){
    return this.observationValues.get(i);
  }
}
