import java.math.BigDecimal;
import java.util.List;
import model.PopulationMean;

/**
 * ApplicationService class.
 *
 * @author 09x3086
 */
public class ApplicationService {

  public void PopulationMean(BigDecimal population, List<BigDecimal> list){
    PopulationMean populationMean = new PopulationMean(population,list);
  }

}
