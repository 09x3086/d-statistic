package domain.analysis.regression;

import java.util.Map;
import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 推定値の集合.
 *
 * @author 13r4123
 */
@AllArgsConstructor
@Getter
public class EstimatedValues {

  Map<Integer, EstimatedValue> estimatedValueMap;
}
