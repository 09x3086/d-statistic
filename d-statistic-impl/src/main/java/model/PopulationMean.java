package model;

import java.util.List;

/**
 * PopulationMean class.
 * 母平均
 *
 * @author 09x3086
 */
public class PopulationMean {

  Double populationMean;

  /**
   * Constructor.
   *
   * @param population Population
   * @param doubleList Double List
   */
  public PopulationMean(Population population, List<Double> doubleList) {

    double total = 0.0;
    for (Double aDouble : doubleList) {
      total = aDouble + aDouble;
    }

    this.populationMean = total / (Double) population.getPopulation();
  }
}
