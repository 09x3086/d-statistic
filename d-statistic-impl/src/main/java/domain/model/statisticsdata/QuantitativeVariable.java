package domain.model.statisticsdata;

/**
 * QuantitativeVariable class.
 *
 * <p>
 * 量的変数 クラス
 *
 * @author 09x3086
 */
public class QuantitativeVariable {

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
