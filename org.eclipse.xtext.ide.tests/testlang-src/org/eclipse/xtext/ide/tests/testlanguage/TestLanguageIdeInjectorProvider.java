/*******************************************************************************
 * Copyright (c) 2016, 2017 TypeFox GmbH (http://www.typefox.io) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.ide.tests.testlanguage;

import org.eclipse.xtext.ide.tests.testlanguage.ide.TestLanguageIdeModule;
import org.eclipse.xtext.ide.tests.testlanguage.tests.TestLanguageInjectorProvider;
import org.eclipse.xtext.util.Modules2;

import com.google.inject.Guice;
import com.google.inject.Injector;

/**
 * @author Moritz Eysholdt - Initial contribution and API
 */
public class TestLanguageIdeInjectorProvider extends TestLanguageInjectorProvider {
	@Override
	protected Injector internalCreateInjector() {
		return new TestLanguageStandaloneSetup() {
			@Override
			public Injector createInjector() {
				return Guice.createInjector(Modules2.mixin(createRuntimeModule(), new TestLanguageIdeModule()));
			}
		}.createInjectorAndDoEMFRegistration();

	}

}
