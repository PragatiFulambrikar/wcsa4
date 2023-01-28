package testNGPack2;

import org.junit.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AlwaysRun {
  @Test
  public void m1() {
	  Assert.fail();
  }
  @Test(dependsOnMethods="m1",alwaysRun=true)
  public void m2()
  {
	Reporter.log("method m2",true);  
  }
  }

