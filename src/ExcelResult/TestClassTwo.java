package ExcelResult;

import org.apache.commons.lang3.NotImplementedException;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class TestClassTwo {
	 @Test
	    public void testMethodPass()
	    {
	     Assert.assertTrue(true);
	    }
	     
	    @Test
	    public void testMethodFail()
	    {
	      throw new NotImplementedException("Failed Intentionally");
	    }
	     
	    @Test
	    public void testMethodSkip()
	    {
	     throw new SkipException("Skipped Intentionally");
	    }
}
