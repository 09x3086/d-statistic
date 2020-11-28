package domain.model.graph;

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

  private GraphTitle graphTitle;

  private VerticalAxisTitle verticalAxisTitle;

  private HorizontalAxisTitle horizontalAxisTitle;

  private DefaultCategoryDataset defaultCategoryDataset;

  private PlotOrientation plotOrientation;
}
