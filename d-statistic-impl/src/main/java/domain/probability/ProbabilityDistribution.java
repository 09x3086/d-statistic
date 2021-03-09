package domain.probability;

import java.util.Map;
import lombok.Getter;

/**
 * 確率分布.
 *
 * @author 13r4123
 */
@Getter
public class ProbabilityDistribution {

  private Map<Integer, ProbabilityVariable> probabilityVariableMap;
}
