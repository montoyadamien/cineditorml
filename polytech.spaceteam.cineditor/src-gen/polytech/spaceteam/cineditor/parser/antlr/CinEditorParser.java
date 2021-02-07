/*
 * generated by Xtext 2.14.0
 */
package polytech.spaceteam.cineditor.parser.antlr;

import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import polytech.spaceteam.cineditor.parser.antlr.internal.InternalCinEditorParser;
import polytech.spaceteam.cineditor.services.CinEditorGrammarAccess;

public class CinEditorParser extends AbstractAntlrParser {

	@Inject
	private CinEditorGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalCinEditorParser createParser(XtextTokenStream stream) {
		return new InternalCinEditorParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Movie";
	}

	public CinEditorGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(CinEditorGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}