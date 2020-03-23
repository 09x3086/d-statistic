package domain.model.statisticsdata;

/**
 * QualitativeVariable class.
 *
 * <p>
 * 質的変数 クラス
 */
public class QualitativeVariable {

  private Frequency frequency;

  private ScalesType scalesType;

  /**
   * Constructor.
   *
   * @param scalesType ScalesType
   */
  public QualitativeVariable(ScalesType scalesType) {
    if (!scalesType.equals(ScalesType.NominalScale) && !scalesType
        .equals(ScalesType.OrdinalScale)) {
      throw new IllegalArgumentException();
    }

    this.scalesType = scalesType;
  }
}
