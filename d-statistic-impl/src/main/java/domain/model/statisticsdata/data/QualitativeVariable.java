package domain.model.statisticsdata.data;

/**
 * QualitativeVariable class.
 *
 * <p>
 * 質的変数 クラス
 */
public class QualitativeVariable {

  private VariableName variableName;

  private Frequency frequency;

  private ScalesType scalesType;

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
