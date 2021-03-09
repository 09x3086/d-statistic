package domain.model.statisticsdata.data.variable;

import domain.model.statisticsdata.data.Frequency;
import domain.model.statisticsdata.data.ScalesType;
import domain.model.statisticsdata.data.VariableName;
import lombok.Getter;

/**
 * QualitativeVariable class.
 *
 * <p>
 * 質的変数 クラス
 */
@Getter
public class QualitativeVariable {

  private final VariableName variableName;

  private final Frequency frequency;

  private final ScalesType scalesType;

  /**
   * Constructor.
   *
   * @param variableName VariableName
   * @param frequency Frequency
   * @param scalesType ScalesType
   */
  public QualitativeVariable(VariableName variableName,
      Frequency frequency,
      ScalesType scalesType) {
    this.variableName = variableName;
    this.frequency = frequency;

    if (!scalesType.equals(ScalesType.NominalScale)
        && !scalesType.equals(ScalesType.OrdinalScale)) {
      throw new IllegalArgumentException();
    }

    this.scalesType = scalesType;
  }
}
