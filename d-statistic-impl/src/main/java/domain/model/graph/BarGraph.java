package domain.model.graph;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import domain.model.graph.information.GraphTitle;
import domain.model.graph.information.HorizontalAxisTitle;
import domain.model.graph.information.VerticalAxisTitle;
import lombok.Builder;
import lombok.Getter;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 * BarGraph class.
 * <p>
 * 棒グラフ
 *
 * </P>
 */
@Builder
@Getter
public class BarGraph {

  @SerializedName("graphTitle")
  @Expose
  private GraphTitle graphTitle;

  @SerializedName("verticalAxisTitle")
  @Expose
  private VerticalAxisTitle verticalAxisTitle;

  @SerializedName("horizontalAxisTitle")
  @Expose
  private HorizontalAxisTitle horizontalAxisTitle;

  @SerializedName("defaultCategoryDataset")
  @Expose
  private DefaultCategoryDataset defaultCategoryDataset;

  @SerializedName("plotOrientation")
  @Expose
  private PlotOrientation plotOrientation;
}
