package testNGParallelExecution;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class testNg4 {
  @Test
  public void today() {
	  long threadId = Thread.currentThread().getId();
	  Reporter.log("today method"+threadId+" is the thread",true);
  }
  
  @Test
  public void tomorrow()
  {
	  long threadId = Thread.currentThread().getId();
	  Reporter.log("today method"+threadId+" is the thread",true);	  
  }
}
