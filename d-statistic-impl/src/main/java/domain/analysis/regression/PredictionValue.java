package domain.analysis.regression;

import java.math.BigDecimal;
import lombok.Value;

/**
 * 予測値.
 *
 * @author 13r4123
 */
@Value
public class PredictionValue {

  BigDecimal value;
}
