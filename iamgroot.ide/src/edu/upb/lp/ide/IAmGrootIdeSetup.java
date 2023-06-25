/*
 * generated by Xtext 2.31.0
 */
package edu.upb.lp.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import edu.upb.lp.IAmGrootRuntimeModule;
import edu.upb.lp.IAmGrootStandaloneSetup;
import org.eclipse.xtext.util.Modules2;

/**
 * Initialization support for running Xtext languages as language servers.
 */
public class IAmGrootIdeSetup extends IAmGrootStandaloneSetup {

	@Override
	public Injector createInjector() {
		return Guice.createInjector(Modules2.mixin(new IAmGrootRuntimeModule(), new IAmGrootIdeModule()));
	}
	
}
