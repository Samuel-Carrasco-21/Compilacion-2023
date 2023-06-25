/*
 * generated by Xtext 2.31.0
 */
package edu.upb.lp.parser.antlr;

import com.google.inject.Inject;
import edu.upb.lp.parser.antlr.internal.InternalIAmGrootParser;
import edu.upb.lp.services.IAmGrootGrammarAccess;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class IAmGrootParser extends AbstractAntlrParser {

	@Inject
	private IAmGrootGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalIAmGrootParser createParser(XtextTokenStream stream) {
		return new InternalIAmGrootParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Program";
	}

	public IAmGrootGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(IAmGrootGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
