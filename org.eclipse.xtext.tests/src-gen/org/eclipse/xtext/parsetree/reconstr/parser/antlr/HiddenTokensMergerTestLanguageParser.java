/*
 * generated by Xtext
 */
package org.eclipse.xtext.parsetree.reconstr.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parsetree.reconstr.services.HiddenTokensMergerTestLanguageGrammarAccess;

public class HiddenTokensMergerTestLanguageParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private HiddenTokensMergerTestLanguageGrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	
	@Override
	protected org.eclipse.xtext.parsetree.reconstr.parser.antlr.internal.InternalHiddenTokensMergerTestLanguageParser createParser(XtextTokenStream stream) {
		return new org.eclipse.xtext.parsetree.reconstr.parser.antlr.internal.InternalHiddenTokensMergerTestLanguageParser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "Model";
	}
	
	public HiddenTokensMergerTestLanguageGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(HiddenTokensMergerTestLanguageGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}