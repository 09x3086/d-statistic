package domain.model.statisticsdata.data;

import java.math.BigDecimal;
import lombok.Data;

/**
 * 階級値 class.
 *
 * @author 13r4123
 */
@Data
public class ClassificationValue {

  BigDecimal value;

  BigDecimal maxValue;

  BigDecimal minValue;
}
