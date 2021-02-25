package domain.analysis.regression;

import java.math.BigDecimal;
import lombok.Value;

/**
 * 被説明変数.
 *
 * @author 13r4123
 */
@Value
public class DependentVariable {

  BigDecimal value;
}
