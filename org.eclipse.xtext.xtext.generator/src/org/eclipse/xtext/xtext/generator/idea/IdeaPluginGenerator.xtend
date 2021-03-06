/*******************************************************************************
 * Copyright (c) 2015, 2016 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.xtext.generator.idea

import org.eclipse.xtext.xtext.generator.AbstractStubGeneratingFragment

@Deprecated
class IdeaPluginGenerator extends AbstractStubGeneratingFragment {
	

	override generate() {
		if (!projectConfig.ideaPlugin.enabled)
			return;
		System.err.println("The support for Idea has been removed!")
	}
	
}
