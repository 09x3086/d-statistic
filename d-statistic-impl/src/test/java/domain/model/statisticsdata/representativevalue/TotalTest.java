package domain.model.statisticsdata.representativevalue;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import java.math.BigDecimal;
import java.util.Arrays;
import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;

/**
 * TotalTest class.
 *
 * @author 13r4123
 */
@RunWith(Enclosed.class)
public class TotalTest {

  /**
   * getTotalValue test.
   */
  public static class GetTotalValueTest {

    @Test
    public void test_getTotalValue_normal() {

      Total sut = new Total(BigDecimal.valueOf(0),
          Arrays.asList(BigDecimal.valueOf(100), BigDecimal.valueOf(100), BigDecimal.valueOf(100)));

      BigDecimal actual = sut.getTotalValue();

      assertThat(actual, is(BigDecimal.valueOf(300)));
    }
  }
}