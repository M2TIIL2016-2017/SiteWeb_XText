package org.xtext.example.mydsl.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'E'", "'e'", "'PagePrincipale'", "'{'", "'contacts'", "'}'", "'configurationPage'", "'pages'", "','", "'rubriques'", "'fichiers'", "'Contact'", "'nom'", "'prenom'", "'adresse'", "'mail'", "'telephone'", "'Rubriques'", "'texte'", "'lien'", "'Fichiers'", "'type'", "'taille'", "'emplacement'", "'ConfigurationPage'", "'couleurFond'", "'titreSite'", "'auteurs'", "'couleurPolice'", "'taillePolice'", "'PageInterne'", "'photo'", "'titrePage'", "'types'", "'liens'", "'-'", "'Types'", "'Liens'", "'fichier'", "'adresseWeb'", "'pageInterne'", "'Photo'", "'extension'", "'.'", "'gras'", "'italique'"
    };
    public static final int RULE_ID=5;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int EOF=-1;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__19=19;
    public static final int T__51=51;
    public static final int T__16=16;
    public static final int T__52=52;
    public static final int T__15=15;
    public static final int T__53=53;
    public static final int T__18=18;
    public static final int T__54=54;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=6;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_STRING=4;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=9;

    // delegates
    // delegators


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g"; }


     
     	private MyDslGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRulePagePrincipale"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:60:1: entryRulePagePrincipale : rulePagePrincipale EOF ;
    public final void entryRulePagePrincipale() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:61:1: ( rulePagePrincipale EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:62:1: rulePagePrincipale EOF
            {
             before(grammarAccess.getPagePrincipaleRule()); 
            pushFollow(FollowSets000.FOLLOW_rulePagePrincipale_in_entryRulePagePrincipale61);
            rulePagePrincipale();

            state._fsp--;

             after(grammarAccess.getPagePrincipaleRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePagePrincipale68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePagePrincipale"


    // $ANTLR start "rulePagePrincipale"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:69:1: rulePagePrincipale : ( ( rule__PagePrincipale__Group__0 ) ) ;
    public final void rulePagePrincipale() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:73:2: ( ( ( rule__PagePrincipale__Group__0 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:74:1: ( ( rule__PagePrincipale__Group__0 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:74:1: ( ( rule__PagePrincipale__Group__0 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:75:1: ( rule__PagePrincipale__Group__0 )
            {
             before(grammarAccess.getPagePrincipaleAccess().getGroup()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:76:1: ( rule__PagePrincipale__Group__0 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:76:2: rule__PagePrincipale__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__PagePrincipale__Group__0_in_rulePagePrincipale94);
            rule__PagePrincipale__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPagePrincipaleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePagePrincipale"


    // $ANTLR start "entryRuleContact"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:88:1: entryRuleContact : ruleContact EOF ;
    public final void entryRuleContact() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:89:1: ( ruleContact EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:90:1: ruleContact EOF
            {
             before(grammarAccess.getContactRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleContact_in_entryRuleContact121);
            ruleContact();

            state._fsp--;

             after(grammarAccess.getContactRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleContact128); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleContact"


    // $ANTLR start "ruleContact"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:97:1: ruleContact : ( ( rule__Contact__Group__0 ) ) ;
    public final void ruleContact() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:101:2: ( ( ( rule__Contact__Group__0 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:102:1: ( ( rule__Contact__Group__0 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:102:1: ( ( rule__Contact__Group__0 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:103:1: ( rule__Contact__Group__0 )
            {
             before(grammarAccess.getContactAccess().getGroup()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:104:1: ( rule__Contact__Group__0 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:104:2: rule__Contact__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Contact__Group__0_in_ruleContact154);
            rule__Contact__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getContactAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleContact"


    // $ANTLR start "entryRuleRubriques"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:116:1: entryRuleRubriques : ruleRubriques EOF ;
    public final void entryRuleRubriques() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:117:1: ( ruleRubriques EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:118:1: ruleRubriques EOF
            {
             before(grammarAccess.getRubriquesRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRubriques_in_entryRuleRubriques181);
            ruleRubriques();

            state._fsp--;

             after(grammarAccess.getRubriquesRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRubriques188); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRubriques"


    // $ANTLR start "ruleRubriques"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:125:1: ruleRubriques : ( ( rule__Rubriques__Group__0 ) ) ;
    public final void ruleRubriques() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:129:2: ( ( ( rule__Rubriques__Group__0 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:130:1: ( ( rule__Rubriques__Group__0 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:130:1: ( ( rule__Rubriques__Group__0 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:131:1: ( rule__Rubriques__Group__0 )
            {
             before(grammarAccess.getRubriquesAccess().getGroup()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:132:1: ( rule__Rubriques__Group__0 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:132:2: rule__Rubriques__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Rubriques__Group__0_in_ruleRubriques214);
            rule__Rubriques__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRubriquesAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRubriques"


    // $ANTLR start "entryRuleFichiers"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:144:1: entryRuleFichiers : ruleFichiers EOF ;
    public final void entryRuleFichiers() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:145:1: ( ruleFichiers EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:146:1: ruleFichiers EOF
            {
             before(grammarAccess.getFichiersRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleFichiers_in_entryRuleFichiers241);
            ruleFichiers();

            state._fsp--;

             after(grammarAccess.getFichiersRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFichiers248); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFichiers"


    // $ANTLR start "ruleFichiers"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:153:1: ruleFichiers : ( ( rule__Fichiers__Group__0 ) ) ;
    public final void ruleFichiers() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:157:2: ( ( ( rule__Fichiers__Group__0 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:158:1: ( ( rule__Fichiers__Group__0 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:158:1: ( ( rule__Fichiers__Group__0 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:159:1: ( rule__Fichiers__Group__0 )
            {
             before(grammarAccess.getFichiersAccess().getGroup()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:160:1: ( rule__Fichiers__Group__0 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:160:2: rule__Fichiers__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Fichiers__Group__0_in_ruleFichiers274);
            rule__Fichiers__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFichiersAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFichiers"


    // $ANTLR start "entryRuleConfigurationPage"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:172:1: entryRuleConfigurationPage : ruleConfigurationPage EOF ;
    public final void entryRuleConfigurationPage() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:173:1: ( ruleConfigurationPage EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:174:1: ruleConfigurationPage EOF
            {
             before(grammarAccess.getConfigurationPageRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleConfigurationPage_in_entryRuleConfigurationPage301);
            ruleConfigurationPage();

            state._fsp--;

             after(grammarAccess.getConfigurationPageRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleConfigurationPage308); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleConfigurationPage"


    // $ANTLR start "ruleConfigurationPage"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:181:1: ruleConfigurationPage : ( ( rule__ConfigurationPage__Group__0 ) ) ;
    public final void ruleConfigurationPage() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:185:2: ( ( ( rule__ConfigurationPage__Group__0 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:186:1: ( ( rule__ConfigurationPage__Group__0 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:186:1: ( ( rule__ConfigurationPage__Group__0 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:187:1: ( rule__ConfigurationPage__Group__0 )
            {
             before(grammarAccess.getConfigurationPageAccess().getGroup()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:188:1: ( rule__ConfigurationPage__Group__0 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:188:2: rule__ConfigurationPage__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConfigurationPage__Group__0_in_ruleConfigurationPage334);
            rule__ConfigurationPage__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConfigurationPageAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConfigurationPage"


    // $ANTLR start "entryRulePageInterne"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:200:1: entryRulePageInterne : rulePageInterne EOF ;
    public final void entryRulePageInterne() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:201:1: ( rulePageInterne EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:202:1: rulePageInterne EOF
            {
             before(grammarAccess.getPageInterneRule()); 
            pushFollow(FollowSets000.FOLLOW_rulePageInterne_in_entryRulePageInterne361);
            rulePageInterne();

            state._fsp--;

             after(grammarAccess.getPageInterneRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePageInterne368); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePageInterne"


    // $ANTLR start "rulePageInterne"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:209:1: rulePageInterne : ( ( rule__PageInterne__Group__0 ) ) ;
    public final void rulePageInterne() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:213:2: ( ( ( rule__PageInterne__Group__0 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:214:1: ( ( rule__PageInterne__Group__0 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:214:1: ( ( rule__PageInterne__Group__0 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:215:1: ( rule__PageInterne__Group__0 )
            {
             before(grammarAccess.getPageInterneAccess().getGroup()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:216:1: ( rule__PageInterne__Group__0 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:216:2: rule__PageInterne__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__PageInterne__Group__0_in_rulePageInterne394);
            rule__PageInterne__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPageInterneAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePageInterne"


    // $ANTLR start "entryRuleEString"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:228:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:229:1: ( ruleEString EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:230:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString421);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString428); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:237:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:241:2: ( ( ( rule__EString__Alternatives ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:242:1: ( ( rule__EString__Alternatives ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:242:1: ( ( rule__EString__Alternatives ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:243:1: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:244:1: ( rule__EString__Alternatives )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:244:2: rule__EString__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__EString__Alternatives_in_ruleEString454);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleEInt"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:256:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:257:1: ( ruleEInt EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:258:1: ruleEInt EOF
            {
             before(grammarAccess.getEIntRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_entryRuleEInt481);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getEIntRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEInt488); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:265:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:269:2: ( ( ( rule__EInt__Group__0 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:270:1: ( ( rule__EInt__Group__0 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:270:1: ( ( rule__EInt__Group__0 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:271:1: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:272:1: ( rule__EInt__Group__0 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:272:2: rule__EInt__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__0_in_ruleEInt514);
            rule__EInt__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEIntAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleTypes"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:284:1: entryRuleTypes : ruleTypes EOF ;
    public final void entryRuleTypes() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:285:1: ( ruleTypes EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:286:1: ruleTypes EOF
            {
             before(grammarAccess.getTypesRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTypes_in_entryRuleTypes541);
            ruleTypes();

            state._fsp--;

             after(grammarAccess.getTypesRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTypes548); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTypes"


    // $ANTLR start "ruleTypes"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:293:1: ruleTypes : ( ( rule__Types__Group__0 ) ) ;
    public final void ruleTypes() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:297:2: ( ( ( rule__Types__Group__0 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:298:1: ( ( rule__Types__Group__0 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:298:1: ( ( rule__Types__Group__0 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:299:1: ( rule__Types__Group__0 )
            {
             before(grammarAccess.getTypesAccess().getGroup()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:300:1: ( rule__Types__Group__0 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:300:2: rule__Types__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Types__Group__0_in_ruleTypes574);
            rule__Types__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTypesAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTypes"


    // $ANTLR start "entryRuleLiens"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:312:1: entryRuleLiens : ruleLiens EOF ;
    public final void entryRuleLiens() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:313:1: ( ruleLiens EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:314:1: ruleLiens EOF
            {
             before(grammarAccess.getLiensRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleLiens_in_entryRuleLiens601);
            ruleLiens();

            state._fsp--;

             after(grammarAccess.getLiensRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLiens608); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLiens"


    // $ANTLR start "ruleLiens"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:321:1: ruleLiens : ( ( rule__Liens__Group__0 ) ) ;
    public final void ruleLiens() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:325:2: ( ( ( rule__Liens__Group__0 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:326:1: ( ( rule__Liens__Group__0 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:326:1: ( ( rule__Liens__Group__0 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:327:1: ( rule__Liens__Group__0 )
            {
             before(grammarAccess.getLiensAccess().getGroup()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:328:1: ( rule__Liens__Group__0 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:328:2: rule__Liens__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Liens__Group__0_in_ruleLiens634);
            rule__Liens__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLiensAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLiens"


    // $ANTLR start "entryRulePhoto"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:340:1: entryRulePhoto : rulePhoto EOF ;
    public final void entryRulePhoto() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:341:1: ( rulePhoto EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:342:1: rulePhoto EOF
            {
             before(grammarAccess.getPhotoRule()); 
            pushFollow(FollowSets000.FOLLOW_rulePhoto_in_entryRulePhoto661);
            rulePhoto();

            state._fsp--;

             after(grammarAccess.getPhotoRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePhoto668); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePhoto"


    // $ANTLR start "rulePhoto"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:349:1: rulePhoto : ( ( rule__Photo__Group__0 ) ) ;
    public final void rulePhoto() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:353:2: ( ( ( rule__Photo__Group__0 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:354:1: ( ( rule__Photo__Group__0 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:354:1: ( ( rule__Photo__Group__0 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:355:1: ( rule__Photo__Group__0 )
            {
             before(grammarAccess.getPhotoAccess().getGroup()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:356:1: ( rule__Photo__Group__0 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:356:2: rule__Photo__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Photo__Group__0_in_rulePhoto694);
            rule__Photo__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPhotoAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePhoto"


    // $ANTLR start "entryRuleEFloat"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:370:1: entryRuleEFloat : ruleEFloat EOF ;
    public final void entryRuleEFloat() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:371:1: ( ruleEFloat EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:372:1: ruleEFloat EOF
            {
             before(grammarAccess.getEFloatRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEFloat_in_entryRuleEFloat723);
            ruleEFloat();

            state._fsp--;

             after(grammarAccess.getEFloatRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEFloat730); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEFloat"


    // $ANTLR start "ruleEFloat"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:379:1: ruleEFloat : ( ( rule__EFloat__Group__0 ) ) ;
    public final void ruleEFloat() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:383:2: ( ( ( rule__EFloat__Group__0 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:384:1: ( ( rule__EFloat__Group__0 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:384:1: ( ( rule__EFloat__Group__0 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:385:1: ( rule__EFloat__Group__0 )
            {
             before(grammarAccess.getEFloatAccess().getGroup()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:386:1: ( rule__EFloat__Group__0 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:386:2: rule__EFloat__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__EFloat__Group__0_in_ruleEFloat756);
            rule__EFloat__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEFloatAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEFloat"


    // $ANTLR start "rule__EString__Alternatives"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:398:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:402:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_STRING) ) {
                alt1=1;
            }
            else if ( (LA1_0==RULE_ID) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:403:1: ( RULE_STRING )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:403:1: ( RULE_STRING )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:404:1: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__EString__Alternatives792); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:409:6: ( RULE_ID )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:409:6: ( RULE_ID )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:410:1: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__EString__Alternatives809); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__EFloat__Alternatives_4_0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:421:1: rule__EFloat__Alternatives_4_0 : ( ( 'E' ) | ( 'e' ) );
    public final void rule__EFloat__Alternatives_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:425:1: ( ( 'E' ) | ( 'e' ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            else if ( (LA2_0==12) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:426:1: ( 'E' )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:426:1: ( 'E' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:427:1: 'E'
                    {
                     before(grammarAccess.getEFloatAccess().getEKeyword_4_0_0()); 
                    match(input,11,FollowSets000.FOLLOW_11_in_rule__EFloat__Alternatives_4_0843); 
                     after(grammarAccess.getEFloatAccess().getEKeyword_4_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:434:6: ( 'e' )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:434:6: ( 'e' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:435:1: 'e'
                    {
                     before(grammarAccess.getEFloatAccess().getEKeyword_4_0_1()); 
                    match(input,12,FollowSets000.FOLLOW_12_in_rule__EFloat__Alternatives_4_0863); 
                     after(grammarAccess.getEFloatAccess().getEKeyword_4_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Alternatives_4_0"


    // $ANTLR start "rule__PagePrincipale__Group__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:449:1: rule__PagePrincipale__Group__0 : rule__PagePrincipale__Group__0__Impl rule__PagePrincipale__Group__1 ;
    public final void rule__PagePrincipale__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:453:1: ( rule__PagePrincipale__Group__0__Impl rule__PagePrincipale__Group__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:454:2: rule__PagePrincipale__Group__0__Impl rule__PagePrincipale__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__PagePrincipale__Group__0__Impl_in_rule__PagePrincipale__Group__0895);
            rule__PagePrincipale__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PagePrincipale__Group__1_in_rule__PagePrincipale__Group__0898);
            rule__PagePrincipale__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PagePrincipale__Group__0"


    // $ANTLR start "rule__PagePrincipale__Group__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:461:1: rule__PagePrincipale__Group__0__Impl : ( 'PagePrincipale' ) ;
    public final void rule__PagePrincipale__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:465:1: ( ( 'PagePrincipale' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:466:1: ( 'PagePrincipale' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:466:1: ( 'PagePrincipale' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:467:1: 'PagePrincipale'
            {
             before(grammarAccess.getPagePrincipaleAccess().getPagePrincipaleKeyword_0()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__PagePrincipale__Group__0__Impl926); 
             after(grammarAccess.getPagePrincipaleAccess().getPagePrincipaleKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PagePrincipale__Group__0__Impl"


    // $ANTLR start "rule__PagePrincipale__Group__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:480:1: rule__PagePrincipale__Group__1 : rule__PagePrincipale__Group__1__Impl rule__PagePrincipale__Group__2 ;
    public final void rule__PagePrincipale__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:484:1: ( rule__PagePrincipale__Group__1__Impl rule__PagePrincipale__Group__2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:485:2: rule__PagePrincipale__Group__1__Impl rule__PagePrincipale__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__PagePrincipale__Group__1__Impl_in_rule__PagePrincipale__Group__1957);
            rule__PagePrincipale__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PagePrincipale__Group__2_in_rule__PagePrincipale__Group__1960);
            rule__PagePrincipale__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PagePrincipale__Group__1"


    // $ANTLR start "rule__PagePrincipale__Group__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:492:1: rule__PagePrincipale__Group__1__Impl : ( '{' ) ;
    public final void rule__PagePrincipale__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:496:1: ( ( '{' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:497:1: ( '{' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:497:1: ( '{' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:498:1: '{'
            {
             before(grammarAccess.getPagePrincipaleAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__PagePrincipale__Group__1__Impl988); 
             after(grammarAccess.getPagePrincipaleAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PagePrincipale__Group__1__Impl"


    // $ANTLR start "rule__PagePrincipale__Group__2"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:511:1: rule__PagePrincipale__Group__2 : rule__PagePrincipale__Group__2__Impl rule__PagePrincipale__Group__3 ;
    public final void rule__PagePrincipale__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:515:1: ( rule__PagePrincipale__Group__2__Impl rule__PagePrincipale__Group__3 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:516:2: rule__PagePrincipale__Group__2__Impl rule__PagePrincipale__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__PagePrincipale__Group__2__Impl_in_rule__PagePrincipale__Group__21019);
            rule__PagePrincipale__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PagePrincipale__Group__3_in_rule__PagePrincipale__Group__21022);
            rule__PagePrincipale__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PagePrincipale__Group__2"


    // $ANTLR start "rule__PagePrincipale__Group__2__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:523:1: rule__PagePrincipale__Group__2__Impl : ( 'contacts' ) ;
    public final void rule__PagePrincipale__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:527:1: ( ( 'contacts' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:528:1: ( 'contacts' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:528:1: ( 'contacts' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:529:1: 'contacts'
            {
             before(grammarAccess.getPagePrincipaleAccess().getContactsKeyword_2()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__PagePrincipale__Group__2__Impl1050); 
             after(grammarAccess.getPagePrincipaleAccess().getContactsKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PagePrincipale__Group__2__Impl"


    // $ANTLR start "rule__PagePrincipale__Group__3"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:542:1: rule__PagePrincipale__Group__3 : rule__PagePrincipale__Group__3__Impl rule__PagePrincipale__Group__4 ;
    public final void rule__PagePrincipale__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:546:1: ( rule__PagePrincipale__Group__3__Impl rule__PagePrincipale__Group__4 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:547:2: rule__PagePrincipale__Group__3__Impl rule__PagePrincipale__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__PagePrincipale__Group__3__Impl_in_rule__PagePrincipale__Group__31081);
            rule__PagePrincipale__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PagePrincipale__Group__4_in_rule__PagePrincipale__Group__31084);
            rule__PagePrincipale__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PagePrincipale__Group__3"


    // $ANTLR start "rule__PagePrincipale__Group__3__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:554:1: rule__PagePrincipale__Group__3__Impl : ( '{' ) ;
    public final void rule__PagePrincipale__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:558:1: ( ( '{' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:559:1: ( '{' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:559:1: ( '{' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:560:1: '{'
            {
             before(grammarAccess.getPagePrincipaleAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__PagePrincipale__Group__3__Impl1112); 
             after(grammarAccess.getPagePrincipaleAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PagePrincipale__Group__3__Impl"


    // $ANTLR start "rule__PagePrincipale__Group__4"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:573:1: rule__PagePrincipale__Group__4 : rule__PagePrincipale__Group__4__Impl rule__PagePrincipale__Group__5 ;
    public final void rule__PagePrincipale__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:577:1: ( rule__PagePrincipale__Group__4__Impl rule__PagePrincipale__Group__5 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:578:2: rule__PagePrincipale__Group__4__Impl rule__PagePrincipale__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__PagePrincipale__Group__4__Impl_in_rule__PagePrincipale__Group__41143);
            rule__PagePrincipale__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PagePrincipale__Group__5_in_rule__PagePrincipale__Group__41146);
            rule__PagePrincipale__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PagePrincipale__Group__4"


    // $ANTLR start "rule__PagePrincipale__Group__4__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:585:1: rule__PagePrincipale__Group__4__Impl : ( ( rule__PagePrincipale__ContactsAssignment_4 ) ) ;
    public final void rule__PagePrincipale__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:589:1: ( ( ( rule__PagePrincipale__ContactsAssignment_4 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:590:1: ( ( rule__PagePrincipale__ContactsAssignment_4 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:590:1: ( ( rule__PagePrincipale__ContactsAssignment_4 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:591:1: ( rule__PagePrincipale__ContactsAssignment_4 )
            {
             before(grammarAccess.getPagePrincipaleAccess().getContactsAssignment_4()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:592:1: ( rule__PagePrincipale__ContactsAssignment_4 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:592:2: rule__PagePrincipale__ContactsAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__PagePrincipale__ContactsAssignment_4_in_rule__PagePrincipale__Group__4__Impl1173);
            rule__PagePrincipale__ContactsAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getPagePrincipaleAccess().getContactsAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PagePrincipale__Group__4__Impl"


    // $ANTLR start "rule__PagePrincipale__Group__5"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:602:1: rule__PagePrincipale__Group__5 : rule__PagePrincipale__Group__5__Impl rule__PagePrincipale__Group__6 ;
    public final void rule__PagePrincipale__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:606:1: ( rule__PagePrincipale__Group__5__Impl rule__PagePrincipale__Group__6 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:607:2: rule__PagePrincipale__Group__5__Impl rule__PagePrincipale__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__PagePrincipale__Group__5__Impl_in_rule__PagePrincipale__Group__51203);
            rule__PagePrincipale__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PagePrincipale__Group__6_in_rule__PagePrincipale__Group__51206);
            rule__PagePrincipale__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PagePrincipale__Group__5"


    // $ANTLR start "rule__PagePrincipale__Group__5__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:614:1: rule__PagePrincipale__Group__5__Impl : ( ( rule__PagePrincipale__Group_5__0 )* ) ;
    public final void rule__PagePrincipale__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:618:1: ( ( ( rule__PagePrincipale__Group_5__0 )* ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:619:1: ( ( rule__PagePrincipale__Group_5__0 )* )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:619:1: ( ( rule__PagePrincipale__Group_5__0 )* )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:620:1: ( rule__PagePrincipale__Group_5__0 )*
            {
             before(grammarAccess.getPagePrincipaleAccess().getGroup_5()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:621:1: ( rule__PagePrincipale__Group_5__0 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==19) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:621:2: rule__PagePrincipale__Group_5__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__PagePrincipale__Group_5__0_in_rule__PagePrincipale__Group__5__Impl1233);
            	    rule__PagePrincipale__Group_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getPagePrincipaleAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PagePrincipale__Group__5__Impl"


    // $ANTLR start "rule__PagePrincipale__Group__6"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:631:1: rule__PagePrincipale__Group__6 : rule__PagePrincipale__Group__6__Impl rule__PagePrincipale__Group__7 ;
    public final void rule__PagePrincipale__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:635:1: ( rule__PagePrincipale__Group__6__Impl rule__PagePrincipale__Group__7 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:636:2: rule__PagePrincipale__Group__6__Impl rule__PagePrincipale__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__PagePrincipale__Group__6__Impl_in_rule__PagePrincipale__Group__61264);
            rule__PagePrincipale__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PagePrincipale__Group__7_in_rule__PagePrincipale__Group__61267);
            rule__PagePrincipale__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PagePrincipale__Group__6"


    // $ANTLR start "rule__PagePrincipale__Group__6__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:643:1: rule__PagePrincipale__Group__6__Impl : ( '}' ) ;
    public final void rule__PagePrincipale__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:647:1: ( ( '}' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:648:1: ( '}' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:648:1: ( '}' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:649:1: '}'
            {
             before(grammarAccess.getPagePrincipaleAccess().getRightCurlyBracketKeyword_6()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__PagePrincipale__Group__6__Impl1295); 
             after(grammarAccess.getPagePrincipaleAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PagePrincipale__Group__6__Impl"


    // $ANTLR start "rule__PagePrincipale__Group__7"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:662:1: rule__PagePrincipale__Group__7 : rule__PagePrincipale__Group__7__Impl rule__PagePrincipale__Group__8 ;
    public final void rule__PagePrincipale__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:666:1: ( rule__PagePrincipale__Group__7__Impl rule__PagePrincipale__Group__8 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:667:2: rule__PagePrincipale__Group__7__Impl rule__PagePrincipale__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__PagePrincipale__Group__7__Impl_in_rule__PagePrincipale__Group__71326);
            rule__PagePrincipale__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PagePrincipale__Group__8_in_rule__PagePrincipale__Group__71329);
            rule__PagePrincipale__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PagePrincipale__Group__7"


    // $ANTLR start "rule__PagePrincipale__Group__7__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:674:1: rule__PagePrincipale__Group__7__Impl : ( ( rule__PagePrincipale__Group_7__0 )? ) ;
    public final void rule__PagePrincipale__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:678:1: ( ( ( rule__PagePrincipale__Group_7__0 )? ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:679:1: ( ( rule__PagePrincipale__Group_7__0 )? )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:679:1: ( ( rule__PagePrincipale__Group_7__0 )? )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:680:1: ( rule__PagePrincipale__Group_7__0 )?
            {
             before(grammarAccess.getPagePrincipaleAccess().getGroup_7()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:681:1: ( rule__PagePrincipale__Group_7__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==20) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:681:2: rule__PagePrincipale__Group_7__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__PagePrincipale__Group_7__0_in_rule__PagePrincipale__Group__7__Impl1356);
                    rule__PagePrincipale__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPagePrincipaleAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PagePrincipale__Group__7__Impl"


    // $ANTLR start "rule__PagePrincipale__Group__8"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:691:1: rule__PagePrincipale__Group__8 : rule__PagePrincipale__Group__8__Impl rule__PagePrincipale__Group__9 ;
    public final void rule__PagePrincipale__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:695:1: ( rule__PagePrincipale__Group__8__Impl rule__PagePrincipale__Group__9 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:696:2: rule__PagePrincipale__Group__8__Impl rule__PagePrincipale__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_rule__PagePrincipale__Group__8__Impl_in_rule__PagePrincipale__Group__81387);
            rule__PagePrincipale__Group__8__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PagePrincipale__Group__9_in_rule__PagePrincipale__Group__81390);
            rule__PagePrincipale__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PagePrincipale__Group__8"


    // $ANTLR start "rule__PagePrincipale__Group__8__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:703:1: rule__PagePrincipale__Group__8__Impl : ( ( rule__PagePrincipale__Group_8__0 )? ) ;
    public final void rule__PagePrincipale__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:707:1: ( ( ( rule__PagePrincipale__Group_8__0 )? ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:708:1: ( ( rule__PagePrincipale__Group_8__0 )? )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:708:1: ( ( rule__PagePrincipale__Group_8__0 )? )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:709:1: ( rule__PagePrincipale__Group_8__0 )?
            {
             before(grammarAccess.getPagePrincipaleAccess().getGroup_8()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:710:1: ( rule__PagePrincipale__Group_8__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==21) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:710:2: rule__PagePrincipale__Group_8__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__PagePrincipale__Group_8__0_in_rule__PagePrincipale__Group__8__Impl1417);
                    rule__PagePrincipale__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPagePrincipaleAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PagePrincipale__Group__8__Impl"


    // $ANTLR start "rule__PagePrincipale__Group__9"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:720:1: rule__PagePrincipale__Group__9 : rule__PagePrincipale__Group__9__Impl rule__PagePrincipale__Group__10 ;
    public final void rule__PagePrincipale__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:724:1: ( rule__PagePrincipale__Group__9__Impl rule__PagePrincipale__Group__10 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:725:2: rule__PagePrincipale__Group__9__Impl rule__PagePrincipale__Group__10
            {
            pushFollow(FollowSets000.FOLLOW_rule__PagePrincipale__Group__9__Impl_in_rule__PagePrincipale__Group__91448);
            rule__PagePrincipale__Group__9__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PagePrincipale__Group__10_in_rule__PagePrincipale__Group__91451);
            rule__PagePrincipale__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PagePrincipale__Group__9"


    // $ANTLR start "rule__PagePrincipale__Group__9__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:732:1: rule__PagePrincipale__Group__9__Impl : ( 'configurationPage' ) ;
    public final void rule__PagePrincipale__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:736:1: ( ( 'configurationPage' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:737:1: ( 'configurationPage' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:737:1: ( 'configurationPage' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:738:1: 'configurationPage'
            {
             before(grammarAccess.getPagePrincipaleAccess().getConfigurationPageKeyword_9()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__PagePrincipale__Group__9__Impl1479); 
             after(grammarAccess.getPagePrincipaleAccess().getConfigurationPageKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PagePrincipale__Group__9__Impl"


    // $ANTLR start "rule__PagePrincipale__Group__10"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:751:1: rule__PagePrincipale__Group__10 : rule__PagePrincipale__Group__10__Impl rule__PagePrincipale__Group__11 ;
    public final void rule__PagePrincipale__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:755:1: ( rule__PagePrincipale__Group__10__Impl rule__PagePrincipale__Group__11 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:756:2: rule__PagePrincipale__Group__10__Impl rule__PagePrincipale__Group__11
            {
            pushFollow(FollowSets000.FOLLOW_rule__PagePrincipale__Group__10__Impl_in_rule__PagePrincipale__Group__101510);
            rule__PagePrincipale__Group__10__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PagePrincipale__Group__11_in_rule__PagePrincipale__Group__101513);
            rule__PagePrincipale__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PagePrincipale__Group__10"


    // $ANTLR start "rule__PagePrincipale__Group__10__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:763:1: rule__PagePrincipale__Group__10__Impl : ( ( rule__PagePrincipale__ConfigurationPageAssignment_10 ) ) ;
    public final void rule__PagePrincipale__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:767:1: ( ( ( rule__PagePrincipale__ConfigurationPageAssignment_10 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:768:1: ( ( rule__PagePrincipale__ConfigurationPageAssignment_10 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:768:1: ( ( rule__PagePrincipale__ConfigurationPageAssignment_10 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:769:1: ( rule__PagePrincipale__ConfigurationPageAssignment_10 )
            {
             before(grammarAccess.getPagePrincipaleAccess().getConfigurationPageAssignment_10()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:770:1: ( rule__PagePrincipale__ConfigurationPageAssignment_10 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:770:2: rule__PagePrincipale__ConfigurationPageAssignment_10
            {
            pushFollow(FollowSets000.FOLLOW_rule__PagePrincipale__ConfigurationPageAssignment_10_in_rule__PagePrincipale__Group__10__Impl1540);
            rule__PagePrincipale__ConfigurationPageAssignment_10();

            state._fsp--;


            }

             after(grammarAccess.getPagePrincipaleAccess().getConfigurationPageAssignment_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PagePrincipale__Group__10__Impl"


    // $ANTLR start "rule__PagePrincipale__Group__11"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:780:1: rule__PagePrincipale__Group__11 : rule__PagePrincipale__Group__11__Impl rule__PagePrincipale__Group__12 ;
    public final void rule__PagePrincipale__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:784:1: ( rule__PagePrincipale__Group__11__Impl rule__PagePrincipale__Group__12 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:785:2: rule__PagePrincipale__Group__11__Impl rule__PagePrincipale__Group__12
            {
            pushFollow(FollowSets000.FOLLOW_rule__PagePrincipale__Group__11__Impl_in_rule__PagePrincipale__Group__111570);
            rule__PagePrincipale__Group__11__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PagePrincipale__Group__12_in_rule__PagePrincipale__Group__111573);
            rule__PagePrincipale__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PagePrincipale__Group__11"


    // $ANTLR start "rule__PagePrincipale__Group__11__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:792:1: rule__PagePrincipale__Group__11__Impl : ( 'pages' ) ;
    public final void rule__PagePrincipale__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:796:1: ( ( 'pages' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:797:1: ( 'pages' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:797:1: ( 'pages' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:798:1: 'pages'
            {
             before(grammarAccess.getPagePrincipaleAccess().getPagesKeyword_11()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__PagePrincipale__Group__11__Impl1601); 
             after(grammarAccess.getPagePrincipaleAccess().getPagesKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PagePrincipale__Group__11__Impl"


    // $ANTLR start "rule__PagePrincipale__Group__12"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:811:1: rule__PagePrincipale__Group__12 : rule__PagePrincipale__Group__12__Impl rule__PagePrincipale__Group__13 ;
    public final void rule__PagePrincipale__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:815:1: ( rule__PagePrincipale__Group__12__Impl rule__PagePrincipale__Group__13 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:816:2: rule__PagePrincipale__Group__12__Impl rule__PagePrincipale__Group__13
            {
            pushFollow(FollowSets000.FOLLOW_rule__PagePrincipale__Group__12__Impl_in_rule__PagePrincipale__Group__121632);
            rule__PagePrincipale__Group__12__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PagePrincipale__Group__13_in_rule__PagePrincipale__Group__121635);
            rule__PagePrincipale__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PagePrincipale__Group__12"


    // $ANTLR start "rule__PagePrincipale__Group__12__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:823:1: rule__PagePrincipale__Group__12__Impl : ( '{' ) ;
    public final void rule__PagePrincipale__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:827:1: ( ( '{' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:828:1: ( '{' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:828:1: ( '{' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:829:1: '{'
            {
             before(grammarAccess.getPagePrincipaleAccess().getLeftCurlyBracketKeyword_12()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__PagePrincipale__Group__12__Impl1663); 
             after(grammarAccess.getPagePrincipaleAccess().getLeftCurlyBracketKeyword_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PagePrincipale__Group__12__Impl"


    // $ANTLR start "rule__PagePrincipale__Group__13"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:842:1: rule__PagePrincipale__Group__13 : rule__PagePrincipale__Group__13__Impl rule__PagePrincipale__Group__14 ;
    public final void rule__PagePrincipale__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:846:1: ( rule__PagePrincipale__Group__13__Impl rule__PagePrincipale__Group__14 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:847:2: rule__PagePrincipale__Group__13__Impl rule__PagePrincipale__Group__14
            {
            pushFollow(FollowSets000.FOLLOW_rule__PagePrincipale__Group__13__Impl_in_rule__PagePrincipale__Group__131694);
            rule__PagePrincipale__Group__13__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PagePrincipale__Group__14_in_rule__PagePrincipale__Group__131697);
            rule__PagePrincipale__Group__14();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PagePrincipale__Group__13"


    // $ANTLR start "rule__PagePrincipale__Group__13__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:854:1: rule__PagePrincipale__Group__13__Impl : ( ( rule__PagePrincipale__PagesAssignment_13 ) ) ;
    public final void rule__PagePrincipale__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:858:1: ( ( ( rule__PagePrincipale__PagesAssignment_13 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:859:1: ( ( rule__PagePrincipale__PagesAssignment_13 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:859:1: ( ( rule__PagePrincipale__PagesAssignment_13 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:860:1: ( rule__PagePrincipale__PagesAssignment_13 )
            {
             before(grammarAccess.getPagePrincipaleAccess().getPagesAssignment_13()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:861:1: ( rule__PagePrincipale__PagesAssignment_13 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:861:2: rule__PagePrincipale__PagesAssignment_13
            {
            pushFollow(FollowSets000.FOLLOW_rule__PagePrincipale__PagesAssignment_13_in_rule__PagePrincipale__Group__13__Impl1724);
            rule__PagePrincipale__PagesAssignment_13();

            state._fsp--;


            }

             after(grammarAccess.getPagePrincipaleAccess().getPagesAssignment_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PagePrincipale__Group__13__Impl"


    // $ANTLR start "rule__PagePrincipale__Group__14"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:871:1: rule__PagePrincipale__Group__14 : rule__PagePrincipale__Group__14__Impl rule__PagePrincipale__Group__15 ;
    public final void rule__PagePrincipale__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:875:1: ( rule__PagePrincipale__Group__14__Impl rule__PagePrincipale__Group__15 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:876:2: rule__PagePrincipale__Group__14__Impl rule__PagePrincipale__Group__15
            {
            pushFollow(FollowSets000.FOLLOW_rule__PagePrincipale__Group__14__Impl_in_rule__PagePrincipale__Group__141754);
            rule__PagePrincipale__Group__14__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PagePrincipale__Group__15_in_rule__PagePrincipale__Group__141757);
            rule__PagePrincipale__Group__15();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PagePrincipale__Group__14"


    // $ANTLR start "rule__PagePrincipale__Group__14__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:883:1: rule__PagePrincipale__Group__14__Impl : ( ( rule__PagePrincipale__Group_14__0 )* ) ;
    public final void rule__PagePrincipale__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:887:1: ( ( ( rule__PagePrincipale__Group_14__0 )* ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:888:1: ( ( rule__PagePrincipale__Group_14__0 )* )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:888:1: ( ( rule__PagePrincipale__Group_14__0 )* )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:889:1: ( rule__PagePrincipale__Group_14__0 )*
            {
             before(grammarAccess.getPagePrincipaleAccess().getGroup_14()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:890:1: ( rule__PagePrincipale__Group_14__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==19) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:890:2: rule__PagePrincipale__Group_14__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__PagePrincipale__Group_14__0_in_rule__PagePrincipale__Group__14__Impl1784);
            	    rule__PagePrincipale__Group_14__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getPagePrincipaleAccess().getGroup_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PagePrincipale__Group__14__Impl"


    // $ANTLR start "rule__PagePrincipale__Group__15"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:900:1: rule__PagePrincipale__Group__15 : rule__PagePrincipale__Group__15__Impl rule__PagePrincipale__Group__16 ;
    public final void rule__PagePrincipale__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:904:1: ( rule__PagePrincipale__Group__15__Impl rule__PagePrincipale__Group__16 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:905:2: rule__PagePrincipale__Group__15__Impl rule__PagePrincipale__Group__16
            {
            pushFollow(FollowSets000.FOLLOW_rule__PagePrincipale__Group__15__Impl_in_rule__PagePrincipale__Group__151815);
            rule__PagePrincipale__Group__15__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PagePrincipale__Group__16_in_rule__PagePrincipale__Group__151818);
            rule__PagePrincipale__Group__16();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PagePrincipale__Group__15"


    // $ANTLR start "rule__PagePrincipale__Group__15__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:912:1: rule__PagePrincipale__Group__15__Impl : ( '}' ) ;
    public final void rule__PagePrincipale__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:916:1: ( ( '}' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:917:1: ( '}' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:917:1: ( '}' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:918:1: '}'
            {
             before(grammarAccess.getPagePrincipaleAccess().getRightCurlyBracketKeyword_15()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__PagePrincipale__Group__15__Impl1846); 
             after(grammarAccess.getPagePrincipaleAccess().getRightCurlyBracketKeyword_15()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PagePrincipale__Group__15__Impl"


    // $ANTLR start "rule__PagePrincipale__Group__16"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:931:1: rule__PagePrincipale__Group__16 : rule__PagePrincipale__Group__16__Impl ;
    public final void rule__PagePrincipale__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:935:1: ( rule__PagePrincipale__Group__16__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:936:2: rule__PagePrincipale__Group__16__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__PagePrincipale__Group__16__Impl_in_rule__PagePrincipale__Group__161877);
            rule__PagePrincipale__Group__16__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PagePrincipale__Group__16"


    // $ANTLR start "rule__PagePrincipale__Group__16__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:942:1: rule__PagePrincipale__Group__16__Impl : ( '}' ) ;
    public final void rule__PagePrincipale__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:946:1: ( ( '}' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:947:1: ( '}' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:947:1: ( '}' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:948:1: '}'
            {
             before(grammarAccess.getPagePrincipaleAccess().getRightCurlyBracketKeyword_16()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__PagePrincipale__Group__16__Impl1905); 
             after(grammarAccess.getPagePrincipaleAccess().getRightCurlyBracketKeyword_16()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PagePrincipale__Group__16__Impl"


    // $ANTLR start "rule__PagePrincipale__Group_5__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:995:1: rule__PagePrincipale__Group_5__0 : rule__PagePrincipale__Group_5__0__Impl rule__PagePrincipale__Group_5__1 ;
    public final void rule__PagePrincipale__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:999:1: ( rule__PagePrincipale__Group_5__0__Impl rule__PagePrincipale__Group_5__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1000:2: rule__PagePrincipale__Group_5__0__Impl rule__PagePrincipale__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__PagePrincipale__Group_5__0__Impl_in_rule__PagePrincipale__Group_5__01970);
            rule__PagePrincipale__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PagePrincipale__Group_5__1_in_rule__PagePrincipale__Group_5__01973);
            rule__PagePrincipale__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PagePrincipale__Group_5__0"


    // $ANTLR start "rule__PagePrincipale__Group_5__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1007:1: rule__PagePrincipale__Group_5__0__Impl : ( ',' ) ;
    public final void rule__PagePrincipale__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1011:1: ( ( ',' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1012:1: ( ',' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1012:1: ( ',' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1013:1: ','
            {
             before(grammarAccess.getPagePrincipaleAccess().getCommaKeyword_5_0()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__PagePrincipale__Group_5__0__Impl2001); 
             after(grammarAccess.getPagePrincipaleAccess().getCommaKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PagePrincipale__Group_5__0__Impl"


    // $ANTLR start "rule__PagePrincipale__Group_5__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1026:1: rule__PagePrincipale__Group_5__1 : rule__PagePrincipale__Group_5__1__Impl ;
    public final void rule__PagePrincipale__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1030:1: ( rule__PagePrincipale__Group_5__1__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1031:2: rule__PagePrincipale__Group_5__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__PagePrincipale__Group_5__1__Impl_in_rule__PagePrincipale__Group_5__12032);
            rule__PagePrincipale__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PagePrincipale__Group_5__1"


    // $ANTLR start "rule__PagePrincipale__Group_5__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1037:1: rule__PagePrincipale__Group_5__1__Impl : ( ( rule__PagePrincipale__ContactsAssignment_5_1 ) ) ;
    public final void rule__PagePrincipale__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1041:1: ( ( ( rule__PagePrincipale__ContactsAssignment_5_1 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1042:1: ( ( rule__PagePrincipale__ContactsAssignment_5_1 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1042:1: ( ( rule__PagePrincipale__ContactsAssignment_5_1 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1043:1: ( rule__PagePrincipale__ContactsAssignment_5_1 )
            {
             before(grammarAccess.getPagePrincipaleAccess().getContactsAssignment_5_1()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1044:1: ( rule__PagePrincipale__ContactsAssignment_5_1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1044:2: rule__PagePrincipale__ContactsAssignment_5_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__PagePrincipale__ContactsAssignment_5_1_in_rule__PagePrincipale__Group_5__1__Impl2059);
            rule__PagePrincipale__ContactsAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getPagePrincipaleAccess().getContactsAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PagePrincipale__Group_5__1__Impl"


    // $ANTLR start "rule__PagePrincipale__Group_7__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1058:1: rule__PagePrincipale__Group_7__0 : rule__PagePrincipale__Group_7__0__Impl rule__PagePrincipale__Group_7__1 ;
    public final void rule__PagePrincipale__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1062:1: ( rule__PagePrincipale__Group_7__0__Impl rule__PagePrincipale__Group_7__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1063:2: rule__PagePrincipale__Group_7__0__Impl rule__PagePrincipale__Group_7__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__PagePrincipale__Group_7__0__Impl_in_rule__PagePrincipale__Group_7__02093);
            rule__PagePrincipale__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PagePrincipale__Group_7__1_in_rule__PagePrincipale__Group_7__02096);
            rule__PagePrincipale__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PagePrincipale__Group_7__0"


    // $ANTLR start "rule__PagePrincipale__Group_7__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1070:1: rule__PagePrincipale__Group_7__0__Impl : ( 'rubriques' ) ;
    public final void rule__PagePrincipale__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1074:1: ( ( 'rubriques' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1075:1: ( 'rubriques' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1075:1: ( 'rubriques' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1076:1: 'rubriques'
            {
             before(grammarAccess.getPagePrincipaleAccess().getRubriquesKeyword_7_0()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__PagePrincipale__Group_7__0__Impl2124); 
             after(grammarAccess.getPagePrincipaleAccess().getRubriquesKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PagePrincipale__Group_7__0__Impl"


    // $ANTLR start "rule__PagePrincipale__Group_7__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1089:1: rule__PagePrincipale__Group_7__1 : rule__PagePrincipale__Group_7__1__Impl ;
    public final void rule__PagePrincipale__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1093:1: ( rule__PagePrincipale__Group_7__1__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1094:2: rule__PagePrincipale__Group_7__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__PagePrincipale__Group_7__1__Impl_in_rule__PagePrincipale__Group_7__12155);
            rule__PagePrincipale__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PagePrincipale__Group_7__1"


    // $ANTLR start "rule__PagePrincipale__Group_7__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1100:1: rule__PagePrincipale__Group_7__1__Impl : ( ( rule__PagePrincipale__RubriquesAssignment_7_1 ) ) ;
    public final void rule__PagePrincipale__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1104:1: ( ( ( rule__PagePrincipale__RubriquesAssignment_7_1 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1105:1: ( ( rule__PagePrincipale__RubriquesAssignment_7_1 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1105:1: ( ( rule__PagePrincipale__RubriquesAssignment_7_1 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1106:1: ( rule__PagePrincipale__RubriquesAssignment_7_1 )
            {
             before(grammarAccess.getPagePrincipaleAccess().getRubriquesAssignment_7_1()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1107:1: ( rule__PagePrincipale__RubriquesAssignment_7_1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1107:2: rule__PagePrincipale__RubriquesAssignment_7_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__PagePrincipale__RubriquesAssignment_7_1_in_rule__PagePrincipale__Group_7__1__Impl2182);
            rule__PagePrincipale__RubriquesAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getPagePrincipaleAccess().getRubriquesAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PagePrincipale__Group_7__1__Impl"


    // $ANTLR start "rule__PagePrincipale__Group_8__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1121:1: rule__PagePrincipale__Group_8__0 : rule__PagePrincipale__Group_8__0__Impl rule__PagePrincipale__Group_8__1 ;
    public final void rule__PagePrincipale__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1125:1: ( rule__PagePrincipale__Group_8__0__Impl rule__PagePrincipale__Group_8__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1126:2: rule__PagePrincipale__Group_8__0__Impl rule__PagePrincipale__Group_8__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__PagePrincipale__Group_8__0__Impl_in_rule__PagePrincipale__Group_8__02216);
            rule__PagePrincipale__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PagePrincipale__Group_8__1_in_rule__PagePrincipale__Group_8__02219);
            rule__PagePrincipale__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PagePrincipale__Group_8__0"


    // $ANTLR start "rule__PagePrincipale__Group_8__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1133:1: rule__PagePrincipale__Group_8__0__Impl : ( 'fichiers' ) ;
    public final void rule__PagePrincipale__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1137:1: ( ( 'fichiers' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1138:1: ( 'fichiers' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1138:1: ( 'fichiers' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1139:1: 'fichiers'
            {
             before(grammarAccess.getPagePrincipaleAccess().getFichiersKeyword_8_0()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__PagePrincipale__Group_8__0__Impl2247); 
             after(grammarAccess.getPagePrincipaleAccess().getFichiersKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PagePrincipale__Group_8__0__Impl"


    // $ANTLR start "rule__PagePrincipale__Group_8__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1152:1: rule__PagePrincipale__Group_8__1 : rule__PagePrincipale__Group_8__1__Impl rule__PagePrincipale__Group_8__2 ;
    public final void rule__PagePrincipale__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1156:1: ( rule__PagePrincipale__Group_8__1__Impl rule__PagePrincipale__Group_8__2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1157:2: rule__PagePrincipale__Group_8__1__Impl rule__PagePrincipale__Group_8__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__PagePrincipale__Group_8__1__Impl_in_rule__PagePrincipale__Group_8__12278);
            rule__PagePrincipale__Group_8__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PagePrincipale__Group_8__2_in_rule__PagePrincipale__Group_8__12281);
            rule__PagePrincipale__Group_8__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PagePrincipale__Group_8__1"


    // $ANTLR start "rule__PagePrincipale__Group_8__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1164:1: rule__PagePrincipale__Group_8__1__Impl : ( '{' ) ;
    public final void rule__PagePrincipale__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1168:1: ( ( '{' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1169:1: ( '{' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1169:1: ( '{' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1170:1: '{'
            {
             before(grammarAccess.getPagePrincipaleAccess().getLeftCurlyBracketKeyword_8_1()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__PagePrincipale__Group_8__1__Impl2309); 
             after(grammarAccess.getPagePrincipaleAccess().getLeftCurlyBracketKeyword_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PagePrincipale__Group_8__1__Impl"


    // $ANTLR start "rule__PagePrincipale__Group_8__2"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1183:1: rule__PagePrincipale__Group_8__2 : rule__PagePrincipale__Group_8__2__Impl rule__PagePrincipale__Group_8__3 ;
    public final void rule__PagePrincipale__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1187:1: ( rule__PagePrincipale__Group_8__2__Impl rule__PagePrincipale__Group_8__3 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1188:2: rule__PagePrincipale__Group_8__2__Impl rule__PagePrincipale__Group_8__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__PagePrincipale__Group_8__2__Impl_in_rule__PagePrincipale__Group_8__22340);
            rule__PagePrincipale__Group_8__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PagePrincipale__Group_8__3_in_rule__PagePrincipale__Group_8__22343);
            rule__PagePrincipale__Group_8__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PagePrincipale__Group_8__2"


    // $ANTLR start "rule__PagePrincipale__Group_8__2__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1195:1: rule__PagePrincipale__Group_8__2__Impl : ( ( rule__PagePrincipale__FichiersAssignment_8_2 ) ) ;
    public final void rule__PagePrincipale__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1199:1: ( ( ( rule__PagePrincipale__FichiersAssignment_8_2 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1200:1: ( ( rule__PagePrincipale__FichiersAssignment_8_2 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1200:1: ( ( rule__PagePrincipale__FichiersAssignment_8_2 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1201:1: ( rule__PagePrincipale__FichiersAssignment_8_2 )
            {
             before(grammarAccess.getPagePrincipaleAccess().getFichiersAssignment_8_2()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1202:1: ( rule__PagePrincipale__FichiersAssignment_8_2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1202:2: rule__PagePrincipale__FichiersAssignment_8_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__PagePrincipale__FichiersAssignment_8_2_in_rule__PagePrincipale__Group_8__2__Impl2370);
            rule__PagePrincipale__FichiersAssignment_8_2();

            state._fsp--;


            }

             after(grammarAccess.getPagePrincipaleAccess().getFichiersAssignment_8_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PagePrincipale__Group_8__2__Impl"


    // $ANTLR start "rule__PagePrincipale__Group_8__3"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1212:1: rule__PagePrincipale__Group_8__3 : rule__PagePrincipale__Group_8__3__Impl rule__PagePrincipale__Group_8__4 ;
    public final void rule__PagePrincipale__Group_8__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1216:1: ( rule__PagePrincipale__Group_8__3__Impl rule__PagePrincipale__Group_8__4 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1217:2: rule__PagePrincipale__Group_8__3__Impl rule__PagePrincipale__Group_8__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__PagePrincipale__Group_8__3__Impl_in_rule__PagePrincipale__Group_8__32400);
            rule__PagePrincipale__Group_8__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PagePrincipale__Group_8__4_in_rule__PagePrincipale__Group_8__32403);
            rule__PagePrincipale__Group_8__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PagePrincipale__Group_8__3"


    // $ANTLR start "rule__PagePrincipale__Group_8__3__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1224:1: rule__PagePrincipale__Group_8__3__Impl : ( ( rule__PagePrincipale__Group_8_3__0 )* ) ;
    public final void rule__PagePrincipale__Group_8__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1228:1: ( ( ( rule__PagePrincipale__Group_8_3__0 )* ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1229:1: ( ( rule__PagePrincipale__Group_8_3__0 )* )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1229:1: ( ( rule__PagePrincipale__Group_8_3__0 )* )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1230:1: ( rule__PagePrincipale__Group_8_3__0 )*
            {
             before(grammarAccess.getPagePrincipaleAccess().getGroup_8_3()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1231:1: ( rule__PagePrincipale__Group_8_3__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==19) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1231:2: rule__PagePrincipale__Group_8_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__PagePrincipale__Group_8_3__0_in_rule__PagePrincipale__Group_8__3__Impl2430);
            	    rule__PagePrincipale__Group_8_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getPagePrincipaleAccess().getGroup_8_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PagePrincipale__Group_8__3__Impl"


    // $ANTLR start "rule__PagePrincipale__Group_8__4"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1241:1: rule__PagePrincipale__Group_8__4 : rule__PagePrincipale__Group_8__4__Impl ;
    public final void rule__PagePrincipale__Group_8__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1245:1: ( rule__PagePrincipale__Group_8__4__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1246:2: rule__PagePrincipale__Group_8__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__PagePrincipale__Group_8__4__Impl_in_rule__PagePrincipale__Group_8__42461);
            rule__PagePrincipale__Group_8__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PagePrincipale__Group_8__4"


    // $ANTLR start "rule__PagePrincipale__Group_8__4__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1252:1: rule__PagePrincipale__Group_8__4__Impl : ( '}' ) ;
    public final void rule__PagePrincipale__Group_8__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1256:1: ( ( '}' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1257:1: ( '}' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1257:1: ( '}' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1258:1: '}'
            {
             before(grammarAccess.getPagePrincipaleAccess().getRightCurlyBracketKeyword_8_4()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__PagePrincipale__Group_8__4__Impl2489); 
             after(grammarAccess.getPagePrincipaleAccess().getRightCurlyBracketKeyword_8_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PagePrincipale__Group_8__4__Impl"


    // $ANTLR start "rule__PagePrincipale__Group_8_3__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1281:1: rule__PagePrincipale__Group_8_3__0 : rule__PagePrincipale__Group_8_3__0__Impl rule__PagePrincipale__Group_8_3__1 ;
    public final void rule__PagePrincipale__Group_8_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1285:1: ( rule__PagePrincipale__Group_8_3__0__Impl rule__PagePrincipale__Group_8_3__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1286:2: rule__PagePrincipale__Group_8_3__0__Impl rule__PagePrincipale__Group_8_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__PagePrincipale__Group_8_3__0__Impl_in_rule__PagePrincipale__Group_8_3__02530);
            rule__PagePrincipale__Group_8_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PagePrincipale__Group_8_3__1_in_rule__PagePrincipale__Group_8_3__02533);
            rule__PagePrincipale__Group_8_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PagePrincipale__Group_8_3__0"


    // $ANTLR start "rule__PagePrincipale__Group_8_3__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1293:1: rule__PagePrincipale__Group_8_3__0__Impl : ( ',' ) ;
    public final void rule__PagePrincipale__Group_8_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1297:1: ( ( ',' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1298:1: ( ',' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1298:1: ( ',' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1299:1: ','
            {
             before(grammarAccess.getPagePrincipaleAccess().getCommaKeyword_8_3_0()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__PagePrincipale__Group_8_3__0__Impl2561); 
             after(grammarAccess.getPagePrincipaleAccess().getCommaKeyword_8_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PagePrincipale__Group_8_3__0__Impl"


    // $ANTLR start "rule__PagePrincipale__Group_8_3__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1312:1: rule__PagePrincipale__Group_8_3__1 : rule__PagePrincipale__Group_8_3__1__Impl ;
    public final void rule__PagePrincipale__Group_8_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1316:1: ( rule__PagePrincipale__Group_8_3__1__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1317:2: rule__PagePrincipale__Group_8_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__PagePrincipale__Group_8_3__1__Impl_in_rule__PagePrincipale__Group_8_3__12592);
            rule__PagePrincipale__Group_8_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PagePrincipale__Group_8_3__1"


    // $ANTLR start "rule__PagePrincipale__Group_8_3__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1323:1: rule__PagePrincipale__Group_8_3__1__Impl : ( ( rule__PagePrincipale__FichiersAssignment_8_3_1 ) ) ;
    public final void rule__PagePrincipale__Group_8_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1327:1: ( ( ( rule__PagePrincipale__FichiersAssignment_8_3_1 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1328:1: ( ( rule__PagePrincipale__FichiersAssignment_8_3_1 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1328:1: ( ( rule__PagePrincipale__FichiersAssignment_8_3_1 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1329:1: ( rule__PagePrincipale__FichiersAssignment_8_3_1 )
            {
             before(grammarAccess.getPagePrincipaleAccess().getFichiersAssignment_8_3_1()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1330:1: ( rule__PagePrincipale__FichiersAssignment_8_3_1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1330:2: rule__PagePrincipale__FichiersAssignment_8_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__PagePrincipale__FichiersAssignment_8_3_1_in_rule__PagePrincipale__Group_8_3__1__Impl2619);
            rule__PagePrincipale__FichiersAssignment_8_3_1();

            state._fsp--;


            }

             after(grammarAccess.getPagePrincipaleAccess().getFichiersAssignment_8_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PagePrincipale__Group_8_3__1__Impl"


    // $ANTLR start "rule__PagePrincipale__Group_14__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1344:1: rule__PagePrincipale__Group_14__0 : rule__PagePrincipale__Group_14__0__Impl rule__PagePrincipale__Group_14__1 ;
    public final void rule__PagePrincipale__Group_14__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1348:1: ( rule__PagePrincipale__Group_14__0__Impl rule__PagePrincipale__Group_14__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1349:2: rule__PagePrincipale__Group_14__0__Impl rule__PagePrincipale__Group_14__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__PagePrincipale__Group_14__0__Impl_in_rule__PagePrincipale__Group_14__02653);
            rule__PagePrincipale__Group_14__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PagePrincipale__Group_14__1_in_rule__PagePrincipale__Group_14__02656);
            rule__PagePrincipale__Group_14__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PagePrincipale__Group_14__0"


    // $ANTLR start "rule__PagePrincipale__Group_14__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1356:1: rule__PagePrincipale__Group_14__0__Impl : ( ',' ) ;
    public final void rule__PagePrincipale__Group_14__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1360:1: ( ( ',' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1361:1: ( ',' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1361:1: ( ',' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1362:1: ','
            {
             before(grammarAccess.getPagePrincipaleAccess().getCommaKeyword_14_0()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__PagePrincipale__Group_14__0__Impl2684); 
             after(grammarAccess.getPagePrincipaleAccess().getCommaKeyword_14_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PagePrincipale__Group_14__0__Impl"


    // $ANTLR start "rule__PagePrincipale__Group_14__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1375:1: rule__PagePrincipale__Group_14__1 : rule__PagePrincipale__Group_14__1__Impl ;
    public final void rule__PagePrincipale__Group_14__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1379:1: ( rule__PagePrincipale__Group_14__1__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1380:2: rule__PagePrincipale__Group_14__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__PagePrincipale__Group_14__1__Impl_in_rule__PagePrincipale__Group_14__12715);
            rule__PagePrincipale__Group_14__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PagePrincipale__Group_14__1"


    // $ANTLR start "rule__PagePrincipale__Group_14__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1386:1: rule__PagePrincipale__Group_14__1__Impl : ( ( rule__PagePrincipale__PagesAssignment_14_1 ) ) ;
    public final void rule__PagePrincipale__Group_14__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1390:1: ( ( ( rule__PagePrincipale__PagesAssignment_14_1 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1391:1: ( ( rule__PagePrincipale__PagesAssignment_14_1 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1391:1: ( ( rule__PagePrincipale__PagesAssignment_14_1 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1392:1: ( rule__PagePrincipale__PagesAssignment_14_1 )
            {
             before(grammarAccess.getPagePrincipaleAccess().getPagesAssignment_14_1()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1393:1: ( rule__PagePrincipale__PagesAssignment_14_1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1393:2: rule__PagePrincipale__PagesAssignment_14_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__PagePrincipale__PagesAssignment_14_1_in_rule__PagePrincipale__Group_14__1__Impl2742);
            rule__PagePrincipale__PagesAssignment_14_1();

            state._fsp--;


            }

             after(grammarAccess.getPagePrincipaleAccess().getPagesAssignment_14_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PagePrincipale__Group_14__1__Impl"


    // $ANTLR start "rule__Contact__Group__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1407:1: rule__Contact__Group__0 : rule__Contact__Group__0__Impl rule__Contact__Group__1 ;
    public final void rule__Contact__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1411:1: ( rule__Contact__Group__0__Impl rule__Contact__Group__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1412:2: rule__Contact__Group__0__Impl rule__Contact__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Contact__Group__0__Impl_in_rule__Contact__Group__02776);
            rule__Contact__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Contact__Group__1_in_rule__Contact__Group__02779);
            rule__Contact__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Contact__Group__0"


    // $ANTLR start "rule__Contact__Group__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1419:1: rule__Contact__Group__0__Impl : ( () ) ;
    public final void rule__Contact__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1423:1: ( ( () ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1424:1: ( () )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1424:1: ( () )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1425:1: ()
            {
             before(grammarAccess.getContactAccess().getContactAction_0()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1426:1: ()
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1428:1: 
            {
            }

             after(grammarAccess.getContactAccess().getContactAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Contact__Group__0__Impl"


    // $ANTLR start "rule__Contact__Group__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1438:1: rule__Contact__Group__1 : rule__Contact__Group__1__Impl rule__Contact__Group__2 ;
    public final void rule__Contact__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1442:1: ( rule__Contact__Group__1__Impl rule__Contact__Group__2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1443:2: rule__Contact__Group__1__Impl rule__Contact__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Contact__Group__1__Impl_in_rule__Contact__Group__12837);
            rule__Contact__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Contact__Group__2_in_rule__Contact__Group__12840);
            rule__Contact__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Contact__Group__1"


    // $ANTLR start "rule__Contact__Group__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1450:1: rule__Contact__Group__1__Impl : ( 'Contact' ) ;
    public final void rule__Contact__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1454:1: ( ( 'Contact' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1455:1: ( 'Contact' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1455:1: ( 'Contact' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1456:1: 'Contact'
            {
             before(grammarAccess.getContactAccess().getContactKeyword_1()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__Contact__Group__1__Impl2868); 
             after(grammarAccess.getContactAccess().getContactKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Contact__Group__1__Impl"


    // $ANTLR start "rule__Contact__Group__2"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1469:1: rule__Contact__Group__2 : rule__Contact__Group__2__Impl rule__Contact__Group__3 ;
    public final void rule__Contact__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1473:1: ( rule__Contact__Group__2__Impl rule__Contact__Group__3 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1474:2: rule__Contact__Group__2__Impl rule__Contact__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Contact__Group__2__Impl_in_rule__Contact__Group__22899);
            rule__Contact__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Contact__Group__3_in_rule__Contact__Group__22902);
            rule__Contact__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Contact__Group__2"


    // $ANTLR start "rule__Contact__Group__2__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1481:1: rule__Contact__Group__2__Impl : ( '{' ) ;
    public final void rule__Contact__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1485:1: ( ( '{' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1486:1: ( '{' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1486:1: ( '{' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1487:1: '{'
            {
             before(grammarAccess.getContactAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Contact__Group__2__Impl2930); 
             after(grammarAccess.getContactAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Contact__Group__2__Impl"


    // $ANTLR start "rule__Contact__Group__3"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1500:1: rule__Contact__Group__3 : rule__Contact__Group__3__Impl rule__Contact__Group__4 ;
    public final void rule__Contact__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1504:1: ( rule__Contact__Group__3__Impl rule__Contact__Group__4 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1505:2: rule__Contact__Group__3__Impl rule__Contact__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Contact__Group__3__Impl_in_rule__Contact__Group__32961);
            rule__Contact__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Contact__Group__4_in_rule__Contact__Group__32964);
            rule__Contact__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Contact__Group__3"


    // $ANTLR start "rule__Contact__Group__3__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1512:1: rule__Contact__Group__3__Impl : ( ( rule__Contact__Group_3__0 )? ) ;
    public final void rule__Contact__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1516:1: ( ( ( rule__Contact__Group_3__0 )? ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1517:1: ( ( rule__Contact__Group_3__0 )? )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1517:1: ( ( rule__Contact__Group_3__0 )? )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1518:1: ( rule__Contact__Group_3__0 )?
            {
             before(grammarAccess.getContactAccess().getGroup_3()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1519:1: ( rule__Contact__Group_3__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==23) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1519:2: rule__Contact__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Contact__Group_3__0_in_rule__Contact__Group__3__Impl2991);
                    rule__Contact__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getContactAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Contact__Group__3__Impl"


    // $ANTLR start "rule__Contact__Group__4"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1529:1: rule__Contact__Group__4 : rule__Contact__Group__4__Impl rule__Contact__Group__5 ;
    public final void rule__Contact__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1533:1: ( rule__Contact__Group__4__Impl rule__Contact__Group__5 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1534:2: rule__Contact__Group__4__Impl rule__Contact__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Contact__Group__4__Impl_in_rule__Contact__Group__43022);
            rule__Contact__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Contact__Group__5_in_rule__Contact__Group__43025);
            rule__Contact__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Contact__Group__4"


    // $ANTLR start "rule__Contact__Group__4__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1541:1: rule__Contact__Group__4__Impl : ( ( rule__Contact__Group_4__0 )? ) ;
    public final void rule__Contact__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1545:1: ( ( ( rule__Contact__Group_4__0 )? ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1546:1: ( ( rule__Contact__Group_4__0 )? )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1546:1: ( ( rule__Contact__Group_4__0 )? )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1547:1: ( rule__Contact__Group_4__0 )?
            {
             before(grammarAccess.getContactAccess().getGroup_4()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1548:1: ( rule__Contact__Group_4__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==24) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1548:2: rule__Contact__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Contact__Group_4__0_in_rule__Contact__Group__4__Impl3052);
                    rule__Contact__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getContactAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Contact__Group__4__Impl"


    // $ANTLR start "rule__Contact__Group__5"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1558:1: rule__Contact__Group__5 : rule__Contact__Group__5__Impl rule__Contact__Group__6 ;
    public final void rule__Contact__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1562:1: ( rule__Contact__Group__5__Impl rule__Contact__Group__6 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1563:2: rule__Contact__Group__5__Impl rule__Contact__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Contact__Group__5__Impl_in_rule__Contact__Group__53083);
            rule__Contact__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Contact__Group__6_in_rule__Contact__Group__53086);
            rule__Contact__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Contact__Group__5"


    // $ANTLR start "rule__Contact__Group__5__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1570:1: rule__Contact__Group__5__Impl : ( ( rule__Contact__Group_5__0 )? ) ;
    public final void rule__Contact__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1574:1: ( ( ( rule__Contact__Group_5__0 )? ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1575:1: ( ( rule__Contact__Group_5__0 )? )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1575:1: ( ( rule__Contact__Group_5__0 )? )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1576:1: ( rule__Contact__Group_5__0 )?
            {
             before(grammarAccess.getContactAccess().getGroup_5()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1577:1: ( rule__Contact__Group_5__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==25) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1577:2: rule__Contact__Group_5__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Contact__Group_5__0_in_rule__Contact__Group__5__Impl3113);
                    rule__Contact__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getContactAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Contact__Group__5__Impl"


    // $ANTLR start "rule__Contact__Group__6"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1587:1: rule__Contact__Group__6 : rule__Contact__Group__6__Impl rule__Contact__Group__7 ;
    public final void rule__Contact__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1591:1: ( rule__Contact__Group__6__Impl rule__Contact__Group__7 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1592:2: rule__Contact__Group__6__Impl rule__Contact__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__Contact__Group__6__Impl_in_rule__Contact__Group__63144);
            rule__Contact__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Contact__Group__7_in_rule__Contact__Group__63147);
            rule__Contact__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Contact__Group__6"


    // $ANTLR start "rule__Contact__Group__6__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1599:1: rule__Contact__Group__6__Impl : ( ( rule__Contact__Group_6__0 )? ) ;
    public final void rule__Contact__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1603:1: ( ( ( rule__Contact__Group_6__0 )? ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1604:1: ( ( rule__Contact__Group_6__0 )? )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1604:1: ( ( rule__Contact__Group_6__0 )? )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1605:1: ( rule__Contact__Group_6__0 )?
            {
             before(grammarAccess.getContactAccess().getGroup_6()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1606:1: ( rule__Contact__Group_6__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==26) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1606:2: rule__Contact__Group_6__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Contact__Group_6__0_in_rule__Contact__Group__6__Impl3174);
                    rule__Contact__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getContactAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Contact__Group__6__Impl"


    // $ANTLR start "rule__Contact__Group__7"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1616:1: rule__Contact__Group__7 : rule__Contact__Group__7__Impl rule__Contact__Group__8 ;
    public final void rule__Contact__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1620:1: ( rule__Contact__Group__7__Impl rule__Contact__Group__8 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1621:2: rule__Contact__Group__7__Impl rule__Contact__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__Contact__Group__7__Impl_in_rule__Contact__Group__73205);
            rule__Contact__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Contact__Group__8_in_rule__Contact__Group__73208);
            rule__Contact__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Contact__Group__7"


    // $ANTLR start "rule__Contact__Group__7__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1628:1: rule__Contact__Group__7__Impl : ( ( rule__Contact__Group_7__0 )? ) ;
    public final void rule__Contact__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1632:1: ( ( ( rule__Contact__Group_7__0 )? ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1633:1: ( ( rule__Contact__Group_7__0 )? )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1633:1: ( ( rule__Contact__Group_7__0 )? )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1634:1: ( rule__Contact__Group_7__0 )?
            {
             before(grammarAccess.getContactAccess().getGroup_7()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1635:1: ( rule__Contact__Group_7__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==27) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1635:2: rule__Contact__Group_7__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Contact__Group_7__0_in_rule__Contact__Group__7__Impl3235);
                    rule__Contact__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getContactAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Contact__Group__7__Impl"


    // $ANTLR start "rule__Contact__Group__8"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1645:1: rule__Contact__Group__8 : rule__Contact__Group__8__Impl ;
    public final void rule__Contact__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1649:1: ( rule__Contact__Group__8__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1650:2: rule__Contact__Group__8__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Contact__Group__8__Impl_in_rule__Contact__Group__83266);
            rule__Contact__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Contact__Group__8"


    // $ANTLR start "rule__Contact__Group__8__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1656:1: rule__Contact__Group__8__Impl : ( '}' ) ;
    public final void rule__Contact__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1660:1: ( ( '}' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1661:1: ( '}' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1661:1: ( '}' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1662:1: '}'
            {
             before(grammarAccess.getContactAccess().getRightCurlyBracketKeyword_8()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__Contact__Group__8__Impl3294); 
             after(grammarAccess.getContactAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Contact__Group__8__Impl"


    // $ANTLR start "rule__Contact__Group_3__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1693:1: rule__Contact__Group_3__0 : rule__Contact__Group_3__0__Impl rule__Contact__Group_3__1 ;
    public final void rule__Contact__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1697:1: ( rule__Contact__Group_3__0__Impl rule__Contact__Group_3__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1698:2: rule__Contact__Group_3__0__Impl rule__Contact__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Contact__Group_3__0__Impl_in_rule__Contact__Group_3__03343);
            rule__Contact__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Contact__Group_3__1_in_rule__Contact__Group_3__03346);
            rule__Contact__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Contact__Group_3__0"


    // $ANTLR start "rule__Contact__Group_3__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1705:1: rule__Contact__Group_3__0__Impl : ( 'nom' ) ;
    public final void rule__Contact__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1709:1: ( ( 'nom' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1710:1: ( 'nom' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1710:1: ( 'nom' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1711:1: 'nom'
            {
             before(grammarAccess.getContactAccess().getNomKeyword_3_0()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__Contact__Group_3__0__Impl3374); 
             after(grammarAccess.getContactAccess().getNomKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Contact__Group_3__0__Impl"


    // $ANTLR start "rule__Contact__Group_3__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1724:1: rule__Contact__Group_3__1 : rule__Contact__Group_3__1__Impl ;
    public final void rule__Contact__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1728:1: ( rule__Contact__Group_3__1__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1729:2: rule__Contact__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Contact__Group_3__1__Impl_in_rule__Contact__Group_3__13405);
            rule__Contact__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Contact__Group_3__1"


    // $ANTLR start "rule__Contact__Group_3__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1735:1: rule__Contact__Group_3__1__Impl : ( ( rule__Contact__NomAssignment_3_1 ) ) ;
    public final void rule__Contact__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1739:1: ( ( ( rule__Contact__NomAssignment_3_1 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1740:1: ( ( rule__Contact__NomAssignment_3_1 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1740:1: ( ( rule__Contact__NomAssignment_3_1 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1741:1: ( rule__Contact__NomAssignment_3_1 )
            {
             before(grammarAccess.getContactAccess().getNomAssignment_3_1()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1742:1: ( rule__Contact__NomAssignment_3_1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1742:2: rule__Contact__NomAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Contact__NomAssignment_3_1_in_rule__Contact__Group_3__1__Impl3432);
            rule__Contact__NomAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getContactAccess().getNomAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Contact__Group_3__1__Impl"


    // $ANTLR start "rule__Contact__Group_4__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1756:1: rule__Contact__Group_4__0 : rule__Contact__Group_4__0__Impl rule__Contact__Group_4__1 ;
    public final void rule__Contact__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1760:1: ( rule__Contact__Group_4__0__Impl rule__Contact__Group_4__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1761:2: rule__Contact__Group_4__0__Impl rule__Contact__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Contact__Group_4__0__Impl_in_rule__Contact__Group_4__03466);
            rule__Contact__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Contact__Group_4__1_in_rule__Contact__Group_4__03469);
            rule__Contact__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Contact__Group_4__0"


    // $ANTLR start "rule__Contact__Group_4__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1768:1: rule__Contact__Group_4__0__Impl : ( 'prenom' ) ;
    public final void rule__Contact__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1772:1: ( ( 'prenom' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1773:1: ( 'prenom' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1773:1: ( 'prenom' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1774:1: 'prenom'
            {
             before(grammarAccess.getContactAccess().getPrenomKeyword_4_0()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__Contact__Group_4__0__Impl3497); 
             after(grammarAccess.getContactAccess().getPrenomKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Contact__Group_4__0__Impl"


    // $ANTLR start "rule__Contact__Group_4__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1787:1: rule__Contact__Group_4__1 : rule__Contact__Group_4__1__Impl ;
    public final void rule__Contact__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1791:1: ( rule__Contact__Group_4__1__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1792:2: rule__Contact__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Contact__Group_4__1__Impl_in_rule__Contact__Group_4__13528);
            rule__Contact__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Contact__Group_4__1"


    // $ANTLR start "rule__Contact__Group_4__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1798:1: rule__Contact__Group_4__1__Impl : ( ( rule__Contact__PrenomAssignment_4_1 ) ) ;
    public final void rule__Contact__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1802:1: ( ( ( rule__Contact__PrenomAssignment_4_1 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1803:1: ( ( rule__Contact__PrenomAssignment_4_1 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1803:1: ( ( rule__Contact__PrenomAssignment_4_1 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1804:1: ( rule__Contact__PrenomAssignment_4_1 )
            {
             before(grammarAccess.getContactAccess().getPrenomAssignment_4_1()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1805:1: ( rule__Contact__PrenomAssignment_4_1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1805:2: rule__Contact__PrenomAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Contact__PrenomAssignment_4_1_in_rule__Contact__Group_4__1__Impl3555);
            rule__Contact__PrenomAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getContactAccess().getPrenomAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Contact__Group_4__1__Impl"


    // $ANTLR start "rule__Contact__Group_5__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1819:1: rule__Contact__Group_5__0 : rule__Contact__Group_5__0__Impl rule__Contact__Group_5__1 ;
    public final void rule__Contact__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1823:1: ( rule__Contact__Group_5__0__Impl rule__Contact__Group_5__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1824:2: rule__Contact__Group_5__0__Impl rule__Contact__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Contact__Group_5__0__Impl_in_rule__Contact__Group_5__03589);
            rule__Contact__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Contact__Group_5__1_in_rule__Contact__Group_5__03592);
            rule__Contact__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Contact__Group_5__0"


    // $ANTLR start "rule__Contact__Group_5__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1831:1: rule__Contact__Group_5__0__Impl : ( 'adresse' ) ;
    public final void rule__Contact__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1835:1: ( ( 'adresse' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1836:1: ( 'adresse' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1836:1: ( 'adresse' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1837:1: 'adresse'
            {
             before(grammarAccess.getContactAccess().getAdresseKeyword_5_0()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__Contact__Group_5__0__Impl3620); 
             after(grammarAccess.getContactAccess().getAdresseKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Contact__Group_5__0__Impl"


    // $ANTLR start "rule__Contact__Group_5__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1850:1: rule__Contact__Group_5__1 : rule__Contact__Group_5__1__Impl ;
    public final void rule__Contact__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1854:1: ( rule__Contact__Group_5__1__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1855:2: rule__Contact__Group_5__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Contact__Group_5__1__Impl_in_rule__Contact__Group_5__13651);
            rule__Contact__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Contact__Group_5__1"


    // $ANTLR start "rule__Contact__Group_5__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1861:1: rule__Contact__Group_5__1__Impl : ( ( rule__Contact__AdresseAssignment_5_1 ) ) ;
    public final void rule__Contact__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1865:1: ( ( ( rule__Contact__AdresseAssignment_5_1 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1866:1: ( ( rule__Contact__AdresseAssignment_5_1 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1866:1: ( ( rule__Contact__AdresseAssignment_5_1 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1867:1: ( rule__Contact__AdresseAssignment_5_1 )
            {
             before(grammarAccess.getContactAccess().getAdresseAssignment_5_1()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1868:1: ( rule__Contact__AdresseAssignment_5_1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1868:2: rule__Contact__AdresseAssignment_5_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Contact__AdresseAssignment_5_1_in_rule__Contact__Group_5__1__Impl3678);
            rule__Contact__AdresseAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getContactAccess().getAdresseAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Contact__Group_5__1__Impl"


    // $ANTLR start "rule__Contact__Group_6__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1882:1: rule__Contact__Group_6__0 : rule__Contact__Group_6__0__Impl rule__Contact__Group_6__1 ;
    public final void rule__Contact__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1886:1: ( rule__Contact__Group_6__0__Impl rule__Contact__Group_6__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1887:2: rule__Contact__Group_6__0__Impl rule__Contact__Group_6__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Contact__Group_6__0__Impl_in_rule__Contact__Group_6__03712);
            rule__Contact__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Contact__Group_6__1_in_rule__Contact__Group_6__03715);
            rule__Contact__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Contact__Group_6__0"


    // $ANTLR start "rule__Contact__Group_6__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1894:1: rule__Contact__Group_6__0__Impl : ( 'mail' ) ;
    public final void rule__Contact__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1898:1: ( ( 'mail' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1899:1: ( 'mail' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1899:1: ( 'mail' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1900:1: 'mail'
            {
             before(grammarAccess.getContactAccess().getMailKeyword_6_0()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__Contact__Group_6__0__Impl3743); 
             after(grammarAccess.getContactAccess().getMailKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Contact__Group_6__0__Impl"


    // $ANTLR start "rule__Contact__Group_6__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1913:1: rule__Contact__Group_6__1 : rule__Contact__Group_6__1__Impl ;
    public final void rule__Contact__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1917:1: ( rule__Contact__Group_6__1__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1918:2: rule__Contact__Group_6__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Contact__Group_6__1__Impl_in_rule__Contact__Group_6__13774);
            rule__Contact__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Contact__Group_6__1"


    // $ANTLR start "rule__Contact__Group_6__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1924:1: rule__Contact__Group_6__1__Impl : ( ( rule__Contact__MailAssignment_6_1 ) ) ;
    public final void rule__Contact__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1928:1: ( ( ( rule__Contact__MailAssignment_6_1 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1929:1: ( ( rule__Contact__MailAssignment_6_1 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1929:1: ( ( rule__Contact__MailAssignment_6_1 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1930:1: ( rule__Contact__MailAssignment_6_1 )
            {
             before(grammarAccess.getContactAccess().getMailAssignment_6_1()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1931:1: ( rule__Contact__MailAssignment_6_1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1931:2: rule__Contact__MailAssignment_6_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Contact__MailAssignment_6_1_in_rule__Contact__Group_6__1__Impl3801);
            rule__Contact__MailAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getContactAccess().getMailAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Contact__Group_6__1__Impl"


    // $ANTLR start "rule__Contact__Group_7__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1945:1: rule__Contact__Group_7__0 : rule__Contact__Group_7__0__Impl rule__Contact__Group_7__1 ;
    public final void rule__Contact__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1949:1: ( rule__Contact__Group_7__0__Impl rule__Contact__Group_7__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1950:2: rule__Contact__Group_7__0__Impl rule__Contact__Group_7__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Contact__Group_7__0__Impl_in_rule__Contact__Group_7__03835);
            rule__Contact__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Contact__Group_7__1_in_rule__Contact__Group_7__03838);
            rule__Contact__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Contact__Group_7__0"


    // $ANTLR start "rule__Contact__Group_7__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1957:1: rule__Contact__Group_7__0__Impl : ( 'telephone' ) ;
    public final void rule__Contact__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1961:1: ( ( 'telephone' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1962:1: ( 'telephone' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1962:1: ( 'telephone' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1963:1: 'telephone'
            {
             before(grammarAccess.getContactAccess().getTelephoneKeyword_7_0()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__Contact__Group_7__0__Impl3866); 
             after(grammarAccess.getContactAccess().getTelephoneKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Contact__Group_7__0__Impl"


    // $ANTLR start "rule__Contact__Group_7__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1976:1: rule__Contact__Group_7__1 : rule__Contact__Group_7__1__Impl ;
    public final void rule__Contact__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1980:1: ( rule__Contact__Group_7__1__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1981:2: rule__Contact__Group_7__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Contact__Group_7__1__Impl_in_rule__Contact__Group_7__13897);
            rule__Contact__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Contact__Group_7__1"


    // $ANTLR start "rule__Contact__Group_7__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1987:1: rule__Contact__Group_7__1__Impl : ( ( rule__Contact__TelephoneAssignment_7_1 ) ) ;
    public final void rule__Contact__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1991:1: ( ( ( rule__Contact__TelephoneAssignment_7_1 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1992:1: ( ( rule__Contact__TelephoneAssignment_7_1 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1992:1: ( ( rule__Contact__TelephoneAssignment_7_1 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1993:1: ( rule__Contact__TelephoneAssignment_7_1 )
            {
             before(grammarAccess.getContactAccess().getTelephoneAssignment_7_1()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1994:1: ( rule__Contact__TelephoneAssignment_7_1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1994:2: rule__Contact__TelephoneAssignment_7_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Contact__TelephoneAssignment_7_1_in_rule__Contact__Group_7__1__Impl3924);
            rule__Contact__TelephoneAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getContactAccess().getTelephoneAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Contact__Group_7__1__Impl"


    // $ANTLR start "rule__Rubriques__Group__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2008:1: rule__Rubriques__Group__0 : rule__Rubriques__Group__0__Impl rule__Rubriques__Group__1 ;
    public final void rule__Rubriques__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2012:1: ( rule__Rubriques__Group__0__Impl rule__Rubriques__Group__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2013:2: rule__Rubriques__Group__0__Impl rule__Rubriques__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Rubriques__Group__0__Impl_in_rule__Rubriques__Group__03958);
            rule__Rubriques__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Rubriques__Group__1_in_rule__Rubriques__Group__03961);
            rule__Rubriques__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rubriques__Group__0"


    // $ANTLR start "rule__Rubriques__Group__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2020:1: rule__Rubriques__Group__0__Impl : ( () ) ;
    public final void rule__Rubriques__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2024:1: ( ( () ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2025:1: ( () )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2025:1: ( () )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2026:1: ()
            {
             before(grammarAccess.getRubriquesAccess().getRubriquesAction_0()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2027:1: ()
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2029:1: 
            {
            }

             after(grammarAccess.getRubriquesAccess().getRubriquesAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rubriques__Group__0__Impl"


    // $ANTLR start "rule__Rubriques__Group__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2039:1: rule__Rubriques__Group__1 : rule__Rubriques__Group__1__Impl rule__Rubriques__Group__2 ;
    public final void rule__Rubriques__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2043:1: ( rule__Rubriques__Group__1__Impl rule__Rubriques__Group__2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2044:2: rule__Rubriques__Group__1__Impl rule__Rubriques__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Rubriques__Group__1__Impl_in_rule__Rubriques__Group__14019);
            rule__Rubriques__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Rubriques__Group__2_in_rule__Rubriques__Group__14022);
            rule__Rubriques__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rubriques__Group__1"


    // $ANTLR start "rule__Rubriques__Group__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2051:1: rule__Rubriques__Group__1__Impl : ( 'Rubriques' ) ;
    public final void rule__Rubriques__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2055:1: ( ( 'Rubriques' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2056:1: ( 'Rubriques' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2056:1: ( 'Rubriques' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2057:1: 'Rubriques'
            {
             before(grammarAccess.getRubriquesAccess().getRubriquesKeyword_1()); 
            match(input,28,FollowSets000.FOLLOW_28_in_rule__Rubriques__Group__1__Impl4050); 
             after(grammarAccess.getRubriquesAccess().getRubriquesKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rubriques__Group__1__Impl"


    // $ANTLR start "rule__Rubriques__Group__2"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2070:1: rule__Rubriques__Group__2 : rule__Rubriques__Group__2__Impl rule__Rubriques__Group__3 ;
    public final void rule__Rubriques__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2074:1: ( rule__Rubriques__Group__2__Impl rule__Rubriques__Group__3 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2075:2: rule__Rubriques__Group__2__Impl rule__Rubriques__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Rubriques__Group__2__Impl_in_rule__Rubriques__Group__24081);
            rule__Rubriques__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Rubriques__Group__3_in_rule__Rubriques__Group__24084);
            rule__Rubriques__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rubriques__Group__2"


    // $ANTLR start "rule__Rubriques__Group__2__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2082:1: rule__Rubriques__Group__2__Impl : ( '{' ) ;
    public final void rule__Rubriques__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2086:1: ( ( '{' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2087:1: ( '{' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2087:1: ( '{' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2088:1: '{'
            {
             before(grammarAccess.getRubriquesAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Rubriques__Group__2__Impl4112); 
             after(grammarAccess.getRubriquesAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rubriques__Group__2__Impl"


    // $ANTLR start "rule__Rubriques__Group__3"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2101:1: rule__Rubriques__Group__3 : rule__Rubriques__Group__3__Impl rule__Rubriques__Group__4 ;
    public final void rule__Rubriques__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2105:1: ( rule__Rubriques__Group__3__Impl rule__Rubriques__Group__4 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2106:2: rule__Rubriques__Group__3__Impl rule__Rubriques__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Rubriques__Group__3__Impl_in_rule__Rubriques__Group__34143);
            rule__Rubriques__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Rubriques__Group__4_in_rule__Rubriques__Group__34146);
            rule__Rubriques__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rubriques__Group__3"


    // $ANTLR start "rule__Rubriques__Group__3__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2113:1: rule__Rubriques__Group__3__Impl : ( ( rule__Rubriques__Group_3__0 )? ) ;
    public final void rule__Rubriques__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2117:1: ( ( ( rule__Rubriques__Group_3__0 )? ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2118:1: ( ( rule__Rubriques__Group_3__0 )? )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2118:1: ( ( rule__Rubriques__Group_3__0 )? )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2119:1: ( rule__Rubriques__Group_3__0 )?
            {
             before(grammarAccess.getRubriquesAccess().getGroup_3()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2120:1: ( rule__Rubriques__Group_3__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==29) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2120:2: rule__Rubriques__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Rubriques__Group_3__0_in_rule__Rubriques__Group__3__Impl4173);
                    rule__Rubriques__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRubriquesAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rubriques__Group__3__Impl"


    // $ANTLR start "rule__Rubriques__Group__4"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2130:1: rule__Rubriques__Group__4 : rule__Rubriques__Group__4__Impl rule__Rubriques__Group__5 ;
    public final void rule__Rubriques__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2134:1: ( rule__Rubriques__Group__4__Impl rule__Rubriques__Group__5 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2135:2: rule__Rubriques__Group__4__Impl rule__Rubriques__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Rubriques__Group__4__Impl_in_rule__Rubriques__Group__44204);
            rule__Rubriques__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Rubriques__Group__5_in_rule__Rubriques__Group__44207);
            rule__Rubriques__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rubriques__Group__4"


    // $ANTLR start "rule__Rubriques__Group__4__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2142:1: rule__Rubriques__Group__4__Impl : ( ( rule__Rubriques__Group_4__0 )? ) ;
    public final void rule__Rubriques__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2146:1: ( ( ( rule__Rubriques__Group_4__0 )? ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2147:1: ( ( rule__Rubriques__Group_4__0 )? )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2147:1: ( ( rule__Rubriques__Group_4__0 )? )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2148:1: ( rule__Rubriques__Group_4__0 )?
            {
             before(grammarAccess.getRubriquesAccess().getGroup_4()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2149:1: ( rule__Rubriques__Group_4__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==30) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2149:2: rule__Rubriques__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Rubriques__Group_4__0_in_rule__Rubriques__Group__4__Impl4234);
                    rule__Rubriques__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRubriquesAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rubriques__Group__4__Impl"


    // $ANTLR start "rule__Rubriques__Group__5"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2159:1: rule__Rubriques__Group__5 : rule__Rubriques__Group__5__Impl ;
    public final void rule__Rubriques__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2163:1: ( rule__Rubriques__Group__5__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2164:2: rule__Rubriques__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Rubriques__Group__5__Impl_in_rule__Rubriques__Group__54265);
            rule__Rubriques__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rubriques__Group__5"


    // $ANTLR start "rule__Rubriques__Group__5__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2170:1: rule__Rubriques__Group__5__Impl : ( '}' ) ;
    public final void rule__Rubriques__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2174:1: ( ( '}' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2175:1: ( '}' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2175:1: ( '}' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2176:1: '}'
            {
             before(grammarAccess.getRubriquesAccess().getRightCurlyBracketKeyword_5()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__Rubriques__Group__5__Impl4293); 
             after(grammarAccess.getRubriquesAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rubriques__Group__5__Impl"


    // $ANTLR start "rule__Rubriques__Group_3__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2201:1: rule__Rubriques__Group_3__0 : rule__Rubriques__Group_3__0__Impl rule__Rubriques__Group_3__1 ;
    public final void rule__Rubriques__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2205:1: ( rule__Rubriques__Group_3__0__Impl rule__Rubriques__Group_3__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2206:2: rule__Rubriques__Group_3__0__Impl rule__Rubriques__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Rubriques__Group_3__0__Impl_in_rule__Rubriques__Group_3__04336);
            rule__Rubriques__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Rubriques__Group_3__1_in_rule__Rubriques__Group_3__04339);
            rule__Rubriques__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rubriques__Group_3__0"


    // $ANTLR start "rule__Rubriques__Group_3__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2213:1: rule__Rubriques__Group_3__0__Impl : ( 'texte' ) ;
    public final void rule__Rubriques__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2217:1: ( ( 'texte' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2218:1: ( 'texte' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2218:1: ( 'texte' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2219:1: 'texte'
            {
             before(grammarAccess.getRubriquesAccess().getTexteKeyword_3_0()); 
            match(input,29,FollowSets000.FOLLOW_29_in_rule__Rubriques__Group_3__0__Impl4367); 
             after(grammarAccess.getRubriquesAccess().getTexteKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rubriques__Group_3__0__Impl"


    // $ANTLR start "rule__Rubriques__Group_3__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2232:1: rule__Rubriques__Group_3__1 : rule__Rubriques__Group_3__1__Impl ;
    public final void rule__Rubriques__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2236:1: ( rule__Rubriques__Group_3__1__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2237:2: rule__Rubriques__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Rubriques__Group_3__1__Impl_in_rule__Rubriques__Group_3__14398);
            rule__Rubriques__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rubriques__Group_3__1"


    // $ANTLR start "rule__Rubriques__Group_3__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2243:1: rule__Rubriques__Group_3__1__Impl : ( ( rule__Rubriques__TexteAssignment_3_1 ) ) ;
    public final void rule__Rubriques__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2247:1: ( ( ( rule__Rubriques__TexteAssignment_3_1 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2248:1: ( ( rule__Rubriques__TexteAssignment_3_1 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2248:1: ( ( rule__Rubriques__TexteAssignment_3_1 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2249:1: ( rule__Rubriques__TexteAssignment_3_1 )
            {
             before(grammarAccess.getRubriquesAccess().getTexteAssignment_3_1()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2250:1: ( rule__Rubriques__TexteAssignment_3_1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2250:2: rule__Rubriques__TexteAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Rubriques__TexteAssignment_3_1_in_rule__Rubriques__Group_3__1__Impl4425);
            rule__Rubriques__TexteAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getRubriquesAccess().getTexteAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rubriques__Group_3__1__Impl"


    // $ANTLR start "rule__Rubriques__Group_4__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2264:1: rule__Rubriques__Group_4__0 : rule__Rubriques__Group_4__0__Impl rule__Rubriques__Group_4__1 ;
    public final void rule__Rubriques__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2268:1: ( rule__Rubriques__Group_4__0__Impl rule__Rubriques__Group_4__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2269:2: rule__Rubriques__Group_4__0__Impl rule__Rubriques__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Rubriques__Group_4__0__Impl_in_rule__Rubriques__Group_4__04459);
            rule__Rubriques__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Rubriques__Group_4__1_in_rule__Rubriques__Group_4__04462);
            rule__Rubriques__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rubriques__Group_4__0"


    // $ANTLR start "rule__Rubriques__Group_4__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2276:1: rule__Rubriques__Group_4__0__Impl : ( 'lien' ) ;
    public final void rule__Rubriques__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2280:1: ( ( 'lien' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2281:1: ( 'lien' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2281:1: ( 'lien' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2282:1: 'lien'
            {
             before(grammarAccess.getRubriquesAccess().getLienKeyword_4_0()); 
            match(input,30,FollowSets000.FOLLOW_30_in_rule__Rubriques__Group_4__0__Impl4490); 
             after(grammarAccess.getRubriquesAccess().getLienKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rubriques__Group_4__0__Impl"


    // $ANTLR start "rule__Rubriques__Group_4__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2295:1: rule__Rubriques__Group_4__1 : rule__Rubriques__Group_4__1__Impl ;
    public final void rule__Rubriques__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2299:1: ( rule__Rubriques__Group_4__1__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2300:2: rule__Rubriques__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Rubriques__Group_4__1__Impl_in_rule__Rubriques__Group_4__14521);
            rule__Rubriques__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rubriques__Group_4__1"


    // $ANTLR start "rule__Rubriques__Group_4__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2306:1: rule__Rubriques__Group_4__1__Impl : ( ( rule__Rubriques__LienAssignment_4_1 ) ) ;
    public final void rule__Rubriques__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2310:1: ( ( ( rule__Rubriques__LienAssignment_4_1 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2311:1: ( ( rule__Rubriques__LienAssignment_4_1 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2311:1: ( ( rule__Rubriques__LienAssignment_4_1 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2312:1: ( rule__Rubriques__LienAssignment_4_1 )
            {
             before(grammarAccess.getRubriquesAccess().getLienAssignment_4_1()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2313:1: ( rule__Rubriques__LienAssignment_4_1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2313:2: rule__Rubriques__LienAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Rubriques__LienAssignment_4_1_in_rule__Rubriques__Group_4__1__Impl4548);
            rule__Rubriques__LienAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getRubriquesAccess().getLienAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rubriques__Group_4__1__Impl"


    // $ANTLR start "rule__Fichiers__Group__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2327:1: rule__Fichiers__Group__0 : rule__Fichiers__Group__0__Impl rule__Fichiers__Group__1 ;
    public final void rule__Fichiers__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2331:1: ( rule__Fichiers__Group__0__Impl rule__Fichiers__Group__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2332:2: rule__Fichiers__Group__0__Impl rule__Fichiers__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Fichiers__Group__0__Impl_in_rule__Fichiers__Group__04582);
            rule__Fichiers__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Fichiers__Group__1_in_rule__Fichiers__Group__04585);
            rule__Fichiers__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fichiers__Group__0"


    // $ANTLR start "rule__Fichiers__Group__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2339:1: rule__Fichiers__Group__0__Impl : ( () ) ;
    public final void rule__Fichiers__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2343:1: ( ( () ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2344:1: ( () )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2344:1: ( () )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2345:1: ()
            {
             before(grammarAccess.getFichiersAccess().getFichiersAction_0()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2346:1: ()
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2348:1: 
            {
            }

             after(grammarAccess.getFichiersAccess().getFichiersAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fichiers__Group__0__Impl"


    // $ANTLR start "rule__Fichiers__Group__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2358:1: rule__Fichiers__Group__1 : rule__Fichiers__Group__1__Impl rule__Fichiers__Group__2 ;
    public final void rule__Fichiers__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2362:1: ( rule__Fichiers__Group__1__Impl rule__Fichiers__Group__2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2363:2: rule__Fichiers__Group__1__Impl rule__Fichiers__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Fichiers__Group__1__Impl_in_rule__Fichiers__Group__14643);
            rule__Fichiers__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Fichiers__Group__2_in_rule__Fichiers__Group__14646);
            rule__Fichiers__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fichiers__Group__1"


    // $ANTLR start "rule__Fichiers__Group__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2370:1: rule__Fichiers__Group__1__Impl : ( 'Fichiers' ) ;
    public final void rule__Fichiers__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2374:1: ( ( 'Fichiers' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2375:1: ( 'Fichiers' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2375:1: ( 'Fichiers' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2376:1: 'Fichiers'
            {
             before(grammarAccess.getFichiersAccess().getFichiersKeyword_1()); 
            match(input,31,FollowSets000.FOLLOW_31_in_rule__Fichiers__Group__1__Impl4674); 
             after(grammarAccess.getFichiersAccess().getFichiersKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fichiers__Group__1__Impl"


    // $ANTLR start "rule__Fichiers__Group__2"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2389:1: rule__Fichiers__Group__2 : rule__Fichiers__Group__2__Impl rule__Fichiers__Group__3 ;
    public final void rule__Fichiers__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2393:1: ( rule__Fichiers__Group__2__Impl rule__Fichiers__Group__3 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2394:2: rule__Fichiers__Group__2__Impl rule__Fichiers__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Fichiers__Group__2__Impl_in_rule__Fichiers__Group__24705);
            rule__Fichiers__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Fichiers__Group__3_in_rule__Fichiers__Group__24708);
            rule__Fichiers__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fichiers__Group__2"


    // $ANTLR start "rule__Fichiers__Group__2__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2401:1: rule__Fichiers__Group__2__Impl : ( '{' ) ;
    public final void rule__Fichiers__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2405:1: ( ( '{' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2406:1: ( '{' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2406:1: ( '{' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2407:1: '{'
            {
             before(grammarAccess.getFichiersAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Fichiers__Group__2__Impl4736); 
             after(grammarAccess.getFichiersAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fichiers__Group__2__Impl"


    // $ANTLR start "rule__Fichiers__Group__3"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2420:1: rule__Fichiers__Group__3 : rule__Fichiers__Group__3__Impl rule__Fichiers__Group__4 ;
    public final void rule__Fichiers__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2424:1: ( rule__Fichiers__Group__3__Impl rule__Fichiers__Group__4 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2425:2: rule__Fichiers__Group__3__Impl rule__Fichiers__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Fichiers__Group__3__Impl_in_rule__Fichiers__Group__34767);
            rule__Fichiers__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Fichiers__Group__4_in_rule__Fichiers__Group__34770);
            rule__Fichiers__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fichiers__Group__3"


    // $ANTLR start "rule__Fichiers__Group__3__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2432:1: rule__Fichiers__Group__3__Impl : ( ( rule__Fichiers__Group_3__0 )? ) ;
    public final void rule__Fichiers__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2436:1: ( ( ( rule__Fichiers__Group_3__0 )? ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2437:1: ( ( rule__Fichiers__Group_3__0 )? )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2437:1: ( ( rule__Fichiers__Group_3__0 )? )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2438:1: ( rule__Fichiers__Group_3__0 )?
            {
             before(grammarAccess.getFichiersAccess().getGroup_3()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2439:1: ( rule__Fichiers__Group_3__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==32) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2439:2: rule__Fichiers__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Fichiers__Group_3__0_in_rule__Fichiers__Group__3__Impl4797);
                    rule__Fichiers__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFichiersAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fichiers__Group__3__Impl"


    // $ANTLR start "rule__Fichiers__Group__4"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2449:1: rule__Fichiers__Group__4 : rule__Fichiers__Group__4__Impl rule__Fichiers__Group__5 ;
    public final void rule__Fichiers__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2453:1: ( rule__Fichiers__Group__4__Impl rule__Fichiers__Group__5 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2454:2: rule__Fichiers__Group__4__Impl rule__Fichiers__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Fichiers__Group__4__Impl_in_rule__Fichiers__Group__44828);
            rule__Fichiers__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Fichiers__Group__5_in_rule__Fichiers__Group__44831);
            rule__Fichiers__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fichiers__Group__4"


    // $ANTLR start "rule__Fichiers__Group__4__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2461:1: rule__Fichiers__Group__4__Impl : ( ( rule__Fichiers__Group_4__0 )? ) ;
    public final void rule__Fichiers__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2465:1: ( ( ( rule__Fichiers__Group_4__0 )? ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2466:1: ( ( rule__Fichiers__Group_4__0 )? )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2466:1: ( ( rule__Fichiers__Group_4__0 )? )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2467:1: ( rule__Fichiers__Group_4__0 )?
            {
             before(grammarAccess.getFichiersAccess().getGroup_4()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2468:1: ( rule__Fichiers__Group_4__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==33) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2468:2: rule__Fichiers__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Fichiers__Group_4__0_in_rule__Fichiers__Group__4__Impl4858);
                    rule__Fichiers__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFichiersAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fichiers__Group__4__Impl"


    // $ANTLR start "rule__Fichiers__Group__5"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2478:1: rule__Fichiers__Group__5 : rule__Fichiers__Group__5__Impl rule__Fichiers__Group__6 ;
    public final void rule__Fichiers__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2482:1: ( rule__Fichiers__Group__5__Impl rule__Fichiers__Group__6 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2483:2: rule__Fichiers__Group__5__Impl rule__Fichiers__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Fichiers__Group__5__Impl_in_rule__Fichiers__Group__54889);
            rule__Fichiers__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Fichiers__Group__6_in_rule__Fichiers__Group__54892);
            rule__Fichiers__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fichiers__Group__5"


    // $ANTLR start "rule__Fichiers__Group__5__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2490:1: rule__Fichiers__Group__5__Impl : ( ( rule__Fichiers__Group_5__0 )? ) ;
    public final void rule__Fichiers__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2494:1: ( ( ( rule__Fichiers__Group_5__0 )? ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2495:1: ( ( rule__Fichiers__Group_5__0 )? )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2495:1: ( ( rule__Fichiers__Group_5__0 )? )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2496:1: ( rule__Fichiers__Group_5__0 )?
            {
             before(grammarAccess.getFichiersAccess().getGroup_5()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2497:1: ( rule__Fichiers__Group_5__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==23) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2497:2: rule__Fichiers__Group_5__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Fichiers__Group_5__0_in_rule__Fichiers__Group__5__Impl4919);
                    rule__Fichiers__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFichiersAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fichiers__Group__5__Impl"


    // $ANTLR start "rule__Fichiers__Group__6"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2507:1: rule__Fichiers__Group__6 : rule__Fichiers__Group__6__Impl rule__Fichiers__Group__7 ;
    public final void rule__Fichiers__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2511:1: ( rule__Fichiers__Group__6__Impl rule__Fichiers__Group__7 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2512:2: rule__Fichiers__Group__6__Impl rule__Fichiers__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__Fichiers__Group__6__Impl_in_rule__Fichiers__Group__64950);
            rule__Fichiers__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Fichiers__Group__7_in_rule__Fichiers__Group__64953);
            rule__Fichiers__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fichiers__Group__6"


    // $ANTLR start "rule__Fichiers__Group__6__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2519:1: rule__Fichiers__Group__6__Impl : ( ( rule__Fichiers__Group_6__0 )? ) ;
    public final void rule__Fichiers__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2523:1: ( ( ( rule__Fichiers__Group_6__0 )? ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2524:1: ( ( rule__Fichiers__Group_6__0 )? )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2524:1: ( ( rule__Fichiers__Group_6__0 )? )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2525:1: ( rule__Fichiers__Group_6__0 )?
            {
             before(grammarAccess.getFichiersAccess().getGroup_6()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2526:1: ( rule__Fichiers__Group_6__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==34) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2526:2: rule__Fichiers__Group_6__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Fichiers__Group_6__0_in_rule__Fichiers__Group__6__Impl4980);
                    rule__Fichiers__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFichiersAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fichiers__Group__6__Impl"


    // $ANTLR start "rule__Fichiers__Group__7"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2536:1: rule__Fichiers__Group__7 : rule__Fichiers__Group__7__Impl ;
    public final void rule__Fichiers__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2540:1: ( rule__Fichiers__Group__7__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2541:2: rule__Fichiers__Group__7__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Fichiers__Group__7__Impl_in_rule__Fichiers__Group__75011);
            rule__Fichiers__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fichiers__Group__7"


    // $ANTLR start "rule__Fichiers__Group__7__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2547:1: rule__Fichiers__Group__7__Impl : ( '}' ) ;
    public final void rule__Fichiers__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2551:1: ( ( '}' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2552:1: ( '}' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2552:1: ( '}' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2553:1: '}'
            {
             before(grammarAccess.getFichiersAccess().getRightCurlyBracketKeyword_7()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__Fichiers__Group__7__Impl5039); 
             after(grammarAccess.getFichiersAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fichiers__Group__7__Impl"


    // $ANTLR start "rule__Fichiers__Group_3__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2582:1: rule__Fichiers__Group_3__0 : rule__Fichiers__Group_3__0__Impl rule__Fichiers__Group_3__1 ;
    public final void rule__Fichiers__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2586:1: ( rule__Fichiers__Group_3__0__Impl rule__Fichiers__Group_3__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2587:2: rule__Fichiers__Group_3__0__Impl rule__Fichiers__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Fichiers__Group_3__0__Impl_in_rule__Fichiers__Group_3__05086);
            rule__Fichiers__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Fichiers__Group_3__1_in_rule__Fichiers__Group_3__05089);
            rule__Fichiers__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fichiers__Group_3__0"


    // $ANTLR start "rule__Fichiers__Group_3__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2594:1: rule__Fichiers__Group_3__0__Impl : ( 'type' ) ;
    public final void rule__Fichiers__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2598:1: ( ( 'type' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2599:1: ( 'type' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2599:1: ( 'type' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2600:1: 'type'
            {
             before(grammarAccess.getFichiersAccess().getTypeKeyword_3_0()); 
            match(input,32,FollowSets000.FOLLOW_32_in_rule__Fichiers__Group_3__0__Impl5117); 
             after(grammarAccess.getFichiersAccess().getTypeKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fichiers__Group_3__0__Impl"


    // $ANTLR start "rule__Fichiers__Group_3__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2613:1: rule__Fichiers__Group_3__1 : rule__Fichiers__Group_3__1__Impl ;
    public final void rule__Fichiers__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2617:1: ( rule__Fichiers__Group_3__1__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2618:2: rule__Fichiers__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Fichiers__Group_3__1__Impl_in_rule__Fichiers__Group_3__15148);
            rule__Fichiers__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fichiers__Group_3__1"


    // $ANTLR start "rule__Fichiers__Group_3__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2624:1: rule__Fichiers__Group_3__1__Impl : ( ( rule__Fichiers__TypeAssignment_3_1 ) ) ;
    public final void rule__Fichiers__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2628:1: ( ( ( rule__Fichiers__TypeAssignment_3_1 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2629:1: ( ( rule__Fichiers__TypeAssignment_3_1 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2629:1: ( ( rule__Fichiers__TypeAssignment_3_1 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2630:1: ( rule__Fichiers__TypeAssignment_3_1 )
            {
             before(grammarAccess.getFichiersAccess().getTypeAssignment_3_1()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2631:1: ( rule__Fichiers__TypeAssignment_3_1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2631:2: rule__Fichiers__TypeAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Fichiers__TypeAssignment_3_1_in_rule__Fichiers__Group_3__1__Impl5175);
            rule__Fichiers__TypeAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getFichiersAccess().getTypeAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fichiers__Group_3__1__Impl"


    // $ANTLR start "rule__Fichiers__Group_4__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2645:1: rule__Fichiers__Group_4__0 : rule__Fichiers__Group_4__0__Impl rule__Fichiers__Group_4__1 ;
    public final void rule__Fichiers__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2649:1: ( rule__Fichiers__Group_4__0__Impl rule__Fichiers__Group_4__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2650:2: rule__Fichiers__Group_4__0__Impl rule__Fichiers__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Fichiers__Group_4__0__Impl_in_rule__Fichiers__Group_4__05209);
            rule__Fichiers__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Fichiers__Group_4__1_in_rule__Fichiers__Group_4__05212);
            rule__Fichiers__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fichiers__Group_4__0"


    // $ANTLR start "rule__Fichiers__Group_4__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2657:1: rule__Fichiers__Group_4__0__Impl : ( 'taille' ) ;
    public final void rule__Fichiers__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2661:1: ( ( 'taille' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2662:1: ( 'taille' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2662:1: ( 'taille' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2663:1: 'taille'
            {
             before(grammarAccess.getFichiersAccess().getTailleKeyword_4_0()); 
            match(input,33,FollowSets000.FOLLOW_33_in_rule__Fichiers__Group_4__0__Impl5240); 
             after(grammarAccess.getFichiersAccess().getTailleKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fichiers__Group_4__0__Impl"


    // $ANTLR start "rule__Fichiers__Group_4__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2676:1: rule__Fichiers__Group_4__1 : rule__Fichiers__Group_4__1__Impl ;
    public final void rule__Fichiers__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2680:1: ( rule__Fichiers__Group_4__1__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2681:2: rule__Fichiers__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Fichiers__Group_4__1__Impl_in_rule__Fichiers__Group_4__15271);
            rule__Fichiers__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fichiers__Group_4__1"


    // $ANTLR start "rule__Fichiers__Group_4__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2687:1: rule__Fichiers__Group_4__1__Impl : ( ( rule__Fichiers__TailleAssignment_4_1 ) ) ;
    public final void rule__Fichiers__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2691:1: ( ( ( rule__Fichiers__TailleAssignment_4_1 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2692:1: ( ( rule__Fichiers__TailleAssignment_4_1 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2692:1: ( ( rule__Fichiers__TailleAssignment_4_1 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2693:1: ( rule__Fichiers__TailleAssignment_4_1 )
            {
             before(grammarAccess.getFichiersAccess().getTailleAssignment_4_1()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2694:1: ( rule__Fichiers__TailleAssignment_4_1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2694:2: rule__Fichiers__TailleAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Fichiers__TailleAssignment_4_1_in_rule__Fichiers__Group_4__1__Impl5298);
            rule__Fichiers__TailleAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getFichiersAccess().getTailleAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fichiers__Group_4__1__Impl"


    // $ANTLR start "rule__Fichiers__Group_5__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2708:1: rule__Fichiers__Group_5__0 : rule__Fichiers__Group_5__0__Impl rule__Fichiers__Group_5__1 ;
    public final void rule__Fichiers__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2712:1: ( rule__Fichiers__Group_5__0__Impl rule__Fichiers__Group_5__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2713:2: rule__Fichiers__Group_5__0__Impl rule__Fichiers__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Fichiers__Group_5__0__Impl_in_rule__Fichiers__Group_5__05332);
            rule__Fichiers__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Fichiers__Group_5__1_in_rule__Fichiers__Group_5__05335);
            rule__Fichiers__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fichiers__Group_5__0"


    // $ANTLR start "rule__Fichiers__Group_5__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2720:1: rule__Fichiers__Group_5__0__Impl : ( 'nom' ) ;
    public final void rule__Fichiers__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2724:1: ( ( 'nom' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2725:1: ( 'nom' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2725:1: ( 'nom' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2726:1: 'nom'
            {
             before(grammarAccess.getFichiersAccess().getNomKeyword_5_0()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__Fichiers__Group_5__0__Impl5363); 
             after(grammarAccess.getFichiersAccess().getNomKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fichiers__Group_5__0__Impl"


    // $ANTLR start "rule__Fichiers__Group_5__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2739:1: rule__Fichiers__Group_5__1 : rule__Fichiers__Group_5__1__Impl ;
    public final void rule__Fichiers__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2743:1: ( rule__Fichiers__Group_5__1__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2744:2: rule__Fichiers__Group_5__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Fichiers__Group_5__1__Impl_in_rule__Fichiers__Group_5__15394);
            rule__Fichiers__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fichiers__Group_5__1"


    // $ANTLR start "rule__Fichiers__Group_5__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2750:1: rule__Fichiers__Group_5__1__Impl : ( ( rule__Fichiers__NomAssignment_5_1 ) ) ;
    public final void rule__Fichiers__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2754:1: ( ( ( rule__Fichiers__NomAssignment_5_1 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2755:1: ( ( rule__Fichiers__NomAssignment_5_1 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2755:1: ( ( rule__Fichiers__NomAssignment_5_1 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2756:1: ( rule__Fichiers__NomAssignment_5_1 )
            {
             before(grammarAccess.getFichiersAccess().getNomAssignment_5_1()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2757:1: ( rule__Fichiers__NomAssignment_5_1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2757:2: rule__Fichiers__NomAssignment_5_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Fichiers__NomAssignment_5_1_in_rule__Fichiers__Group_5__1__Impl5421);
            rule__Fichiers__NomAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getFichiersAccess().getNomAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fichiers__Group_5__1__Impl"


    // $ANTLR start "rule__Fichiers__Group_6__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2771:1: rule__Fichiers__Group_6__0 : rule__Fichiers__Group_6__0__Impl rule__Fichiers__Group_6__1 ;
    public final void rule__Fichiers__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2775:1: ( rule__Fichiers__Group_6__0__Impl rule__Fichiers__Group_6__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2776:2: rule__Fichiers__Group_6__0__Impl rule__Fichiers__Group_6__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Fichiers__Group_6__0__Impl_in_rule__Fichiers__Group_6__05455);
            rule__Fichiers__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Fichiers__Group_6__1_in_rule__Fichiers__Group_6__05458);
            rule__Fichiers__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fichiers__Group_6__0"


    // $ANTLR start "rule__Fichiers__Group_6__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2783:1: rule__Fichiers__Group_6__0__Impl : ( 'emplacement' ) ;
    public final void rule__Fichiers__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2787:1: ( ( 'emplacement' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2788:1: ( 'emplacement' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2788:1: ( 'emplacement' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2789:1: 'emplacement'
            {
             before(grammarAccess.getFichiersAccess().getEmplacementKeyword_6_0()); 
            match(input,34,FollowSets000.FOLLOW_34_in_rule__Fichiers__Group_6__0__Impl5486); 
             after(grammarAccess.getFichiersAccess().getEmplacementKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fichiers__Group_6__0__Impl"


    // $ANTLR start "rule__Fichiers__Group_6__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2802:1: rule__Fichiers__Group_6__1 : rule__Fichiers__Group_6__1__Impl ;
    public final void rule__Fichiers__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2806:1: ( rule__Fichiers__Group_6__1__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2807:2: rule__Fichiers__Group_6__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Fichiers__Group_6__1__Impl_in_rule__Fichiers__Group_6__15517);
            rule__Fichiers__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fichiers__Group_6__1"


    // $ANTLR start "rule__Fichiers__Group_6__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2813:1: rule__Fichiers__Group_6__1__Impl : ( ( rule__Fichiers__EmplacementAssignment_6_1 ) ) ;
    public final void rule__Fichiers__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2817:1: ( ( ( rule__Fichiers__EmplacementAssignment_6_1 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2818:1: ( ( rule__Fichiers__EmplacementAssignment_6_1 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2818:1: ( ( rule__Fichiers__EmplacementAssignment_6_1 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2819:1: ( rule__Fichiers__EmplacementAssignment_6_1 )
            {
             before(grammarAccess.getFichiersAccess().getEmplacementAssignment_6_1()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2820:1: ( rule__Fichiers__EmplacementAssignment_6_1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2820:2: rule__Fichiers__EmplacementAssignment_6_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Fichiers__EmplacementAssignment_6_1_in_rule__Fichiers__Group_6__1__Impl5544);
            rule__Fichiers__EmplacementAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getFichiersAccess().getEmplacementAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fichiers__Group_6__1__Impl"


    // $ANTLR start "rule__ConfigurationPage__Group__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2834:1: rule__ConfigurationPage__Group__0 : rule__ConfigurationPage__Group__0__Impl rule__ConfigurationPage__Group__1 ;
    public final void rule__ConfigurationPage__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2838:1: ( rule__ConfigurationPage__Group__0__Impl rule__ConfigurationPage__Group__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2839:2: rule__ConfigurationPage__Group__0__Impl rule__ConfigurationPage__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConfigurationPage__Group__0__Impl_in_rule__ConfigurationPage__Group__05578);
            rule__ConfigurationPage__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ConfigurationPage__Group__1_in_rule__ConfigurationPage__Group__05581);
            rule__ConfigurationPage__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigurationPage__Group__0"


    // $ANTLR start "rule__ConfigurationPage__Group__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2846:1: rule__ConfigurationPage__Group__0__Impl : ( () ) ;
    public final void rule__ConfigurationPage__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2850:1: ( ( () ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2851:1: ( () )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2851:1: ( () )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2852:1: ()
            {
             before(grammarAccess.getConfigurationPageAccess().getConfigurationPageAction_0()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2853:1: ()
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2855:1: 
            {
            }

             after(grammarAccess.getConfigurationPageAccess().getConfigurationPageAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigurationPage__Group__0__Impl"


    // $ANTLR start "rule__ConfigurationPage__Group__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2865:1: rule__ConfigurationPage__Group__1 : rule__ConfigurationPage__Group__1__Impl rule__ConfigurationPage__Group__2 ;
    public final void rule__ConfigurationPage__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2869:1: ( rule__ConfigurationPage__Group__1__Impl rule__ConfigurationPage__Group__2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2870:2: rule__ConfigurationPage__Group__1__Impl rule__ConfigurationPage__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConfigurationPage__Group__1__Impl_in_rule__ConfigurationPage__Group__15639);
            rule__ConfigurationPage__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ConfigurationPage__Group__2_in_rule__ConfigurationPage__Group__15642);
            rule__ConfigurationPage__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigurationPage__Group__1"


    // $ANTLR start "rule__ConfigurationPage__Group__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2877:1: rule__ConfigurationPage__Group__1__Impl : ( 'ConfigurationPage' ) ;
    public final void rule__ConfigurationPage__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2881:1: ( ( 'ConfigurationPage' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2882:1: ( 'ConfigurationPage' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2882:1: ( 'ConfigurationPage' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2883:1: 'ConfigurationPage'
            {
             before(grammarAccess.getConfigurationPageAccess().getConfigurationPageKeyword_1()); 
            match(input,35,FollowSets000.FOLLOW_35_in_rule__ConfigurationPage__Group__1__Impl5670); 
             after(grammarAccess.getConfigurationPageAccess().getConfigurationPageKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigurationPage__Group__1__Impl"


    // $ANTLR start "rule__ConfigurationPage__Group__2"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2896:1: rule__ConfigurationPage__Group__2 : rule__ConfigurationPage__Group__2__Impl rule__ConfigurationPage__Group__3 ;
    public final void rule__ConfigurationPage__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2900:1: ( rule__ConfigurationPage__Group__2__Impl rule__ConfigurationPage__Group__3 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2901:2: rule__ConfigurationPage__Group__2__Impl rule__ConfigurationPage__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConfigurationPage__Group__2__Impl_in_rule__ConfigurationPage__Group__25701);
            rule__ConfigurationPage__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ConfigurationPage__Group__3_in_rule__ConfigurationPage__Group__25704);
            rule__ConfigurationPage__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigurationPage__Group__2"


    // $ANTLR start "rule__ConfigurationPage__Group__2__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2908:1: rule__ConfigurationPage__Group__2__Impl : ( '{' ) ;
    public final void rule__ConfigurationPage__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2912:1: ( ( '{' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2913:1: ( '{' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2913:1: ( '{' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2914:1: '{'
            {
             before(grammarAccess.getConfigurationPageAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__ConfigurationPage__Group__2__Impl5732); 
             after(grammarAccess.getConfigurationPageAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigurationPage__Group__2__Impl"


    // $ANTLR start "rule__ConfigurationPage__Group__3"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2927:1: rule__ConfigurationPage__Group__3 : rule__ConfigurationPage__Group__3__Impl rule__ConfigurationPage__Group__4 ;
    public final void rule__ConfigurationPage__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2931:1: ( rule__ConfigurationPage__Group__3__Impl rule__ConfigurationPage__Group__4 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2932:2: rule__ConfigurationPage__Group__3__Impl rule__ConfigurationPage__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConfigurationPage__Group__3__Impl_in_rule__ConfigurationPage__Group__35763);
            rule__ConfigurationPage__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ConfigurationPage__Group__4_in_rule__ConfigurationPage__Group__35766);
            rule__ConfigurationPage__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigurationPage__Group__3"


    // $ANTLR start "rule__ConfigurationPage__Group__3__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2939:1: rule__ConfigurationPage__Group__3__Impl : ( ( rule__ConfigurationPage__Group_3__0 )? ) ;
    public final void rule__ConfigurationPage__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2943:1: ( ( ( rule__ConfigurationPage__Group_3__0 )? ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2944:1: ( ( rule__ConfigurationPage__Group_3__0 )? )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2944:1: ( ( rule__ConfigurationPage__Group_3__0 )? )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2945:1: ( rule__ConfigurationPage__Group_3__0 )?
            {
             before(grammarAccess.getConfigurationPageAccess().getGroup_3()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2946:1: ( rule__ConfigurationPage__Group_3__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==36) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2946:2: rule__ConfigurationPage__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__ConfigurationPage__Group_3__0_in_rule__ConfigurationPage__Group__3__Impl5793);
                    rule__ConfigurationPage__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConfigurationPageAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigurationPage__Group__3__Impl"


    // $ANTLR start "rule__ConfigurationPage__Group__4"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2956:1: rule__ConfigurationPage__Group__4 : rule__ConfigurationPage__Group__4__Impl rule__ConfigurationPage__Group__5 ;
    public final void rule__ConfigurationPage__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2960:1: ( rule__ConfigurationPage__Group__4__Impl rule__ConfigurationPage__Group__5 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2961:2: rule__ConfigurationPage__Group__4__Impl rule__ConfigurationPage__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConfigurationPage__Group__4__Impl_in_rule__ConfigurationPage__Group__45824);
            rule__ConfigurationPage__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ConfigurationPage__Group__5_in_rule__ConfigurationPage__Group__45827);
            rule__ConfigurationPage__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigurationPage__Group__4"


    // $ANTLR start "rule__ConfigurationPage__Group__4__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2968:1: rule__ConfigurationPage__Group__4__Impl : ( ( rule__ConfigurationPage__Group_4__0 )? ) ;
    public final void rule__ConfigurationPage__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2972:1: ( ( ( rule__ConfigurationPage__Group_4__0 )? ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2973:1: ( ( rule__ConfigurationPage__Group_4__0 )? )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2973:1: ( ( rule__ConfigurationPage__Group_4__0 )? )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2974:1: ( rule__ConfigurationPage__Group_4__0 )?
            {
             before(grammarAccess.getConfigurationPageAccess().getGroup_4()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2975:1: ( rule__ConfigurationPage__Group_4__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==37) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2975:2: rule__ConfigurationPage__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__ConfigurationPage__Group_4__0_in_rule__ConfigurationPage__Group__4__Impl5854);
                    rule__ConfigurationPage__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConfigurationPageAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigurationPage__Group__4__Impl"


    // $ANTLR start "rule__ConfigurationPage__Group__5"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2985:1: rule__ConfigurationPage__Group__5 : rule__ConfigurationPage__Group__5__Impl rule__ConfigurationPage__Group__6 ;
    public final void rule__ConfigurationPage__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2989:1: ( rule__ConfigurationPage__Group__5__Impl rule__ConfigurationPage__Group__6 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2990:2: rule__ConfigurationPage__Group__5__Impl rule__ConfigurationPage__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConfigurationPage__Group__5__Impl_in_rule__ConfigurationPage__Group__55885);
            rule__ConfigurationPage__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ConfigurationPage__Group__6_in_rule__ConfigurationPage__Group__55888);
            rule__ConfigurationPage__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigurationPage__Group__5"


    // $ANTLR start "rule__ConfigurationPage__Group__5__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2997:1: rule__ConfigurationPage__Group__5__Impl : ( ( rule__ConfigurationPage__Group_5__0 )? ) ;
    public final void rule__ConfigurationPage__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3001:1: ( ( ( rule__ConfigurationPage__Group_5__0 )? ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3002:1: ( ( rule__ConfigurationPage__Group_5__0 )? )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3002:1: ( ( rule__ConfigurationPage__Group_5__0 )? )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3003:1: ( rule__ConfigurationPage__Group_5__0 )?
            {
             before(grammarAccess.getConfigurationPageAccess().getGroup_5()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3004:1: ( rule__ConfigurationPage__Group_5__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==38) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3004:2: rule__ConfigurationPage__Group_5__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__ConfigurationPage__Group_5__0_in_rule__ConfigurationPage__Group__5__Impl5915);
                    rule__ConfigurationPage__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConfigurationPageAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigurationPage__Group__5__Impl"


    // $ANTLR start "rule__ConfigurationPage__Group__6"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3014:1: rule__ConfigurationPage__Group__6 : rule__ConfigurationPage__Group__6__Impl rule__ConfigurationPage__Group__7 ;
    public final void rule__ConfigurationPage__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3018:1: ( rule__ConfigurationPage__Group__6__Impl rule__ConfigurationPage__Group__7 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3019:2: rule__ConfigurationPage__Group__6__Impl rule__ConfigurationPage__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConfigurationPage__Group__6__Impl_in_rule__ConfigurationPage__Group__65946);
            rule__ConfigurationPage__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ConfigurationPage__Group__7_in_rule__ConfigurationPage__Group__65949);
            rule__ConfigurationPage__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigurationPage__Group__6"


    // $ANTLR start "rule__ConfigurationPage__Group__6__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3026:1: rule__ConfigurationPage__Group__6__Impl : ( ( rule__ConfigurationPage__Group_6__0 )? ) ;
    public final void rule__ConfigurationPage__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3030:1: ( ( ( rule__ConfigurationPage__Group_6__0 )? ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3031:1: ( ( rule__ConfigurationPage__Group_6__0 )? )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3031:1: ( ( rule__ConfigurationPage__Group_6__0 )? )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3032:1: ( rule__ConfigurationPage__Group_6__0 )?
            {
             before(grammarAccess.getConfigurationPageAccess().getGroup_6()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3033:1: ( rule__ConfigurationPage__Group_6__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==39) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3033:2: rule__ConfigurationPage__Group_6__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__ConfigurationPage__Group_6__0_in_rule__ConfigurationPage__Group__6__Impl5976);
                    rule__ConfigurationPage__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConfigurationPageAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigurationPage__Group__6__Impl"


    // $ANTLR start "rule__ConfigurationPage__Group__7"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3043:1: rule__ConfigurationPage__Group__7 : rule__ConfigurationPage__Group__7__Impl rule__ConfigurationPage__Group__8 ;
    public final void rule__ConfigurationPage__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3047:1: ( rule__ConfigurationPage__Group__7__Impl rule__ConfigurationPage__Group__8 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3048:2: rule__ConfigurationPage__Group__7__Impl rule__ConfigurationPage__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConfigurationPage__Group__7__Impl_in_rule__ConfigurationPage__Group__76007);
            rule__ConfigurationPage__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ConfigurationPage__Group__8_in_rule__ConfigurationPage__Group__76010);
            rule__ConfigurationPage__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigurationPage__Group__7"


    // $ANTLR start "rule__ConfigurationPage__Group__7__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3055:1: rule__ConfigurationPage__Group__7__Impl : ( ( rule__ConfigurationPage__Group_7__0 )? ) ;
    public final void rule__ConfigurationPage__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3059:1: ( ( ( rule__ConfigurationPage__Group_7__0 )? ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3060:1: ( ( rule__ConfigurationPage__Group_7__0 )? )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3060:1: ( ( rule__ConfigurationPage__Group_7__0 )? )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3061:1: ( rule__ConfigurationPage__Group_7__0 )?
            {
             before(grammarAccess.getConfigurationPageAccess().getGroup_7()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3062:1: ( rule__ConfigurationPage__Group_7__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==40) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3062:2: rule__ConfigurationPage__Group_7__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__ConfigurationPage__Group_7__0_in_rule__ConfigurationPage__Group__7__Impl6037);
                    rule__ConfigurationPage__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConfigurationPageAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigurationPage__Group__7__Impl"


    // $ANTLR start "rule__ConfigurationPage__Group__8"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3072:1: rule__ConfigurationPage__Group__8 : rule__ConfigurationPage__Group__8__Impl ;
    public final void rule__ConfigurationPage__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3076:1: ( rule__ConfigurationPage__Group__8__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3077:2: rule__ConfigurationPage__Group__8__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConfigurationPage__Group__8__Impl_in_rule__ConfigurationPage__Group__86068);
            rule__ConfigurationPage__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigurationPage__Group__8"


    // $ANTLR start "rule__ConfigurationPage__Group__8__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3083:1: rule__ConfigurationPage__Group__8__Impl : ( '}' ) ;
    public final void rule__ConfigurationPage__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3087:1: ( ( '}' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3088:1: ( '}' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3088:1: ( '}' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3089:1: '}'
            {
             before(grammarAccess.getConfigurationPageAccess().getRightCurlyBracketKeyword_8()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__ConfigurationPage__Group__8__Impl6096); 
             after(grammarAccess.getConfigurationPageAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigurationPage__Group__8__Impl"


    // $ANTLR start "rule__ConfigurationPage__Group_3__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3120:1: rule__ConfigurationPage__Group_3__0 : rule__ConfigurationPage__Group_3__0__Impl rule__ConfigurationPage__Group_3__1 ;
    public final void rule__ConfigurationPage__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3124:1: ( rule__ConfigurationPage__Group_3__0__Impl rule__ConfigurationPage__Group_3__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3125:2: rule__ConfigurationPage__Group_3__0__Impl rule__ConfigurationPage__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConfigurationPage__Group_3__0__Impl_in_rule__ConfigurationPage__Group_3__06145);
            rule__ConfigurationPage__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ConfigurationPage__Group_3__1_in_rule__ConfigurationPage__Group_3__06148);
            rule__ConfigurationPage__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigurationPage__Group_3__0"


    // $ANTLR start "rule__ConfigurationPage__Group_3__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3132:1: rule__ConfigurationPage__Group_3__0__Impl : ( 'couleurFond' ) ;
    public final void rule__ConfigurationPage__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3136:1: ( ( 'couleurFond' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3137:1: ( 'couleurFond' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3137:1: ( 'couleurFond' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3138:1: 'couleurFond'
            {
             before(grammarAccess.getConfigurationPageAccess().getCouleurFondKeyword_3_0()); 
            match(input,36,FollowSets000.FOLLOW_36_in_rule__ConfigurationPage__Group_3__0__Impl6176); 
             after(grammarAccess.getConfigurationPageAccess().getCouleurFondKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigurationPage__Group_3__0__Impl"


    // $ANTLR start "rule__ConfigurationPage__Group_3__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3151:1: rule__ConfigurationPage__Group_3__1 : rule__ConfigurationPage__Group_3__1__Impl ;
    public final void rule__ConfigurationPage__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3155:1: ( rule__ConfigurationPage__Group_3__1__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3156:2: rule__ConfigurationPage__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConfigurationPage__Group_3__1__Impl_in_rule__ConfigurationPage__Group_3__16207);
            rule__ConfigurationPage__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigurationPage__Group_3__1"


    // $ANTLR start "rule__ConfigurationPage__Group_3__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3162:1: rule__ConfigurationPage__Group_3__1__Impl : ( ( rule__ConfigurationPage__CouleurFondAssignment_3_1 ) ) ;
    public final void rule__ConfigurationPage__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3166:1: ( ( ( rule__ConfigurationPage__CouleurFondAssignment_3_1 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3167:1: ( ( rule__ConfigurationPage__CouleurFondAssignment_3_1 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3167:1: ( ( rule__ConfigurationPage__CouleurFondAssignment_3_1 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3168:1: ( rule__ConfigurationPage__CouleurFondAssignment_3_1 )
            {
             before(grammarAccess.getConfigurationPageAccess().getCouleurFondAssignment_3_1()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3169:1: ( rule__ConfigurationPage__CouleurFondAssignment_3_1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3169:2: rule__ConfigurationPage__CouleurFondAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConfigurationPage__CouleurFondAssignment_3_1_in_rule__ConfigurationPage__Group_3__1__Impl6234);
            rule__ConfigurationPage__CouleurFondAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getConfigurationPageAccess().getCouleurFondAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigurationPage__Group_3__1__Impl"


    // $ANTLR start "rule__ConfigurationPage__Group_4__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3183:1: rule__ConfigurationPage__Group_4__0 : rule__ConfigurationPage__Group_4__0__Impl rule__ConfigurationPage__Group_4__1 ;
    public final void rule__ConfigurationPage__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3187:1: ( rule__ConfigurationPage__Group_4__0__Impl rule__ConfigurationPage__Group_4__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3188:2: rule__ConfigurationPage__Group_4__0__Impl rule__ConfigurationPage__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConfigurationPage__Group_4__0__Impl_in_rule__ConfigurationPage__Group_4__06268);
            rule__ConfigurationPage__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ConfigurationPage__Group_4__1_in_rule__ConfigurationPage__Group_4__06271);
            rule__ConfigurationPage__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigurationPage__Group_4__0"


    // $ANTLR start "rule__ConfigurationPage__Group_4__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3195:1: rule__ConfigurationPage__Group_4__0__Impl : ( 'titreSite' ) ;
    public final void rule__ConfigurationPage__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3199:1: ( ( 'titreSite' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3200:1: ( 'titreSite' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3200:1: ( 'titreSite' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3201:1: 'titreSite'
            {
             before(grammarAccess.getConfigurationPageAccess().getTitreSiteKeyword_4_0()); 
            match(input,37,FollowSets000.FOLLOW_37_in_rule__ConfigurationPage__Group_4__0__Impl6299); 
             after(grammarAccess.getConfigurationPageAccess().getTitreSiteKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigurationPage__Group_4__0__Impl"


    // $ANTLR start "rule__ConfigurationPage__Group_4__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3214:1: rule__ConfigurationPage__Group_4__1 : rule__ConfigurationPage__Group_4__1__Impl ;
    public final void rule__ConfigurationPage__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3218:1: ( rule__ConfigurationPage__Group_4__1__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3219:2: rule__ConfigurationPage__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConfigurationPage__Group_4__1__Impl_in_rule__ConfigurationPage__Group_4__16330);
            rule__ConfigurationPage__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigurationPage__Group_4__1"


    // $ANTLR start "rule__ConfigurationPage__Group_4__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3225:1: rule__ConfigurationPage__Group_4__1__Impl : ( ( rule__ConfigurationPage__TitreSiteAssignment_4_1 ) ) ;
    public final void rule__ConfigurationPage__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3229:1: ( ( ( rule__ConfigurationPage__TitreSiteAssignment_4_1 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3230:1: ( ( rule__ConfigurationPage__TitreSiteAssignment_4_1 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3230:1: ( ( rule__ConfigurationPage__TitreSiteAssignment_4_1 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3231:1: ( rule__ConfigurationPage__TitreSiteAssignment_4_1 )
            {
             before(grammarAccess.getConfigurationPageAccess().getTitreSiteAssignment_4_1()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3232:1: ( rule__ConfigurationPage__TitreSiteAssignment_4_1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3232:2: rule__ConfigurationPage__TitreSiteAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConfigurationPage__TitreSiteAssignment_4_1_in_rule__ConfigurationPage__Group_4__1__Impl6357);
            rule__ConfigurationPage__TitreSiteAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getConfigurationPageAccess().getTitreSiteAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigurationPage__Group_4__1__Impl"


    // $ANTLR start "rule__ConfigurationPage__Group_5__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3246:1: rule__ConfigurationPage__Group_5__0 : rule__ConfigurationPage__Group_5__0__Impl rule__ConfigurationPage__Group_5__1 ;
    public final void rule__ConfigurationPage__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3250:1: ( rule__ConfigurationPage__Group_5__0__Impl rule__ConfigurationPage__Group_5__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3251:2: rule__ConfigurationPage__Group_5__0__Impl rule__ConfigurationPage__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConfigurationPage__Group_5__0__Impl_in_rule__ConfigurationPage__Group_5__06391);
            rule__ConfigurationPage__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ConfigurationPage__Group_5__1_in_rule__ConfigurationPage__Group_5__06394);
            rule__ConfigurationPage__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigurationPage__Group_5__0"


    // $ANTLR start "rule__ConfigurationPage__Group_5__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3258:1: rule__ConfigurationPage__Group_5__0__Impl : ( 'auteurs' ) ;
    public final void rule__ConfigurationPage__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3262:1: ( ( 'auteurs' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3263:1: ( 'auteurs' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3263:1: ( 'auteurs' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3264:1: 'auteurs'
            {
             before(grammarAccess.getConfigurationPageAccess().getAuteursKeyword_5_0()); 
            match(input,38,FollowSets000.FOLLOW_38_in_rule__ConfigurationPage__Group_5__0__Impl6422); 
             after(grammarAccess.getConfigurationPageAccess().getAuteursKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigurationPage__Group_5__0__Impl"


    // $ANTLR start "rule__ConfigurationPage__Group_5__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3277:1: rule__ConfigurationPage__Group_5__1 : rule__ConfigurationPage__Group_5__1__Impl ;
    public final void rule__ConfigurationPage__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3281:1: ( rule__ConfigurationPage__Group_5__1__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3282:2: rule__ConfigurationPage__Group_5__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConfigurationPage__Group_5__1__Impl_in_rule__ConfigurationPage__Group_5__16453);
            rule__ConfigurationPage__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigurationPage__Group_5__1"


    // $ANTLR start "rule__ConfigurationPage__Group_5__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3288:1: rule__ConfigurationPage__Group_5__1__Impl : ( ( rule__ConfigurationPage__AuteursAssignment_5_1 ) ) ;
    public final void rule__ConfigurationPage__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3292:1: ( ( ( rule__ConfigurationPage__AuteursAssignment_5_1 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3293:1: ( ( rule__ConfigurationPage__AuteursAssignment_5_1 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3293:1: ( ( rule__ConfigurationPage__AuteursAssignment_5_1 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3294:1: ( rule__ConfigurationPage__AuteursAssignment_5_1 )
            {
             before(grammarAccess.getConfigurationPageAccess().getAuteursAssignment_5_1()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3295:1: ( rule__ConfigurationPage__AuteursAssignment_5_1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3295:2: rule__ConfigurationPage__AuteursAssignment_5_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConfigurationPage__AuteursAssignment_5_1_in_rule__ConfigurationPage__Group_5__1__Impl6480);
            rule__ConfigurationPage__AuteursAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getConfigurationPageAccess().getAuteursAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigurationPage__Group_5__1__Impl"


    // $ANTLR start "rule__ConfigurationPage__Group_6__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3309:1: rule__ConfigurationPage__Group_6__0 : rule__ConfigurationPage__Group_6__0__Impl rule__ConfigurationPage__Group_6__1 ;
    public final void rule__ConfigurationPage__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3313:1: ( rule__ConfigurationPage__Group_6__0__Impl rule__ConfigurationPage__Group_6__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3314:2: rule__ConfigurationPage__Group_6__0__Impl rule__ConfigurationPage__Group_6__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConfigurationPage__Group_6__0__Impl_in_rule__ConfigurationPage__Group_6__06514);
            rule__ConfigurationPage__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ConfigurationPage__Group_6__1_in_rule__ConfigurationPage__Group_6__06517);
            rule__ConfigurationPage__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigurationPage__Group_6__0"


    // $ANTLR start "rule__ConfigurationPage__Group_6__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3321:1: rule__ConfigurationPage__Group_6__0__Impl : ( 'couleurPolice' ) ;
    public final void rule__ConfigurationPage__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3325:1: ( ( 'couleurPolice' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3326:1: ( 'couleurPolice' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3326:1: ( 'couleurPolice' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3327:1: 'couleurPolice'
            {
             before(grammarAccess.getConfigurationPageAccess().getCouleurPoliceKeyword_6_0()); 
            match(input,39,FollowSets000.FOLLOW_39_in_rule__ConfigurationPage__Group_6__0__Impl6545); 
             after(grammarAccess.getConfigurationPageAccess().getCouleurPoliceKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigurationPage__Group_6__0__Impl"


    // $ANTLR start "rule__ConfigurationPage__Group_6__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3340:1: rule__ConfigurationPage__Group_6__1 : rule__ConfigurationPage__Group_6__1__Impl ;
    public final void rule__ConfigurationPage__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3344:1: ( rule__ConfigurationPage__Group_6__1__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3345:2: rule__ConfigurationPage__Group_6__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConfigurationPage__Group_6__1__Impl_in_rule__ConfigurationPage__Group_6__16576);
            rule__ConfigurationPage__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigurationPage__Group_6__1"


    // $ANTLR start "rule__ConfigurationPage__Group_6__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3351:1: rule__ConfigurationPage__Group_6__1__Impl : ( ( rule__ConfigurationPage__CouleurPoliceAssignment_6_1 ) ) ;
    public final void rule__ConfigurationPage__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3355:1: ( ( ( rule__ConfigurationPage__CouleurPoliceAssignment_6_1 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3356:1: ( ( rule__ConfigurationPage__CouleurPoliceAssignment_6_1 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3356:1: ( ( rule__ConfigurationPage__CouleurPoliceAssignment_6_1 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3357:1: ( rule__ConfigurationPage__CouleurPoliceAssignment_6_1 )
            {
             before(grammarAccess.getConfigurationPageAccess().getCouleurPoliceAssignment_6_1()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3358:1: ( rule__ConfigurationPage__CouleurPoliceAssignment_6_1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3358:2: rule__ConfigurationPage__CouleurPoliceAssignment_6_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConfigurationPage__CouleurPoliceAssignment_6_1_in_rule__ConfigurationPage__Group_6__1__Impl6603);
            rule__ConfigurationPage__CouleurPoliceAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getConfigurationPageAccess().getCouleurPoliceAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigurationPage__Group_6__1__Impl"


    // $ANTLR start "rule__ConfigurationPage__Group_7__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3372:1: rule__ConfigurationPage__Group_7__0 : rule__ConfigurationPage__Group_7__0__Impl rule__ConfigurationPage__Group_7__1 ;
    public final void rule__ConfigurationPage__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3376:1: ( rule__ConfigurationPage__Group_7__0__Impl rule__ConfigurationPage__Group_7__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3377:2: rule__ConfigurationPage__Group_7__0__Impl rule__ConfigurationPage__Group_7__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConfigurationPage__Group_7__0__Impl_in_rule__ConfigurationPage__Group_7__06637);
            rule__ConfigurationPage__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ConfigurationPage__Group_7__1_in_rule__ConfigurationPage__Group_7__06640);
            rule__ConfigurationPage__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigurationPage__Group_7__0"


    // $ANTLR start "rule__ConfigurationPage__Group_7__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3384:1: rule__ConfigurationPage__Group_7__0__Impl : ( 'taillePolice' ) ;
    public final void rule__ConfigurationPage__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3388:1: ( ( 'taillePolice' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3389:1: ( 'taillePolice' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3389:1: ( 'taillePolice' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3390:1: 'taillePolice'
            {
             before(grammarAccess.getConfigurationPageAccess().getTaillePoliceKeyword_7_0()); 
            match(input,40,FollowSets000.FOLLOW_40_in_rule__ConfigurationPage__Group_7__0__Impl6668); 
             after(grammarAccess.getConfigurationPageAccess().getTaillePoliceKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigurationPage__Group_7__0__Impl"


    // $ANTLR start "rule__ConfigurationPage__Group_7__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3403:1: rule__ConfigurationPage__Group_7__1 : rule__ConfigurationPage__Group_7__1__Impl ;
    public final void rule__ConfigurationPage__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3407:1: ( rule__ConfigurationPage__Group_7__1__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3408:2: rule__ConfigurationPage__Group_7__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConfigurationPage__Group_7__1__Impl_in_rule__ConfigurationPage__Group_7__16699);
            rule__ConfigurationPage__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigurationPage__Group_7__1"


    // $ANTLR start "rule__ConfigurationPage__Group_7__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3414:1: rule__ConfigurationPage__Group_7__1__Impl : ( ( rule__ConfigurationPage__TaillePoliceAssignment_7_1 ) ) ;
    public final void rule__ConfigurationPage__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3418:1: ( ( ( rule__ConfigurationPage__TaillePoliceAssignment_7_1 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3419:1: ( ( rule__ConfigurationPage__TaillePoliceAssignment_7_1 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3419:1: ( ( rule__ConfigurationPage__TaillePoliceAssignment_7_1 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3420:1: ( rule__ConfigurationPage__TaillePoliceAssignment_7_1 )
            {
             before(grammarAccess.getConfigurationPageAccess().getTaillePoliceAssignment_7_1()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3421:1: ( rule__ConfigurationPage__TaillePoliceAssignment_7_1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3421:2: rule__ConfigurationPage__TaillePoliceAssignment_7_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConfigurationPage__TaillePoliceAssignment_7_1_in_rule__ConfigurationPage__Group_7__1__Impl6726);
            rule__ConfigurationPage__TaillePoliceAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getConfigurationPageAccess().getTaillePoliceAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigurationPage__Group_7__1__Impl"


    // $ANTLR start "rule__PageInterne__Group__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3435:1: rule__PageInterne__Group__0 : rule__PageInterne__Group__0__Impl rule__PageInterne__Group__1 ;
    public final void rule__PageInterne__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3439:1: ( rule__PageInterne__Group__0__Impl rule__PageInterne__Group__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3440:2: rule__PageInterne__Group__0__Impl rule__PageInterne__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__PageInterne__Group__0__Impl_in_rule__PageInterne__Group__06760);
            rule__PageInterne__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PageInterne__Group__1_in_rule__PageInterne__Group__06763);
            rule__PageInterne__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PageInterne__Group__0"


    // $ANTLR start "rule__PageInterne__Group__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3447:1: rule__PageInterne__Group__0__Impl : ( 'PageInterne' ) ;
    public final void rule__PageInterne__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3451:1: ( ( 'PageInterne' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3452:1: ( 'PageInterne' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3452:1: ( 'PageInterne' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3453:1: 'PageInterne'
            {
             before(grammarAccess.getPageInterneAccess().getPageInterneKeyword_0()); 
            match(input,41,FollowSets000.FOLLOW_41_in_rule__PageInterne__Group__0__Impl6791); 
             after(grammarAccess.getPageInterneAccess().getPageInterneKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PageInterne__Group__0__Impl"


    // $ANTLR start "rule__PageInterne__Group__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3466:1: rule__PageInterne__Group__1 : rule__PageInterne__Group__1__Impl rule__PageInterne__Group__2 ;
    public final void rule__PageInterne__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3470:1: ( rule__PageInterne__Group__1__Impl rule__PageInterne__Group__2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3471:2: rule__PageInterne__Group__1__Impl rule__PageInterne__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__PageInterne__Group__1__Impl_in_rule__PageInterne__Group__16822);
            rule__PageInterne__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PageInterne__Group__2_in_rule__PageInterne__Group__16825);
            rule__PageInterne__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PageInterne__Group__1"


    // $ANTLR start "rule__PageInterne__Group__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3478:1: rule__PageInterne__Group__1__Impl : ( '{' ) ;
    public final void rule__PageInterne__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3482:1: ( ( '{' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3483:1: ( '{' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3483:1: ( '{' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3484:1: '{'
            {
             before(grammarAccess.getPageInterneAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__PageInterne__Group__1__Impl6853); 
             after(grammarAccess.getPageInterneAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PageInterne__Group__1__Impl"


    // $ANTLR start "rule__PageInterne__Group__2"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3497:1: rule__PageInterne__Group__2 : rule__PageInterne__Group__2__Impl rule__PageInterne__Group__3 ;
    public final void rule__PageInterne__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3501:1: ( rule__PageInterne__Group__2__Impl rule__PageInterne__Group__3 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3502:2: rule__PageInterne__Group__2__Impl rule__PageInterne__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__PageInterne__Group__2__Impl_in_rule__PageInterne__Group__26884);
            rule__PageInterne__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PageInterne__Group__3_in_rule__PageInterne__Group__26887);
            rule__PageInterne__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PageInterne__Group__2"


    // $ANTLR start "rule__PageInterne__Group__2__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3509:1: rule__PageInterne__Group__2__Impl : ( ( rule__PageInterne__Group_2__0 )? ) ;
    public final void rule__PageInterne__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3513:1: ( ( ( rule__PageInterne__Group_2__0 )? ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3514:1: ( ( rule__PageInterne__Group_2__0 )? )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3514:1: ( ( rule__PageInterne__Group_2__0 )? )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3515:1: ( rule__PageInterne__Group_2__0 )?
            {
             before(grammarAccess.getPageInterneAccess().getGroup_2()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3516:1: ( rule__PageInterne__Group_2__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==43) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3516:2: rule__PageInterne__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__PageInterne__Group_2__0_in_rule__PageInterne__Group__2__Impl6914);
                    rule__PageInterne__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPageInterneAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PageInterne__Group__2__Impl"


    // $ANTLR start "rule__PageInterne__Group__3"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3526:1: rule__PageInterne__Group__3 : rule__PageInterne__Group__3__Impl rule__PageInterne__Group__4 ;
    public final void rule__PageInterne__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3530:1: ( rule__PageInterne__Group__3__Impl rule__PageInterne__Group__4 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3531:2: rule__PageInterne__Group__3__Impl rule__PageInterne__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__PageInterne__Group__3__Impl_in_rule__PageInterne__Group__36945);
            rule__PageInterne__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PageInterne__Group__4_in_rule__PageInterne__Group__36948);
            rule__PageInterne__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PageInterne__Group__3"


    // $ANTLR start "rule__PageInterne__Group__3__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3538:1: rule__PageInterne__Group__3__Impl : ( ( rule__PageInterne__Group_3__0 )? ) ;
    public final void rule__PageInterne__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3542:1: ( ( ( rule__PageInterne__Group_3__0 )? ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3543:1: ( ( rule__PageInterne__Group_3__0 )? )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3543:1: ( ( rule__PageInterne__Group_3__0 )? )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3544:1: ( rule__PageInterne__Group_3__0 )?
            {
             before(grammarAccess.getPageInterneAccess().getGroup_3()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3545:1: ( rule__PageInterne__Group_3__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==29) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3545:2: rule__PageInterne__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__PageInterne__Group_3__0_in_rule__PageInterne__Group__3__Impl6975);
                    rule__PageInterne__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPageInterneAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PageInterne__Group__3__Impl"


    // $ANTLR start "rule__PageInterne__Group__4"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3555:1: rule__PageInterne__Group__4 : rule__PageInterne__Group__4__Impl rule__PageInterne__Group__5 ;
    public final void rule__PageInterne__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3559:1: ( rule__PageInterne__Group__4__Impl rule__PageInterne__Group__5 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3560:2: rule__PageInterne__Group__4__Impl rule__PageInterne__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__PageInterne__Group__4__Impl_in_rule__PageInterne__Group__47006);
            rule__PageInterne__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PageInterne__Group__5_in_rule__PageInterne__Group__47009);
            rule__PageInterne__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PageInterne__Group__4"


    // $ANTLR start "rule__PageInterne__Group__4__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3567:1: rule__PageInterne__Group__4__Impl : ( ( rule__PageInterne__Group_4__0 )? ) ;
    public final void rule__PageInterne__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3571:1: ( ( ( rule__PageInterne__Group_4__0 )? ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3572:1: ( ( rule__PageInterne__Group_4__0 )? )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3572:1: ( ( rule__PageInterne__Group_4__0 )? )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3573:1: ( rule__PageInterne__Group_4__0 )?
            {
             before(grammarAccess.getPageInterneAccess().getGroup_4()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3574:1: ( rule__PageInterne__Group_4__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==44) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3574:2: rule__PageInterne__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__PageInterne__Group_4__0_in_rule__PageInterne__Group__4__Impl7036);
                    rule__PageInterne__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPageInterneAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PageInterne__Group__4__Impl"


    // $ANTLR start "rule__PageInterne__Group__5"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3584:1: rule__PageInterne__Group__5 : rule__PageInterne__Group__5__Impl rule__PageInterne__Group__6 ;
    public final void rule__PageInterne__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3588:1: ( rule__PageInterne__Group__5__Impl rule__PageInterne__Group__6 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3589:2: rule__PageInterne__Group__5__Impl rule__PageInterne__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__PageInterne__Group__5__Impl_in_rule__PageInterne__Group__57067);
            rule__PageInterne__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PageInterne__Group__6_in_rule__PageInterne__Group__57070);
            rule__PageInterne__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PageInterne__Group__5"


    // $ANTLR start "rule__PageInterne__Group__5__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3596:1: rule__PageInterne__Group__5__Impl : ( ( rule__PageInterne__Group_5__0 )? ) ;
    public final void rule__PageInterne__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3600:1: ( ( ( rule__PageInterne__Group_5__0 )? ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3601:1: ( ( rule__PageInterne__Group_5__0 )? )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3601:1: ( ( rule__PageInterne__Group_5__0 )? )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3602:1: ( rule__PageInterne__Group_5__0 )?
            {
             before(grammarAccess.getPageInterneAccess().getGroup_5()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3603:1: ( rule__PageInterne__Group_5__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==45) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3603:2: rule__PageInterne__Group_5__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__PageInterne__Group_5__0_in_rule__PageInterne__Group__5__Impl7097);
                    rule__PageInterne__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPageInterneAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PageInterne__Group__5__Impl"


    // $ANTLR start "rule__PageInterne__Group__6"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3613:1: rule__PageInterne__Group__6 : rule__PageInterne__Group__6__Impl rule__PageInterne__Group__7 ;
    public final void rule__PageInterne__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3617:1: ( rule__PageInterne__Group__6__Impl rule__PageInterne__Group__7 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3618:2: rule__PageInterne__Group__6__Impl rule__PageInterne__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__PageInterne__Group__6__Impl_in_rule__PageInterne__Group__67128);
            rule__PageInterne__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PageInterne__Group__7_in_rule__PageInterne__Group__67131);
            rule__PageInterne__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PageInterne__Group__6"


    // $ANTLR start "rule__PageInterne__Group__6__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3625:1: rule__PageInterne__Group__6__Impl : ( 'photo' ) ;
    public final void rule__PageInterne__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3629:1: ( ( 'photo' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3630:1: ( 'photo' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3630:1: ( 'photo' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3631:1: 'photo'
            {
             before(grammarAccess.getPageInterneAccess().getPhotoKeyword_6()); 
            match(input,42,FollowSets000.FOLLOW_42_in_rule__PageInterne__Group__6__Impl7159); 
             after(grammarAccess.getPageInterneAccess().getPhotoKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PageInterne__Group__6__Impl"


    // $ANTLR start "rule__PageInterne__Group__7"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3644:1: rule__PageInterne__Group__7 : rule__PageInterne__Group__7__Impl rule__PageInterne__Group__8 ;
    public final void rule__PageInterne__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3648:1: ( rule__PageInterne__Group__7__Impl rule__PageInterne__Group__8 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3649:2: rule__PageInterne__Group__7__Impl rule__PageInterne__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__PageInterne__Group__7__Impl_in_rule__PageInterne__Group__77190);
            rule__PageInterne__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PageInterne__Group__8_in_rule__PageInterne__Group__77193);
            rule__PageInterne__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PageInterne__Group__7"


    // $ANTLR start "rule__PageInterne__Group__7__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3656:1: rule__PageInterne__Group__7__Impl : ( ( rule__PageInterne__PhotoAssignment_7 ) ) ;
    public final void rule__PageInterne__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3660:1: ( ( ( rule__PageInterne__PhotoAssignment_7 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3661:1: ( ( rule__PageInterne__PhotoAssignment_7 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3661:1: ( ( rule__PageInterne__PhotoAssignment_7 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3662:1: ( rule__PageInterne__PhotoAssignment_7 )
            {
             before(grammarAccess.getPageInterneAccess().getPhotoAssignment_7()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3663:1: ( rule__PageInterne__PhotoAssignment_7 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3663:2: rule__PageInterne__PhotoAssignment_7
            {
            pushFollow(FollowSets000.FOLLOW_rule__PageInterne__PhotoAssignment_7_in_rule__PageInterne__Group__7__Impl7220);
            rule__PageInterne__PhotoAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getPageInterneAccess().getPhotoAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PageInterne__Group__7__Impl"


    // $ANTLR start "rule__PageInterne__Group__8"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3673:1: rule__PageInterne__Group__8 : rule__PageInterne__Group__8__Impl ;
    public final void rule__PageInterne__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3677:1: ( rule__PageInterne__Group__8__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3678:2: rule__PageInterne__Group__8__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__PageInterne__Group__8__Impl_in_rule__PageInterne__Group__87250);
            rule__PageInterne__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PageInterne__Group__8"


    // $ANTLR start "rule__PageInterne__Group__8__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3684:1: rule__PageInterne__Group__8__Impl : ( '}' ) ;
    public final void rule__PageInterne__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3688:1: ( ( '}' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3689:1: ( '}' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3689:1: ( '}' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3690:1: '}'
            {
             before(grammarAccess.getPageInterneAccess().getRightCurlyBracketKeyword_8()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__PageInterne__Group__8__Impl7278); 
             after(grammarAccess.getPageInterneAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PageInterne__Group__8__Impl"


    // $ANTLR start "rule__PageInterne__Group_2__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3721:1: rule__PageInterne__Group_2__0 : rule__PageInterne__Group_2__0__Impl rule__PageInterne__Group_2__1 ;
    public final void rule__PageInterne__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3725:1: ( rule__PageInterne__Group_2__0__Impl rule__PageInterne__Group_2__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3726:2: rule__PageInterne__Group_2__0__Impl rule__PageInterne__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__PageInterne__Group_2__0__Impl_in_rule__PageInterne__Group_2__07327);
            rule__PageInterne__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PageInterne__Group_2__1_in_rule__PageInterne__Group_2__07330);
            rule__PageInterne__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PageInterne__Group_2__0"


    // $ANTLR start "rule__PageInterne__Group_2__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3733:1: rule__PageInterne__Group_2__0__Impl : ( 'titrePage' ) ;
    public final void rule__PageInterne__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3737:1: ( ( 'titrePage' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3738:1: ( 'titrePage' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3738:1: ( 'titrePage' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3739:1: 'titrePage'
            {
             before(grammarAccess.getPageInterneAccess().getTitrePageKeyword_2_0()); 
            match(input,43,FollowSets000.FOLLOW_43_in_rule__PageInterne__Group_2__0__Impl7358); 
             after(grammarAccess.getPageInterneAccess().getTitrePageKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PageInterne__Group_2__0__Impl"


    // $ANTLR start "rule__PageInterne__Group_2__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3752:1: rule__PageInterne__Group_2__1 : rule__PageInterne__Group_2__1__Impl ;
    public final void rule__PageInterne__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3756:1: ( rule__PageInterne__Group_2__1__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3757:2: rule__PageInterne__Group_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__PageInterne__Group_2__1__Impl_in_rule__PageInterne__Group_2__17389);
            rule__PageInterne__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PageInterne__Group_2__1"


    // $ANTLR start "rule__PageInterne__Group_2__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3763:1: rule__PageInterne__Group_2__1__Impl : ( ( rule__PageInterne__TitrePageAssignment_2_1 ) ) ;
    public final void rule__PageInterne__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3767:1: ( ( ( rule__PageInterne__TitrePageAssignment_2_1 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3768:1: ( ( rule__PageInterne__TitrePageAssignment_2_1 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3768:1: ( ( rule__PageInterne__TitrePageAssignment_2_1 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3769:1: ( rule__PageInterne__TitrePageAssignment_2_1 )
            {
             before(grammarAccess.getPageInterneAccess().getTitrePageAssignment_2_1()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3770:1: ( rule__PageInterne__TitrePageAssignment_2_1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3770:2: rule__PageInterne__TitrePageAssignment_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__PageInterne__TitrePageAssignment_2_1_in_rule__PageInterne__Group_2__1__Impl7416);
            rule__PageInterne__TitrePageAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getPageInterneAccess().getTitrePageAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PageInterne__Group_2__1__Impl"


    // $ANTLR start "rule__PageInterne__Group_3__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3784:1: rule__PageInterne__Group_3__0 : rule__PageInterne__Group_3__0__Impl rule__PageInterne__Group_3__1 ;
    public final void rule__PageInterne__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3788:1: ( rule__PageInterne__Group_3__0__Impl rule__PageInterne__Group_3__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3789:2: rule__PageInterne__Group_3__0__Impl rule__PageInterne__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__PageInterne__Group_3__0__Impl_in_rule__PageInterne__Group_3__07450);
            rule__PageInterne__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PageInterne__Group_3__1_in_rule__PageInterne__Group_3__07453);
            rule__PageInterne__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PageInterne__Group_3__0"


    // $ANTLR start "rule__PageInterne__Group_3__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3796:1: rule__PageInterne__Group_3__0__Impl : ( 'texte' ) ;
    public final void rule__PageInterne__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3800:1: ( ( 'texte' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3801:1: ( 'texte' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3801:1: ( 'texte' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3802:1: 'texte'
            {
             before(grammarAccess.getPageInterneAccess().getTexteKeyword_3_0()); 
            match(input,29,FollowSets000.FOLLOW_29_in_rule__PageInterne__Group_3__0__Impl7481); 
             after(grammarAccess.getPageInterneAccess().getTexteKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PageInterne__Group_3__0__Impl"


    // $ANTLR start "rule__PageInterne__Group_3__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3815:1: rule__PageInterne__Group_3__1 : rule__PageInterne__Group_3__1__Impl ;
    public final void rule__PageInterne__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3819:1: ( rule__PageInterne__Group_3__1__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3820:2: rule__PageInterne__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__PageInterne__Group_3__1__Impl_in_rule__PageInterne__Group_3__17512);
            rule__PageInterne__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PageInterne__Group_3__1"


    // $ANTLR start "rule__PageInterne__Group_3__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3826:1: rule__PageInterne__Group_3__1__Impl : ( ( rule__PageInterne__TexteAssignment_3_1 ) ) ;
    public final void rule__PageInterne__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3830:1: ( ( ( rule__PageInterne__TexteAssignment_3_1 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3831:1: ( ( rule__PageInterne__TexteAssignment_3_1 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3831:1: ( ( rule__PageInterne__TexteAssignment_3_1 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3832:1: ( rule__PageInterne__TexteAssignment_3_1 )
            {
             before(grammarAccess.getPageInterneAccess().getTexteAssignment_3_1()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3833:1: ( rule__PageInterne__TexteAssignment_3_1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3833:2: rule__PageInterne__TexteAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__PageInterne__TexteAssignment_3_1_in_rule__PageInterne__Group_3__1__Impl7539);
            rule__PageInterne__TexteAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getPageInterneAccess().getTexteAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PageInterne__Group_3__1__Impl"


    // $ANTLR start "rule__PageInterne__Group_4__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3847:1: rule__PageInterne__Group_4__0 : rule__PageInterne__Group_4__0__Impl rule__PageInterne__Group_4__1 ;
    public final void rule__PageInterne__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3851:1: ( rule__PageInterne__Group_4__0__Impl rule__PageInterne__Group_4__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3852:2: rule__PageInterne__Group_4__0__Impl rule__PageInterne__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__PageInterne__Group_4__0__Impl_in_rule__PageInterne__Group_4__07573);
            rule__PageInterne__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PageInterne__Group_4__1_in_rule__PageInterne__Group_4__07576);
            rule__PageInterne__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PageInterne__Group_4__0"


    // $ANTLR start "rule__PageInterne__Group_4__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3859:1: rule__PageInterne__Group_4__0__Impl : ( 'types' ) ;
    public final void rule__PageInterne__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3863:1: ( ( 'types' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3864:1: ( 'types' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3864:1: ( 'types' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3865:1: 'types'
            {
             before(grammarAccess.getPageInterneAccess().getTypesKeyword_4_0()); 
            match(input,44,FollowSets000.FOLLOW_44_in_rule__PageInterne__Group_4__0__Impl7604); 
             after(grammarAccess.getPageInterneAccess().getTypesKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PageInterne__Group_4__0__Impl"


    // $ANTLR start "rule__PageInterne__Group_4__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3878:1: rule__PageInterne__Group_4__1 : rule__PageInterne__Group_4__1__Impl ;
    public final void rule__PageInterne__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3882:1: ( rule__PageInterne__Group_4__1__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3883:2: rule__PageInterne__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__PageInterne__Group_4__1__Impl_in_rule__PageInterne__Group_4__17635);
            rule__PageInterne__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PageInterne__Group_4__1"


    // $ANTLR start "rule__PageInterne__Group_4__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3889:1: rule__PageInterne__Group_4__1__Impl : ( ( rule__PageInterne__TypesAssignment_4_1 ) ) ;
    public final void rule__PageInterne__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3893:1: ( ( ( rule__PageInterne__TypesAssignment_4_1 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3894:1: ( ( rule__PageInterne__TypesAssignment_4_1 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3894:1: ( ( rule__PageInterne__TypesAssignment_4_1 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3895:1: ( rule__PageInterne__TypesAssignment_4_1 )
            {
             before(grammarAccess.getPageInterneAccess().getTypesAssignment_4_1()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3896:1: ( rule__PageInterne__TypesAssignment_4_1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3896:2: rule__PageInterne__TypesAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__PageInterne__TypesAssignment_4_1_in_rule__PageInterne__Group_4__1__Impl7662);
            rule__PageInterne__TypesAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getPageInterneAccess().getTypesAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PageInterne__Group_4__1__Impl"


    // $ANTLR start "rule__PageInterne__Group_5__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3910:1: rule__PageInterne__Group_5__0 : rule__PageInterne__Group_5__0__Impl rule__PageInterne__Group_5__1 ;
    public final void rule__PageInterne__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3914:1: ( rule__PageInterne__Group_5__0__Impl rule__PageInterne__Group_5__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3915:2: rule__PageInterne__Group_5__0__Impl rule__PageInterne__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__PageInterne__Group_5__0__Impl_in_rule__PageInterne__Group_5__07696);
            rule__PageInterne__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PageInterne__Group_5__1_in_rule__PageInterne__Group_5__07699);
            rule__PageInterne__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PageInterne__Group_5__0"


    // $ANTLR start "rule__PageInterne__Group_5__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3922:1: rule__PageInterne__Group_5__0__Impl : ( 'liens' ) ;
    public final void rule__PageInterne__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3926:1: ( ( 'liens' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3927:1: ( 'liens' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3927:1: ( 'liens' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3928:1: 'liens'
            {
             before(grammarAccess.getPageInterneAccess().getLiensKeyword_5_0()); 
            match(input,45,FollowSets000.FOLLOW_45_in_rule__PageInterne__Group_5__0__Impl7727); 
             after(grammarAccess.getPageInterneAccess().getLiensKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PageInterne__Group_5__0__Impl"


    // $ANTLR start "rule__PageInterne__Group_5__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3941:1: rule__PageInterne__Group_5__1 : rule__PageInterne__Group_5__1__Impl ;
    public final void rule__PageInterne__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3945:1: ( rule__PageInterne__Group_5__1__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3946:2: rule__PageInterne__Group_5__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__PageInterne__Group_5__1__Impl_in_rule__PageInterne__Group_5__17758);
            rule__PageInterne__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PageInterne__Group_5__1"


    // $ANTLR start "rule__PageInterne__Group_5__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3952:1: rule__PageInterne__Group_5__1__Impl : ( ( rule__PageInterne__LiensAssignment_5_1 ) ) ;
    public final void rule__PageInterne__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3956:1: ( ( ( rule__PageInterne__LiensAssignment_5_1 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3957:1: ( ( rule__PageInterne__LiensAssignment_5_1 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3957:1: ( ( rule__PageInterne__LiensAssignment_5_1 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3958:1: ( rule__PageInterne__LiensAssignment_5_1 )
            {
             before(grammarAccess.getPageInterneAccess().getLiensAssignment_5_1()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3959:1: ( rule__PageInterne__LiensAssignment_5_1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3959:2: rule__PageInterne__LiensAssignment_5_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__PageInterne__LiensAssignment_5_1_in_rule__PageInterne__Group_5__1__Impl7785);
            rule__PageInterne__LiensAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getPageInterneAccess().getLiensAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PageInterne__Group_5__1__Impl"


    // $ANTLR start "rule__EInt__Group__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3973:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3977:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3978:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__0__Impl_in_rule__EInt__Group__07819);
            rule__EInt__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__1_in_rule__EInt__Group__07822);
            rule__EInt__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__0"


    // $ANTLR start "rule__EInt__Group__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3985:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3989:1: ( ( ( '-' )? ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3990:1: ( ( '-' )? )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3990:1: ( ( '-' )? )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3991:1: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3992:1: ( '-' )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==46) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3993:2: '-'
                    {
                    match(input,46,FollowSets000.FOLLOW_46_in_rule__EInt__Group__0__Impl7851); 

                    }
                    break;

            }

             after(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__0__Impl"


    // $ANTLR start "rule__EInt__Group__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4004:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4008:1: ( rule__EInt__Group__1__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4009:2: rule__EInt__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__1__Impl_in_rule__EInt__Group__17884);
            rule__EInt__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__1"


    // $ANTLR start "rule__EInt__Group__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4015:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4019:1: ( ( RULE_INT ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4020:1: ( RULE_INT )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4020:1: ( RULE_INT )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4021:1: RULE_INT
            {
             before(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__EInt__Group__1__Impl7911); 
             after(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__1__Impl"


    // $ANTLR start "rule__Types__Group__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4036:1: rule__Types__Group__0 : rule__Types__Group__0__Impl rule__Types__Group__1 ;
    public final void rule__Types__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4040:1: ( rule__Types__Group__0__Impl rule__Types__Group__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4041:2: rule__Types__Group__0__Impl rule__Types__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Types__Group__0__Impl_in_rule__Types__Group__07944);
            rule__Types__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Types__Group__1_in_rule__Types__Group__07947);
            rule__Types__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Types__Group__0"


    // $ANTLR start "rule__Types__Group__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4048:1: rule__Types__Group__0__Impl : ( () ) ;
    public final void rule__Types__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4052:1: ( ( () ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4053:1: ( () )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4053:1: ( () )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4054:1: ()
            {
             before(grammarAccess.getTypesAccess().getTypesAction_0()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4055:1: ()
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4057:1: 
            {
            }

             after(grammarAccess.getTypesAccess().getTypesAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Types__Group__0__Impl"


    // $ANTLR start "rule__Types__Group__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4067:1: rule__Types__Group__1 : rule__Types__Group__1__Impl rule__Types__Group__2 ;
    public final void rule__Types__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4071:1: ( rule__Types__Group__1__Impl rule__Types__Group__2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4072:2: rule__Types__Group__1__Impl rule__Types__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Types__Group__1__Impl_in_rule__Types__Group__18005);
            rule__Types__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Types__Group__2_in_rule__Types__Group__18008);
            rule__Types__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Types__Group__1"


    // $ANTLR start "rule__Types__Group__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4079:1: rule__Types__Group__1__Impl : ( ( rule__Types__GrasAssignment_1 )? ) ;
    public final void rule__Types__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4083:1: ( ( ( rule__Types__GrasAssignment_1 )? ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4084:1: ( ( rule__Types__GrasAssignment_1 )? )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4084:1: ( ( rule__Types__GrasAssignment_1 )? )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4085:1: ( rule__Types__GrasAssignment_1 )?
            {
             before(grammarAccess.getTypesAccess().getGrasAssignment_1()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4086:1: ( rule__Types__GrasAssignment_1 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==55) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4086:2: rule__Types__GrasAssignment_1
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Types__GrasAssignment_1_in_rule__Types__Group__1__Impl8035);
                    rule__Types__GrasAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTypesAccess().getGrasAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Types__Group__1__Impl"


    // $ANTLR start "rule__Types__Group__2"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4096:1: rule__Types__Group__2 : rule__Types__Group__2__Impl rule__Types__Group__3 ;
    public final void rule__Types__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4100:1: ( rule__Types__Group__2__Impl rule__Types__Group__3 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4101:2: rule__Types__Group__2__Impl rule__Types__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Types__Group__2__Impl_in_rule__Types__Group__28066);
            rule__Types__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Types__Group__3_in_rule__Types__Group__28069);
            rule__Types__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Types__Group__2"


    // $ANTLR start "rule__Types__Group__2__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4108:1: rule__Types__Group__2__Impl : ( ( rule__Types__ItaliqueAssignment_2 )? ) ;
    public final void rule__Types__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4112:1: ( ( ( rule__Types__ItaliqueAssignment_2 )? ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4113:1: ( ( rule__Types__ItaliqueAssignment_2 )? )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4113:1: ( ( rule__Types__ItaliqueAssignment_2 )? )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4114:1: ( rule__Types__ItaliqueAssignment_2 )?
            {
             before(grammarAccess.getTypesAccess().getItaliqueAssignment_2()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4115:1: ( rule__Types__ItaliqueAssignment_2 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==56) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4115:2: rule__Types__ItaliqueAssignment_2
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Types__ItaliqueAssignment_2_in_rule__Types__Group__2__Impl8096);
                    rule__Types__ItaliqueAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTypesAccess().getItaliqueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Types__Group__2__Impl"


    // $ANTLR start "rule__Types__Group__3"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4125:1: rule__Types__Group__3 : rule__Types__Group__3__Impl ;
    public final void rule__Types__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4129:1: ( rule__Types__Group__3__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4130:2: rule__Types__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Types__Group__3__Impl_in_rule__Types__Group__38127);
            rule__Types__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Types__Group__3"


    // $ANTLR start "rule__Types__Group__3__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4136:1: rule__Types__Group__3__Impl : ( 'Types' ) ;
    public final void rule__Types__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4140:1: ( ( 'Types' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4141:1: ( 'Types' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4141:1: ( 'Types' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4142:1: 'Types'
            {
             before(grammarAccess.getTypesAccess().getTypesKeyword_3()); 
            match(input,47,FollowSets000.FOLLOW_47_in_rule__Types__Group__3__Impl8155); 
             after(grammarAccess.getTypesAccess().getTypesKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Types__Group__3__Impl"


    // $ANTLR start "rule__Liens__Group__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4163:1: rule__Liens__Group__0 : rule__Liens__Group__0__Impl rule__Liens__Group__1 ;
    public final void rule__Liens__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4167:1: ( rule__Liens__Group__0__Impl rule__Liens__Group__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4168:2: rule__Liens__Group__0__Impl rule__Liens__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Liens__Group__0__Impl_in_rule__Liens__Group__08194);
            rule__Liens__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Liens__Group__1_in_rule__Liens__Group__08197);
            rule__Liens__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Liens__Group__0"


    // $ANTLR start "rule__Liens__Group__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4175:1: rule__Liens__Group__0__Impl : ( () ) ;
    public final void rule__Liens__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4179:1: ( ( () ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4180:1: ( () )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4180:1: ( () )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4181:1: ()
            {
             before(grammarAccess.getLiensAccess().getLiensAction_0()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4182:1: ()
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4184:1: 
            {
            }

             after(grammarAccess.getLiensAccess().getLiensAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Liens__Group__0__Impl"


    // $ANTLR start "rule__Liens__Group__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4194:1: rule__Liens__Group__1 : rule__Liens__Group__1__Impl rule__Liens__Group__2 ;
    public final void rule__Liens__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4198:1: ( rule__Liens__Group__1__Impl rule__Liens__Group__2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4199:2: rule__Liens__Group__1__Impl rule__Liens__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Liens__Group__1__Impl_in_rule__Liens__Group__18255);
            rule__Liens__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Liens__Group__2_in_rule__Liens__Group__18258);
            rule__Liens__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Liens__Group__1"


    // $ANTLR start "rule__Liens__Group__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4206:1: rule__Liens__Group__1__Impl : ( 'Liens' ) ;
    public final void rule__Liens__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4210:1: ( ( 'Liens' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4211:1: ( 'Liens' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4211:1: ( 'Liens' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4212:1: 'Liens'
            {
             before(grammarAccess.getLiensAccess().getLiensKeyword_1()); 
            match(input,48,FollowSets000.FOLLOW_48_in_rule__Liens__Group__1__Impl8286); 
             after(grammarAccess.getLiensAccess().getLiensKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Liens__Group__1__Impl"


    // $ANTLR start "rule__Liens__Group__2"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4225:1: rule__Liens__Group__2 : rule__Liens__Group__2__Impl rule__Liens__Group__3 ;
    public final void rule__Liens__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4229:1: ( rule__Liens__Group__2__Impl rule__Liens__Group__3 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4230:2: rule__Liens__Group__2__Impl rule__Liens__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Liens__Group__2__Impl_in_rule__Liens__Group__28317);
            rule__Liens__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Liens__Group__3_in_rule__Liens__Group__28320);
            rule__Liens__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Liens__Group__2"


    // $ANTLR start "rule__Liens__Group__2__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4237:1: rule__Liens__Group__2__Impl : ( '{' ) ;
    public final void rule__Liens__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4241:1: ( ( '{' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4242:1: ( '{' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4242:1: ( '{' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4243:1: '{'
            {
             before(grammarAccess.getLiensAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Liens__Group__2__Impl8348); 
             after(grammarAccess.getLiensAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Liens__Group__2__Impl"


    // $ANTLR start "rule__Liens__Group__3"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4256:1: rule__Liens__Group__3 : rule__Liens__Group__3__Impl rule__Liens__Group__4 ;
    public final void rule__Liens__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4260:1: ( rule__Liens__Group__3__Impl rule__Liens__Group__4 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4261:2: rule__Liens__Group__3__Impl rule__Liens__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Liens__Group__3__Impl_in_rule__Liens__Group__38379);
            rule__Liens__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Liens__Group__4_in_rule__Liens__Group__38382);
            rule__Liens__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Liens__Group__3"


    // $ANTLR start "rule__Liens__Group__3__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4268:1: rule__Liens__Group__3__Impl : ( ( rule__Liens__Group_3__0 )? ) ;
    public final void rule__Liens__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4272:1: ( ( ( rule__Liens__Group_3__0 )? ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4273:1: ( ( rule__Liens__Group_3__0 )? )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4273:1: ( ( rule__Liens__Group_3__0 )? )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4274:1: ( rule__Liens__Group_3__0 )?
            {
             before(grammarAccess.getLiensAccess().getGroup_3()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4275:1: ( rule__Liens__Group_3__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==49) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4275:2: rule__Liens__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Liens__Group_3__0_in_rule__Liens__Group__3__Impl8409);
                    rule__Liens__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLiensAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Liens__Group__3__Impl"


    // $ANTLR start "rule__Liens__Group__4"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4285:1: rule__Liens__Group__4 : rule__Liens__Group__4__Impl rule__Liens__Group__5 ;
    public final void rule__Liens__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4289:1: ( rule__Liens__Group__4__Impl rule__Liens__Group__5 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4290:2: rule__Liens__Group__4__Impl rule__Liens__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Liens__Group__4__Impl_in_rule__Liens__Group__48440);
            rule__Liens__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Liens__Group__5_in_rule__Liens__Group__48443);
            rule__Liens__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Liens__Group__4"


    // $ANTLR start "rule__Liens__Group__4__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4297:1: rule__Liens__Group__4__Impl : ( ( rule__Liens__Group_4__0 )? ) ;
    public final void rule__Liens__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4301:1: ( ( ( rule__Liens__Group_4__0 )? ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4302:1: ( ( rule__Liens__Group_4__0 )? )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4302:1: ( ( rule__Liens__Group_4__0 )? )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4303:1: ( rule__Liens__Group_4__0 )?
            {
             before(grammarAccess.getLiensAccess().getGroup_4()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4304:1: ( rule__Liens__Group_4__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==50) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4304:2: rule__Liens__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Liens__Group_4__0_in_rule__Liens__Group__4__Impl8470);
                    rule__Liens__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLiensAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Liens__Group__4__Impl"


    // $ANTLR start "rule__Liens__Group__5"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4314:1: rule__Liens__Group__5 : rule__Liens__Group__5__Impl rule__Liens__Group__6 ;
    public final void rule__Liens__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4318:1: ( rule__Liens__Group__5__Impl rule__Liens__Group__6 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4319:2: rule__Liens__Group__5__Impl rule__Liens__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Liens__Group__5__Impl_in_rule__Liens__Group__58501);
            rule__Liens__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Liens__Group__6_in_rule__Liens__Group__58504);
            rule__Liens__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Liens__Group__5"


    // $ANTLR start "rule__Liens__Group__5__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4326:1: rule__Liens__Group__5__Impl : ( ( rule__Liens__Group_5__0 )? ) ;
    public final void rule__Liens__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4330:1: ( ( ( rule__Liens__Group_5__0 )? ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4331:1: ( ( rule__Liens__Group_5__0 )? )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4331:1: ( ( rule__Liens__Group_5__0 )? )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4332:1: ( rule__Liens__Group_5__0 )?
            {
             before(grammarAccess.getLiensAccess().getGroup_5()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4333:1: ( rule__Liens__Group_5__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==51) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4333:2: rule__Liens__Group_5__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Liens__Group_5__0_in_rule__Liens__Group__5__Impl8531);
                    rule__Liens__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLiensAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Liens__Group__5__Impl"


    // $ANTLR start "rule__Liens__Group__6"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4343:1: rule__Liens__Group__6 : rule__Liens__Group__6__Impl ;
    public final void rule__Liens__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4347:1: ( rule__Liens__Group__6__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4348:2: rule__Liens__Group__6__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Liens__Group__6__Impl_in_rule__Liens__Group__68562);
            rule__Liens__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Liens__Group__6"


    // $ANTLR start "rule__Liens__Group__6__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4354:1: rule__Liens__Group__6__Impl : ( '}' ) ;
    public final void rule__Liens__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4358:1: ( ( '}' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4359:1: ( '}' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4359:1: ( '}' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4360:1: '}'
            {
             before(grammarAccess.getLiensAccess().getRightCurlyBracketKeyword_6()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__Liens__Group__6__Impl8590); 
             after(grammarAccess.getLiensAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Liens__Group__6__Impl"


    // $ANTLR start "rule__Liens__Group_3__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4387:1: rule__Liens__Group_3__0 : rule__Liens__Group_3__0__Impl rule__Liens__Group_3__1 ;
    public final void rule__Liens__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4391:1: ( rule__Liens__Group_3__0__Impl rule__Liens__Group_3__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4392:2: rule__Liens__Group_3__0__Impl rule__Liens__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Liens__Group_3__0__Impl_in_rule__Liens__Group_3__08635);
            rule__Liens__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Liens__Group_3__1_in_rule__Liens__Group_3__08638);
            rule__Liens__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Liens__Group_3__0"


    // $ANTLR start "rule__Liens__Group_3__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4399:1: rule__Liens__Group_3__0__Impl : ( 'fichier' ) ;
    public final void rule__Liens__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4403:1: ( ( 'fichier' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4404:1: ( 'fichier' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4404:1: ( 'fichier' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4405:1: 'fichier'
            {
             before(grammarAccess.getLiensAccess().getFichierKeyword_3_0()); 
            match(input,49,FollowSets000.FOLLOW_49_in_rule__Liens__Group_3__0__Impl8666); 
             after(grammarAccess.getLiensAccess().getFichierKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Liens__Group_3__0__Impl"


    // $ANTLR start "rule__Liens__Group_3__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4418:1: rule__Liens__Group_3__1 : rule__Liens__Group_3__1__Impl ;
    public final void rule__Liens__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4422:1: ( rule__Liens__Group_3__1__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4423:2: rule__Liens__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Liens__Group_3__1__Impl_in_rule__Liens__Group_3__18697);
            rule__Liens__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Liens__Group_3__1"


    // $ANTLR start "rule__Liens__Group_3__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4429:1: rule__Liens__Group_3__1__Impl : ( ( rule__Liens__FichierAssignment_3_1 ) ) ;
    public final void rule__Liens__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4433:1: ( ( ( rule__Liens__FichierAssignment_3_1 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4434:1: ( ( rule__Liens__FichierAssignment_3_1 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4434:1: ( ( rule__Liens__FichierAssignment_3_1 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4435:1: ( rule__Liens__FichierAssignment_3_1 )
            {
             before(grammarAccess.getLiensAccess().getFichierAssignment_3_1()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4436:1: ( rule__Liens__FichierAssignment_3_1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4436:2: rule__Liens__FichierAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Liens__FichierAssignment_3_1_in_rule__Liens__Group_3__1__Impl8724);
            rule__Liens__FichierAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getLiensAccess().getFichierAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Liens__Group_3__1__Impl"


    // $ANTLR start "rule__Liens__Group_4__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4450:1: rule__Liens__Group_4__0 : rule__Liens__Group_4__0__Impl rule__Liens__Group_4__1 ;
    public final void rule__Liens__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4454:1: ( rule__Liens__Group_4__0__Impl rule__Liens__Group_4__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4455:2: rule__Liens__Group_4__0__Impl rule__Liens__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Liens__Group_4__0__Impl_in_rule__Liens__Group_4__08758);
            rule__Liens__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Liens__Group_4__1_in_rule__Liens__Group_4__08761);
            rule__Liens__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Liens__Group_4__0"


    // $ANTLR start "rule__Liens__Group_4__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4462:1: rule__Liens__Group_4__0__Impl : ( 'adresseWeb' ) ;
    public final void rule__Liens__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4466:1: ( ( 'adresseWeb' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4467:1: ( 'adresseWeb' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4467:1: ( 'adresseWeb' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4468:1: 'adresseWeb'
            {
             before(grammarAccess.getLiensAccess().getAdresseWebKeyword_4_0()); 
            match(input,50,FollowSets000.FOLLOW_50_in_rule__Liens__Group_4__0__Impl8789); 
             after(grammarAccess.getLiensAccess().getAdresseWebKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Liens__Group_4__0__Impl"


    // $ANTLR start "rule__Liens__Group_4__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4481:1: rule__Liens__Group_4__1 : rule__Liens__Group_4__1__Impl ;
    public final void rule__Liens__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4485:1: ( rule__Liens__Group_4__1__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4486:2: rule__Liens__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Liens__Group_4__1__Impl_in_rule__Liens__Group_4__18820);
            rule__Liens__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Liens__Group_4__1"


    // $ANTLR start "rule__Liens__Group_4__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4492:1: rule__Liens__Group_4__1__Impl : ( ( rule__Liens__AdresseWebAssignment_4_1 ) ) ;
    public final void rule__Liens__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4496:1: ( ( ( rule__Liens__AdresseWebAssignment_4_1 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4497:1: ( ( rule__Liens__AdresseWebAssignment_4_1 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4497:1: ( ( rule__Liens__AdresseWebAssignment_4_1 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4498:1: ( rule__Liens__AdresseWebAssignment_4_1 )
            {
             before(grammarAccess.getLiensAccess().getAdresseWebAssignment_4_1()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4499:1: ( rule__Liens__AdresseWebAssignment_4_1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4499:2: rule__Liens__AdresseWebAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Liens__AdresseWebAssignment_4_1_in_rule__Liens__Group_4__1__Impl8847);
            rule__Liens__AdresseWebAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getLiensAccess().getAdresseWebAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Liens__Group_4__1__Impl"


    // $ANTLR start "rule__Liens__Group_5__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4513:1: rule__Liens__Group_5__0 : rule__Liens__Group_5__0__Impl rule__Liens__Group_5__1 ;
    public final void rule__Liens__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4517:1: ( rule__Liens__Group_5__0__Impl rule__Liens__Group_5__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4518:2: rule__Liens__Group_5__0__Impl rule__Liens__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Liens__Group_5__0__Impl_in_rule__Liens__Group_5__08881);
            rule__Liens__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Liens__Group_5__1_in_rule__Liens__Group_5__08884);
            rule__Liens__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Liens__Group_5__0"


    // $ANTLR start "rule__Liens__Group_5__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4525:1: rule__Liens__Group_5__0__Impl : ( 'pageInterne' ) ;
    public final void rule__Liens__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4529:1: ( ( 'pageInterne' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4530:1: ( 'pageInterne' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4530:1: ( 'pageInterne' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4531:1: 'pageInterne'
            {
             before(grammarAccess.getLiensAccess().getPageInterneKeyword_5_0()); 
            match(input,51,FollowSets000.FOLLOW_51_in_rule__Liens__Group_5__0__Impl8912); 
             after(grammarAccess.getLiensAccess().getPageInterneKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Liens__Group_5__0__Impl"


    // $ANTLR start "rule__Liens__Group_5__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4544:1: rule__Liens__Group_5__1 : rule__Liens__Group_5__1__Impl ;
    public final void rule__Liens__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4548:1: ( rule__Liens__Group_5__1__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4549:2: rule__Liens__Group_5__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Liens__Group_5__1__Impl_in_rule__Liens__Group_5__18943);
            rule__Liens__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Liens__Group_5__1"


    // $ANTLR start "rule__Liens__Group_5__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4555:1: rule__Liens__Group_5__1__Impl : ( ( rule__Liens__PageInterneAssignment_5_1 ) ) ;
    public final void rule__Liens__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4559:1: ( ( ( rule__Liens__PageInterneAssignment_5_1 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4560:1: ( ( rule__Liens__PageInterneAssignment_5_1 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4560:1: ( ( rule__Liens__PageInterneAssignment_5_1 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4561:1: ( rule__Liens__PageInterneAssignment_5_1 )
            {
             before(grammarAccess.getLiensAccess().getPageInterneAssignment_5_1()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4562:1: ( rule__Liens__PageInterneAssignment_5_1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4562:2: rule__Liens__PageInterneAssignment_5_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Liens__PageInterneAssignment_5_1_in_rule__Liens__Group_5__1__Impl8970);
            rule__Liens__PageInterneAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getLiensAccess().getPageInterneAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Liens__Group_5__1__Impl"


    // $ANTLR start "rule__Photo__Group__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4576:1: rule__Photo__Group__0 : rule__Photo__Group__0__Impl rule__Photo__Group__1 ;
    public final void rule__Photo__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4580:1: ( rule__Photo__Group__0__Impl rule__Photo__Group__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4581:2: rule__Photo__Group__0__Impl rule__Photo__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Photo__Group__0__Impl_in_rule__Photo__Group__09004);
            rule__Photo__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Photo__Group__1_in_rule__Photo__Group__09007);
            rule__Photo__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Photo__Group__0"


    // $ANTLR start "rule__Photo__Group__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4588:1: rule__Photo__Group__0__Impl : ( () ) ;
    public final void rule__Photo__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4592:1: ( ( () ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4593:1: ( () )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4593:1: ( () )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4594:1: ()
            {
             before(grammarAccess.getPhotoAccess().getPhotoAction_0()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4595:1: ()
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4597:1: 
            {
            }

             after(grammarAccess.getPhotoAccess().getPhotoAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Photo__Group__0__Impl"


    // $ANTLR start "rule__Photo__Group__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4607:1: rule__Photo__Group__1 : rule__Photo__Group__1__Impl rule__Photo__Group__2 ;
    public final void rule__Photo__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4611:1: ( rule__Photo__Group__1__Impl rule__Photo__Group__2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4612:2: rule__Photo__Group__1__Impl rule__Photo__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Photo__Group__1__Impl_in_rule__Photo__Group__19065);
            rule__Photo__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Photo__Group__2_in_rule__Photo__Group__19068);
            rule__Photo__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Photo__Group__1"


    // $ANTLR start "rule__Photo__Group__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4619:1: rule__Photo__Group__1__Impl : ( 'Photo' ) ;
    public final void rule__Photo__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4623:1: ( ( 'Photo' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4624:1: ( 'Photo' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4624:1: ( 'Photo' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4625:1: 'Photo'
            {
             before(grammarAccess.getPhotoAccess().getPhotoKeyword_1()); 
            match(input,52,FollowSets000.FOLLOW_52_in_rule__Photo__Group__1__Impl9096); 
             after(grammarAccess.getPhotoAccess().getPhotoKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Photo__Group__1__Impl"


    // $ANTLR start "rule__Photo__Group__2"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4638:1: rule__Photo__Group__2 : rule__Photo__Group__2__Impl rule__Photo__Group__3 ;
    public final void rule__Photo__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4642:1: ( rule__Photo__Group__2__Impl rule__Photo__Group__3 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4643:2: rule__Photo__Group__2__Impl rule__Photo__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Photo__Group__2__Impl_in_rule__Photo__Group__29127);
            rule__Photo__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Photo__Group__3_in_rule__Photo__Group__29130);
            rule__Photo__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Photo__Group__2"


    // $ANTLR start "rule__Photo__Group__2__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4650:1: rule__Photo__Group__2__Impl : ( '{' ) ;
    public final void rule__Photo__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4654:1: ( ( '{' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4655:1: ( '{' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4655:1: ( '{' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4656:1: '{'
            {
             before(grammarAccess.getPhotoAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Photo__Group__2__Impl9158); 
             after(grammarAccess.getPhotoAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Photo__Group__2__Impl"


    // $ANTLR start "rule__Photo__Group__3"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4669:1: rule__Photo__Group__3 : rule__Photo__Group__3__Impl rule__Photo__Group__4 ;
    public final void rule__Photo__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4673:1: ( rule__Photo__Group__3__Impl rule__Photo__Group__4 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4674:2: rule__Photo__Group__3__Impl rule__Photo__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Photo__Group__3__Impl_in_rule__Photo__Group__39189);
            rule__Photo__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Photo__Group__4_in_rule__Photo__Group__39192);
            rule__Photo__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Photo__Group__3"


    // $ANTLR start "rule__Photo__Group__3__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4681:1: rule__Photo__Group__3__Impl : ( ( rule__Photo__Group_3__0 )? ) ;
    public final void rule__Photo__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4685:1: ( ( ( rule__Photo__Group_3__0 )? ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4686:1: ( ( rule__Photo__Group_3__0 )? )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4686:1: ( ( rule__Photo__Group_3__0 )? )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4687:1: ( rule__Photo__Group_3__0 )?
            {
             before(grammarAccess.getPhotoAccess().getGroup_3()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4688:1: ( rule__Photo__Group_3__0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==33) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4688:2: rule__Photo__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Photo__Group_3__0_in_rule__Photo__Group__3__Impl9219);
                    rule__Photo__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPhotoAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Photo__Group__3__Impl"


    // $ANTLR start "rule__Photo__Group__4"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4698:1: rule__Photo__Group__4 : rule__Photo__Group__4__Impl rule__Photo__Group__5 ;
    public final void rule__Photo__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4702:1: ( rule__Photo__Group__4__Impl rule__Photo__Group__5 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4703:2: rule__Photo__Group__4__Impl rule__Photo__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Photo__Group__4__Impl_in_rule__Photo__Group__49250);
            rule__Photo__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Photo__Group__5_in_rule__Photo__Group__49253);
            rule__Photo__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Photo__Group__4"


    // $ANTLR start "rule__Photo__Group__4__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4710:1: rule__Photo__Group__4__Impl : ( ( rule__Photo__Group_4__0 )? ) ;
    public final void rule__Photo__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4714:1: ( ( ( rule__Photo__Group_4__0 )? ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4715:1: ( ( rule__Photo__Group_4__0 )? )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4715:1: ( ( rule__Photo__Group_4__0 )? )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4716:1: ( rule__Photo__Group_4__0 )?
            {
             before(grammarAccess.getPhotoAccess().getGroup_4()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4717:1: ( rule__Photo__Group_4__0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==53) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4717:2: rule__Photo__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Photo__Group_4__0_in_rule__Photo__Group__4__Impl9280);
                    rule__Photo__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPhotoAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Photo__Group__4__Impl"


    // $ANTLR start "rule__Photo__Group__5"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4727:1: rule__Photo__Group__5 : rule__Photo__Group__5__Impl rule__Photo__Group__6 ;
    public final void rule__Photo__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4731:1: ( rule__Photo__Group__5__Impl rule__Photo__Group__6 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4732:2: rule__Photo__Group__5__Impl rule__Photo__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Photo__Group__5__Impl_in_rule__Photo__Group__59311);
            rule__Photo__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Photo__Group__6_in_rule__Photo__Group__59314);
            rule__Photo__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Photo__Group__5"


    // $ANTLR start "rule__Photo__Group__5__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4739:1: rule__Photo__Group__5__Impl : ( ( rule__Photo__Group_5__0 )? ) ;
    public final void rule__Photo__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4743:1: ( ( ( rule__Photo__Group_5__0 )? ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4744:1: ( ( rule__Photo__Group_5__0 )? )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4744:1: ( ( rule__Photo__Group_5__0 )? )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4745:1: ( rule__Photo__Group_5__0 )?
            {
             before(grammarAccess.getPhotoAccess().getGroup_5()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4746:1: ( rule__Photo__Group_5__0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==23) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4746:2: rule__Photo__Group_5__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Photo__Group_5__0_in_rule__Photo__Group__5__Impl9341);
                    rule__Photo__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPhotoAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Photo__Group__5__Impl"


    // $ANTLR start "rule__Photo__Group__6"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4756:1: rule__Photo__Group__6 : rule__Photo__Group__6__Impl ;
    public final void rule__Photo__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4760:1: ( rule__Photo__Group__6__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4761:2: rule__Photo__Group__6__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Photo__Group__6__Impl_in_rule__Photo__Group__69372);
            rule__Photo__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Photo__Group__6"


    // $ANTLR start "rule__Photo__Group__6__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4767:1: rule__Photo__Group__6__Impl : ( '}' ) ;
    public final void rule__Photo__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4771:1: ( ( '}' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4772:1: ( '}' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4772:1: ( '}' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4773:1: '}'
            {
             before(grammarAccess.getPhotoAccess().getRightCurlyBracketKeyword_6()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__Photo__Group__6__Impl9400); 
             after(grammarAccess.getPhotoAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Photo__Group__6__Impl"


    // $ANTLR start "rule__Photo__Group_3__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4800:1: rule__Photo__Group_3__0 : rule__Photo__Group_3__0__Impl rule__Photo__Group_3__1 ;
    public final void rule__Photo__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4804:1: ( rule__Photo__Group_3__0__Impl rule__Photo__Group_3__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4805:2: rule__Photo__Group_3__0__Impl rule__Photo__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Photo__Group_3__0__Impl_in_rule__Photo__Group_3__09445);
            rule__Photo__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Photo__Group_3__1_in_rule__Photo__Group_3__09448);
            rule__Photo__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Photo__Group_3__0"


    // $ANTLR start "rule__Photo__Group_3__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4812:1: rule__Photo__Group_3__0__Impl : ( 'taille' ) ;
    public final void rule__Photo__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4816:1: ( ( 'taille' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4817:1: ( 'taille' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4817:1: ( 'taille' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4818:1: 'taille'
            {
             before(grammarAccess.getPhotoAccess().getTailleKeyword_3_0()); 
            match(input,33,FollowSets000.FOLLOW_33_in_rule__Photo__Group_3__0__Impl9476); 
             after(grammarAccess.getPhotoAccess().getTailleKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Photo__Group_3__0__Impl"


    // $ANTLR start "rule__Photo__Group_3__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4831:1: rule__Photo__Group_3__1 : rule__Photo__Group_3__1__Impl ;
    public final void rule__Photo__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4835:1: ( rule__Photo__Group_3__1__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4836:2: rule__Photo__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Photo__Group_3__1__Impl_in_rule__Photo__Group_3__19507);
            rule__Photo__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Photo__Group_3__1"


    // $ANTLR start "rule__Photo__Group_3__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4842:1: rule__Photo__Group_3__1__Impl : ( ( rule__Photo__TailleAssignment_3_1 ) ) ;
    public final void rule__Photo__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4846:1: ( ( ( rule__Photo__TailleAssignment_3_1 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4847:1: ( ( rule__Photo__TailleAssignment_3_1 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4847:1: ( ( rule__Photo__TailleAssignment_3_1 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4848:1: ( rule__Photo__TailleAssignment_3_1 )
            {
             before(grammarAccess.getPhotoAccess().getTailleAssignment_3_1()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4849:1: ( rule__Photo__TailleAssignment_3_1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4849:2: rule__Photo__TailleAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Photo__TailleAssignment_3_1_in_rule__Photo__Group_3__1__Impl9534);
            rule__Photo__TailleAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getPhotoAccess().getTailleAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Photo__Group_3__1__Impl"


    // $ANTLR start "rule__Photo__Group_4__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4863:1: rule__Photo__Group_4__0 : rule__Photo__Group_4__0__Impl rule__Photo__Group_4__1 ;
    public final void rule__Photo__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4867:1: ( rule__Photo__Group_4__0__Impl rule__Photo__Group_4__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4868:2: rule__Photo__Group_4__0__Impl rule__Photo__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Photo__Group_4__0__Impl_in_rule__Photo__Group_4__09568);
            rule__Photo__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Photo__Group_4__1_in_rule__Photo__Group_4__09571);
            rule__Photo__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Photo__Group_4__0"


    // $ANTLR start "rule__Photo__Group_4__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4875:1: rule__Photo__Group_4__0__Impl : ( 'extension' ) ;
    public final void rule__Photo__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4879:1: ( ( 'extension' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4880:1: ( 'extension' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4880:1: ( 'extension' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4881:1: 'extension'
            {
             before(grammarAccess.getPhotoAccess().getExtensionKeyword_4_0()); 
            match(input,53,FollowSets000.FOLLOW_53_in_rule__Photo__Group_4__0__Impl9599); 
             after(grammarAccess.getPhotoAccess().getExtensionKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Photo__Group_4__0__Impl"


    // $ANTLR start "rule__Photo__Group_4__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4894:1: rule__Photo__Group_4__1 : rule__Photo__Group_4__1__Impl ;
    public final void rule__Photo__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4898:1: ( rule__Photo__Group_4__1__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4899:2: rule__Photo__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Photo__Group_4__1__Impl_in_rule__Photo__Group_4__19630);
            rule__Photo__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Photo__Group_4__1"


    // $ANTLR start "rule__Photo__Group_4__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4905:1: rule__Photo__Group_4__1__Impl : ( ( rule__Photo__ExtensionAssignment_4_1 ) ) ;
    public final void rule__Photo__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4909:1: ( ( ( rule__Photo__ExtensionAssignment_4_1 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4910:1: ( ( rule__Photo__ExtensionAssignment_4_1 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4910:1: ( ( rule__Photo__ExtensionAssignment_4_1 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4911:1: ( rule__Photo__ExtensionAssignment_4_1 )
            {
             before(grammarAccess.getPhotoAccess().getExtensionAssignment_4_1()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4912:1: ( rule__Photo__ExtensionAssignment_4_1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4912:2: rule__Photo__ExtensionAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Photo__ExtensionAssignment_4_1_in_rule__Photo__Group_4__1__Impl9657);
            rule__Photo__ExtensionAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getPhotoAccess().getExtensionAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Photo__Group_4__1__Impl"


    // $ANTLR start "rule__Photo__Group_5__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4926:1: rule__Photo__Group_5__0 : rule__Photo__Group_5__0__Impl rule__Photo__Group_5__1 ;
    public final void rule__Photo__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4930:1: ( rule__Photo__Group_5__0__Impl rule__Photo__Group_5__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4931:2: rule__Photo__Group_5__0__Impl rule__Photo__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Photo__Group_5__0__Impl_in_rule__Photo__Group_5__09691);
            rule__Photo__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Photo__Group_5__1_in_rule__Photo__Group_5__09694);
            rule__Photo__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Photo__Group_5__0"


    // $ANTLR start "rule__Photo__Group_5__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4938:1: rule__Photo__Group_5__0__Impl : ( 'nom' ) ;
    public final void rule__Photo__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4942:1: ( ( 'nom' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4943:1: ( 'nom' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4943:1: ( 'nom' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4944:1: 'nom'
            {
             before(grammarAccess.getPhotoAccess().getNomKeyword_5_0()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__Photo__Group_5__0__Impl9722); 
             after(grammarAccess.getPhotoAccess().getNomKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Photo__Group_5__0__Impl"


    // $ANTLR start "rule__Photo__Group_5__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4957:1: rule__Photo__Group_5__1 : rule__Photo__Group_5__1__Impl ;
    public final void rule__Photo__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4961:1: ( rule__Photo__Group_5__1__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4962:2: rule__Photo__Group_5__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Photo__Group_5__1__Impl_in_rule__Photo__Group_5__19753);
            rule__Photo__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Photo__Group_5__1"


    // $ANTLR start "rule__Photo__Group_5__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4968:1: rule__Photo__Group_5__1__Impl : ( ( rule__Photo__NomAssignment_5_1 ) ) ;
    public final void rule__Photo__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4972:1: ( ( ( rule__Photo__NomAssignment_5_1 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4973:1: ( ( rule__Photo__NomAssignment_5_1 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4973:1: ( ( rule__Photo__NomAssignment_5_1 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4974:1: ( rule__Photo__NomAssignment_5_1 )
            {
             before(grammarAccess.getPhotoAccess().getNomAssignment_5_1()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4975:1: ( rule__Photo__NomAssignment_5_1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4975:2: rule__Photo__NomAssignment_5_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Photo__NomAssignment_5_1_in_rule__Photo__Group_5__1__Impl9780);
            rule__Photo__NomAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getPhotoAccess().getNomAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Photo__Group_5__1__Impl"


    // $ANTLR start "rule__EFloat__Group__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4989:1: rule__EFloat__Group__0 : rule__EFloat__Group__0__Impl rule__EFloat__Group__1 ;
    public final void rule__EFloat__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4993:1: ( rule__EFloat__Group__0__Impl rule__EFloat__Group__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4994:2: rule__EFloat__Group__0__Impl rule__EFloat__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EFloat__Group__0__Impl_in_rule__EFloat__Group__09814);
            rule__EFloat__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EFloat__Group__1_in_rule__EFloat__Group__09817);
            rule__EFloat__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group__0"


    // $ANTLR start "rule__EFloat__Group__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5001:1: rule__EFloat__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EFloat__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5005:1: ( ( ( '-' )? ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5006:1: ( ( '-' )? )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5006:1: ( ( '-' )? )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5007:1: ( '-' )?
            {
             before(grammarAccess.getEFloatAccess().getHyphenMinusKeyword_0()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5008:1: ( '-' )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==46) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5009:2: '-'
                    {
                    match(input,46,FollowSets000.FOLLOW_46_in_rule__EFloat__Group__0__Impl9846); 

                    }
                    break;

            }

             after(grammarAccess.getEFloatAccess().getHyphenMinusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group__0__Impl"


    // $ANTLR start "rule__EFloat__Group__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5020:1: rule__EFloat__Group__1 : rule__EFloat__Group__1__Impl rule__EFloat__Group__2 ;
    public final void rule__EFloat__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5024:1: ( rule__EFloat__Group__1__Impl rule__EFloat__Group__2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5025:2: rule__EFloat__Group__1__Impl rule__EFloat__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__EFloat__Group__1__Impl_in_rule__EFloat__Group__19879);
            rule__EFloat__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EFloat__Group__2_in_rule__EFloat__Group__19882);
            rule__EFloat__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group__1"


    // $ANTLR start "rule__EFloat__Group__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5032:1: rule__EFloat__Group__1__Impl : ( ( RULE_INT )? ) ;
    public final void rule__EFloat__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5036:1: ( ( ( RULE_INT )? ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5037:1: ( ( RULE_INT )? )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5037:1: ( ( RULE_INT )? )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5038:1: ( RULE_INT )?
            {
             before(grammarAccess.getEFloatAccess().getINTTerminalRuleCall_1()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5039:1: ( RULE_INT )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==RULE_INT) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5039:3: RULE_INT
                    {
                    match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__EFloat__Group__1__Impl9910); 

                    }
                    break;

            }

             after(grammarAccess.getEFloatAccess().getINTTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group__1__Impl"


    // $ANTLR start "rule__EFloat__Group__2"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5049:1: rule__EFloat__Group__2 : rule__EFloat__Group__2__Impl rule__EFloat__Group__3 ;
    public final void rule__EFloat__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5053:1: ( rule__EFloat__Group__2__Impl rule__EFloat__Group__3 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5054:2: rule__EFloat__Group__2__Impl rule__EFloat__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__EFloat__Group__2__Impl_in_rule__EFloat__Group__29941);
            rule__EFloat__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EFloat__Group__3_in_rule__EFloat__Group__29944);
            rule__EFloat__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group__2"


    // $ANTLR start "rule__EFloat__Group__2__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5061:1: rule__EFloat__Group__2__Impl : ( '.' ) ;
    public final void rule__EFloat__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5065:1: ( ( '.' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5066:1: ( '.' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5066:1: ( '.' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5067:1: '.'
            {
             before(grammarAccess.getEFloatAccess().getFullStopKeyword_2()); 
            match(input,54,FollowSets000.FOLLOW_54_in_rule__EFloat__Group__2__Impl9972); 
             after(grammarAccess.getEFloatAccess().getFullStopKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group__2__Impl"


    // $ANTLR start "rule__EFloat__Group__3"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5080:1: rule__EFloat__Group__3 : rule__EFloat__Group__3__Impl rule__EFloat__Group__4 ;
    public final void rule__EFloat__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5084:1: ( rule__EFloat__Group__3__Impl rule__EFloat__Group__4 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5085:2: rule__EFloat__Group__3__Impl rule__EFloat__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__EFloat__Group__3__Impl_in_rule__EFloat__Group__310003);
            rule__EFloat__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EFloat__Group__4_in_rule__EFloat__Group__310006);
            rule__EFloat__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group__3"


    // $ANTLR start "rule__EFloat__Group__3__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5092:1: rule__EFloat__Group__3__Impl : ( RULE_INT ) ;
    public final void rule__EFloat__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5096:1: ( ( RULE_INT ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5097:1: ( RULE_INT )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5097:1: ( RULE_INT )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5098:1: RULE_INT
            {
             before(grammarAccess.getEFloatAccess().getINTTerminalRuleCall_3()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__EFloat__Group__3__Impl10033); 
             after(grammarAccess.getEFloatAccess().getINTTerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group__3__Impl"


    // $ANTLR start "rule__EFloat__Group__4"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5109:1: rule__EFloat__Group__4 : rule__EFloat__Group__4__Impl ;
    public final void rule__EFloat__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5113:1: ( rule__EFloat__Group__4__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5114:2: rule__EFloat__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EFloat__Group__4__Impl_in_rule__EFloat__Group__410062);
            rule__EFloat__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group__4"


    // $ANTLR start "rule__EFloat__Group__4__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5120:1: rule__EFloat__Group__4__Impl : ( ( rule__EFloat__Group_4__0 )? ) ;
    public final void rule__EFloat__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5124:1: ( ( ( rule__EFloat__Group_4__0 )? ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5125:1: ( ( rule__EFloat__Group_4__0 )? )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5125:1: ( ( rule__EFloat__Group_4__0 )? )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5126:1: ( rule__EFloat__Group_4__0 )?
            {
             before(grammarAccess.getEFloatAccess().getGroup_4()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5127:1: ( rule__EFloat__Group_4__0 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( ((LA39_0>=11 && LA39_0<=12)) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5127:2: rule__EFloat__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__EFloat__Group_4__0_in_rule__EFloat__Group__4__Impl10089);
                    rule__EFloat__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEFloatAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group__4__Impl"


    // $ANTLR start "rule__EFloat__Group_4__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5147:1: rule__EFloat__Group_4__0 : rule__EFloat__Group_4__0__Impl rule__EFloat__Group_4__1 ;
    public final void rule__EFloat__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5151:1: ( rule__EFloat__Group_4__0__Impl rule__EFloat__Group_4__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5152:2: rule__EFloat__Group_4__0__Impl rule__EFloat__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EFloat__Group_4__0__Impl_in_rule__EFloat__Group_4__010130);
            rule__EFloat__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EFloat__Group_4__1_in_rule__EFloat__Group_4__010133);
            rule__EFloat__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group_4__0"


    // $ANTLR start "rule__EFloat__Group_4__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5159:1: rule__EFloat__Group_4__0__Impl : ( ( rule__EFloat__Alternatives_4_0 ) ) ;
    public final void rule__EFloat__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5163:1: ( ( ( rule__EFloat__Alternatives_4_0 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5164:1: ( ( rule__EFloat__Alternatives_4_0 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5164:1: ( ( rule__EFloat__Alternatives_4_0 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5165:1: ( rule__EFloat__Alternatives_4_0 )
            {
             before(grammarAccess.getEFloatAccess().getAlternatives_4_0()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5166:1: ( rule__EFloat__Alternatives_4_0 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5166:2: rule__EFloat__Alternatives_4_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__EFloat__Alternatives_4_0_in_rule__EFloat__Group_4__0__Impl10160);
            rule__EFloat__Alternatives_4_0();

            state._fsp--;


            }

             after(grammarAccess.getEFloatAccess().getAlternatives_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group_4__0__Impl"


    // $ANTLR start "rule__EFloat__Group_4__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5176:1: rule__EFloat__Group_4__1 : rule__EFloat__Group_4__1__Impl rule__EFloat__Group_4__2 ;
    public final void rule__EFloat__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5180:1: ( rule__EFloat__Group_4__1__Impl rule__EFloat__Group_4__2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5181:2: rule__EFloat__Group_4__1__Impl rule__EFloat__Group_4__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__EFloat__Group_4__1__Impl_in_rule__EFloat__Group_4__110190);
            rule__EFloat__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EFloat__Group_4__2_in_rule__EFloat__Group_4__110193);
            rule__EFloat__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group_4__1"


    // $ANTLR start "rule__EFloat__Group_4__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5188:1: rule__EFloat__Group_4__1__Impl : ( ( '-' )? ) ;
    public final void rule__EFloat__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5192:1: ( ( ( '-' )? ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5193:1: ( ( '-' )? )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5193:1: ( ( '-' )? )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5194:1: ( '-' )?
            {
             before(grammarAccess.getEFloatAccess().getHyphenMinusKeyword_4_1()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5195:1: ( '-' )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==46) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5196:2: '-'
                    {
                    match(input,46,FollowSets000.FOLLOW_46_in_rule__EFloat__Group_4__1__Impl10222); 

                    }
                    break;

            }

             after(grammarAccess.getEFloatAccess().getHyphenMinusKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group_4__1__Impl"


    // $ANTLR start "rule__EFloat__Group_4__2"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5207:1: rule__EFloat__Group_4__2 : rule__EFloat__Group_4__2__Impl ;
    public final void rule__EFloat__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5211:1: ( rule__EFloat__Group_4__2__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5212:2: rule__EFloat__Group_4__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EFloat__Group_4__2__Impl_in_rule__EFloat__Group_4__210255);
            rule__EFloat__Group_4__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group_4__2"


    // $ANTLR start "rule__EFloat__Group_4__2__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5218:1: rule__EFloat__Group_4__2__Impl : ( RULE_INT ) ;
    public final void rule__EFloat__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5222:1: ( ( RULE_INT ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5223:1: ( RULE_INT )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5223:1: ( RULE_INT )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5224:1: RULE_INT
            {
             before(grammarAccess.getEFloatAccess().getINTTerminalRuleCall_4_2()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__EFloat__Group_4__2__Impl10282); 
             after(grammarAccess.getEFloatAccess().getINTTerminalRuleCall_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group_4__2__Impl"


    // $ANTLR start "rule__PagePrincipale__ContactsAssignment_4"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5242:1: rule__PagePrincipale__ContactsAssignment_4 : ( ruleContact ) ;
    public final void rule__PagePrincipale__ContactsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5246:1: ( ( ruleContact ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5247:1: ( ruleContact )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5247:1: ( ruleContact )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5248:1: ruleContact
            {
             before(grammarAccess.getPagePrincipaleAccess().getContactsContactParserRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleContact_in_rule__PagePrincipale__ContactsAssignment_410322);
            ruleContact();

            state._fsp--;

             after(grammarAccess.getPagePrincipaleAccess().getContactsContactParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PagePrincipale__ContactsAssignment_4"


    // $ANTLR start "rule__PagePrincipale__ContactsAssignment_5_1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5257:1: rule__PagePrincipale__ContactsAssignment_5_1 : ( ruleContact ) ;
    public final void rule__PagePrincipale__ContactsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5261:1: ( ( ruleContact ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5262:1: ( ruleContact )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5262:1: ( ruleContact )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5263:1: ruleContact
            {
             before(grammarAccess.getPagePrincipaleAccess().getContactsContactParserRuleCall_5_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleContact_in_rule__PagePrincipale__ContactsAssignment_5_110353);
            ruleContact();

            state._fsp--;

             after(grammarAccess.getPagePrincipaleAccess().getContactsContactParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PagePrincipale__ContactsAssignment_5_1"


    // $ANTLR start "rule__PagePrincipale__RubriquesAssignment_7_1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5272:1: rule__PagePrincipale__RubriquesAssignment_7_1 : ( ruleRubriques ) ;
    public final void rule__PagePrincipale__RubriquesAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5276:1: ( ( ruleRubriques ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5277:1: ( ruleRubriques )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5277:1: ( ruleRubriques )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5278:1: ruleRubriques
            {
             before(grammarAccess.getPagePrincipaleAccess().getRubriquesRubriquesParserRuleCall_7_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleRubriques_in_rule__PagePrincipale__RubriquesAssignment_7_110384);
            ruleRubriques();

            state._fsp--;

             after(grammarAccess.getPagePrincipaleAccess().getRubriquesRubriquesParserRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PagePrincipale__RubriquesAssignment_7_1"


    // $ANTLR start "rule__PagePrincipale__FichiersAssignment_8_2"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5287:1: rule__PagePrincipale__FichiersAssignment_8_2 : ( ruleFichiers ) ;
    public final void rule__PagePrincipale__FichiersAssignment_8_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5291:1: ( ( ruleFichiers ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5292:1: ( ruleFichiers )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5292:1: ( ruleFichiers )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5293:1: ruleFichiers
            {
             before(grammarAccess.getPagePrincipaleAccess().getFichiersFichiersParserRuleCall_8_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleFichiers_in_rule__PagePrincipale__FichiersAssignment_8_210415);
            ruleFichiers();

            state._fsp--;

             after(grammarAccess.getPagePrincipaleAccess().getFichiersFichiersParserRuleCall_8_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PagePrincipale__FichiersAssignment_8_2"


    // $ANTLR start "rule__PagePrincipale__FichiersAssignment_8_3_1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5302:1: rule__PagePrincipale__FichiersAssignment_8_3_1 : ( ruleFichiers ) ;
    public final void rule__PagePrincipale__FichiersAssignment_8_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5306:1: ( ( ruleFichiers ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5307:1: ( ruleFichiers )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5307:1: ( ruleFichiers )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5308:1: ruleFichiers
            {
             before(grammarAccess.getPagePrincipaleAccess().getFichiersFichiersParserRuleCall_8_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleFichiers_in_rule__PagePrincipale__FichiersAssignment_8_3_110446);
            ruleFichiers();

            state._fsp--;

             after(grammarAccess.getPagePrincipaleAccess().getFichiersFichiersParserRuleCall_8_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PagePrincipale__FichiersAssignment_8_3_1"


    // $ANTLR start "rule__PagePrincipale__ConfigurationPageAssignment_10"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5317:1: rule__PagePrincipale__ConfigurationPageAssignment_10 : ( ruleConfigurationPage ) ;
    public final void rule__PagePrincipale__ConfigurationPageAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5321:1: ( ( ruleConfigurationPage ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5322:1: ( ruleConfigurationPage )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5322:1: ( ruleConfigurationPage )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5323:1: ruleConfigurationPage
            {
             before(grammarAccess.getPagePrincipaleAccess().getConfigurationPageConfigurationPageParserRuleCall_10_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleConfigurationPage_in_rule__PagePrincipale__ConfigurationPageAssignment_1010477);
            ruleConfigurationPage();

            state._fsp--;

             after(grammarAccess.getPagePrincipaleAccess().getConfigurationPageConfigurationPageParserRuleCall_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PagePrincipale__ConfigurationPageAssignment_10"


    // $ANTLR start "rule__PagePrincipale__PagesAssignment_13"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5332:1: rule__PagePrincipale__PagesAssignment_13 : ( rulePageInterne ) ;
    public final void rule__PagePrincipale__PagesAssignment_13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5336:1: ( ( rulePageInterne ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5337:1: ( rulePageInterne )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5337:1: ( rulePageInterne )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5338:1: rulePageInterne
            {
             before(grammarAccess.getPagePrincipaleAccess().getPagesPageInterneParserRuleCall_13_0()); 
            pushFollow(FollowSets000.FOLLOW_rulePageInterne_in_rule__PagePrincipale__PagesAssignment_1310508);
            rulePageInterne();

            state._fsp--;

             after(grammarAccess.getPagePrincipaleAccess().getPagesPageInterneParserRuleCall_13_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PagePrincipale__PagesAssignment_13"


    // $ANTLR start "rule__PagePrincipale__PagesAssignment_14_1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5347:1: rule__PagePrincipale__PagesAssignment_14_1 : ( rulePageInterne ) ;
    public final void rule__PagePrincipale__PagesAssignment_14_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5351:1: ( ( rulePageInterne ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5352:1: ( rulePageInterne )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5352:1: ( rulePageInterne )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5353:1: rulePageInterne
            {
             before(grammarAccess.getPagePrincipaleAccess().getPagesPageInterneParserRuleCall_14_1_0()); 
            pushFollow(FollowSets000.FOLLOW_rulePageInterne_in_rule__PagePrincipale__PagesAssignment_14_110539);
            rulePageInterne();

            state._fsp--;

             after(grammarAccess.getPagePrincipaleAccess().getPagesPageInterneParserRuleCall_14_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PagePrincipale__PagesAssignment_14_1"


    // $ANTLR start "rule__Contact__NomAssignment_3_1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5362:1: rule__Contact__NomAssignment_3_1 : ( ruleEString ) ;
    public final void rule__Contact__NomAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5366:1: ( ( ruleEString ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5367:1: ( ruleEString )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5367:1: ( ruleEString )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5368:1: ruleEString
            {
             before(grammarAccess.getContactAccess().getNomEStringParserRuleCall_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Contact__NomAssignment_3_110570);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getContactAccess().getNomEStringParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Contact__NomAssignment_3_1"


    // $ANTLR start "rule__Contact__PrenomAssignment_4_1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5377:1: rule__Contact__PrenomAssignment_4_1 : ( ruleEString ) ;
    public final void rule__Contact__PrenomAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5381:1: ( ( ruleEString ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5382:1: ( ruleEString )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5382:1: ( ruleEString )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5383:1: ruleEString
            {
             before(grammarAccess.getContactAccess().getPrenomEStringParserRuleCall_4_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Contact__PrenomAssignment_4_110601);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getContactAccess().getPrenomEStringParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Contact__PrenomAssignment_4_1"


    // $ANTLR start "rule__Contact__AdresseAssignment_5_1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5392:1: rule__Contact__AdresseAssignment_5_1 : ( ruleEString ) ;
    public final void rule__Contact__AdresseAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5396:1: ( ( ruleEString ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5397:1: ( ruleEString )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5397:1: ( ruleEString )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5398:1: ruleEString
            {
             before(grammarAccess.getContactAccess().getAdresseEStringParserRuleCall_5_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Contact__AdresseAssignment_5_110632);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getContactAccess().getAdresseEStringParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Contact__AdresseAssignment_5_1"


    // $ANTLR start "rule__Contact__MailAssignment_6_1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5407:1: rule__Contact__MailAssignment_6_1 : ( ruleEString ) ;
    public final void rule__Contact__MailAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5411:1: ( ( ruleEString ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5412:1: ( ruleEString )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5412:1: ( ruleEString )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5413:1: ruleEString
            {
             before(grammarAccess.getContactAccess().getMailEStringParserRuleCall_6_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Contact__MailAssignment_6_110663);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getContactAccess().getMailEStringParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Contact__MailAssignment_6_1"


    // $ANTLR start "rule__Contact__TelephoneAssignment_7_1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5422:1: rule__Contact__TelephoneAssignment_7_1 : ( ruleEString ) ;
    public final void rule__Contact__TelephoneAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5426:1: ( ( ruleEString ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5427:1: ( ruleEString )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5427:1: ( ruleEString )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5428:1: ruleEString
            {
             before(grammarAccess.getContactAccess().getTelephoneEStringParserRuleCall_7_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Contact__TelephoneAssignment_7_110694);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getContactAccess().getTelephoneEStringParserRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Contact__TelephoneAssignment_7_1"


    // $ANTLR start "rule__Rubriques__TexteAssignment_3_1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5437:1: rule__Rubriques__TexteAssignment_3_1 : ( ruleEString ) ;
    public final void rule__Rubriques__TexteAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5441:1: ( ( ruleEString ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5442:1: ( ruleEString )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5442:1: ( ruleEString )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5443:1: ruleEString
            {
             before(grammarAccess.getRubriquesAccess().getTexteEStringParserRuleCall_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Rubriques__TexteAssignment_3_110725);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRubriquesAccess().getTexteEStringParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rubriques__TexteAssignment_3_1"


    // $ANTLR start "rule__Rubriques__LienAssignment_4_1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5452:1: rule__Rubriques__LienAssignment_4_1 : ( ruleEString ) ;
    public final void rule__Rubriques__LienAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5456:1: ( ( ruleEString ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5457:1: ( ruleEString )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5457:1: ( ruleEString )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5458:1: ruleEString
            {
             before(grammarAccess.getRubriquesAccess().getLienEStringParserRuleCall_4_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Rubriques__LienAssignment_4_110756);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRubriquesAccess().getLienEStringParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rubriques__LienAssignment_4_1"


    // $ANTLR start "rule__Fichiers__TypeAssignment_3_1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5467:1: rule__Fichiers__TypeAssignment_3_1 : ( ruleEString ) ;
    public final void rule__Fichiers__TypeAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5471:1: ( ( ruleEString ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5472:1: ( ruleEString )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5472:1: ( ruleEString )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5473:1: ruleEString
            {
             before(grammarAccess.getFichiersAccess().getTypeEStringParserRuleCall_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Fichiers__TypeAssignment_3_110787);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getFichiersAccess().getTypeEStringParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fichiers__TypeAssignment_3_1"


    // $ANTLR start "rule__Fichiers__TailleAssignment_4_1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5482:1: rule__Fichiers__TailleAssignment_4_1 : ( ruleEInt ) ;
    public final void rule__Fichiers__TailleAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5486:1: ( ( ruleEInt ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5487:1: ( ruleEInt )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5487:1: ( ruleEInt )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5488:1: ruleEInt
            {
             before(grammarAccess.getFichiersAccess().getTailleEIntParserRuleCall_4_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rule__Fichiers__TailleAssignment_4_110818);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getFichiersAccess().getTailleEIntParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fichiers__TailleAssignment_4_1"


    // $ANTLR start "rule__Fichiers__NomAssignment_5_1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5497:1: rule__Fichiers__NomAssignment_5_1 : ( ruleEString ) ;
    public final void rule__Fichiers__NomAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5501:1: ( ( ruleEString ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5502:1: ( ruleEString )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5502:1: ( ruleEString )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5503:1: ruleEString
            {
             before(grammarAccess.getFichiersAccess().getNomEStringParserRuleCall_5_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Fichiers__NomAssignment_5_110849);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getFichiersAccess().getNomEStringParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fichiers__NomAssignment_5_1"


    // $ANTLR start "rule__Fichiers__EmplacementAssignment_6_1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5512:1: rule__Fichiers__EmplacementAssignment_6_1 : ( ruleEString ) ;
    public final void rule__Fichiers__EmplacementAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5516:1: ( ( ruleEString ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5517:1: ( ruleEString )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5517:1: ( ruleEString )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5518:1: ruleEString
            {
             before(grammarAccess.getFichiersAccess().getEmplacementEStringParserRuleCall_6_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Fichiers__EmplacementAssignment_6_110880);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getFichiersAccess().getEmplacementEStringParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fichiers__EmplacementAssignment_6_1"


    // $ANTLR start "rule__ConfigurationPage__CouleurFondAssignment_3_1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5527:1: rule__ConfigurationPage__CouleurFondAssignment_3_1 : ( ruleEString ) ;
    public final void rule__ConfigurationPage__CouleurFondAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5531:1: ( ( ruleEString ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5532:1: ( ruleEString )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5532:1: ( ruleEString )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5533:1: ruleEString
            {
             before(grammarAccess.getConfigurationPageAccess().getCouleurFondEStringParserRuleCall_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__ConfigurationPage__CouleurFondAssignment_3_110911);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getConfigurationPageAccess().getCouleurFondEStringParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigurationPage__CouleurFondAssignment_3_1"


    // $ANTLR start "rule__ConfigurationPage__TitreSiteAssignment_4_1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5542:1: rule__ConfigurationPage__TitreSiteAssignment_4_1 : ( ruleEString ) ;
    public final void rule__ConfigurationPage__TitreSiteAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5546:1: ( ( ruleEString ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5547:1: ( ruleEString )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5547:1: ( ruleEString )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5548:1: ruleEString
            {
             before(grammarAccess.getConfigurationPageAccess().getTitreSiteEStringParserRuleCall_4_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__ConfigurationPage__TitreSiteAssignment_4_110942);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getConfigurationPageAccess().getTitreSiteEStringParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigurationPage__TitreSiteAssignment_4_1"


    // $ANTLR start "rule__ConfigurationPage__AuteursAssignment_5_1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5557:1: rule__ConfigurationPage__AuteursAssignment_5_1 : ( ruleEString ) ;
    public final void rule__ConfigurationPage__AuteursAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5561:1: ( ( ruleEString ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5562:1: ( ruleEString )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5562:1: ( ruleEString )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5563:1: ruleEString
            {
             before(grammarAccess.getConfigurationPageAccess().getAuteursEStringParserRuleCall_5_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__ConfigurationPage__AuteursAssignment_5_110973);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getConfigurationPageAccess().getAuteursEStringParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigurationPage__AuteursAssignment_5_1"


    // $ANTLR start "rule__ConfigurationPage__CouleurPoliceAssignment_6_1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5572:1: rule__ConfigurationPage__CouleurPoliceAssignment_6_1 : ( ruleEString ) ;
    public final void rule__ConfigurationPage__CouleurPoliceAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5576:1: ( ( ruleEString ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5577:1: ( ruleEString )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5577:1: ( ruleEString )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5578:1: ruleEString
            {
             before(grammarAccess.getConfigurationPageAccess().getCouleurPoliceEStringParserRuleCall_6_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__ConfigurationPage__CouleurPoliceAssignment_6_111004);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getConfigurationPageAccess().getCouleurPoliceEStringParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigurationPage__CouleurPoliceAssignment_6_1"


    // $ANTLR start "rule__ConfigurationPage__TaillePoliceAssignment_7_1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5587:1: rule__ConfigurationPage__TaillePoliceAssignment_7_1 : ( ruleEInt ) ;
    public final void rule__ConfigurationPage__TaillePoliceAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5591:1: ( ( ruleEInt ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5592:1: ( ruleEInt )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5592:1: ( ruleEInt )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5593:1: ruleEInt
            {
             before(grammarAccess.getConfigurationPageAccess().getTaillePoliceEIntParserRuleCall_7_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rule__ConfigurationPage__TaillePoliceAssignment_7_111035);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getConfigurationPageAccess().getTaillePoliceEIntParserRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigurationPage__TaillePoliceAssignment_7_1"


    // $ANTLR start "rule__PageInterne__TitrePageAssignment_2_1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5602:1: rule__PageInterne__TitrePageAssignment_2_1 : ( ruleEString ) ;
    public final void rule__PageInterne__TitrePageAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5606:1: ( ( ruleEString ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5607:1: ( ruleEString )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5607:1: ( ruleEString )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5608:1: ruleEString
            {
             before(grammarAccess.getPageInterneAccess().getTitrePageEStringParserRuleCall_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__PageInterne__TitrePageAssignment_2_111066);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPageInterneAccess().getTitrePageEStringParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PageInterne__TitrePageAssignment_2_1"


    // $ANTLR start "rule__PageInterne__TexteAssignment_3_1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5617:1: rule__PageInterne__TexteAssignment_3_1 : ( ruleEString ) ;
    public final void rule__PageInterne__TexteAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5621:1: ( ( ruleEString ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5622:1: ( ruleEString )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5622:1: ( ruleEString )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5623:1: ruleEString
            {
             before(grammarAccess.getPageInterneAccess().getTexteEStringParserRuleCall_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__PageInterne__TexteAssignment_3_111097);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPageInterneAccess().getTexteEStringParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PageInterne__TexteAssignment_3_1"


    // $ANTLR start "rule__PageInterne__TypesAssignment_4_1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5632:1: rule__PageInterne__TypesAssignment_4_1 : ( ruleTypes ) ;
    public final void rule__PageInterne__TypesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5636:1: ( ( ruleTypes ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5637:1: ( ruleTypes )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5637:1: ( ruleTypes )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5638:1: ruleTypes
            {
             before(grammarAccess.getPageInterneAccess().getTypesTypesParserRuleCall_4_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleTypes_in_rule__PageInterne__TypesAssignment_4_111128);
            ruleTypes();

            state._fsp--;

             after(grammarAccess.getPageInterneAccess().getTypesTypesParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PageInterne__TypesAssignment_4_1"


    // $ANTLR start "rule__PageInterne__LiensAssignment_5_1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5647:1: rule__PageInterne__LiensAssignment_5_1 : ( ruleLiens ) ;
    public final void rule__PageInterne__LiensAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5651:1: ( ( ruleLiens ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5652:1: ( ruleLiens )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5652:1: ( ruleLiens )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5653:1: ruleLiens
            {
             before(grammarAccess.getPageInterneAccess().getLiensLiensParserRuleCall_5_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleLiens_in_rule__PageInterne__LiensAssignment_5_111159);
            ruleLiens();

            state._fsp--;

             after(grammarAccess.getPageInterneAccess().getLiensLiensParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PageInterne__LiensAssignment_5_1"


    // $ANTLR start "rule__PageInterne__PhotoAssignment_7"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5662:1: rule__PageInterne__PhotoAssignment_7 : ( rulePhoto ) ;
    public final void rule__PageInterne__PhotoAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5666:1: ( ( rulePhoto ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5667:1: ( rulePhoto )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5667:1: ( rulePhoto )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5668:1: rulePhoto
            {
             before(grammarAccess.getPageInterneAccess().getPhotoPhotoParserRuleCall_7_0()); 
            pushFollow(FollowSets000.FOLLOW_rulePhoto_in_rule__PageInterne__PhotoAssignment_711190);
            rulePhoto();

            state._fsp--;

             after(grammarAccess.getPageInterneAccess().getPhotoPhotoParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PageInterne__PhotoAssignment_7"


    // $ANTLR start "rule__Types__GrasAssignment_1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5677:1: rule__Types__GrasAssignment_1 : ( ( 'gras' ) ) ;
    public final void rule__Types__GrasAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5681:1: ( ( ( 'gras' ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5682:1: ( ( 'gras' ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5682:1: ( ( 'gras' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5683:1: ( 'gras' )
            {
             before(grammarAccess.getTypesAccess().getGrasGrasKeyword_1_0()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5684:1: ( 'gras' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5685:1: 'gras'
            {
             before(grammarAccess.getTypesAccess().getGrasGrasKeyword_1_0()); 
            match(input,55,FollowSets000.FOLLOW_55_in_rule__Types__GrasAssignment_111226); 
             after(grammarAccess.getTypesAccess().getGrasGrasKeyword_1_0()); 

            }

             after(grammarAccess.getTypesAccess().getGrasGrasKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Types__GrasAssignment_1"


    // $ANTLR start "rule__Types__ItaliqueAssignment_2"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5700:1: rule__Types__ItaliqueAssignment_2 : ( ( 'italique' ) ) ;
    public final void rule__Types__ItaliqueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5704:1: ( ( ( 'italique' ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5705:1: ( ( 'italique' ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5705:1: ( ( 'italique' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5706:1: ( 'italique' )
            {
             before(grammarAccess.getTypesAccess().getItaliqueItaliqueKeyword_2_0()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5707:1: ( 'italique' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5708:1: 'italique'
            {
             before(grammarAccess.getTypesAccess().getItaliqueItaliqueKeyword_2_0()); 
            match(input,56,FollowSets000.FOLLOW_56_in_rule__Types__ItaliqueAssignment_211270); 
             after(grammarAccess.getTypesAccess().getItaliqueItaliqueKeyword_2_0()); 

            }

             after(grammarAccess.getTypesAccess().getItaliqueItaliqueKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Types__ItaliqueAssignment_2"


    // $ANTLR start "rule__Liens__FichierAssignment_3_1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5723:1: rule__Liens__FichierAssignment_3_1 : ( ruleEString ) ;
    public final void rule__Liens__FichierAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5727:1: ( ( ruleEString ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5728:1: ( ruleEString )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5728:1: ( ruleEString )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5729:1: ruleEString
            {
             before(grammarAccess.getLiensAccess().getFichierEStringParserRuleCall_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Liens__FichierAssignment_3_111309);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getLiensAccess().getFichierEStringParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Liens__FichierAssignment_3_1"


    // $ANTLR start "rule__Liens__AdresseWebAssignment_4_1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5738:1: rule__Liens__AdresseWebAssignment_4_1 : ( ruleEString ) ;
    public final void rule__Liens__AdresseWebAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5742:1: ( ( ruleEString ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5743:1: ( ruleEString )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5743:1: ( ruleEString )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5744:1: ruleEString
            {
             before(grammarAccess.getLiensAccess().getAdresseWebEStringParserRuleCall_4_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Liens__AdresseWebAssignment_4_111340);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getLiensAccess().getAdresseWebEStringParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Liens__AdresseWebAssignment_4_1"


    // $ANTLR start "rule__Liens__PageInterneAssignment_5_1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5753:1: rule__Liens__PageInterneAssignment_5_1 : ( ruleEString ) ;
    public final void rule__Liens__PageInterneAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5757:1: ( ( ruleEString ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5758:1: ( ruleEString )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5758:1: ( ruleEString )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5759:1: ruleEString
            {
             before(grammarAccess.getLiensAccess().getPageInterneEStringParserRuleCall_5_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Liens__PageInterneAssignment_5_111371);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getLiensAccess().getPageInterneEStringParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Liens__PageInterneAssignment_5_1"


    // $ANTLR start "rule__Photo__TailleAssignment_3_1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5768:1: rule__Photo__TailleAssignment_3_1 : ( ruleEFloat ) ;
    public final void rule__Photo__TailleAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5772:1: ( ( ruleEFloat ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5773:1: ( ruleEFloat )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5773:1: ( ruleEFloat )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5774:1: ruleEFloat
            {
             before(grammarAccess.getPhotoAccess().getTailleEFloatParserRuleCall_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEFloat_in_rule__Photo__TailleAssignment_3_111402);
            ruleEFloat();

            state._fsp--;

             after(grammarAccess.getPhotoAccess().getTailleEFloatParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Photo__TailleAssignment_3_1"


    // $ANTLR start "rule__Photo__ExtensionAssignment_4_1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5783:1: rule__Photo__ExtensionAssignment_4_1 : ( ruleEString ) ;
    public final void rule__Photo__ExtensionAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5787:1: ( ( ruleEString ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5788:1: ( ruleEString )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5788:1: ( ruleEString )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5789:1: ruleEString
            {
             before(grammarAccess.getPhotoAccess().getExtensionEStringParserRuleCall_4_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Photo__ExtensionAssignment_4_111433);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPhotoAccess().getExtensionEStringParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Photo__ExtensionAssignment_4_1"


    // $ANTLR start "rule__Photo__NomAssignment_5_1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5798:1: rule__Photo__NomAssignment_5_1 : ( ruleEString ) ;
    public final void rule__Photo__NomAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5802:1: ( ( ruleEString ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5803:1: ( ruleEString )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5803:1: ( ruleEString )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5804:1: ruleEString
            {
             before(grammarAccess.getPhotoAccess().getNomEStringParserRuleCall_5_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Photo__NomAssignment_5_111464);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPhotoAccess().getNomEStringParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Photo__NomAssignment_5_1"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_rulePagePrincipale_in_entryRulePagePrincipale61 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePagePrincipale68 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PagePrincipale__Group__0_in_rulePagePrincipale94 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleContact_in_entryRuleContact121 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleContact128 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Contact__Group__0_in_ruleContact154 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRubriques_in_entryRuleRubriques181 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRubriques188 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Rubriques__Group__0_in_ruleRubriques214 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFichiers_in_entryRuleFichiers241 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFichiers248 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Fichiers__Group__0_in_ruleFichiers274 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConfigurationPage_in_entryRuleConfigurationPage301 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleConfigurationPage308 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConfigurationPage__Group__0_in_ruleConfigurationPage334 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePageInterne_in_entryRulePageInterne361 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePageInterne368 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PageInterne__Group__0_in_rulePageInterne394 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString421 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString428 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EString__Alternatives_in_ruleEString454 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_entryRuleEInt481 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEInt488 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EInt__Group__0_in_ruleEInt514 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypes_in_entryRuleTypes541 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTypes548 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Types__Group__0_in_ruleTypes574 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLiens_in_entryRuleLiens601 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLiens608 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Liens__Group__0_in_ruleLiens634 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePhoto_in_entryRulePhoto661 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePhoto668 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Photo__Group__0_in_rulePhoto694 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEFloat_in_entryRuleEFloat723 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEFloat730 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EFloat__Group__0_in_ruleEFloat756 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__EString__Alternatives792 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__EString__Alternatives809 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_rule__EFloat__Alternatives_4_0843 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__EFloat__Alternatives_4_0863 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PagePrincipale__Group__0__Impl_in_rule__PagePrincipale__Group__0895 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__PagePrincipale__Group__1_in_rule__PagePrincipale__Group__0898 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__PagePrincipale__Group__0__Impl926 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PagePrincipale__Group__1__Impl_in_rule__PagePrincipale__Group__1957 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_rule__PagePrincipale__Group__2_in_rule__PagePrincipale__Group__1960 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__PagePrincipale__Group__1__Impl988 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PagePrincipale__Group__2__Impl_in_rule__PagePrincipale__Group__21019 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__PagePrincipale__Group__3_in_rule__PagePrincipale__Group__21022 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__PagePrincipale__Group__2__Impl1050 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PagePrincipale__Group__3__Impl_in_rule__PagePrincipale__Group__31081 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_rule__PagePrincipale__Group__4_in_rule__PagePrincipale__Group__31084 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__PagePrincipale__Group__3__Impl1112 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PagePrincipale__Group__4__Impl_in_rule__PagePrincipale__Group__41143 = new BitSet(new long[]{0x0000000000090000L});
        public static final BitSet FOLLOW_rule__PagePrincipale__Group__5_in_rule__PagePrincipale__Group__41146 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PagePrincipale__ContactsAssignment_4_in_rule__PagePrincipale__Group__4__Impl1173 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PagePrincipale__Group__5__Impl_in_rule__PagePrincipale__Group__51203 = new BitSet(new long[]{0x0000000000090000L});
        public static final BitSet FOLLOW_rule__PagePrincipale__Group__6_in_rule__PagePrincipale__Group__51206 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PagePrincipale__Group_5__0_in_rule__PagePrincipale__Group__5__Impl1233 = new BitSet(new long[]{0x0000000000080002L});
        public static final BitSet FOLLOW_rule__PagePrincipale__Group__6__Impl_in_rule__PagePrincipale__Group__61264 = new BitSet(new long[]{0x0000000000320000L});
        public static final BitSet FOLLOW_rule__PagePrincipale__Group__7_in_rule__PagePrincipale__Group__61267 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__PagePrincipale__Group__6__Impl1295 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PagePrincipale__Group__7__Impl_in_rule__PagePrincipale__Group__71326 = new BitSet(new long[]{0x0000000000320000L});
        public static final BitSet FOLLOW_rule__PagePrincipale__Group__8_in_rule__PagePrincipale__Group__71329 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PagePrincipale__Group_7__0_in_rule__PagePrincipale__Group__7__Impl1356 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PagePrincipale__Group__8__Impl_in_rule__PagePrincipale__Group__81387 = new BitSet(new long[]{0x0000000000320000L});
        public static final BitSet FOLLOW_rule__PagePrincipale__Group__9_in_rule__PagePrincipale__Group__81390 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PagePrincipale__Group_8__0_in_rule__PagePrincipale__Group__8__Impl1417 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PagePrincipale__Group__9__Impl_in_rule__PagePrincipale__Group__91448 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_rule__PagePrincipale__Group__10_in_rule__PagePrincipale__Group__91451 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__PagePrincipale__Group__9__Impl1479 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PagePrincipale__Group__10__Impl_in_rule__PagePrincipale__Group__101510 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_rule__PagePrincipale__Group__11_in_rule__PagePrincipale__Group__101513 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PagePrincipale__ConfigurationPageAssignment_10_in_rule__PagePrincipale__Group__10__Impl1540 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PagePrincipale__Group__11__Impl_in_rule__PagePrincipale__Group__111570 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__PagePrincipale__Group__12_in_rule__PagePrincipale__Group__111573 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__PagePrincipale__Group__11__Impl1601 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PagePrincipale__Group__12__Impl_in_rule__PagePrincipale__Group__121632 = new BitSet(new long[]{0x0000020000000000L});
        public static final BitSet FOLLOW_rule__PagePrincipale__Group__13_in_rule__PagePrincipale__Group__121635 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__PagePrincipale__Group__12__Impl1663 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PagePrincipale__Group__13__Impl_in_rule__PagePrincipale__Group__131694 = new BitSet(new long[]{0x0000000000090000L});
        public static final BitSet FOLLOW_rule__PagePrincipale__Group__14_in_rule__PagePrincipale__Group__131697 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PagePrincipale__PagesAssignment_13_in_rule__PagePrincipale__Group__13__Impl1724 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PagePrincipale__Group__14__Impl_in_rule__PagePrincipale__Group__141754 = new BitSet(new long[]{0x0000000000090000L});
        public static final BitSet FOLLOW_rule__PagePrincipale__Group__15_in_rule__PagePrincipale__Group__141757 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PagePrincipale__Group_14__0_in_rule__PagePrincipale__Group__14__Impl1784 = new BitSet(new long[]{0x0000000000080002L});
        public static final BitSet FOLLOW_rule__PagePrincipale__Group__15__Impl_in_rule__PagePrincipale__Group__151815 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_rule__PagePrincipale__Group__16_in_rule__PagePrincipale__Group__151818 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__PagePrincipale__Group__15__Impl1846 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PagePrincipale__Group__16__Impl_in_rule__PagePrincipale__Group__161877 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__PagePrincipale__Group__16__Impl1905 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PagePrincipale__Group_5__0__Impl_in_rule__PagePrincipale__Group_5__01970 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_rule__PagePrincipale__Group_5__1_in_rule__PagePrincipale__Group_5__01973 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__PagePrincipale__Group_5__0__Impl2001 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PagePrincipale__Group_5__1__Impl_in_rule__PagePrincipale__Group_5__12032 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PagePrincipale__ContactsAssignment_5_1_in_rule__PagePrincipale__Group_5__1__Impl2059 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PagePrincipale__Group_7__0__Impl_in_rule__PagePrincipale__Group_7__02093 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_rule__PagePrincipale__Group_7__1_in_rule__PagePrincipale__Group_7__02096 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__PagePrincipale__Group_7__0__Impl2124 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PagePrincipale__Group_7__1__Impl_in_rule__PagePrincipale__Group_7__12155 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PagePrincipale__RubriquesAssignment_7_1_in_rule__PagePrincipale__Group_7__1__Impl2182 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PagePrincipale__Group_8__0__Impl_in_rule__PagePrincipale__Group_8__02216 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__PagePrincipale__Group_8__1_in_rule__PagePrincipale__Group_8__02219 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__PagePrincipale__Group_8__0__Impl2247 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PagePrincipale__Group_8__1__Impl_in_rule__PagePrincipale__Group_8__12278 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_rule__PagePrincipale__Group_8__2_in_rule__PagePrincipale__Group_8__12281 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__PagePrincipale__Group_8__1__Impl2309 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PagePrincipale__Group_8__2__Impl_in_rule__PagePrincipale__Group_8__22340 = new BitSet(new long[]{0x0000000000090000L});
        public static final BitSet FOLLOW_rule__PagePrincipale__Group_8__3_in_rule__PagePrincipale__Group_8__22343 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PagePrincipale__FichiersAssignment_8_2_in_rule__PagePrincipale__Group_8__2__Impl2370 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PagePrincipale__Group_8__3__Impl_in_rule__PagePrincipale__Group_8__32400 = new BitSet(new long[]{0x0000000000090000L});
        public static final BitSet FOLLOW_rule__PagePrincipale__Group_8__4_in_rule__PagePrincipale__Group_8__32403 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PagePrincipale__Group_8_3__0_in_rule__PagePrincipale__Group_8__3__Impl2430 = new BitSet(new long[]{0x0000000000080002L});
        public static final BitSet FOLLOW_rule__PagePrincipale__Group_8__4__Impl_in_rule__PagePrincipale__Group_8__42461 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__PagePrincipale__Group_8__4__Impl2489 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PagePrincipale__Group_8_3__0__Impl_in_rule__PagePrincipale__Group_8_3__02530 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_rule__PagePrincipale__Group_8_3__1_in_rule__PagePrincipale__Group_8_3__02533 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__PagePrincipale__Group_8_3__0__Impl2561 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PagePrincipale__Group_8_3__1__Impl_in_rule__PagePrincipale__Group_8_3__12592 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PagePrincipale__FichiersAssignment_8_3_1_in_rule__PagePrincipale__Group_8_3__1__Impl2619 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PagePrincipale__Group_14__0__Impl_in_rule__PagePrincipale__Group_14__02653 = new BitSet(new long[]{0x0000020000000000L});
        public static final BitSet FOLLOW_rule__PagePrincipale__Group_14__1_in_rule__PagePrincipale__Group_14__02656 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__PagePrincipale__Group_14__0__Impl2684 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PagePrincipale__Group_14__1__Impl_in_rule__PagePrincipale__Group_14__12715 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PagePrincipale__PagesAssignment_14_1_in_rule__PagePrincipale__Group_14__1__Impl2742 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Contact__Group__0__Impl_in_rule__Contact__Group__02776 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_rule__Contact__Group__1_in_rule__Contact__Group__02779 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Contact__Group__1__Impl_in_rule__Contact__Group__12837 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__Contact__Group__2_in_rule__Contact__Group__12840 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__Contact__Group__1__Impl2868 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Contact__Group__2__Impl_in_rule__Contact__Group__22899 = new BitSet(new long[]{0x000000000F810000L});
        public static final BitSet FOLLOW_rule__Contact__Group__3_in_rule__Contact__Group__22902 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Contact__Group__2__Impl2930 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Contact__Group__3__Impl_in_rule__Contact__Group__32961 = new BitSet(new long[]{0x000000000F810000L});
        public static final BitSet FOLLOW_rule__Contact__Group__4_in_rule__Contact__Group__32964 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Contact__Group_3__0_in_rule__Contact__Group__3__Impl2991 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Contact__Group__4__Impl_in_rule__Contact__Group__43022 = new BitSet(new long[]{0x000000000F810000L});
        public static final BitSet FOLLOW_rule__Contact__Group__5_in_rule__Contact__Group__43025 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Contact__Group_4__0_in_rule__Contact__Group__4__Impl3052 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Contact__Group__5__Impl_in_rule__Contact__Group__53083 = new BitSet(new long[]{0x000000000F810000L});
        public static final BitSet FOLLOW_rule__Contact__Group__6_in_rule__Contact__Group__53086 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Contact__Group_5__0_in_rule__Contact__Group__5__Impl3113 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Contact__Group__6__Impl_in_rule__Contact__Group__63144 = new BitSet(new long[]{0x000000000F810000L});
        public static final BitSet FOLLOW_rule__Contact__Group__7_in_rule__Contact__Group__63147 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Contact__Group_6__0_in_rule__Contact__Group__6__Impl3174 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Contact__Group__7__Impl_in_rule__Contact__Group__73205 = new BitSet(new long[]{0x000000000F810000L});
        public static final BitSet FOLLOW_rule__Contact__Group__8_in_rule__Contact__Group__73208 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Contact__Group_7__0_in_rule__Contact__Group__7__Impl3235 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Contact__Group__8__Impl_in_rule__Contact__Group__83266 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__Contact__Group__8__Impl3294 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Contact__Group_3__0__Impl_in_rule__Contact__Group_3__03343 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Contact__Group_3__1_in_rule__Contact__Group_3__03346 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__Contact__Group_3__0__Impl3374 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Contact__Group_3__1__Impl_in_rule__Contact__Group_3__13405 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Contact__NomAssignment_3_1_in_rule__Contact__Group_3__1__Impl3432 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Contact__Group_4__0__Impl_in_rule__Contact__Group_4__03466 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Contact__Group_4__1_in_rule__Contact__Group_4__03469 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__Contact__Group_4__0__Impl3497 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Contact__Group_4__1__Impl_in_rule__Contact__Group_4__13528 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Contact__PrenomAssignment_4_1_in_rule__Contact__Group_4__1__Impl3555 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Contact__Group_5__0__Impl_in_rule__Contact__Group_5__03589 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Contact__Group_5__1_in_rule__Contact__Group_5__03592 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__Contact__Group_5__0__Impl3620 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Contact__Group_5__1__Impl_in_rule__Contact__Group_5__13651 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Contact__AdresseAssignment_5_1_in_rule__Contact__Group_5__1__Impl3678 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Contact__Group_6__0__Impl_in_rule__Contact__Group_6__03712 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Contact__Group_6__1_in_rule__Contact__Group_6__03715 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__Contact__Group_6__0__Impl3743 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Contact__Group_6__1__Impl_in_rule__Contact__Group_6__13774 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Contact__MailAssignment_6_1_in_rule__Contact__Group_6__1__Impl3801 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Contact__Group_7__0__Impl_in_rule__Contact__Group_7__03835 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Contact__Group_7__1_in_rule__Contact__Group_7__03838 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__Contact__Group_7__0__Impl3866 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Contact__Group_7__1__Impl_in_rule__Contact__Group_7__13897 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Contact__TelephoneAssignment_7_1_in_rule__Contact__Group_7__1__Impl3924 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Rubriques__Group__0__Impl_in_rule__Rubriques__Group__03958 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_rule__Rubriques__Group__1_in_rule__Rubriques__Group__03961 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Rubriques__Group__1__Impl_in_rule__Rubriques__Group__14019 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__Rubriques__Group__2_in_rule__Rubriques__Group__14022 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__Rubriques__Group__1__Impl4050 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Rubriques__Group__2__Impl_in_rule__Rubriques__Group__24081 = new BitSet(new long[]{0x0000000060010000L});
        public static final BitSet FOLLOW_rule__Rubriques__Group__3_in_rule__Rubriques__Group__24084 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Rubriques__Group__2__Impl4112 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Rubriques__Group__3__Impl_in_rule__Rubriques__Group__34143 = new BitSet(new long[]{0x0000000060010000L});
        public static final BitSet FOLLOW_rule__Rubriques__Group__4_in_rule__Rubriques__Group__34146 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Rubriques__Group_3__0_in_rule__Rubriques__Group__3__Impl4173 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Rubriques__Group__4__Impl_in_rule__Rubriques__Group__44204 = new BitSet(new long[]{0x0000000060010000L});
        public static final BitSet FOLLOW_rule__Rubriques__Group__5_in_rule__Rubriques__Group__44207 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Rubriques__Group_4__0_in_rule__Rubriques__Group__4__Impl4234 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Rubriques__Group__5__Impl_in_rule__Rubriques__Group__54265 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__Rubriques__Group__5__Impl4293 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Rubriques__Group_3__0__Impl_in_rule__Rubriques__Group_3__04336 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Rubriques__Group_3__1_in_rule__Rubriques__Group_3__04339 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__Rubriques__Group_3__0__Impl4367 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Rubriques__Group_3__1__Impl_in_rule__Rubriques__Group_3__14398 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Rubriques__TexteAssignment_3_1_in_rule__Rubriques__Group_3__1__Impl4425 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Rubriques__Group_4__0__Impl_in_rule__Rubriques__Group_4__04459 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Rubriques__Group_4__1_in_rule__Rubriques__Group_4__04462 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__Rubriques__Group_4__0__Impl4490 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Rubriques__Group_4__1__Impl_in_rule__Rubriques__Group_4__14521 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Rubriques__LienAssignment_4_1_in_rule__Rubriques__Group_4__1__Impl4548 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Fichiers__Group__0__Impl_in_rule__Fichiers__Group__04582 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_rule__Fichiers__Group__1_in_rule__Fichiers__Group__04585 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Fichiers__Group__1__Impl_in_rule__Fichiers__Group__14643 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__Fichiers__Group__2_in_rule__Fichiers__Group__14646 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__Fichiers__Group__1__Impl4674 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Fichiers__Group__2__Impl_in_rule__Fichiers__Group__24705 = new BitSet(new long[]{0x0000000700810000L});
        public static final BitSet FOLLOW_rule__Fichiers__Group__3_in_rule__Fichiers__Group__24708 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Fichiers__Group__2__Impl4736 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Fichiers__Group__3__Impl_in_rule__Fichiers__Group__34767 = new BitSet(new long[]{0x0000000700810000L});
        public static final BitSet FOLLOW_rule__Fichiers__Group__4_in_rule__Fichiers__Group__34770 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Fichiers__Group_3__0_in_rule__Fichiers__Group__3__Impl4797 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Fichiers__Group__4__Impl_in_rule__Fichiers__Group__44828 = new BitSet(new long[]{0x0000000700810000L});
        public static final BitSet FOLLOW_rule__Fichiers__Group__5_in_rule__Fichiers__Group__44831 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Fichiers__Group_4__0_in_rule__Fichiers__Group__4__Impl4858 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Fichiers__Group__5__Impl_in_rule__Fichiers__Group__54889 = new BitSet(new long[]{0x0000000700810000L});
        public static final BitSet FOLLOW_rule__Fichiers__Group__6_in_rule__Fichiers__Group__54892 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Fichiers__Group_5__0_in_rule__Fichiers__Group__5__Impl4919 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Fichiers__Group__6__Impl_in_rule__Fichiers__Group__64950 = new BitSet(new long[]{0x0000000700810000L});
        public static final BitSet FOLLOW_rule__Fichiers__Group__7_in_rule__Fichiers__Group__64953 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Fichiers__Group_6__0_in_rule__Fichiers__Group__6__Impl4980 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Fichiers__Group__7__Impl_in_rule__Fichiers__Group__75011 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__Fichiers__Group__7__Impl5039 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Fichiers__Group_3__0__Impl_in_rule__Fichiers__Group_3__05086 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Fichiers__Group_3__1_in_rule__Fichiers__Group_3__05089 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_rule__Fichiers__Group_3__0__Impl5117 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Fichiers__Group_3__1__Impl_in_rule__Fichiers__Group_3__15148 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Fichiers__TypeAssignment_3_1_in_rule__Fichiers__Group_3__1__Impl5175 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Fichiers__Group_4__0__Impl_in_rule__Fichiers__Group_4__05209 = new BitSet(new long[]{0x0000400000000040L});
        public static final BitSet FOLLOW_rule__Fichiers__Group_4__1_in_rule__Fichiers__Group_4__05212 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_rule__Fichiers__Group_4__0__Impl5240 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Fichiers__Group_4__1__Impl_in_rule__Fichiers__Group_4__15271 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Fichiers__TailleAssignment_4_1_in_rule__Fichiers__Group_4__1__Impl5298 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Fichiers__Group_5__0__Impl_in_rule__Fichiers__Group_5__05332 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Fichiers__Group_5__1_in_rule__Fichiers__Group_5__05335 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__Fichiers__Group_5__0__Impl5363 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Fichiers__Group_5__1__Impl_in_rule__Fichiers__Group_5__15394 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Fichiers__NomAssignment_5_1_in_rule__Fichiers__Group_5__1__Impl5421 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Fichiers__Group_6__0__Impl_in_rule__Fichiers__Group_6__05455 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Fichiers__Group_6__1_in_rule__Fichiers__Group_6__05458 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_rule__Fichiers__Group_6__0__Impl5486 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Fichiers__Group_6__1__Impl_in_rule__Fichiers__Group_6__15517 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Fichiers__EmplacementAssignment_6_1_in_rule__Fichiers__Group_6__1__Impl5544 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConfigurationPage__Group__0__Impl_in_rule__ConfigurationPage__Group__05578 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_rule__ConfigurationPage__Group__1_in_rule__ConfigurationPage__Group__05581 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConfigurationPage__Group__1__Impl_in_rule__ConfigurationPage__Group__15639 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__ConfigurationPage__Group__2_in_rule__ConfigurationPage__Group__15642 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_rule__ConfigurationPage__Group__1__Impl5670 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConfigurationPage__Group__2__Impl_in_rule__ConfigurationPage__Group__25701 = new BitSet(new long[]{0x000001F000010000L});
        public static final BitSet FOLLOW_rule__ConfigurationPage__Group__3_in_rule__ConfigurationPage__Group__25704 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__ConfigurationPage__Group__2__Impl5732 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConfigurationPage__Group__3__Impl_in_rule__ConfigurationPage__Group__35763 = new BitSet(new long[]{0x000001F000010000L});
        public static final BitSet FOLLOW_rule__ConfigurationPage__Group__4_in_rule__ConfigurationPage__Group__35766 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConfigurationPage__Group_3__0_in_rule__ConfigurationPage__Group__3__Impl5793 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConfigurationPage__Group__4__Impl_in_rule__ConfigurationPage__Group__45824 = new BitSet(new long[]{0x000001F000010000L});
        public static final BitSet FOLLOW_rule__ConfigurationPage__Group__5_in_rule__ConfigurationPage__Group__45827 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConfigurationPage__Group_4__0_in_rule__ConfigurationPage__Group__4__Impl5854 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConfigurationPage__Group__5__Impl_in_rule__ConfigurationPage__Group__55885 = new BitSet(new long[]{0x000001F000010000L});
        public static final BitSet FOLLOW_rule__ConfigurationPage__Group__6_in_rule__ConfigurationPage__Group__55888 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConfigurationPage__Group_5__0_in_rule__ConfigurationPage__Group__5__Impl5915 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConfigurationPage__Group__6__Impl_in_rule__ConfigurationPage__Group__65946 = new BitSet(new long[]{0x000001F000010000L});
        public static final BitSet FOLLOW_rule__ConfigurationPage__Group__7_in_rule__ConfigurationPage__Group__65949 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConfigurationPage__Group_6__0_in_rule__ConfigurationPage__Group__6__Impl5976 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConfigurationPage__Group__7__Impl_in_rule__ConfigurationPage__Group__76007 = new BitSet(new long[]{0x000001F000010000L});
        public static final BitSet FOLLOW_rule__ConfigurationPage__Group__8_in_rule__ConfigurationPage__Group__76010 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConfigurationPage__Group_7__0_in_rule__ConfigurationPage__Group__7__Impl6037 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConfigurationPage__Group__8__Impl_in_rule__ConfigurationPage__Group__86068 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__ConfigurationPage__Group__8__Impl6096 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConfigurationPage__Group_3__0__Impl_in_rule__ConfigurationPage__Group_3__06145 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__ConfigurationPage__Group_3__1_in_rule__ConfigurationPage__Group_3__06148 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_rule__ConfigurationPage__Group_3__0__Impl6176 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConfigurationPage__Group_3__1__Impl_in_rule__ConfigurationPage__Group_3__16207 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConfigurationPage__CouleurFondAssignment_3_1_in_rule__ConfigurationPage__Group_3__1__Impl6234 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConfigurationPage__Group_4__0__Impl_in_rule__ConfigurationPage__Group_4__06268 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__ConfigurationPage__Group_4__1_in_rule__ConfigurationPage__Group_4__06271 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_rule__ConfigurationPage__Group_4__0__Impl6299 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConfigurationPage__Group_4__1__Impl_in_rule__ConfigurationPage__Group_4__16330 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConfigurationPage__TitreSiteAssignment_4_1_in_rule__ConfigurationPage__Group_4__1__Impl6357 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConfigurationPage__Group_5__0__Impl_in_rule__ConfigurationPage__Group_5__06391 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__ConfigurationPage__Group_5__1_in_rule__ConfigurationPage__Group_5__06394 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_rule__ConfigurationPage__Group_5__0__Impl6422 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConfigurationPage__Group_5__1__Impl_in_rule__ConfigurationPage__Group_5__16453 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConfigurationPage__AuteursAssignment_5_1_in_rule__ConfigurationPage__Group_5__1__Impl6480 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConfigurationPage__Group_6__0__Impl_in_rule__ConfigurationPage__Group_6__06514 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__ConfigurationPage__Group_6__1_in_rule__ConfigurationPage__Group_6__06517 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_rule__ConfigurationPage__Group_6__0__Impl6545 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConfigurationPage__Group_6__1__Impl_in_rule__ConfigurationPage__Group_6__16576 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConfigurationPage__CouleurPoliceAssignment_6_1_in_rule__ConfigurationPage__Group_6__1__Impl6603 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConfigurationPage__Group_7__0__Impl_in_rule__ConfigurationPage__Group_7__06637 = new BitSet(new long[]{0x0000400000000040L});
        public static final BitSet FOLLOW_rule__ConfigurationPage__Group_7__1_in_rule__ConfigurationPage__Group_7__06640 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_rule__ConfigurationPage__Group_7__0__Impl6668 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConfigurationPage__Group_7__1__Impl_in_rule__ConfigurationPage__Group_7__16699 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConfigurationPage__TaillePoliceAssignment_7_1_in_rule__ConfigurationPage__Group_7__1__Impl6726 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PageInterne__Group__0__Impl_in_rule__PageInterne__Group__06760 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__PageInterne__Group__1_in_rule__PageInterne__Group__06763 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_rule__PageInterne__Group__0__Impl6791 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PageInterne__Group__1__Impl_in_rule__PageInterne__Group__16822 = new BitSet(new long[]{0x00003C0020000000L});
        public static final BitSet FOLLOW_rule__PageInterne__Group__2_in_rule__PageInterne__Group__16825 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__PageInterne__Group__1__Impl6853 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PageInterne__Group__2__Impl_in_rule__PageInterne__Group__26884 = new BitSet(new long[]{0x00003C0020000000L});
        public static final BitSet FOLLOW_rule__PageInterne__Group__3_in_rule__PageInterne__Group__26887 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PageInterne__Group_2__0_in_rule__PageInterne__Group__2__Impl6914 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PageInterne__Group__3__Impl_in_rule__PageInterne__Group__36945 = new BitSet(new long[]{0x00003C0020000000L});
        public static final BitSet FOLLOW_rule__PageInterne__Group__4_in_rule__PageInterne__Group__36948 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PageInterne__Group_3__0_in_rule__PageInterne__Group__3__Impl6975 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PageInterne__Group__4__Impl_in_rule__PageInterne__Group__47006 = new BitSet(new long[]{0x00003C0020000000L});
        public static final BitSet FOLLOW_rule__PageInterne__Group__5_in_rule__PageInterne__Group__47009 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PageInterne__Group_4__0_in_rule__PageInterne__Group__4__Impl7036 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PageInterne__Group__5__Impl_in_rule__PageInterne__Group__57067 = new BitSet(new long[]{0x00003C0020000000L});
        public static final BitSet FOLLOW_rule__PageInterne__Group__6_in_rule__PageInterne__Group__57070 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PageInterne__Group_5__0_in_rule__PageInterne__Group__5__Impl7097 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PageInterne__Group__6__Impl_in_rule__PageInterne__Group__67128 = new BitSet(new long[]{0x0010000000000000L});
        public static final BitSet FOLLOW_rule__PageInterne__Group__7_in_rule__PageInterne__Group__67131 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_42_in_rule__PageInterne__Group__6__Impl7159 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PageInterne__Group__7__Impl_in_rule__PageInterne__Group__77190 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_rule__PageInterne__Group__8_in_rule__PageInterne__Group__77193 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PageInterne__PhotoAssignment_7_in_rule__PageInterne__Group__7__Impl7220 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PageInterne__Group__8__Impl_in_rule__PageInterne__Group__87250 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__PageInterne__Group__8__Impl7278 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PageInterne__Group_2__0__Impl_in_rule__PageInterne__Group_2__07327 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__PageInterne__Group_2__1_in_rule__PageInterne__Group_2__07330 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_43_in_rule__PageInterne__Group_2__0__Impl7358 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PageInterne__Group_2__1__Impl_in_rule__PageInterne__Group_2__17389 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PageInterne__TitrePageAssignment_2_1_in_rule__PageInterne__Group_2__1__Impl7416 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PageInterne__Group_3__0__Impl_in_rule__PageInterne__Group_3__07450 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__PageInterne__Group_3__1_in_rule__PageInterne__Group_3__07453 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__PageInterne__Group_3__0__Impl7481 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PageInterne__Group_3__1__Impl_in_rule__PageInterne__Group_3__17512 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PageInterne__TexteAssignment_3_1_in_rule__PageInterne__Group_3__1__Impl7539 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PageInterne__Group_4__0__Impl_in_rule__PageInterne__Group_4__07573 = new BitSet(new long[]{0x0180800000000000L});
        public static final BitSet FOLLOW_rule__PageInterne__Group_4__1_in_rule__PageInterne__Group_4__07576 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_44_in_rule__PageInterne__Group_4__0__Impl7604 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PageInterne__Group_4__1__Impl_in_rule__PageInterne__Group_4__17635 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PageInterne__TypesAssignment_4_1_in_rule__PageInterne__Group_4__1__Impl7662 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PageInterne__Group_5__0__Impl_in_rule__PageInterne__Group_5__07696 = new BitSet(new long[]{0x0001000000000000L});
        public static final BitSet FOLLOW_rule__PageInterne__Group_5__1_in_rule__PageInterne__Group_5__07699 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_45_in_rule__PageInterne__Group_5__0__Impl7727 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PageInterne__Group_5__1__Impl_in_rule__PageInterne__Group_5__17758 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PageInterne__LiensAssignment_5_1_in_rule__PageInterne__Group_5__1__Impl7785 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EInt__Group__0__Impl_in_rule__EInt__Group__07819 = new BitSet(new long[]{0x0000400000000040L});
        public static final BitSet FOLLOW_rule__EInt__Group__1_in_rule__EInt__Group__07822 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_46_in_rule__EInt__Group__0__Impl7851 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EInt__Group__1__Impl_in_rule__EInt__Group__17884 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__EInt__Group__1__Impl7911 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Types__Group__0__Impl_in_rule__Types__Group__07944 = new BitSet(new long[]{0x0180800000000000L});
        public static final BitSet FOLLOW_rule__Types__Group__1_in_rule__Types__Group__07947 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Types__Group__1__Impl_in_rule__Types__Group__18005 = new BitSet(new long[]{0x0180800000000000L});
        public static final BitSet FOLLOW_rule__Types__Group__2_in_rule__Types__Group__18008 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Types__GrasAssignment_1_in_rule__Types__Group__1__Impl8035 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Types__Group__2__Impl_in_rule__Types__Group__28066 = new BitSet(new long[]{0x0180800000000000L});
        public static final BitSet FOLLOW_rule__Types__Group__3_in_rule__Types__Group__28069 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Types__ItaliqueAssignment_2_in_rule__Types__Group__2__Impl8096 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Types__Group__3__Impl_in_rule__Types__Group__38127 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_47_in_rule__Types__Group__3__Impl8155 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Liens__Group__0__Impl_in_rule__Liens__Group__08194 = new BitSet(new long[]{0x0001000000000000L});
        public static final BitSet FOLLOW_rule__Liens__Group__1_in_rule__Liens__Group__08197 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Liens__Group__1__Impl_in_rule__Liens__Group__18255 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__Liens__Group__2_in_rule__Liens__Group__18258 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_48_in_rule__Liens__Group__1__Impl8286 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Liens__Group__2__Impl_in_rule__Liens__Group__28317 = new BitSet(new long[]{0x000E000000010000L});
        public static final BitSet FOLLOW_rule__Liens__Group__3_in_rule__Liens__Group__28320 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Liens__Group__2__Impl8348 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Liens__Group__3__Impl_in_rule__Liens__Group__38379 = new BitSet(new long[]{0x000E000000010000L});
        public static final BitSet FOLLOW_rule__Liens__Group__4_in_rule__Liens__Group__38382 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Liens__Group_3__0_in_rule__Liens__Group__3__Impl8409 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Liens__Group__4__Impl_in_rule__Liens__Group__48440 = new BitSet(new long[]{0x000E000000010000L});
        public static final BitSet FOLLOW_rule__Liens__Group__5_in_rule__Liens__Group__48443 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Liens__Group_4__0_in_rule__Liens__Group__4__Impl8470 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Liens__Group__5__Impl_in_rule__Liens__Group__58501 = new BitSet(new long[]{0x000E000000010000L});
        public static final BitSet FOLLOW_rule__Liens__Group__6_in_rule__Liens__Group__58504 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Liens__Group_5__0_in_rule__Liens__Group__5__Impl8531 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Liens__Group__6__Impl_in_rule__Liens__Group__68562 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__Liens__Group__6__Impl8590 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Liens__Group_3__0__Impl_in_rule__Liens__Group_3__08635 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Liens__Group_3__1_in_rule__Liens__Group_3__08638 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_49_in_rule__Liens__Group_3__0__Impl8666 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Liens__Group_3__1__Impl_in_rule__Liens__Group_3__18697 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Liens__FichierAssignment_3_1_in_rule__Liens__Group_3__1__Impl8724 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Liens__Group_4__0__Impl_in_rule__Liens__Group_4__08758 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Liens__Group_4__1_in_rule__Liens__Group_4__08761 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_50_in_rule__Liens__Group_4__0__Impl8789 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Liens__Group_4__1__Impl_in_rule__Liens__Group_4__18820 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Liens__AdresseWebAssignment_4_1_in_rule__Liens__Group_4__1__Impl8847 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Liens__Group_5__0__Impl_in_rule__Liens__Group_5__08881 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Liens__Group_5__1_in_rule__Liens__Group_5__08884 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_51_in_rule__Liens__Group_5__0__Impl8912 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Liens__Group_5__1__Impl_in_rule__Liens__Group_5__18943 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Liens__PageInterneAssignment_5_1_in_rule__Liens__Group_5__1__Impl8970 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Photo__Group__0__Impl_in_rule__Photo__Group__09004 = new BitSet(new long[]{0x0010000000000000L});
        public static final BitSet FOLLOW_rule__Photo__Group__1_in_rule__Photo__Group__09007 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Photo__Group__1__Impl_in_rule__Photo__Group__19065 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__Photo__Group__2_in_rule__Photo__Group__19068 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_52_in_rule__Photo__Group__1__Impl9096 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Photo__Group__2__Impl_in_rule__Photo__Group__29127 = new BitSet(new long[]{0x0020000200810000L});
        public static final BitSet FOLLOW_rule__Photo__Group__3_in_rule__Photo__Group__29130 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Photo__Group__2__Impl9158 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Photo__Group__3__Impl_in_rule__Photo__Group__39189 = new BitSet(new long[]{0x0020000200810000L});
        public static final BitSet FOLLOW_rule__Photo__Group__4_in_rule__Photo__Group__39192 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Photo__Group_3__0_in_rule__Photo__Group__3__Impl9219 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Photo__Group__4__Impl_in_rule__Photo__Group__49250 = new BitSet(new long[]{0x0020000200810000L});
        public static final BitSet FOLLOW_rule__Photo__Group__5_in_rule__Photo__Group__49253 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Photo__Group_4__0_in_rule__Photo__Group__4__Impl9280 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Photo__Group__5__Impl_in_rule__Photo__Group__59311 = new BitSet(new long[]{0x0020000200810000L});
        public static final BitSet FOLLOW_rule__Photo__Group__6_in_rule__Photo__Group__59314 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Photo__Group_5__0_in_rule__Photo__Group__5__Impl9341 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Photo__Group__6__Impl_in_rule__Photo__Group__69372 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__Photo__Group__6__Impl9400 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Photo__Group_3__0__Impl_in_rule__Photo__Group_3__09445 = new BitSet(new long[]{0x0040400000000040L});
        public static final BitSet FOLLOW_rule__Photo__Group_3__1_in_rule__Photo__Group_3__09448 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_rule__Photo__Group_3__0__Impl9476 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Photo__Group_3__1__Impl_in_rule__Photo__Group_3__19507 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Photo__TailleAssignment_3_1_in_rule__Photo__Group_3__1__Impl9534 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Photo__Group_4__0__Impl_in_rule__Photo__Group_4__09568 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Photo__Group_4__1_in_rule__Photo__Group_4__09571 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_53_in_rule__Photo__Group_4__0__Impl9599 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Photo__Group_4__1__Impl_in_rule__Photo__Group_4__19630 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Photo__ExtensionAssignment_4_1_in_rule__Photo__Group_4__1__Impl9657 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Photo__Group_5__0__Impl_in_rule__Photo__Group_5__09691 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Photo__Group_5__1_in_rule__Photo__Group_5__09694 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__Photo__Group_5__0__Impl9722 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Photo__Group_5__1__Impl_in_rule__Photo__Group_5__19753 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Photo__NomAssignment_5_1_in_rule__Photo__Group_5__1__Impl9780 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EFloat__Group__0__Impl_in_rule__EFloat__Group__09814 = new BitSet(new long[]{0x0040400000000040L});
        public static final BitSet FOLLOW_rule__EFloat__Group__1_in_rule__EFloat__Group__09817 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_46_in_rule__EFloat__Group__0__Impl9846 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EFloat__Group__1__Impl_in_rule__EFloat__Group__19879 = new BitSet(new long[]{0x0040400000000040L});
        public static final BitSet FOLLOW_rule__EFloat__Group__2_in_rule__EFloat__Group__19882 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__EFloat__Group__1__Impl9910 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EFloat__Group__2__Impl_in_rule__EFloat__Group__29941 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_rule__EFloat__Group__3_in_rule__EFloat__Group__29944 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_54_in_rule__EFloat__Group__2__Impl9972 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EFloat__Group__3__Impl_in_rule__EFloat__Group__310003 = new BitSet(new long[]{0x0000000000001800L});
        public static final BitSet FOLLOW_rule__EFloat__Group__4_in_rule__EFloat__Group__310006 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__EFloat__Group__3__Impl10033 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EFloat__Group__4__Impl_in_rule__EFloat__Group__410062 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EFloat__Group_4__0_in_rule__EFloat__Group__4__Impl10089 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EFloat__Group_4__0__Impl_in_rule__EFloat__Group_4__010130 = new BitSet(new long[]{0x0000400000000040L});
        public static final BitSet FOLLOW_rule__EFloat__Group_4__1_in_rule__EFloat__Group_4__010133 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EFloat__Alternatives_4_0_in_rule__EFloat__Group_4__0__Impl10160 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EFloat__Group_4__1__Impl_in_rule__EFloat__Group_4__110190 = new BitSet(new long[]{0x0000400000000040L});
        public static final BitSet FOLLOW_rule__EFloat__Group_4__2_in_rule__EFloat__Group_4__110193 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_46_in_rule__EFloat__Group_4__1__Impl10222 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EFloat__Group_4__2__Impl_in_rule__EFloat__Group_4__210255 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__EFloat__Group_4__2__Impl10282 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleContact_in_rule__PagePrincipale__ContactsAssignment_410322 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleContact_in_rule__PagePrincipale__ContactsAssignment_5_110353 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRubriques_in_rule__PagePrincipale__RubriquesAssignment_7_110384 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFichiers_in_rule__PagePrincipale__FichiersAssignment_8_210415 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFichiers_in_rule__PagePrincipale__FichiersAssignment_8_3_110446 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConfigurationPage_in_rule__PagePrincipale__ConfigurationPageAssignment_1010477 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePageInterne_in_rule__PagePrincipale__PagesAssignment_1310508 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePageInterne_in_rule__PagePrincipale__PagesAssignment_14_110539 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Contact__NomAssignment_3_110570 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Contact__PrenomAssignment_4_110601 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Contact__AdresseAssignment_5_110632 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Contact__MailAssignment_6_110663 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Contact__TelephoneAssignment_7_110694 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Rubriques__TexteAssignment_3_110725 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Rubriques__LienAssignment_4_110756 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Fichiers__TypeAssignment_3_110787 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_rule__Fichiers__TailleAssignment_4_110818 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Fichiers__NomAssignment_5_110849 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Fichiers__EmplacementAssignment_6_110880 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__ConfigurationPage__CouleurFondAssignment_3_110911 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__ConfigurationPage__TitreSiteAssignment_4_110942 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__ConfigurationPage__AuteursAssignment_5_110973 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__ConfigurationPage__CouleurPoliceAssignment_6_111004 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_rule__ConfigurationPage__TaillePoliceAssignment_7_111035 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__PageInterne__TitrePageAssignment_2_111066 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__PageInterne__TexteAssignment_3_111097 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypes_in_rule__PageInterne__TypesAssignment_4_111128 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLiens_in_rule__PageInterne__LiensAssignment_5_111159 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePhoto_in_rule__PageInterne__PhotoAssignment_711190 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_55_in_rule__Types__GrasAssignment_111226 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_56_in_rule__Types__ItaliqueAssignment_211270 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Liens__FichierAssignment_3_111309 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Liens__AdresseWebAssignment_4_111340 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Liens__PageInterneAssignment_5_111371 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEFloat_in_rule__Photo__TailleAssignment_3_111402 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Photo__ExtensionAssignment_4_111433 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Photo__NomAssignment_5_111464 = new BitSet(new long[]{0x0000000000000002L});
    }


}