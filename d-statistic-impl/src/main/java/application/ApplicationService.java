package application;

import com.google.gson.Gson;
import domain.model.graph.BarGraph;
import domain.model.graph.BarGraphFactory;
import java.io.FileNotFoundException;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;

/**
 * ApplicationService class.
 *
 * @author 09x3086
 */
public class ApplicationService {

  public JFreeChart createBarGraph() throws FileNotFoundException {
    BarGraphFactory barGraphFactory = new BarGraphFactory();
    BarGraph barGraph = barGraphFactory.initializeBarGraph();

    return ChartFactory.createBarChart(barGraph.getGraphTitle().getValue(),
        barGraph.getHorizontalAxisTitle().getValue(),
        barGraph.getHorizontalAxisTitle().getValue(),
        barGraph.getDefaultCategoryDataset(),
        barGraph.getPlotOrientation(),
        true,
        true,
        true);
  }
}
