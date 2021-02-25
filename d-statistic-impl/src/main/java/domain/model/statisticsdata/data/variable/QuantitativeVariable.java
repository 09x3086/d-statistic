package domain.model.statisticsdata.data.variable;

import com.sun.istack.internal.NotNull;
import com.sun.istack.internal.Nullable;
import domain.model.statisticsdata.data.Frequency;
import domain.model.statisticsdata.data.ScalesType;
import domain.model.statisticsdata.data.VariableName;
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

  @NotNull
  private VariableName variableName;

  @Nullable
  private ContinuousVariable continuousVariable;

  @Nullable
  private DiscreteVariable discreteVariable;

  @NotNull
  private Frequency frequency;

  @NotNull
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
