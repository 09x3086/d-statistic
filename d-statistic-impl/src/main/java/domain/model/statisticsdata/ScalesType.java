package domain.model.statisticsdata;

/**
 * ScalesType class.
 *
 * <p>
 * 尺度分類 クラス
 *
 * @author 09x3086
 */

public enum ScalesType {

  // NOTE:名義尺度,順序尺度,間隔尺度,比例尺度
  NominalScale("NominalScale"),
  OrdinalScale("OrdinalScale"),
  IntervalScale("IntervalScale"),
  RatioScale("RatioScale");

  private String scalesType;

  /**
   * GetScalesType.
   *
   * @param scalesType String scalesType
   * @return ScalesType
   */
  public ScalesType getScalesType(String scalesType){
    return ScalesType.valueOf(scalesType);
  }

  /**
   * Constructor.
   *
   * @param scalesType String scalesType
   */
  ScalesType(String scalesType) {
    this.scalesType = scalesType;
  }
}
