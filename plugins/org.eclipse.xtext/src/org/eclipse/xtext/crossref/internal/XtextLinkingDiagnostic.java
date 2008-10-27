/*******************************************************************************
 * Copyright (c) 2008 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.crossref.internal;

import org.eclipse.xtext.parsetree.LeafNode;
import org.eclipse.xtext.resource.XtextResource;

/**
 * @author Heiko Behrens - Initial contribution and API
 */
public class XtextLinkingDiagnostic implements XtextResource.Diagnostic{

	private final LeafNode node;

	public XtextLinkingDiagnostic(LeafNode linkInformation) {
		node = linkInformation;
	}

	public int getLength() {
		return node.getLength();
	}

	public int getOffset() {
		return node.getOffset();
	}

	public int getColumn() {
		return 1;
	}

	public int getLine() {
		return node.getLine();
	}

	public String getLocation() {
		return null;
	}

	public String getMessage() {
		return "Cannot resolve reference " + node.getText();
	}

}
