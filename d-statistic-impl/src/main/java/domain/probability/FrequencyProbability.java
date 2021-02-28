package domain.probability;

import java.math.BigDecimal;
import java.util.List;
import lombok.AllArgsConstructor;

/**
 * 頻度確率.
 *
 * @author 13r4123
 */
@AllArgsConstructor
public class FrequencyProbability {

  List<ClassicalProbability> classicalProbabilities;

  /**
   * 頻度確率を計算する.
   *
   * @return 頻度確率
   */
  public BigDecimal calculateFrequencyProbability() {
    return classicalProbabilities.stream()
        .map(ClassicalProbability::calculateClassicalProbability)
        .reduce(BigDecimal.ZERO, BigDecimal::add);
  }
}
