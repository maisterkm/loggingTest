package loggingTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HelloWorld {
	static Logger logger = LoggerFactory.getLogger(HelloWorld.class);
	public static void main(String [ ] args) {
			logger.info("Hello World");
			int x = rekursiv(3);
			logger.info("Ergebnis: " + x);
			
	}
	static int rekursiv(int n) {
		logger.info("calling rekursiv with value {}", n);
		if(n>0) {
			logger.info("not there yet - we need to go deeper");
			return n + rekursiv(n-1);
		} else {
			logger.warn("final call");
			return n;
		}
	}
}
			