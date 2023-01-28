package testNGParallelExecution;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class testNg2 {
  @Test
  public void m2() {
	  Reporter.log("m2 method",true);
  }
}
