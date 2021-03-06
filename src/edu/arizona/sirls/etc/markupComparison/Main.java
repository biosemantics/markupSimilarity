package edu.arizona.sirls.etc.markupComparison;

import com.google.inject.Guice;
import com.google.inject.Injector;

import edu.arizona.sirls.etc.markupComparison.run.IRun;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Config config = new Config();
		Injector injector = Guice.createInjector(config);
        IRun run = injector.getInstance(IRun.class);
        run.run();
	}

}
