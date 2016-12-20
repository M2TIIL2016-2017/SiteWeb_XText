package org.xtext.example.siteWeb.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;
import org.xtext.example.siteWeb.services.MyDslGrammarAccess;

@SuppressWarnings("all")
public abstract class AbstractMyDslSyntacticSequencer extends AbstractSyntacticSequencer {

	protected MyDslGrammarAccess grammarAccess;
	protected AbstractElementAlias match_Contact_EStringParserRuleCall_6_3_p;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (MyDslGrammarAccess) access;
		match_Contact_EStringParserRuleCall_6_3_p = new TokenAlias(true, false, grammarAccess.getContactAccess().getEStringParserRuleCall_6_3());
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if(ruleCall.getRule() == grammarAccess.getEStringRule())
			return getEStringToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * EString returns ecore::EString:
	 * 	STRING | ID;
	 */
	protected String getEStringToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "\"\"";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_Contact_EStringParserRuleCall_6_3_p.equals(syntax))
				emit_Contact_EStringParserRuleCall_6_3_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     EString+
	 */
	protected void emit_Contact_EStringParserRuleCall_6_3_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
