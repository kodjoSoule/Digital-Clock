package ml.digitalClock.runtime;

import ml.digitalClock.Clock.DigitalClock;

public class Application {

	public static void main(String[] args) {
		DigitalClock clock = new DigitalClock();
		clock.start();
		
	}

}
