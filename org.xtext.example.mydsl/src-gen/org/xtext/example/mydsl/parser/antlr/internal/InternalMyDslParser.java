package org.xtext.example.mydsl.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'PagePrincipale'", "'{'", "'contacts'", "','", "'}'", "'rubriques'", "'fichiers'", "'configurationPage'", "'pages'", "'Contact'", "'nom'", "'prenom'", "'adresse'", "'mail'", "'telephone'", "'Rubriques'", "'texte'", "'lien'", "'Fichiers'", "'type'", "'taille'", "'emplacement'", "'ConfigurationPage'", "'couleurFond'", "'titreSite'", "'auteurs'", "'couleurPolice'", "'taillePolice'", "'PageInterne'", "'titrePage'", "'types'", "'liens'", "'photo'", "'-'", "'gras'", "'italique'", "'Types'", "'Liens'", "'fichier'", "'adresseWeb'", "'pageInterne'", "'Photo'", "'extension'", "'.'", "'E'", "'e'"
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
    public String getGrammarFileName() { return "../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g"; }



     	private MyDslGrammarAccess grammarAccess;
     	
        public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "PagePrincipale";	
       	}
       	
       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRulePagePrincipale"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:67:1: entryRulePagePrincipale returns [EObject current=null] : iv_rulePagePrincipale= rulePagePrincipale EOF ;
    public final EObject entryRulePagePrincipale() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePagePrincipale = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:68:2: (iv_rulePagePrincipale= rulePagePrincipale EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:69:2: iv_rulePagePrincipale= rulePagePrincipale EOF
            {
             newCompositeNode(grammarAccess.getPagePrincipaleRule()); 
            pushFollow(FollowSets000.FOLLOW_rulePagePrincipale_in_entryRulePagePrincipale75);
            iv_rulePagePrincipale=rulePagePrincipale();

            state._fsp--;

             current =iv_rulePagePrincipale; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePagePrincipale85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePagePrincipale"


    // $ANTLR start "rulePagePrincipale"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:76:1: rulePagePrincipale returns [EObject current=null] : (otherlv_0= 'PagePrincipale' otherlv_1= '{' otherlv_2= 'contacts' otherlv_3= '{' ( (lv_contacts_4_0= ruleContact ) ) (otherlv_5= ',' ( (lv_contacts_6_0= ruleContact ) ) )* otherlv_7= '}' (otherlv_8= 'rubriques' ( (lv_rubriques_9_0= ruleRubriques ) ) )? (otherlv_10= 'fichiers' otherlv_11= '{' ( (lv_fichiers_12_0= ruleFichiers ) ) (otherlv_13= ',' ( (lv_fichiers_14_0= ruleFichiers ) ) )* otherlv_15= '}' )? otherlv_16= 'configurationPage' ( (lv_configurationPage_17_0= ruleConfigurationPage ) ) otherlv_18= 'pages' otherlv_19= '{' ( (lv_pages_20_0= rulePageInterne ) ) (otherlv_21= ',' ( (lv_pages_22_0= rulePageInterne ) ) )* otherlv_23= '}' otherlv_24= '}' ) ;
    public final EObject rulePagePrincipale() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        EObject lv_contacts_4_0 = null;

        EObject lv_contacts_6_0 = null;

        EObject lv_rubriques_9_0 = null;

        EObject lv_fichiers_12_0 = null;

        EObject lv_fichiers_14_0 = null;

        EObject lv_configurationPage_17_0 = null;

        EObject lv_pages_20_0 = null;

        EObject lv_pages_22_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:79:28: ( (otherlv_0= 'PagePrincipale' otherlv_1= '{' otherlv_2= 'contacts' otherlv_3= '{' ( (lv_contacts_4_0= ruleContact ) ) (otherlv_5= ',' ( (lv_contacts_6_0= ruleContact ) ) )* otherlv_7= '}' (otherlv_8= 'rubriques' ( (lv_rubriques_9_0= ruleRubriques ) ) )? (otherlv_10= 'fichiers' otherlv_11= '{' ( (lv_fichiers_12_0= ruleFichiers ) ) (otherlv_13= ',' ( (lv_fichiers_14_0= ruleFichiers ) ) )* otherlv_15= '}' )? otherlv_16= 'configurationPage' ( (lv_configurationPage_17_0= ruleConfigurationPage ) ) otherlv_18= 'pages' otherlv_19= '{' ( (lv_pages_20_0= rulePageInterne ) ) (otherlv_21= ',' ( (lv_pages_22_0= rulePageInterne ) ) )* otherlv_23= '}' otherlv_24= '}' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:80:1: (otherlv_0= 'PagePrincipale' otherlv_1= '{' otherlv_2= 'contacts' otherlv_3= '{' ( (lv_contacts_4_0= ruleContact ) ) (otherlv_5= ',' ( (lv_contacts_6_0= ruleContact ) ) )* otherlv_7= '}' (otherlv_8= 'rubriques' ( (lv_rubriques_9_0= ruleRubriques ) ) )? (otherlv_10= 'fichiers' otherlv_11= '{' ( (lv_fichiers_12_0= ruleFichiers ) ) (otherlv_13= ',' ( (lv_fichiers_14_0= ruleFichiers ) ) )* otherlv_15= '}' )? otherlv_16= 'configurationPage' ( (lv_configurationPage_17_0= ruleConfigurationPage ) ) otherlv_18= 'pages' otherlv_19= '{' ( (lv_pages_20_0= rulePageInterne ) ) (otherlv_21= ',' ( (lv_pages_22_0= rulePageInterne ) ) )* otherlv_23= '}' otherlv_24= '}' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:80:1: (otherlv_0= 'PagePrincipale' otherlv_1= '{' otherlv_2= 'contacts' otherlv_3= '{' ( (lv_contacts_4_0= ruleContact ) ) (otherlv_5= ',' ( (lv_contacts_6_0= ruleContact ) ) )* otherlv_7= '}' (otherlv_8= 'rubriques' ( (lv_rubriques_9_0= ruleRubriques ) ) )? (otherlv_10= 'fichiers' otherlv_11= '{' ( (lv_fichiers_12_0= ruleFichiers ) ) (otherlv_13= ',' ( (lv_fichiers_14_0= ruleFichiers ) ) )* otherlv_15= '}' )? otherlv_16= 'configurationPage' ( (lv_configurationPage_17_0= ruleConfigurationPage ) ) otherlv_18= 'pages' otherlv_19= '{' ( (lv_pages_20_0= rulePageInterne ) ) (otherlv_21= ',' ( (lv_pages_22_0= rulePageInterne ) ) )* otherlv_23= '}' otherlv_24= '}' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:80:3: otherlv_0= 'PagePrincipale' otherlv_1= '{' otherlv_2= 'contacts' otherlv_3= '{' ( (lv_contacts_4_0= ruleContact ) ) (otherlv_5= ',' ( (lv_contacts_6_0= ruleContact ) ) )* otherlv_7= '}' (otherlv_8= 'rubriques' ( (lv_rubriques_9_0= ruleRubriques ) ) )? (otherlv_10= 'fichiers' otherlv_11= '{' ( (lv_fichiers_12_0= ruleFichiers ) ) (otherlv_13= ',' ( (lv_fichiers_14_0= ruleFichiers ) ) )* otherlv_15= '}' )? otherlv_16= 'configurationPage' ( (lv_configurationPage_17_0= ruleConfigurationPage ) ) otherlv_18= 'pages' otherlv_19= '{' ( (lv_pages_20_0= rulePageInterne ) ) (otherlv_21= ',' ( (lv_pages_22_0= rulePageInterne ) ) )* otherlv_23= '}' otherlv_24= '}'
            {
            otherlv_0=(Token)match(input,11,FollowSets000.FOLLOW_11_in_rulePagePrincipale122); 

                	newLeafNode(otherlv_0, grammarAccess.getPagePrincipaleAccess().getPagePrincipaleKeyword_0());
                
            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_rulePagePrincipale134); 

                	newLeafNode(otherlv_1, grammarAccess.getPagePrincipaleAccess().getLeftCurlyBracketKeyword_1());
                
            otherlv_2=(Token)match(input,13,FollowSets000.FOLLOW_13_in_rulePagePrincipale146); 

                	newLeafNode(otherlv_2, grammarAccess.getPagePrincipaleAccess().getContactsKeyword_2());
                
            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_rulePagePrincipale158); 

                	newLeafNode(otherlv_3, grammarAccess.getPagePrincipaleAccess().getLeftCurlyBracketKeyword_3());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:96:1: ( (lv_contacts_4_0= ruleContact ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:97:1: (lv_contacts_4_0= ruleContact )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:97:1: (lv_contacts_4_0= ruleContact )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:98:3: lv_contacts_4_0= ruleContact
            {
             
            	        newCompositeNode(grammarAccess.getPagePrincipaleAccess().getContactsContactParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleContact_in_rulePagePrincipale179);
            lv_contacts_4_0=ruleContact();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPagePrincipaleRule());
            	        }
                   		add(
                   			current, 
                   			"contacts",
                    		lv_contacts_4_0, 
                    		"Contact");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:114:2: (otherlv_5= ',' ( (lv_contacts_6_0= ruleContact ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==14) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:114:4: otherlv_5= ',' ( (lv_contacts_6_0= ruleContact ) )
            	    {
            	    otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_14_in_rulePagePrincipale192); 

            	        	newLeafNode(otherlv_5, grammarAccess.getPagePrincipaleAccess().getCommaKeyword_5_0());
            	        
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:118:1: ( (lv_contacts_6_0= ruleContact ) )
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:119:1: (lv_contacts_6_0= ruleContact )
            	    {
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:119:1: (lv_contacts_6_0= ruleContact )
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:120:3: lv_contacts_6_0= ruleContact
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPagePrincipaleAccess().getContactsContactParserRuleCall_5_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleContact_in_rulePagePrincipale213);
            	    lv_contacts_6_0=ruleContact();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPagePrincipaleRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"contacts",
            	            		lv_contacts_6_0, 
            	            		"Contact");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_7=(Token)match(input,15,FollowSets000.FOLLOW_15_in_rulePagePrincipale227); 

                	newLeafNode(otherlv_7, grammarAccess.getPagePrincipaleAccess().getRightCurlyBracketKeyword_6());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:140:1: (otherlv_8= 'rubriques' ( (lv_rubriques_9_0= ruleRubriques ) ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==16) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:140:3: otherlv_8= 'rubriques' ( (lv_rubriques_9_0= ruleRubriques ) )
                    {
                    otherlv_8=(Token)match(input,16,FollowSets000.FOLLOW_16_in_rulePagePrincipale240); 

                        	newLeafNode(otherlv_8, grammarAccess.getPagePrincipaleAccess().getRubriquesKeyword_7_0());
                        
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:144:1: ( (lv_rubriques_9_0= ruleRubriques ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:145:1: (lv_rubriques_9_0= ruleRubriques )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:145:1: (lv_rubriques_9_0= ruleRubriques )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:146:3: lv_rubriques_9_0= ruleRubriques
                    {
                     
                    	        newCompositeNode(grammarAccess.getPagePrincipaleAccess().getRubriquesRubriquesParserRuleCall_7_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleRubriques_in_rulePagePrincipale261);
                    lv_rubriques_9_0=ruleRubriques();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPagePrincipaleRule());
                    	        }
                           		set(
                           			current, 
                           			"rubriques",
                            		lv_rubriques_9_0, 
                            		"Rubriques");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:162:4: (otherlv_10= 'fichiers' otherlv_11= '{' ( (lv_fichiers_12_0= ruleFichiers ) ) (otherlv_13= ',' ( (lv_fichiers_14_0= ruleFichiers ) ) )* otherlv_15= '}' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==17) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:162:6: otherlv_10= 'fichiers' otherlv_11= '{' ( (lv_fichiers_12_0= ruleFichiers ) ) (otherlv_13= ',' ( (lv_fichiers_14_0= ruleFichiers ) ) )* otherlv_15= '}'
                    {
                    otherlv_10=(Token)match(input,17,FollowSets000.FOLLOW_17_in_rulePagePrincipale276); 

                        	newLeafNode(otherlv_10, grammarAccess.getPagePrincipaleAccess().getFichiersKeyword_8_0());
                        
                    otherlv_11=(Token)match(input,12,FollowSets000.FOLLOW_12_in_rulePagePrincipale288); 

                        	newLeafNode(otherlv_11, grammarAccess.getPagePrincipaleAccess().getLeftCurlyBracketKeyword_8_1());
                        
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:170:1: ( (lv_fichiers_12_0= ruleFichiers ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:171:1: (lv_fichiers_12_0= ruleFichiers )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:171:1: (lv_fichiers_12_0= ruleFichiers )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:172:3: lv_fichiers_12_0= ruleFichiers
                    {
                     
                    	        newCompositeNode(grammarAccess.getPagePrincipaleAccess().getFichiersFichiersParserRuleCall_8_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleFichiers_in_rulePagePrincipale309);
                    lv_fichiers_12_0=ruleFichiers();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPagePrincipaleRule());
                    	        }
                           		add(
                           			current, 
                           			"fichiers",
                            		lv_fichiers_12_0, 
                            		"Fichiers");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:188:2: (otherlv_13= ',' ( (lv_fichiers_14_0= ruleFichiers ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==14) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:188:4: otherlv_13= ',' ( (lv_fichiers_14_0= ruleFichiers ) )
                    	    {
                    	    otherlv_13=(Token)match(input,14,FollowSets000.FOLLOW_14_in_rulePagePrincipale322); 

                    	        	newLeafNode(otherlv_13, grammarAccess.getPagePrincipaleAccess().getCommaKeyword_8_3_0());
                    	        
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:192:1: ( (lv_fichiers_14_0= ruleFichiers ) )
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:193:1: (lv_fichiers_14_0= ruleFichiers )
                    	    {
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:193:1: (lv_fichiers_14_0= ruleFichiers )
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:194:3: lv_fichiers_14_0= ruleFichiers
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getPagePrincipaleAccess().getFichiersFichiersParserRuleCall_8_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleFichiers_in_rulePagePrincipale343);
                    	    lv_fichiers_14_0=ruleFichiers();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getPagePrincipaleRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"fichiers",
                    	            		lv_fichiers_14_0, 
                    	            		"Fichiers");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,15,FollowSets000.FOLLOW_15_in_rulePagePrincipale357); 

                        	newLeafNode(otherlv_15, grammarAccess.getPagePrincipaleAccess().getRightCurlyBracketKeyword_8_4());
                        

                    }
                    break;

            }

            otherlv_16=(Token)match(input,18,FollowSets000.FOLLOW_18_in_rulePagePrincipale371); 

                	newLeafNode(otherlv_16, grammarAccess.getPagePrincipaleAccess().getConfigurationPageKeyword_9());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:218:1: ( (lv_configurationPage_17_0= ruleConfigurationPage ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:219:1: (lv_configurationPage_17_0= ruleConfigurationPage )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:219:1: (lv_configurationPage_17_0= ruleConfigurationPage )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:220:3: lv_configurationPage_17_0= ruleConfigurationPage
            {
             
            	        newCompositeNode(grammarAccess.getPagePrincipaleAccess().getConfigurationPageConfigurationPageParserRuleCall_10_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleConfigurationPage_in_rulePagePrincipale392);
            lv_configurationPage_17_0=ruleConfigurationPage();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPagePrincipaleRule());
            	        }
                   		set(
                   			current, 
                   			"configurationPage",
                    		lv_configurationPage_17_0, 
                    		"ConfigurationPage");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_18=(Token)match(input,19,FollowSets000.FOLLOW_19_in_rulePagePrincipale404); 

                	newLeafNode(otherlv_18, grammarAccess.getPagePrincipaleAccess().getPagesKeyword_11());
                
            otherlv_19=(Token)match(input,12,FollowSets000.FOLLOW_12_in_rulePagePrincipale416); 

                	newLeafNode(otherlv_19, grammarAccess.getPagePrincipaleAccess().getLeftCurlyBracketKeyword_12());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:244:1: ( (lv_pages_20_0= rulePageInterne ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:245:1: (lv_pages_20_0= rulePageInterne )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:245:1: (lv_pages_20_0= rulePageInterne )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:246:3: lv_pages_20_0= rulePageInterne
            {
             
            	        newCompositeNode(grammarAccess.getPagePrincipaleAccess().getPagesPageInterneParserRuleCall_13_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_rulePageInterne_in_rulePagePrincipale437);
            lv_pages_20_0=rulePageInterne();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPagePrincipaleRule());
            	        }
                   		add(
                   			current, 
                   			"pages",
                    		lv_pages_20_0, 
                    		"PageInterne");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:262:2: (otherlv_21= ',' ( (lv_pages_22_0= rulePageInterne ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==14) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:262:4: otherlv_21= ',' ( (lv_pages_22_0= rulePageInterne ) )
            	    {
            	    otherlv_21=(Token)match(input,14,FollowSets000.FOLLOW_14_in_rulePagePrincipale450); 

            	        	newLeafNode(otherlv_21, grammarAccess.getPagePrincipaleAccess().getCommaKeyword_14_0());
            	        
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:266:1: ( (lv_pages_22_0= rulePageInterne ) )
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:267:1: (lv_pages_22_0= rulePageInterne )
            	    {
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:267:1: (lv_pages_22_0= rulePageInterne )
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:268:3: lv_pages_22_0= rulePageInterne
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPagePrincipaleAccess().getPagesPageInterneParserRuleCall_14_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_rulePageInterne_in_rulePagePrincipale471);
            	    lv_pages_22_0=rulePageInterne();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPagePrincipaleRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"pages",
            	            		lv_pages_22_0, 
            	            		"PageInterne");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_23=(Token)match(input,15,FollowSets000.FOLLOW_15_in_rulePagePrincipale485); 

                	newLeafNode(otherlv_23, grammarAccess.getPagePrincipaleAccess().getRightCurlyBracketKeyword_15());
                
            otherlv_24=(Token)match(input,15,FollowSets000.FOLLOW_15_in_rulePagePrincipale497); 

                	newLeafNode(otherlv_24, grammarAccess.getPagePrincipaleAccess().getRightCurlyBracketKeyword_16());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePagePrincipale"


    // $ANTLR start "entryRuleContact"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:300:1: entryRuleContact returns [EObject current=null] : iv_ruleContact= ruleContact EOF ;
    public final EObject entryRuleContact() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContact = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:301:2: (iv_ruleContact= ruleContact EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:302:2: iv_ruleContact= ruleContact EOF
            {
             newCompositeNode(grammarAccess.getContactRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleContact_in_entryRuleContact533);
            iv_ruleContact=ruleContact();

            state._fsp--;

             current =iv_ruleContact; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleContact543); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleContact"


    // $ANTLR start "ruleContact"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:309:1: ruleContact returns [EObject current=null] : ( () otherlv_1= 'Contact' otherlv_2= '{' (otherlv_3= 'nom' ( (lv_nom_4_0= ruleEString ) ) )? (otherlv_5= 'prenom' ( (lv_prenom_6_0= ruleEString ) ) )? (otherlv_7= 'adresse' ( (lv_adresse_8_0= ruleEString ) ) )? (otherlv_9= 'mail' ( (lv_mail_10_0= ruleEString ) ) )? (otherlv_11= 'telephone' ( (lv_telephone_12_0= ruleEString ) ) )? otherlv_13= '}' ) ;
    public final EObject ruleContact() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        AntlrDatatypeRuleToken lv_nom_4_0 = null;

        AntlrDatatypeRuleToken lv_prenom_6_0 = null;

        AntlrDatatypeRuleToken lv_adresse_8_0 = null;

        AntlrDatatypeRuleToken lv_mail_10_0 = null;

        AntlrDatatypeRuleToken lv_telephone_12_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:312:28: ( ( () otherlv_1= 'Contact' otherlv_2= '{' (otherlv_3= 'nom' ( (lv_nom_4_0= ruleEString ) ) )? (otherlv_5= 'prenom' ( (lv_prenom_6_0= ruleEString ) ) )? (otherlv_7= 'adresse' ( (lv_adresse_8_0= ruleEString ) ) )? (otherlv_9= 'mail' ( (lv_mail_10_0= ruleEString ) ) )? (otherlv_11= 'telephone' ( (lv_telephone_12_0= ruleEString ) ) )? otherlv_13= '}' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:313:1: ( () otherlv_1= 'Contact' otherlv_2= '{' (otherlv_3= 'nom' ( (lv_nom_4_0= ruleEString ) ) )? (otherlv_5= 'prenom' ( (lv_prenom_6_0= ruleEString ) ) )? (otherlv_7= 'adresse' ( (lv_adresse_8_0= ruleEString ) ) )? (otherlv_9= 'mail' ( (lv_mail_10_0= ruleEString ) ) )? (otherlv_11= 'telephone' ( (lv_telephone_12_0= ruleEString ) ) )? otherlv_13= '}' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:313:1: ( () otherlv_1= 'Contact' otherlv_2= '{' (otherlv_3= 'nom' ( (lv_nom_4_0= ruleEString ) ) )? (otherlv_5= 'prenom' ( (lv_prenom_6_0= ruleEString ) ) )? (otherlv_7= 'adresse' ( (lv_adresse_8_0= ruleEString ) ) )? (otherlv_9= 'mail' ( (lv_mail_10_0= ruleEString ) ) )? (otherlv_11= 'telephone' ( (lv_telephone_12_0= ruleEString ) ) )? otherlv_13= '}' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:313:2: () otherlv_1= 'Contact' otherlv_2= '{' (otherlv_3= 'nom' ( (lv_nom_4_0= ruleEString ) ) )? (otherlv_5= 'prenom' ( (lv_prenom_6_0= ruleEString ) ) )? (otherlv_7= 'adresse' ( (lv_adresse_8_0= ruleEString ) ) )? (otherlv_9= 'mail' ( (lv_mail_10_0= ruleEString ) ) )? (otherlv_11= 'telephone' ( (lv_telephone_12_0= ruleEString ) ) )? otherlv_13= '}'
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:313:2: ()
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:314:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getContactAccess().getContactAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleContact589); 

                	newLeafNode(otherlv_1, grammarAccess.getContactAccess().getContactKeyword_1());
                
            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleContact601); 

                	newLeafNode(otherlv_2, grammarAccess.getContactAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:327:1: (otherlv_3= 'nom' ( (lv_nom_4_0= ruleEString ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==21) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:327:3: otherlv_3= 'nom' ( (lv_nom_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleContact614); 

                        	newLeafNode(otherlv_3, grammarAccess.getContactAccess().getNomKeyword_3_0());
                        
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:331:1: ( (lv_nom_4_0= ruleEString ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:332:1: (lv_nom_4_0= ruleEString )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:332:1: (lv_nom_4_0= ruleEString )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:333:3: lv_nom_4_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getContactAccess().getNomEStringParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleContact635);
                    lv_nom_4_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getContactRule());
                    	        }
                           		set(
                           			current, 
                           			"nom",
                            		lv_nom_4_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:349:4: (otherlv_5= 'prenom' ( (lv_prenom_6_0= ruleEString ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==22) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:349:6: otherlv_5= 'prenom' ( (lv_prenom_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleContact650); 

                        	newLeafNode(otherlv_5, grammarAccess.getContactAccess().getPrenomKeyword_4_0());
                        
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:353:1: ( (lv_prenom_6_0= ruleEString ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:354:1: (lv_prenom_6_0= ruleEString )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:354:1: (lv_prenom_6_0= ruleEString )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:355:3: lv_prenom_6_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getContactAccess().getPrenomEStringParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleContact671);
                    lv_prenom_6_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getContactRule());
                    	        }
                           		set(
                           			current, 
                           			"prenom",
                            		lv_prenom_6_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:371:4: (otherlv_7= 'adresse' ( (lv_adresse_8_0= ruleEString ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==23) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:371:6: otherlv_7= 'adresse' ( (lv_adresse_8_0= ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleContact686); 

                        	newLeafNode(otherlv_7, grammarAccess.getContactAccess().getAdresseKeyword_5_0());
                        
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:375:1: ( (lv_adresse_8_0= ruleEString ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:376:1: (lv_adresse_8_0= ruleEString )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:376:1: (lv_adresse_8_0= ruleEString )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:377:3: lv_adresse_8_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getContactAccess().getAdresseEStringParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleContact707);
                    lv_adresse_8_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getContactRule());
                    	        }
                           		set(
                           			current, 
                           			"adresse",
                            		lv_adresse_8_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:393:4: (otherlv_9= 'mail' ( (lv_mail_10_0= ruleEString ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==24) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:393:6: otherlv_9= 'mail' ( (lv_mail_10_0= ruleEString ) )
                    {
                    otherlv_9=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleContact722); 

                        	newLeafNode(otherlv_9, grammarAccess.getContactAccess().getMailKeyword_6_0());
                        
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:397:1: ( (lv_mail_10_0= ruleEString ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:398:1: (lv_mail_10_0= ruleEString )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:398:1: (lv_mail_10_0= ruleEString )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:399:3: lv_mail_10_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getContactAccess().getMailEStringParserRuleCall_6_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleContact743);
                    lv_mail_10_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getContactRule());
                    	        }
                           		set(
                           			current, 
                           			"mail",
                            		lv_mail_10_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:415:4: (otherlv_11= 'telephone' ( (lv_telephone_12_0= ruleEString ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==25) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:415:6: otherlv_11= 'telephone' ( (lv_telephone_12_0= ruleEString ) )
                    {
                    otherlv_11=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleContact758); 

                        	newLeafNode(otherlv_11, grammarAccess.getContactAccess().getTelephoneKeyword_7_0());
                        
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:419:1: ( (lv_telephone_12_0= ruleEString ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:420:1: (lv_telephone_12_0= ruleEString )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:420:1: (lv_telephone_12_0= ruleEString )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:421:3: lv_telephone_12_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getContactAccess().getTelephoneEStringParserRuleCall_7_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleContact779);
                    lv_telephone_12_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getContactRule());
                    	        }
                           		set(
                           			current, 
                           			"telephone",
                            		lv_telephone_12_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_13=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleContact793); 

                	newLeafNode(otherlv_13, grammarAccess.getContactAccess().getRightCurlyBracketKeyword_8());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleContact"


    // $ANTLR start "entryRuleRubriques"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:449:1: entryRuleRubriques returns [EObject current=null] : iv_ruleRubriques= ruleRubriques EOF ;
    public final EObject entryRuleRubriques() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRubriques = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:450:2: (iv_ruleRubriques= ruleRubriques EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:451:2: iv_ruleRubriques= ruleRubriques EOF
            {
             newCompositeNode(grammarAccess.getRubriquesRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRubriques_in_entryRuleRubriques829);
            iv_ruleRubriques=ruleRubriques();

            state._fsp--;

             current =iv_ruleRubriques; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRubriques839); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRubriques"


    // $ANTLR start "ruleRubriques"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:458:1: ruleRubriques returns [EObject current=null] : ( () otherlv_1= 'Rubriques' otherlv_2= '{' (otherlv_3= 'texte' ( (lv_texte_4_0= ruleEString ) ) )? (otherlv_5= 'lien' ( (lv_lien_6_0= ruleEString ) ) )? otherlv_7= '}' ) ;
    public final EObject ruleRubriques() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_texte_4_0 = null;

        AntlrDatatypeRuleToken lv_lien_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:461:28: ( ( () otherlv_1= 'Rubriques' otherlv_2= '{' (otherlv_3= 'texte' ( (lv_texte_4_0= ruleEString ) ) )? (otherlv_5= 'lien' ( (lv_lien_6_0= ruleEString ) ) )? otherlv_7= '}' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:462:1: ( () otherlv_1= 'Rubriques' otherlv_2= '{' (otherlv_3= 'texte' ( (lv_texte_4_0= ruleEString ) ) )? (otherlv_5= 'lien' ( (lv_lien_6_0= ruleEString ) ) )? otherlv_7= '}' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:462:1: ( () otherlv_1= 'Rubriques' otherlv_2= '{' (otherlv_3= 'texte' ( (lv_texte_4_0= ruleEString ) ) )? (otherlv_5= 'lien' ( (lv_lien_6_0= ruleEString ) ) )? otherlv_7= '}' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:462:2: () otherlv_1= 'Rubriques' otherlv_2= '{' (otherlv_3= 'texte' ( (lv_texte_4_0= ruleEString ) ) )? (otherlv_5= 'lien' ( (lv_lien_6_0= ruleEString ) ) )? otherlv_7= '}'
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:462:2: ()
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:463:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getRubriquesAccess().getRubriquesAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleRubriques885); 

                	newLeafNode(otherlv_1, grammarAccess.getRubriquesAccess().getRubriquesKeyword_1());
                
            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleRubriques897); 

                	newLeafNode(otherlv_2, grammarAccess.getRubriquesAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:476:1: (otherlv_3= 'texte' ( (lv_texte_4_0= ruleEString ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==27) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:476:3: otherlv_3= 'texte' ( (lv_texte_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleRubriques910); 

                        	newLeafNode(otherlv_3, grammarAccess.getRubriquesAccess().getTexteKeyword_3_0());
                        
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:480:1: ( (lv_texte_4_0= ruleEString ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:481:1: (lv_texte_4_0= ruleEString )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:481:1: (lv_texte_4_0= ruleEString )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:482:3: lv_texte_4_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getRubriquesAccess().getTexteEStringParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleRubriques931);
                    lv_texte_4_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getRubriquesRule());
                    	        }
                           		set(
                           			current, 
                           			"texte",
                            		lv_texte_4_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:498:4: (otherlv_5= 'lien' ( (lv_lien_6_0= ruleEString ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==28) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:498:6: otherlv_5= 'lien' ( (lv_lien_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleRubriques946); 

                        	newLeafNode(otherlv_5, grammarAccess.getRubriquesAccess().getLienKeyword_4_0());
                        
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:502:1: ( (lv_lien_6_0= ruleEString ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:503:1: (lv_lien_6_0= ruleEString )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:503:1: (lv_lien_6_0= ruleEString )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:504:3: lv_lien_6_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getRubriquesAccess().getLienEStringParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleRubriques967);
                    lv_lien_6_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getRubriquesRule());
                    	        }
                           		set(
                           			current, 
                           			"lien",
                            		lv_lien_6_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleRubriques981); 

                	newLeafNode(otherlv_7, grammarAccess.getRubriquesAccess().getRightCurlyBracketKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRubriques"


    // $ANTLR start "entryRuleFichiers"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:532:1: entryRuleFichiers returns [EObject current=null] : iv_ruleFichiers= ruleFichiers EOF ;
    public final EObject entryRuleFichiers() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFichiers = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:533:2: (iv_ruleFichiers= ruleFichiers EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:534:2: iv_ruleFichiers= ruleFichiers EOF
            {
             newCompositeNode(grammarAccess.getFichiersRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleFichiers_in_entryRuleFichiers1017);
            iv_ruleFichiers=ruleFichiers();

            state._fsp--;

             current =iv_ruleFichiers; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFichiers1027); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFichiers"


    // $ANTLR start "ruleFichiers"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:541:1: ruleFichiers returns [EObject current=null] : ( () otherlv_1= 'Fichiers' otherlv_2= '{' (otherlv_3= 'type' ( (lv_type_4_0= ruleEString ) ) )? (otherlv_5= 'taille' ( (lv_taille_6_0= ruleEInt ) ) )? (otherlv_7= 'nom' ( (lv_nom_8_0= ruleEString ) ) )? (otherlv_9= 'emplacement' ( (lv_emplacement_10_0= ruleEString ) ) )? otherlv_11= '}' ) ;
    public final EObject ruleFichiers() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_type_4_0 = null;

        AntlrDatatypeRuleToken lv_taille_6_0 = null;

        AntlrDatatypeRuleToken lv_nom_8_0 = null;

        AntlrDatatypeRuleToken lv_emplacement_10_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:544:28: ( ( () otherlv_1= 'Fichiers' otherlv_2= '{' (otherlv_3= 'type' ( (lv_type_4_0= ruleEString ) ) )? (otherlv_5= 'taille' ( (lv_taille_6_0= ruleEInt ) ) )? (otherlv_7= 'nom' ( (lv_nom_8_0= ruleEString ) ) )? (otherlv_9= 'emplacement' ( (lv_emplacement_10_0= ruleEString ) ) )? otherlv_11= '}' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:545:1: ( () otherlv_1= 'Fichiers' otherlv_2= '{' (otherlv_3= 'type' ( (lv_type_4_0= ruleEString ) ) )? (otherlv_5= 'taille' ( (lv_taille_6_0= ruleEInt ) ) )? (otherlv_7= 'nom' ( (lv_nom_8_0= ruleEString ) ) )? (otherlv_9= 'emplacement' ( (lv_emplacement_10_0= ruleEString ) ) )? otherlv_11= '}' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:545:1: ( () otherlv_1= 'Fichiers' otherlv_2= '{' (otherlv_3= 'type' ( (lv_type_4_0= ruleEString ) ) )? (otherlv_5= 'taille' ( (lv_taille_6_0= ruleEInt ) ) )? (otherlv_7= 'nom' ( (lv_nom_8_0= ruleEString ) ) )? (otherlv_9= 'emplacement' ( (lv_emplacement_10_0= ruleEString ) ) )? otherlv_11= '}' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:545:2: () otherlv_1= 'Fichiers' otherlv_2= '{' (otherlv_3= 'type' ( (lv_type_4_0= ruleEString ) ) )? (otherlv_5= 'taille' ( (lv_taille_6_0= ruleEInt ) ) )? (otherlv_7= 'nom' ( (lv_nom_8_0= ruleEString ) ) )? (otherlv_9= 'emplacement' ( (lv_emplacement_10_0= ruleEString ) ) )? otherlv_11= '}'
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:545:2: ()
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:546:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getFichiersAccess().getFichiersAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleFichiers1073); 

                	newLeafNode(otherlv_1, grammarAccess.getFichiersAccess().getFichiersKeyword_1());
                
            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleFichiers1085); 

                	newLeafNode(otherlv_2, grammarAccess.getFichiersAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:559:1: (otherlv_3= 'type' ( (lv_type_4_0= ruleEString ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==30) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:559:3: otherlv_3= 'type' ( (lv_type_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleFichiers1098); 

                        	newLeafNode(otherlv_3, grammarAccess.getFichiersAccess().getTypeKeyword_3_0());
                        
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:563:1: ( (lv_type_4_0= ruleEString ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:564:1: (lv_type_4_0= ruleEString )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:564:1: (lv_type_4_0= ruleEString )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:565:3: lv_type_4_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getFichiersAccess().getTypeEStringParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleFichiers1119);
                    lv_type_4_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFichiersRule());
                    	        }
                           		set(
                           			current, 
                           			"type",
                            		lv_type_4_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:581:4: (otherlv_5= 'taille' ( (lv_taille_6_0= ruleEInt ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==31) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:581:6: otherlv_5= 'taille' ( (lv_taille_6_0= ruleEInt ) )
                    {
                    otherlv_5=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleFichiers1134); 

                        	newLeafNode(otherlv_5, grammarAccess.getFichiersAccess().getTailleKeyword_4_0());
                        
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:585:1: ( (lv_taille_6_0= ruleEInt ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:586:1: (lv_taille_6_0= ruleEInt )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:586:1: (lv_taille_6_0= ruleEInt )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:587:3: lv_taille_6_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getFichiersAccess().getTailleEIntParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleFichiers1155);
                    lv_taille_6_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFichiersRule());
                    	        }
                           		set(
                           			current, 
                           			"taille",
                            		lv_taille_6_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:603:4: (otherlv_7= 'nom' ( (lv_nom_8_0= ruleEString ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==21) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:603:6: otherlv_7= 'nom' ( (lv_nom_8_0= ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleFichiers1170); 

                        	newLeafNode(otherlv_7, grammarAccess.getFichiersAccess().getNomKeyword_5_0());
                        
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:607:1: ( (lv_nom_8_0= ruleEString ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:608:1: (lv_nom_8_0= ruleEString )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:608:1: (lv_nom_8_0= ruleEString )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:609:3: lv_nom_8_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getFichiersAccess().getNomEStringParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleFichiers1191);
                    lv_nom_8_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFichiersRule());
                    	        }
                           		set(
                           			current, 
                           			"nom",
                            		lv_nom_8_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:625:4: (otherlv_9= 'emplacement' ( (lv_emplacement_10_0= ruleEString ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==32) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:625:6: otherlv_9= 'emplacement' ( (lv_emplacement_10_0= ruleEString ) )
                    {
                    otherlv_9=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleFichiers1206); 

                        	newLeafNode(otherlv_9, grammarAccess.getFichiersAccess().getEmplacementKeyword_6_0());
                        
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:629:1: ( (lv_emplacement_10_0= ruleEString ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:630:1: (lv_emplacement_10_0= ruleEString )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:630:1: (lv_emplacement_10_0= ruleEString )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:631:3: lv_emplacement_10_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getFichiersAccess().getEmplacementEStringParserRuleCall_6_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleFichiers1227);
                    lv_emplacement_10_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFichiersRule());
                    	        }
                           		set(
                           			current, 
                           			"emplacement",
                            		lv_emplacement_10_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_11=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleFichiers1241); 

                	newLeafNode(otherlv_11, grammarAccess.getFichiersAccess().getRightCurlyBracketKeyword_7());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFichiers"


    // $ANTLR start "entryRuleConfigurationPage"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:659:1: entryRuleConfigurationPage returns [EObject current=null] : iv_ruleConfigurationPage= ruleConfigurationPage EOF ;
    public final EObject entryRuleConfigurationPage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfigurationPage = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:660:2: (iv_ruleConfigurationPage= ruleConfigurationPage EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:661:2: iv_ruleConfigurationPage= ruleConfigurationPage EOF
            {
             newCompositeNode(grammarAccess.getConfigurationPageRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleConfigurationPage_in_entryRuleConfigurationPage1277);
            iv_ruleConfigurationPage=ruleConfigurationPage();

            state._fsp--;

             current =iv_ruleConfigurationPage; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleConfigurationPage1287); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConfigurationPage"


    // $ANTLR start "ruleConfigurationPage"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:668:1: ruleConfigurationPage returns [EObject current=null] : ( () otherlv_1= 'ConfigurationPage' otherlv_2= '{' (otherlv_3= 'couleurFond' ( (lv_couleurFond_4_0= ruleEString ) ) )? (otherlv_5= 'titreSite' ( (lv_titreSite_6_0= ruleEString ) ) )? (otherlv_7= 'auteurs' ( (lv_auteurs_8_0= ruleEString ) ) )? (otherlv_9= 'couleurPolice' ( (lv_couleurPolice_10_0= ruleEString ) ) )? (otherlv_11= 'taillePolice' ( (lv_taillePolice_12_0= ruleEInt ) ) )? otherlv_13= '}' ) ;
    public final EObject ruleConfigurationPage() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        AntlrDatatypeRuleToken lv_couleurFond_4_0 = null;

        AntlrDatatypeRuleToken lv_titreSite_6_0 = null;

        AntlrDatatypeRuleToken lv_auteurs_8_0 = null;

        AntlrDatatypeRuleToken lv_couleurPolice_10_0 = null;

        AntlrDatatypeRuleToken lv_taillePolice_12_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:671:28: ( ( () otherlv_1= 'ConfigurationPage' otherlv_2= '{' (otherlv_3= 'couleurFond' ( (lv_couleurFond_4_0= ruleEString ) ) )? (otherlv_5= 'titreSite' ( (lv_titreSite_6_0= ruleEString ) ) )? (otherlv_7= 'auteurs' ( (lv_auteurs_8_0= ruleEString ) ) )? (otherlv_9= 'couleurPolice' ( (lv_couleurPolice_10_0= ruleEString ) ) )? (otherlv_11= 'taillePolice' ( (lv_taillePolice_12_0= ruleEInt ) ) )? otherlv_13= '}' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:672:1: ( () otherlv_1= 'ConfigurationPage' otherlv_2= '{' (otherlv_3= 'couleurFond' ( (lv_couleurFond_4_0= ruleEString ) ) )? (otherlv_5= 'titreSite' ( (lv_titreSite_6_0= ruleEString ) ) )? (otherlv_7= 'auteurs' ( (lv_auteurs_8_0= ruleEString ) ) )? (otherlv_9= 'couleurPolice' ( (lv_couleurPolice_10_0= ruleEString ) ) )? (otherlv_11= 'taillePolice' ( (lv_taillePolice_12_0= ruleEInt ) ) )? otherlv_13= '}' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:672:1: ( () otherlv_1= 'ConfigurationPage' otherlv_2= '{' (otherlv_3= 'couleurFond' ( (lv_couleurFond_4_0= ruleEString ) ) )? (otherlv_5= 'titreSite' ( (lv_titreSite_6_0= ruleEString ) ) )? (otherlv_7= 'auteurs' ( (lv_auteurs_8_0= ruleEString ) ) )? (otherlv_9= 'couleurPolice' ( (lv_couleurPolice_10_0= ruleEString ) ) )? (otherlv_11= 'taillePolice' ( (lv_taillePolice_12_0= ruleEInt ) ) )? otherlv_13= '}' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:672:2: () otherlv_1= 'ConfigurationPage' otherlv_2= '{' (otherlv_3= 'couleurFond' ( (lv_couleurFond_4_0= ruleEString ) ) )? (otherlv_5= 'titreSite' ( (lv_titreSite_6_0= ruleEString ) ) )? (otherlv_7= 'auteurs' ( (lv_auteurs_8_0= ruleEString ) ) )? (otherlv_9= 'couleurPolice' ( (lv_couleurPolice_10_0= ruleEString ) ) )? (otherlv_11= 'taillePolice' ( (lv_taillePolice_12_0= ruleEInt ) ) )? otherlv_13= '}'
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:672:2: ()
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:673:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getConfigurationPageAccess().getConfigurationPageAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleConfigurationPage1333); 

                	newLeafNode(otherlv_1, grammarAccess.getConfigurationPageAccess().getConfigurationPageKeyword_1());
                
            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleConfigurationPage1345); 

                	newLeafNode(otherlv_2, grammarAccess.getConfigurationPageAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:686:1: (otherlv_3= 'couleurFond' ( (lv_couleurFond_4_0= ruleEString ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==34) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:686:3: otherlv_3= 'couleurFond' ( (lv_couleurFond_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleConfigurationPage1358); 

                        	newLeafNode(otherlv_3, grammarAccess.getConfigurationPageAccess().getCouleurFondKeyword_3_0());
                        
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:690:1: ( (lv_couleurFond_4_0= ruleEString ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:691:1: (lv_couleurFond_4_0= ruleEString )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:691:1: (lv_couleurFond_4_0= ruleEString )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:692:3: lv_couleurFond_4_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getConfigurationPageAccess().getCouleurFondEStringParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleConfigurationPage1379);
                    lv_couleurFond_4_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getConfigurationPageRule());
                    	        }
                           		set(
                           			current, 
                           			"couleurFond",
                            		lv_couleurFond_4_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:708:4: (otherlv_5= 'titreSite' ( (lv_titreSite_6_0= ruleEString ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==35) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:708:6: otherlv_5= 'titreSite' ( (lv_titreSite_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleConfigurationPage1394); 

                        	newLeafNode(otherlv_5, grammarAccess.getConfigurationPageAccess().getTitreSiteKeyword_4_0());
                        
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:712:1: ( (lv_titreSite_6_0= ruleEString ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:713:1: (lv_titreSite_6_0= ruleEString )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:713:1: (lv_titreSite_6_0= ruleEString )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:714:3: lv_titreSite_6_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getConfigurationPageAccess().getTitreSiteEStringParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleConfigurationPage1415);
                    lv_titreSite_6_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getConfigurationPageRule());
                    	        }
                           		set(
                           			current, 
                           			"titreSite",
                            		lv_titreSite_6_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:730:4: (otherlv_7= 'auteurs' ( (lv_auteurs_8_0= ruleEString ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==36) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:730:6: otherlv_7= 'auteurs' ( (lv_auteurs_8_0= ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleConfigurationPage1430); 

                        	newLeafNode(otherlv_7, grammarAccess.getConfigurationPageAccess().getAuteursKeyword_5_0());
                        
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:734:1: ( (lv_auteurs_8_0= ruleEString ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:735:1: (lv_auteurs_8_0= ruleEString )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:735:1: (lv_auteurs_8_0= ruleEString )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:736:3: lv_auteurs_8_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getConfigurationPageAccess().getAuteursEStringParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleConfigurationPage1451);
                    lv_auteurs_8_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getConfigurationPageRule());
                    	        }
                           		set(
                           			current, 
                           			"auteurs",
                            		lv_auteurs_8_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:752:4: (otherlv_9= 'couleurPolice' ( (lv_couleurPolice_10_0= ruleEString ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==37) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:752:6: otherlv_9= 'couleurPolice' ( (lv_couleurPolice_10_0= ruleEString ) )
                    {
                    otherlv_9=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleConfigurationPage1466); 

                        	newLeafNode(otherlv_9, grammarAccess.getConfigurationPageAccess().getCouleurPoliceKeyword_6_0());
                        
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:756:1: ( (lv_couleurPolice_10_0= ruleEString ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:757:1: (lv_couleurPolice_10_0= ruleEString )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:757:1: (lv_couleurPolice_10_0= ruleEString )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:758:3: lv_couleurPolice_10_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getConfigurationPageAccess().getCouleurPoliceEStringParserRuleCall_6_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleConfigurationPage1487);
                    lv_couleurPolice_10_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getConfigurationPageRule());
                    	        }
                           		set(
                           			current, 
                           			"couleurPolice",
                            		lv_couleurPolice_10_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:774:4: (otherlv_11= 'taillePolice' ( (lv_taillePolice_12_0= ruleEInt ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==38) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:774:6: otherlv_11= 'taillePolice' ( (lv_taillePolice_12_0= ruleEInt ) )
                    {
                    otherlv_11=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleConfigurationPage1502); 

                        	newLeafNode(otherlv_11, grammarAccess.getConfigurationPageAccess().getTaillePoliceKeyword_7_0());
                        
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:778:1: ( (lv_taillePolice_12_0= ruleEInt ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:779:1: (lv_taillePolice_12_0= ruleEInt )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:779:1: (lv_taillePolice_12_0= ruleEInt )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:780:3: lv_taillePolice_12_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getConfigurationPageAccess().getTaillePoliceEIntParserRuleCall_7_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleConfigurationPage1523);
                    lv_taillePolice_12_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getConfigurationPageRule());
                    	        }
                           		set(
                           			current, 
                           			"taillePolice",
                            		lv_taillePolice_12_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_13=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleConfigurationPage1537); 

                	newLeafNode(otherlv_13, grammarAccess.getConfigurationPageAccess().getRightCurlyBracketKeyword_8());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConfigurationPage"


    // $ANTLR start "entryRulePageInterne"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:808:1: entryRulePageInterne returns [EObject current=null] : iv_rulePageInterne= rulePageInterne EOF ;
    public final EObject entryRulePageInterne() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePageInterne = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:809:2: (iv_rulePageInterne= rulePageInterne EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:810:2: iv_rulePageInterne= rulePageInterne EOF
            {
             newCompositeNode(grammarAccess.getPageInterneRule()); 
            pushFollow(FollowSets000.FOLLOW_rulePageInterne_in_entryRulePageInterne1573);
            iv_rulePageInterne=rulePageInterne();

            state._fsp--;

             current =iv_rulePageInterne; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePageInterne1583); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePageInterne"


    // $ANTLR start "rulePageInterne"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:817:1: rulePageInterne returns [EObject current=null] : (otherlv_0= 'PageInterne' otherlv_1= '{' (otherlv_2= 'titrePage' ( (lv_titrePage_3_0= ruleEString ) ) )? (otherlv_4= 'texte' ( (lv_texte_5_0= ruleEString ) ) )? (otherlv_6= 'types' ( (lv_types_7_0= ruleTypes ) ) )? (otherlv_8= 'liens' ( (lv_liens_9_0= ruleLiens ) ) )? otherlv_10= 'photo' ( (lv_photo_11_0= rulePhoto ) ) otherlv_12= '}' ) ;
    public final EObject rulePageInterne() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        AntlrDatatypeRuleToken lv_titrePage_3_0 = null;

        AntlrDatatypeRuleToken lv_texte_5_0 = null;

        EObject lv_types_7_0 = null;

        EObject lv_liens_9_0 = null;

        EObject lv_photo_11_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:820:28: ( (otherlv_0= 'PageInterne' otherlv_1= '{' (otherlv_2= 'titrePage' ( (lv_titrePage_3_0= ruleEString ) ) )? (otherlv_4= 'texte' ( (lv_texte_5_0= ruleEString ) ) )? (otherlv_6= 'types' ( (lv_types_7_0= ruleTypes ) ) )? (otherlv_8= 'liens' ( (lv_liens_9_0= ruleLiens ) ) )? otherlv_10= 'photo' ( (lv_photo_11_0= rulePhoto ) ) otherlv_12= '}' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:821:1: (otherlv_0= 'PageInterne' otherlv_1= '{' (otherlv_2= 'titrePage' ( (lv_titrePage_3_0= ruleEString ) ) )? (otherlv_4= 'texte' ( (lv_texte_5_0= ruleEString ) ) )? (otherlv_6= 'types' ( (lv_types_7_0= ruleTypes ) ) )? (otherlv_8= 'liens' ( (lv_liens_9_0= ruleLiens ) ) )? otherlv_10= 'photo' ( (lv_photo_11_0= rulePhoto ) ) otherlv_12= '}' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:821:1: (otherlv_0= 'PageInterne' otherlv_1= '{' (otherlv_2= 'titrePage' ( (lv_titrePage_3_0= ruleEString ) ) )? (otherlv_4= 'texte' ( (lv_texte_5_0= ruleEString ) ) )? (otherlv_6= 'types' ( (lv_types_7_0= ruleTypes ) ) )? (otherlv_8= 'liens' ( (lv_liens_9_0= ruleLiens ) ) )? otherlv_10= 'photo' ( (lv_photo_11_0= rulePhoto ) ) otherlv_12= '}' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:821:3: otherlv_0= 'PageInterne' otherlv_1= '{' (otherlv_2= 'titrePage' ( (lv_titrePage_3_0= ruleEString ) ) )? (otherlv_4= 'texte' ( (lv_texte_5_0= ruleEString ) ) )? (otherlv_6= 'types' ( (lv_types_7_0= ruleTypes ) ) )? (otherlv_8= 'liens' ( (lv_liens_9_0= ruleLiens ) ) )? otherlv_10= 'photo' ( (lv_photo_11_0= rulePhoto ) ) otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,39,FollowSets000.FOLLOW_39_in_rulePageInterne1620); 

                	newLeafNode(otherlv_0, grammarAccess.getPageInterneAccess().getPageInterneKeyword_0());
                
            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_rulePageInterne1632); 

                	newLeafNode(otherlv_1, grammarAccess.getPageInterneAccess().getLeftCurlyBracketKeyword_1());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:829:1: (otherlv_2= 'titrePage' ( (lv_titrePage_3_0= ruleEString ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==40) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:829:3: otherlv_2= 'titrePage' ( (lv_titrePage_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,40,FollowSets000.FOLLOW_40_in_rulePageInterne1645); 

                        	newLeafNode(otherlv_2, grammarAccess.getPageInterneAccess().getTitrePageKeyword_2_0());
                        
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:833:1: ( (lv_titrePage_3_0= ruleEString ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:834:1: (lv_titrePage_3_0= ruleEString )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:834:1: (lv_titrePage_3_0= ruleEString )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:835:3: lv_titrePage_3_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getPageInterneAccess().getTitrePageEStringParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_rulePageInterne1666);
                    lv_titrePage_3_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPageInterneRule());
                    	        }
                           		set(
                           			current, 
                           			"titrePage",
                            		lv_titrePage_3_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:851:4: (otherlv_4= 'texte' ( (lv_texte_5_0= ruleEString ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==27) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:851:6: otherlv_4= 'texte' ( (lv_texte_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,27,FollowSets000.FOLLOW_27_in_rulePageInterne1681); 

                        	newLeafNode(otherlv_4, grammarAccess.getPageInterneAccess().getTexteKeyword_3_0());
                        
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:855:1: ( (lv_texte_5_0= ruleEString ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:856:1: (lv_texte_5_0= ruleEString )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:856:1: (lv_texte_5_0= ruleEString )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:857:3: lv_texte_5_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getPageInterneAccess().getTexteEStringParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_rulePageInterne1702);
                    lv_texte_5_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPageInterneRule());
                    	        }
                           		set(
                           			current, 
                           			"texte",
                            		lv_texte_5_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:873:4: (otherlv_6= 'types' ( (lv_types_7_0= ruleTypes ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==41) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:873:6: otherlv_6= 'types' ( (lv_types_7_0= ruleTypes ) )
                    {
                    otherlv_6=(Token)match(input,41,FollowSets000.FOLLOW_41_in_rulePageInterne1717); 

                        	newLeafNode(otherlv_6, grammarAccess.getPageInterneAccess().getTypesKeyword_4_0());
                        
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:877:1: ( (lv_types_7_0= ruleTypes ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:878:1: (lv_types_7_0= ruleTypes )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:878:1: (lv_types_7_0= ruleTypes )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:879:3: lv_types_7_0= ruleTypes
                    {
                     
                    	        newCompositeNode(grammarAccess.getPageInterneAccess().getTypesTypesParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleTypes_in_rulePageInterne1738);
                    lv_types_7_0=ruleTypes();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPageInterneRule());
                    	        }
                           		set(
                           			current, 
                           			"types",
                            		lv_types_7_0, 
                            		"Types");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:895:4: (otherlv_8= 'liens' ( (lv_liens_9_0= ruleLiens ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==42) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:895:6: otherlv_8= 'liens' ( (lv_liens_9_0= ruleLiens ) )
                    {
                    otherlv_8=(Token)match(input,42,FollowSets000.FOLLOW_42_in_rulePageInterne1753); 

                        	newLeafNode(otherlv_8, grammarAccess.getPageInterneAccess().getLiensKeyword_5_0());
                        
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:899:1: ( (lv_liens_9_0= ruleLiens ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:900:1: (lv_liens_9_0= ruleLiens )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:900:1: (lv_liens_9_0= ruleLiens )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:901:3: lv_liens_9_0= ruleLiens
                    {
                     
                    	        newCompositeNode(grammarAccess.getPageInterneAccess().getLiensLiensParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleLiens_in_rulePageInterne1774);
                    lv_liens_9_0=ruleLiens();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPageInterneRule());
                    	        }
                           		set(
                           			current, 
                           			"liens",
                            		lv_liens_9_0, 
                            		"Liens");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,43,FollowSets000.FOLLOW_43_in_rulePageInterne1788); 

                	newLeafNode(otherlv_10, grammarAccess.getPageInterneAccess().getPhotoKeyword_6());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:921:1: ( (lv_photo_11_0= rulePhoto ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:922:1: (lv_photo_11_0= rulePhoto )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:922:1: (lv_photo_11_0= rulePhoto )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:923:3: lv_photo_11_0= rulePhoto
            {
             
            	        newCompositeNode(grammarAccess.getPageInterneAccess().getPhotoPhotoParserRuleCall_7_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_rulePhoto_in_rulePageInterne1809);
            lv_photo_11_0=rulePhoto();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPageInterneRule());
            	        }
                   		set(
                   			current, 
                   			"photo",
                    		lv_photo_11_0, 
                    		"Photo");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_12=(Token)match(input,15,FollowSets000.FOLLOW_15_in_rulePageInterne1821); 

                	newLeafNode(otherlv_12, grammarAccess.getPageInterneAccess().getRightCurlyBracketKeyword_8());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePageInterne"


    // $ANTLR start "entryRuleEString"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:951:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:952:2: (iv_ruleEString= ruleEString EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:953:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString1858);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString1869); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:960:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:963:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:964:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:964:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_STRING) ) {
                alt26=1;
            }
            else if ( (LA26_0==RULE_ID) ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:964:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleEString1909); 

                    		current.merge(this_STRING_0);
                        
                     
                        newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:972:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEString1935); 

                    		current.merge(this_ID_1);
                        
                     
                        newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleEInt"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:987:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:988:2: (iv_ruleEInt= ruleEInt EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:989:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_entryRuleEInt1981);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEInt1992); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:996:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:999:28: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1000:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1000:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1000:2: (kw= '-' )? this_INT_1= RULE_INT
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1000:2: (kw= '-' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==44) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1001:2: kw= '-'
                    {
                    kw=(Token)match(input,44,FollowSets000.FOLLOW_44_in_ruleEInt2031); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEInt2048); 

            		current.merge(this_INT_1);
                
             
                newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleTypes"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1021:1: entryRuleTypes returns [EObject current=null] : iv_ruleTypes= ruleTypes EOF ;
    public final EObject entryRuleTypes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypes = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1022:2: (iv_ruleTypes= ruleTypes EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1023:2: iv_ruleTypes= ruleTypes EOF
            {
             newCompositeNode(grammarAccess.getTypesRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTypes_in_entryRuleTypes2093);
            iv_ruleTypes=ruleTypes();

            state._fsp--;

             current =iv_ruleTypes; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTypes2103); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTypes"


    // $ANTLR start "ruleTypes"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1030:1: ruleTypes returns [EObject current=null] : ( () ( (lv_gras_1_0= 'gras' ) )? ( (lv_italique_2_0= 'italique' ) )? otherlv_3= 'Types' ) ;
    public final EObject ruleTypes() throws RecognitionException {
        EObject current = null;

        Token lv_gras_1_0=null;
        Token lv_italique_2_0=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1033:28: ( ( () ( (lv_gras_1_0= 'gras' ) )? ( (lv_italique_2_0= 'italique' ) )? otherlv_3= 'Types' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1034:1: ( () ( (lv_gras_1_0= 'gras' ) )? ( (lv_italique_2_0= 'italique' ) )? otherlv_3= 'Types' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1034:1: ( () ( (lv_gras_1_0= 'gras' ) )? ( (lv_italique_2_0= 'italique' ) )? otherlv_3= 'Types' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1034:2: () ( (lv_gras_1_0= 'gras' ) )? ( (lv_italique_2_0= 'italique' ) )? otherlv_3= 'Types'
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1034:2: ()
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1035:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getTypesAccess().getTypesAction_0(),
                        current);
                

            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1040:2: ( (lv_gras_1_0= 'gras' ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==45) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1041:1: (lv_gras_1_0= 'gras' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1041:1: (lv_gras_1_0= 'gras' )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1042:3: lv_gras_1_0= 'gras'
                    {
                    lv_gras_1_0=(Token)match(input,45,FollowSets000.FOLLOW_45_in_ruleTypes2155); 

                            newLeafNode(lv_gras_1_0, grammarAccess.getTypesAccess().getGrasGrasKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTypesRule());
                    	        }
                           		setWithLastConsumed(current, "gras", true, "gras");
                    	    

                    }


                    }
                    break;

            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1055:3: ( (lv_italique_2_0= 'italique' ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==46) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1056:1: (lv_italique_2_0= 'italique' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1056:1: (lv_italique_2_0= 'italique' )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1057:3: lv_italique_2_0= 'italique'
                    {
                    lv_italique_2_0=(Token)match(input,46,FollowSets000.FOLLOW_46_in_ruleTypes2187); 

                            newLeafNode(lv_italique_2_0, grammarAccess.getTypesAccess().getItaliqueItaliqueKeyword_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTypesRule());
                    	        }
                           		setWithLastConsumed(current, "italique", true, "italique");
                    	    

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,47,FollowSets000.FOLLOW_47_in_ruleTypes2213); 

                	newLeafNode(otherlv_3, grammarAccess.getTypesAccess().getTypesKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTypes"


    // $ANTLR start "entryRuleLiens"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1082:1: entryRuleLiens returns [EObject current=null] : iv_ruleLiens= ruleLiens EOF ;
    public final EObject entryRuleLiens() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiens = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1083:2: (iv_ruleLiens= ruleLiens EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1084:2: iv_ruleLiens= ruleLiens EOF
            {
             newCompositeNode(grammarAccess.getLiensRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleLiens_in_entryRuleLiens2249);
            iv_ruleLiens=ruleLiens();

            state._fsp--;

             current =iv_ruleLiens; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLiens2259); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLiens"


    // $ANTLR start "ruleLiens"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1091:1: ruleLiens returns [EObject current=null] : ( () otherlv_1= 'Liens' otherlv_2= '{' (otherlv_3= 'fichier' ( (lv_fichier_4_0= ruleEString ) ) )? (otherlv_5= 'adresseWeb' ( (lv_adresseWeb_6_0= ruleEString ) ) )? (otherlv_7= 'pageInterne' ( (lv_pageInterne_8_0= ruleEString ) ) )? otherlv_9= '}' ) ;
    public final EObject ruleLiens() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_fichier_4_0 = null;

        AntlrDatatypeRuleToken lv_adresseWeb_6_0 = null;

        AntlrDatatypeRuleToken lv_pageInterne_8_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1094:28: ( ( () otherlv_1= 'Liens' otherlv_2= '{' (otherlv_3= 'fichier' ( (lv_fichier_4_0= ruleEString ) ) )? (otherlv_5= 'adresseWeb' ( (lv_adresseWeb_6_0= ruleEString ) ) )? (otherlv_7= 'pageInterne' ( (lv_pageInterne_8_0= ruleEString ) ) )? otherlv_9= '}' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1095:1: ( () otherlv_1= 'Liens' otherlv_2= '{' (otherlv_3= 'fichier' ( (lv_fichier_4_0= ruleEString ) ) )? (otherlv_5= 'adresseWeb' ( (lv_adresseWeb_6_0= ruleEString ) ) )? (otherlv_7= 'pageInterne' ( (lv_pageInterne_8_0= ruleEString ) ) )? otherlv_9= '}' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1095:1: ( () otherlv_1= 'Liens' otherlv_2= '{' (otherlv_3= 'fichier' ( (lv_fichier_4_0= ruleEString ) ) )? (otherlv_5= 'adresseWeb' ( (lv_adresseWeb_6_0= ruleEString ) ) )? (otherlv_7= 'pageInterne' ( (lv_pageInterne_8_0= ruleEString ) ) )? otherlv_9= '}' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1095:2: () otherlv_1= 'Liens' otherlv_2= '{' (otherlv_3= 'fichier' ( (lv_fichier_4_0= ruleEString ) ) )? (otherlv_5= 'adresseWeb' ( (lv_adresseWeb_6_0= ruleEString ) ) )? (otherlv_7= 'pageInterne' ( (lv_pageInterne_8_0= ruleEString ) ) )? otherlv_9= '}'
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1095:2: ()
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1096:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getLiensAccess().getLiensAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,48,FollowSets000.FOLLOW_48_in_ruleLiens2305); 

                	newLeafNode(otherlv_1, grammarAccess.getLiensAccess().getLiensKeyword_1());
                
            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleLiens2317); 

                	newLeafNode(otherlv_2, grammarAccess.getLiensAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1109:1: (otherlv_3= 'fichier' ( (lv_fichier_4_0= ruleEString ) ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==49) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1109:3: otherlv_3= 'fichier' ( (lv_fichier_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,49,FollowSets000.FOLLOW_49_in_ruleLiens2330); 

                        	newLeafNode(otherlv_3, grammarAccess.getLiensAccess().getFichierKeyword_3_0());
                        
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1113:1: ( (lv_fichier_4_0= ruleEString ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1114:1: (lv_fichier_4_0= ruleEString )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1114:1: (lv_fichier_4_0= ruleEString )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1115:3: lv_fichier_4_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getLiensAccess().getFichierEStringParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleLiens2351);
                    lv_fichier_4_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getLiensRule());
                    	        }
                           		set(
                           			current, 
                           			"fichier",
                            		lv_fichier_4_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1131:4: (otherlv_5= 'adresseWeb' ( (lv_adresseWeb_6_0= ruleEString ) ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==50) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1131:6: otherlv_5= 'adresseWeb' ( (lv_adresseWeb_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,50,FollowSets000.FOLLOW_50_in_ruleLiens2366); 

                        	newLeafNode(otherlv_5, grammarAccess.getLiensAccess().getAdresseWebKeyword_4_0());
                        
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1135:1: ( (lv_adresseWeb_6_0= ruleEString ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1136:1: (lv_adresseWeb_6_0= ruleEString )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1136:1: (lv_adresseWeb_6_0= ruleEString )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1137:3: lv_adresseWeb_6_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getLiensAccess().getAdresseWebEStringParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleLiens2387);
                    lv_adresseWeb_6_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getLiensRule());
                    	        }
                           		set(
                           			current, 
                           			"adresseWeb",
                            		lv_adresseWeb_6_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1153:4: (otherlv_7= 'pageInterne' ( (lv_pageInterne_8_0= ruleEString ) ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==51) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1153:6: otherlv_7= 'pageInterne' ( (lv_pageInterne_8_0= ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,51,FollowSets000.FOLLOW_51_in_ruleLiens2402); 

                        	newLeafNode(otherlv_7, grammarAccess.getLiensAccess().getPageInterneKeyword_5_0());
                        
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1157:1: ( (lv_pageInterne_8_0= ruleEString ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1158:1: (lv_pageInterne_8_0= ruleEString )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1158:1: (lv_pageInterne_8_0= ruleEString )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1159:3: lv_pageInterne_8_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getLiensAccess().getPageInterneEStringParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleLiens2423);
                    lv_pageInterne_8_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getLiensRule());
                    	        }
                           		set(
                           			current, 
                           			"pageInterne",
                            		lv_pageInterne_8_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleLiens2437); 

                	newLeafNode(otherlv_9, grammarAccess.getLiensAccess().getRightCurlyBracketKeyword_6());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLiens"


    // $ANTLR start "entryRulePhoto"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1187:1: entryRulePhoto returns [EObject current=null] : iv_rulePhoto= rulePhoto EOF ;
    public final EObject entryRulePhoto() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePhoto = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1188:2: (iv_rulePhoto= rulePhoto EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1189:2: iv_rulePhoto= rulePhoto EOF
            {
             newCompositeNode(grammarAccess.getPhotoRule()); 
            pushFollow(FollowSets000.FOLLOW_rulePhoto_in_entryRulePhoto2473);
            iv_rulePhoto=rulePhoto();

            state._fsp--;

             current =iv_rulePhoto; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePhoto2483); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePhoto"


    // $ANTLR start "rulePhoto"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1196:1: rulePhoto returns [EObject current=null] : ( () otherlv_1= 'Photo' otherlv_2= '{' (otherlv_3= 'taille' ( (lv_taille_4_0= ruleEFloat ) ) )? (otherlv_5= 'extension' ( (lv_extension_6_0= ruleEString ) ) )? (otherlv_7= 'nom' ( (lv_nom_8_0= ruleEString ) ) )? otherlv_9= '}' ) ;
    public final EObject rulePhoto() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_taille_4_0 = null;

        AntlrDatatypeRuleToken lv_extension_6_0 = null;

        AntlrDatatypeRuleToken lv_nom_8_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1199:28: ( ( () otherlv_1= 'Photo' otherlv_2= '{' (otherlv_3= 'taille' ( (lv_taille_4_0= ruleEFloat ) ) )? (otherlv_5= 'extension' ( (lv_extension_6_0= ruleEString ) ) )? (otherlv_7= 'nom' ( (lv_nom_8_0= ruleEString ) ) )? otherlv_9= '}' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1200:1: ( () otherlv_1= 'Photo' otherlv_2= '{' (otherlv_3= 'taille' ( (lv_taille_4_0= ruleEFloat ) ) )? (otherlv_5= 'extension' ( (lv_extension_6_0= ruleEString ) ) )? (otherlv_7= 'nom' ( (lv_nom_8_0= ruleEString ) ) )? otherlv_9= '}' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1200:1: ( () otherlv_1= 'Photo' otherlv_2= '{' (otherlv_3= 'taille' ( (lv_taille_4_0= ruleEFloat ) ) )? (otherlv_5= 'extension' ( (lv_extension_6_0= ruleEString ) ) )? (otherlv_7= 'nom' ( (lv_nom_8_0= ruleEString ) ) )? otherlv_9= '}' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1200:2: () otherlv_1= 'Photo' otherlv_2= '{' (otherlv_3= 'taille' ( (lv_taille_4_0= ruleEFloat ) ) )? (otherlv_5= 'extension' ( (lv_extension_6_0= ruleEString ) ) )? (otherlv_7= 'nom' ( (lv_nom_8_0= ruleEString ) ) )? otherlv_9= '}'
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1200:2: ()
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1201:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getPhotoAccess().getPhotoAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,52,FollowSets000.FOLLOW_52_in_rulePhoto2529); 

                	newLeafNode(otherlv_1, grammarAccess.getPhotoAccess().getPhotoKeyword_1());
                
            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_rulePhoto2541); 

                	newLeafNode(otherlv_2, grammarAccess.getPhotoAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1214:1: (otherlv_3= 'taille' ( (lv_taille_4_0= ruleEFloat ) ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==31) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1214:3: otherlv_3= 'taille' ( (lv_taille_4_0= ruleEFloat ) )
                    {
                    otherlv_3=(Token)match(input,31,FollowSets000.FOLLOW_31_in_rulePhoto2554); 

                        	newLeafNode(otherlv_3, grammarAccess.getPhotoAccess().getTailleKeyword_3_0());
                        
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1218:1: ( (lv_taille_4_0= ruleEFloat ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1219:1: (lv_taille_4_0= ruleEFloat )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1219:1: (lv_taille_4_0= ruleEFloat )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1220:3: lv_taille_4_0= ruleEFloat
                    {
                     
                    	        newCompositeNode(grammarAccess.getPhotoAccess().getTailleEFloatParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEFloat_in_rulePhoto2575);
                    lv_taille_4_0=ruleEFloat();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPhotoRule());
                    	        }
                           		set(
                           			current, 
                           			"taille",
                            		lv_taille_4_0, 
                            		"EFloat");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1236:4: (otherlv_5= 'extension' ( (lv_extension_6_0= ruleEString ) ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==53) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1236:6: otherlv_5= 'extension' ( (lv_extension_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,53,FollowSets000.FOLLOW_53_in_rulePhoto2590); 

                        	newLeafNode(otherlv_5, grammarAccess.getPhotoAccess().getExtensionKeyword_4_0());
                        
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1240:1: ( (lv_extension_6_0= ruleEString ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1241:1: (lv_extension_6_0= ruleEString )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1241:1: (lv_extension_6_0= ruleEString )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1242:3: lv_extension_6_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getPhotoAccess().getExtensionEStringParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_rulePhoto2611);
                    lv_extension_6_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPhotoRule());
                    	        }
                           		set(
                           			current, 
                           			"extension",
                            		lv_extension_6_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1258:4: (otherlv_7= 'nom' ( (lv_nom_8_0= ruleEString ) ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==21) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1258:6: otherlv_7= 'nom' ( (lv_nom_8_0= ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,21,FollowSets000.FOLLOW_21_in_rulePhoto2626); 

                        	newLeafNode(otherlv_7, grammarAccess.getPhotoAccess().getNomKeyword_5_0());
                        
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1262:1: ( (lv_nom_8_0= ruleEString ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1263:1: (lv_nom_8_0= ruleEString )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1263:1: (lv_nom_8_0= ruleEString )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1264:3: lv_nom_8_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getPhotoAccess().getNomEStringParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_rulePhoto2647);
                    lv_nom_8_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPhotoRule());
                    	        }
                           		set(
                           			current, 
                           			"nom",
                            		lv_nom_8_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,15,FollowSets000.FOLLOW_15_in_rulePhoto2661); 

                	newLeafNode(otherlv_9, grammarAccess.getPhotoAccess().getRightCurlyBracketKeyword_6());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePhoto"


    // $ANTLR start "entryRuleEFloat"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1294:1: entryRuleEFloat returns [String current=null] : iv_ruleEFloat= ruleEFloat EOF ;
    public final String entryRuleEFloat() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEFloat = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1295:2: (iv_ruleEFloat= ruleEFloat EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1296:2: iv_ruleEFloat= ruleEFloat EOF
            {
             newCompositeNode(grammarAccess.getEFloatRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEFloat_in_entryRuleEFloat2700);
            iv_ruleEFloat=ruleEFloat();

            state._fsp--;

             current =iv_ruleEFloat.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEFloat2711); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEFloat"


    // $ANTLR start "ruleEFloat"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1303:1: ruleEFloat returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleEFloat() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;
        Token this_INT_7=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1306:28: ( ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1307:1: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1307:1: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1307:2: (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1307:2: (kw= '-' )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==44) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1308:2: kw= '-'
                    {
                    kw=(Token)match(input,44,FollowSets000.FOLLOW_44_in_ruleEFloat2750); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEFloatAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;

            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1313:3: (this_INT_1= RULE_INT )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==RULE_INT) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1313:8: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEFloat2768); 

                    		current.merge(this_INT_1);
                        
                     
                        newLeafNode(this_INT_1, grammarAccess.getEFloatAccess().getINTTerminalRuleCall_1()); 
                        

                    }
                    break;

            }

            kw=(Token)match(input,54,FollowSets000.FOLLOW_54_in_ruleEFloat2788); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getEFloatAccess().getFullStopKeyword_2()); 
                
            this_INT_3=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEFloat2803); 

            		current.merge(this_INT_3);
                
             
                newLeafNode(this_INT_3, grammarAccess.getEFloatAccess().getINTTerminalRuleCall_3()); 
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1333:1: ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( ((LA40_0>=55 && LA40_0<=56)) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1333:2: (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1333:2: (kw= 'E' | kw= 'e' )
                    int alt38=2;
                    int LA38_0 = input.LA(1);

                    if ( (LA38_0==55) ) {
                        alt38=1;
                    }
                    else if ( (LA38_0==56) ) {
                        alt38=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 38, 0, input);

                        throw nvae;
                    }
                    switch (alt38) {
                        case 1 :
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1334:2: kw= 'E'
                            {
                            kw=(Token)match(input,55,FollowSets000.FOLLOW_55_in_ruleEFloat2823); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getEFloatAccess().getEKeyword_4_0_0()); 
                                

                            }
                            break;
                        case 2 :
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1341:2: kw= 'e'
                            {
                            kw=(Token)match(input,56,FollowSets000.FOLLOW_56_in_ruleEFloat2842); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getEFloatAccess().getEKeyword_4_0_1()); 
                                

                            }
                            break;

                    }

                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1346:2: (kw= '-' )?
                    int alt39=2;
                    int LA39_0 = input.LA(1);

                    if ( (LA39_0==44) ) {
                        alt39=1;
                    }
                    switch (alt39) {
                        case 1 :
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1347:2: kw= '-'
                            {
                            kw=(Token)match(input,44,FollowSets000.FOLLOW_44_in_ruleEFloat2857); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getEFloatAccess().getHyphenMinusKeyword_4_1()); 
                                

                            }
                            break;

                    }

                    this_INT_7=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEFloat2874); 

                    		current.merge(this_INT_7);
                        
                     
                        newLeafNode(this_INT_7, grammarAccess.getEFloatAccess().getINTTerminalRuleCall_4_2()); 
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEFloat"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_rulePagePrincipale_in_entryRulePagePrincipale75 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePagePrincipale85 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_rulePagePrincipale122 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_rulePagePrincipale134 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_rulePagePrincipale146 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_rulePagePrincipale158 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_ruleContact_in_rulePagePrincipale179 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_14_in_rulePagePrincipale192 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_ruleContact_in_rulePagePrincipale213 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_15_in_rulePagePrincipale227 = new BitSet(new long[]{0x0000000000070000L});
        public static final BitSet FOLLOW_16_in_rulePagePrincipale240 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_ruleRubriques_in_rulePagePrincipale261 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_17_in_rulePagePrincipale276 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_rulePagePrincipale288 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_ruleFichiers_in_rulePagePrincipale309 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_14_in_rulePagePrincipale322 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_ruleFichiers_in_rulePagePrincipale343 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_15_in_rulePagePrincipale357 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_rulePagePrincipale371 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_ruleConfigurationPage_in_rulePagePrincipale392 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_rulePagePrincipale404 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_rulePagePrincipale416 = new BitSet(new long[]{0x0000008000000000L});
        public static final BitSet FOLLOW_rulePageInterne_in_rulePagePrincipale437 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_14_in_rulePagePrincipale450 = new BitSet(new long[]{0x0000008000000000L});
        public static final BitSet FOLLOW_rulePageInterne_in_rulePagePrincipale471 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_15_in_rulePagePrincipale485 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_rulePagePrincipale497 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleContact_in_entryRuleContact533 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleContact543 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_ruleContact589 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleContact601 = new BitSet(new long[]{0x0000000003E08000L});
        public static final BitSet FOLLOW_21_in_ruleContact614 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleContact635 = new BitSet(new long[]{0x0000000003C08000L});
        public static final BitSet FOLLOW_22_in_ruleContact650 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleContact671 = new BitSet(new long[]{0x0000000003808000L});
        public static final BitSet FOLLOW_23_in_ruleContact686 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleContact707 = new BitSet(new long[]{0x0000000003008000L});
        public static final BitSet FOLLOW_24_in_ruleContact722 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleContact743 = new BitSet(new long[]{0x0000000002008000L});
        public static final BitSet FOLLOW_25_in_ruleContact758 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleContact779 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleContact793 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRubriques_in_entryRuleRubriques829 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRubriques839 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_ruleRubriques885 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleRubriques897 = new BitSet(new long[]{0x0000000018008000L});
        public static final BitSet FOLLOW_27_in_ruleRubriques910 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleRubriques931 = new BitSet(new long[]{0x0000000010008000L});
        public static final BitSet FOLLOW_28_in_ruleRubriques946 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleRubriques967 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleRubriques981 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFichiers_in_entryRuleFichiers1017 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFichiers1027 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_ruleFichiers1073 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleFichiers1085 = new BitSet(new long[]{0x00000001C0208000L});
        public static final BitSet FOLLOW_30_in_ruleFichiers1098 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleFichiers1119 = new BitSet(new long[]{0x0000000180208000L});
        public static final BitSet FOLLOW_31_in_ruleFichiers1134 = new BitSet(new long[]{0x0000100000000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleFichiers1155 = new BitSet(new long[]{0x0000000100208000L});
        public static final BitSet FOLLOW_21_in_ruleFichiers1170 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleFichiers1191 = new BitSet(new long[]{0x0000000100008000L});
        public static final BitSet FOLLOW_32_in_ruleFichiers1206 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleFichiers1227 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleFichiers1241 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConfigurationPage_in_entryRuleConfigurationPage1277 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleConfigurationPage1287 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_ruleConfigurationPage1333 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleConfigurationPage1345 = new BitSet(new long[]{0x0000007C00008000L});
        public static final BitSet FOLLOW_34_in_ruleConfigurationPage1358 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleConfigurationPage1379 = new BitSet(new long[]{0x0000007800008000L});
        public static final BitSet FOLLOW_35_in_ruleConfigurationPage1394 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleConfigurationPage1415 = new BitSet(new long[]{0x0000007000008000L});
        public static final BitSet FOLLOW_36_in_ruleConfigurationPage1430 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleConfigurationPage1451 = new BitSet(new long[]{0x0000006000008000L});
        public static final BitSet FOLLOW_37_in_ruleConfigurationPage1466 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleConfigurationPage1487 = new BitSet(new long[]{0x0000004000008000L});
        public static final BitSet FOLLOW_38_in_ruleConfigurationPage1502 = new BitSet(new long[]{0x0000100000000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleConfigurationPage1523 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleConfigurationPage1537 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePageInterne_in_entryRulePageInterne1573 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePageInterne1583 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_rulePageInterne1620 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_rulePageInterne1632 = new BitSet(new long[]{0x00000F0008000000L});
        public static final BitSet FOLLOW_40_in_rulePageInterne1645 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_rulePageInterne1666 = new BitSet(new long[]{0x00000E0008000000L});
        public static final BitSet FOLLOW_27_in_rulePageInterne1681 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_rulePageInterne1702 = new BitSet(new long[]{0x00000E0000000000L});
        public static final BitSet FOLLOW_41_in_rulePageInterne1717 = new BitSet(new long[]{0x0000E00000000000L});
        public static final BitSet FOLLOW_ruleTypes_in_rulePageInterne1738 = new BitSet(new long[]{0x00000C0000000000L});
        public static final BitSet FOLLOW_42_in_rulePageInterne1753 = new BitSet(new long[]{0x0001000000000000L});
        public static final BitSet FOLLOW_ruleLiens_in_rulePageInterne1774 = new BitSet(new long[]{0x0000080000000000L});
        public static final BitSet FOLLOW_43_in_rulePageInterne1788 = new BitSet(new long[]{0x0010000000000000L});
        public static final BitSet FOLLOW_rulePhoto_in_rulePageInterne1809 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_rulePageInterne1821 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString1858 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString1869 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleEString1909 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEString1935 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_entryRuleEInt1981 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEInt1992 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_44_in_ruleEInt2031 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEInt2048 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypes_in_entryRuleTypes2093 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTypes2103 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_45_in_ruleTypes2155 = new BitSet(new long[]{0x0000C00000000000L});
        public static final BitSet FOLLOW_46_in_ruleTypes2187 = new BitSet(new long[]{0x0000800000000000L});
        public static final BitSet FOLLOW_47_in_ruleTypes2213 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLiens_in_entryRuleLiens2249 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLiens2259 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_48_in_ruleLiens2305 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleLiens2317 = new BitSet(new long[]{0x000E000000008000L});
        public static final BitSet FOLLOW_49_in_ruleLiens2330 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleLiens2351 = new BitSet(new long[]{0x000C000000008000L});
        public static final BitSet FOLLOW_50_in_ruleLiens2366 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleLiens2387 = new BitSet(new long[]{0x0008000000008000L});
        public static final BitSet FOLLOW_51_in_ruleLiens2402 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleLiens2423 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleLiens2437 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePhoto_in_entryRulePhoto2473 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePhoto2483 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_52_in_rulePhoto2529 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_rulePhoto2541 = new BitSet(new long[]{0x0020000080208000L});
        public static final BitSet FOLLOW_31_in_rulePhoto2554 = new BitSet(new long[]{0x0040100000000040L});
        public static final BitSet FOLLOW_ruleEFloat_in_rulePhoto2575 = new BitSet(new long[]{0x0020000000208000L});
        public static final BitSet FOLLOW_53_in_rulePhoto2590 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_rulePhoto2611 = new BitSet(new long[]{0x0000000000208000L});
        public static final BitSet FOLLOW_21_in_rulePhoto2626 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_rulePhoto2647 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_rulePhoto2661 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEFloat_in_entryRuleEFloat2700 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEFloat2711 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_44_in_ruleEFloat2750 = new BitSet(new long[]{0x0040000000000040L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEFloat2768 = new BitSet(new long[]{0x0040000000000000L});
        public static final BitSet FOLLOW_54_in_ruleEFloat2788 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEFloat2803 = new BitSet(new long[]{0x0180000000000002L});
        public static final BitSet FOLLOW_55_in_ruleEFloat2823 = new BitSet(new long[]{0x0000100000000040L});
        public static final BitSet FOLLOW_56_in_ruleEFloat2842 = new BitSet(new long[]{0x0000100000000040L});
        public static final BitSet FOLLOW_44_in_ruleEFloat2857 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEFloat2874 = new BitSet(new long[]{0x0000000000000002L});
    }


}