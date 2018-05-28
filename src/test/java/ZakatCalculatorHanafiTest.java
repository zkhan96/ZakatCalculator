import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ZakatCalculatorHanafiTest {

  @Test
  public void testGutterZakat() {
    String[] args = new String[0];
    ZakatCalculator zakatCalculator = new ZakatCalculatorHanafi();
    double result = zakatCalculator.calculatePayableZakat(args);

    assertEquals(0, result, 0.1);
  }
}
