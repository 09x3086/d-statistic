package domain.model.graph;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;

/**
 * BarGraphFactory class.
 * <p>
 * 棒グラフ
 *
 * </P>
 */
public class BarGraphFactory {

  public BarGraph initializeBarGraph() throws FileNotFoundException {
    Gson gson = new Gson();
    InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(
        "C:\\Data\\Git\\d-statistic\\d-statistic-impl\\src\\main\\resources\\resources_20201129_001.json"));
    JsonReader jsonReader = new JsonReader(inputStreamReader);

    return gson.fromJson(jsonReader, BarGraph.class);
  }
}
