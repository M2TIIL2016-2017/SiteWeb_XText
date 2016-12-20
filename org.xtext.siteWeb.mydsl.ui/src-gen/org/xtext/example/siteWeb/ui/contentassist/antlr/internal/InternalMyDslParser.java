package org.xtext.example.siteWeb.ui.contentassist.antlr.internal; 

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
import org.xtext.example.siteWeb.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'E'", "'e'", "'PagePrincipale'", "'{'", "'configurationPage'", "'contacts'", "'}'", "'pages'", "','", "'rubriques'", "'fichiers'", "'Contact'", "'nom : '", "'prenom : '", "'adresse : '", "'mail : '", "'@'", "'.'", "'telephone : '", "'Rubriques'", "'texte : '", "'lien : '", "'Fichiers'", "'type : '", "'taille : '", "'emplacement : '", "'ConfigurationPage'", "'couleurFond : '", "'titreSite : '", "'auteurs : '", "'couleurPolice : '", "'taillePolice : '", "'PageInterne'", "'photo : '", "'titrePage : '", "'types : '", "'liens : '", "'-'", "'Types'", "'Liens'", "'fichier : '", "'adresseWeb : '", "'pageInterne : '", "'Photo'", "'extension : '", "'gras'", "'italique'"
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
    public static final int T__57=57;
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
    public String getGrammarFileName() { return "../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g"; }


     
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:60:1: entryRulePagePrincipale : rulePagePrincipale EOF ;
    public final void entryRulePagePrincipale() throws RecognitionException {
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:61:1: ( rulePagePrincipale EOF )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:62:1: rulePagePrincipale EOF
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:69:1: rulePagePrincipale : ( ( rule__PagePrincipale__Group__0 ) ) ;
    public final void rulePagePrincipale() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:73:2: ( ( ( rule__PagePrincipale__Group__0 ) ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:74:1: ( ( rule__PagePrincipale__Group__0 ) )
            {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:74:1: ( ( rule__PagePrincipale__Group__0 ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:75:1: ( rule__PagePrincipale__Group__0 )
            {
             before(grammarAccess.getPagePrincipaleAccess().getGroup()); 
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:76:1: ( rule__PagePrincipale__Group__0 )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:76:2: rule__PagePrincipale__Group__0
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:88:1: entryRuleContact : ruleContact EOF ;
    public final void entryRuleContact() throws RecognitionException {
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:89:1: ( ruleContact EOF )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:90:1: ruleContact EOF
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:97:1: ruleContact : ( ( rule__Contact__Group__0 ) ) ;
    public final void ruleContact() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:101:2: ( ( ( rule__Contact__Group__0 ) ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:102:1: ( ( rule__Contact__Group__0 ) )
            {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:102:1: ( ( rule__Contact__Group__0 ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:103:1: ( rule__Contact__Group__0 )
            {
             before(grammarAccess.getContactAccess().getGroup()); 
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:104:1: ( rule__Contact__Group__0 )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:104:2: rule__Contact__Group__0
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:116:1: entryRuleRubriques : ruleRubriques EOF ;
    public final void entryRuleRubriques() throws RecognitionException {
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:117:1: ( ruleRubriques EOF )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:118:1: ruleRubriques EOF
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:125:1: ruleRubriques : ( ( rule__Rubriques__Group__0 ) ) ;
    public final void ruleRubriques() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:129:2: ( ( ( rule__Rubriques__Group__0 ) ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:130:1: ( ( rule__Rubriques__Group__0 ) )
            {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:130:1: ( ( rule__Rubriques__Group__0 ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:131:1: ( rule__Rubriques__Group__0 )
            {
             before(grammarAccess.getRubriquesAccess().getGroup()); 
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:132:1: ( rule__Rubriques__Group__0 )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:132:2: rule__Rubriques__Group__0
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:144:1: entryRuleFichiers : ruleFichiers EOF ;
    public final void entryRuleFichiers() throws RecognitionException {
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:145:1: ( ruleFichiers EOF )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:146:1: ruleFichiers EOF
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:153:1: ruleFichiers : ( ( rule__Fichiers__Group__0 ) ) ;
    public final void ruleFichiers() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:157:2: ( ( ( rule__Fichiers__Group__0 ) ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:158:1: ( ( rule__Fichiers__Group__0 ) )
            {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:158:1: ( ( rule__Fichiers__Group__0 ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:159:1: ( rule__Fichiers__Group__0 )
            {
             before(grammarAccess.getFichiersAccess().getGroup()); 
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:160:1: ( rule__Fichiers__Group__0 )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:160:2: rule__Fichiers__Group__0
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:172:1: entryRuleConfigurationPage : ruleConfigurationPage EOF ;
    public final void entryRuleConfigurationPage() throws RecognitionException {
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:173:1: ( ruleConfigurationPage EOF )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:174:1: ruleConfigurationPage EOF
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:181:1: ruleConfigurationPage : ( ( rule__ConfigurationPage__Group__0 ) ) ;
    public final void ruleConfigurationPage() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:185:2: ( ( ( rule__ConfigurationPage__Group__0 ) ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:186:1: ( ( rule__ConfigurationPage__Group__0 ) )
            {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:186:1: ( ( rule__ConfigurationPage__Group__0 ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:187:1: ( rule__ConfigurationPage__Group__0 )
            {
             before(grammarAccess.getConfigurationPageAccess().getGroup()); 
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:188:1: ( rule__ConfigurationPage__Group__0 )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:188:2: rule__ConfigurationPage__Group__0
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:200:1: entryRulePageInterne : rulePageInterne EOF ;
    public final void entryRulePageInterne() throws RecognitionException {
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:201:1: ( rulePageInterne EOF )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:202:1: rulePageInterne EOF
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:209:1: rulePageInterne : ( ( rule__PageInterne__Group__0 ) ) ;
    public final void rulePageInterne() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:213:2: ( ( ( rule__PageInterne__Group__0 ) ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:214:1: ( ( rule__PageInterne__Group__0 ) )
            {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:214:1: ( ( rule__PageInterne__Group__0 ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:215:1: ( rule__PageInterne__Group__0 )
            {
             before(grammarAccess.getPageInterneAccess().getGroup()); 
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:216:1: ( rule__PageInterne__Group__0 )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:216:2: rule__PageInterne__Group__0
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:228:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:229:1: ( ruleEString EOF )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:230:1: ruleEString EOF
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:237:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:241:2: ( ( ( rule__EString__Alternatives ) ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:242:1: ( ( rule__EString__Alternatives ) )
            {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:242:1: ( ( rule__EString__Alternatives ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:243:1: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:244:1: ( rule__EString__Alternatives )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:244:2: rule__EString__Alternatives
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:256:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:257:1: ( ruleEInt EOF )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:258:1: ruleEInt EOF
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:265:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:269:2: ( ( ( rule__EInt__Group__0 ) ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:270:1: ( ( rule__EInt__Group__0 ) )
            {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:270:1: ( ( rule__EInt__Group__0 ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:271:1: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:272:1: ( rule__EInt__Group__0 )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:272:2: rule__EInt__Group__0
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:284:1: entryRuleTypes : ruleTypes EOF ;
    public final void entryRuleTypes() throws RecognitionException {
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:285:1: ( ruleTypes EOF )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:286:1: ruleTypes EOF
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:293:1: ruleTypes : ( ( rule__Types__Group__0 ) ) ;
    public final void ruleTypes() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:297:2: ( ( ( rule__Types__Group__0 ) ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:298:1: ( ( rule__Types__Group__0 ) )
            {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:298:1: ( ( rule__Types__Group__0 ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:299:1: ( rule__Types__Group__0 )
            {
             before(grammarAccess.getTypesAccess().getGroup()); 
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:300:1: ( rule__Types__Group__0 )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:300:2: rule__Types__Group__0
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:312:1: entryRuleLiens : ruleLiens EOF ;
    public final void entryRuleLiens() throws RecognitionException {
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:313:1: ( ruleLiens EOF )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:314:1: ruleLiens EOF
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:321:1: ruleLiens : ( ( rule__Liens__Group__0 ) ) ;
    public final void ruleLiens() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:325:2: ( ( ( rule__Liens__Group__0 ) ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:326:1: ( ( rule__Liens__Group__0 ) )
            {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:326:1: ( ( rule__Liens__Group__0 ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:327:1: ( rule__Liens__Group__0 )
            {
             before(grammarAccess.getLiensAccess().getGroup()); 
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:328:1: ( rule__Liens__Group__0 )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:328:2: rule__Liens__Group__0
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:340:1: entryRulePhoto : rulePhoto EOF ;
    public final void entryRulePhoto() throws RecognitionException {
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:341:1: ( rulePhoto EOF )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:342:1: rulePhoto EOF
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:349:1: rulePhoto : ( ( rule__Photo__Group__0 ) ) ;
    public final void rulePhoto() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:353:2: ( ( ( rule__Photo__Group__0 ) ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:354:1: ( ( rule__Photo__Group__0 ) )
            {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:354:1: ( ( rule__Photo__Group__0 ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:355:1: ( rule__Photo__Group__0 )
            {
             before(grammarAccess.getPhotoAccess().getGroup()); 
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:356:1: ( rule__Photo__Group__0 )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:356:2: rule__Photo__Group__0
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:370:1: entryRuleEFloat : ruleEFloat EOF ;
    public final void entryRuleEFloat() throws RecognitionException {
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:371:1: ( ruleEFloat EOF )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:372:1: ruleEFloat EOF
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:379:1: ruleEFloat : ( ( rule__EFloat__Group__0 ) ) ;
    public final void ruleEFloat() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:383:2: ( ( ( rule__EFloat__Group__0 ) ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:384:1: ( ( rule__EFloat__Group__0 ) )
            {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:384:1: ( ( rule__EFloat__Group__0 ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:385:1: ( rule__EFloat__Group__0 )
            {
             before(grammarAccess.getEFloatAccess().getGroup()); 
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:386:1: ( rule__EFloat__Group__0 )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:386:2: rule__EFloat__Group__0
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:398:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:402:1: ( ( RULE_STRING ) | ( RULE_ID ) )
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
                    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:403:1: ( RULE_STRING )
                    {
                    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:403:1: ( RULE_STRING )
                    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:404:1: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__EString__Alternatives792); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:409:6: ( RULE_ID )
                    {
                    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:409:6: ( RULE_ID )
                    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:410:1: RULE_ID
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:421:1: rule__EFloat__Alternatives_4_0 : ( ( 'E' ) | ( 'e' ) );
    public final void rule__EFloat__Alternatives_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:425:1: ( ( 'E' ) | ( 'e' ) )
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
                    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:426:1: ( 'E' )
                    {
                    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:426:1: ( 'E' )
                    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:427:1: 'E'
                    {
                     before(grammarAccess.getEFloatAccess().getEKeyword_4_0_0()); 
                    match(input,11,FollowSets000.FOLLOW_11_in_rule__EFloat__Alternatives_4_0843); 
                     after(grammarAccess.getEFloatAccess().getEKeyword_4_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:434:6: ( 'e' )
                    {
                    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:434:6: ( 'e' )
                    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:435:1: 'e'
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:449:1: rule__PagePrincipale__Group__0 : rule__PagePrincipale__Group__0__Impl rule__PagePrincipale__Group__1 ;
    public final void rule__PagePrincipale__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:453:1: ( rule__PagePrincipale__Group__0__Impl rule__PagePrincipale__Group__1 )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:454:2: rule__PagePrincipale__Group__0__Impl rule__PagePrincipale__Group__1
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:461:1: rule__PagePrincipale__Group__0__Impl : ( 'PagePrincipale' ) ;
    public final void rule__PagePrincipale__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:465:1: ( ( 'PagePrincipale' ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:466:1: ( 'PagePrincipale' )
            {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:466:1: ( 'PagePrincipale' )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:467:1: 'PagePrincipale'
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:480:1: rule__PagePrincipale__Group__1 : rule__PagePrincipale__Group__1__Impl rule__PagePrincipale__Group__2 ;
    public final void rule__PagePrincipale__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:484:1: ( rule__PagePrincipale__Group__1__Impl rule__PagePrincipale__Group__2 )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:485:2: rule__PagePrincipale__Group__1__Impl rule__PagePrincipale__Group__2
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:492:1: rule__PagePrincipale__Group__1__Impl : ( '{' ) ;
    public final void rule__PagePrincipale__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:496:1: ( ( '{' ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:497:1: ( '{' )
            {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:497:1: ( '{' )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:498:1: '{'
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:511:1: rule__PagePrincipale__Group__2 : rule__PagePrincipale__Group__2__Impl rule__PagePrincipale__Group__3 ;
    public final void rule__PagePrincipale__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:515:1: ( rule__PagePrincipale__Group__2__Impl rule__PagePrincipale__Group__3 )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:516:2: rule__PagePrincipale__Group__2__Impl rule__PagePrincipale__Group__3
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:523:1: rule__PagePrincipale__Group__2__Impl : ( 'configurationPage' ) ;
    public final void rule__PagePrincipale__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:527:1: ( ( 'configurationPage' ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:528:1: ( 'configurationPage' )
            {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:528:1: ( 'configurationPage' )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:529:1: 'configurationPage'
            {
             before(grammarAccess.getPagePrincipaleAccess().getConfigurationPageKeyword_2()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__PagePrincipale__Group__2__Impl1050); 
             after(grammarAccess.getPagePrincipaleAccess().getConfigurationPageKeyword_2()); 

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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:542:1: rule__PagePrincipale__Group__3 : rule__PagePrincipale__Group__3__Impl rule__PagePrincipale__Group__4 ;
    public final void rule__PagePrincipale__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:546:1: ( rule__PagePrincipale__Group__3__Impl rule__PagePrincipale__Group__4 )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:547:2: rule__PagePrincipale__Group__3__Impl rule__PagePrincipale__Group__4
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:554:1: rule__PagePrincipale__Group__3__Impl : ( ( rule__PagePrincipale__ConfigurationPageAssignment_3 ) ) ;
    public final void rule__PagePrincipale__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:558:1: ( ( ( rule__PagePrincipale__ConfigurationPageAssignment_3 ) ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:559:1: ( ( rule__PagePrincipale__ConfigurationPageAssignment_3 ) )
            {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:559:1: ( ( rule__PagePrincipale__ConfigurationPageAssignment_3 ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:560:1: ( rule__PagePrincipale__ConfigurationPageAssignment_3 )
            {
             before(grammarAccess.getPagePrincipaleAccess().getConfigurationPageAssignment_3()); 
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:561:1: ( rule__PagePrincipale__ConfigurationPageAssignment_3 )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:561:2: rule__PagePrincipale__ConfigurationPageAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__PagePrincipale__ConfigurationPageAssignment_3_in_rule__PagePrincipale__Group__3__Impl1111);
            rule__PagePrincipale__ConfigurationPageAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getPagePrincipaleAccess().getConfigurationPageAssignment_3()); 

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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:571:1: rule__PagePrincipale__Group__4 : rule__PagePrincipale__Group__4__Impl rule__PagePrincipale__Group__5 ;
    public final void rule__PagePrincipale__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:575:1: ( rule__PagePrincipale__Group__4__Impl rule__PagePrincipale__Group__5 )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:576:2: rule__PagePrincipale__Group__4__Impl rule__PagePrincipale__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__PagePrincipale__Group__4__Impl_in_rule__PagePrincipale__Group__41141);
            rule__PagePrincipale__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PagePrincipale__Group__5_in_rule__PagePrincipale__Group__41144);
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:583:1: rule__PagePrincipale__Group__4__Impl : ( 'contacts' ) ;
    public final void rule__PagePrincipale__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:587:1: ( ( 'contacts' ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:588:1: ( 'contacts' )
            {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:588:1: ( 'contacts' )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:589:1: 'contacts'
            {
             before(grammarAccess.getPagePrincipaleAccess().getContactsKeyword_4()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__PagePrincipale__Group__4__Impl1172); 
             after(grammarAccess.getPagePrincipaleAccess().getContactsKeyword_4()); 

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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:602:1: rule__PagePrincipale__Group__5 : rule__PagePrincipale__Group__5__Impl rule__PagePrincipale__Group__6 ;
    public final void rule__PagePrincipale__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:606:1: ( rule__PagePrincipale__Group__5__Impl rule__PagePrincipale__Group__6 )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:607:2: rule__PagePrincipale__Group__5__Impl rule__PagePrincipale__Group__6
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:614:1: rule__PagePrincipale__Group__5__Impl : ( '{' ) ;
    public final void rule__PagePrincipale__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:618:1: ( ( '{' ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:619:1: ( '{' )
            {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:619:1: ( '{' )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:620:1: '{'
            {
             before(grammarAccess.getPagePrincipaleAccess().getLeftCurlyBracketKeyword_5()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__PagePrincipale__Group__5__Impl1234); 
             after(grammarAccess.getPagePrincipaleAccess().getLeftCurlyBracketKeyword_5()); 

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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:633:1: rule__PagePrincipale__Group__6 : rule__PagePrincipale__Group__6__Impl rule__PagePrincipale__Group__7 ;
    public final void rule__PagePrincipale__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:637:1: ( rule__PagePrincipale__Group__6__Impl rule__PagePrincipale__Group__7 )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:638:2: rule__PagePrincipale__Group__6__Impl rule__PagePrincipale__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__PagePrincipale__Group__6__Impl_in_rule__PagePrincipale__Group__61265);
            rule__PagePrincipale__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PagePrincipale__Group__7_in_rule__PagePrincipale__Group__61268);
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:645:1: rule__PagePrincipale__Group__6__Impl : ( ( rule__PagePrincipale__ContactsAssignment_6 ) ) ;
    public final void rule__PagePrincipale__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:649:1: ( ( ( rule__PagePrincipale__ContactsAssignment_6 ) ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:650:1: ( ( rule__PagePrincipale__ContactsAssignment_6 ) )
            {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:650:1: ( ( rule__PagePrincipale__ContactsAssignment_6 ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:651:1: ( rule__PagePrincipale__ContactsAssignment_6 )
            {
             before(grammarAccess.getPagePrincipaleAccess().getContactsAssignment_6()); 
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:652:1: ( rule__PagePrincipale__ContactsAssignment_6 )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:652:2: rule__PagePrincipale__ContactsAssignment_6
            {
            pushFollow(FollowSets000.FOLLOW_rule__PagePrincipale__ContactsAssignment_6_in_rule__PagePrincipale__Group__6__Impl1295);
            rule__PagePrincipale__ContactsAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getPagePrincipaleAccess().getContactsAssignment_6()); 

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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:662:1: rule__PagePrincipale__Group__7 : rule__PagePrincipale__Group__7__Impl rule__PagePrincipale__Group__8 ;
    public final void rule__PagePrincipale__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:666:1: ( rule__PagePrincipale__Group__7__Impl rule__PagePrincipale__Group__8 )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:667:2: rule__PagePrincipale__Group__7__Impl rule__PagePrincipale__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__PagePrincipale__Group__7__Impl_in_rule__PagePrincipale__Group__71325);
            rule__PagePrincipale__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PagePrincipale__Group__8_in_rule__PagePrincipale__Group__71328);
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:674:1: rule__PagePrincipale__Group__7__Impl : ( ( rule__PagePrincipale__Group_7__0 )* ) ;
    public final void rule__PagePrincipale__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:678:1: ( ( ( rule__PagePrincipale__Group_7__0 )* ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:679:1: ( ( rule__PagePrincipale__Group_7__0 )* )
            {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:679:1: ( ( rule__PagePrincipale__Group_7__0 )* )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:680:1: ( rule__PagePrincipale__Group_7__0 )*
            {
             before(grammarAccess.getPagePrincipaleAccess().getGroup_7()); 
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:681:1: ( rule__PagePrincipale__Group_7__0 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==19) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:681:2: rule__PagePrincipale__Group_7__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__PagePrincipale__Group_7__0_in_rule__PagePrincipale__Group__7__Impl1355);
            	    rule__PagePrincipale__Group_7__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:691:1: rule__PagePrincipale__Group__8 : rule__PagePrincipale__Group__8__Impl rule__PagePrincipale__Group__9 ;
    public final void rule__PagePrincipale__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:695:1: ( rule__PagePrincipale__Group__8__Impl rule__PagePrincipale__Group__9 )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:696:2: rule__PagePrincipale__Group__8__Impl rule__PagePrincipale__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_rule__PagePrincipale__Group__8__Impl_in_rule__PagePrincipale__Group__81386);
            rule__PagePrincipale__Group__8__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PagePrincipale__Group__9_in_rule__PagePrincipale__Group__81389);
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:703:1: rule__PagePrincipale__Group__8__Impl : ( '}' ) ;
    public final void rule__PagePrincipale__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:707:1: ( ( '}' ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:708:1: ( '}' )
            {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:708:1: ( '}' )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:709:1: '}'
            {
             before(grammarAccess.getPagePrincipaleAccess().getRightCurlyBracketKeyword_8()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__PagePrincipale__Group__8__Impl1417); 
             after(grammarAccess.getPagePrincipaleAccess().getRightCurlyBracketKeyword_8()); 

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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:722:1: rule__PagePrincipale__Group__9 : rule__PagePrincipale__Group__9__Impl rule__PagePrincipale__Group__10 ;
    public final void rule__PagePrincipale__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:726:1: ( rule__PagePrincipale__Group__9__Impl rule__PagePrincipale__Group__10 )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:727:2: rule__PagePrincipale__Group__9__Impl rule__PagePrincipale__Group__10
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:734:1: rule__PagePrincipale__Group__9__Impl : ( 'pages' ) ;
    public final void rule__PagePrincipale__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:738:1: ( ( 'pages' ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:739:1: ( 'pages' )
            {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:739:1: ( 'pages' )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:740:1: 'pages'
            {
             before(grammarAccess.getPagePrincipaleAccess().getPagesKeyword_9()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__PagePrincipale__Group__9__Impl1479); 
             after(grammarAccess.getPagePrincipaleAccess().getPagesKeyword_9()); 

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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:753:1: rule__PagePrincipale__Group__10 : rule__PagePrincipale__Group__10__Impl rule__PagePrincipale__Group__11 ;
    public final void rule__PagePrincipale__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:757:1: ( rule__PagePrincipale__Group__10__Impl rule__PagePrincipale__Group__11 )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:758:2: rule__PagePrincipale__Group__10__Impl rule__PagePrincipale__Group__11
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:765:1: rule__PagePrincipale__Group__10__Impl : ( '{' ) ;
    public final void rule__PagePrincipale__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:769:1: ( ( '{' ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:770:1: ( '{' )
            {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:770:1: ( '{' )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:771:1: '{'
            {
             before(grammarAccess.getPagePrincipaleAccess().getLeftCurlyBracketKeyword_10()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__PagePrincipale__Group__10__Impl1541); 
             after(grammarAccess.getPagePrincipaleAccess().getLeftCurlyBracketKeyword_10()); 

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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:784:1: rule__PagePrincipale__Group__11 : rule__PagePrincipale__Group__11__Impl rule__PagePrincipale__Group__12 ;
    public final void rule__PagePrincipale__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:788:1: ( rule__PagePrincipale__Group__11__Impl rule__PagePrincipale__Group__12 )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:789:2: rule__PagePrincipale__Group__11__Impl rule__PagePrincipale__Group__12
            {
            pushFollow(FollowSets000.FOLLOW_rule__PagePrincipale__Group__11__Impl_in_rule__PagePrincipale__Group__111572);
            rule__PagePrincipale__Group__11__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PagePrincipale__Group__12_in_rule__PagePrincipale__Group__111575);
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:796:1: rule__PagePrincipale__Group__11__Impl : ( ( rule__PagePrincipale__PagesAssignment_11 ) ) ;
    public final void rule__PagePrincipale__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:800:1: ( ( ( rule__PagePrincipale__PagesAssignment_11 ) ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:801:1: ( ( rule__PagePrincipale__PagesAssignment_11 ) )
            {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:801:1: ( ( rule__PagePrincipale__PagesAssignment_11 ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:802:1: ( rule__PagePrincipale__PagesAssignment_11 )
            {
             before(grammarAccess.getPagePrincipaleAccess().getPagesAssignment_11()); 
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:803:1: ( rule__PagePrincipale__PagesAssignment_11 )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:803:2: rule__PagePrincipale__PagesAssignment_11
            {
            pushFollow(FollowSets000.FOLLOW_rule__PagePrincipale__PagesAssignment_11_in_rule__PagePrincipale__Group__11__Impl1602);
            rule__PagePrincipale__PagesAssignment_11();

            state._fsp--;


            }

             after(grammarAccess.getPagePrincipaleAccess().getPagesAssignment_11()); 

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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:813:1: rule__PagePrincipale__Group__12 : rule__PagePrincipale__Group__12__Impl rule__PagePrincipale__Group__13 ;
    public final void rule__PagePrincipale__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:817:1: ( rule__PagePrincipale__Group__12__Impl rule__PagePrincipale__Group__13 )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:818:2: rule__PagePrincipale__Group__12__Impl rule__PagePrincipale__Group__13
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:825:1: rule__PagePrincipale__Group__12__Impl : ( ( rule__PagePrincipale__Group_12__0 )* ) ;
    public final void rule__PagePrincipale__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:829:1: ( ( ( rule__PagePrincipale__Group_12__0 )* ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:830:1: ( ( rule__PagePrincipale__Group_12__0 )* )
            {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:830:1: ( ( rule__PagePrincipale__Group_12__0 )* )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:831:1: ( rule__PagePrincipale__Group_12__0 )*
            {
             before(grammarAccess.getPagePrincipaleAccess().getGroup_12()); 
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:832:1: ( rule__PagePrincipale__Group_12__0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==19) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:832:2: rule__PagePrincipale__Group_12__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__PagePrincipale__Group_12__0_in_rule__PagePrincipale__Group__12__Impl1662);
            	    rule__PagePrincipale__Group_12__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getPagePrincipaleAccess().getGroup_12()); 

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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:842:1: rule__PagePrincipale__Group__13 : rule__PagePrincipale__Group__13__Impl rule__PagePrincipale__Group__14 ;
    public final void rule__PagePrincipale__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:846:1: ( rule__PagePrincipale__Group__13__Impl rule__PagePrincipale__Group__14 )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:847:2: rule__PagePrincipale__Group__13__Impl rule__PagePrincipale__Group__14
            {
            pushFollow(FollowSets000.FOLLOW_rule__PagePrincipale__Group__13__Impl_in_rule__PagePrincipale__Group__131693);
            rule__PagePrincipale__Group__13__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PagePrincipale__Group__14_in_rule__PagePrincipale__Group__131696);
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:854:1: rule__PagePrincipale__Group__13__Impl : ( '}' ) ;
    public final void rule__PagePrincipale__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:858:1: ( ( '}' ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:859:1: ( '}' )
            {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:859:1: ( '}' )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:860:1: '}'
            {
             before(grammarAccess.getPagePrincipaleAccess().getRightCurlyBracketKeyword_13()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__PagePrincipale__Group__13__Impl1724); 
             after(grammarAccess.getPagePrincipaleAccess().getRightCurlyBracketKeyword_13()); 

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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:873:1: rule__PagePrincipale__Group__14 : rule__PagePrincipale__Group__14__Impl rule__PagePrincipale__Group__15 ;
    public final void rule__PagePrincipale__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:877:1: ( rule__PagePrincipale__Group__14__Impl rule__PagePrincipale__Group__15 )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:878:2: rule__PagePrincipale__Group__14__Impl rule__PagePrincipale__Group__15
            {
            pushFollow(FollowSets000.FOLLOW_rule__PagePrincipale__Group__14__Impl_in_rule__PagePrincipale__Group__141755);
            rule__PagePrincipale__Group__14__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PagePrincipale__Group__15_in_rule__PagePrincipale__Group__141758);
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:885:1: rule__PagePrincipale__Group__14__Impl : ( ( rule__PagePrincipale__Group_14__0 )? ) ;
    public final void rule__PagePrincipale__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:889:1: ( ( ( rule__PagePrincipale__Group_14__0 )? ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:890:1: ( ( rule__PagePrincipale__Group_14__0 )? )
            {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:890:1: ( ( rule__PagePrincipale__Group_14__0 )? )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:891:1: ( rule__PagePrincipale__Group_14__0 )?
            {
             before(grammarAccess.getPagePrincipaleAccess().getGroup_14()); 
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:892:1: ( rule__PagePrincipale__Group_14__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==20) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:892:2: rule__PagePrincipale__Group_14__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__PagePrincipale__Group_14__0_in_rule__PagePrincipale__Group__14__Impl1785);
                    rule__PagePrincipale__Group_14__0();

                    state._fsp--;


                    }
                    break;

            }

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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:902:1: rule__PagePrincipale__Group__15 : rule__PagePrincipale__Group__15__Impl rule__PagePrincipale__Group__16 ;
    public final void rule__PagePrincipale__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:906:1: ( rule__PagePrincipale__Group__15__Impl rule__PagePrincipale__Group__16 )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:907:2: rule__PagePrincipale__Group__15__Impl rule__PagePrincipale__Group__16
            {
            pushFollow(FollowSets000.FOLLOW_rule__PagePrincipale__Group__15__Impl_in_rule__PagePrincipale__Group__151816);
            rule__PagePrincipale__Group__15__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PagePrincipale__Group__16_in_rule__PagePrincipale__Group__151819);
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:914:1: rule__PagePrincipale__Group__15__Impl : ( ( rule__PagePrincipale__Group_15__0 )? ) ;
    public final void rule__PagePrincipale__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:918:1: ( ( ( rule__PagePrincipale__Group_15__0 )? ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:919:1: ( ( rule__PagePrincipale__Group_15__0 )? )
            {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:919:1: ( ( rule__PagePrincipale__Group_15__0 )? )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:920:1: ( rule__PagePrincipale__Group_15__0 )?
            {
             before(grammarAccess.getPagePrincipaleAccess().getGroup_15()); 
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:921:1: ( rule__PagePrincipale__Group_15__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==21) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:921:2: rule__PagePrincipale__Group_15__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__PagePrincipale__Group_15__0_in_rule__PagePrincipale__Group__15__Impl1846);
                    rule__PagePrincipale__Group_15__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPagePrincipaleAccess().getGroup_15()); 

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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:931:1: rule__PagePrincipale__Group__16 : rule__PagePrincipale__Group__16__Impl ;
    public final void rule__PagePrincipale__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:935:1: ( rule__PagePrincipale__Group__16__Impl )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:936:2: rule__PagePrincipale__Group__16__Impl
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:942:1: rule__PagePrincipale__Group__16__Impl : ( '}' ) ;
    public final void rule__PagePrincipale__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:946:1: ( ( '}' ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:947:1: ( '}' )
            {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:947:1: ( '}' )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:948:1: '}'
            {
             before(grammarAccess.getPagePrincipaleAccess().getRightCurlyBracketKeyword_16()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__PagePrincipale__Group__16__Impl1905); 
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


    // $ANTLR start "rule__PagePrincipale__Group_7__0"
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:995:1: rule__PagePrincipale__Group_7__0 : rule__PagePrincipale__Group_7__0__Impl rule__PagePrincipale__Group_7__1 ;
    public final void rule__PagePrincipale__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:999:1: ( rule__PagePrincipale__Group_7__0__Impl rule__PagePrincipale__Group_7__1 )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1000:2: rule__PagePrincipale__Group_7__0__Impl rule__PagePrincipale__Group_7__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__PagePrincipale__Group_7__0__Impl_in_rule__PagePrincipale__Group_7__01970);
            rule__PagePrincipale__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PagePrincipale__Group_7__1_in_rule__PagePrincipale__Group_7__01973);
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1007:1: rule__PagePrincipale__Group_7__0__Impl : ( ',' ) ;
    public final void rule__PagePrincipale__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1011:1: ( ( ',' ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1012:1: ( ',' )
            {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1012:1: ( ',' )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1013:1: ','
            {
             before(grammarAccess.getPagePrincipaleAccess().getCommaKeyword_7_0()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__PagePrincipale__Group_7__0__Impl2001); 
             after(grammarAccess.getPagePrincipaleAccess().getCommaKeyword_7_0()); 

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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1026:1: rule__PagePrincipale__Group_7__1 : rule__PagePrincipale__Group_7__1__Impl ;
    public final void rule__PagePrincipale__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1030:1: ( rule__PagePrincipale__Group_7__1__Impl )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1031:2: rule__PagePrincipale__Group_7__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__PagePrincipale__Group_7__1__Impl_in_rule__PagePrincipale__Group_7__12032);
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1037:1: rule__PagePrincipale__Group_7__1__Impl : ( ( rule__PagePrincipale__ContactsAssignment_7_1 ) ) ;
    public final void rule__PagePrincipale__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1041:1: ( ( ( rule__PagePrincipale__ContactsAssignment_7_1 ) ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1042:1: ( ( rule__PagePrincipale__ContactsAssignment_7_1 ) )
            {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1042:1: ( ( rule__PagePrincipale__ContactsAssignment_7_1 ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1043:1: ( rule__PagePrincipale__ContactsAssignment_7_1 )
            {
             before(grammarAccess.getPagePrincipaleAccess().getContactsAssignment_7_1()); 
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1044:1: ( rule__PagePrincipale__ContactsAssignment_7_1 )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1044:2: rule__PagePrincipale__ContactsAssignment_7_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__PagePrincipale__ContactsAssignment_7_1_in_rule__PagePrincipale__Group_7__1__Impl2059);
            rule__PagePrincipale__ContactsAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getPagePrincipaleAccess().getContactsAssignment_7_1()); 

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


    // $ANTLR start "rule__PagePrincipale__Group_12__0"
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1058:1: rule__PagePrincipale__Group_12__0 : rule__PagePrincipale__Group_12__0__Impl rule__PagePrincipale__Group_12__1 ;
    public final void rule__PagePrincipale__Group_12__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1062:1: ( rule__PagePrincipale__Group_12__0__Impl rule__PagePrincipale__Group_12__1 )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1063:2: rule__PagePrincipale__Group_12__0__Impl rule__PagePrincipale__Group_12__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__PagePrincipale__Group_12__0__Impl_in_rule__PagePrincipale__Group_12__02093);
            rule__PagePrincipale__Group_12__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PagePrincipale__Group_12__1_in_rule__PagePrincipale__Group_12__02096);
            rule__PagePrincipale__Group_12__1();

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
    // $ANTLR end "rule__PagePrincipale__Group_12__0"


    // $ANTLR start "rule__PagePrincipale__Group_12__0__Impl"
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1070:1: rule__PagePrincipale__Group_12__0__Impl : ( ',' ) ;
    public final void rule__PagePrincipale__Group_12__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1074:1: ( ( ',' ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1075:1: ( ',' )
            {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1075:1: ( ',' )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1076:1: ','
            {
             before(grammarAccess.getPagePrincipaleAccess().getCommaKeyword_12_0()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__PagePrincipale__Group_12__0__Impl2124); 
             after(grammarAccess.getPagePrincipaleAccess().getCommaKeyword_12_0()); 

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
    // $ANTLR end "rule__PagePrincipale__Group_12__0__Impl"


    // $ANTLR start "rule__PagePrincipale__Group_12__1"
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1089:1: rule__PagePrincipale__Group_12__1 : rule__PagePrincipale__Group_12__1__Impl ;
    public final void rule__PagePrincipale__Group_12__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1093:1: ( rule__PagePrincipale__Group_12__1__Impl )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1094:2: rule__PagePrincipale__Group_12__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__PagePrincipale__Group_12__1__Impl_in_rule__PagePrincipale__Group_12__12155);
            rule__PagePrincipale__Group_12__1__Impl();

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
    // $ANTLR end "rule__PagePrincipale__Group_12__1"


    // $ANTLR start "rule__PagePrincipale__Group_12__1__Impl"
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1100:1: rule__PagePrincipale__Group_12__1__Impl : ( ( rule__PagePrincipale__PagesAssignment_12_1 ) ) ;
    public final void rule__PagePrincipale__Group_12__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1104:1: ( ( ( rule__PagePrincipale__PagesAssignment_12_1 ) ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1105:1: ( ( rule__PagePrincipale__PagesAssignment_12_1 ) )
            {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1105:1: ( ( rule__PagePrincipale__PagesAssignment_12_1 ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1106:1: ( rule__PagePrincipale__PagesAssignment_12_1 )
            {
             before(grammarAccess.getPagePrincipaleAccess().getPagesAssignment_12_1()); 
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1107:1: ( rule__PagePrincipale__PagesAssignment_12_1 )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1107:2: rule__PagePrincipale__PagesAssignment_12_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__PagePrincipale__PagesAssignment_12_1_in_rule__PagePrincipale__Group_12__1__Impl2182);
            rule__PagePrincipale__PagesAssignment_12_1();

            state._fsp--;


            }

             after(grammarAccess.getPagePrincipaleAccess().getPagesAssignment_12_1()); 

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
    // $ANTLR end "rule__PagePrincipale__Group_12__1__Impl"


    // $ANTLR start "rule__PagePrincipale__Group_14__0"
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1121:1: rule__PagePrincipale__Group_14__0 : rule__PagePrincipale__Group_14__0__Impl rule__PagePrincipale__Group_14__1 ;
    public final void rule__PagePrincipale__Group_14__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1125:1: ( rule__PagePrincipale__Group_14__0__Impl rule__PagePrincipale__Group_14__1 )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1126:2: rule__PagePrincipale__Group_14__0__Impl rule__PagePrincipale__Group_14__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__PagePrincipale__Group_14__0__Impl_in_rule__PagePrincipale__Group_14__02216);
            rule__PagePrincipale__Group_14__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PagePrincipale__Group_14__1_in_rule__PagePrincipale__Group_14__02219);
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1133:1: rule__PagePrincipale__Group_14__0__Impl : ( 'rubriques' ) ;
    public final void rule__PagePrincipale__Group_14__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1137:1: ( ( 'rubriques' ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1138:1: ( 'rubriques' )
            {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1138:1: ( 'rubriques' )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1139:1: 'rubriques'
            {
             before(grammarAccess.getPagePrincipaleAccess().getRubriquesKeyword_14_0()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__PagePrincipale__Group_14__0__Impl2247); 
             after(grammarAccess.getPagePrincipaleAccess().getRubriquesKeyword_14_0()); 

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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1152:1: rule__PagePrincipale__Group_14__1 : rule__PagePrincipale__Group_14__1__Impl ;
    public final void rule__PagePrincipale__Group_14__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1156:1: ( rule__PagePrincipale__Group_14__1__Impl )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1157:2: rule__PagePrincipale__Group_14__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__PagePrincipale__Group_14__1__Impl_in_rule__PagePrincipale__Group_14__12278);
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1163:1: rule__PagePrincipale__Group_14__1__Impl : ( ( rule__PagePrincipale__RubriquesAssignment_14_1 ) ) ;
    public final void rule__PagePrincipale__Group_14__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1167:1: ( ( ( rule__PagePrincipale__RubriquesAssignment_14_1 ) ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1168:1: ( ( rule__PagePrincipale__RubriquesAssignment_14_1 ) )
            {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1168:1: ( ( rule__PagePrincipale__RubriquesAssignment_14_1 ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1169:1: ( rule__PagePrincipale__RubriquesAssignment_14_1 )
            {
             before(grammarAccess.getPagePrincipaleAccess().getRubriquesAssignment_14_1()); 
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1170:1: ( rule__PagePrincipale__RubriquesAssignment_14_1 )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1170:2: rule__PagePrincipale__RubriquesAssignment_14_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__PagePrincipale__RubriquesAssignment_14_1_in_rule__PagePrincipale__Group_14__1__Impl2305);
            rule__PagePrincipale__RubriquesAssignment_14_1();

            state._fsp--;


            }

             after(grammarAccess.getPagePrincipaleAccess().getRubriquesAssignment_14_1()); 

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


    // $ANTLR start "rule__PagePrincipale__Group_15__0"
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1184:1: rule__PagePrincipale__Group_15__0 : rule__PagePrincipale__Group_15__0__Impl rule__PagePrincipale__Group_15__1 ;
    public final void rule__PagePrincipale__Group_15__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1188:1: ( rule__PagePrincipale__Group_15__0__Impl rule__PagePrincipale__Group_15__1 )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1189:2: rule__PagePrincipale__Group_15__0__Impl rule__PagePrincipale__Group_15__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__PagePrincipale__Group_15__0__Impl_in_rule__PagePrincipale__Group_15__02339);
            rule__PagePrincipale__Group_15__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PagePrincipale__Group_15__1_in_rule__PagePrincipale__Group_15__02342);
            rule__PagePrincipale__Group_15__1();

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
    // $ANTLR end "rule__PagePrincipale__Group_15__0"


    // $ANTLR start "rule__PagePrincipale__Group_15__0__Impl"
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1196:1: rule__PagePrincipale__Group_15__0__Impl : ( 'fichiers' ) ;
    public final void rule__PagePrincipale__Group_15__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1200:1: ( ( 'fichiers' ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1201:1: ( 'fichiers' )
            {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1201:1: ( 'fichiers' )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1202:1: 'fichiers'
            {
             before(grammarAccess.getPagePrincipaleAccess().getFichiersKeyword_15_0()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__PagePrincipale__Group_15__0__Impl2370); 
             after(grammarAccess.getPagePrincipaleAccess().getFichiersKeyword_15_0()); 

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
    // $ANTLR end "rule__PagePrincipale__Group_15__0__Impl"


    // $ANTLR start "rule__PagePrincipale__Group_15__1"
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1215:1: rule__PagePrincipale__Group_15__1 : rule__PagePrincipale__Group_15__1__Impl rule__PagePrincipale__Group_15__2 ;
    public final void rule__PagePrincipale__Group_15__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1219:1: ( rule__PagePrincipale__Group_15__1__Impl rule__PagePrincipale__Group_15__2 )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1220:2: rule__PagePrincipale__Group_15__1__Impl rule__PagePrincipale__Group_15__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__PagePrincipale__Group_15__1__Impl_in_rule__PagePrincipale__Group_15__12401);
            rule__PagePrincipale__Group_15__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PagePrincipale__Group_15__2_in_rule__PagePrincipale__Group_15__12404);
            rule__PagePrincipale__Group_15__2();

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
    // $ANTLR end "rule__PagePrincipale__Group_15__1"


    // $ANTLR start "rule__PagePrincipale__Group_15__1__Impl"
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1227:1: rule__PagePrincipale__Group_15__1__Impl : ( '{' ) ;
    public final void rule__PagePrincipale__Group_15__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1231:1: ( ( '{' ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1232:1: ( '{' )
            {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1232:1: ( '{' )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1233:1: '{'
            {
             before(grammarAccess.getPagePrincipaleAccess().getLeftCurlyBracketKeyword_15_1()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__PagePrincipale__Group_15__1__Impl2432); 
             after(grammarAccess.getPagePrincipaleAccess().getLeftCurlyBracketKeyword_15_1()); 

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
    // $ANTLR end "rule__PagePrincipale__Group_15__1__Impl"


    // $ANTLR start "rule__PagePrincipale__Group_15__2"
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1246:1: rule__PagePrincipale__Group_15__2 : rule__PagePrincipale__Group_15__2__Impl rule__PagePrincipale__Group_15__3 ;
    public final void rule__PagePrincipale__Group_15__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1250:1: ( rule__PagePrincipale__Group_15__2__Impl rule__PagePrincipale__Group_15__3 )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1251:2: rule__PagePrincipale__Group_15__2__Impl rule__PagePrincipale__Group_15__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__PagePrincipale__Group_15__2__Impl_in_rule__PagePrincipale__Group_15__22463);
            rule__PagePrincipale__Group_15__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PagePrincipale__Group_15__3_in_rule__PagePrincipale__Group_15__22466);
            rule__PagePrincipale__Group_15__3();

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
    // $ANTLR end "rule__PagePrincipale__Group_15__2"


    // $ANTLR start "rule__PagePrincipale__Group_15__2__Impl"
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1258:1: rule__PagePrincipale__Group_15__2__Impl : ( ( rule__PagePrincipale__FichiersAssignment_15_2 ) ) ;
    public final void rule__PagePrincipale__Group_15__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1262:1: ( ( ( rule__PagePrincipale__FichiersAssignment_15_2 ) ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1263:1: ( ( rule__PagePrincipale__FichiersAssignment_15_2 ) )
            {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1263:1: ( ( rule__PagePrincipale__FichiersAssignment_15_2 ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1264:1: ( rule__PagePrincipale__FichiersAssignment_15_2 )
            {
             before(grammarAccess.getPagePrincipaleAccess().getFichiersAssignment_15_2()); 
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1265:1: ( rule__PagePrincipale__FichiersAssignment_15_2 )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1265:2: rule__PagePrincipale__FichiersAssignment_15_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__PagePrincipale__FichiersAssignment_15_2_in_rule__PagePrincipale__Group_15__2__Impl2493);
            rule__PagePrincipale__FichiersAssignment_15_2();

            state._fsp--;


            }

             after(grammarAccess.getPagePrincipaleAccess().getFichiersAssignment_15_2()); 

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
    // $ANTLR end "rule__PagePrincipale__Group_15__2__Impl"


    // $ANTLR start "rule__PagePrincipale__Group_15__3"
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1275:1: rule__PagePrincipale__Group_15__3 : rule__PagePrincipale__Group_15__3__Impl rule__PagePrincipale__Group_15__4 ;
    public final void rule__PagePrincipale__Group_15__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1279:1: ( rule__PagePrincipale__Group_15__3__Impl rule__PagePrincipale__Group_15__4 )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1280:2: rule__PagePrincipale__Group_15__3__Impl rule__PagePrincipale__Group_15__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__PagePrincipale__Group_15__3__Impl_in_rule__PagePrincipale__Group_15__32523);
            rule__PagePrincipale__Group_15__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PagePrincipale__Group_15__4_in_rule__PagePrincipale__Group_15__32526);
            rule__PagePrincipale__Group_15__4();

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
    // $ANTLR end "rule__PagePrincipale__Group_15__3"


    // $ANTLR start "rule__PagePrincipale__Group_15__3__Impl"
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1287:1: rule__PagePrincipale__Group_15__3__Impl : ( ( rule__PagePrincipale__Group_15_3__0 )* ) ;
    public final void rule__PagePrincipale__Group_15__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1291:1: ( ( ( rule__PagePrincipale__Group_15_3__0 )* ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1292:1: ( ( rule__PagePrincipale__Group_15_3__0 )* )
            {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1292:1: ( ( rule__PagePrincipale__Group_15_3__0 )* )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1293:1: ( rule__PagePrincipale__Group_15_3__0 )*
            {
             before(grammarAccess.getPagePrincipaleAccess().getGroup_15_3()); 
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1294:1: ( rule__PagePrincipale__Group_15_3__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==19) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1294:2: rule__PagePrincipale__Group_15_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__PagePrincipale__Group_15_3__0_in_rule__PagePrincipale__Group_15__3__Impl2553);
            	    rule__PagePrincipale__Group_15_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getPagePrincipaleAccess().getGroup_15_3()); 

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
    // $ANTLR end "rule__PagePrincipale__Group_15__3__Impl"


    // $ANTLR start "rule__PagePrincipale__Group_15__4"
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1304:1: rule__PagePrincipale__Group_15__4 : rule__PagePrincipale__Group_15__4__Impl ;
    public final void rule__PagePrincipale__Group_15__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1308:1: ( rule__PagePrincipale__Group_15__4__Impl )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1309:2: rule__PagePrincipale__Group_15__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__PagePrincipale__Group_15__4__Impl_in_rule__PagePrincipale__Group_15__42584);
            rule__PagePrincipale__Group_15__4__Impl();

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
    // $ANTLR end "rule__PagePrincipale__Group_15__4"


    // $ANTLR start "rule__PagePrincipale__Group_15__4__Impl"
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1315:1: rule__PagePrincipale__Group_15__4__Impl : ( '}' ) ;
    public final void rule__PagePrincipale__Group_15__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1319:1: ( ( '}' ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1320:1: ( '}' )
            {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1320:1: ( '}' )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1321:1: '}'
            {
             before(grammarAccess.getPagePrincipaleAccess().getRightCurlyBracketKeyword_15_4()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__PagePrincipale__Group_15__4__Impl2612); 
             after(grammarAccess.getPagePrincipaleAccess().getRightCurlyBracketKeyword_15_4()); 

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
    // $ANTLR end "rule__PagePrincipale__Group_15__4__Impl"


    // $ANTLR start "rule__PagePrincipale__Group_15_3__0"
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1344:1: rule__PagePrincipale__Group_15_3__0 : rule__PagePrincipale__Group_15_3__0__Impl rule__PagePrincipale__Group_15_3__1 ;
    public final void rule__PagePrincipale__Group_15_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1348:1: ( rule__PagePrincipale__Group_15_3__0__Impl rule__PagePrincipale__Group_15_3__1 )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1349:2: rule__PagePrincipale__Group_15_3__0__Impl rule__PagePrincipale__Group_15_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__PagePrincipale__Group_15_3__0__Impl_in_rule__PagePrincipale__Group_15_3__02653);
            rule__PagePrincipale__Group_15_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PagePrincipale__Group_15_3__1_in_rule__PagePrincipale__Group_15_3__02656);
            rule__PagePrincipale__Group_15_3__1();

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
    // $ANTLR end "rule__PagePrincipale__Group_15_3__0"


    // $ANTLR start "rule__PagePrincipale__Group_15_3__0__Impl"
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1356:1: rule__PagePrincipale__Group_15_3__0__Impl : ( ',' ) ;
    public final void rule__PagePrincipale__Group_15_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1360:1: ( ( ',' ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1361:1: ( ',' )
            {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1361:1: ( ',' )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1362:1: ','
            {
             before(grammarAccess.getPagePrincipaleAccess().getCommaKeyword_15_3_0()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__PagePrincipale__Group_15_3__0__Impl2684); 
             after(grammarAccess.getPagePrincipaleAccess().getCommaKeyword_15_3_0()); 

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
    // $ANTLR end "rule__PagePrincipale__Group_15_3__0__Impl"


    // $ANTLR start "rule__PagePrincipale__Group_15_3__1"
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1375:1: rule__PagePrincipale__Group_15_3__1 : rule__PagePrincipale__Group_15_3__1__Impl ;
    public final void rule__PagePrincipale__Group_15_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1379:1: ( rule__PagePrincipale__Group_15_3__1__Impl )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1380:2: rule__PagePrincipale__Group_15_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__PagePrincipale__Group_15_3__1__Impl_in_rule__PagePrincipale__Group_15_3__12715);
            rule__PagePrincipale__Group_15_3__1__Impl();

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
    // $ANTLR end "rule__PagePrincipale__Group_15_3__1"


    // $ANTLR start "rule__PagePrincipale__Group_15_3__1__Impl"
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1386:1: rule__PagePrincipale__Group_15_3__1__Impl : ( ( rule__PagePrincipale__FichiersAssignment_15_3_1 ) ) ;
    public final void rule__PagePrincipale__Group_15_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1390:1: ( ( ( rule__PagePrincipale__FichiersAssignment_15_3_1 ) ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1391:1: ( ( rule__PagePrincipale__FichiersAssignment_15_3_1 ) )
            {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1391:1: ( ( rule__PagePrincipale__FichiersAssignment_15_3_1 ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1392:1: ( rule__PagePrincipale__FichiersAssignment_15_3_1 )
            {
             before(grammarAccess.getPagePrincipaleAccess().getFichiersAssignment_15_3_1()); 
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1393:1: ( rule__PagePrincipale__FichiersAssignment_15_3_1 )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1393:2: rule__PagePrincipale__FichiersAssignment_15_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__PagePrincipale__FichiersAssignment_15_3_1_in_rule__PagePrincipale__Group_15_3__1__Impl2742);
            rule__PagePrincipale__FichiersAssignment_15_3_1();

            state._fsp--;


            }

             after(grammarAccess.getPagePrincipaleAccess().getFichiersAssignment_15_3_1()); 

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
    // $ANTLR end "rule__PagePrincipale__Group_15_3__1__Impl"


    // $ANTLR start "rule__Contact__Group__0"
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1407:1: rule__Contact__Group__0 : rule__Contact__Group__0__Impl rule__Contact__Group__1 ;
    public final void rule__Contact__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1411:1: ( rule__Contact__Group__0__Impl rule__Contact__Group__1 )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1412:2: rule__Contact__Group__0__Impl rule__Contact__Group__1
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1419:1: rule__Contact__Group__0__Impl : ( () ) ;
    public final void rule__Contact__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1423:1: ( ( () ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1424:1: ( () )
            {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1424:1: ( () )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1425:1: ()
            {
             before(grammarAccess.getContactAccess().getContactAction_0()); 
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1426:1: ()
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1428:1: 
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1438:1: rule__Contact__Group__1 : rule__Contact__Group__1__Impl rule__Contact__Group__2 ;
    public final void rule__Contact__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1442:1: ( rule__Contact__Group__1__Impl rule__Contact__Group__2 )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1443:2: rule__Contact__Group__1__Impl rule__Contact__Group__2
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1450:1: rule__Contact__Group__1__Impl : ( 'Contact' ) ;
    public final void rule__Contact__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1454:1: ( ( 'Contact' ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1455:1: ( 'Contact' )
            {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1455:1: ( 'Contact' )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1456:1: 'Contact'
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1469:1: rule__Contact__Group__2 : rule__Contact__Group__2__Impl rule__Contact__Group__3 ;
    public final void rule__Contact__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1473:1: ( rule__Contact__Group__2__Impl rule__Contact__Group__3 )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1474:2: rule__Contact__Group__2__Impl rule__Contact__Group__3
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1481:1: rule__Contact__Group__2__Impl : ( '{' ) ;
    public final void rule__Contact__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1485:1: ( ( '{' ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1486:1: ( '{' )
            {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1486:1: ( '{' )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1487:1: '{'
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1500:1: rule__Contact__Group__3 : rule__Contact__Group__3__Impl rule__Contact__Group__4 ;
    public final void rule__Contact__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1504:1: ( rule__Contact__Group__3__Impl rule__Contact__Group__4 )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1505:2: rule__Contact__Group__3__Impl rule__Contact__Group__4
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1512:1: rule__Contact__Group__3__Impl : ( ( rule__Contact__Group_3__0 )? ) ;
    public final void rule__Contact__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1516:1: ( ( ( rule__Contact__Group_3__0 )? ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1517:1: ( ( rule__Contact__Group_3__0 )? )
            {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1517:1: ( ( rule__Contact__Group_3__0 )? )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1518:1: ( rule__Contact__Group_3__0 )?
            {
             before(grammarAccess.getContactAccess().getGroup_3()); 
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1519:1: ( rule__Contact__Group_3__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==23) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1519:2: rule__Contact__Group_3__0
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1529:1: rule__Contact__Group__4 : rule__Contact__Group__4__Impl rule__Contact__Group__5 ;
    public final void rule__Contact__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1533:1: ( rule__Contact__Group__4__Impl rule__Contact__Group__5 )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1534:2: rule__Contact__Group__4__Impl rule__Contact__Group__5
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1541:1: rule__Contact__Group__4__Impl : ( ( rule__Contact__Group_4__0 )? ) ;
    public final void rule__Contact__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1545:1: ( ( ( rule__Contact__Group_4__0 )? ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1546:1: ( ( rule__Contact__Group_4__0 )? )
            {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1546:1: ( ( rule__Contact__Group_4__0 )? )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1547:1: ( rule__Contact__Group_4__0 )?
            {
             before(grammarAccess.getContactAccess().getGroup_4()); 
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1548:1: ( rule__Contact__Group_4__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==24) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1548:2: rule__Contact__Group_4__0
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1558:1: rule__Contact__Group__5 : rule__Contact__Group__5__Impl rule__Contact__Group__6 ;
    public final void rule__Contact__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1562:1: ( rule__Contact__Group__5__Impl rule__Contact__Group__6 )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1563:2: rule__Contact__Group__5__Impl rule__Contact__Group__6
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1570:1: rule__Contact__Group__5__Impl : ( ( rule__Contact__Group_5__0 )? ) ;
    public final void rule__Contact__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1574:1: ( ( ( rule__Contact__Group_5__0 )? ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1575:1: ( ( rule__Contact__Group_5__0 )? )
            {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1575:1: ( ( rule__Contact__Group_5__0 )? )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1576:1: ( rule__Contact__Group_5__0 )?
            {
             before(grammarAccess.getContactAccess().getGroup_5()); 
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1577:1: ( rule__Contact__Group_5__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==25) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1577:2: rule__Contact__Group_5__0
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1587:1: rule__Contact__Group__6 : rule__Contact__Group__6__Impl rule__Contact__Group__7 ;
    public final void rule__Contact__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1591:1: ( rule__Contact__Group__6__Impl rule__Contact__Group__7 )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1592:2: rule__Contact__Group__6__Impl rule__Contact__Group__7
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1599:1: rule__Contact__Group__6__Impl : ( ( rule__Contact__Group_6__0 ) ) ;
    public final void rule__Contact__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1603:1: ( ( ( rule__Contact__Group_6__0 ) ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1604:1: ( ( rule__Contact__Group_6__0 ) )
            {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1604:1: ( ( rule__Contact__Group_6__0 ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1605:1: ( rule__Contact__Group_6__0 )
            {
             before(grammarAccess.getContactAccess().getGroup_6()); 
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1606:1: ( rule__Contact__Group_6__0 )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1606:2: rule__Contact__Group_6__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Contact__Group_6__0_in_rule__Contact__Group__6__Impl3174);
            rule__Contact__Group_6__0();

            state._fsp--;


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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1616:1: rule__Contact__Group__7 : rule__Contact__Group__7__Impl rule__Contact__Group__8 ;
    public final void rule__Contact__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1620:1: ( rule__Contact__Group__7__Impl rule__Contact__Group__8 )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1621:2: rule__Contact__Group__7__Impl rule__Contact__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__Contact__Group__7__Impl_in_rule__Contact__Group__73204);
            rule__Contact__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Contact__Group__8_in_rule__Contact__Group__73207);
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1628:1: rule__Contact__Group__7__Impl : ( ( rule__Contact__Group_7__0 )? ) ;
    public final void rule__Contact__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1632:1: ( ( ( rule__Contact__Group_7__0 )? ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1633:1: ( ( rule__Contact__Group_7__0 )? )
            {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1633:1: ( ( rule__Contact__Group_7__0 )? )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1634:1: ( rule__Contact__Group_7__0 )?
            {
             before(grammarAccess.getContactAccess().getGroup_7()); 
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1635:1: ( rule__Contact__Group_7__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==29) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1635:2: rule__Contact__Group_7__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Contact__Group_7__0_in_rule__Contact__Group__7__Impl3234);
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1645:1: rule__Contact__Group__8 : rule__Contact__Group__8__Impl ;
    public final void rule__Contact__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1649:1: ( rule__Contact__Group__8__Impl )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1650:2: rule__Contact__Group__8__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Contact__Group__8__Impl_in_rule__Contact__Group__83265);
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1656:1: rule__Contact__Group__8__Impl : ( '}' ) ;
    public final void rule__Contact__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1660:1: ( ( '}' ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1661:1: ( '}' )
            {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1661:1: ( '}' )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1662:1: '}'
            {
             before(grammarAccess.getContactAccess().getRightCurlyBracketKeyword_8()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__Contact__Group__8__Impl3293); 
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1693:1: rule__Contact__Group_3__0 : rule__Contact__Group_3__0__Impl rule__Contact__Group_3__1 ;
    public final void rule__Contact__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1697:1: ( rule__Contact__Group_3__0__Impl rule__Contact__Group_3__1 )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1698:2: rule__Contact__Group_3__0__Impl rule__Contact__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Contact__Group_3__0__Impl_in_rule__Contact__Group_3__03342);
            rule__Contact__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Contact__Group_3__1_in_rule__Contact__Group_3__03345);
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1705:1: rule__Contact__Group_3__0__Impl : ( 'nom : ' ) ;
    public final void rule__Contact__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1709:1: ( ( 'nom : ' ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1710:1: ( 'nom : ' )
            {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1710:1: ( 'nom : ' )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1711:1: 'nom : '
            {
             before(grammarAccess.getContactAccess().getNomKeyword_3_0()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__Contact__Group_3__0__Impl3373); 
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1724:1: rule__Contact__Group_3__1 : rule__Contact__Group_3__1__Impl ;
    public final void rule__Contact__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1728:1: ( rule__Contact__Group_3__1__Impl )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1729:2: rule__Contact__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Contact__Group_3__1__Impl_in_rule__Contact__Group_3__13404);
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1735:1: rule__Contact__Group_3__1__Impl : ( ( rule__Contact__NomAssignment_3_1 ) ) ;
    public final void rule__Contact__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1739:1: ( ( ( rule__Contact__NomAssignment_3_1 ) ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1740:1: ( ( rule__Contact__NomAssignment_3_1 ) )
            {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1740:1: ( ( rule__Contact__NomAssignment_3_1 ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1741:1: ( rule__Contact__NomAssignment_3_1 )
            {
             before(grammarAccess.getContactAccess().getNomAssignment_3_1()); 
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1742:1: ( rule__Contact__NomAssignment_3_1 )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1742:2: rule__Contact__NomAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Contact__NomAssignment_3_1_in_rule__Contact__Group_3__1__Impl3431);
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1756:1: rule__Contact__Group_4__0 : rule__Contact__Group_4__0__Impl rule__Contact__Group_4__1 ;
    public final void rule__Contact__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1760:1: ( rule__Contact__Group_4__0__Impl rule__Contact__Group_4__1 )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1761:2: rule__Contact__Group_4__0__Impl rule__Contact__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Contact__Group_4__0__Impl_in_rule__Contact__Group_4__03465);
            rule__Contact__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Contact__Group_4__1_in_rule__Contact__Group_4__03468);
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1768:1: rule__Contact__Group_4__0__Impl : ( 'prenom : ' ) ;
    public final void rule__Contact__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1772:1: ( ( 'prenom : ' ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1773:1: ( 'prenom : ' )
            {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1773:1: ( 'prenom : ' )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1774:1: 'prenom : '
            {
             before(grammarAccess.getContactAccess().getPrenomKeyword_4_0()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__Contact__Group_4__0__Impl3496); 
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1787:1: rule__Contact__Group_4__1 : rule__Contact__Group_4__1__Impl ;
    public final void rule__Contact__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1791:1: ( rule__Contact__Group_4__1__Impl )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1792:2: rule__Contact__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Contact__Group_4__1__Impl_in_rule__Contact__Group_4__13527);
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1798:1: rule__Contact__Group_4__1__Impl : ( ( rule__Contact__PrenomAssignment_4_1 ) ) ;
    public final void rule__Contact__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1802:1: ( ( ( rule__Contact__PrenomAssignment_4_1 ) ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1803:1: ( ( rule__Contact__PrenomAssignment_4_1 ) )
            {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1803:1: ( ( rule__Contact__PrenomAssignment_4_1 ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1804:1: ( rule__Contact__PrenomAssignment_4_1 )
            {
             before(grammarAccess.getContactAccess().getPrenomAssignment_4_1()); 
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1805:1: ( rule__Contact__PrenomAssignment_4_1 )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1805:2: rule__Contact__PrenomAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Contact__PrenomAssignment_4_1_in_rule__Contact__Group_4__1__Impl3554);
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1819:1: rule__Contact__Group_5__0 : rule__Contact__Group_5__0__Impl rule__Contact__Group_5__1 ;
    public final void rule__Contact__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1823:1: ( rule__Contact__Group_5__0__Impl rule__Contact__Group_5__1 )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1824:2: rule__Contact__Group_5__0__Impl rule__Contact__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Contact__Group_5__0__Impl_in_rule__Contact__Group_5__03588);
            rule__Contact__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Contact__Group_5__1_in_rule__Contact__Group_5__03591);
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1831:1: rule__Contact__Group_5__0__Impl : ( 'adresse : ' ) ;
    public final void rule__Contact__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1835:1: ( ( 'adresse : ' ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1836:1: ( 'adresse : ' )
            {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1836:1: ( 'adresse : ' )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1837:1: 'adresse : '
            {
             before(grammarAccess.getContactAccess().getAdresseKeyword_5_0()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__Contact__Group_5__0__Impl3619); 
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1850:1: rule__Contact__Group_5__1 : rule__Contact__Group_5__1__Impl ;
    public final void rule__Contact__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1854:1: ( rule__Contact__Group_5__1__Impl )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1855:2: rule__Contact__Group_5__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Contact__Group_5__1__Impl_in_rule__Contact__Group_5__13650);
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1861:1: rule__Contact__Group_5__1__Impl : ( ( rule__Contact__AdresseAssignment_5_1 ) ) ;
    public final void rule__Contact__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1865:1: ( ( ( rule__Contact__AdresseAssignment_5_1 ) ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1866:1: ( ( rule__Contact__AdresseAssignment_5_1 ) )
            {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1866:1: ( ( rule__Contact__AdresseAssignment_5_1 ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1867:1: ( rule__Contact__AdresseAssignment_5_1 )
            {
             before(grammarAccess.getContactAccess().getAdresseAssignment_5_1()); 
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1868:1: ( rule__Contact__AdresseAssignment_5_1 )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1868:2: rule__Contact__AdresseAssignment_5_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Contact__AdresseAssignment_5_1_in_rule__Contact__Group_5__1__Impl3677);
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1882:1: rule__Contact__Group_6__0 : rule__Contact__Group_6__0__Impl rule__Contact__Group_6__1 ;
    public final void rule__Contact__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1886:1: ( rule__Contact__Group_6__0__Impl rule__Contact__Group_6__1 )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1887:2: rule__Contact__Group_6__0__Impl rule__Contact__Group_6__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Contact__Group_6__0__Impl_in_rule__Contact__Group_6__03711);
            rule__Contact__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Contact__Group_6__1_in_rule__Contact__Group_6__03714);
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1894:1: rule__Contact__Group_6__0__Impl : ( 'mail : ' ) ;
    public final void rule__Contact__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1898:1: ( ( 'mail : ' ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1899:1: ( 'mail : ' )
            {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1899:1: ( 'mail : ' )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1900:1: 'mail : '
            {
             before(grammarAccess.getContactAccess().getMailKeyword_6_0()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__Contact__Group_6__0__Impl3742); 
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1913:1: rule__Contact__Group_6__1 : rule__Contact__Group_6__1__Impl rule__Contact__Group_6__2 ;
    public final void rule__Contact__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1917:1: ( rule__Contact__Group_6__1__Impl rule__Contact__Group_6__2 )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1918:2: rule__Contact__Group_6__1__Impl rule__Contact__Group_6__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Contact__Group_6__1__Impl_in_rule__Contact__Group_6__13773);
            rule__Contact__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Contact__Group_6__2_in_rule__Contact__Group_6__13776);
            rule__Contact__Group_6__2();

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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1925:1: rule__Contact__Group_6__1__Impl : ( ( ( rule__Contact__MailAssignment_6_1 ) ) ( ( rule__Contact__MailAssignment_6_1 )* ) ) ;
    public final void rule__Contact__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1929:1: ( ( ( ( rule__Contact__MailAssignment_6_1 ) ) ( ( rule__Contact__MailAssignment_6_1 )* ) ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1930:1: ( ( ( rule__Contact__MailAssignment_6_1 ) ) ( ( rule__Contact__MailAssignment_6_1 )* ) )
            {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1930:1: ( ( ( rule__Contact__MailAssignment_6_1 ) ) ( ( rule__Contact__MailAssignment_6_1 )* ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1931:1: ( ( rule__Contact__MailAssignment_6_1 ) ) ( ( rule__Contact__MailAssignment_6_1 )* )
            {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1931:1: ( ( rule__Contact__MailAssignment_6_1 ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1932:1: ( rule__Contact__MailAssignment_6_1 )
            {
             before(grammarAccess.getContactAccess().getMailAssignment_6_1()); 
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1933:1: ( rule__Contact__MailAssignment_6_1 )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1933:2: rule__Contact__MailAssignment_6_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Contact__MailAssignment_6_1_in_rule__Contact__Group_6__1__Impl3805);
            rule__Contact__MailAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getContactAccess().getMailAssignment_6_1()); 

            }

            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1936:1: ( ( rule__Contact__MailAssignment_6_1 )* )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1937:1: ( rule__Contact__MailAssignment_6_1 )*
            {
             before(grammarAccess.getContactAccess().getMailAssignment_6_1()); 
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1938:1: ( rule__Contact__MailAssignment_6_1 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=RULE_STRING && LA12_0<=RULE_ID)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1938:2: rule__Contact__MailAssignment_6_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Contact__MailAssignment_6_1_in_rule__Contact__Group_6__1__Impl3817);
            	    rule__Contact__MailAssignment_6_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getContactAccess().getMailAssignment_6_1()); 

            }


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


    // $ANTLR start "rule__Contact__Group_6__2"
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1949:1: rule__Contact__Group_6__2 : rule__Contact__Group_6__2__Impl rule__Contact__Group_6__3 ;
    public final void rule__Contact__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1953:1: ( rule__Contact__Group_6__2__Impl rule__Contact__Group_6__3 )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1954:2: rule__Contact__Group_6__2__Impl rule__Contact__Group_6__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Contact__Group_6__2__Impl_in_rule__Contact__Group_6__23850);
            rule__Contact__Group_6__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Contact__Group_6__3_in_rule__Contact__Group_6__23853);
            rule__Contact__Group_6__3();

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
    // $ANTLR end "rule__Contact__Group_6__2"


    // $ANTLR start "rule__Contact__Group_6__2__Impl"
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1961:1: rule__Contact__Group_6__2__Impl : ( '@' ) ;
    public final void rule__Contact__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1965:1: ( ( '@' ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1966:1: ( '@' )
            {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1966:1: ( '@' )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1967:1: '@'
            {
             before(grammarAccess.getContactAccess().getCommercialAtKeyword_6_2()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__Contact__Group_6__2__Impl3881); 
             after(grammarAccess.getContactAccess().getCommercialAtKeyword_6_2()); 

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
    // $ANTLR end "rule__Contact__Group_6__2__Impl"


    // $ANTLR start "rule__Contact__Group_6__3"
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1980:1: rule__Contact__Group_6__3 : rule__Contact__Group_6__3__Impl rule__Contact__Group_6__4 ;
    public final void rule__Contact__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1984:1: ( rule__Contact__Group_6__3__Impl rule__Contact__Group_6__4 )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1985:2: rule__Contact__Group_6__3__Impl rule__Contact__Group_6__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Contact__Group_6__3__Impl_in_rule__Contact__Group_6__33912);
            rule__Contact__Group_6__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Contact__Group_6__4_in_rule__Contact__Group_6__33915);
            rule__Contact__Group_6__4();

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
    // $ANTLR end "rule__Contact__Group_6__3"


    // $ANTLR start "rule__Contact__Group_6__3__Impl"
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1992:1: rule__Contact__Group_6__3__Impl : ( ( ( ruleEString ) ) ( ( ruleEString )* ) ) ;
    public final void rule__Contact__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1996:1: ( ( ( ( ruleEString ) ) ( ( ruleEString )* ) ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1997:1: ( ( ( ruleEString ) ) ( ( ruleEString )* ) )
            {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1997:1: ( ( ( ruleEString ) ) ( ( ruleEString )* ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1998:1: ( ( ruleEString ) ) ( ( ruleEString )* )
            {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1998:1: ( ( ruleEString ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:1999:1: ( ruleEString )
            {
             before(grammarAccess.getContactAccess().getEStringParserRuleCall_6_3()); 
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2000:1: ( ruleEString )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2000:3: ruleEString
            {
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Contact__Group_6__3__Impl3945);
            ruleEString();

            state._fsp--;


            }

             after(grammarAccess.getContactAccess().getEStringParserRuleCall_6_3()); 

            }

            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2003:1: ( ( ruleEString )* )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2004:1: ( ruleEString )*
            {
             before(grammarAccess.getContactAccess().getEStringParserRuleCall_6_3()); 
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2005:1: ( ruleEString )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=RULE_STRING && LA13_0<=RULE_ID)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2005:3: ruleEString
            	    {
            	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Contact__Group_6__3__Impl3958);
            	    ruleEString();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getContactAccess().getEStringParserRuleCall_6_3()); 

            }


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
    // $ANTLR end "rule__Contact__Group_6__3__Impl"


    // $ANTLR start "rule__Contact__Group_6__4"
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2016:1: rule__Contact__Group_6__4 : rule__Contact__Group_6__4__Impl rule__Contact__Group_6__5 ;
    public final void rule__Contact__Group_6__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2020:1: ( rule__Contact__Group_6__4__Impl rule__Contact__Group_6__5 )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2021:2: rule__Contact__Group_6__4__Impl rule__Contact__Group_6__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Contact__Group_6__4__Impl_in_rule__Contact__Group_6__43991);
            rule__Contact__Group_6__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Contact__Group_6__5_in_rule__Contact__Group_6__43994);
            rule__Contact__Group_6__5();

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
    // $ANTLR end "rule__Contact__Group_6__4"


    // $ANTLR start "rule__Contact__Group_6__4__Impl"
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2028:1: rule__Contact__Group_6__4__Impl : ( '.' ) ;
    public final void rule__Contact__Group_6__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2032:1: ( ( '.' ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2033:1: ( '.' )
            {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2033:1: ( '.' )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2034:1: '.'
            {
             before(grammarAccess.getContactAccess().getFullStopKeyword_6_4()); 
            match(input,28,FollowSets000.FOLLOW_28_in_rule__Contact__Group_6__4__Impl4022); 
             after(grammarAccess.getContactAccess().getFullStopKeyword_6_4()); 

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
    // $ANTLR end "rule__Contact__Group_6__4__Impl"


    // $ANTLR start "rule__Contact__Group_6__5"
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2047:1: rule__Contact__Group_6__5 : rule__Contact__Group_6__5__Impl rule__Contact__Group_6__6 ;
    public final void rule__Contact__Group_6__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2051:1: ( rule__Contact__Group_6__5__Impl rule__Contact__Group_6__6 )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2052:2: rule__Contact__Group_6__5__Impl rule__Contact__Group_6__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Contact__Group_6__5__Impl_in_rule__Contact__Group_6__54053);
            rule__Contact__Group_6__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Contact__Group_6__6_in_rule__Contact__Group_6__54056);
            rule__Contact__Group_6__6();

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
    // $ANTLR end "rule__Contact__Group_6__5"


    // $ANTLR start "rule__Contact__Group_6__5__Impl"
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2059:1: rule__Contact__Group_6__5__Impl : ( ruleEString ) ;
    public final void rule__Contact__Group_6__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2063:1: ( ( ruleEString ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2064:1: ( ruleEString )
            {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2064:1: ( ruleEString )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2065:1: ruleEString
            {
             before(grammarAccess.getContactAccess().getEStringParserRuleCall_6_5()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Contact__Group_6__5__Impl4083);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getContactAccess().getEStringParserRuleCall_6_5()); 

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
    // $ANTLR end "rule__Contact__Group_6__5__Impl"


    // $ANTLR start "rule__Contact__Group_6__6"
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2076:1: rule__Contact__Group_6__6 : rule__Contact__Group_6__6__Impl rule__Contact__Group_6__7 ;
    public final void rule__Contact__Group_6__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2080:1: ( rule__Contact__Group_6__6__Impl rule__Contact__Group_6__7 )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2081:2: rule__Contact__Group_6__6__Impl rule__Contact__Group_6__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__Contact__Group_6__6__Impl_in_rule__Contact__Group_6__64112);
            rule__Contact__Group_6__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Contact__Group_6__7_in_rule__Contact__Group_6__64115);
            rule__Contact__Group_6__7();

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
    // $ANTLR end "rule__Contact__Group_6__6"


    // $ANTLR start "rule__Contact__Group_6__6__Impl"
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2088:1: rule__Contact__Group_6__6__Impl : ( ruleEString ) ;
    public final void rule__Contact__Group_6__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2092:1: ( ( ruleEString ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2093:1: ( ruleEString )
            {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2093:1: ( ruleEString )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2094:1: ruleEString
            {
             before(grammarAccess.getContactAccess().getEStringParserRuleCall_6_6()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Contact__Group_6__6__Impl4142);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getContactAccess().getEStringParserRuleCall_6_6()); 

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
    // $ANTLR end "rule__Contact__Group_6__6__Impl"


    // $ANTLR start "rule__Contact__Group_6__7"
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2105:1: rule__Contact__Group_6__7 : rule__Contact__Group_6__7__Impl ;
    public final void rule__Contact__Group_6__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2109:1: ( rule__Contact__Group_6__7__Impl )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2110:2: rule__Contact__Group_6__7__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Contact__Group_6__7__Impl_in_rule__Contact__Group_6__74171);
            rule__Contact__Group_6__7__Impl();

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
    // $ANTLR end "rule__Contact__Group_6__7"


    // $ANTLR start "rule__Contact__Group_6__7__Impl"
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2116:1: rule__Contact__Group_6__7__Impl : ( ruleEString ) ;
    public final void rule__Contact__Group_6__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2120:1: ( ( ruleEString ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2121:1: ( ruleEString )
            {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2121:1: ( ruleEString )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2122:1: ruleEString
            {
             before(grammarAccess.getContactAccess().getEStringParserRuleCall_6_7()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Contact__Group_6__7__Impl4198);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getContactAccess().getEStringParserRuleCall_6_7()); 

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
    // $ANTLR end "rule__Contact__Group_6__7__Impl"


    // $ANTLR start "rule__Contact__Group_7__0"
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2149:1: rule__Contact__Group_7__0 : rule__Contact__Group_7__0__Impl rule__Contact__Group_7__1 ;
    public final void rule__Contact__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2153:1: ( rule__Contact__Group_7__0__Impl rule__Contact__Group_7__1 )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2154:2: rule__Contact__Group_7__0__Impl rule__Contact__Group_7__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Contact__Group_7__0__Impl_in_rule__Contact__Group_7__04243);
            rule__Contact__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Contact__Group_7__1_in_rule__Contact__Group_7__04246);
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2161:1: rule__Contact__Group_7__0__Impl : ( 'telephone : ' ) ;
    public final void rule__Contact__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2165:1: ( ( 'telephone : ' ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2166:1: ( 'telephone : ' )
            {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2166:1: ( 'telephone : ' )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2167:1: 'telephone : '
            {
             before(grammarAccess.getContactAccess().getTelephoneKeyword_7_0()); 
            match(input,29,FollowSets000.FOLLOW_29_in_rule__Contact__Group_7__0__Impl4274); 
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2180:1: rule__Contact__Group_7__1 : rule__Contact__Group_7__1__Impl ;
    public final void rule__Contact__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2184:1: ( rule__Contact__Group_7__1__Impl )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2185:2: rule__Contact__Group_7__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Contact__Group_7__1__Impl_in_rule__Contact__Group_7__14305);
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2191:1: rule__Contact__Group_7__1__Impl : ( ( rule__Contact__TelephoneAssignment_7_1 ) ) ;
    public final void rule__Contact__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2195:1: ( ( ( rule__Contact__TelephoneAssignment_7_1 ) ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2196:1: ( ( rule__Contact__TelephoneAssignment_7_1 ) )
            {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2196:1: ( ( rule__Contact__TelephoneAssignment_7_1 ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2197:1: ( rule__Contact__TelephoneAssignment_7_1 )
            {
             before(grammarAccess.getContactAccess().getTelephoneAssignment_7_1()); 
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2198:1: ( rule__Contact__TelephoneAssignment_7_1 )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2198:2: rule__Contact__TelephoneAssignment_7_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Contact__TelephoneAssignment_7_1_in_rule__Contact__Group_7__1__Impl4332);
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2212:1: rule__Rubriques__Group__0 : rule__Rubriques__Group__0__Impl rule__Rubriques__Group__1 ;
    public final void rule__Rubriques__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2216:1: ( rule__Rubriques__Group__0__Impl rule__Rubriques__Group__1 )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2217:2: rule__Rubriques__Group__0__Impl rule__Rubriques__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Rubriques__Group__0__Impl_in_rule__Rubriques__Group__04366);
            rule__Rubriques__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Rubriques__Group__1_in_rule__Rubriques__Group__04369);
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2224:1: rule__Rubriques__Group__0__Impl : ( () ) ;
    public final void rule__Rubriques__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2228:1: ( ( () ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2229:1: ( () )
            {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2229:1: ( () )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2230:1: ()
            {
             before(grammarAccess.getRubriquesAccess().getRubriquesAction_0()); 
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2231:1: ()
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2233:1: 
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2243:1: rule__Rubriques__Group__1 : rule__Rubriques__Group__1__Impl rule__Rubriques__Group__2 ;
    public final void rule__Rubriques__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2247:1: ( rule__Rubriques__Group__1__Impl rule__Rubriques__Group__2 )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2248:2: rule__Rubriques__Group__1__Impl rule__Rubriques__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Rubriques__Group__1__Impl_in_rule__Rubriques__Group__14427);
            rule__Rubriques__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Rubriques__Group__2_in_rule__Rubriques__Group__14430);
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2255:1: rule__Rubriques__Group__1__Impl : ( 'Rubriques' ) ;
    public final void rule__Rubriques__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2259:1: ( ( 'Rubriques' ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2260:1: ( 'Rubriques' )
            {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2260:1: ( 'Rubriques' )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2261:1: 'Rubriques'
            {
             before(grammarAccess.getRubriquesAccess().getRubriquesKeyword_1()); 
            match(input,30,FollowSets000.FOLLOW_30_in_rule__Rubriques__Group__1__Impl4458); 
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2274:1: rule__Rubriques__Group__2 : rule__Rubriques__Group__2__Impl rule__Rubriques__Group__3 ;
    public final void rule__Rubriques__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2278:1: ( rule__Rubriques__Group__2__Impl rule__Rubriques__Group__3 )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2279:2: rule__Rubriques__Group__2__Impl rule__Rubriques__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Rubriques__Group__2__Impl_in_rule__Rubriques__Group__24489);
            rule__Rubriques__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Rubriques__Group__3_in_rule__Rubriques__Group__24492);
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2286:1: rule__Rubriques__Group__2__Impl : ( '{' ) ;
    public final void rule__Rubriques__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2290:1: ( ( '{' ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2291:1: ( '{' )
            {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2291:1: ( '{' )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2292:1: '{'
            {
             before(grammarAccess.getRubriquesAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Rubriques__Group__2__Impl4520); 
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2305:1: rule__Rubriques__Group__3 : rule__Rubriques__Group__3__Impl rule__Rubriques__Group__4 ;
    public final void rule__Rubriques__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2309:1: ( rule__Rubriques__Group__3__Impl rule__Rubriques__Group__4 )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2310:2: rule__Rubriques__Group__3__Impl rule__Rubriques__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Rubriques__Group__3__Impl_in_rule__Rubriques__Group__34551);
            rule__Rubriques__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Rubriques__Group__4_in_rule__Rubriques__Group__34554);
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2317:1: rule__Rubriques__Group__3__Impl : ( ( rule__Rubriques__Group_3__0 )? ) ;
    public final void rule__Rubriques__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2321:1: ( ( ( rule__Rubriques__Group_3__0 )? ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2322:1: ( ( rule__Rubriques__Group_3__0 )? )
            {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2322:1: ( ( rule__Rubriques__Group_3__0 )? )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2323:1: ( rule__Rubriques__Group_3__0 )?
            {
             before(grammarAccess.getRubriquesAccess().getGroup_3()); 
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2324:1: ( rule__Rubriques__Group_3__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==31) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2324:2: rule__Rubriques__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Rubriques__Group_3__0_in_rule__Rubriques__Group__3__Impl4581);
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2334:1: rule__Rubriques__Group__4 : rule__Rubriques__Group__4__Impl rule__Rubriques__Group__5 ;
    public final void rule__Rubriques__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2338:1: ( rule__Rubriques__Group__4__Impl rule__Rubriques__Group__5 )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2339:2: rule__Rubriques__Group__4__Impl rule__Rubriques__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Rubriques__Group__4__Impl_in_rule__Rubriques__Group__44612);
            rule__Rubriques__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Rubriques__Group__5_in_rule__Rubriques__Group__44615);
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2346:1: rule__Rubriques__Group__4__Impl : ( ( rule__Rubriques__Group_4__0 )? ) ;
    public final void rule__Rubriques__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2350:1: ( ( ( rule__Rubriques__Group_4__0 )? ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2351:1: ( ( rule__Rubriques__Group_4__0 )? )
            {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2351:1: ( ( rule__Rubriques__Group_4__0 )? )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2352:1: ( rule__Rubriques__Group_4__0 )?
            {
             before(grammarAccess.getRubriquesAccess().getGroup_4()); 
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2353:1: ( rule__Rubriques__Group_4__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==32) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2353:2: rule__Rubriques__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Rubriques__Group_4__0_in_rule__Rubriques__Group__4__Impl4642);
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2363:1: rule__Rubriques__Group__5 : rule__Rubriques__Group__5__Impl ;
    public final void rule__Rubriques__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2367:1: ( rule__Rubriques__Group__5__Impl )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2368:2: rule__Rubriques__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Rubriques__Group__5__Impl_in_rule__Rubriques__Group__54673);
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2374:1: rule__Rubriques__Group__5__Impl : ( '}' ) ;
    public final void rule__Rubriques__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2378:1: ( ( '}' ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2379:1: ( '}' )
            {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2379:1: ( '}' )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2380:1: '}'
            {
             before(grammarAccess.getRubriquesAccess().getRightCurlyBracketKeyword_5()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__Rubriques__Group__5__Impl4701); 
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2405:1: rule__Rubriques__Group_3__0 : rule__Rubriques__Group_3__0__Impl rule__Rubriques__Group_3__1 ;
    public final void rule__Rubriques__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2409:1: ( rule__Rubriques__Group_3__0__Impl rule__Rubriques__Group_3__1 )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2410:2: rule__Rubriques__Group_3__0__Impl rule__Rubriques__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Rubriques__Group_3__0__Impl_in_rule__Rubriques__Group_3__04744);
            rule__Rubriques__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Rubriques__Group_3__1_in_rule__Rubriques__Group_3__04747);
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2417:1: rule__Rubriques__Group_3__0__Impl : ( 'texte : ' ) ;
    public final void rule__Rubriques__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2421:1: ( ( 'texte : ' ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2422:1: ( 'texte : ' )
            {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2422:1: ( 'texte : ' )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2423:1: 'texte : '
            {
             before(grammarAccess.getRubriquesAccess().getTexteKeyword_3_0()); 
            match(input,31,FollowSets000.FOLLOW_31_in_rule__Rubriques__Group_3__0__Impl4775); 
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2436:1: rule__Rubriques__Group_3__1 : rule__Rubriques__Group_3__1__Impl ;
    public final void rule__Rubriques__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2440:1: ( rule__Rubriques__Group_3__1__Impl )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2441:2: rule__Rubriques__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Rubriques__Group_3__1__Impl_in_rule__Rubriques__Group_3__14806);
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2447:1: rule__Rubriques__Group_3__1__Impl : ( ( rule__Rubriques__TexteAssignment_3_1 ) ) ;
    public final void rule__Rubriques__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2451:1: ( ( ( rule__Rubriques__TexteAssignment_3_1 ) ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2452:1: ( ( rule__Rubriques__TexteAssignment_3_1 ) )
            {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2452:1: ( ( rule__Rubriques__TexteAssignment_3_1 ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2453:1: ( rule__Rubriques__TexteAssignment_3_1 )
            {
             before(grammarAccess.getRubriquesAccess().getTexteAssignment_3_1()); 
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2454:1: ( rule__Rubriques__TexteAssignment_3_1 )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2454:2: rule__Rubriques__TexteAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Rubriques__TexteAssignment_3_1_in_rule__Rubriques__Group_3__1__Impl4833);
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2468:1: rule__Rubriques__Group_4__0 : rule__Rubriques__Group_4__0__Impl rule__Rubriques__Group_4__1 ;
    public final void rule__Rubriques__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2472:1: ( rule__Rubriques__Group_4__0__Impl rule__Rubriques__Group_4__1 )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2473:2: rule__Rubriques__Group_4__0__Impl rule__Rubriques__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Rubriques__Group_4__0__Impl_in_rule__Rubriques__Group_4__04867);
            rule__Rubriques__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Rubriques__Group_4__1_in_rule__Rubriques__Group_4__04870);
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2480:1: rule__Rubriques__Group_4__0__Impl : ( 'lien : ' ) ;
    public final void rule__Rubriques__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2484:1: ( ( 'lien : ' ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2485:1: ( 'lien : ' )
            {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2485:1: ( 'lien : ' )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2486:1: 'lien : '
            {
             before(grammarAccess.getRubriquesAccess().getLienKeyword_4_0()); 
            match(input,32,FollowSets000.FOLLOW_32_in_rule__Rubriques__Group_4__0__Impl4898); 
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2499:1: rule__Rubriques__Group_4__1 : rule__Rubriques__Group_4__1__Impl ;
    public final void rule__Rubriques__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2503:1: ( rule__Rubriques__Group_4__1__Impl )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2504:2: rule__Rubriques__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Rubriques__Group_4__1__Impl_in_rule__Rubriques__Group_4__14929);
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2510:1: rule__Rubriques__Group_4__1__Impl : ( ( rule__Rubriques__LienAssignment_4_1 ) ) ;
    public final void rule__Rubriques__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2514:1: ( ( ( rule__Rubriques__LienAssignment_4_1 ) ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2515:1: ( ( rule__Rubriques__LienAssignment_4_1 ) )
            {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2515:1: ( ( rule__Rubriques__LienAssignment_4_1 ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2516:1: ( rule__Rubriques__LienAssignment_4_1 )
            {
             before(grammarAccess.getRubriquesAccess().getLienAssignment_4_1()); 
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2517:1: ( rule__Rubriques__LienAssignment_4_1 )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2517:2: rule__Rubriques__LienAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Rubriques__LienAssignment_4_1_in_rule__Rubriques__Group_4__1__Impl4956);
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2531:1: rule__Fichiers__Group__0 : rule__Fichiers__Group__0__Impl rule__Fichiers__Group__1 ;
    public final void rule__Fichiers__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2535:1: ( rule__Fichiers__Group__0__Impl rule__Fichiers__Group__1 )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2536:2: rule__Fichiers__Group__0__Impl rule__Fichiers__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Fichiers__Group__0__Impl_in_rule__Fichiers__Group__04990);
            rule__Fichiers__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Fichiers__Group__1_in_rule__Fichiers__Group__04993);
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2543:1: rule__Fichiers__Group__0__Impl : ( () ) ;
    public final void rule__Fichiers__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2547:1: ( ( () ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2548:1: ( () )
            {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2548:1: ( () )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2549:1: ()
            {
             before(grammarAccess.getFichiersAccess().getFichiersAction_0()); 
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2550:1: ()
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2552:1: 
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2562:1: rule__Fichiers__Group__1 : rule__Fichiers__Group__1__Impl rule__Fichiers__Group__2 ;
    public final void rule__Fichiers__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2566:1: ( rule__Fichiers__Group__1__Impl rule__Fichiers__Group__2 )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2567:2: rule__Fichiers__Group__1__Impl rule__Fichiers__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Fichiers__Group__1__Impl_in_rule__Fichiers__Group__15051);
            rule__Fichiers__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Fichiers__Group__2_in_rule__Fichiers__Group__15054);
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2574:1: rule__Fichiers__Group__1__Impl : ( 'Fichiers' ) ;
    public final void rule__Fichiers__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2578:1: ( ( 'Fichiers' ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2579:1: ( 'Fichiers' )
            {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2579:1: ( 'Fichiers' )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2580:1: 'Fichiers'
            {
             before(grammarAccess.getFichiersAccess().getFichiersKeyword_1()); 
            match(input,33,FollowSets000.FOLLOW_33_in_rule__Fichiers__Group__1__Impl5082); 
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2593:1: rule__Fichiers__Group__2 : rule__Fichiers__Group__2__Impl rule__Fichiers__Group__3 ;
    public final void rule__Fichiers__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2597:1: ( rule__Fichiers__Group__2__Impl rule__Fichiers__Group__3 )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2598:2: rule__Fichiers__Group__2__Impl rule__Fichiers__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Fichiers__Group__2__Impl_in_rule__Fichiers__Group__25113);
            rule__Fichiers__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Fichiers__Group__3_in_rule__Fichiers__Group__25116);
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2605:1: rule__Fichiers__Group__2__Impl : ( '{' ) ;
    public final void rule__Fichiers__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2609:1: ( ( '{' ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2610:1: ( '{' )
            {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2610:1: ( '{' )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2611:1: '{'
            {
             before(grammarAccess.getFichiersAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Fichiers__Group__2__Impl5144); 
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2624:1: rule__Fichiers__Group__3 : rule__Fichiers__Group__3__Impl rule__Fichiers__Group__4 ;
    public final void rule__Fichiers__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2628:1: ( rule__Fichiers__Group__3__Impl rule__Fichiers__Group__4 )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2629:2: rule__Fichiers__Group__3__Impl rule__Fichiers__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Fichiers__Group__3__Impl_in_rule__Fichiers__Group__35175);
            rule__Fichiers__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Fichiers__Group__4_in_rule__Fichiers__Group__35178);
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2636:1: rule__Fichiers__Group__3__Impl : ( ( rule__Fichiers__Group_3__0 )? ) ;
    public final void rule__Fichiers__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2640:1: ( ( ( rule__Fichiers__Group_3__0 )? ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2641:1: ( ( rule__Fichiers__Group_3__0 )? )
            {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2641:1: ( ( rule__Fichiers__Group_3__0 )? )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2642:1: ( rule__Fichiers__Group_3__0 )?
            {
             before(grammarAccess.getFichiersAccess().getGroup_3()); 
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2643:1: ( rule__Fichiers__Group_3__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==34) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2643:2: rule__Fichiers__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Fichiers__Group_3__0_in_rule__Fichiers__Group__3__Impl5205);
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2653:1: rule__Fichiers__Group__4 : rule__Fichiers__Group__4__Impl rule__Fichiers__Group__5 ;
    public final void rule__Fichiers__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2657:1: ( rule__Fichiers__Group__4__Impl rule__Fichiers__Group__5 )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2658:2: rule__Fichiers__Group__4__Impl rule__Fichiers__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Fichiers__Group__4__Impl_in_rule__Fichiers__Group__45236);
            rule__Fichiers__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Fichiers__Group__5_in_rule__Fichiers__Group__45239);
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2665:1: rule__Fichiers__Group__4__Impl : ( ( rule__Fichiers__Group_4__0 )? ) ;
    public final void rule__Fichiers__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2669:1: ( ( ( rule__Fichiers__Group_4__0 )? ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2670:1: ( ( rule__Fichiers__Group_4__0 )? )
            {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2670:1: ( ( rule__Fichiers__Group_4__0 )? )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2671:1: ( rule__Fichiers__Group_4__0 )?
            {
             before(grammarAccess.getFichiersAccess().getGroup_4()); 
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2672:1: ( rule__Fichiers__Group_4__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==35) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2672:2: rule__Fichiers__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Fichiers__Group_4__0_in_rule__Fichiers__Group__4__Impl5266);
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2682:1: rule__Fichiers__Group__5 : rule__Fichiers__Group__5__Impl rule__Fichiers__Group__6 ;
    public final void rule__Fichiers__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2686:1: ( rule__Fichiers__Group__5__Impl rule__Fichiers__Group__6 )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2687:2: rule__Fichiers__Group__5__Impl rule__Fichiers__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Fichiers__Group__5__Impl_in_rule__Fichiers__Group__55297);
            rule__Fichiers__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Fichiers__Group__6_in_rule__Fichiers__Group__55300);
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2694:1: rule__Fichiers__Group__5__Impl : ( ( rule__Fichiers__Group_5__0 )? ) ;
    public final void rule__Fichiers__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2698:1: ( ( ( rule__Fichiers__Group_5__0 )? ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2699:1: ( ( rule__Fichiers__Group_5__0 )? )
            {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2699:1: ( ( rule__Fichiers__Group_5__0 )? )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2700:1: ( rule__Fichiers__Group_5__0 )?
            {
             before(grammarAccess.getFichiersAccess().getGroup_5()); 
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2701:1: ( rule__Fichiers__Group_5__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==23) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2701:2: rule__Fichiers__Group_5__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Fichiers__Group_5__0_in_rule__Fichiers__Group__5__Impl5327);
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2711:1: rule__Fichiers__Group__6 : rule__Fichiers__Group__6__Impl rule__Fichiers__Group__7 ;
    public final void rule__Fichiers__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2715:1: ( rule__Fichiers__Group__6__Impl rule__Fichiers__Group__7 )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2716:2: rule__Fichiers__Group__6__Impl rule__Fichiers__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__Fichiers__Group__6__Impl_in_rule__Fichiers__Group__65358);
            rule__Fichiers__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Fichiers__Group__7_in_rule__Fichiers__Group__65361);
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2723:1: rule__Fichiers__Group__6__Impl : ( ( rule__Fichiers__Group_6__0 )? ) ;
    public final void rule__Fichiers__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2727:1: ( ( ( rule__Fichiers__Group_6__0 )? ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2728:1: ( ( rule__Fichiers__Group_6__0 )? )
            {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2728:1: ( ( rule__Fichiers__Group_6__0 )? )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2729:1: ( rule__Fichiers__Group_6__0 )?
            {
             before(grammarAccess.getFichiersAccess().getGroup_6()); 
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2730:1: ( rule__Fichiers__Group_6__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==36) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2730:2: rule__Fichiers__Group_6__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Fichiers__Group_6__0_in_rule__Fichiers__Group__6__Impl5388);
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2740:1: rule__Fichiers__Group__7 : rule__Fichiers__Group__7__Impl ;
    public final void rule__Fichiers__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2744:1: ( rule__Fichiers__Group__7__Impl )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2745:2: rule__Fichiers__Group__7__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Fichiers__Group__7__Impl_in_rule__Fichiers__Group__75419);
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2751:1: rule__Fichiers__Group__7__Impl : ( '}' ) ;
    public final void rule__Fichiers__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2755:1: ( ( '}' ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2756:1: ( '}' )
            {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2756:1: ( '}' )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2757:1: '}'
            {
             before(grammarAccess.getFichiersAccess().getRightCurlyBracketKeyword_7()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__Fichiers__Group__7__Impl5447); 
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2786:1: rule__Fichiers__Group_3__0 : rule__Fichiers__Group_3__0__Impl rule__Fichiers__Group_3__1 ;
    public final void rule__Fichiers__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2790:1: ( rule__Fichiers__Group_3__0__Impl rule__Fichiers__Group_3__1 )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2791:2: rule__Fichiers__Group_3__0__Impl rule__Fichiers__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Fichiers__Group_3__0__Impl_in_rule__Fichiers__Group_3__05494);
            rule__Fichiers__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Fichiers__Group_3__1_in_rule__Fichiers__Group_3__05497);
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2798:1: rule__Fichiers__Group_3__0__Impl : ( 'type : ' ) ;
    public final void rule__Fichiers__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2802:1: ( ( 'type : ' ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2803:1: ( 'type : ' )
            {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2803:1: ( 'type : ' )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2804:1: 'type : '
            {
             before(grammarAccess.getFichiersAccess().getTypeKeyword_3_0()); 
            match(input,34,FollowSets000.FOLLOW_34_in_rule__Fichiers__Group_3__0__Impl5525); 
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2817:1: rule__Fichiers__Group_3__1 : rule__Fichiers__Group_3__1__Impl ;
    public final void rule__Fichiers__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2821:1: ( rule__Fichiers__Group_3__1__Impl )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2822:2: rule__Fichiers__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Fichiers__Group_3__1__Impl_in_rule__Fichiers__Group_3__15556);
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2828:1: rule__Fichiers__Group_3__1__Impl : ( ( rule__Fichiers__TypeAssignment_3_1 ) ) ;
    public final void rule__Fichiers__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2832:1: ( ( ( rule__Fichiers__TypeAssignment_3_1 ) ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2833:1: ( ( rule__Fichiers__TypeAssignment_3_1 ) )
            {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2833:1: ( ( rule__Fichiers__TypeAssignment_3_1 ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2834:1: ( rule__Fichiers__TypeAssignment_3_1 )
            {
             before(grammarAccess.getFichiersAccess().getTypeAssignment_3_1()); 
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2835:1: ( rule__Fichiers__TypeAssignment_3_1 )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2835:2: rule__Fichiers__TypeAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Fichiers__TypeAssignment_3_1_in_rule__Fichiers__Group_3__1__Impl5583);
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2849:1: rule__Fichiers__Group_4__0 : rule__Fichiers__Group_4__0__Impl rule__Fichiers__Group_4__1 ;
    public final void rule__Fichiers__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2853:1: ( rule__Fichiers__Group_4__0__Impl rule__Fichiers__Group_4__1 )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2854:2: rule__Fichiers__Group_4__0__Impl rule__Fichiers__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Fichiers__Group_4__0__Impl_in_rule__Fichiers__Group_4__05617);
            rule__Fichiers__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Fichiers__Group_4__1_in_rule__Fichiers__Group_4__05620);
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2861:1: rule__Fichiers__Group_4__0__Impl : ( 'taille : ' ) ;
    public final void rule__Fichiers__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2865:1: ( ( 'taille : ' ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2866:1: ( 'taille : ' )
            {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2866:1: ( 'taille : ' )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2867:1: 'taille : '
            {
             before(grammarAccess.getFichiersAccess().getTailleKeyword_4_0()); 
            match(input,35,FollowSets000.FOLLOW_35_in_rule__Fichiers__Group_4__0__Impl5648); 
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2880:1: rule__Fichiers__Group_4__1 : rule__Fichiers__Group_4__1__Impl ;
    public final void rule__Fichiers__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2884:1: ( rule__Fichiers__Group_4__1__Impl )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2885:2: rule__Fichiers__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Fichiers__Group_4__1__Impl_in_rule__Fichiers__Group_4__15679);
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2891:1: rule__Fichiers__Group_4__1__Impl : ( ( rule__Fichiers__TailleAssignment_4_1 ) ) ;
    public final void rule__Fichiers__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2895:1: ( ( ( rule__Fichiers__TailleAssignment_4_1 ) ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2896:1: ( ( rule__Fichiers__TailleAssignment_4_1 ) )
            {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2896:1: ( ( rule__Fichiers__TailleAssignment_4_1 ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2897:1: ( rule__Fichiers__TailleAssignment_4_1 )
            {
             before(grammarAccess.getFichiersAccess().getTailleAssignment_4_1()); 
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2898:1: ( rule__Fichiers__TailleAssignment_4_1 )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2898:2: rule__Fichiers__TailleAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Fichiers__TailleAssignment_4_1_in_rule__Fichiers__Group_4__1__Impl5706);
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2912:1: rule__Fichiers__Group_5__0 : rule__Fichiers__Group_5__0__Impl rule__Fichiers__Group_5__1 ;
    public final void rule__Fichiers__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2916:1: ( rule__Fichiers__Group_5__0__Impl rule__Fichiers__Group_5__1 )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2917:2: rule__Fichiers__Group_5__0__Impl rule__Fichiers__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Fichiers__Group_5__0__Impl_in_rule__Fichiers__Group_5__05740);
            rule__Fichiers__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Fichiers__Group_5__1_in_rule__Fichiers__Group_5__05743);
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2924:1: rule__Fichiers__Group_5__0__Impl : ( 'nom : ' ) ;
    public final void rule__Fichiers__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2928:1: ( ( 'nom : ' ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2929:1: ( 'nom : ' )
            {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2929:1: ( 'nom : ' )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2930:1: 'nom : '
            {
             before(grammarAccess.getFichiersAccess().getNomKeyword_5_0()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__Fichiers__Group_5__0__Impl5771); 
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2943:1: rule__Fichiers__Group_5__1 : rule__Fichiers__Group_5__1__Impl ;
    public final void rule__Fichiers__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2947:1: ( rule__Fichiers__Group_5__1__Impl )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2948:2: rule__Fichiers__Group_5__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Fichiers__Group_5__1__Impl_in_rule__Fichiers__Group_5__15802);
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2954:1: rule__Fichiers__Group_5__1__Impl : ( ( rule__Fichiers__NomAssignment_5_1 ) ) ;
    public final void rule__Fichiers__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2958:1: ( ( ( rule__Fichiers__NomAssignment_5_1 ) ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2959:1: ( ( rule__Fichiers__NomAssignment_5_1 ) )
            {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2959:1: ( ( rule__Fichiers__NomAssignment_5_1 ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2960:1: ( rule__Fichiers__NomAssignment_5_1 )
            {
             before(grammarAccess.getFichiersAccess().getNomAssignment_5_1()); 
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2961:1: ( rule__Fichiers__NomAssignment_5_1 )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2961:2: rule__Fichiers__NomAssignment_5_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Fichiers__NomAssignment_5_1_in_rule__Fichiers__Group_5__1__Impl5829);
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2975:1: rule__Fichiers__Group_6__0 : rule__Fichiers__Group_6__0__Impl rule__Fichiers__Group_6__1 ;
    public final void rule__Fichiers__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2979:1: ( rule__Fichiers__Group_6__0__Impl rule__Fichiers__Group_6__1 )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2980:2: rule__Fichiers__Group_6__0__Impl rule__Fichiers__Group_6__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Fichiers__Group_6__0__Impl_in_rule__Fichiers__Group_6__05863);
            rule__Fichiers__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Fichiers__Group_6__1_in_rule__Fichiers__Group_6__05866);
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2987:1: rule__Fichiers__Group_6__0__Impl : ( 'emplacement : ' ) ;
    public final void rule__Fichiers__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2991:1: ( ( 'emplacement : ' ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2992:1: ( 'emplacement : ' )
            {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2992:1: ( 'emplacement : ' )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:2993:1: 'emplacement : '
            {
             before(grammarAccess.getFichiersAccess().getEmplacementKeyword_6_0()); 
            match(input,36,FollowSets000.FOLLOW_36_in_rule__Fichiers__Group_6__0__Impl5894); 
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3006:1: rule__Fichiers__Group_6__1 : rule__Fichiers__Group_6__1__Impl ;
    public final void rule__Fichiers__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3010:1: ( rule__Fichiers__Group_6__1__Impl )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3011:2: rule__Fichiers__Group_6__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Fichiers__Group_6__1__Impl_in_rule__Fichiers__Group_6__15925);
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3017:1: rule__Fichiers__Group_6__1__Impl : ( ( rule__Fichiers__EmplacementAssignment_6_1 ) ) ;
    public final void rule__Fichiers__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3021:1: ( ( ( rule__Fichiers__EmplacementAssignment_6_1 ) ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3022:1: ( ( rule__Fichiers__EmplacementAssignment_6_1 ) )
            {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3022:1: ( ( rule__Fichiers__EmplacementAssignment_6_1 ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3023:1: ( rule__Fichiers__EmplacementAssignment_6_1 )
            {
             before(grammarAccess.getFichiersAccess().getEmplacementAssignment_6_1()); 
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3024:1: ( rule__Fichiers__EmplacementAssignment_6_1 )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3024:2: rule__Fichiers__EmplacementAssignment_6_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Fichiers__EmplacementAssignment_6_1_in_rule__Fichiers__Group_6__1__Impl5952);
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3038:1: rule__ConfigurationPage__Group__0 : rule__ConfigurationPage__Group__0__Impl rule__ConfigurationPage__Group__1 ;
    public final void rule__ConfigurationPage__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3042:1: ( rule__ConfigurationPage__Group__0__Impl rule__ConfigurationPage__Group__1 )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3043:2: rule__ConfigurationPage__Group__0__Impl rule__ConfigurationPage__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConfigurationPage__Group__0__Impl_in_rule__ConfigurationPage__Group__05986);
            rule__ConfigurationPage__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ConfigurationPage__Group__1_in_rule__ConfigurationPage__Group__05989);
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3050:1: rule__ConfigurationPage__Group__0__Impl : ( () ) ;
    public final void rule__ConfigurationPage__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3054:1: ( ( () ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3055:1: ( () )
            {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3055:1: ( () )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3056:1: ()
            {
             before(grammarAccess.getConfigurationPageAccess().getConfigurationPageAction_0()); 
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3057:1: ()
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3059:1: 
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3069:1: rule__ConfigurationPage__Group__1 : rule__ConfigurationPage__Group__1__Impl rule__ConfigurationPage__Group__2 ;
    public final void rule__ConfigurationPage__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3073:1: ( rule__ConfigurationPage__Group__1__Impl rule__ConfigurationPage__Group__2 )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3074:2: rule__ConfigurationPage__Group__1__Impl rule__ConfigurationPage__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConfigurationPage__Group__1__Impl_in_rule__ConfigurationPage__Group__16047);
            rule__ConfigurationPage__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ConfigurationPage__Group__2_in_rule__ConfigurationPage__Group__16050);
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3081:1: rule__ConfigurationPage__Group__1__Impl : ( 'ConfigurationPage' ) ;
    public final void rule__ConfigurationPage__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3085:1: ( ( 'ConfigurationPage' ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3086:1: ( 'ConfigurationPage' )
            {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3086:1: ( 'ConfigurationPage' )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3087:1: 'ConfigurationPage'
            {
             before(grammarAccess.getConfigurationPageAccess().getConfigurationPageKeyword_1()); 
            match(input,37,FollowSets000.FOLLOW_37_in_rule__ConfigurationPage__Group__1__Impl6078); 
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3100:1: rule__ConfigurationPage__Group__2 : rule__ConfigurationPage__Group__2__Impl rule__ConfigurationPage__Group__3 ;
    public final void rule__ConfigurationPage__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3104:1: ( rule__ConfigurationPage__Group__2__Impl rule__ConfigurationPage__Group__3 )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3105:2: rule__ConfigurationPage__Group__2__Impl rule__ConfigurationPage__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConfigurationPage__Group__2__Impl_in_rule__ConfigurationPage__Group__26109);
            rule__ConfigurationPage__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ConfigurationPage__Group__3_in_rule__ConfigurationPage__Group__26112);
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3112:1: rule__ConfigurationPage__Group__2__Impl : ( '{' ) ;
    public final void rule__ConfigurationPage__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3116:1: ( ( '{' ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3117:1: ( '{' )
            {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3117:1: ( '{' )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3118:1: '{'
            {
             before(grammarAccess.getConfigurationPageAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__ConfigurationPage__Group__2__Impl6140); 
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3131:1: rule__ConfigurationPage__Group__3 : rule__ConfigurationPage__Group__3__Impl rule__ConfigurationPage__Group__4 ;
    public final void rule__ConfigurationPage__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3135:1: ( rule__ConfigurationPage__Group__3__Impl rule__ConfigurationPage__Group__4 )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3136:2: rule__ConfigurationPage__Group__3__Impl rule__ConfigurationPage__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConfigurationPage__Group__3__Impl_in_rule__ConfigurationPage__Group__36171);
            rule__ConfigurationPage__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ConfigurationPage__Group__4_in_rule__ConfigurationPage__Group__36174);
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3143:1: rule__ConfigurationPage__Group__3__Impl : ( ( rule__ConfigurationPage__Group_3__0 )? ) ;
    public final void rule__ConfigurationPage__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3147:1: ( ( ( rule__ConfigurationPage__Group_3__0 )? ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3148:1: ( ( rule__ConfigurationPage__Group_3__0 )? )
            {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3148:1: ( ( rule__ConfigurationPage__Group_3__0 )? )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3149:1: ( rule__ConfigurationPage__Group_3__0 )?
            {
             before(grammarAccess.getConfigurationPageAccess().getGroup_3()); 
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3150:1: ( rule__ConfigurationPage__Group_3__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==38) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3150:2: rule__ConfigurationPage__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__ConfigurationPage__Group_3__0_in_rule__ConfigurationPage__Group__3__Impl6201);
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3160:1: rule__ConfigurationPage__Group__4 : rule__ConfigurationPage__Group__4__Impl rule__ConfigurationPage__Group__5 ;
    public final void rule__ConfigurationPage__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3164:1: ( rule__ConfigurationPage__Group__4__Impl rule__ConfigurationPage__Group__5 )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3165:2: rule__ConfigurationPage__Group__4__Impl rule__ConfigurationPage__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConfigurationPage__Group__4__Impl_in_rule__ConfigurationPage__Group__46232);
            rule__ConfigurationPage__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ConfigurationPage__Group__5_in_rule__ConfigurationPage__Group__46235);
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3172:1: rule__ConfigurationPage__Group__4__Impl : ( ( rule__ConfigurationPage__Group_4__0 )? ) ;
    public final void rule__ConfigurationPage__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3176:1: ( ( ( rule__ConfigurationPage__Group_4__0 )? ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3177:1: ( ( rule__ConfigurationPage__Group_4__0 )? )
            {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3177:1: ( ( rule__ConfigurationPage__Group_4__0 )? )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3178:1: ( rule__ConfigurationPage__Group_4__0 )?
            {
             before(grammarAccess.getConfigurationPageAccess().getGroup_4()); 
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3179:1: ( rule__ConfigurationPage__Group_4__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==39) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3179:2: rule__ConfigurationPage__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__ConfigurationPage__Group_4__0_in_rule__ConfigurationPage__Group__4__Impl6262);
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3189:1: rule__ConfigurationPage__Group__5 : rule__ConfigurationPage__Group__5__Impl rule__ConfigurationPage__Group__6 ;
    public final void rule__ConfigurationPage__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3193:1: ( rule__ConfigurationPage__Group__5__Impl rule__ConfigurationPage__Group__6 )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3194:2: rule__ConfigurationPage__Group__5__Impl rule__ConfigurationPage__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConfigurationPage__Group__5__Impl_in_rule__ConfigurationPage__Group__56293);
            rule__ConfigurationPage__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ConfigurationPage__Group__6_in_rule__ConfigurationPage__Group__56296);
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3201:1: rule__ConfigurationPage__Group__5__Impl : ( ( rule__ConfigurationPage__Group_5__0 )? ) ;
    public final void rule__ConfigurationPage__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3205:1: ( ( ( rule__ConfigurationPage__Group_5__0 )? ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3206:1: ( ( rule__ConfigurationPage__Group_5__0 )? )
            {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3206:1: ( ( rule__ConfigurationPage__Group_5__0 )? )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3207:1: ( rule__ConfigurationPage__Group_5__0 )?
            {
             before(grammarAccess.getConfigurationPageAccess().getGroup_5()); 
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3208:1: ( rule__ConfigurationPage__Group_5__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==40) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3208:2: rule__ConfigurationPage__Group_5__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__ConfigurationPage__Group_5__0_in_rule__ConfigurationPage__Group__5__Impl6323);
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3218:1: rule__ConfigurationPage__Group__6 : rule__ConfigurationPage__Group__6__Impl rule__ConfigurationPage__Group__7 ;
    public final void rule__ConfigurationPage__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3222:1: ( rule__ConfigurationPage__Group__6__Impl rule__ConfigurationPage__Group__7 )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3223:2: rule__ConfigurationPage__Group__6__Impl rule__ConfigurationPage__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConfigurationPage__Group__6__Impl_in_rule__ConfigurationPage__Group__66354);
            rule__ConfigurationPage__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ConfigurationPage__Group__7_in_rule__ConfigurationPage__Group__66357);
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3230:1: rule__ConfigurationPage__Group__6__Impl : ( ( rule__ConfigurationPage__Group_6__0 )? ) ;
    public final void rule__ConfigurationPage__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3234:1: ( ( ( rule__ConfigurationPage__Group_6__0 )? ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3235:1: ( ( rule__ConfigurationPage__Group_6__0 )? )
            {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3235:1: ( ( rule__ConfigurationPage__Group_6__0 )? )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3236:1: ( rule__ConfigurationPage__Group_6__0 )?
            {
             before(grammarAccess.getConfigurationPageAccess().getGroup_6()); 
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3237:1: ( rule__ConfigurationPage__Group_6__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==41) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3237:2: rule__ConfigurationPage__Group_6__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__ConfigurationPage__Group_6__0_in_rule__ConfigurationPage__Group__6__Impl6384);
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3247:1: rule__ConfigurationPage__Group__7 : rule__ConfigurationPage__Group__7__Impl rule__ConfigurationPage__Group__8 ;
    public final void rule__ConfigurationPage__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3251:1: ( rule__ConfigurationPage__Group__7__Impl rule__ConfigurationPage__Group__8 )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3252:2: rule__ConfigurationPage__Group__7__Impl rule__ConfigurationPage__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConfigurationPage__Group__7__Impl_in_rule__ConfigurationPage__Group__76415);
            rule__ConfigurationPage__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ConfigurationPage__Group__8_in_rule__ConfigurationPage__Group__76418);
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3259:1: rule__ConfigurationPage__Group__7__Impl : ( ( rule__ConfigurationPage__Group_7__0 )? ) ;
    public final void rule__ConfigurationPage__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3263:1: ( ( ( rule__ConfigurationPage__Group_7__0 )? ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3264:1: ( ( rule__ConfigurationPage__Group_7__0 )? )
            {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3264:1: ( ( rule__ConfigurationPage__Group_7__0 )? )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3265:1: ( rule__ConfigurationPage__Group_7__0 )?
            {
             before(grammarAccess.getConfigurationPageAccess().getGroup_7()); 
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3266:1: ( rule__ConfigurationPage__Group_7__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==42) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3266:2: rule__ConfigurationPage__Group_7__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__ConfigurationPage__Group_7__0_in_rule__ConfigurationPage__Group__7__Impl6445);
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3276:1: rule__ConfigurationPage__Group__8 : rule__ConfigurationPage__Group__8__Impl ;
    public final void rule__ConfigurationPage__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3280:1: ( rule__ConfigurationPage__Group__8__Impl )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3281:2: rule__ConfigurationPage__Group__8__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConfigurationPage__Group__8__Impl_in_rule__ConfigurationPage__Group__86476);
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3287:1: rule__ConfigurationPage__Group__8__Impl : ( '}' ) ;
    public final void rule__ConfigurationPage__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3291:1: ( ( '}' ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3292:1: ( '}' )
            {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3292:1: ( '}' )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3293:1: '}'
            {
             before(grammarAccess.getConfigurationPageAccess().getRightCurlyBracketKeyword_8()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__ConfigurationPage__Group__8__Impl6504); 
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3324:1: rule__ConfigurationPage__Group_3__0 : rule__ConfigurationPage__Group_3__0__Impl rule__ConfigurationPage__Group_3__1 ;
    public final void rule__ConfigurationPage__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3328:1: ( rule__ConfigurationPage__Group_3__0__Impl rule__ConfigurationPage__Group_3__1 )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3329:2: rule__ConfigurationPage__Group_3__0__Impl rule__ConfigurationPage__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConfigurationPage__Group_3__0__Impl_in_rule__ConfigurationPage__Group_3__06553);
            rule__ConfigurationPage__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ConfigurationPage__Group_3__1_in_rule__ConfigurationPage__Group_3__06556);
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3336:1: rule__ConfigurationPage__Group_3__0__Impl : ( 'couleurFond : ' ) ;
    public final void rule__ConfigurationPage__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3340:1: ( ( 'couleurFond : ' ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3341:1: ( 'couleurFond : ' )
            {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3341:1: ( 'couleurFond : ' )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3342:1: 'couleurFond : '
            {
             before(grammarAccess.getConfigurationPageAccess().getCouleurFondKeyword_3_0()); 
            match(input,38,FollowSets000.FOLLOW_38_in_rule__ConfigurationPage__Group_3__0__Impl6584); 
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3355:1: rule__ConfigurationPage__Group_3__1 : rule__ConfigurationPage__Group_3__1__Impl ;
    public final void rule__ConfigurationPage__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3359:1: ( rule__ConfigurationPage__Group_3__1__Impl )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3360:2: rule__ConfigurationPage__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConfigurationPage__Group_3__1__Impl_in_rule__ConfigurationPage__Group_3__16615);
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3366:1: rule__ConfigurationPage__Group_3__1__Impl : ( ( rule__ConfigurationPage__CouleurFondAssignment_3_1 ) ) ;
    public final void rule__ConfigurationPage__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3370:1: ( ( ( rule__ConfigurationPage__CouleurFondAssignment_3_1 ) ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3371:1: ( ( rule__ConfigurationPage__CouleurFondAssignment_3_1 ) )
            {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3371:1: ( ( rule__ConfigurationPage__CouleurFondAssignment_3_1 ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3372:1: ( rule__ConfigurationPage__CouleurFondAssignment_3_1 )
            {
             before(grammarAccess.getConfigurationPageAccess().getCouleurFondAssignment_3_1()); 
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3373:1: ( rule__ConfigurationPage__CouleurFondAssignment_3_1 )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3373:2: rule__ConfigurationPage__CouleurFondAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConfigurationPage__CouleurFondAssignment_3_1_in_rule__ConfigurationPage__Group_3__1__Impl6642);
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3387:1: rule__ConfigurationPage__Group_4__0 : rule__ConfigurationPage__Group_4__0__Impl rule__ConfigurationPage__Group_4__1 ;
    public final void rule__ConfigurationPage__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3391:1: ( rule__ConfigurationPage__Group_4__0__Impl rule__ConfigurationPage__Group_4__1 )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3392:2: rule__ConfigurationPage__Group_4__0__Impl rule__ConfigurationPage__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConfigurationPage__Group_4__0__Impl_in_rule__ConfigurationPage__Group_4__06676);
            rule__ConfigurationPage__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ConfigurationPage__Group_4__1_in_rule__ConfigurationPage__Group_4__06679);
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3399:1: rule__ConfigurationPage__Group_4__0__Impl : ( 'titreSite : ' ) ;
    public final void rule__ConfigurationPage__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3403:1: ( ( 'titreSite : ' ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3404:1: ( 'titreSite : ' )
            {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3404:1: ( 'titreSite : ' )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3405:1: 'titreSite : '
            {
             before(grammarAccess.getConfigurationPageAccess().getTitreSiteKeyword_4_0()); 
            match(input,39,FollowSets000.FOLLOW_39_in_rule__ConfigurationPage__Group_4__0__Impl6707); 
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3418:1: rule__ConfigurationPage__Group_4__1 : rule__ConfigurationPage__Group_4__1__Impl ;
    public final void rule__ConfigurationPage__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3422:1: ( rule__ConfigurationPage__Group_4__1__Impl )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3423:2: rule__ConfigurationPage__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConfigurationPage__Group_4__1__Impl_in_rule__ConfigurationPage__Group_4__16738);
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3429:1: rule__ConfigurationPage__Group_4__1__Impl : ( ( rule__ConfigurationPage__TitreSiteAssignment_4_1 ) ) ;
    public final void rule__ConfigurationPage__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3433:1: ( ( ( rule__ConfigurationPage__TitreSiteAssignment_4_1 ) ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3434:1: ( ( rule__ConfigurationPage__TitreSiteAssignment_4_1 ) )
            {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3434:1: ( ( rule__ConfigurationPage__TitreSiteAssignment_4_1 ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3435:1: ( rule__ConfigurationPage__TitreSiteAssignment_4_1 )
            {
             before(grammarAccess.getConfigurationPageAccess().getTitreSiteAssignment_4_1()); 
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3436:1: ( rule__ConfigurationPage__TitreSiteAssignment_4_1 )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3436:2: rule__ConfigurationPage__TitreSiteAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConfigurationPage__TitreSiteAssignment_4_1_in_rule__ConfigurationPage__Group_4__1__Impl6765);
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3450:1: rule__ConfigurationPage__Group_5__0 : rule__ConfigurationPage__Group_5__0__Impl rule__ConfigurationPage__Group_5__1 ;
    public final void rule__ConfigurationPage__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3454:1: ( rule__ConfigurationPage__Group_5__0__Impl rule__ConfigurationPage__Group_5__1 )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3455:2: rule__ConfigurationPage__Group_5__0__Impl rule__ConfigurationPage__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConfigurationPage__Group_5__0__Impl_in_rule__ConfigurationPage__Group_5__06799);
            rule__ConfigurationPage__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ConfigurationPage__Group_5__1_in_rule__ConfigurationPage__Group_5__06802);
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3462:1: rule__ConfigurationPage__Group_5__0__Impl : ( 'auteurs : ' ) ;
    public final void rule__ConfigurationPage__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3466:1: ( ( 'auteurs : ' ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3467:1: ( 'auteurs : ' )
            {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3467:1: ( 'auteurs : ' )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3468:1: 'auteurs : '
            {
             before(grammarAccess.getConfigurationPageAccess().getAuteursKeyword_5_0()); 
            match(input,40,FollowSets000.FOLLOW_40_in_rule__ConfigurationPage__Group_5__0__Impl6830); 
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3481:1: rule__ConfigurationPage__Group_5__1 : rule__ConfigurationPage__Group_5__1__Impl ;
    public final void rule__ConfigurationPage__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3485:1: ( rule__ConfigurationPage__Group_5__1__Impl )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3486:2: rule__ConfigurationPage__Group_5__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConfigurationPage__Group_5__1__Impl_in_rule__ConfigurationPage__Group_5__16861);
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3492:1: rule__ConfigurationPage__Group_5__1__Impl : ( ( rule__ConfigurationPage__AuteursAssignment_5_1 ) ) ;
    public final void rule__ConfigurationPage__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3496:1: ( ( ( rule__ConfigurationPage__AuteursAssignment_5_1 ) ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3497:1: ( ( rule__ConfigurationPage__AuteursAssignment_5_1 ) )
            {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3497:1: ( ( rule__ConfigurationPage__AuteursAssignment_5_1 ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3498:1: ( rule__ConfigurationPage__AuteursAssignment_5_1 )
            {
             before(grammarAccess.getConfigurationPageAccess().getAuteursAssignment_5_1()); 
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3499:1: ( rule__ConfigurationPage__AuteursAssignment_5_1 )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3499:2: rule__ConfigurationPage__AuteursAssignment_5_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConfigurationPage__AuteursAssignment_5_1_in_rule__ConfigurationPage__Group_5__1__Impl6888);
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3513:1: rule__ConfigurationPage__Group_6__0 : rule__ConfigurationPage__Group_6__0__Impl rule__ConfigurationPage__Group_6__1 ;
    public final void rule__ConfigurationPage__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3517:1: ( rule__ConfigurationPage__Group_6__0__Impl rule__ConfigurationPage__Group_6__1 )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3518:2: rule__ConfigurationPage__Group_6__0__Impl rule__ConfigurationPage__Group_6__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConfigurationPage__Group_6__0__Impl_in_rule__ConfigurationPage__Group_6__06922);
            rule__ConfigurationPage__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ConfigurationPage__Group_6__1_in_rule__ConfigurationPage__Group_6__06925);
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3525:1: rule__ConfigurationPage__Group_6__0__Impl : ( 'couleurPolice : ' ) ;
    public final void rule__ConfigurationPage__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3529:1: ( ( 'couleurPolice : ' ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3530:1: ( 'couleurPolice : ' )
            {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3530:1: ( 'couleurPolice : ' )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3531:1: 'couleurPolice : '
            {
             before(grammarAccess.getConfigurationPageAccess().getCouleurPoliceKeyword_6_0()); 
            match(input,41,FollowSets000.FOLLOW_41_in_rule__ConfigurationPage__Group_6__0__Impl6953); 
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3544:1: rule__ConfigurationPage__Group_6__1 : rule__ConfigurationPage__Group_6__1__Impl ;
    public final void rule__ConfigurationPage__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3548:1: ( rule__ConfigurationPage__Group_6__1__Impl )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3549:2: rule__ConfigurationPage__Group_6__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConfigurationPage__Group_6__1__Impl_in_rule__ConfigurationPage__Group_6__16984);
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3555:1: rule__ConfigurationPage__Group_6__1__Impl : ( ( rule__ConfigurationPage__CouleurPoliceAssignment_6_1 ) ) ;
    public final void rule__ConfigurationPage__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3559:1: ( ( ( rule__ConfigurationPage__CouleurPoliceAssignment_6_1 ) ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3560:1: ( ( rule__ConfigurationPage__CouleurPoliceAssignment_6_1 ) )
            {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3560:1: ( ( rule__ConfigurationPage__CouleurPoliceAssignment_6_1 ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3561:1: ( rule__ConfigurationPage__CouleurPoliceAssignment_6_1 )
            {
             before(grammarAccess.getConfigurationPageAccess().getCouleurPoliceAssignment_6_1()); 
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3562:1: ( rule__ConfigurationPage__CouleurPoliceAssignment_6_1 )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3562:2: rule__ConfigurationPage__CouleurPoliceAssignment_6_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConfigurationPage__CouleurPoliceAssignment_6_1_in_rule__ConfigurationPage__Group_6__1__Impl7011);
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3576:1: rule__ConfigurationPage__Group_7__0 : rule__ConfigurationPage__Group_7__0__Impl rule__ConfigurationPage__Group_7__1 ;
    public final void rule__ConfigurationPage__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3580:1: ( rule__ConfigurationPage__Group_7__0__Impl rule__ConfigurationPage__Group_7__1 )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3581:2: rule__ConfigurationPage__Group_7__0__Impl rule__ConfigurationPage__Group_7__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConfigurationPage__Group_7__0__Impl_in_rule__ConfigurationPage__Group_7__07045);
            rule__ConfigurationPage__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ConfigurationPage__Group_7__1_in_rule__ConfigurationPage__Group_7__07048);
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3588:1: rule__ConfigurationPage__Group_7__0__Impl : ( 'taillePolice : ' ) ;
    public final void rule__ConfigurationPage__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3592:1: ( ( 'taillePolice : ' ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3593:1: ( 'taillePolice : ' )
            {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3593:1: ( 'taillePolice : ' )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3594:1: 'taillePolice : '
            {
             before(grammarAccess.getConfigurationPageAccess().getTaillePoliceKeyword_7_0()); 
            match(input,42,FollowSets000.FOLLOW_42_in_rule__ConfigurationPage__Group_7__0__Impl7076); 
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3607:1: rule__ConfigurationPage__Group_7__1 : rule__ConfigurationPage__Group_7__1__Impl ;
    public final void rule__ConfigurationPage__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3611:1: ( rule__ConfigurationPage__Group_7__1__Impl )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3612:2: rule__ConfigurationPage__Group_7__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConfigurationPage__Group_7__1__Impl_in_rule__ConfigurationPage__Group_7__17107);
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3618:1: rule__ConfigurationPage__Group_7__1__Impl : ( ( rule__ConfigurationPage__TaillePoliceAssignment_7_1 ) ) ;
    public final void rule__ConfigurationPage__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3622:1: ( ( ( rule__ConfigurationPage__TaillePoliceAssignment_7_1 ) ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3623:1: ( ( rule__ConfigurationPage__TaillePoliceAssignment_7_1 ) )
            {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3623:1: ( ( rule__ConfigurationPage__TaillePoliceAssignment_7_1 ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3624:1: ( rule__ConfigurationPage__TaillePoliceAssignment_7_1 )
            {
             before(grammarAccess.getConfigurationPageAccess().getTaillePoliceAssignment_7_1()); 
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3625:1: ( rule__ConfigurationPage__TaillePoliceAssignment_7_1 )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3625:2: rule__ConfigurationPage__TaillePoliceAssignment_7_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConfigurationPage__TaillePoliceAssignment_7_1_in_rule__ConfigurationPage__Group_7__1__Impl7134);
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3639:1: rule__PageInterne__Group__0 : rule__PageInterne__Group__0__Impl rule__PageInterne__Group__1 ;
    public final void rule__PageInterne__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3643:1: ( rule__PageInterne__Group__0__Impl rule__PageInterne__Group__1 )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3644:2: rule__PageInterne__Group__0__Impl rule__PageInterne__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__PageInterne__Group__0__Impl_in_rule__PageInterne__Group__07168);
            rule__PageInterne__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PageInterne__Group__1_in_rule__PageInterne__Group__07171);
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3651:1: rule__PageInterne__Group__0__Impl : ( 'PageInterne' ) ;
    public final void rule__PageInterne__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3655:1: ( ( 'PageInterne' ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3656:1: ( 'PageInterne' )
            {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3656:1: ( 'PageInterne' )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3657:1: 'PageInterne'
            {
             before(grammarAccess.getPageInterneAccess().getPageInterneKeyword_0()); 
            match(input,43,FollowSets000.FOLLOW_43_in_rule__PageInterne__Group__0__Impl7199); 
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3670:1: rule__PageInterne__Group__1 : rule__PageInterne__Group__1__Impl rule__PageInterne__Group__2 ;
    public final void rule__PageInterne__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3674:1: ( rule__PageInterne__Group__1__Impl rule__PageInterne__Group__2 )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3675:2: rule__PageInterne__Group__1__Impl rule__PageInterne__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__PageInterne__Group__1__Impl_in_rule__PageInterne__Group__17230);
            rule__PageInterne__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PageInterne__Group__2_in_rule__PageInterne__Group__17233);
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3682:1: rule__PageInterne__Group__1__Impl : ( '{' ) ;
    public final void rule__PageInterne__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3686:1: ( ( '{' ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3687:1: ( '{' )
            {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3687:1: ( '{' )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3688:1: '{'
            {
             before(grammarAccess.getPageInterneAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__PageInterne__Group__1__Impl7261); 
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3701:1: rule__PageInterne__Group__2 : rule__PageInterne__Group__2__Impl rule__PageInterne__Group__3 ;
    public final void rule__PageInterne__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3705:1: ( rule__PageInterne__Group__2__Impl rule__PageInterne__Group__3 )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3706:2: rule__PageInterne__Group__2__Impl rule__PageInterne__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__PageInterne__Group__2__Impl_in_rule__PageInterne__Group__27292);
            rule__PageInterne__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PageInterne__Group__3_in_rule__PageInterne__Group__27295);
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3713:1: rule__PageInterne__Group__2__Impl : ( ( rule__PageInterne__Group_2__0 )? ) ;
    public final void rule__PageInterne__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3717:1: ( ( ( rule__PageInterne__Group_2__0 )? ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3718:1: ( ( rule__PageInterne__Group_2__0 )? )
            {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3718:1: ( ( rule__PageInterne__Group_2__0 )? )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3719:1: ( rule__PageInterne__Group_2__0 )?
            {
             before(grammarAccess.getPageInterneAccess().getGroup_2()); 
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3720:1: ( rule__PageInterne__Group_2__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==45) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3720:2: rule__PageInterne__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__PageInterne__Group_2__0_in_rule__PageInterne__Group__2__Impl7322);
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3730:1: rule__PageInterne__Group__3 : rule__PageInterne__Group__3__Impl rule__PageInterne__Group__4 ;
    public final void rule__PageInterne__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3734:1: ( rule__PageInterne__Group__3__Impl rule__PageInterne__Group__4 )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3735:2: rule__PageInterne__Group__3__Impl rule__PageInterne__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__PageInterne__Group__3__Impl_in_rule__PageInterne__Group__37353);
            rule__PageInterne__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PageInterne__Group__4_in_rule__PageInterne__Group__37356);
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3742:1: rule__PageInterne__Group__3__Impl : ( ( rule__PageInterne__Group_3__0 )? ) ;
    public final void rule__PageInterne__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3746:1: ( ( ( rule__PageInterne__Group_3__0 )? ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3747:1: ( ( rule__PageInterne__Group_3__0 )? )
            {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3747:1: ( ( rule__PageInterne__Group_3__0 )? )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3748:1: ( rule__PageInterne__Group_3__0 )?
            {
             before(grammarAccess.getPageInterneAccess().getGroup_3()); 
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3749:1: ( rule__PageInterne__Group_3__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==31) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3749:2: rule__PageInterne__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__PageInterne__Group_3__0_in_rule__PageInterne__Group__3__Impl7383);
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3759:1: rule__PageInterne__Group__4 : rule__PageInterne__Group__4__Impl rule__PageInterne__Group__5 ;
    public final void rule__PageInterne__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3763:1: ( rule__PageInterne__Group__4__Impl rule__PageInterne__Group__5 )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3764:2: rule__PageInterne__Group__4__Impl rule__PageInterne__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__PageInterne__Group__4__Impl_in_rule__PageInterne__Group__47414);
            rule__PageInterne__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PageInterne__Group__5_in_rule__PageInterne__Group__47417);
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3771:1: rule__PageInterne__Group__4__Impl : ( ( rule__PageInterne__Group_4__0 )? ) ;
    public final void rule__PageInterne__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3775:1: ( ( ( rule__PageInterne__Group_4__0 )? ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3776:1: ( ( rule__PageInterne__Group_4__0 )? )
            {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3776:1: ( ( rule__PageInterne__Group_4__0 )? )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3777:1: ( rule__PageInterne__Group_4__0 )?
            {
             before(grammarAccess.getPageInterneAccess().getGroup_4()); 
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3778:1: ( rule__PageInterne__Group_4__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==46) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3778:2: rule__PageInterne__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__PageInterne__Group_4__0_in_rule__PageInterne__Group__4__Impl7444);
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3788:1: rule__PageInterne__Group__5 : rule__PageInterne__Group__5__Impl rule__PageInterne__Group__6 ;
    public final void rule__PageInterne__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3792:1: ( rule__PageInterne__Group__5__Impl rule__PageInterne__Group__6 )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3793:2: rule__PageInterne__Group__5__Impl rule__PageInterne__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__PageInterne__Group__5__Impl_in_rule__PageInterne__Group__57475);
            rule__PageInterne__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PageInterne__Group__6_in_rule__PageInterne__Group__57478);
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3800:1: rule__PageInterne__Group__5__Impl : ( ( rule__PageInterne__Group_5__0 )? ) ;
    public final void rule__PageInterne__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3804:1: ( ( ( rule__PageInterne__Group_5__0 )? ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3805:1: ( ( rule__PageInterne__Group_5__0 )? )
            {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3805:1: ( ( rule__PageInterne__Group_5__0 )? )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3806:1: ( rule__PageInterne__Group_5__0 )?
            {
             before(grammarAccess.getPageInterneAccess().getGroup_5()); 
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3807:1: ( rule__PageInterne__Group_5__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==47) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3807:2: rule__PageInterne__Group_5__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__PageInterne__Group_5__0_in_rule__PageInterne__Group__5__Impl7505);
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3817:1: rule__PageInterne__Group__6 : rule__PageInterne__Group__6__Impl rule__PageInterne__Group__7 ;
    public final void rule__PageInterne__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3821:1: ( rule__PageInterne__Group__6__Impl rule__PageInterne__Group__7 )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3822:2: rule__PageInterne__Group__6__Impl rule__PageInterne__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__PageInterne__Group__6__Impl_in_rule__PageInterne__Group__67536);
            rule__PageInterne__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PageInterne__Group__7_in_rule__PageInterne__Group__67539);
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3829:1: rule__PageInterne__Group__6__Impl : ( 'photo : ' ) ;
    public final void rule__PageInterne__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3833:1: ( ( 'photo : ' ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3834:1: ( 'photo : ' )
            {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3834:1: ( 'photo : ' )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3835:1: 'photo : '
            {
             before(grammarAccess.getPageInterneAccess().getPhotoKeyword_6()); 
            match(input,44,FollowSets000.FOLLOW_44_in_rule__PageInterne__Group__6__Impl7567); 
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3848:1: rule__PageInterne__Group__7 : rule__PageInterne__Group__7__Impl rule__PageInterne__Group__8 ;
    public final void rule__PageInterne__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3852:1: ( rule__PageInterne__Group__7__Impl rule__PageInterne__Group__8 )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3853:2: rule__PageInterne__Group__7__Impl rule__PageInterne__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__PageInterne__Group__7__Impl_in_rule__PageInterne__Group__77598);
            rule__PageInterne__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PageInterne__Group__8_in_rule__PageInterne__Group__77601);
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3860:1: rule__PageInterne__Group__7__Impl : ( ( rule__PageInterne__PhotoAssignment_7 ) ) ;
    public final void rule__PageInterne__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3864:1: ( ( ( rule__PageInterne__PhotoAssignment_7 ) ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3865:1: ( ( rule__PageInterne__PhotoAssignment_7 ) )
            {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3865:1: ( ( rule__PageInterne__PhotoAssignment_7 ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3866:1: ( rule__PageInterne__PhotoAssignment_7 )
            {
             before(grammarAccess.getPageInterneAccess().getPhotoAssignment_7()); 
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3867:1: ( rule__PageInterne__PhotoAssignment_7 )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3867:2: rule__PageInterne__PhotoAssignment_7
            {
            pushFollow(FollowSets000.FOLLOW_rule__PageInterne__PhotoAssignment_7_in_rule__PageInterne__Group__7__Impl7628);
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3877:1: rule__PageInterne__Group__8 : rule__PageInterne__Group__8__Impl ;
    public final void rule__PageInterne__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3881:1: ( rule__PageInterne__Group__8__Impl )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3882:2: rule__PageInterne__Group__8__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__PageInterne__Group__8__Impl_in_rule__PageInterne__Group__87658);
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3888:1: rule__PageInterne__Group__8__Impl : ( '}' ) ;
    public final void rule__PageInterne__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3892:1: ( ( '}' ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3893:1: ( '}' )
            {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3893:1: ( '}' )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3894:1: '}'
            {
             before(grammarAccess.getPageInterneAccess().getRightCurlyBracketKeyword_8()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__PageInterne__Group__8__Impl7686); 
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3925:1: rule__PageInterne__Group_2__0 : rule__PageInterne__Group_2__0__Impl rule__PageInterne__Group_2__1 ;
    public final void rule__PageInterne__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3929:1: ( rule__PageInterne__Group_2__0__Impl rule__PageInterne__Group_2__1 )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3930:2: rule__PageInterne__Group_2__0__Impl rule__PageInterne__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__PageInterne__Group_2__0__Impl_in_rule__PageInterne__Group_2__07735);
            rule__PageInterne__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PageInterne__Group_2__1_in_rule__PageInterne__Group_2__07738);
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3937:1: rule__PageInterne__Group_2__0__Impl : ( 'titrePage : ' ) ;
    public final void rule__PageInterne__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3941:1: ( ( 'titrePage : ' ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3942:1: ( 'titrePage : ' )
            {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3942:1: ( 'titrePage : ' )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3943:1: 'titrePage : '
            {
             before(grammarAccess.getPageInterneAccess().getTitrePageKeyword_2_0()); 
            match(input,45,FollowSets000.FOLLOW_45_in_rule__PageInterne__Group_2__0__Impl7766); 
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3956:1: rule__PageInterne__Group_2__1 : rule__PageInterne__Group_2__1__Impl ;
    public final void rule__PageInterne__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3960:1: ( rule__PageInterne__Group_2__1__Impl )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3961:2: rule__PageInterne__Group_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__PageInterne__Group_2__1__Impl_in_rule__PageInterne__Group_2__17797);
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3967:1: rule__PageInterne__Group_2__1__Impl : ( ( rule__PageInterne__TitrePageAssignment_2_1 ) ) ;
    public final void rule__PageInterne__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3971:1: ( ( ( rule__PageInterne__TitrePageAssignment_2_1 ) ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3972:1: ( ( rule__PageInterne__TitrePageAssignment_2_1 ) )
            {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3972:1: ( ( rule__PageInterne__TitrePageAssignment_2_1 ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3973:1: ( rule__PageInterne__TitrePageAssignment_2_1 )
            {
             before(grammarAccess.getPageInterneAccess().getTitrePageAssignment_2_1()); 
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3974:1: ( rule__PageInterne__TitrePageAssignment_2_1 )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3974:2: rule__PageInterne__TitrePageAssignment_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__PageInterne__TitrePageAssignment_2_1_in_rule__PageInterne__Group_2__1__Impl7824);
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3988:1: rule__PageInterne__Group_3__0 : rule__PageInterne__Group_3__0__Impl rule__PageInterne__Group_3__1 ;
    public final void rule__PageInterne__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3992:1: ( rule__PageInterne__Group_3__0__Impl rule__PageInterne__Group_3__1 )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:3993:2: rule__PageInterne__Group_3__0__Impl rule__PageInterne__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__PageInterne__Group_3__0__Impl_in_rule__PageInterne__Group_3__07858);
            rule__PageInterne__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PageInterne__Group_3__1_in_rule__PageInterne__Group_3__07861);
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4000:1: rule__PageInterne__Group_3__0__Impl : ( 'texte : ' ) ;
    public final void rule__PageInterne__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4004:1: ( ( 'texte : ' ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4005:1: ( 'texte : ' )
            {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4005:1: ( 'texte : ' )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4006:1: 'texte : '
            {
             before(grammarAccess.getPageInterneAccess().getTexteKeyword_3_0()); 
            match(input,31,FollowSets000.FOLLOW_31_in_rule__PageInterne__Group_3__0__Impl7889); 
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4019:1: rule__PageInterne__Group_3__1 : rule__PageInterne__Group_3__1__Impl ;
    public final void rule__PageInterne__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4023:1: ( rule__PageInterne__Group_3__1__Impl )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4024:2: rule__PageInterne__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__PageInterne__Group_3__1__Impl_in_rule__PageInterne__Group_3__17920);
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4030:1: rule__PageInterne__Group_3__1__Impl : ( ( rule__PageInterne__TexteAssignment_3_1 ) ) ;
    public final void rule__PageInterne__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4034:1: ( ( ( rule__PageInterne__TexteAssignment_3_1 ) ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4035:1: ( ( rule__PageInterne__TexteAssignment_3_1 ) )
            {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4035:1: ( ( rule__PageInterne__TexteAssignment_3_1 ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4036:1: ( rule__PageInterne__TexteAssignment_3_1 )
            {
             before(grammarAccess.getPageInterneAccess().getTexteAssignment_3_1()); 
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4037:1: ( rule__PageInterne__TexteAssignment_3_1 )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4037:2: rule__PageInterne__TexteAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__PageInterne__TexteAssignment_3_1_in_rule__PageInterne__Group_3__1__Impl7947);
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4051:1: rule__PageInterne__Group_4__0 : rule__PageInterne__Group_4__0__Impl rule__PageInterne__Group_4__1 ;
    public final void rule__PageInterne__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4055:1: ( rule__PageInterne__Group_4__0__Impl rule__PageInterne__Group_4__1 )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4056:2: rule__PageInterne__Group_4__0__Impl rule__PageInterne__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__PageInterne__Group_4__0__Impl_in_rule__PageInterne__Group_4__07981);
            rule__PageInterne__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PageInterne__Group_4__1_in_rule__PageInterne__Group_4__07984);
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4063:1: rule__PageInterne__Group_4__0__Impl : ( 'types : ' ) ;
    public final void rule__PageInterne__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4067:1: ( ( 'types : ' ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4068:1: ( 'types : ' )
            {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4068:1: ( 'types : ' )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4069:1: 'types : '
            {
             before(grammarAccess.getPageInterneAccess().getTypesKeyword_4_0()); 
            match(input,46,FollowSets000.FOLLOW_46_in_rule__PageInterne__Group_4__0__Impl8012); 
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4082:1: rule__PageInterne__Group_4__1 : rule__PageInterne__Group_4__1__Impl ;
    public final void rule__PageInterne__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4086:1: ( rule__PageInterne__Group_4__1__Impl )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4087:2: rule__PageInterne__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__PageInterne__Group_4__1__Impl_in_rule__PageInterne__Group_4__18043);
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4093:1: rule__PageInterne__Group_4__1__Impl : ( ( rule__PageInterne__TypesAssignment_4_1 ) ) ;
    public final void rule__PageInterne__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4097:1: ( ( ( rule__PageInterne__TypesAssignment_4_1 ) ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4098:1: ( ( rule__PageInterne__TypesAssignment_4_1 ) )
            {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4098:1: ( ( rule__PageInterne__TypesAssignment_4_1 ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4099:1: ( rule__PageInterne__TypesAssignment_4_1 )
            {
             before(grammarAccess.getPageInterneAccess().getTypesAssignment_4_1()); 
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4100:1: ( rule__PageInterne__TypesAssignment_4_1 )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4100:2: rule__PageInterne__TypesAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__PageInterne__TypesAssignment_4_1_in_rule__PageInterne__Group_4__1__Impl8070);
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4114:1: rule__PageInterne__Group_5__0 : rule__PageInterne__Group_5__0__Impl rule__PageInterne__Group_5__1 ;
    public final void rule__PageInterne__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4118:1: ( rule__PageInterne__Group_5__0__Impl rule__PageInterne__Group_5__1 )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4119:2: rule__PageInterne__Group_5__0__Impl rule__PageInterne__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__PageInterne__Group_5__0__Impl_in_rule__PageInterne__Group_5__08104);
            rule__PageInterne__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PageInterne__Group_5__1_in_rule__PageInterne__Group_5__08107);
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4126:1: rule__PageInterne__Group_5__0__Impl : ( 'liens : ' ) ;
    public final void rule__PageInterne__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4130:1: ( ( 'liens : ' ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4131:1: ( 'liens : ' )
            {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4131:1: ( 'liens : ' )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4132:1: 'liens : '
            {
             before(grammarAccess.getPageInterneAccess().getLiensKeyword_5_0()); 
            match(input,47,FollowSets000.FOLLOW_47_in_rule__PageInterne__Group_5__0__Impl8135); 
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4145:1: rule__PageInterne__Group_5__1 : rule__PageInterne__Group_5__1__Impl ;
    public final void rule__PageInterne__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4149:1: ( rule__PageInterne__Group_5__1__Impl )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4150:2: rule__PageInterne__Group_5__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__PageInterne__Group_5__1__Impl_in_rule__PageInterne__Group_5__18166);
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4156:1: rule__PageInterne__Group_5__1__Impl : ( ( rule__PageInterne__LiensAssignment_5_1 ) ) ;
    public final void rule__PageInterne__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4160:1: ( ( ( rule__PageInterne__LiensAssignment_5_1 ) ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4161:1: ( ( rule__PageInterne__LiensAssignment_5_1 ) )
            {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4161:1: ( ( rule__PageInterne__LiensAssignment_5_1 ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4162:1: ( rule__PageInterne__LiensAssignment_5_1 )
            {
             before(grammarAccess.getPageInterneAccess().getLiensAssignment_5_1()); 
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4163:1: ( rule__PageInterne__LiensAssignment_5_1 )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4163:2: rule__PageInterne__LiensAssignment_5_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__PageInterne__LiensAssignment_5_1_in_rule__PageInterne__Group_5__1__Impl8193);
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4177:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4181:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4182:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__0__Impl_in_rule__EInt__Group__08227);
            rule__EInt__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__1_in_rule__EInt__Group__08230);
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4189:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4193:1: ( ( ( '-' )? ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4194:1: ( ( '-' )? )
            {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4194:1: ( ( '-' )? )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4195:1: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4196:1: ( '-' )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==48) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4197:2: '-'
                    {
                    match(input,48,FollowSets000.FOLLOW_48_in_rule__EInt__Group__0__Impl8259); 

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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4208:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4212:1: ( rule__EInt__Group__1__Impl )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4213:2: rule__EInt__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__1__Impl_in_rule__EInt__Group__18292);
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4219:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4223:1: ( ( RULE_INT ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4224:1: ( RULE_INT )
            {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4224:1: ( RULE_INT )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4225:1: RULE_INT
            {
             before(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__EInt__Group__1__Impl8319); 
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4240:1: rule__Types__Group__0 : rule__Types__Group__0__Impl rule__Types__Group__1 ;
    public final void rule__Types__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4244:1: ( rule__Types__Group__0__Impl rule__Types__Group__1 )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4245:2: rule__Types__Group__0__Impl rule__Types__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Types__Group__0__Impl_in_rule__Types__Group__08352);
            rule__Types__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Types__Group__1_in_rule__Types__Group__08355);
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4252:1: rule__Types__Group__0__Impl : ( () ) ;
    public final void rule__Types__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4256:1: ( ( () ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4257:1: ( () )
            {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4257:1: ( () )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4258:1: ()
            {
             before(grammarAccess.getTypesAccess().getTypesAction_0()); 
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4259:1: ()
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4261:1: 
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4271:1: rule__Types__Group__1 : rule__Types__Group__1__Impl rule__Types__Group__2 ;
    public final void rule__Types__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4275:1: ( rule__Types__Group__1__Impl rule__Types__Group__2 )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4276:2: rule__Types__Group__1__Impl rule__Types__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Types__Group__1__Impl_in_rule__Types__Group__18413);
            rule__Types__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Types__Group__2_in_rule__Types__Group__18416);
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4283:1: rule__Types__Group__1__Impl : ( ( rule__Types__GrasAssignment_1 )? ) ;
    public final void rule__Types__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4287:1: ( ( ( rule__Types__GrasAssignment_1 )? ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4288:1: ( ( rule__Types__GrasAssignment_1 )? )
            {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4288:1: ( ( rule__Types__GrasAssignment_1 )? )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4289:1: ( rule__Types__GrasAssignment_1 )?
            {
             before(grammarAccess.getTypesAccess().getGrasAssignment_1()); 
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4290:1: ( rule__Types__GrasAssignment_1 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==56) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4290:2: rule__Types__GrasAssignment_1
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Types__GrasAssignment_1_in_rule__Types__Group__1__Impl8443);
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4300:1: rule__Types__Group__2 : rule__Types__Group__2__Impl rule__Types__Group__3 ;
    public final void rule__Types__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4304:1: ( rule__Types__Group__2__Impl rule__Types__Group__3 )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4305:2: rule__Types__Group__2__Impl rule__Types__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Types__Group__2__Impl_in_rule__Types__Group__28474);
            rule__Types__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Types__Group__3_in_rule__Types__Group__28477);
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4312:1: rule__Types__Group__2__Impl : ( ( rule__Types__ItaliqueAssignment_2 )? ) ;
    public final void rule__Types__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4316:1: ( ( ( rule__Types__ItaliqueAssignment_2 )? ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4317:1: ( ( rule__Types__ItaliqueAssignment_2 )? )
            {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4317:1: ( ( rule__Types__ItaliqueAssignment_2 )? )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4318:1: ( rule__Types__ItaliqueAssignment_2 )?
            {
             before(grammarAccess.getTypesAccess().getItaliqueAssignment_2()); 
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4319:1: ( rule__Types__ItaliqueAssignment_2 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==57) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4319:2: rule__Types__ItaliqueAssignment_2
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Types__ItaliqueAssignment_2_in_rule__Types__Group__2__Impl8504);
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4329:1: rule__Types__Group__3 : rule__Types__Group__3__Impl ;
    public final void rule__Types__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4333:1: ( rule__Types__Group__3__Impl )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4334:2: rule__Types__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Types__Group__3__Impl_in_rule__Types__Group__38535);
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4340:1: rule__Types__Group__3__Impl : ( 'Types' ) ;
    public final void rule__Types__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4344:1: ( ( 'Types' ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4345:1: ( 'Types' )
            {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4345:1: ( 'Types' )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4346:1: 'Types'
            {
             before(grammarAccess.getTypesAccess().getTypesKeyword_3()); 
            match(input,49,FollowSets000.FOLLOW_49_in_rule__Types__Group__3__Impl8563); 
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4367:1: rule__Liens__Group__0 : rule__Liens__Group__0__Impl rule__Liens__Group__1 ;
    public final void rule__Liens__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4371:1: ( rule__Liens__Group__0__Impl rule__Liens__Group__1 )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4372:2: rule__Liens__Group__0__Impl rule__Liens__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Liens__Group__0__Impl_in_rule__Liens__Group__08602);
            rule__Liens__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Liens__Group__1_in_rule__Liens__Group__08605);
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4379:1: rule__Liens__Group__0__Impl : ( () ) ;
    public final void rule__Liens__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4383:1: ( ( () ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4384:1: ( () )
            {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4384:1: ( () )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4385:1: ()
            {
             before(grammarAccess.getLiensAccess().getLiensAction_0()); 
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4386:1: ()
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4388:1: 
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4398:1: rule__Liens__Group__1 : rule__Liens__Group__1__Impl rule__Liens__Group__2 ;
    public final void rule__Liens__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4402:1: ( rule__Liens__Group__1__Impl rule__Liens__Group__2 )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4403:2: rule__Liens__Group__1__Impl rule__Liens__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Liens__Group__1__Impl_in_rule__Liens__Group__18663);
            rule__Liens__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Liens__Group__2_in_rule__Liens__Group__18666);
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4410:1: rule__Liens__Group__1__Impl : ( 'Liens' ) ;
    public final void rule__Liens__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4414:1: ( ( 'Liens' ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4415:1: ( 'Liens' )
            {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4415:1: ( 'Liens' )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4416:1: 'Liens'
            {
             before(grammarAccess.getLiensAccess().getLiensKeyword_1()); 
            match(input,50,FollowSets000.FOLLOW_50_in_rule__Liens__Group__1__Impl8694); 
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4429:1: rule__Liens__Group__2 : rule__Liens__Group__2__Impl rule__Liens__Group__3 ;
    public final void rule__Liens__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4433:1: ( rule__Liens__Group__2__Impl rule__Liens__Group__3 )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4434:2: rule__Liens__Group__2__Impl rule__Liens__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Liens__Group__2__Impl_in_rule__Liens__Group__28725);
            rule__Liens__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Liens__Group__3_in_rule__Liens__Group__28728);
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4441:1: rule__Liens__Group__2__Impl : ( '{' ) ;
    public final void rule__Liens__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4445:1: ( ( '{' ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4446:1: ( '{' )
            {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4446:1: ( '{' )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4447:1: '{'
            {
             before(grammarAccess.getLiensAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Liens__Group__2__Impl8756); 
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4460:1: rule__Liens__Group__3 : rule__Liens__Group__3__Impl rule__Liens__Group__4 ;
    public final void rule__Liens__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4464:1: ( rule__Liens__Group__3__Impl rule__Liens__Group__4 )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4465:2: rule__Liens__Group__3__Impl rule__Liens__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Liens__Group__3__Impl_in_rule__Liens__Group__38787);
            rule__Liens__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Liens__Group__4_in_rule__Liens__Group__38790);
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4472:1: rule__Liens__Group__3__Impl : ( ( rule__Liens__Group_3__0 )? ) ;
    public final void rule__Liens__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4476:1: ( ( ( rule__Liens__Group_3__0 )? ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4477:1: ( ( rule__Liens__Group_3__0 )? )
            {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4477:1: ( ( rule__Liens__Group_3__0 )? )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4478:1: ( rule__Liens__Group_3__0 )?
            {
             before(grammarAccess.getLiensAccess().getGroup_3()); 
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4479:1: ( rule__Liens__Group_3__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==51) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4479:2: rule__Liens__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Liens__Group_3__0_in_rule__Liens__Group__3__Impl8817);
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4489:1: rule__Liens__Group__4 : rule__Liens__Group__4__Impl rule__Liens__Group__5 ;
    public final void rule__Liens__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4493:1: ( rule__Liens__Group__4__Impl rule__Liens__Group__5 )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4494:2: rule__Liens__Group__4__Impl rule__Liens__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Liens__Group__4__Impl_in_rule__Liens__Group__48848);
            rule__Liens__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Liens__Group__5_in_rule__Liens__Group__48851);
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4501:1: rule__Liens__Group__4__Impl : ( ( rule__Liens__Group_4__0 )? ) ;
    public final void rule__Liens__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4505:1: ( ( ( rule__Liens__Group_4__0 )? ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4506:1: ( ( rule__Liens__Group_4__0 )? )
            {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4506:1: ( ( rule__Liens__Group_4__0 )? )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4507:1: ( rule__Liens__Group_4__0 )?
            {
             before(grammarAccess.getLiensAccess().getGroup_4()); 
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4508:1: ( rule__Liens__Group_4__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==52) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4508:2: rule__Liens__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Liens__Group_4__0_in_rule__Liens__Group__4__Impl8878);
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4518:1: rule__Liens__Group__5 : rule__Liens__Group__5__Impl rule__Liens__Group__6 ;
    public final void rule__Liens__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4522:1: ( rule__Liens__Group__5__Impl rule__Liens__Group__6 )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4523:2: rule__Liens__Group__5__Impl rule__Liens__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Liens__Group__5__Impl_in_rule__Liens__Group__58909);
            rule__Liens__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Liens__Group__6_in_rule__Liens__Group__58912);
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4530:1: rule__Liens__Group__5__Impl : ( ( rule__Liens__Group_5__0 )? ) ;
    public final void rule__Liens__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4534:1: ( ( ( rule__Liens__Group_5__0 )? ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4535:1: ( ( rule__Liens__Group_5__0 )? )
            {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4535:1: ( ( rule__Liens__Group_5__0 )? )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4536:1: ( rule__Liens__Group_5__0 )?
            {
             before(grammarAccess.getLiensAccess().getGroup_5()); 
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4537:1: ( rule__Liens__Group_5__0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==53) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4537:2: rule__Liens__Group_5__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Liens__Group_5__0_in_rule__Liens__Group__5__Impl8939);
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4547:1: rule__Liens__Group__6 : rule__Liens__Group__6__Impl ;
    public final void rule__Liens__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4551:1: ( rule__Liens__Group__6__Impl )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4552:2: rule__Liens__Group__6__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Liens__Group__6__Impl_in_rule__Liens__Group__68970);
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4558:1: rule__Liens__Group__6__Impl : ( '}' ) ;
    public final void rule__Liens__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4562:1: ( ( '}' ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4563:1: ( '}' )
            {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4563:1: ( '}' )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4564:1: '}'
            {
             before(grammarAccess.getLiensAccess().getRightCurlyBracketKeyword_6()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__Liens__Group__6__Impl8998); 
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4591:1: rule__Liens__Group_3__0 : rule__Liens__Group_3__0__Impl rule__Liens__Group_3__1 ;
    public final void rule__Liens__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4595:1: ( rule__Liens__Group_3__0__Impl rule__Liens__Group_3__1 )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4596:2: rule__Liens__Group_3__0__Impl rule__Liens__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Liens__Group_3__0__Impl_in_rule__Liens__Group_3__09043);
            rule__Liens__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Liens__Group_3__1_in_rule__Liens__Group_3__09046);
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4603:1: rule__Liens__Group_3__0__Impl : ( 'fichier : ' ) ;
    public final void rule__Liens__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4607:1: ( ( 'fichier : ' ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4608:1: ( 'fichier : ' )
            {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4608:1: ( 'fichier : ' )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4609:1: 'fichier : '
            {
             before(grammarAccess.getLiensAccess().getFichierKeyword_3_0()); 
            match(input,51,FollowSets000.FOLLOW_51_in_rule__Liens__Group_3__0__Impl9074); 
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4622:1: rule__Liens__Group_3__1 : rule__Liens__Group_3__1__Impl ;
    public final void rule__Liens__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4626:1: ( rule__Liens__Group_3__1__Impl )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4627:2: rule__Liens__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Liens__Group_3__1__Impl_in_rule__Liens__Group_3__19105);
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4633:1: rule__Liens__Group_3__1__Impl : ( ( rule__Liens__FichierAssignment_3_1 ) ) ;
    public final void rule__Liens__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4637:1: ( ( ( rule__Liens__FichierAssignment_3_1 ) ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4638:1: ( ( rule__Liens__FichierAssignment_3_1 ) )
            {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4638:1: ( ( rule__Liens__FichierAssignment_3_1 ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4639:1: ( rule__Liens__FichierAssignment_3_1 )
            {
             before(grammarAccess.getLiensAccess().getFichierAssignment_3_1()); 
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4640:1: ( rule__Liens__FichierAssignment_3_1 )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4640:2: rule__Liens__FichierAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Liens__FichierAssignment_3_1_in_rule__Liens__Group_3__1__Impl9132);
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4654:1: rule__Liens__Group_4__0 : rule__Liens__Group_4__0__Impl rule__Liens__Group_4__1 ;
    public final void rule__Liens__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4658:1: ( rule__Liens__Group_4__0__Impl rule__Liens__Group_4__1 )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4659:2: rule__Liens__Group_4__0__Impl rule__Liens__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Liens__Group_4__0__Impl_in_rule__Liens__Group_4__09166);
            rule__Liens__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Liens__Group_4__1_in_rule__Liens__Group_4__09169);
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4666:1: rule__Liens__Group_4__0__Impl : ( 'adresseWeb : ' ) ;
    public final void rule__Liens__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4670:1: ( ( 'adresseWeb : ' ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4671:1: ( 'adresseWeb : ' )
            {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4671:1: ( 'adresseWeb : ' )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4672:1: 'adresseWeb : '
            {
             before(grammarAccess.getLiensAccess().getAdresseWebKeyword_4_0()); 
            match(input,52,FollowSets000.FOLLOW_52_in_rule__Liens__Group_4__0__Impl9197); 
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4685:1: rule__Liens__Group_4__1 : rule__Liens__Group_4__1__Impl ;
    public final void rule__Liens__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4689:1: ( rule__Liens__Group_4__1__Impl )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4690:2: rule__Liens__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Liens__Group_4__1__Impl_in_rule__Liens__Group_4__19228);
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4696:1: rule__Liens__Group_4__1__Impl : ( ( rule__Liens__AdresseWebAssignment_4_1 ) ) ;
    public final void rule__Liens__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4700:1: ( ( ( rule__Liens__AdresseWebAssignment_4_1 ) ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4701:1: ( ( rule__Liens__AdresseWebAssignment_4_1 ) )
            {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4701:1: ( ( rule__Liens__AdresseWebAssignment_4_1 ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4702:1: ( rule__Liens__AdresseWebAssignment_4_1 )
            {
             before(grammarAccess.getLiensAccess().getAdresseWebAssignment_4_1()); 
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4703:1: ( rule__Liens__AdresseWebAssignment_4_1 )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4703:2: rule__Liens__AdresseWebAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Liens__AdresseWebAssignment_4_1_in_rule__Liens__Group_4__1__Impl9255);
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4717:1: rule__Liens__Group_5__0 : rule__Liens__Group_5__0__Impl rule__Liens__Group_5__1 ;
    public final void rule__Liens__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4721:1: ( rule__Liens__Group_5__0__Impl rule__Liens__Group_5__1 )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4722:2: rule__Liens__Group_5__0__Impl rule__Liens__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Liens__Group_5__0__Impl_in_rule__Liens__Group_5__09289);
            rule__Liens__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Liens__Group_5__1_in_rule__Liens__Group_5__09292);
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4729:1: rule__Liens__Group_5__0__Impl : ( 'pageInterne : ' ) ;
    public final void rule__Liens__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4733:1: ( ( 'pageInterne : ' ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4734:1: ( 'pageInterne : ' )
            {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4734:1: ( 'pageInterne : ' )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4735:1: 'pageInterne : '
            {
             before(grammarAccess.getLiensAccess().getPageInterneKeyword_5_0()); 
            match(input,53,FollowSets000.FOLLOW_53_in_rule__Liens__Group_5__0__Impl9320); 
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4748:1: rule__Liens__Group_5__1 : rule__Liens__Group_5__1__Impl ;
    public final void rule__Liens__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4752:1: ( rule__Liens__Group_5__1__Impl )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4753:2: rule__Liens__Group_5__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Liens__Group_5__1__Impl_in_rule__Liens__Group_5__19351);
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4759:1: rule__Liens__Group_5__1__Impl : ( ( rule__Liens__PageInterneAssignment_5_1 ) ) ;
    public final void rule__Liens__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4763:1: ( ( ( rule__Liens__PageInterneAssignment_5_1 ) ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4764:1: ( ( rule__Liens__PageInterneAssignment_5_1 ) )
            {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4764:1: ( ( rule__Liens__PageInterneAssignment_5_1 ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4765:1: ( rule__Liens__PageInterneAssignment_5_1 )
            {
             before(grammarAccess.getLiensAccess().getPageInterneAssignment_5_1()); 
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4766:1: ( rule__Liens__PageInterneAssignment_5_1 )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4766:2: rule__Liens__PageInterneAssignment_5_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Liens__PageInterneAssignment_5_1_in_rule__Liens__Group_5__1__Impl9378);
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4780:1: rule__Photo__Group__0 : rule__Photo__Group__0__Impl rule__Photo__Group__1 ;
    public final void rule__Photo__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4784:1: ( rule__Photo__Group__0__Impl rule__Photo__Group__1 )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4785:2: rule__Photo__Group__0__Impl rule__Photo__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Photo__Group__0__Impl_in_rule__Photo__Group__09412);
            rule__Photo__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Photo__Group__1_in_rule__Photo__Group__09415);
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4792:1: rule__Photo__Group__0__Impl : ( () ) ;
    public final void rule__Photo__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4796:1: ( ( () ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4797:1: ( () )
            {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4797:1: ( () )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4798:1: ()
            {
             before(grammarAccess.getPhotoAccess().getPhotoAction_0()); 
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4799:1: ()
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4801:1: 
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4811:1: rule__Photo__Group__1 : rule__Photo__Group__1__Impl rule__Photo__Group__2 ;
    public final void rule__Photo__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4815:1: ( rule__Photo__Group__1__Impl rule__Photo__Group__2 )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4816:2: rule__Photo__Group__1__Impl rule__Photo__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Photo__Group__1__Impl_in_rule__Photo__Group__19473);
            rule__Photo__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Photo__Group__2_in_rule__Photo__Group__19476);
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4823:1: rule__Photo__Group__1__Impl : ( 'Photo' ) ;
    public final void rule__Photo__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4827:1: ( ( 'Photo' ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4828:1: ( 'Photo' )
            {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4828:1: ( 'Photo' )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4829:1: 'Photo'
            {
             before(grammarAccess.getPhotoAccess().getPhotoKeyword_1()); 
            match(input,54,FollowSets000.FOLLOW_54_in_rule__Photo__Group__1__Impl9504); 
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4842:1: rule__Photo__Group__2 : rule__Photo__Group__2__Impl rule__Photo__Group__3 ;
    public final void rule__Photo__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4846:1: ( rule__Photo__Group__2__Impl rule__Photo__Group__3 )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4847:2: rule__Photo__Group__2__Impl rule__Photo__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Photo__Group__2__Impl_in_rule__Photo__Group__29535);
            rule__Photo__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Photo__Group__3_in_rule__Photo__Group__29538);
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4854:1: rule__Photo__Group__2__Impl : ( '{' ) ;
    public final void rule__Photo__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4858:1: ( ( '{' ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4859:1: ( '{' )
            {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4859:1: ( '{' )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4860:1: '{'
            {
             before(grammarAccess.getPhotoAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Photo__Group__2__Impl9566); 
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4873:1: rule__Photo__Group__3 : rule__Photo__Group__3__Impl rule__Photo__Group__4 ;
    public final void rule__Photo__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4877:1: ( rule__Photo__Group__3__Impl rule__Photo__Group__4 )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4878:2: rule__Photo__Group__3__Impl rule__Photo__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Photo__Group__3__Impl_in_rule__Photo__Group__39597);
            rule__Photo__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Photo__Group__4_in_rule__Photo__Group__39600);
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4885:1: rule__Photo__Group__3__Impl : ( ( rule__Photo__Group_3__0 )? ) ;
    public final void rule__Photo__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4889:1: ( ( ( rule__Photo__Group_3__0 )? ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4890:1: ( ( rule__Photo__Group_3__0 )? )
            {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4890:1: ( ( rule__Photo__Group_3__0 )? )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4891:1: ( rule__Photo__Group_3__0 )?
            {
             before(grammarAccess.getPhotoAccess().getGroup_3()); 
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4892:1: ( rule__Photo__Group_3__0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==35) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4892:2: rule__Photo__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Photo__Group_3__0_in_rule__Photo__Group__3__Impl9627);
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4902:1: rule__Photo__Group__4 : rule__Photo__Group__4__Impl rule__Photo__Group__5 ;
    public final void rule__Photo__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4906:1: ( rule__Photo__Group__4__Impl rule__Photo__Group__5 )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4907:2: rule__Photo__Group__4__Impl rule__Photo__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Photo__Group__4__Impl_in_rule__Photo__Group__49658);
            rule__Photo__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Photo__Group__5_in_rule__Photo__Group__49661);
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4914:1: rule__Photo__Group__4__Impl : ( ( rule__Photo__Group_4__0 )? ) ;
    public final void rule__Photo__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4918:1: ( ( ( rule__Photo__Group_4__0 )? ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4919:1: ( ( rule__Photo__Group_4__0 )? )
            {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4919:1: ( ( rule__Photo__Group_4__0 )? )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4920:1: ( rule__Photo__Group_4__0 )?
            {
             before(grammarAccess.getPhotoAccess().getGroup_4()); 
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4921:1: ( rule__Photo__Group_4__0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==55) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4921:2: rule__Photo__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Photo__Group_4__0_in_rule__Photo__Group__4__Impl9688);
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4931:1: rule__Photo__Group__5 : rule__Photo__Group__5__Impl rule__Photo__Group__6 ;
    public final void rule__Photo__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4935:1: ( rule__Photo__Group__5__Impl rule__Photo__Group__6 )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4936:2: rule__Photo__Group__5__Impl rule__Photo__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Photo__Group__5__Impl_in_rule__Photo__Group__59719);
            rule__Photo__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Photo__Group__6_in_rule__Photo__Group__59722);
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4943:1: rule__Photo__Group__5__Impl : ( ( rule__Photo__Group_5__0 )? ) ;
    public final void rule__Photo__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4947:1: ( ( ( rule__Photo__Group_5__0 )? ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4948:1: ( ( rule__Photo__Group_5__0 )? )
            {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4948:1: ( ( rule__Photo__Group_5__0 )? )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4949:1: ( rule__Photo__Group_5__0 )?
            {
             before(grammarAccess.getPhotoAccess().getGroup_5()); 
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4950:1: ( rule__Photo__Group_5__0 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==23) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4950:2: rule__Photo__Group_5__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Photo__Group_5__0_in_rule__Photo__Group__5__Impl9749);
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4960:1: rule__Photo__Group__6 : rule__Photo__Group__6__Impl ;
    public final void rule__Photo__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4964:1: ( rule__Photo__Group__6__Impl )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4965:2: rule__Photo__Group__6__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Photo__Group__6__Impl_in_rule__Photo__Group__69780);
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4971:1: rule__Photo__Group__6__Impl : ( '}' ) ;
    public final void rule__Photo__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4975:1: ( ( '}' ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4976:1: ( '}' )
            {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4976:1: ( '}' )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:4977:1: '}'
            {
             before(grammarAccess.getPhotoAccess().getRightCurlyBracketKeyword_6()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__Photo__Group__6__Impl9808); 
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5004:1: rule__Photo__Group_3__0 : rule__Photo__Group_3__0__Impl rule__Photo__Group_3__1 ;
    public final void rule__Photo__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5008:1: ( rule__Photo__Group_3__0__Impl rule__Photo__Group_3__1 )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5009:2: rule__Photo__Group_3__0__Impl rule__Photo__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Photo__Group_3__0__Impl_in_rule__Photo__Group_3__09853);
            rule__Photo__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Photo__Group_3__1_in_rule__Photo__Group_3__09856);
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5016:1: rule__Photo__Group_3__0__Impl : ( 'taille : ' ) ;
    public final void rule__Photo__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5020:1: ( ( 'taille : ' ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5021:1: ( 'taille : ' )
            {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5021:1: ( 'taille : ' )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5022:1: 'taille : '
            {
             before(grammarAccess.getPhotoAccess().getTailleKeyword_3_0()); 
            match(input,35,FollowSets000.FOLLOW_35_in_rule__Photo__Group_3__0__Impl9884); 
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5035:1: rule__Photo__Group_3__1 : rule__Photo__Group_3__1__Impl ;
    public final void rule__Photo__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5039:1: ( rule__Photo__Group_3__1__Impl )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5040:2: rule__Photo__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Photo__Group_3__1__Impl_in_rule__Photo__Group_3__19915);
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5046:1: rule__Photo__Group_3__1__Impl : ( ( rule__Photo__TailleAssignment_3_1 ) ) ;
    public final void rule__Photo__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5050:1: ( ( ( rule__Photo__TailleAssignment_3_1 ) ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5051:1: ( ( rule__Photo__TailleAssignment_3_1 ) )
            {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5051:1: ( ( rule__Photo__TailleAssignment_3_1 ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5052:1: ( rule__Photo__TailleAssignment_3_1 )
            {
             before(grammarAccess.getPhotoAccess().getTailleAssignment_3_1()); 
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5053:1: ( rule__Photo__TailleAssignment_3_1 )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5053:2: rule__Photo__TailleAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Photo__TailleAssignment_3_1_in_rule__Photo__Group_3__1__Impl9942);
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5067:1: rule__Photo__Group_4__0 : rule__Photo__Group_4__0__Impl rule__Photo__Group_4__1 ;
    public final void rule__Photo__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5071:1: ( rule__Photo__Group_4__0__Impl rule__Photo__Group_4__1 )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5072:2: rule__Photo__Group_4__0__Impl rule__Photo__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Photo__Group_4__0__Impl_in_rule__Photo__Group_4__09976);
            rule__Photo__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Photo__Group_4__1_in_rule__Photo__Group_4__09979);
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5079:1: rule__Photo__Group_4__0__Impl : ( 'extension : ' ) ;
    public final void rule__Photo__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5083:1: ( ( 'extension : ' ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5084:1: ( 'extension : ' )
            {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5084:1: ( 'extension : ' )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5085:1: 'extension : '
            {
             before(grammarAccess.getPhotoAccess().getExtensionKeyword_4_0()); 
            match(input,55,FollowSets000.FOLLOW_55_in_rule__Photo__Group_4__0__Impl10007); 
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5098:1: rule__Photo__Group_4__1 : rule__Photo__Group_4__1__Impl ;
    public final void rule__Photo__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5102:1: ( rule__Photo__Group_4__1__Impl )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5103:2: rule__Photo__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Photo__Group_4__1__Impl_in_rule__Photo__Group_4__110038);
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5109:1: rule__Photo__Group_4__1__Impl : ( ( rule__Photo__ExtensionAssignment_4_1 ) ) ;
    public final void rule__Photo__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5113:1: ( ( ( rule__Photo__ExtensionAssignment_4_1 ) ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5114:1: ( ( rule__Photo__ExtensionAssignment_4_1 ) )
            {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5114:1: ( ( rule__Photo__ExtensionAssignment_4_1 ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5115:1: ( rule__Photo__ExtensionAssignment_4_1 )
            {
             before(grammarAccess.getPhotoAccess().getExtensionAssignment_4_1()); 
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5116:1: ( rule__Photo__ExtensionAssignment_4_1 )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5116:2: rule__Photo__ExtensionAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Photo__ExtensionAssignment_4_1_in_rule__Photo__Group_4__1__Impl10065);
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5130:1: rule__Photo__Group_5__0 : rule__Photo__Group_5__0__Impl rule__Photo__Group_5__1 ;
    public final void rule__Photo__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5134:1: ( rule__Photo__Group_5__0__Impl rule__Photo__Group_5__1 )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5135:2: rule__Photo__Group_5__0__Impl rule__Photo__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Photo__Group_5__0__Impl_in_rule__Photo__Group_5__010099);
            rule__Photo__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Photo__Group_5__1_in_rule__Photo__Group_5__010102);
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5142:1: rule__Photo__Group_5__0__Impl : ( 'nom : ' ) ;
    public final void rule__Photo__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5146:1: ( ( 'nom : ' ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5147:1: ( 'nom : ' )
            {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5147:1: ( 'nom : ' )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5148:1: 'nom : '
            {
             before(grammarAccess.getPhotoAccess().getNomKeyword_5_0()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__Photo__Group_5__0__Impl10130); 
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5161:1: rule__Photo__Group_5__1 : rule__Photo__Group_5__1__Impl ;
    public final void rule__Photo__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5165:1: ( rule__Photo__Group_5__1__Impl )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5166:2: rule__Photo__Group_5__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Photo__Group_5__1__Impl_in_rule__Photo__Group_5__110161);
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5172:1: rule__Photo__Group_5__1__Impl : ( ( rule__Photo__NomAssignment_5_1 ) ) ;
    public final void rule__Photo__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5176:1: ( ( ( rule__Photo__NomAssignment_5_1 ) ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5177:1: ( ( rule__Photo__NomAssignment_5_1 ) )
            {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5177:1: ( ( rule__Photo__NomAssignment_5_1 ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5178:1: ( rule__Photo__NomAssignment_5_1 )
            {
             before(grammarAccess.getPhotoAccess().getNomAssignment_5_1()); 
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5179:1: ( rule__Photo__NomAssignment_5_1 )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5179:2: rule__Photo__NomAssignment_5_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Photo__NomAssignment_5_1_in_rule__Photo__Group_5__1__Impl10188);
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5193:1: rule__EFloat__Group__0 : rule__EFloat__Group__0__Impl rule__EFloat__Group__1 ;
    public final void rule__EFloat__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5197:1: ( rule__EFloat__Group__0__Impl rule__EFloat__Group__1 )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5198:2: rule__EFloat__Group__0__Impl rule__EFloat__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EFloat__Group__0__Impl_in_rule__EFloat__Group__010222);
            rule__EFloat__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EFloat__Group__1_in_rule__EFloat__Group__010225);
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5205:1: rule__EFloat__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EFloat__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5209:1: ( ( ( '-' )? ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5210:1: ( ( '-' )? )
            {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5210:1: ( ( '-' )? )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5211:1: ( '-' )?
            {
             before(grammarAccess.getEFloatAccess().getHyphenMinusKeyword_0()); 
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5212:1: ( '-' )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==48) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5213:2: '-'
                    {
                    match(input,48,FollowSets000.FOLLOW_48_in_rule__EFloat__Group__0__Impl10254); 

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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5224:1: rule__EFloat__Group__1 : rule__EFloat__Group__1__Impl rule__EFloat__Group__2 ;
    public final void rule__EFloat__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5228:1: ( rule__EFloat__Group__1__Impl rule__EFloat__Group__2 )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5229:2: rule__EFloat__Group__1__Impl rule__EFloat__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__EFloat__Group__1__Impl_in_rule__EFloat__Group__110287);
            rule__EFloat__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EFloat__Group__2_in_rule__EFloat__Group__110290);
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5236:1: rule__EFloat__Group__1__Impl : ( ( RULE_INT )? ) ;
    public final void rule__EFloat__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5240:1: ( ( ( RULE_INT )? ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5241:1: ( ( RULE_INT )? )
            {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5241:1: ( ( RULE_INT )? )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5242:1: ( RULE_INT )?
            {
             before(grammarAccess.getEFloatAccess().getINTTerminalRuleCall_1()); 
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5243:1: ( RULE_INT )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==RULE_INT) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5243:3: RULE_INT
                    {
                    match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__EFloat__Group__1__Impl10318); 

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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5253:1: rule__EFloat__Group__2 : rule__EFloat__Group__2__Impl rule__EFloat__Group__3 ;
    public final void rule__EFloat__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5257:1: ( rule__EFloat__Group__2__Impl rule__EFloat__Group__3 )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5258:2: rule__EFloat__Group__2__Impl rule__EFloat__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__EFloat__Group__2__Impl_in_rule__EFloat__Group__210349);
            rule__EFloat__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EFloat__Group__3_in_rule__EFloat__Group__210352);
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5265:1: rule__EFloat__Group__2__Impl : ( '.' ) ;
    public final void rule__EFloat__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5269:1: ( ( '.' ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5270:1: ( '.' )
            {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5270:1: ( '.' )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5271:1: '.'
            {
             before(grammarAccess.getEFloatAccess().getFullStopKeyword_2()); 
            match(input,28,FollowSets000.FOLLOW_28_in_rule__EFloat__Group__2__Impl10380); 
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5284:1: rule__EFloat__Group__3 : rule__EFloat__Group__3__Impl rule__EFloat__Group__4 ;
    public final void rule__EFloat__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5288:1: ( rule__EFloat__Group__3__Impl rule__EFloat__Group__4 )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5289:2: rule__EFloat__Group__3__Impl rule__EFloat__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__EFloat__Group__3__Impl_in_rule__EFloat__Group__310411);
            rule__EFloat__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EFloat__Group__4_in_rule__EFloat__Group__310414);
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5296:1: rule__EFloat__Group__3__Impl : ( RULE_INT ) ;
    public final void rule__EFloat__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5300:1: ( ( RULE_INT ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5301:1: ( RULE_INT )
            {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5301:1: ( RULE_INT )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5302:1: RULE_INT
            {
             before(grammarAccess.getEFloatAccess().getINTTerminalRuleCall_3()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__EFloat__Group__3__Impl10441); 
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5313:1: rule__EFloat__Group__4 : rule__EFloat__Group__4__Impl ;
    public final void rule__EFloat__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5317:1: ( rule__EFloat__Group__4__Impl )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5318:2: rule__EFloat__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EFloat__Group__4__Impl_in_rule__EFloat__Group__410470);
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5324:1: rule__EFloat__Group__4__Impl : ( ( rule__EFloat__Group_4__0 )? ) ;
    public final void rule__EFloat__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5328:1: ( ( ( rule__EFloat__Group_4__0 )? ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5329:1: ( ( rule__EFloat__Group_4__0 )? )
            {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5329:1: ( ( rule__EFloat__Group_4__0 )? )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5330:1: ( rule__EFloat__Group_4__0 )?
            {
             before(grammarAccess.getEFloatAccess().getGroup_4()); 
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5331:1: ( rule__EFloat__Group_4__0 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( ((LA40_0>=11 && LA40_0<=12)) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5331:2: rule__EFloat__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__EFloat__Group_4__0_in_rule__EFloat__Group__4__Impl10497);
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5351:1: rule__EFloat__Group_4__0 : rule__EFloat__Group_4__0__Impl rule__EFloat__Group_4__1 ;
    public final void rule__EFloat__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5355:1: ( rule__EFloat__Group_4__0__Impl rule__EFloat__Group_4__1 )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5356:2: rule__EFloat__Group_4__0__Impl rule__EFloat__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EFloat__Group_4__0__Impl_in_rule__EFloat__Group_4__010538);
            rule__EFloat__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EFloat__Group_4__1_in_rule__EFloat__Group_4__010541);
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5363:1: rule__EFloat__Group_4__0__Impl : ( ( rule__EFloat__Alternatives_4_0 ) ) ;
    public final void rule__EFloat__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5367:1: ( ( ( rule__EFloat__Alternatives_4_0 ) ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5368:1: ( ( rule__EFloat__Alternatives_4_0 ) )
            {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5368:1: ( ( rule__EFloat__Alternatives_4_0 ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5369:1: ( rule__EFloat__Alternatives_4_0 )
            {
             before(grammarAccess.getEFloatAccess().getAlternatives_4_0()); 
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5370:1: ( rule__EFloat__Alternatives_4_0 )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5370:2: rule__EFloat__Alternatives_4_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__EFloat__Alternatives_4_0_in_rule__EFloat__Group_4__0__Impl10568);
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5380:1: rule__EFloat__Group_4__1 : rule__EFloat__Group_4__1__Impl rule__EFloat__Group_4__2 ;
    public final void rule__EFloat__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5384:1: ( rule__EFloat__Group_4__1__Impl rule__EFloat__Group_4__2 )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5385:2: rule__EFloat__Group_4__1__Impl rule__EFloat__Group_4__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__EFloat__Group_4__1__Impl_in_rule__EFloat__Group_4__110598);
            rule__EFloat__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EFloat__Group_4__2_in_rule__EFloat__Group_4__110601);
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5392:1: rule__EFloat__Group_4__1__Impl : ( ( '-' )? ) ;
    public final void rule__EFloat__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5396:1: ( ( ( '-' )? ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5397:1: ( ( '-' )? )
            {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5397:1: ( ( '-' )? )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5398:1: ( '-' )?
            {
             before(grammarAccess.getEFloatAccess().getHyphenMinusKeyword_4_1()); 
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5399:1: ( '-' )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==48) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5400:2: '-'
                    {
                    match(input,48,FollowSets000.FOLLOW_48_in_rule__EFloat__Group_4__1__Impl10630); 

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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5411:1: rule__EFloat__Group_4__2 : rule__EFloat__Group_4__2__Impl ;
    public final void rule__EFloat__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5415:1: ( rule__EFloat__Group_4__2__Impl )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5416:2: rule__EFloat__Group_4__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EFloat__Group_4__2__Impl_in_rule__EFloat__Group_4__210663);
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5422:1: rule__EFloat__Group_4__2__Impl : ( RULE_INT ) ;
    public final void rule__EFloat__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5426:1: ( ( RULE_INT ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5427:1: ( RULE_INT )
            {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5427:1: ( RULE_INT )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5428:1: RULE_INT
            {
             before(grammarAccess.getEFloatAccess().getINTTerminalRuleCall_4_2()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__EFloat__Group_4__2__Impl10690); 
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


    // $ANTLR start "rule__PagePrincipale__ConfigurationPageAssignment_3"
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5446:1: rule__PagePrincipale__ConfigurationPageAssignment_3 : ( ruleConfigurationPage ) ;
    public final void rule__PagePrincipale__ConfigurationPageAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5450:1: ( ( ruleConfigurationPage ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5451:1: ( ruleConfigurationPage )
            {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5451:1: ( ruleConfigurationPage )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5452:1: ruleConfigurationPage
            {
             before(grammarAccess.getPagePrincipaleAccess().getConfigurationPageConfigurationPageParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleConfigurationPage_in_rule__PagePrincipale__ConfigurationPageAssignment_310730);
            ruleConfigurationPage();

            state._fsp--;

             after(grammarAccess.getPagePrincipaleAccess().getConfigurationPageConfigurationPageParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__PagePrincipale__ConfigurationPageAssignment_3"


    // $ANTLR start "rule__PagePrincipale__ContactsAssignment_6"
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5461:1: rule__PagePrincipale__ContactsAssignment_6 : ( ruleContact ) ;
    public final void rule__PagePrincipale__ContactsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5465:1: ( ( ruleContact ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5466:1: ( ruleContact )
            {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5466:1: ( ruleContact )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5467:1: ruleContact
            {
             before(grammarAccess.getPagePrincipaleAccess().getContactsContactParserRuleCall_6_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleContact_in_rule__PagePrincipale__ContactsAssignment_610761);
            ruleContact();

            state._fsp--;

             after(grammarAccess.getPagePrincipaleAccess().getContactsContactParserRuleCall_6_0()); 

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
    // $ANTLR end "rule__PagePrincipale__ContactsAssignment_6"


    // $ANTLR start "rule__PagePrincipale__ContactsAssignment_7_1"
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5476:1: rule__PagePrincipale__ContactsAssignment_7_1 : ( ruleContact ) ;
    public final void rule__PagePrincipale__ContactsAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5480:1: ( ( ruleContact ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5481:1: ( ruleContact )
            {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5481:1: ( ruleContact )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5482:1: ruleContact
            {
             before(grammarAccess.getPagePrincipaleAccess().getContactsContactParserRuleCall_7_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleContact_in_rule__PagePrincipale__ContactsAssignment_7_110792);
            ruleContact();

            state._fsp--;

             after(grammarAccess.getPagePrincipaleAccess().getContactsContactParserRuleCall_7_1_0()); 

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
    // $ANTLR end "rule__PagePrincipale__ContactsAssignment_7_1"


    // $ANTLR start "rule__PagePrincipale__PagesAssignment_11"
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5491:1: rule__PagePrincipale__PagesAssignment_11 : ( rulePageInterne ) ;
    public final void rule__PagePrincipale__PagesAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5495:1: ( ( rulePageInterne ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5496:1: ( rulePageInterne )
            {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5496:1: ( rulePageInterne )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5497:1: rulePageInterne
            {
             before(grammarAccess.getPagePrincipaleAccess().getPagesPageInterneParserRuleCall_11_0()); 
            pushFollow(FollowSets000.FOLLOW_rulePageInterne_in_rule__PagePrincipale__PagesAssignment_1110823);
            rulePageInterne();

            state._fsp--;

             after(grammarAccess.getPagePrincipaleAccess().getPagesPageInterneParserRuleCall_11_0()); 

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
    // $ANTLR end "rule__PagePrincipale__PagesAssignment_11"


    // $ANTLR start "rule__PagePrincipale__PagesAssignment_12_1"
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5506:1: rule__PagePrincipale__PagesAssignment_12_1 : ( rulePageInterne ) ;
    public final void rule__PagePrincipale__PagesAssignment_12_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5510:1: ( ( rulePageInterne ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5511:1: ( rulePageInterne )
            {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5511:1: ( rulePageInterne )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5512:1: rulePageInterne
            {
             before(grammarAccess.getPagePrincipaleAccess().getPagesPageInterneParserRuleCall_12_1_0()); 
            pushFollow(FollowSets000.FOLLOW_rulePageInterne_in_rule__PagePrincipale__PagesAssignment_12_110854);
            rulePageInterne();

            state._fsp--;

             after(grammarAccess.getPagePrincipaleAccess().getPagesPageInterneParserRuleCall_12_1_0()); 

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
    // $ANTLR end "rule__PagePrincipale__PagesAssignment_12_1"


    // $ANTLR start "rule__PagePrincipale__RubriquesAssignment_14_1"
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5521:1: rule__PagePrincipale__RubriquesAssignment_14_1 : ( ruleRubriques ) ;
    public final void rule__PagePrincipale__RubriquesAssignment_14_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5525:1: ( ( ruleRubriques ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5526:1: ( ruleRubriques )
            {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5526:1: ( ruleRubriques )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5527:1: ruleRubriques
            {
             before(grammarAccess.getPagePrincipaleAccess().getRubriquesRubriquesParserRuleCall_14_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleRubriques_in_rule__PagePrincipale__RubriquesAssignment_14_110885);
            ruleRubriques();

            state._fsp--;

             after(grammarAccess.getPagePrincipaleAccess().getRubriquesRubriquesParserRuleCall_14_1_0()); 

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
    // $ANTLR end "rule__PagePrincipale__RubriquesAssignment_14_1"


    // $ANTLR start "rule__PagePrincipale__FichiersAssignment_15_2"
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5536:1: rule__PagePrincipale__FichiersAssignment_15_2 : ( ruleFichiers ) ;
    public final void rule__PagePrincipale__FichiersAssignment_15_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5540:1: ( ( ruleFichiers ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5541:1: ( ruleFichiers )
            {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5541:1: ( ruleFichiers )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5542:1: ruleFichiers
            {
             before(grammarAccess.getPagePrincipaleAccess().getFichiersFichiersParserRuleCall_15_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleFichiers_in_rule__PagePrincipale__FichiersAssignment_15_210916);
            ruleFichiers();

            state._fsp--;

             after(grammarAccess.getPagePrincipaleAccess().getFichiersFichiersParserRuleCall_15_2_0()); 

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
    // $ANTLR end "rule__PagePrincipale__FichiersAssignment_15_2"


    // $ANTLR start "rule__PagePrincipale__FichiersAssignment_15_3_1"
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5551:1: rule__PagePrincipale__FichiersAssignment_15_3_1 : ( ruleFichiers ) ;
    public final void rule__PagePrincipale__FichiersAssignment_15_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5555:1: ( ( ruleFichiers ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5556:1: ( ruleFichiers )
            {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5556:1: ( ruleFichiers )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5557:1: ruleFichiers
            {
             before(grammarAccess.getPagePrincipaleAccess().getFichiersFichiersParserRuleCall_15_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleFichiers_in_rule__PagePrincipale__FichiersAssignment_15_3_110947);
            ruleFichiers();

            state._fsp--;

             after(grammarAccess.getPagePrincipaleAccess().getFichiersFichiersParserRuleCall_15_3_1_0()); 

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
    // $ANTLR end "rule__PagePrincipale__FichiersAssignment_15_3_1"


    // $ANTLR start "rule__Contact__NomAssignment_3_1"
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5566:1: rule__Contact__NomAssignment_3_1 : ( ruleEString ) ;
    public final void rule__Contact__NomAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5570:1: ( ( ruleEString ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5571:1: ( ruleEString )
            {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5571:1: ( ruleEString )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5572:1: ruleEString
            {
             before(grammarAccess.getContactAccess().getNomEStringParserRuleCall_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Contact__NomAssignment_3_110978);
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5581:1: rule__Contact__PrenomAssignment_4_1 : ( ruleEString ) ;
    public final void rule__Contact__PrenomAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5585:1: ( ( ruleEString ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5586:1: ( ruleEString )
            {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5586:1: ( ruleEString )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5587:1: ruleEString
            {
             before(grammarAccess.getContactAccess().getPrenomEStringParserRuleCall_4_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Contact__PrenomAssignment_4_111009);
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5596:1: rule__Contact__AdresseAssignment_5_1 : ( ruleEString ) ;
    public final void rule__Contact__AdresseAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5600:1: ( ( ruleEString ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5601:1: ( ruleEString )
            {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5601:1: ( ruleEString )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5602:1: ruleEString
            {
             before(grammarAccess.getContactAccess().getAdresseEStringParserRuleCall_5_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Contact__AdresseAssignment_5_111040);
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5611:1: rule__Contact__MailAssignment_6_1 : ( ruleEString ) ;
    public final void rule__Contact__MailAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5615:1: ( ( ruleEString ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5616:1: ( ruleEString )
            {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5616:1: ( ruleEString )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5617:1: ruleEString
            {
             before(grammarAccess.getContactAccess().getMailEStringParserRuleCall_6_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Contact__MailAssignment_6_111071);
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5626:1: rule__Contact__TelephoneAssignment_7_1 : ( ruleEString ) ;
    public final void rule__Contact__TelephoneAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5630:1: ( ( ruleEString ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5631:1: ( ruleEString )
            {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5631:1: ( ruleEString )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5632:1: ruleEString
            {
             before(grammarAccess.getContactAccess().getTelephoneEStringParserRuleCall_7_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Contact__TelephoneAssignment_7_111102);
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5641:1: rule__Rubriques__TexteAssignment_3_1 : ( ruleEString ) ;
    public final void rule__Rubriques__TexteAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5645:1: ( ( ruleEString ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5646:1: ( ruleEString )
            {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5646:1: ( ruleEString )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5647:1: ruleEString
            {
             before(grammarAccess.getRubriquesAccess().getTexteEStringParserRuleCall_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Rubriques__TexteAssignment_3_111133);
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5656:1: rule__Rubriques__LienAssignment_4_1 : ( ruleEString ) ;
    public final void rule__Rubriques__LienAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5660:1: ( ( ruleEString ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5661:1: ( ruleEString )
            {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5661:1: ( ruleEString )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5662:1: ruleEString
            {
             before(grammarAccess.getRubriquesAccess().getLienEStringParserRuleCall_4_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Rubriques__LienAssignment_4_111164);
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5671:1: rule__Fichiers__TypeAssignment_3_1 : ( ruleEString ) ;
    public final void rule__Fichiers__TypeAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5675:1: ( ( ruleEString ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5676:1: ( ruleEString )
            {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5676:1: ( ruleEString )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5677:1: ruleEString
            {
             before(grammarAccess.getFichiersAccess().getTypeEStringParserRuleCall_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Fichiers__TypeAssignment_3_111195);
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5686:1: rule__Fichiers__TailleAssignment_4_1 : ( ruleEInt ) ;
    public final void rule__Fichiers__TailleAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5690:1: ( ( ruleEInt ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5691:1: ( ruleEInt )
            {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5691:1: ( ruleEInt )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5692:1: ruleEInt
            {
             before(grammarAccess.getFichiersAccess().getTailleEIntParserRuleCall_4_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rule__Fichiers__TailleAssignment_4_111226);
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5701:1: rule__Fichiers__NomAssignment_5_1 : ( ruleEString ) ;
    public final void rule__Fichiers__NomAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5705:1: ( ( ruleEString ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5706:1: ( ruleEString )
            {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5706:1: ( ruleEString )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5707:1: ruleEString
            {
             before(grammarAccess.getFichiersAccess().getNomEStringParserRuleCall_5_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Fichiers__NomAssignment_5_111257);
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5716:1: rule__Fichiers__EmplacementAssignment_6_1 : ( ruleEString ) ;
    public final void rule__Fichiers__EmplacementAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5720:1: ( ( ruleEString ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5721:1: ( ruleEString )
            {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5721:1: ( ruleEString )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5722:1: ruleEString
            {
             before(grammarAccess.getFichiersAccess().getEmplacementEStringParserRuleCall_6_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Fichiers__EmplacementAssignment_6_111288);
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5731:1: rule__ConfigurationPage__CouleurFondAssignment_3_1 : ( ruleEString ) ;
    public final void rule__ConfigurationPage__CouleurFondAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5735:1: ( ( ruleEString ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5736:1: ( ruleEString )
            {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5736:1: ( ruleEString )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5737:1: ruleEString
            {
             before(grammarAccess.getConfigurationPageAccess().getCouleurFondEStringParserRuleCall_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__ConfigurationPage__CouleurFondAssignment_3_111319);
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5746:1: rule__ConfigurationPage__TitreSiteAssignment_4_1 : ( ruleEString ) ;
    public final void rule__ConfigurationPage__TitreSiteAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5750:1: ( ( ruleEString ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5751:1: ( ruleEString )
            {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5751:1: ( ruleEString )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5752:1: ruleEString
            {
             before(grammarAccess.getConfigurationPageAccess().getTitreSiteEStringParserRuleCall_4_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__ConfigurationPage__TitreSiteAssignment_4_111350);
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5761:1: rule__ConfigurationPage__AuteursAssignment_5_1 : ( ruleEString ) ;
    public final void rule__ConfigurationPage__AuteursAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5765:1: ( ( ruleEString ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5766:1: ( ruleEString )
            {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5766:1: ( ruleEString )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5767:1: ruleEString
            {
             before(grammarAccess.getConfigurationPageAccess().getAuteursEStringParserRuleCall_5_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__ConfigurationPage__AuteursAssignment_5_111381);
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5776:1: rule__ConfigurationPage__CouleurPoliceAssignment_6_1 : ( ruleEString ) ;
    public final void rule__ConfigurationPage__CouleurPoliceAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5780:1: ( ( ruleEString ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5781:1: ( ruleEString )
            {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5781:1: ( ruleEString )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5782:1: ruleEString
            {
             before(grammarAccess.getConfigurationPageAccess().getCouleurPoliceEStringParserRuleCall_6_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__ConfigurationPage__CouleurPoliceAssignment_6_111412);
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5791:1: rule__ConfigurationPage__TaillePoliceAssignment_7_1 : ( ruleEInt ) ;
    public final void rule__ConfigurationPage__TaillePoliceAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5795:1: ( ( ruleEInt ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5796:1: ( ruleEInt )
            {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5796:1: ( ruleEInt )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5797:1: ruleEInt
            {
             before(grammarAccess.getConfigurationPageAccess().getTaillePoliceEIntParserRuleCall_7_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rule__ConfigurationPage__TaillePoliceAssignment_7_111443);
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5806:1: rule__PageInterne__TitrePageAssignment_2_1 : ( ruleEString ) ;
    public final void rule__PageInterne__TitrePageAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5810:1: ( ( ruleEString ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5811:1: ( ruleEString )
            {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5811:1: ( ruleEString )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5812:1: ruleEString
            {
             before(grammarAccess.getPageInterneAccess().getTitrePageEStringParserRuleCall_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__PageInterne__TitrePageAssignment_2_111474);
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5821:1: rule__PageInterne__TexteAssignment_3_1 : ( ruleEString ) ;
    public final void rule__PageInterne__TexteAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5825:1: ( ( ruleEString ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5826:1: ( ruleEString )
            {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5826:1: ( ruleEString )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5827:1: ruleEString
            {
             before(grammarAccess.getPageInterneAccess().getTexteEStringParserRuleCall_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__PageInterne__TexteAssignment_3_111505);
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5836:1: rule__PageInterne__TypesAssignment_4_1 : ( ruleTypes ) ;
    public final void rule__PageInterne__TypesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5840:1: ( ( ruleTypes ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5841:1: ( ruleTypes )
            {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5841:1: ( ruleTypes )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5842:1: ruleTypes
            {
             before(grammarAccess.getPageInterneAccess().getTypesTypesParserRuleCall_4_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleTypes_in_rule__PageInterne__TypesAssignment_4_111536);
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5851:1: rule__PageInterne__LiensAssignment_5_1 : ( ruleLiens ) ;
    public final void rule__PageInterne__LiensAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5855:1: ( ( ruleLiens ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5856:1: ( ruleLiens )
            {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5856:1: ( ruleLiens )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5857:1: ruleLiens
            {
             before(grammarAccess.getPageInterneAccess().getLiensLiensParserRuleCall_5_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleLiens_in_rule__PageInterne__LiensAssignment_5_111567);
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5866:1: rule__PageInterne__PhotoAssignment_7 : ( rulePhoto ) ;
    public final void rule__PageInterne__PhotoAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5870:1: ( ( rulePhoto ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5871:1: ( rulePhoto )
            {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5871:1: ( rulePhoto )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5872:1: rulePhoto
            {
             before(grammarAccess.getPageInterneAccess().getPhotoPhotoParserRuleCall_7_0()); 
            pushFollow(FollowSets000.FOLLOW_rulePhoto_in_rule__PageInterne__PhotoAssignment_711598);
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5881:1: rule__Types__GrasAssignment_1 : ( ( 'gras' ) ) ;
    public final void rule__Types__GrasAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5885:1: ( ( ( 'gras' ) ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5886:1: ( ( 'gras' ) )
            {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5886:1: ( ( 'gras' ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5887:1: ( 'gras' )
            {
             before(grammarAccess.getTypesAccess().getGrasGrasKeyword_1_0()); 
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5888:1: ( 'gras' )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5889:1: 'gras'
            {
             before(grammarAccess.getTypesAccess().getGrasGrasKeyword_1_0()); 
            match(input,56,FollowSets000.FOLLOW_56_in_rule__Types__GrasAssignment_111634); 
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5904:1: rule__Types__ItaliqueAssignment_2 : ( ( 'italique' ) ) ;
    public final void rule__Types__ItaliqueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5908:1: ( ( ( 'italique' ) ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5909:1: ( ( 'italique' ) )
            {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5909:1: ( ( 'italique' ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5910:1: ( 'italique' )
            {
             before(grammarAccess.getTypesAccess().getItaliqueItaliqueKeyword_2_0()); 
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5911:1: ( 'italique' )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5912:1: 'italique'
            {
             before(grammarAccess.getTypesAccess().getItaliqueItaliqueKeyword_2_0()); 
            match(input,57,FollowSets000.FOLLOW_57_in_rule__Types__ItaliqueAssignment_211678); 
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5927:1: rule__Liens__FichierAssignment_3_1 : ( ruleEString ) ;
    public final void rule__Liens__FichierAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5931:1: ( ( ruleEString ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5932:1: ( ruleEString )
            {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5932:1: ( ruleEString )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5933:1: ruleEString
            {
             before(grammarAccess.getLiensAccess().getFichierEStringParserRuleCall_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Liens__FichierAssignment_3_111717);
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5942:1: rule__Liens__AdresseWebAssignment_4_1 : ( ruleEString ) ;
    public final void rule__Liens__AdresseWebAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5946:1: ( ( ruleEString ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5947:1: ( ruleEString )
            {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5947:1: ( ruleEString )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5948:1: ruleEString
            {
             before(grammarAccess.getLiensAccess().getAdresseWebEStringParserRuleCall_4_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Liens__AdresseWebAssignment_4_111748);
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5957:1: rule__Liens__PageInterneAssignment_5_1 : ( ruleEString ) ;
    public final void rule__Liens__PageInterneAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5961:1: ( ( ruleEString ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5962:1: ( ruleEString )
            {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5962:1: ( ruleEString )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5963:1: ruleEString
            {
             before(grammarAccess.getLiensAccess().getPageInterneEStringParserRuleCall_5_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Liens__PageInterneAssignment_5_111779);
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5972:1: rule__Photo__TailleAssignment_3_1 : ( ruleEFloat ) ;
    public final void rule__Photo__TailleAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5976:1: ( ( ruleEFloat ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5977:1: ( ruleEFloat )
            {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5977:1: ( ruleEFloat )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5978:1: ruleEFloat
            {
             before(grammarAccess.getPhotoAccess().getTailleEFloatParserRuleCall_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEFloat_in_rule__Photo__TailleAssignment_3_111810);
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5987:1: rule__Photo__ExtensionAssignment_4_1 : ( ruleEString ) ;
    public final void rule__Photo__ExtensionAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5991:1: ( ( ruleEString ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5992:1: ( ruleEString )
            {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5992:1: ( ruleEString )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:5993:1: ruleEString
            {
             before(grammarAccess.getPhotoAccess().getExtensionEStringParserRuleCall_4_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Photo__ExtensionAssignment_4_111841);
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
    // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:6002:1: rule__Photo__NomAssignment_5_1 : ( ruleEString ) ;
    public final void rule__Photo__NomAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:6006:1: ( ( ruleEString ) )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:6007:1: ( ruleEString )
            {
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:6007:1: ( ruleEString )
            // ../org.xtext.siteWeb.mydsl.ui/src-gen/org/xtext/example/siteWeb/ui/contentassist/antlr/internal/InternalMyDsl.g:6008:1: ruleEString
            {
             before(grammarAccess.getPhotoAccess().getNomEStringParserRuleCall_5_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Photo__NomAssignment_5_111872);
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
        public static final BitSet FOLLOW_rule__PagePrincipale__Group__2__Impl_in_rule__PagePrincipale__Group__21019 = new BitSet(new long[]{0x0000002000000000L});
        public static final BitSet FOLLOW_rule__PagePrincipale__Group__3_in_rule__PagePrincipale__Group__21022 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__PagePrincipale__Group__2__Impl1050 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PagePrincipale__Group__3__Impl_in_rule__PagePrincipale__Group__31081 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_rule__PagePrincipale__Group__4_in_rule__PagePrincipale__Group__31084 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PagePrincipale__ConfigurationPageAssignment_3_in_rule__PagePrincipale__Group__3__Impl1111 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PagePrincipale__Group__4__Impl_in_rule__PagePrincipale__Group__41141 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__PagePrincipale__Group__5_in_rule__PagePrincipale__Group__41144 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__PagePrincipale__Group__4__Impl1172 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PagePrincipale__Group__5__Impl_in_rule__PagePrincipale__Group__51203 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_rule__PagePrincipale__Group__6_in_rule__PagePrincipale__Group__51206 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__PagePrincipale__Group__5__Impl1234 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PagePrincipale__Group__6__Impl_in_rule__PagePrincipale__Group__61265 = new BitSet(new long[]{0x00000000000A0000L});
        public static final BitSet FOLLOW_rule__PagePrincipale__Group__7_in_rule__PagePrincipale__Group__61268 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PagePrincipale__ContactsAssignment_6_in_rule__PagePrincipale__Group__6__Impl1295 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PagePrincipale__Group__7__Impl_in_rule__PagePrincipale__Group__71325 = new BitSet(new long[]{0x00000000000A0000L});
        public static final BitSet FOLLOW_rule__PagePrincipale__Group__8_in_rule__PagePrincipale__Group__71328 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PagePrincipale__Group_7__0_in_rule__PagePrincipale__Group__7__Impl1355 = new BitSet(new long[]{0x0000000000080002L});
        public static final BitSet FOLLOW_rule__PagePrincipale__Group__8__Impl_in_rule__PagePrincipale__Group__81386 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_rule__PagePrincipale__Group__9_in_rule__PagePrincipale__Group__81389 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__PagePrincipale__Group__8__Impl1417 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PagePrincipale__Group__9__Impl_in_rule__PagePrincipale__Group__91448 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__PagePrincipale__Group__10_in_rule__PagePrincipale__Group__91451 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__PagePrincipale__Group__9__Impl1479 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PagePrincipale__Group__10__Impl_in_rule__PagePrincipale__Group__101510 = new BitSet(new long[]{0x0000080000000000L});
        public static final BitSet FOLLOW_rule__PagePrincipale__Group__11_in_rule__PagePrincipale__Group__101513 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__PagePrincipale__Group__10__Impl1541 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PagePrincipale__Group__11__Impl_in_rule__PagePrincipale__Group__111572 = new BitSet(new long[]{0x00000000000A0000L});
        public static final BitSet FOLLOW_rule__PagePrincipale__Group__12_in_rule__PagePrincipale__Group__111575 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PagePrincipale__PagesAssignment_11_in_rule__PagePrincipale__Group__11__Impl1602 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PagePrincipale__Group__12__Impl_in_rule__PagePrincipale__Group__121632 = new BitSet(new long[]{0x00000000000A0000L});
        public static final BitSet FOLLOW_rule__PagePrincipale__Group__13_in_rule__PagePrincipale__Group__121635 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PagePrincipale__Group_12__0_in_rule__PagePrincipale__Group__12__Impl1662 = new BitSet(new long[]{0x0000000000080002L});
        public static final BitSet FOLLOW_rule__PagePrincipale__Group__13__Impl_in_rule__PagePrincipale__Group__131693 = new BitSet(new long[]{0x0000000000320000L});
        public static final BitSet FOLLOW_rule__PagePrincipale__Group__14_in_rule__PagePrincipale__Group__131696 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__PagePrincipale__Group__13__Impl1724 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PagePrincipale__Group__14__Impl_in_rule__PagePrincipale__Group__141755 = new BitSet(new long[]{0x0000000000320000L});
        public static final BitSet FOLLOW_rule__PagePrincipale__Group__15_in_rule__PagePrincipale__Group__141758 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PagePrincipale__Group_14__0_in_rule__PagePrincipale__Group__14__Impl1785 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PagePrincipale__Group__15__Impl_in_rule__PagePrincipale__Group__151816 = new BitSet(new long[]{0x0000000000320000L});
        public static final BitSet FOLLOW_rule__PagePrincipale__Group__16_in_rule__PagePrincipale__Group__151819 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PagePrincipale__Group_15__0_in_rule__PagePrincipale__Group__15__Impl1846 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PagePrincipale__Group__16__Impl_in_rule__PagePrincipale__Group__161877 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__PagePrincipale__Group__16__Impl1905 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PagePrincipale__Group_7__0__Impl_in_rule__PagePrincipale__Group_7__01970 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_rule__PagePrincipale__Group_7__1_in_rule__PagePrincipale__Group_7__01973 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__PagePrincipale__Group_7__0__Impl2001 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PagePrincipale__Group_7__1__Impl_in_rule__PagePrincipale__Group_7__12032 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PagePrincipale__ContactsAssignment_7_1_in_rule__PagePrincipale__Group_7__1__Impl2059 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PagePrincipale__Group_12__0__Impl_in_rule__PagePrincipale__Group_12__02093 = new BitSet(new long[]{0x0000080000000000L});
        public static final BitSet FOLLOW_rule__PagePrincipale__Group_12__1_in_rule__PagePrincipale__Group_12__02096 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__PagePrincipale__Group_12__0__Impl2124 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PagePrincipale__Group_12__1__Impl_in_rule__PagePrincipale__Group_12__12155 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PagePrincipale__PagesAssignment_12_1_in_rule__PagePrincipale__Group_12__1__Impl2182 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PagePrincipale__Group_14__0__Impl_in_rule__PagePrincipale__Group_14__02216 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_rule__PagePrincipale__Group_14__1_in_rule__PagePrincipale__Group_14__02219 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__PagePrincipale__Group_14__0__Impl2247 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PagePrincipale__Group_14__1__Impl_in_rule__PagePrincipale__Group_14__12278 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PagePrincipale__RubriquesAssignment_14_1_in_rule__PagePrincipale__Group_14__1__Impl2305 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PagePrincipale__Group_15__0__Impl_in_rule__PagePrincipale__Group_15__02339 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__PagePrincipale__Group_15__1_in_rule__PagePrincipale__Group_15__02342 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__PagePrincipale__Group_15__0__Impl2370 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PagePrincipale__Group_15__1__Impl_in_rule__PagePrincipale__Group_15__12401 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_rule__PagePrincipale__Group_15__2_in_rule__PagePrincipale__Group_15__12404 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__PagePrincipale__Group_15__1__Impl2432 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PagePrincipale__Group_15__2__Impl_in_rule__PagePrincipale__Group_15__22463 = new BitSet(new long[]{0x00000000000A0000L});
        public static final BitSet FOLLOW_rule__PagePrincipale__Group_15__3_in_rule__PagePrincipale__Group_15__22466 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PagePrincipale__FichiersAssignment_15_2_in_rule__PagePrincipale__Group_15__2__Impl2493 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PagePrincipale__Group_15__3__Impl_in_rule__PagePrincipale__Group_15__32523 = new BitSet(new long[]{0x00000000000A0000L});
        public static final BitSet FOLLOW_rule__PagePrincipale__Group_15__4_in_rule__PagePrincipale__Group_15__32526 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PagePrincipale__Group_15_3__0_in_rule__PagePrincipale__Group_15__3__Impl2553 = new BitSet(new long[]{0x0000000000080002L});
        public static final BitSet FOLLOW_rule__PagePrincipale__Group_15__4__Impl_in_rule__PagePrincipale__Group_15__42584 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__PagePrincipale__Group_15__4__Impl2612 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PagePrincipale__Group_15_3__0__Impl_in_rule__PagePrincipale__Group_15_3__02653 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_rule__PagePrincipale__Group_15_3__1_in_rule__PagePrincipale__Group_15_3__02656 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__PagePrincipale__Group_15_3__0__Impl2684 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PagePrincipale__Group_15_3__1__Impl_in_rule__PagePrincipale__Group_15_3__12715 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PagePrincipale__FichiersAssignment_15_3_1_in_rule__PagePrincipale__Group_15_3__1__Impl2742 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Contact__Group__0__Impl_in_rule__Contact__Group__02776 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_rule__Contact__Group__1_in_rule__Contact__Group__02779 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Contact__Group__1__Impl_in_rule__Contact__Group__12837 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__Contact__Group__2_in_rule__Contact__Group__12840 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__Contact__Group__1__Impl2868 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Contact__Group__2__Impl_in_rule__Contact__Group__22899 = new BitSet(new long[]{0x0000000007800000L});
        public static final BitSet FOLLOW_rule__Contact__Group__3_in_rule__Contact__Group__22902 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Contact__Group__2__Impl2930 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Contact__Group__3__Impl_in_rule__Contact__Group__32961 = new BitSet(new long[]{0x0000000007800000L});
        public static final BitSet FOLLOW_rule__Contact__Group__4_in_rule__Contact__Group__32964 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Contact__Group_3__0_in_rule__Contact__Group__3__Impl2991 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Contact__Group__4__Impl_in_rule__Contact__Group__43022 = new BitSet(new long[]{0x0000000007800000L});
        public static final BitSet FOLLOW_rule__Contact__Group__5_in_rule__Contact__Group__43025 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Contact__Group_4__0_in_rule__Contact__Group__4__Impl3052 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Contact__Group__5__Impl_in_rule__Contact__Group__53083 = new BitSet(new long[]{0x0000000007800000L});
        public static final BitSet FOLLOW_rule__Contact__Group__6_in_rule__Contact__Group__53086 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Contact__Group_5__0_in_rule__Contact__Group__5__Impl3113 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Contact__Group__6__Impl_in_rule__Contact__Group__63144 = new BitSet(new long[]{0x0000000020020000L});
        public static final BitSet FOLLOW_rule__Contact__Group__7_in_rule__Contact__Group__63147 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Contact__Group_6__0_in_rule__Contact__Group__6__Impl3174 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Contact__Group__7__Impl_in_rule__Contact__Group__73204 = new BitSet(new long[]{0x0000000020020000L});
        public static final BitSet FOLLOW_rule__Contact__Group__8_in_rule__Contact__Group__73207 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Contact__Group_7__0_in_rule__Contact__Group__7__Impl3234 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Contact__Group__8__Impl_in_rule__Contact__Group__83265 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__Contact__Group__8__Impl3293 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Contact__Group_3__0__Impl_in_rule__Contact__Group_3__03342 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Contact__Group_3__1_in_rule__Contact__Group_3__03345 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__Contact__Group_3__0__Impl3373 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Contact__Group_3__1__Impl_in_rule__Contact__Group_3__13404 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Contact__NomAssignment_3_1_in_rule__Contact__Group_3__1__Impl3431 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Contact__Group_4__0__Impl_in_rule__Contact__Group_4__03465 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Contact__Group_4__1_in_rule__Contact__Group_4__03468 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__Contact__Group_4__0__Impl3496 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Contact__Group_4__1__Impl_in_rule__Contact__Group_4__13527 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Contact__PrenomAssignment_4_1_in_rule__Contact__Group_4__1__Impl3554 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Contact__Group_5__0__Impl_in_rule__Contact__Group_5__03588 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Contact__Group_5__1_in_rule__Contact__Group_5__03591 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__Contact__Group_5__0__Impl3619 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Contact__Group_5__1__Impl_in_rule__Contact__Group_5__13650 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Contact__AdresseAssignment_5_1_in_rule__Contact__Group_5__1__Impl3677 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Contact__Group_6__0__Impl_in_rule__Contact__Group_6__03711 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Contact__Group_6__1_in_rule__Contact__Group_6__03714 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__Contact__Group_6__0__Impl3742 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Contact__Group_6__1__Impl_in_rule__Contact__Group_6__13773 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_rule__Contact__Group_6__2_in_rule__Contact__Group_6__13776 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Contact__MailAssignment_6_1_in_rule__Contact__Group_6__1__Impl3805 = new BitSet(new long[]{0x0000000000000032L});
        public static final BitSet FOLLOW_rule__Contact__MailAssignment_6_1_in_rule__Contact__Group_6__1__Impl3817 = new BitSet(new long[]{0x0000000000000032L});
        public static final BitSet FOLLOW_rule__Contact__Group_6__2__Impl_in_rule__Contact__Group_6__23850 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Contact__Group_6__3_in_rule__Contact__Group_6__23853 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__Contact__Group_6__2__Impl3881 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Contact__Group_6__3__Impl_in_rule__Contact__Group_6__33912 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_rule__Contact__Group_6__4_in_rule__Contact__Group_6__33915 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Contact__Group_6__3__Impl3945 = new BitSet(new long[]{0x0000000000000032L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Contact__Group_6__3__Impl3958 = new BitSet(new long[]{0x0000000000000032L});
        public static final BitSet FOLLOW_rule__Contact__Group_6__4__Impl_in_rule__Contact__Group_6__43991 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Contact__Group_6__5_in_rule__Contact__Group_6__43994 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__Contact__Group_6__4__Impl4022 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Contact__Group_6__5__Impl_in_rule__Contact__Group_6__54053 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Contact__Group_6__6_in_rule__Contact__Group_6__54056 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Contact__Group_6__5__Impl4083 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Contact__Group_6__6__Impl_in_rule__Contact__Group_6__64112 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Contact__Group_6__7_in_rule__Contact__Group_6__64115 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Contact__Group_6__6__Impl4142 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Contact__Group_6__7__Impl_in_rule__Contact__Group_6__74171 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Contact__Group_6__7__Impl4198 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Contact__Group_7__0__Impl_in_rule__Contact__Group_7__04243 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Contact__Group_7__1_in_rule__Contact__Group_7__04246 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__Contact__Group_7__0__Impl4274 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Contact__Group_7__1__Impl_in_rule__Contact__Group_7__14305 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Contact__TelephoneAssignment_7_1_in_rule__Contact__Group_7__1__Impl4332 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Rubriques__Group__0__Impl_in_rule__Rubriques__Group__04366 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_rule__Rubriques__Group__1_in_rule__Rubriques__Group__04369 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Rubriques__Group__1__Impl_in_rule__Rubriques__Group__14427 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__Rubriques__Group__2_in_rule__Rubriques__Group__14430 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__Rubriques__Group__1__Impl4458 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Rubriques__Group__2__Impl_in_rule__Rubriques__Group__24489 = new BitSet(new long[]{0x0000000180020000L});
        public static final BitSet FOLLOW_rule__Rubriques__Group__3_in_rule__Rubriques__Group__24492 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Rubriques__Group__2__Impl4520 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Rubriques__Group__3__Impl_in_rule__Rubriques__Group__34551 = new BitSet(new long[]{0x0000000180020000L});
        public static final BitSet FOLLOW_rule__Rubriques__Group__4_in_rule__Rubriques__Group__34554 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Rubriques__Group_3__0_in_rule__Rubriques__Group__3__Impl4581 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Rubriques__Group__4__Impl_in_rule__Rubriques__Group__44612 = new BitSet(new long[]{0x0000000180020000L});
        public static final BitSet FOLLOW_rule__Rubriques__Group__5_in_rule__Rubriques__Group__44615 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Rubriques__Group_4__0_in_rule__Rubriques__Group__4__Impl4642 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Rubriques__Group__5__Impl_in_rule__Rubriques__Group__54673 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__Rubriques__Group__5__Impl4701 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Rubriques__Group_3__0__Impl_in_rule__Rubriques__Group_3__04744 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Rubriques__Group_3__1_in_rule__Rubriques__Group_3__04747 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__Rubriques__Group_3__0__Impl4775 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Rubriques__Group_3__1__Impl_in_rule__Rubriques__Group_3__14806 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Rubriques__TexteAssignment_3_1_in_rule__Rubriques__Group_3__1__Impl4833 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Rubriques__Group_4__0__Impl_in_rule__Rubriques__Group_4__04867 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Rubriques__Group_4__1_in_rule__Rubriques__Group_4__04870 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_rule__Rubriques__Group_4__0__Impl4898 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Rubriques__Group_4__1__Impl_in_rule__Rubriques__Group_4__14929 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Rubriques__LienAssignment_4_1_in_rule__Rubriques__Group_4__1__Impl4956 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Fichiers__Group__0__Impl_in_rule__Fichiers__Group__04990 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_rule__Fichiers__Group__1_in_rule__Fichiers__Group__04993 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Fichiers__Group__1__Impl_in_rule__Fichiers__Group__15051 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__Fichiers__Group__2_in_rule__Fichiers__Group__15054 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_rule__Fichiers__Group__1__Impl5082 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Fichiers__Group__2__Impl_in_rule__Fichiers__Group__25113 = new BitSet(new long[]{0x0000001C00820000L});
        public static final BitSet FOLLOW_rule__Fichiers__Group__3_in_rule__Fichiers__Group__25116 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Fichiers__Group__2__Impl5144 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Fichiers__Group__3__Impl_in_rule__Fichiers__Group__35175 = new BitSet(new long[]{0x0000001C00820000L});
        public static final BitSet FOLLOW_rule__Fichiers__Group__4_in_rule__Fichiers__Group__35178 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Fichiers__Group_3__0_in_rule__Fichiers__Group__3__Impl5205 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Fichiers__Group__4__Impl_in_rule__Fichiers__Group__45236 = new BitSet(new long[]{0x0000001C00820000L});
        public static final BitSet FOLLOW_rule__Fichiers__Group__5_in_rule__Fichiers__Group__45239 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Fichiers__Group_4__0_in_rule__Fichiers__Group__4__Impl5266 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Fichiers__Group__5__Impl_in_rule__Fichiers__Group__55297 = new BitSet(new long[]{0x0000001C00820000L});
        public static final BitSet FOLLOW_rule__Fichiers__Group__6_in_rule__Fichiers__Group__55300 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Fichiers__Group_5__0_in_rule__Fichiers__Group__5__Impl5327 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Fichiers__Group__6__Impl_in_rule__Fichiers__Group__65358 = new BitSet(new long[]{0x0000001C00820000L});
        public static final BitSet FOLLOW_rule__Fichiers__Group__7_in_rule__Fichiers__Group__65361 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Fichiers__Group_6__0_in_rule__Fichiers__Group__6__Impl5388 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Fichiers__Group__7__Impl_in_rule__Fichiers__Group__75419 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__Fichiers__Group__7__Impl5447 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Fichiers__Group_3__0__Impl_in_rule__Fichiers__Group_3__05494 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Fichiers__Group_3__1_in_rule__Fichiers__Group_3__05497 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_rule__Fichiers__Group_3__0__Impl5525 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Fichiers__Group_3__1__Impl_in_rule__Fichiers__Group_3__15556 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Fichiers__TypeAssignment_3_1_in_rule__Fichiers__Group_3__1__Impl5583 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Fichiers__Group_4__0__Impl_in_rule__Fichiers__Group_4__05617 = new BitSet(new long[]{0x0001000000000040L});
        public static final BitSet FOLLOW_rule__Fichiers__Group_4__1_in_rule__Fichiers__Group_4__05620 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_rule__Fichiers__Group_4__0__Impl5648 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Fichiers__Group_4__1__Impl_in_rule__Fichiers__Group_4__15679 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Fichiers__TailleAssignment_4_1_in_rule__Fichiers__Group_4__1__Impl5706 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Fichiers__Group_5__0__Impl_in_rule__Fichiers__Group_5__05740 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Fichiers__Group_5__1_in_rule__Fichiers__Group_5__05743 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__Fichiers__Group_5__0__Impl5771 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Fichiers__Group_5__1__Impl_in_rule__Fichiers__Group_5__15802 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Fichiers__NomAssignment_5_1_in_rule__Fichiers__Group_5__1__Impl5829 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Fichiers__Group_6__0__Impl_in_rule__Fichiers__Group_6__05863 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Fichiers__Group_6__1_in_rule__Fichiers__Group_6__05866 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_rule__Fichiers__Group_6__0__Impl5894 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Fichiers__Group_6__1__Impl_in_rule__Fichiers__Group_6__15925 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Fichiers__EmplacementAssignment_6_1_in_rule__Fichiers__Group_6__1__Impl5952 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConfigurationPage__Group__0__Impl_in_rule__ConfigurationPage__Group__05986 = new BitSet(new long[]{0x0000002000000000L});
        public static final BitSet FOLLOW_rule__ConfigurationPage__Group__1_in_rule__ConfigurationPage__Group__05989 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConfigurationPage__Group__1__Impl_in_rule__ConfigurationPage__Group__16047 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__ConfigurationPage__Group__2_in_rule__ConfigurationPage__Group__16050 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_rule__ConfigurationPage__Group__1__Impl6078 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConfigurationPage__Group__2__Impl_in_rule__ConfigurationPage__Group__26109 = new BitSet(new long[]{0x000007C000020000L});
        public static final BitSet FOLLOW_rule__ConfigurationPage__Group__3_in_rule__ConfigurationPage__Group__26112 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__ConfigurationPage__Group__2__Impl6140 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConfigurationPage__Group__3__Impl_in_rule__ConfigurationPage__Group__36171 = new BitSet(new long[]{0x000007C000020000L});
        public static final BitSet FOLLOW_rule__ConfigurationPage__Group__4_in_rule__ConfigurationPage__Group__36174 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConfigurationPage__Group_3__0_in_rule__ConfigurationPage__Group__3__Impl6201 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConfigurationPage__Group__4__Impl_in_rule__ConfigurationPage__Group__46232 = new BitSet(new long[]{0x000007C000020000L});
        public static final BitSet FOLLOW_rule__ConfigurationPage__Group__5_in_rule__ConfigurationPage__Group__46235 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConfigurationPage__Group_4__0_in_rule__ConfigurationPage__Group__4__Impl6262 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConfigurationPage__Group__5__Impl_in_rule__ConfigurationPage__Group__56293 = new BitSet(new long[]{0x000007C000020000L});
        public static final BitSet FOLLOW_rule__ConfigurationPage__Group__6_in_rule__ConfigurationPage__Group__56296 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConfigurationPage__Group_5__0_in_rule__ConfigurationPage__Group__5__Impl6323 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConfigurationPage__Group__6__Impl_in_rule__ConfigurationPage__Group__66354 = new BitSet(new long[]{0x000007C000020000L});
        public static final BitSet FOLLOW_rule__ConfigurationPage__Group__7_in_rule__ConfigurationPage__Group__66357 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConfigurationPage__Group_6__0_in_rule__ConfigurationPage__Group__6__Impl6384 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConfigurationPage__Group__7__Impl_in_rule__ConfigurationPage__Group__76415 = new BitSet(new long[]{0x000007C000020000L});
        public static final BitSet FOLLOW_rule__ConfigurationPage__Group__8_in_rule__ConfigurationPage__Group__76418 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConfigurationPage__Group_7__0_in_rule__ConfigurationPage__Group__7__Impl6445 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConfigurationPage__Group__8__Impl_in_rule__ConfigurationPage__Group__86476 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__ConfigurationPage__Group__8__Impl6504 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConfigurationPage__Group_3__0__Impl_in_rule__ConfigurationPage__Group_3__06553 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__ConfigurationPage__Group_3__1_in_rule__ConfigurationPage__Group_3__06556 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_rule__ConfigurationPage__Group_3__0__Impl6584 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConfigurationPage__Group_3__1__Impl_in_rule__ConfigurationPage__Group_3__16615 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConfigurationPage__CouleurFondAssignment_3_1_in_rule__ConfigurationPage__Group_3__1__Impl6642 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConfigurationPage__Group_4__0__Impl_in_rule__ConfigurationPage__Group_4__06676 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__ConfigurationPage__Group_4__1_in_rule__ConfigurationPage__Group_4__06679 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_rule__ConfigurationPage__Group_4__0__Impl6707 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConfigurationPage__Group_4__1__Impl_in_rule__ConfigurationPage__Group_4__16738 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConfigurationPage__TitreSiteAssignment_4_1_in_rule__ConfigurationPage__Group_4__1__Impl6765 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConfigurationPage__Group_5__0__Impl_in_rule__ConfigurationPage__Group_5__06799 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__ConfigurationPage__Group_5__1_in_rule__ConfigurationPage__Group_5__06802 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_rule__ConfigurationPage__Group_5__0__Impl6830 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConfigurationPage__Group_5__1__Impl_in_rule__ConfigurationPage__Group_5__16861 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConfigurationPage__AuteursAssignment_5_1_in_rule__ConfigurationPage__Group_5__1__Impl6888 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConfigurationPage__Group_6__0__Impl_in_rule__ConfigurationPage__Group_6__06922 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__ConfigurationPage__Group_6__1_in_rule__ConfigurationPage__Group_6__06925 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_rule__ConfigurationPage__Group_6__0__Impl6953 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConfigurationPage__Group_6__1__Impl_in_rule__ConfigurationPage__Group_6__16984 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConfigurationPage__CouleurPoliceAssignment_6_1_in_rule__ConfigurationPage__Group_6__1__Impl7011 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConfigurationPage__Group_7__0__Impl_in_rule__ConfigurationPage__Group_7__07045 = new BitSet(new long[]{0x0001000000000040L});
        public static final BitSet FOLLOW_rule__ConfigurationPage__Group_7__1_in_rule__ConfigurationPage__Group_7__07048 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_42_in_rule__ConfigurationPage__Group_7__0__Impl7076 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConfigurationPage__Group_7__1__Impl_in_rule__ConfigurationPage__Group_7__17107 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConfigurationPage__TaillePoliceAssignment_7_1_in_rule__ConfigurationPage__Group_7__1__Impl7134 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PageInterne__Group__0__Impl_in_rule__PageInterne__Group__07168 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__PageInterne__Group__1_in_rule__PageInterne__Group__07171 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_43_in_rule__PageInterne__Group__0__Impl7199 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PageInterne__Group__1__Impl_in_rule__PageInterne__Group__17230 = new BitSet(new long[]{0x0000F00080000000L});
        public static final BitSet FOLLOW_rule__PageInterne__Group__2_in_rule__PageInterne__Group__17233 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__PageInterne__Group__1__Impl7261 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PageInterne__Group__2__Impl_in_rule__PageInterne__Group__27292 = new BitSet(new long[]{0x0000F00080000000L});
        public static final BitSet FOLLOW_rule__PageInterne__Group__3_in_rule__PageInterne__Group__27295 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PageInterne__Group_2__0_in_rule__PageInterne__Group__2__Impl7322 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PageInterne__Group__3__Impl_in_rule__PageInterne__Group__37353 = new BitSet(new long[]{0x0000F00080000000L});
        public static final BitSet FOLLOW_rule__PageInterne__Group__4_in_rule__PageInterne__Group__37356 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PageInterne__Group_3__0_in_rule__PageInterne__Group__3__Impl7383 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PageInterne__Group__4__Impl_in_rule__PageInterne__Group__47414 = new BitSet(new long[]{0x0000F00080000000L});
        public static final BitSet FOLLOW_rule__PageInterne__Group__5_in_rule__PageInterne__Group__47417 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PageInterne__Group_4__0_in_rule__PageInterne__Group__4__Impl7444 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PageInterne__Group__5__Impl_in_rule__PageInterne__Group__57475 = new BitSet(new long[]{0x0000F00080000000L});
        public static final BitSet FOLLOW_rule__PageInterne__Group__6_in_rule__PageInterne__Group__57478 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PageInterne__Group_5__0_in_rule__PageInterne__Group__5__Impl7505 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PageInterne__Group__6__Impl_in_rule__PageInterne__Group__67536 = new BitSet(new long[]{0x0040000000000000L});
        public static final BitSet FOLLOW_rule__PageInterne__Group__7_in_rule__PageInterne__Group__67539 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_44_in_rule__PageInterne__Group__6__Impl7567 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PageInterne__Group__7__Impl_in_rule__PageInterne__Group__77598 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_rule__PageInterne__Group__8_in_rule__PageInterne__Group__77601 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PageInterne__PhotoAssignment_7_in_rule__PageInterne__Group__7__Impl7628 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PageInterne__Group__8__Impl_in_rule__PageInterne__Group__87658 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__PageInterne__Group__8__Impl7686 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PageInterne__Group_2__0__Impl_in_rule__PageInterne__Group_2__07735 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__PageInterne__Group_2__1_in_rule__PageInterne__Group_2__07738 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_45_in_rule__PageInterne__Group_2__0__Impl7766 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PageInterne__Group_2__1__Impl_in_rule__PageInterne__Group_2__17797 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PageInterne__TitrePageAssignment_2_1_in_rule__PageInterne__Group_2__1__Impl7824 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PageInterne__Group_3__0__Impl_in_rule__PageInterne__Group_3__07858 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__PageInterne__Group_3__1_in_rule__PageInterne__Group_3__07861 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__PageInterne__Group_3__0__Impl7889 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PageInterne__Group_3__1__Impl_in_rule__PageInterne__Group_3__17920 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PageInterne__TexteAssignment_3_1_in_rule__PageInterne__Group_3__1__Impl7947 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PageInterne__Group_4__0__Impl_in_rule__PageInterne__Group_4__07981 = new BitSet(new long[]{0x0302000000000000L});
        public static final BitSet FOLLOW_rule__PageInterne__Group_4__1_in_rule__PageInterne__Group_4__07984 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_46_in_rule__PageInterne__Group_4__0__Impl8012 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PageInterne__Group_4__1__Impl_in_rule__PageInterne__Group_4__18043 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PageInterne__TypesAssignment_4_1_in_rule__PageInterne__Group_4__1__Impl8070 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PageInterne__Group_5__0__Impl_in_rule__PageInterne__Group_5__08104 = new BitSet(new long[]{0x0004000000000000L});
        public static final BitSet FOLLOW_rule__PageInterne__Group_5__1_in_rule__PageInterne__Group_5__08107 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_47_in_rule__PageInterne__Group_5__0__Impl8135 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PageInterne__Group_5__1__Impl_in_rule__PageInterne__Group_5__18166 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PageInterne__LiensAssignment_5_1_in_rule__PageInterne__Group_5__1__Impl8193 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EInt__Group__0__Impl_in_rule__EInt__Group__08227 = new BitSet(new long[]{0x0001000000000040L});
        public static final BitSet FOLLOW_rule__EInt__Group__1_in_rule__EInt__Group__08230 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_48_in_rule__EInt__Group__0__Impl8259 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EInt__Group__1__Impl_in_rule__EInt__Group__18292 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__EInt__Group__1__Impl8319 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Types__Group__0__Impl_in_rule__Types__Group__08352 = new BitSet(new long[]{0x0302000000000000L});
        public static final BitSet FOLLOW_rule__Types__Group__1_in_rule__Types__Group__08355 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Types__Group__1__Impl_in_rule__Types__Group__18413 = new BitSet(new long[]{0x0302000000000000L});
        public static final BitSet FOLLOW_rule__Types__Group__2_in_rule__Types__Group__18416 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Types__GrasAssignment_1_in_rule__Types__Group__1__Impl8443 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Types__Group__2__Impl_in_rule__Types__Group__28474 = new BitSet(new long[]{0x0302000000000000L});
        public static final BitSet FOLLOW_rule__Types__Group__3_in_rule__Types__Group__28477 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Types__ItaliqueAssignment_2_in_rule__Types__Group__2__Impl8504 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Types__Group__3__Impl_in_rule__Types__Group__38535 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_49_in_rule__Types__Group__3__Impl8563 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Liens__Group__0__Impl_in_rule__Liens__Group__08602 = new BitSet(new long[]{0x0004000000000000L});
        public static final BitSet FOLLOW_rule__Liens__Group__1_in_rule__Liens__Group__08605 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Liens__Group__1__Impl_in_rule__Liens__Group__18663 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__Liens__Group__2_in_rule__Liens__Group__18666 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_50_in_rule__Liens__Group__1__Impl8694 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Liens__Group__2__Impl_in_rule__Liens__Group__28725 = new BitSet(new long[]{0x0038000000020000L});
        public static final BitSet FOLLOW_rule__Liens__Group__3_in_rule__Liens__Group__28728 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Liens__Group__2__Impl8756 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Liens__Group__3__Impl_in_rule__Liens__Group__38787 = new BitSet(new long[]{0x0038000000020000L});
        public static final BitSet FOLLOW_rule__Liens__Group__4_in_rule__Liens__Group__38790 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Liens__Group_3__0_in_rule__Liens__Group__3__Impl8817 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Liens__Group__4__Impl_in_rule__Liens__Group__48848 = new BitSet(new long[]{0x0038000000020000L});
        public static final BitSet FOLLOW_rule__Liens__Group__5_in_rule__Liens__Group__48851 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Liens__Group_4__0_in_rule__Liens__Group__4__Impl8878 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Liens__Group__5__Impl_in_rule__Liens__Group__58909 = new BitSet(new long[]{0x0038000000020000L});
        public static final BitSet FOLLOW_rule__Liens__Group__6_in_rule__Liens__Group__58912 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Liens__Group_5__0_in_rule__Liens__Group__5__Impl8939 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Liens__Group__6__Impl_in_rule__Liens__Group__68970 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__Liens__Group__6__Impl8998 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Liens__Group_3__0__Impl_in_rule__Liens__Group_3__09043 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Liens__Group_3__1_in_rule__Liens__Group_3__09046 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_51_in_rule__Liens__Group_3__0__Impl9074 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Liens__Group_3__1__Impl_in_rule__Liens__Group_3__19105 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Liens__FichierAssignment_3_1_in_rule__Liens__Group_3__1__Impl9132 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Liens__Group_4__0__Impl_in_rule__Liens__Group_4__09166 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Liens__Group_4__1_in_rule__Liens__Group_4__09169 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_52_in_rule__Liens__Group_4__0__Impl9197 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Liens__Group_4__1__Impl_in_rule__Liens__Group_4__19228 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Liens__AdresseWebAssignment_4_1_in_rule__Liens__Group_4__1__Impl9255 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Liens__Group_5__0__Impl_in_rule__Liens__Group_5__09289 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Liens__Group_5__1_in_rule__Liens__Group_5__09292 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_53_in_rule__Liens__Group_5__0__Impl9320 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Liens__Group_5__1__Impl_in_rule__Liens__Group_5__19351 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Liens__PageInterneAssignment_5_1_in_rule__Liens__Group_5__1__Impl9378 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Photo__Group__0__Impl_in_rule__Photo__Group__09412 = new BitSet(new long[]{0x0040000000000000L});
        public static final BitSet FOLLOW_rule__Photo__Group__1_in_rule__Photo__Group__09415 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Photo__Group__1__Impl_in_rule__Photo__Group__19473 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__Photo__Group__2_in_rule__Photo__Group__19476 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_54_in_rule__Photo__Group__1__Impl9504 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Photo__Group__2__Impl_in_rule__Photo__Group__29535 = new BitSet(new long[]{0x0080000800820000L});
        public static final BitSet FOLLOW_rule__Photo__Group__3_in_rule__Photo__Group__29538 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Photo__Group__2__Impl9566 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Photo__Group__3__Impl_in_rule__Photo__Group__39597 = new BitSet(new long[]{0x0080000800820000L});
        public static final BitSet FOLLOW_rule__Photo__Group__4_in_rule__Photo__Group__39600 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Photo__Group_3__0_in_rule__Photo__Group__3__Impl9627 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Photo__Group__4__Impl_in_rule__Photo__Group__49658 = new BitSet(new long[]{0x0080000800820000L});
        public static final BitSet FOLLOW_rule__Photo__Group__5_in_rule__Photo__Group__49661 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Photo__Group_4__0_in_rule__Photo__Group__4__Impl9688 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Photo__Group__5__Impl_in_rule__Photo__Group__59719 = new BitSet(new long[]{0x0080000800820000L});
        public static final BitSet FOLLOW_rule__Photo__Group__6_in_rule__Photo__Group__59722 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Photo__Group_5__0_in_rule__Photo__Group__5__Impl9749 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Photo__Group__6__Impl_in_rule__Photo__Group__69780 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__Photo__Group__6__Impl9808 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Photo__Group_3__0__Impl_in_rule__Photo__Group_3__09853 = new BitSet(new long[]{0x0001000010000040L});
        public static final BitSet FOLLOW_rule__Photo__Group_3__1_in_rule__Photo__Group_3__09856 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_rule__Photo__Group_3__0__Impl9884 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Photo__Group_3__1__Impl_in_rule__Photo__Group_3__19915 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Photo__TailleAssignment_3_1_in_rule__Photo__Group_3__1__Impl9942 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Photo__Group_4__0__Impl_in_rule__Photo__Group_4__09976 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Photo__Group_4__1_in_rule__Photo__Group_4__09979 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_55_in_rule__Photo__Group_4__0__Impl10007 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Photo__Group_4__1__Impl_in_rule__Photo__Group_4__110038 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Photo__ExtensionAssignment_4_1_in_rule__Photo__Group_4__1__Impl10065 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Photo__Group_5__0__Impl_in_rule__Photo__Group_5__010099 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Photo__Group_5__1_in_rule__Photo__Group_5__010102 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__Photo__Group_5__0__Impl10130 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Photo__Group_5__1__Impl_in_rule__Photo__Group_5__110161 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Photo__NomAssignment_5_1_in_rule__Photo__Group_5__1__Impl10188 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EFloat__Group__0__Impl_in_rule__EFloat__Group__010222 = new BitSet(new long[]{0x0001000010000040L});
        public static final BitSet FOLLOW_rule__EFloat__Group__1_in_rule__EFloat__Group__010225 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_48_in_rule__EFloat__Group__0__Impl10254 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EFloat__Group__1__Impl_in_rule__EFloat__Group__110287 = new BitSet(new long[]{0x0001000010000040L});
        public static final BitSet FOLLOW_rule__EFloat__Group__2_in_rule__EFloat__Group__110290 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__EFloat__Group__1__Impl10318 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EFloat__Group__2__Impl_in_rule__EFloat__Group__210349 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_rule__EFloat__Group__3_in_rule__EFloat__Group__210352 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__EFloat__Group__2__Impl10380 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EFloat__Group__3__Impl_in_rule__EFloat__Group__310411 = new BitSet(new long[]{0x0000000000001800L});
        public static final BitSet FOLLOW_rule__EFloat__Group__4_in_rule__EFloat__Group__310414 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__EFloat__Group__3__Impl10441 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EFloat__Group__4__Impl_in_rule__EFloat__Group__410470 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EFloat__Group_4__0_in_rule__EFloat__Group__4__Impl10497 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EFloat__Group_4__0__Impl_in_rule__EFloat__Group_4__010538 = new BitSet(new long[]{0x0001000000000040L});
        public static final BitSet FOLLOW_rule__EFloat__Group_4__1_in_rule__EFloat__Group_4__010541 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EFloat__Alternatives_4_0_in_rule__EFloat__Group_4__0__Impl10568 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EFloat__Group_4__1__Impl_in_rule__EFloat__Group_4__110598 = new BitSet(new long[]{0x0001000000000040L});
        public static final BitSet FOLLOW_rule__EFloat__Group_4__2_in_rule__EFloat__Group_4__110601 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_48_in_rule__EFloat__Group_4__1__Impl10630 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EFloat__Group_4__2__Impl_in_rule__EFloat__Group_4__210663 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__EFloat__Group_4__2__Impl10690 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConfigurationPage_in_rule__PagePrincipale__ConfigurationPageAssignment_310730 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleContact_in_rule__PagePrincipale__ContactsAssignment_610761 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleContact_in_rule__PagePrincipale__ContactsAssignment_7_110792 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePageInterne_in_rule__PagePrincipale__PagesAssignment_1110823 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePageInterne_in_rule__PagePrincipale__PagesAssignment_12_110854 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRubriques_in_rule__PagePrincipale__RubriquesAssignment_14_110885 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFichiers_in_rule__PagePrincipale__FichiersAssignment_15_210916 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFichiers_in_rule__PagePrincipale__FichiersAssignment_15_3_110947 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Contact__NomAssignment_3_110978 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Contact__PrenomAssignment_4_111009 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Contact__AdresseAssignment_5_111040 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Contact__MailAssignment_6_111071 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Contact__TelephoneAssignment_7_111102 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Rubriques__TexteAssignment_3_111133 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Rubriques__LienAssignment_4_111164 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Fichiers__TypeAssignment_3_111195 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_rule__Fichiers__TailleAssignment_4_111226 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Fichiers__NomAssignment_5_111257 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Fichiers__EmplacementAssignment_6_111288 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__ConfigurationPage__CouleurFondAssignment_3_111319 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__ConfigurationPage__TitreSiteAssignment_4_111350 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__ConfigurationPage__AuteursAssignment_5_111381 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__ConfigurationPage__CouleurPoliceAssignment_6_111412 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_rule__ConfigurationPage__TaillePoliceAssignment_7_111443 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__PageInterne__TitrePageAssignment_2_111474 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__PageInterne__TexteAssignment_3_111505 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypes_in_rule__PageInterne__TypesAssignment_4_111536 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLiens_in_rule__PageInterne__LiensAssignment_5_111567 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePhoto_in_rule__PageInterne__PhotoAssignment_711598 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_56_in_rule__Types__GrasAssignment_111634 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_57_in_rule__Types__ItaliqueAssignment_211678 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Liens__FichierAssignment_3_111717 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Liens__AdresseWebAssignment_4_111748 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Liens__PageInterneAssignment_5_111779 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEFloat_in_rule__Photo__TailleAssignment_3_111810 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Photo__ExtensionAssignment_4_111841 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Photo__NomAssignment_5_111872 = new BitSet(new long[]{0x0000000000000002L});
    }


}