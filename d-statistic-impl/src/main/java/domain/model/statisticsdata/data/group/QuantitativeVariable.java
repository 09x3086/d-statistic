package domain.model.statisticsdata.data.group;

import domain.model.statisticsdata.Frequency;
import domain.model.statisticsdata.variable.ContinuousVariable;
import domain.model.statisticsdata.variable.DiscreteVariable;

/**
 * QuantitativeVariable class.
 *
 * <p>
 * 量的変数 クラス
 *
 * @author 09x3086
 */
public class QuantitativeVariable {

  private VariableName variableName;

  private ContinuousVariable continuousVariable;

  private DiscreteVariable discreteVariable;

  private Frequency frequency;

  private ScalesType scalesType;

  /**
   * Constructor.
   *
   * @param scalesType ScalesType
   */
  public QuantitativeVariable(ScalesType scalesType) {
    if (!scalesType.equals(ScalesType.IntervalScale) && !scalesType.equals(ScalesType.RatioScale)) {
      throw new IllegalArgumentException();
    }

    this.scalesType = scalesType;
  }
}
