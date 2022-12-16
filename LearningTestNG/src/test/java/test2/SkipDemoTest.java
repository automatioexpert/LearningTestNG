package test2;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class SkipDemoTest {
	
	@Test
	public void isSkip() {
		//Dead code
		if(true) {
			throw new SkipException("Skipping this test as data is not ready");
			
		}
		
	
	}

	
}
