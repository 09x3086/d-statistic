package domain.model.statisticsdata.representativevalue;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import domain.model.Population;
import java.math.BigDecimal;
import java.util.Arrays;
import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;

/**
 * AverageValueTest class.
 *
 * @author 13r4123
 */
@RunWith(Enclosed.class)
public class AverageValueTest {

  /**
   * getAverageValue test.
   */
  public static class GetAverageValueTest {

    @Test
    public void test_getAverageValue_normal() {

      Population population = new Population(BigDecimal.valueOf(2));

      Total total = new Total(BigDecimal.ZERO,
          Arrays.asList(BigDecimal.valueOf(100), BigDecimal.valueOf(100), BigDecimal.valueOf(100)));

      AverageValue sut = new AverageValue(population, total);

      BigDecimal actual = sut.getAverageValue();

      assertThat(actual,is(BigDecimal.valueOf(150)));
    }
  }
}