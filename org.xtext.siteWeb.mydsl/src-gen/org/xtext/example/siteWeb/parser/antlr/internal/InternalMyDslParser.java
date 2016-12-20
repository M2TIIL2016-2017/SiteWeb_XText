package org.xtext.example.siteWeb.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.siteWeb.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'PagePrincipale'", "'{'", "'configurationPage'", "'contacts'", "','", "'}'", "'pages'", "'rubriques'", "'fichiers'", "'Contact'", "'nom : '", "'prenom : '", "'adresse : '", "'mail : '", "'@'", "'.'", "'telephone : '", "'Rubriques'", "'texte : '", "'lien : '", "'Fichiers'", "'type : '", "'taille : '", "'emplacement : '", "'ConfigurationPage'", "'couleurFond : '", "'titreSite : '", "'auteurs : '", "'couleurPolice : '", "'taillePolice : '", "'PageInterne'", "'titrePage : '", "'types : '", "'liens : '", "'photo : '", "'-'", "'gras'", "'italique'", "'Types'", "'Liens'", "'fichier : '", "'adresseWeb : '", "'pageInterne : '", "'Photo'", "'extension : '", "'E'", "'e'"
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
    public String getGrammarFileName() { return "../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g"; }



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
    // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:67:1: entryRulePagePrincipale returns [EObject current=null] : iv_rulePagePrincipale= rulePagePrincipale EOF ;
    public final EObject entryRulePagePrincipale() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePagePrincipale = null;


        try {
            // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:68:2: (iv_rulePagePrincipale= rulePagePrincipale EOF )
            // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:69:2: iv_rulePagePrincipale= rulePagePrincipale EOF
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
    // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:76:1: rulePagePrincipale returns [EObject current=null] : (otherlv_0= 'PagePrincipale' otherlv_1= '{' otherlv_2= 'configurationPage' ( (lv_configurationPage_3_0= ruleConfigurationPage ) ) otherlv_4= 'contacts' otherlv_5= '{' ( (lv_contacts_6_0= ruleContact ) ) (otherlv_7= ',' ( (lv_contacts_8_0= ruleContact ) ) )* otherlv_9= '}' otherlv_10= 'pages' otherlv_11= '{' ( (lv_pages_12_0= rulePageInterne ) ) (otherlv_13= ',' ( (lv_pages_14_0= rulePageInterne ) ) )* otherlv_15= '}' (otherlv_16= 'rubriques' ( (lv_rubriques_17_0= ruleRubriques ) ) )? (otherlv_18= 'fichiers' otherlv_19= '{' ( (lv_fichiers_20_0= ruleFichiers ) ) (otherlv_21= ',' ( (lv_fichiers_22_0= ruleFichiers ) ) )* otherlv_23= '}' )? otherlv_24= '}' ) ;
    public final EObject rulePagePrincipale() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
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
        EObject lv_configurationPage_3_0 = null;

        EObject lv_contacts_6_0 = null;

        EObject lv_contacts_8_0 = null;

        EObject lv_pages_12_0 = null;

        EObject lv_pages_14_0 = null;

        EObject lv_rubriques_17_0 = null;

        EObject lv_fichiers_20_0 = null;

        EObject lv_fichiers_22_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:79:28: ( (otherlv_0= 'PagePrincipale' otherlv_1= '{' otherlv_2= 'configurationPage' ( (lv_configurationPage_3_0= ruleConfigurationPage ) ) otherlv_4= 'contacts' otherlv_5= '{' ( (lv_contacts_6_0= ruleContact ) ) (otherlv_7= ',' ( (lv_contacts_8_0= ruleContact ) ) )* otherlv_9= '}' otherlv_10= 'pages' otherlv_11= '{' ( (lv_pages_12_0= rulePageInterne ) ) (otherlv_13= ',' ( (lv_pages_14_0= rulePageInterne ) ) )* otherlv_15= '}' (otherlv_16= 'rubriques' ( (lv_rubriques_17_0= ruleRubriques ) ) )? (otherlv_18= 'fichiers' otherlv_19= '{' ( (lv_fichiers_20_0= ruleFichiers ) ) (otherlv_21= ',' ( (lv_fichiers_22_0= ruleFichiers ) ) )* otherlv_23= '}' )? otherlv_24= '}' ) )
            // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:80:1: (otherlv_0= 'PagePrincipale' otherlv_1= '{' otherlv_2= 'configurationPage' ( (lv_configurationPage_3_0= ruleConfigurationPage ) ) otherlv_4= 'contacts' otherlv_5= '{' ( (lv_contacts_6_0= ruleContact ) ) (otherlv_7= ',' ( (lv_contacts_8_0= ruleContact ) ) )* otherlv_9= '}' otherlv_10= 'pages' otherlv_11= '{' ( (lv_pages_12_0= rulePageInterne ) ) (otherlv_13= ',' ( (lv_pages_14_0= rulePageInterne ) ) )* otherlv_15= '}' (otherlv_16= 'rubriques' ( (lv_rubriques_17_0= ruleRubriques ) ) )? (otherlv_18= 'fichiers' otherlv_19= '{' ( (lv_fichiers_20_0= ruleFichiers ) ) (otherlv_21= ',' ( (lv_fichiers_22_0= ruleFichiers ) ) )* otherlv_23= '}' )? otherlv_24= '}' )
            {
            // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:80:1: (otherlv_0= 'PagePrincipale' otherlv_1= '{' otherlv_2= 'configurationPage' ( (lv_configurationPage_3_0= ruleConfigurationPage ) ) otherlv_4= 'contacts' otherlv_5= '{' ( (lv_contacts_6_0= ruleContact ) ) (otherlv_7= ',' ( (lv_contacts_8_0= ruleContact ) ) )* otherlv_9= '}' otherlv_10= 'pages' otherlv_11= '{' ( (lv_pages_12_0= rulePageInterne ) ) (otherlv_13= ',' ( (lv_pages_14_0= rulePageInterne ) ) )* otherlv_15= '}' (otherlv_16= 'rubriques' ( (lv_rubriques_17_0= ruleRubriques ) ) )? (otherlv_18= 'fichiers' otherlv_19= '{' ( (lv_fichiers_20_0= ruleFichiers ) ) (otherlv_21= ',' ( (lv_fichiers_22_0= ruleFichiers ) ) )* otherlv_23= '}' )? otherlv_24= '}' )
            // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:80:3: otherlv_0= 'PagePrincipale' otherlv_1= '{' otherlv_2= 'configurationPage' ( (lv_configurationPage_3_0= ruleConfigurationPage ) ) otherlv_4= 'contacts' otherlv_5= '{' ( (lv_contacts_6_0= ruleContact ) ) (otherlv_7= ',' ( (lv_contacts_8_0= ruleContact ) ) )* otherlv_9= '}' otherlv_10= 'pages' otherlv_11= '{' ( (lv_pages_12_0= rulePageInterne ) ) (otherlv_13= ',' ( (lv_pages_14_0= rulePageInterne ) ) )* otherlv_15= '}' (otherlv_16= 'rubriques' ( (lv_rubriques_17_0= ruleRubriques ) ) )? (otherlv_18= 'fichiers' otherlv_19= '{' ( (lv_fichiers_20_0= ruleFichiers ) ) (otherlv_21= ',' ( (lv_fichiers_22_0= ruleFichiers ) ) )* otherlv_23= '}' )? otherlv_24= '}'
            {
            otherlv_0=(Token)match(input,11,FollowSets000.FOLLOW_11_in_rulePagePrincipale122); 

                	newLeafNode(otherlv_0, grammarAccess.getPagePrincipaleAccess().getPagePrincipaleKeyword_0());
                
            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_rulePagePrincipale134); 

                	newLeafNode(otherlv_1, grammarAccess.getPagePrincipaleAccess().getLeftCurlyBracketKeyword_1());
                
            otherlv_2=(Token)match(input,13,FollowSets000.FOLLOW_13_in_rulePagePrincipale146); 

                	newLeafNode(otherlv_2, grammarAccess.getPagePrincipaleAccess().getConfigurationPageKeyword_2());
                
            // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:92:1: ( (lv_configurationPage_3_0= ruleConfigurationPage ) )
            // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:93:1: (lv_configurationPage_3_0= ruleConfigurationPage )
            {
            // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:93:1: (lv_configurationPage_3_0= ruleConfigurationPage )
            // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:94:3: lv_configurationPage_3_0= ruleConfigurationPage
            {
             
            	        newCompositeNode(grammarAccess.getPagePrincipaleAccess().getConfigurationPageConfigurationPageParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleConfigurationPage_in_rulePagePrincipale167);
            lv_configurationPage_3_0=ruleConfigurationPage();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPagePrincipaleRule());
            	        }
                   		set(
                   			current, 
                   			"configurationPage",
                    		lv_configurationPage_3_0, 
                    		"ConfigurationPage");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,14,FollowSets000.FOLLOW_14_in_rulePagePrincipale179); 

                	newLeafNode(otherlv_4, grammarAccess.getPagePrincipaleAccess().getContactsKeyword_4());
                
            otherlv_5=(Token)match(input,12,FollowSets000.FOLLOW_12_in_rulePagePrincipale191); 

                	newLeafNode(otherlv_5, grammarAccess.getPagePrincipaleAccess().getLeftCurlyBracketKeyword_5());
                
            // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:118:1: ( (lv_contacts_6_0= ruleContact ) )
            // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:119:1: (lv_contacts_6_0= ruleContact )
            {
            // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:119:1: (lv_contacts_6_0= ruleContact )
            // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:120:3: lv_contacts_6_0= ruleContact
            {
             
            	        newCompositeNode(grammarAccess.getPagePrincipaleAccess().getContactsContactParserRuleCall_6_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleContact_in_rulePagePrincipale212);
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

            // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:136:2: (otherlv_7= ',' ( (lv_contacts_8_0= ruleContact ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==15) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:136:4: otherlv_7= ',' ( (lv_contacts_8_0= ruleContact ) )
            	    {
            	    otherlv_7=(Token)match(input,15,FollowSets000.FOLLOW_15_in_rulePagePrincipale225); 

            	        	newLeafNode(otherlv_7, grammarAccess.getPagePrincipaleAccess().getCommaKeyword_7_0());
            	        
            	    // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:140:1: ( (lv_contacts_8_0= ruleContact ) )
            	    // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:141:1: (lv_contacts_8_0= ruleContact )
            	    {
            	    // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:141:1: (lv_contacts_8_0= ruleContact )
            	    // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:142:3: lv_contacts_8_0= ruleContact
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPagePrincipaleAccess().getContactsContactParserRuleCall_7_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleContact_in_rulePagePrincipale246);
            	    lv_contacts_8_0=ruleContact();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPagePrincipaleRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"contacts",
            	            		lv_contacts_8_0, 
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

            otherlv_9=(Token)match(input,16,FollowSets000.FOLLOW_16_in_rulePagePrincipale260); 

                	newLeafNode(otherlv_9, grammarAccess.getPagePrincipaleAccess().getRightCurlyBracketKeyword_8());
                
            otherlv_10=(Token)match(input,17,FollowSets000.FOLLOW_17_in_rulePagePrincipale272); 

                	newLeafNode(otherlv_10, grammarAccess.getPagePrincipaleAccess().getPagesKeyword_9());
                
            otherlv_11=(Token)match(input,12,FollowSets000.FOLLOW_12_in_rulePagePrincipale284); 

                	newLeafNode(otherlv_11, grammarAccess.getPagePrincipaleAccess().getLeftCurlyBracketKeyword_10());
                
            // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:170:1: ( (lv_pages_12_0= rulePageInterne ) )
            // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:171:1: (lv_pages_12_0= rulePageInterne )
            {
            // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:171:1: (lv_pages_12_0= rulePageInterne )
            // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:172:3: lv_pages_12_0= rulePageInterne
            {
             
            	        newCompositeNode(grammarAccess.getPagePrincipaleAccess().getPagesPageInterneParserRuleCall_11_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_rulePageInterne_in_rulePagePrincipale305);
            lv_pages_12_0=rulePageInterne();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPagePrincipaleRule());
            	        }
                   		add(
                   			current, 
                   			"pages",
                    		lv_pages_12_0, 
                    		"PageInterne");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:188:2: (otherlv_13= ',' ( (lv_pages_14_0= rulePageInterne ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==15) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:188:4: otherlv_13= ',' ( (lv_pages_14_0= rulePageInterne ) )
            	    {
            	    otherlv_13=(Token)match(input,15,FollowSets000.FOLLOW_15_in_rulePagePrincipale318); 

            	        	newLeafNode(otherlv_13, grammarAccess.getPagePrincipaleAccess().getCommaKeyword_12_0());
            	        
            	    // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:192:1: ( (lv_pages_14_0= rulePageInterne ) )
            	    // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:193:1: (lv_pages_14_0= rulePageInterne )
            	    {
            	    // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:193:1: (lv_pages_14_0= rulePageInterne )
            	    // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:194:3: lv_pages_14_0= rulePageInterne
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPagePrincipaleAccess().getPagesPageInterneParserRuleCall_12_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_rulePageInterne_in_rulePagePrincipale339);
            	    lv_pages_14_0=rulePageInterne();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPagePrincipaleRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"pages",
            	            		lv_pages_14_0, 
            	            		"PageInterne");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_15=(Token)match(input,16,FollowSets000.FOLLOW_16_in_rulePagePrincipale353); 

                	newLeafNode(otherlv_15, grammarAccess.getPagePrincipaleAccess().getRightCurlyBracketKeyword_13());
                
            // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:214:1: (otherlv_16= 'rubriques' ( (lv_rubriques_17_0= ruleRubriques ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==18) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:214:3: otherlv_16= 'rubriques' ( (lv_rubriques_17_0= ruleRubriques ) )
                    {
                    otherlv_16=(Token)match(input,18,FollowSets000.FOLLOW_18_in_rulePagePrincipale366); 

                        	newLeafNode(otherlv_16, grammarAccess.getPagePrincipaleAccess().getRubriquesKeyword_14_0());
                        
                    // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:218:1: ( (lv_rubriques_17_0= ruleRubriques ) )
                    // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:219:1: (lv_rubriques_17_0= ruleRubriques )
                    {
                    // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:219:1: (lv_rubriques_17_0= ruleRubriques )
                    // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:220:3: lv_rubriques_17_0= ruleRubriques
                    {
                     
                    	        newCompositeNode(grammarAccess.getPagePrincipaleAccess().getRubriquesRubriquesParserRuleCall_14_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleRubriques_in_rulePagePrincipale387);
                    lv_rubriques_17_0=ruleRubriques();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPagePrincipaleRule());
                    	        }
                           		set(
                           			current, 
                           			"rubriques",
                            		lv_rubriques_17_0, 
                            		"Rubriques");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:236:4: (otherlv_18= 'fichiers' otherlv_19= '{' ( (lv_fichiers_20_0= ruleFichiers ) ) (otherlv_21= ',' ( (lv_fichiers_22_0= ruleFichiers ) ) )* otherlv_23= '}' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==19) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:236:6: otherlv_18= 'fichiers' otherlv_19= '{' ( (lv_fichiers_20_0= ruleFichiers ) ) (otherlv_21= ',' ( (lv_fichiers_22_0= ruleFichiers ) ) )* otherlv_23= '}'
                    {
                    otherlv_18=(Token)match(input,19,FollowSets000.FOLLOW_19_in_rulePagePrincipale402); 

                        	newLeafNode(otherlv_18, grammarAccess.getPagePrincipaleAccess().getFichiersKeyword_15_0());
                        
                    otherlv_19=(Token)match(input,12,FollowSets000.FOLLOW_12_in_rulePagePrincipale414); 

                        	newLeafNode(otherlv_19, grammarAccess.getPagePrincipaleAccess().getLeftCurlyBracketKeyword_15_1());
                        
                    // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:244:1: ( (lv_fichiers_20_0= ruleFichiers ) )
                    // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:245:1: (lv_fichiers_20_0= ruleFichiers )
                    {
                    // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:245:1: (lv_fichiers_20_0= ruleFichiers )
                    // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:246:3: lv_fichiers_20_0= ruleFichiers
                    {
                     
                    	        newCompositeNode(grammarAccess.getPagePrincipaleAccess().getFichiersFichiersParserRuleCall_15_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleFichiers_in_rulePagePrincipale435);
                    lv_fichiers_20_0=ruleFichiers();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPagePrincipaleRule());
                    	        }
                           		add(
                           			current, 
                           			"fichiers",
                            		lv_fichiers_20_0, 
                            		"Fichiers");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:262:2: (otherlv_21= ',' ( (lv_fichiers_22_0= ruleFichiers ) ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==15) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:262:4: otherlv_21= ',' ( (lv_fichiers_22_0= ruleFichiers ) )
                    	    {
                    	    otherlv_21=(Token)match(input,15,FollowSets000.FOLLOW_15_in_rulePagePrincipale448); 

                    	        	newLeafNode(otherlv_21, grammarAccess.getPagePrincipaleAccess().getCommaKeyword_15_3_0());
                    	        
                    	    // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:266:1: ( (lv_fichiers_22_0= ruleFichiers ) )
                    	    // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:267:1: (lv_fichiers_22_0= ruleFichiers )
                    	    {
                    	    // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:267:1: (lv_fichiers_22_0= ruleFichiers )
                    	    // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:268:3: lv_fichiers_22_0= ruleFichiers
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getPagePrincipaleAccess().getFichiersFichiersParserRuleCall_15_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleFichiers_in_rulePagePrincipale469);
                    	    lv_fichiers_22_0=ruleFichiers();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getPagePrincipaleRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"fichiers",
                    	            		lv_fichiers_22_0, 
                    	            		"Fichiers");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    otherlv_23=(Token)match(input,16,FollowSets000.FOLLOW_16_in_rulePagePrincipale483); 

                        	newLeafNode(otherlv_23, grammarAccess.getPagePrincipaleAccess().getRightCurlyBracketKeyword_15_4());
                        

                    }
                    break;

            }

            otherlv_24=(Token)match(input,16,FollowSets000.FOLLOW_16_in_rulePagePrincipale497); 

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
    // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:300:1: entryRuleContact returns [EObject current=null] : iv_ruleContact= ruleContact EOF ;
    public final EObject entryRuleContact() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContact = null;


        try {
            // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:301:2: (iv_ruleContact= ruleContact EOF )
            // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:302:2: iv_ruleContact= ruleContact EOF
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
    // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:309:1: ruleContact returns [EObject current=null] : ( () otherlv_1= 'Contact' otherlv_2= '{' (otherlv_3= 'nom : ' ( (lv_nom_4_0= ruleEString ) ) )? (otherlv_5= 'prenom : ' ( (lv_prenom_6_0= ruleEString ) ) )? (otherlv_7= 'adresse : ' ( (lv_adresse_8_0= ruleEString ) ) )? (otherlv_9= 'mail : ' ( (lv_mail_10_0= ruleEString ) )+ otherlv_11= '@' ( ruleEString )+ otherlv_13= '.' ruleEString ruleEString ruleEString ) (otherlv_17= 'telephone : ' ( (lv_telephone_18_0= ruleEString ) ) )? otherlv_19= '}' ) ;
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
        Token otherlv_17=null;
        Token otherlv_19=null;
        AntlrDatatypeRuleToken lv_nom_4_0 = null;

        AntlrDatatypeRuleToken lv_prenom_6_0 = null;

        AntlrDatatypeRuleToken lv_adresse_8_0 = null;

        AntlrDatatypeRuleToken lv_mail_10_0 = null;

        AntlrDatatypeRuleToken lv_telephone_18_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:312:28: ( ( () otherlv_1= 'Contact' otherlv_2= '{' (otherlv_3= 'nom : ' ( (lv_nom_4_0= ruleEString ) ) )? (otherlv_5= 'prenom : ' ( (lv_prenom_6_0= ruleEString ) ) )? (otherlv_7= 'adresse : ' ( (lv_adresse_8_0= ruleEString ) ) )? (otherlv_9= 'mail : ' ( (lv_mail_10_0= ruleEString ) )+ otherlv_11= '@' ( ruleEString )+ otherlv_13= '.' ruleEString ruleEString ruleEString ) (otherlv_17= 'telephone : ' ( (lv_telephone_18_0= ruleEString ) ) )? otherlv_19= '}' ) )
            // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:313:1: ( () otherlv_1= 'Contact' otherlv_2= '{' (otherlv_3= 'nom : ' ( (lv_nom_4_0= ruleEString ) ) )? (otherlv_5= 'prenom : ' ( (lv_prenom_6_0= ruleEString ) ) )? (otherlv_7= 'adresse : ' ( (lv_adresse_8_0= ruleEString ) ) )? (otherlv_9= 'mail : ' ( (lv_mail_10_0= ruleEString ) )+ otherlv_11= '@' ( ruleEString )+ otherlv_13= '.' ruleEString ruleEString ruleEString ) (otherlv_17= 'telephone : ' ( (lv_telephone_18_0= ruleEString ) ) )? otherlv_19= '}' )
            {
            // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:313:1: ( () otherlv_1= 'Contact' otherlv_2= '{' (otherlv_3= 'nom : ' ( (lv_nom_4_0= ruleEString ) ) )? (otherlv_5= 'prenom : ' ( (lv_prenom_6_0= ruleEString ) ) )? (otherlv_7= 'adresse : ' ( (lv_adresse_8_0= ruleEString ) ) )? (otherlv_9= 'mail : ' ( (lv_mail_10_0= ruleEString ) )+ otherlv_11= '@' ( ruleEString )+ otherlv_13= '.' ruleEString ruleEString ruleEString ) (otherlv_17= 'telephone : ' ( (lv_telephone_18_0= ruleEString ) ) )? otherlv_19= '}' )
            // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:313:2: () otherlv_1= 'Contact' otherlv_2= '{' (otherlv_3= 'nom : ' ( (lv_nom_4_0= ruleEString ) ) )? (otherlv_5= 'prenom : ' ( (lv_prenom_6_0= ruleEString ) ) )? (otherlv_7= 'adresse : ' ( (lv_adresse_8_0= ruleEString ) ) )? (otherlv_9= 'mail : ' ( (lv_mail_10_0= ruleEString ) )+ otherlv_11= '@' ( ruleEString )+ otherlv_13= '.' ruleEString ruleEString ruleEString ) (otherlv_17= 'telephone : ' ( (lv_telephone_18_0= ruleEString ) ) )? otherlv_19= '}'
            {
            // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:313:2: ()
            // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:314:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getContactAccess().getContactAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleContact589); 

                	newLeafNode(otherlv_1, grammarAccess.getContactAccess().getContactKeyword_1());
                
            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleContact601); 

                	newLeafNode(otherlv_2, grammarAccess.getContactAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:327:1: (otherlv_3= 'nom : ' ( (lv_nom_4_0= ruleEString ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==21) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:327:3: otherlv_3= 'nom : ' ( (lv_nom_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleContact614); 

                        	newLeafNode(otherlv_3, grammarAccess.getContactAccess().getNomKeyword_3_0());
                        
                    // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:331:1: ( (lv_nom_4_0= ruleEString ) )
                    // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:332:1: (lv_nom_4_0= ruleEString )
                    {
                    // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:332:1: (lv_nom_4_0= ruleEString )
                    // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:333:3: lv_nom_4_0= ruleEString
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

            // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:349:4: (otherlv_5= 'prenom : ' ( (lv_prenom_6_0= ruleEString ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==22) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:349:6: otherlv_5= 'prenom : ' ( (lv_prenom_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleContact650); 

                        	newLeafNode(otherlv_5, grammarAccess.getContactAccess().getPrenomKeyword_4_0());
                        
                    // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:353:1: ( (lv_prenom_6_0= ruleEString ) )
                    // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:354:1: (lv_prenom_6_0= ruleEString )
                    {
                    // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:354:1: (lv_prenom_6_0= ruleEString )
                    // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:355:3: lv_prenom_6_0= ruleEString
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

            // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:371:4: (otherlv_7= 'adresse : ' ( (lv_adresse_8_0= ruleEString ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==23) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:371:6: otherlv_7= 'adresse : ' ( (lv_adresse_8_0= ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleContact686); 

                        	newLeafNode(otherlv_7, grammarAccess.getContactAccess().getAdresseKeyword_5_0());
                        
                    // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:375:1: ( (lv_adresse_8_0= ruleEString ) )
                    // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:376:1: (lv_adresse_8_0= ruleEString )
                    {
                    // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:376:1: (lv_adresse_8_0= ruleEString )
                    // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:377:3: lv_adresse_8_0= ruleEString
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

            // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:393:4: (otherlv_9= 'mail : ' ( (lv_mail_10_0= ruleEString ) )+ otherlv_11= '@' ( ruleEString )+ otherlv_13= '.' ruleEString ruleEString ruleEString )
            // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:393:6: otherlv_9= 'mail : ' ( (lv_mail_10_0= ruleEString ) )+ otherlv_11= '@' ( ruleEString )+ otherlv_13= '.' ruleEString ruleEString ruleEString
            {
            otherlv_9=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleContact722); 

                	newLeafNode(otherlv_9, grammarAccess.getContactAccess().getMailKeyword_6_0());
                
            // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:397:1: ( (lv_mail_10_0= ruleEString ) )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=RULE_STRING && LA9_0<=RULE_ID)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:398:1: (lv_mail_10_0= ruleEString )
            	    {
            	    // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:398:1: (lv_mail_10_0= ruleEString )
            	    // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:399:3: lv_mail_10_0= ruleEString
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
            	    break;

            	default :
            	    if ( cnt9 >= 1 ) break loop9;
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
            } while (true);

            otherlv_11=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleContact756); 

                	newLeafNode(otherlv_11, grammarAccess.getContactAccess().getCommercialAtKeyword_6_2());
                
            // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:419:1: ( ruleEString )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=RULE_STRING && LA10_0<=RULE_ID)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:420:5: ruleEString
            	    {
            	     
            	            newCompositeNode(grammarAccess.getContactAccess().getEStringParserRuleCall_6_3()); 
            	        
            	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleContact773);
            	    ruleEString();

            	    state._fsp--;

            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    if ( cnt10 >= 1 ) break loop10;
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
            } while (true);

            otherlv_13=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleContact786); 

                	newLeafNode(otherlv_13, grammarAccess.getContactAccess().getFullStopKeyword_6_4());
                
             
                    newCompositeNode(grammarAccess.getContactAccess().getEStringParserRuleCall_6_5()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleContact802);
            ruleEString();

            state._fsp--;

             
                    afterParserOrEnumRuleCall();
                
             
                    newCompositeNode(grammarAccess.getContactAccess().getEStringParserRuleCall_6_6()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleContact817);
            ruleEString();

            state._fsp--;

             
                    afterParserOrEnumRuleCall();
                
             
                    newCompositeNode(grammarAccess.getContactAccess().getEStringParserRuleCall_6_7()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleContact832);
            ruleEString();

            state._fsp--;

             
                    afterParserOrEnumRuleCall();
                

            }

            // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:455:2: (otherlv_17= 'telephone : ' ( (lv_telephone_18_0= ruleEString ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==27) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:455:4: otherlv_17= 'telephone : ' ( (lv_telephone_18_0= ruleEString ) )
                    {
                    otherlv_17=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleContact845); 

                        	newLeafNode(otherlv_17, grammarAccess.getContactAccess().getTelephoneKeyword_7_0());
                        
                    // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:459:1: ( (lv_telephone_18_0= ruleEString ) )
                    // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:460:1: (lv_telephone_18_0= ruleEString )
                    {
                    // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:460:1: (lv_telephone_18_0= ruleEString )
                    // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:461:3: lv_telephone_18_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getContactAccess().getTelephoneEStringParserRuleCall_7_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleContact866);
                    lv_telephone_18_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getContactRule());
                    	        }
                           		set(
                           			current, 
                           			"telephone",
                            		lv_telephone_18_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_19=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleContact880); 

                	newLeafNode(otherlv_19, grammarAccess.getContactAccess().getRightCurlyBracketKeyword_8());
                

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
    // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:489:1: entryRuleRubriques returns [EObject current=null] : iv_ruleRubriques= ruleRubriques EOF ;
    public final EObject entryRuleRubriques() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRubriques = null;


        try {
            // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:490:2: (iv_ruleRubriques= ruleRubriques EOF )
            // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:491:2: iv_ruleRubriques= ruleRubriques EOF
            {
             newCompositeNode(grammarAccess.getRubriquesRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRubriques_in_entryRuleRubriques916);
            iv_ruleRubriques=ruleRubriques();

            state._fsp--;

             current =iv_ruleRubriques; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRubriques926); 

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
    // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:498:1: ruleRubriques returns [EObject current=null] : ( () otherlv_1= 'Rubriques' otherlv_2= '{' (otherlv_3= 'texte : ' ( (lv_texte_4_0= ruleEString ) ) )? (otherlv_5= 'lien : ' ( (lv_lien_6_0= ruleEString ) ) )? otherlv_7= '}' ) ;
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
            // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:501:28: ( ( () otherlv_1= 'Rubriques' otherlv_2= '{' (otherlv_3= 'texte : ' ( (lv_texte_4_0= ruleEString ) ) )? (otherlv_5= 'lien : ' ( (lv_lien_6_0= ruleEString ) ) )? otherlv_7= '}' ) )
            // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:502:1: ( () otherlv_1= 'Rubriques' otherlv_2= '{' (otherlv_3= 'texte : ' ( (lv_texte_4_0= ruleEString ) ) )? (otherlv_5= 'lien : ' ( (lv_lien_6_0= ruleEString ) ) )? otherlv_7= '}' )
            {
            // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:502:1: ( () otherlv_1= 'Rubriques' otherlv_2= '{' (otherlv_3= 'texte : ' ( (lv_texte_4_0= ruleEString ) ) )? (otherlv_5= 'lien : ' ( (lv_lien_6_0= ruleEString ) ) )? otherlv_7= '}' )
            // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:502:2: () otherlv_1= 'Rubriques' otherlv_2= '{' (otherlv_3= 'texte : ' ( (lv_texte_4_0= ruleEString ) ) )? (otherlv_5= 'lien : ' ( (lv_lien_6_0= ruleEString ) ) )? otherlv_7= '}'
            {
            // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:502:2: ()
            // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:503:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getRubriquesAccess().getRubriquesAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleRubriques972); 

                	newLeafNode(otherlv_1, grammarAccess.getRubriquesAccess().getRubriquesKeyword_1());
                
            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleRubriques984); 

                	newLeafNode(otherlv_2, grammarAccess.getRubriquesAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:516:1: (otherlv_3= 'texte : ' ( (lv_texte_4_0= ruleEString ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==29) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:516:3: otherlv_3= 'texte : ' ( (lv_texte_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleRubriques997); 

                        	newLeafNode(otherlv_3, grammarAccess.getRubriquesAccess().getTexteKeyword_3_0());
                        
                    // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:520:1: ( (lv_texte_4_0= ruleEString ) )
                    // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:521:1: (lv_texte_4_0= ruleEString )
                    {
                    // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:521:1: (lv_texte_4_0= ruleEString )
                    // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:522:3: lv_texte_4_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getRubriquesAccess().getTexteEStringParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleRubriques1018);
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

            // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:538:4: (otherlv_5= 'lien : ' ( (lv_lien_6_0= ruleEString ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==30) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:538:6: otherlv_5= 'lien : ' ( (lv_lien_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleRubriques1033); 

                        	newLeafNode(otherlv_5, grammarAccess.getRubriquesAccess().getLienKeyword_4_0());
                        
                    // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:542:1: ( (lv_lien_6_0= ruleEString ) )
                    // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:543:1: (lv_lien_6_0= ruleEString )
                    {
                    // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:543:1: (lv_lien_6_0= ruleEString )
                    // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:544:3: lv_lien_6_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getRubriquesAccess().getLienEStringParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleRubriques1054);
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

            otherlv_7=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleRubriques1068); 

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
    // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:572:1: entryRuleFichiers returns [EObject current=null] : iv_ruleFichiers= ruleFichiers EOF ;
    public final EObject entryRuleFichiers() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFichiers = null;


        try {
            // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:573:2: (iv_ruleFichiers= ruleFichiers EOF )
            // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:574:2: iv_ruleFichiers= ruleFichiers EOF
            {
             newCompositeNode(grammarAccess.getFichiersRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleFichiers_in_entryRuleFichiers1104);
            iv_ruleFichiers=ruleFichiers();

            state._fsp--;

             current =iv_ruleFichiers; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFichiers1114); 

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
    // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:581:1: ruleFichiers returns [EObject current=null] : ( () otherlv_1= 'Fichiers' otherlv_2= '{' (otherlv_3= 'type : ' ( (lv_type_4_0= ruleEString ) ) )? (otherlv_5= 'taille : ' ( (lv_taille_6_0= ruleEInt ) ) )? (otherlv_7= 'nom : ' ( (lv_nom_8_0= ruleEString ) ) )? (otherlv_9= 'emplacement : ' ( (lv_emplacement_10_0= ruleEString ) ) )? otherlv_11= '}' ) ;
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
            // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:584:28: ( ( () otherlv_1= 'Fichiers' otherlv_2= '{' (otherlv_3= 'type : ' ( (lv_type_4_0= ruleEString ) ) )? (otherlv_5= 'taille : ' ( (lv_taille_6_0= ruleEInt ) ) )? (otherlv_7= 'nom : ' ( (lv_nom_8_0= ruleEString ) ) )? (otherlv_9= 'emplacement : ' ( (lv_emplacement_10_0= ruleEString ) ) )? otherlv_11= '}' ) )
            // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:585:1: ( () otherlv_1= 'Fichiers' otherlv_2= '{' (otherlv_3= 'type : ' ( (lv_type_4_0= ruleEString ) ) )? (otherlv_5= 'taille : ' ( (lv_taille_6_0= ruleEInt ) ) )? (otherlv_7= 'nom : ' ( (lv_nom_8_0= ruleEString ) ) )? (otherlv_9= 'emplacement : ' ( (lv_emplacement_10_0= ruleEString ) ) )? otherlv_11= '}' )
            {
            // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:585:1: ( () otherlv_1= 'Fichiers' otherlv_2= '{' (otherlv_3= 'type : ' ( (lv_type_4_0= ruleEString ) ) )? (otherlv_5= 'taille : ' ( (lv_taille_6_0= ruleEInt ) ) )? (otherlv_7= 'nom : ' ( (lv_nom_8_0= ruleEString ) ) )? (otherlv_9= 'emplacement : ' ( (lv_emplacement_10_0= ruleEString ) ) )? otherlv_11= '}' )
            // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:585:2: () otherlv_1= 'Fichiers' otherlv_2= '{' (otherlv_3= 'type : ' ( (lv_type_4_0= ruleEString ) ) )? (otherlv_5= 'taille : ' ( (lv_taille_6_0= ruleEInt ) ) )? (otherlv_7= 'nom : ' ( (lv_nom_8_0= ruleEString ) ) )? (otherlv_9= 'emplacement : ' ( (lv_emplacement_10_0= ruleEString ) ) )? otherlv_11= '}'
            {
            // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:585:2: ()
            // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:586:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getFichiersAccess().getFichiersAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleFichiers1160); 

                	newLeafNode(otherlv_1, grammarAccess.getFichiersAccess().getFichiersKeyword_1());
                
            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleFichiers1172); 

                	newLeafNode(otherlv_2, grammarAccess.getFichiersAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:599:1: (otherlv_3= 'type : ' ( (lv_type_4_0= ruleEString ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==32) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:599:3: otherlv_3= 'type : ' ( (lv_type_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleFichiers1185); 

                        	newLeafNode(otherlv_3, grammarAccess.getFichiersAccess().getTypeKeyword_3_0());
                        
                    // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:603:1: ( (lv_type_4_0= ruleEString ) )
                    // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:604:1: (lv_type_4_0= ruleEString )
                    {
                    // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:604:1: (lv_type_4_0= ruleEString )
                    // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:605:3: lv_type_4_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getFichiersAccess().getTypeEStringParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleFichiers1206);
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

            // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:621:4: (otherlv_5= 'taille : ' ( (lv_taille_6_0= ruleEInt ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==33) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:621:6: otherlv_5= 'taille : ' ( (lv_taille_6_0= ruleEInt ) )
                    {
                    otherlv_5=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleFichiers1221); 

                        	newLeafNode(otherlv_5, grammarAccess.getFichiersAccess().getTailleKeyword_4_0());
                        
                    // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:625:1: ( (lv_taille_6_0= ruleEInt ) )
                    // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:626:1: (lv_taille_6_0= ruleEInt )
                    {
                    // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:626:1: (lv_taille_6_0= ruleEInt )
                    // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:627:3: lv_taille_6_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getFichiersAccess().getTailleEIntParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleFichiers1242);
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

            // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:643:4: (otherlv_7= 'nom : ' ( (lv_nom_8_0= ruleEString ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==21) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:643:6: otherlv_7= 'nom : ' ( (lv_nom_8_0= ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleFichiers1257); 

                        	newLeafNode(otherlv_7, grammarAccess.getFichiersAccess().getNomKeyword_5_0());
                        
                    // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:647:1: ( (lv_nom_8_0= ruleEString ) )
                    // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:648:1: (lv_nom_8_0= ruleEString )
                    {
                    // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:648:1: (lv_nom_8_0= ruleEString )
                    // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:649:3: lv_nom_8_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getFichiersAccess().getNomEStringParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleFichiers1278);
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

            // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:665:4: (otherlv_9= 'emplacement : ' ( (lv_emplacement_10_0= ruleEString ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==34) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:665:6: otherlv_9= 'emplacement : ' ( (lv_emplacement_10_0= ruleEString ) )
                    {
                    otherlv_9=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleFichiers1293); 

                        	newLeafNode(otherlv_9, grammarAccess.getFichiersAccess().getEmplacementKeyword_6_0());
                        
                    // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:669:1: ( (lv_emplacement_10_0= ruleEString ) )
                    // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:670:1: (lv_emplacement_10_0= ruleEString )
                    {
                    // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:670:1: (lv_emplacement_10_0= ruleEString )
                    // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:671:3: lv_emplacement_10_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getFichiersAccess().getEmplacementEStringParserRuleCall_6_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleFichiers1314);
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

            otherlv_11=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleFichiers1328); 

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
    // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:699:1: entryRuleConfigurationPage returns [EObject current=null] : iv_ruleConfigurationPage= ruleConfigurationPage EOF ;
    public final EObject entryRuleConfigurationPage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfigurationPage = null;


        try {
            // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:700:2: (iv_ruleConfigurationPage= ruleConfigurationPage EOF )
            // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:701:2: iv_ruleConfigurationPage= ruleConfigurationPage EOF
            {
             newCompositeNode(grammarAccess.getConfigurationPageRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleConfigurationPage_in_entryRuleConfigurationPage1364);
            iv_ruleConfigurationPage=ruleConfigurationPage();

            state._fsp--;

             current =iv_ruleConfigurationPage; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleConfigurationPage1374); 

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
    // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:708:1: ruleConfigurationPage returns [EObject current=null] : ( () otherlv_1= 'ConfigurationPage' otherlv_2= '{' (otherlv_3= 'couleurFond : ' ( (lv_couleurFond_4_0= ruleEString ) ) )? (otherlv_5= 'titreSite : ' ( (lv_titreSite_6_0= ruleEString ) ) )? (otherlv_7= 'auteurs : ' ( (lv_auteurs_8_0= ruleEString ) ) )? (otherlv_9= 'couleurPolice : ' ( (lv_couleurPolice_10_0= ruleEString ) ) )? (otherlv_11= 'taillePolice : ' ( (lv_taillePolice_12_0= ruleEInt ) ) )? otherlv_13= '}' ) ;
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
            // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:711:28: ( ( () otherlv_1= 'ConfigurationPage' otherlv_2= '{' (otherlv_3= 'couleurFond : ' ( (lv_couleurFond_4_0= ruleEString ) ) )? (otherlv_5= 'titreSite : ' ( (lv_titreSite_6_0= ruleEString ) ) )? (otherlv_7= 'auteurs : ' ( (lv_auteurs_8_0= ruleEString ) ) )? (otherlv_9= 'couleurPolice : ' ( (lv_couleurPolice_10_0= ruleEString ) ) )? (otherlv_11= 'taillePolice : ' ( (lv_taillePolice_12_0= ruleEInt ) ) )? otherlv_13= '}' ) )
            // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:712:1: ( () otherlv_1= 'ConfigurationPage' otherlv_2= '{' (otherlv_3= 'couleurFond : ' ( (lv_couleurFond_4_0= ruleEString ) ) )? (otherlv_5= 'titreSite : ' ( (lv_titreSite_6_0= ruleEString ) ) )? (otherlv_7= 'auteurs : ' ( (lv_auteurs_8_0= ruleEString ) ) )? (otherlv_9= 'couleurPolice : ' ( (lv_couleurPolice_10_0= ruleEString ) ) )? (otherlv_11= 'taillePolice : ' ( (lv_taillePolice_12_0= ruleEInt ) ) )? otherlv_13= '}' )
            {
            // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:712:1: ( () otherlv_1= 'ConfigurationPage' otherlv_2= '{' (otherlv_3= 'couleurFond : ' ( (lv_couleurFond_4_0= ruleEString ) ) )? (otherlv_5= 'titreSite : ' ( (lv_titreSite_6_0= ruleEString ) ) )? (otherlv_7= 'auteurs : ' ( (lv_auteurs_8_0= ruleEString ) ) )? (otherlv_9= 'couleurPolice : ' ( (lv_couleurPolice_10_0= ruleEString ) ) )? (otherlv_11= 'taillePolice : ' ( (lv_taillePolice_12_0= ruleEInt ) ) )? otherlv_13= '}' )
            // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:712:2: () otherlv_1= 'ConfigurationPage' otherlv_2= '{' (otherlv_3= 'couleurFond : ' ( (lv_couleurFond_4_0= ruleEString ) ) )? (otherlv_5= 'titreSite : ' ( (lv_titreSite_6_0= ruleEString ) ) )? (otherlv_7= 'auteurs : ' ( (lv_auteurs_8_0= ruleEString ) ) )? (otherlv_9= 'couleurPolice : ' ( (lv_couleurPolice_10_0= ruleEString ) ) )? (otherlv_11= 'taillePolice : ' ( (lv_taillePolice_12_0= ruleEInt ) ) )? otherlv_13= '}'
            {
            // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:712:2: ()
            // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:713:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getConfigurationPageAccess().getConfigurationPageAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleConfigurationPage1420); 

                	newLeafNode(otherlv_1, grammarAccess.getConfigurationPageAccess().getConfigurationPageKeyword_1());
                
            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleConfigurationPage1432); 

                	newLeafNode(otherlv_2, grammarAccess.getConfigurationPageAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:726:1: (otherlv_3= 'couleurFond : ' ( (lv_couleurFond_4_0= ruleEString ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==36) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:726:3: otherlv_3= 'couleurFond : ' ( (lv_couleurFond_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleConfigurationPage1445); 

                        	newLeafNode(otherlv_3, grammarAccess.getConfigurationPageAccess().getCouleurFondKeyword_3_0());
                        
                    // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:730:1: ( (lv_couleurFond_4_0= ruleEString ) )
                    // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:731:1: (lv_couleurFond_4_0= ruleEString )
                    {
                    // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:731:1: (lv_couleurFond_4_0= ruleEString )
                    // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:732:3: lv_couleurFond_4_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getConfigurationPageAccess().getCouleurFondEStringParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleConfigurationPage1466);
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

            // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:748:4: (otherlv_5= 'titreSite : ' ( (lv_titreSite_6_0= ruleEString ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==37) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:748:6: otherlv_5= 'titreSite : ' ( (lv_titreSite_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleConfigurationPage1481); 

                        	newLeafNode(otherlv_5, grammarAccess.getConfigurationPageAccess().getTitreSiteKeyword_4_0());
                        
                    // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:752:1: ( (lv_titreSite_6_0= ruleEString ) )
                    // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:753:1: (lv_titreSite_6_0= ruleEString )
                    {
                    // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:753:1: (lv_titreSite_6_0= ruleEString )
                    // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:754:3: lv_titreSite_6_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getConfigurationPageAccess().getTitreSiteEStringParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleConfigurationPage1502);
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

            // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:770:4: (otherlv_7= 'auteurs : ' ( (lv_auteurs_8_0= ruleEString ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==38) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:770:6: otherlv_7= 'auteurs : ' ( (lv_auteurs_8_0= ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleConfigurationPage1517); 

                        	newLeafNode(otherlv_7, grammarAccess.getConfigurationPageAccess().getAuteursKeyword_5_0());
                        
                    // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:774:1: ( (lv_auteurs_8_0= ruleEString ) )
                    // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:775:1: (lv_auteurs_8_0= ruleEString )
                    {
                    // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:775:1: (lv_auteurs_8_0= ruleEString )
                    // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:776:3: lv_auteurs_8_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getConfigurationPageAccess().getAuteursEStringParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleConfigurationPage1538);
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

            // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:792:4: (otherlv_9= 'couleurPolice : ' ( (lv_couleurPolice_10_0= ruleEString ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==39) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:792:6: otherlv_9= 'couleurPolice : ' ( (lv_couleurPolice_10_0= ruleEString ) )
                    {
                    otherlv_9=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleConfigurationPage1553); 

                        	newLeafNode(otherlv_9, grammarAccess.getConfigurationPageAccess().getCouleurPoliceKeyword_6_0());
                        
                    // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:796:1: ( (lv_couleurPolice_10_0= ruleEString ) )
                    // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:797:1: (lv_couleurPolice_10_0= ruleEString )
                    {
                    // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:797:1: (lv_couleurPolice_10_0= ruleEString )
                    // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:798:3: lv_couleurPolice_10_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getConfigurationPageAccess().getCouleurPoliceEStringParserRuleCall_6_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleConfigurationPage1574);
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

            // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:814:4: (otherlv_11= 'taillePolice : ' ( (lv_taillePolice_12_0= ruleEInt ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==40) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:814:6: otherlv_11= 'taillePolice : ' ( (lv_taillePolice_12_0= ruleEInt ) )
                    {
                    otherlv_11=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleConfigurationPage1589); 

                        	newLeafNode(otherlv_11, grammarAccess.getConfigurationPageAccess().getTaillePoliceKeyword_7_0());
                        
                    // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:818:1: ( (lv_taillePolice_12_0= ruleEInt ) )
                    // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:819:1: (lv_taillePolice_12_0= ruleEInt )
                    {
                    // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:819:1: (lv_taillePolice_12_0= ruleEInt )
                    // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:820:3: lv_taillePolice_12_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getConfigurationPageAccess().getTaillePoliceEIntParserRuleCall_7_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleConfigurationPage1610);
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

            otherlv_13=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleConfigurationPage1624); 

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
    // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:848:1: entryRulePageInterne returns [EObject current=null] : iv_rulePageInterne= rulePageInterne EOF ;
    public final EObject entryRulePageInterne() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePageInterne = null;


        try {
            // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:849:2: (iv_rulePageInterne= rulePageInterne EOF )
            // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:850:2: iv_rulePageInterne= rulePageInterne EOF
            {
             newCompositeNode(grammarAccess.getPageInterneRule()); 
            pushFollow(FollowSets000.FOLLOW_rulePageInterne_in_entryRulePageInterne1660);
            iv_rulePageInterne=rulePageInterne();

            state._fsp--;

             current =iv_rulePageInterne; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePageInterne1670); 

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
    // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:857:1: rulePageInterne returns [EObject current=null] : (otherlv_0= 'PageInterne' otherlv_1= '{' (otherlv_2= 'titrePage : ' ( (lv_titrePage_3_0= ruleEString ) ) )? (otherlv_4= 'texte : ' ( (lv_texte_5_0= ruleEString ) ) )? (otherlv_6= 'types : ' ( (lv_types_7_0= ruleTypes ) ) )? (otherlv_8= 'liens : ' ( (lv_liens_9_0= ruleLiens ) ) )? otherlv_10= 'photo : ' ( (lv_photo_11_0= rulePhoto ) ) otherlv_12= '}' ) ;
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
            // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:860:28: ( (otherlv_0= 'PageInterne' otherlv_1= '{' (otherlv_2= 'titrePage : ' ( (lv_titrePage_3_0= ruleEString ) ) )? (otherlv_4= 'texte : ' ( (lv_texte_5_0= ruleEString ) ) )? (otherlv_6= 'types : ' ( (lv_types_7_0= ruleTypes ) ) )? (otherlv_8= 'liens : ' ( (lv_liens_9_0= ruleLiens ) ) )? otherlv_10= 'photo : ' ( (lv_photo_11_0= rulePhoto ) ) otherlv_12= '}' ) )
            // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:861:1: (otherlv_0= 'PageInterne' otherlv_1= '{' (otherlv_2= 'titrePage : ' ( (lv_titrePage_3_0= ruleEString ) ) )? (otherlv_4= 'texte : ' ( (lv_texte_5_0= ruleEString ) ) )? (otherlv_6= 'types : ' ( (lv_types_7_0= ruleTypes ) ) )? (otherlv_8= 'liens : ' ( (lv_liens_9_0= ruleLiens ) ) )? otherlv_10= 'photo : ' ( (lv_photo_11_0= rulePhoto ) ) otherlv_12= '}' )
            {
            // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:861:1: (otherlv_0= 'PageInterne' otherlv_1= '{' (otherlv_2= 'titrePage : ' ( (lv_titrePage_3_0= ruleEString ) ) )? (otherlv_4= 'texte : ' ( (lv_texte_5_0= ruleEString ) ) )? (otherlv_6= 'types : ' ( (lv_types_7_0= ruleTypes ) ) )? (otherlv_8= 'liens : ' ( (lv_liens_9_0= ruleLiens ) ) )? otherlv_10= 'photo : ' ( (lv_photo_11_0= rulePhoto ) ) otherlv_12= '}' )
            // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:861:3: otherlv_0= 'PageInterne' otherlv_1= '{' (otherlv_2= 'titrePage : ' ( (lv_titrePage_3_0= ruleEString ) ) )? (otherlv_4= 'texte : ' ( (lv_texte_5_0= ruleEString ) ) )? (otherlv_6= 'types : ' ( (lv_types_7_0= ruleTypes ) ) )? (otherlv_8= 'liens : ' ( (lv_liens_9_0= ruleLiens ) ) )? otherlv_10= 'photo : ' ( (lv_photo_11_0= rulePhoto ) ) otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,41,FollowSets000.FOLLOW_41_in_rulePageInterne1707); 

                	newLeafNode(otherlv_0, grammarAccess.getPageInterneAccess().getPageInterneKeyword_0());
                
            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_rulePageInterne1719); 

                	newLeafNode(otherlv_1, grammarAccess.getPageInterneAccess().getLeftCurlyBracketKeyword_1());
                
            // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:869:1: (otherlv_2= 'titrePage : ' ( (lv_titrePage_3_0= ruleEString ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==42) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:869:3: otherlv_2= 'titrePage : ' ( (lv_titrePage_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,42,FollowSets000.FOLLOW_42_in_rulePageInterne1732); 

                        	newLeafNode(otherlv_2, grammarAccess.getPageInterneAccess().getTitrePageKeyword_2_0());
                        
                    // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:873:1: ( (lv_titrePage_3_0= ruleEString ) )
                    // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:874:1: (lv_titrePage_3_0= ruleEString )
                    {
                    // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:874:1: (lv_titrePage_3_0= ruleEString )
                    // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:875:3: lv_titrePage_3_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getPageInterneAccess().getTitrePageEStringParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_rulePageInterne1753);
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

            // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:891:4: (otherlv_4= 'texte : ' ( (lv_texte_5_0= ruleEString ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==29) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:891:6: otherlv_4= 'texte : ' ( (lv_texte_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,29,FollowSets000.FOLLOW_29_in_rulePageInterne1768); 

                        	newLeafNode(otherlv_4, grammarAccess.getPageInterneAccess().getTexteKeyword_3_0());
                        
                    // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:895:1: ( (lv_texte_5_0= ruleEString ) )
                    // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:896:1: (lv_texte_5_0= ruleEString )
                    {
                    // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:896:1: (lv_texte_5_0= ruleEString )
                    // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:897:3: lv_texte_5_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getPageInterneAccess().getTexteEStringParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_rulePageInterne1789);
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

            // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:913:4: (otherlv_6= 'types : ' ( (lv_types_7_0= ruleTypes ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==43) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:913:6: otherlv_6= 'types : ' ( (lv_types_7_0= ruleTypes ) )
                    {
                    otherlv_6=(Token)match(input,43,FollowSets000.FOLLOW_43_in_rulePageInterne1804); 

                        	newLeafNode(otherlv_6, grammarAccess.getPageInterneAccess().getTypesKeyword_4_0());
                        
                    // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:917:1: ( (lv_types_7_0= ruleTypes ) )
                    // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:918:1: (lv_types_7_0= ruleTypes )
                    {
                    // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:918:1: (lv_types_7_0= ruleTypes )
                    // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:919:3: lv_types_7_0= ruleTypes
                    {
                     
                    	        newCompositeNode(grammarAccess.getPageInterneAccess().getTypesTypesParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleTypes_in_rulePageInterne1825);
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

            // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:935:4: (otherlv_8= 'liens : ' ( (lv_liens_9_0= ruleLiens ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==44) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:935:6: otherlv_8= 'liens : ' ( (lv_liens_9_0= ruleLiens ) )
                    {
                    otherlv_8=(Token)match(input,44,FollowSets000.FOLLOW_44_in_rulePageInterne1840); 

                        	newLeafNode(otherlv_8, grammarAccess.getPageInterneAccess().getLiensKeyword_5_0());
                        
                    // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:939:1: ( (lv_liens_9_0= ruleLiens ) )
                    // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:940:1: (lv_liens_9_0= ruleLiens )
                    {
                    // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:940:1: (lv_liens_9_0= ruleLiens )
                    // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:941:3: lv_liens_9_0= ruleLiens
                    {
                     
                    	        newCompositeNode(grammarAccess.getPageInterneAccess().getLiensLiensParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleLiens_in_rulePageInterne1861);
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

            otherlv_10=(Token)match(input,45,FollowSets000.FOLLOW_45_in_rulePageInterne1875); 

                	newLeafNode(otherlv_10, grammarAccess.getPageInterneAccess().getPhotoKeyword_6());
                
            // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:961:1: ( (lv_photo_11_0= rulePhoto ) )
            // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:962:1: (lv_photo_11_0= rulePhoto )
            {
            // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:962:1: (lv_photo_11_0= rulePhoto )
            // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:963:3: lv_photo_11_0= rulePhoto
            {
             
            	        newCompositeNode(grammarAccess.getPageInterneAccess().getPhotoPhotoParserRuleCall_7_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_rulePhoto_in_rulePageInterne1896);
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

            otherlv_12=(Token)match(input,16,FollowSets000.FOLLOW_16_in_rulePageInterne1908); 

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
    // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:991:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:992:2: (iv_ruleEString= ruleEString EOF )
            // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:993:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString1945);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString1956); 

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
    // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:1000:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:1003:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:1004:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:1004:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_STRING) ) {
                alt27=1;
            }
            else if ( (LA27_0==RULE_ID) ) {
                alt27=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:1004:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleEString1996); 

                    		current.merge(this_STRING_0);
                        
                     
                        newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:1012:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEString2022); 

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
    // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:1027:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:1028:2: (iv_ruleEInt= ruleEInt EOF )
            // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:1029:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_entryRuleEInt2068);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEInt2079); 

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
    // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:1036:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;

         enterRule(); 
            
        try {
            // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:1039:28: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:1040:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:1040:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:1040:2: (kw= '-' )? this_INT_1= RULE_INT
            {
            // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:1040:2: (kw= '-' )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==46) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:1041:2: kw= '-'
                    {
                    kw=(Token)match(input,46,FollowSets000.FOLLOW_46_in_ruleEInt2118); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEInt2135); 

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
    // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:1061:1: entryRuleTypes returns [EObject current=null] : iv_ruleTypes= ruleTypes EOF ;
    public final EObject entryRuleTypes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypes = null;


        try {
            // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:1062:2: (iv_ruleTypes= ruleTypes EOF )
            // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:1063:2: iv_ruleTypes= ruleTypes EOF
            {
             newCompositeNode(grammarAccess.getTypesRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTypes_in_entryRuleTypes2180);
            iv_ruleTypes=ruleTypes();

            state._fsp--;

             current =iv_ruleTypes; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTypes2190); 

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
    // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:1070:1: ruleTypes returns [EObject current=null] : ( () ( (lv_gras_1_0= 'gras' ) )? ( (lv_italique_2_0= 'italique' ) )? otherlv_3= 'Types' ) ;
    public final EObject ruleTypes() throws RecognitionException {
        EObject current = null;

        Token lv_gras_1_0=null;
        Token lv_italique_2_0=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:1073:28: ( ( () ( (lv_gras_1_0= 'gras' ) )? ( (lv_italique_2_0= 'italique' ) )? otherlv_3= 'Types' ) )
            // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:1074:1: ( () ( (lv_gras_1_0= 'gras' ) )? ( (lv_italique_2_0= 'italique' ) )? otherlv_3= 'Types' )
            {
            // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:1074:1: ( () ( (lv_gras_1_0= 'gras' ) )? ( (lv_italique_2_0= 'italique' ) )? otherlv_3= 'Types' )
            // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:1074:2: () ( (lv_gras_1_0= 'gras' ) )? ( (lv_italique_2_0= 'italique' ) )? otherlv_3= 'Types'
            {
            // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:1074:2: ()
            // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:1075:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getTypesAccess().getTypesAction_0(),
                        current);
                

            }

            // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:1080:2: ( (lv_gras_1_0= 'gras' ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==47) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:1081:1: (lv_gras_1_0= 'gras' )
                    {
                    // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:1081:1: (lv_gras_1_0= 'gras' )
                    // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:1082:3: lv_gras_1_0= 'gras'
                    {
                    lv_gras_1_0=(Token)match(input,47,FollowSets000.FOLLOW_47_in_ruleTypes2242); 

                            newLeafNode(lv_gras_1_0, grammarAccess.getTypesAccess().getGrasGrasKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTypesRule());
                    	        }
                           		setWithLastConsumed(current, "gras", true, "gras");
                    	    

                    }


                    }
                    break;

            }

            // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:1095:3: ( (lv_italique_2_0= 'italique' ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==48) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:1096:1: (lv_italique_2_0= 'italique' )
                    {
                    // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:1096:1: (lv_italique_2_0= 'italique' )
                    // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:1097:3: lv_italique_2_0= 'italique'
                    {
                    lv_italique_2_0=(Token)match(input,48,FollowSets000.FOLLOW_48_in_ruleTypes2274); 

                            newLeafNode(lv_italique_2_0, grammarAccess.getTypesAccess().getItaliqueItaliqueKeyword_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTypesRule());
                    	        }
                           		setWithLastConsumed(current, "italique", true, "italique");
                    	    

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,49,FollowSets000.FOLLOW_49_in_ruleTypes2300); 

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
    // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:1122:1: entryRuleLiens returns [EObject current=null] : iv_ruleLiens= ruleLiens EOF ;
    public final EObject entryRuleLiens() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiens = null;


        try {
            // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:1123:2: (iv_ruleLiens= ruleLiens EOF )
            // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:1124:2: iv_ruleLiens= ruleLiens EOF
            {
             newCompositeNode(grammarAccess.getLiensRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleLiens_in_entryRuleLiens2336);
            iv_ruleLiens=ruleLiens();

            state._fsp--;

             current =iv_ruleLiens; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLiens2346); 

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
    // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:1131:1: ruleLiens returns [EObject current=null] : ( () otherlv_1= 'Liens' otherlv_2= '{' (otherlv_3= 'fichier : ' ( (lv_fichier_4_0= ruleEString ) ) )? (otherlv_5= 'adresseWeb : ' ( (lv_adresseWeb_6_0= ruleEString ) ) )? (otherlv_7= 'pageInterne : ' ( (lv_pageInterne_8_0= ruleEString ) ) )? otherlv_9= '}' ) ;
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
            // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:1134:28: ( ( () otherlv_1= 'Liens' otherlv_2= '{' (otherlv_3= 'fichier : ' ( (lv_fichier_4_0= ruleEString ) ) )? (otherlv_5= 'adresseWeb : ' ( (lv_adresseWeb_6_0= ruleEString ) ) )? (otherlv_7= 'pageInterne : ' ( (lv_pageInterne_8_0= ruleEString ) ) )? otherlv_9= '}' ) )
            // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:1135:1: ( () otherlv_1= 'Liens' otherlv_2= '{' (otherlv_3= 'fichier : ' ( (lv_fichier_4_0= ruleEString ) ) )? (otherlv_5= 'adresseWeb : ' ( (lv_adresseWeb_6_0= ruleEString ) ) )? (otherlv_7= 'pageInterne : ' ( (lv_pageInterne_8_0= ruleEString ) ) )? otherlv_9= '}' )
            {
            // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:1135:1: ( () otherlv_1= 'Liens' otherlv_2= '{' (otherlv_3= 'fichier : ' ( (lv_fichier_4_0= ruleEString ) ) )? (otherlv_5= 'adresseWeb : ' ( (lv_adresseWeb_6_0= ruleEString ) ) )? (otherlv_7= 'pageInterne : ' ( (lv_pageInterne_8_0= ruleEString ) ) )? otherlv_9= '}' )
            // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:1135:2: () otherlv_1= 'Liens' otherlv_2= '{' (otherlv_3= 'fichier : ' ( (lv_fichier_4_0= ruleEString ) ) )? (otherlv_5= 'adresseWeb : ' ( (lv_adresseWeb_6_0= ruleEString ) ) )? (otherlv_7= 'pageInterne : ' ( (lv_pageInterne_8_0= ruleEString ) ) )? otherlv_9= '}'
            {
            // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:1135:2: ()
            // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:1136:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getLiensAccess().getLiensAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,50,FollowSets000.FOLLOW_50_in_ruleLiens2392); 

                	newLeafNode(otherlv_1, grammarAccess.getLiensAccess().getLiensKeyword_1());
                
            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleLiens2404); 

                	newLeafNode(otherlv_2, grammarAccess.getLiensAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:1149:1: (otherlv_3= 'fichier : ' ( (lv_fichier_4_0= ruleEString ) ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==51) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:1149:3: otherlv_3= 'fichier : ' ( (lv_fichier_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,51,FollowSets000.FOLLOW_51_in_ruleLiens2417); 

                        	newLeafNode(otherlv_3, grammarAccess.getLiensAccess().getFichierKeyword_3_0());
                        
                    // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:1153:1: ( (lv_fichier_4_0= ruleEString ) )
                    // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:1154:1: (lv_fichier_4_0= ruleEString )
                    {
                    // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:1154:1: (lv_fichier_4_0= ruleEString )
                    // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:1155:3: lv_fichier_4_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getLiensAccess().getFichierEStringParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleLiens2438);
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

            // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:1171:4: (otherlv_5= 'adresseWeb : ' ( (lv_adresseWeb_6_0= ruleEString ) ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==52) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:1171:6: otherlv_5= 'adresseWeb : ' ( (lv_adresseWeb_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,52,FollowSets000.FOLLOW_52_in_ruleLiens2453); 

                        	newLeafNode(otherlv_5, grammarAccess.getLiensAccess().getAdresseWebKeyword_4_0());
                        
                    // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:1175:1: ( (lv_adresseWeb_6_0= ruleEString ) )
                    // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:1176:1: (lv_adresseWeb_6_0= ruleEString )
                    {
                    // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:1176:1: (lv_adresseWeb_6_0= ruleEString )
                    // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:1177:3: lv_adresseWeb_6_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getLiensAccess().getAdresseWebEStringParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleLiens2474);
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

            // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:1193:4: (otherlv_7= 'pageInterne : ' ( (lv_pageInterne_8_0= ruleEString ) ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==53) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:1193:6: otherlv_7= 'pageInterne : ' ( (lv_pageInterne_8_0= ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,53,FollowSets000.FOLLOW_53_in_ruleLiens2489); 

                        	newLeafNode(otherlv_7, grammarAccess.getLiensAccess().getPageInterneKeyword_5_0());
                        
                    // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:1197:1: ( (lv_pageInterne_8_0= ruleEString ) )
                    // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:1198:1: (lv_pageInterne_8_0= ruleEString )
                    {
                    // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:1198:1: (lv_pageInterne_8_0= ruleEString )
                    // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:1199:3: lv_pageInterne_8_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getLiensAccess().getPageInterneEStringParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleLiens2510);
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

            otherlv_9=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleLiens2524); 

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
    // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:1227:1: entryRulePhoto returns [EObject current=null] : iv_rulePhoto= rulePhoto EOF ;
    public final EObject entryRulePhoto() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePhoto = null;


        try {
            // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:1228:2: (iv_rulePhoto= rulePhoto EOF )
            // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:1229:2: iv_rulePhoto= rulePhoto EOF
            {
             newCompositeNode(grammarAccess.getPhotoRule()); 
            pushFollow(FollowSets000.FOLLOW_rulePhoto_in_entryRulePhoto2560);
            iv_rulePhoto=rulePhoto();

            state._fsp--;

             current =iv_rulePhoto; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePhoto2570); 

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
    // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:1236:1: rulePhoto returns [EObject current=null] : ( () otherlv_1= 'Photo' otherlv_2= '{' (otherlv_3= 'taille : ' ( (lv_taille_4_0= ruleEFloat ) ) )? (otherlv_5= 'extension : ' ( (lv_extension_6_0= ruleEString ) ) )? (otherlv_7= 'nom : ' ( (lv_nom_8_0= ruleEString ) ) )? otherlv_9= '}' ) ;
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
            // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:1239:28: ( ( () otherlv_1= 'Photo' otherlv_2= '{' (otherlv_3= 'taille : ' ( (lv_taille_4_0= ruleEFloat ) ) )? (otherlv_5= 'extension : ' ( (lv_extension_6_0= ruleEString ) ) )? (otherlv_7= 'nom : ' ( (lv_nom_8_0= ruleEString ) ) )? otherlv_9= '}' ) )
            // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:1240:1: ( () otherlv_1= 'Photo' otherlv_2= '{' (otherlv_3= 'taille : ' ( (lv_taille_4_0= ruleEFloat ) ) )? (otherlv_5= 'extension : ' ( (lv_extension_6_0= ruleEString ) ) )? (otherlv_7= 'nom : ' ( (lv_nom_8_0= ruleEString ) ) )? otherlv_9= '}' )
            {
            // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:1240:1: ( () otherlv_1= 'Photo' otherlv_2= '{' (otherlv_3= 'taille : ' ( (lv_taille_4_0= ruleEFloat ) ) )? (otherlv_5= 'extension : ' ( (lv_extension_6_0= ruleEString ) ) )? (otherlv_7= 'nom : ' ( (lv_nom_8_0= ruleEString ) ) )? otherlv_9= '}' )
            // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:1240:2: () otherlv_1= 'Photo' otherlv_2= '{' (otherlv_3= 'taille : ' ( (lv_taille_4_0= ruleEFloat ) ) )? (otherlv_5= 'extension : ' ( (lv_extension_6_0= ruleEString ) ) )? (otherlv_7= 'nom : ' ( (lv_nom_8_0= ruleEString ) ) )? otherlv_9= '}'
            {
            // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:1240:2: ()
            // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:1241:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getPhotoAccess().getPhotoAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,54,FollowSets000.FOLLOW_54_in_rulePhoto2616); 

                	newLeafNode(otherlv_1, grammarAccess.getPhotoAccess().getPhotoKeyword_1());
                
            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_rulePhoto2628); 

                	newLeafNode(otherlv_2, grammarAccess.getPhotoAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:1254:1: (otherlv_3= 'taille : ' ( (lv_taille_4_0= ruleEFloat ) ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==33) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:1254:3: otherlv_3= 'taille : ' ( (lv_taille_4_0= ruleEFloat ) )
                    {
                    otherlv_3=(Token)match(input,33,FollowSets000.FOLLOW_33_in_rulePhoto2641); 

                        	newLeafNode(otherlv_3, grammarAccess.getPhotoAccess().getTailleKeyword_3_0());
                        
                    // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:1258:1: ( (lv_taille_4_0= ruleEFloat ) )
                    // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:1259:1: (lv_taille_4_0= ruleEFloat )
                    {
                    // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:1259:1: (lv_taille_4_0= ruleEFloat )
                    // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:1260:3: lv_taille_4_0= ruleEFloat
                    {
                     
                    	        newCompositeNode(grammarAccess.getPhotoAccess().getTailleEFloatParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEFloat_in_rulePhoto2662);
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

            // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:1276:4: (otherlv_5= 'extension : ' ( (lv_extension_6_0= ruleEString ) ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==55) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:1276:6: otherlv_5= 'extension : ' ( (lv_extension_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,55,FollowSets000.FOLLOW_55_in_rulePhoto2677); 

                        	newLeafNode(otherlv_5, grammarAccess.getPhotoAccess().getExtensionKeyword_4_0());
                        
                    // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:1280:1: ( (lv_extension_6_0= ruleEString ) )
                    // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:1281:1: (lv_extension_6_0= ruleEString )
                    {
                    // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:1281:1: (lv_extension_6_0= ruleEString )
                    // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:1282:3: lv_extension_6_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getPhotoAccess().getExtensionEStringParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_rulePhoto2698);
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

            // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:1298:4: (otherlv_7= 'nom : ' ( (lv_nom_8_0= ruleEString ) ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==21) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:1298:6: otherlv_7= 'nom : ' ( (lv_nom_8_0= ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,21,FollowSets000.FOLLOW_21_in_rulePhoto2713); 

                        	newLeafNode(otherlv_7, grammarAccess.getPhotoAccess().getNomKeyword_5_0());
                        
                    // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:1302:1: ( (lv_nom_8_0= ruleEString ) )
                    // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:1303:1: (lv_nom_8_0= ruleEString )
                    {
                    // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:1303:1: (lv_nom_8_0= ruleEString )
                    // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:1304:3: lv_nom_8_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getPhotoAccess().getNomEStringParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_rulePhoto2734);
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

            otherlv_9=(Token)match(input,16,FollowSets000.FOLLOW_16_in_rulePhoto2748); 

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
    // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:1334:1: entryRuleEFloat returns [String current=null] : iv_ruleEFloat= ruleEFloat EOF ;
    public final String entryRuleEFloat() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEFloat = null;


        try {
            // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:1335:2: (iv_ruleEFloat= ruleEFloat EOF )
            // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:1336:2: iv_ruleEFloat= ruleEFloat EOF
            {
             newCompositeNode(grammarAccess.getEFloatRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEFloat_in_entryRuleEFloat2787);
            iv_ruleEFloat=ruleEFloat();

            state._fsp--;

             current =iv_ruleEFloat.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEFloat2798); 

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
    // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:1343:1: ruleEFloat returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleEFloat() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;
        Token this_INT_7=null;

         enterRule(); 
            
        try {
            // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:1346:28: ( ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) )
            // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:1347:1: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            {
            // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:1347:1: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:1347:2: (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            {
            // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:1347:2: (kw= '-' )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==46) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:1348:2: kw= '-'
                    {
                    kw=(Token)match(input,46,FollowSets000.FOLLOW_46_in_ruleEFloat2837); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEFloatAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;

            }

            // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:1353:3: (this_INT_1= RULE_INT )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==RULE_INT) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:1353:8: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEFloat2855); 

                    		current.merge(this_INT_1);
                        
                     
                        newLeafNode(this_INT_1, grammarAccess.getEFloatAccess().getINTTerminalRuleCall_1()); 
                        

                    }
                    break;

            }

            kw=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleEFloat2875); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getEFloatAccess().getFullStopKeyword_2()); 
                
            this_INT_3=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEFloat2890); 

            		current.merge(this_INT_3);
                
             
                newLeafNode(this_INT_3, grammarAccess.getEFloatAccess().getINTTerminalRuleCall_3()); 
                
            // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:1373:1: ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( ((LA41_0>=56 && LA41_0<=57)) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:1373:2: (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT
                    {
                    // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:1373:2: (kw= 'E' | kw= 'e' )
                    int alt39=2;
                    int LA39_0 = input.LA(1);

                    if ( (LA39_0==56) ) {
                        alt39=1;
                    }
                    else if ( (LA39_0==57) ) {
                        alt39=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 39, 0, input);

                        throw nvae;
                    }
                    switch (alt39) {
                        case 1 :
                            // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:1374:2: kw= 'E'
                            {
                            kw=(Token)match(input,56,FollowSets000.FOLLOW_56_in_ruleEFloat2910); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getEFloatAccess().getEKeyword_4_0_0()); 
                                

                            }
                            break;
                        case 2 :
                            // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:1381:2: kw= 'e'
                            {
                            kw=(Token)match(input,57,FollowSets000.FOLLOW_57_in_ruleEFloat2929); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getEFloatAccess().getEKeyword_4_0_1()); 
                                

                            }
                            break;

                    }

                    // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:1386:2: (kw= '-' )?
                    int alt40=2;
                    int LA40_0 = input.LA(1);

                    if ( (LA40_0==46) ) {
                        alt40=1;
                    }
                    switch (alt40) {
                        case 1 :
                            // ../org.xtext.siteWeb.mydsl/src-gen/org/xtext/example/siteWeb/parser/antlr/internal/InternalMyDsl.g:1387:2: kw= '-'
                            {
                            kw=(Token)match(input,46,FollowSets000.FOLLOW_46_in_ruleEFloat2944); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getEFloatAccess().getHyphenMinusKeyword_4_1()); 
                                

                            }
                            break;

                    }

                    this_INT_7=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEFloat2961); 

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
        public static final BitSet FOLLOW_13_in_rulePagePrincipale146 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_ruleConfigurationPage_in_rulePagePrincipale167 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_rulePagePrincipale179 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_rulePagePrincipale191 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_ruleContact_in_rulePagePrincipale212 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_15_in_rulePagePrincipale225 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_ruleContact_in_rulePagePrincipale246 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_16_in_rulePagePrincipale260 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_rulePagePrincipale272 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_rulePagePrincipale284 = new BitSet(new long[]{0x0000020000000000L});
        public static final BitSet FOLLOW_rulePageInterne_in_rulePagePrincipale305 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_15_in_rulePagePrincipale318 = new BitSet(new long[]{0x0000020000000000L});
        public static final BitSet FOLLOW_rulePageInterne_in_rulePagePrincipale339 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_16_in_rulePagePrincipale353 = new BitSet(new long[]{0x00000000000D0000L});
        public static final BitSet FOLLOW_18_in_rulePagePrincipale366 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_ruleRubriques_in_rulePagePrincipale387 = new BitSet(new long[]{0x0000000000090000L});
        public static final BitSet FOLLOW_19_in_rulePagePrincipale402 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_rulePagePrincipale414 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_ruleFichiers_in_rulePagePrincipale435 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_15_in_rulePagePrincipale448 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_ruleFichiers_in_rulePagePrincipale469 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_16_in_rulePagePrincipale483 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_rulePagePrincipale497 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleContact_in_entryRuleContact533 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleContact543 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_ruleContact589 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleContact601 = new BitSet(new long[]{0x0000000001E00000L});
        public static final BitSet FOLLOW_21_in_ruleContact614 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleContact635 = new BitSet(new long[]{0x0000000001C00000L});
        public static final BitSet FOLLOW_22_in_ruleContact650 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleContact671 = new BitSet(new long[]{0x0000000001800000L});
        public static final BitSet FOLLOW_23_in_ruleContact686 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleContact707 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_24_in_ruleContact722 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleContact743 = new BitSet(new long[]{0x0000000002000030L});
        public static final BitSet FOLLOW_25_in_ruleContact756 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleContact773 = new BitSet(new long[]{0x0000000004000030L});
        public static final BitSet FOLLOW_26_in_ruleContact786 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleContact802 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleContact817 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleContact832 = new BitSet(new long[]{0x0000000008010000L});
        public static final BitSet FOLLOW_27_in_ruleContact845 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleContact866 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleContact880 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRubriques_in_entryRuleRubriques916 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRubriques926 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_ruleRubriques972 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleRubriques984 = new BitSet(new long[]{0x0000000060010000L});
        public static final BitSet FOLLOW_29_in_ruleRubriques997 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleRubriques1018 = new BitSet(new long[]{0x0000000040010000L});
        public static final BitSet FOLLOW_30_in_ruleRubriques1033 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleRubriques1054 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleRubriques1068 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFichiers_in_entryRuleFichiers1104 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFichiers1114 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_ruleFichiers1160 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleFichiers1172 = new BitSet(new long[]{0x0000000700210000L});
        public static final BitSet FOLLOW_32_in_ruleFichiers1185 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleFichiers1206 = new BitSet(new long[]{0x0000000600210000L});
        public static final BitSet FOLLOW_33_in_ruleFichiers1221 = new BitSet(new long[]{0x0000400000000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleFichiers1242 = new BitSet(new long[]{0x0000000400210000L});
        public static final BitSet FOLLOW_21_in_ruleFichiers1257 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleFichiers1278 = new BitSet(new long[]{0x0000000400010000L});
        public static final BitSet FOLLOW_34_in_ruleFichiers1293 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleFichiers1314 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleFichiers1328 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConfigurationPage_in_entryRuleConfigurationPage1364 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleConfigurationPage1374 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_ruleConfigurationPage1420 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleConfigurationPage1432 = new BitSet(new long[]{0x000001F000010000L});
        public static final BitSet FOLLOW_36_in_ruleConfigurationPage1445 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleConfigurationPage1466 = new BitSet(new long[]{0x000001E000010000L});
        public static final BitSet FOLLOW_37_in_ruleConfigurationPage1481 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleConfigurationPage1502 = new BitSet(new long[]{0x000001C000010000L});
        public static final BitSet FOLLOW_38_in_ruleConfigurationPage1517 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleConfigurationPage1538 = new BitSet(new long[]{0x0000018000010000L});
        public static final BitSet FOLLOW_39_in_ruleConfigurationPage1553 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleConfigurationPage1574 = new BitSet(new long[]{0x0000010000010000L});
        public static final BitSet FOLLOW_40_in_ruleConfigurationPage1589 = new BitSet(new long[]{0x0000400000000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleConfigurationPage1610 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleConfigurationPage1624 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePageInterne_in_entryRulePageInterne1660 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePageInterne1670 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_rulePageInterne1707 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_rulePageInterne1719 = new BitSet(new long[]{0x00003C0020000000L});
        public static final BitSet FOLLOW_42_in_rulePageInterne1732 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_rulePageInterne1753 = new BitSet(new long[]{0x0000380020000000L});
        public static final BitSet FOLLOW_29_in_rulePageInterne1768 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_rulePageInterne1789 = new BitSet(new long[]{0x0000380000000000L});
        public static final BitSet FOLLOW_43_in_rulePageInterne1804 = new BitSet(new long[]{0x0003800000000000L});
        public static final BitSet FOLLOW_ruleTypes_in_rulePageInterne1825 = new BitSet(new long[]{0x0000300000000000L});
        public static final BitSet FOLLOW_44_in_rulePageInterne1840 = new BitSet(new long[]{0x0004000000000000L});
        public static final BitSet FOLLOW_ruleLiens_in_rulePageInterne1861 = new BitSet(new long[]{0x0000200000000000L});
        public static final BitSet FOLLOW_45_in_rulePageInterne1875 = new BitSet(new long[]{0x0040000000000000L});
        public static final BitSet FOLLOW_rulePhoto_in_rulePageInterne1896 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_rulePageInterne1908 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString1945 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString1956 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleEString1996 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEString2022 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_entryRuleEInt2068 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEInt2079 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_46_in_ruleEInt2118 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEInt2135 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypes_in_entryRuleTypes2180 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTypes2190 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_47_in_ruleTypes2242 = new BitSet(new long[]{0x0003000000000000L});
        public static final BitSet FOLLOW_48_in_ruleTypes2274 = new BitSet(new long[]{0x0002000000000000L});
        public static final BitSet FOLLOW_49_in_ruleTypes2300 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLiens_in_entryRuleLiens2336 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLiens2346 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_50_in_ruleLiens2392 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleLiens2404 = new BitSet(new long[]{0x0038000000010000L});
        public static final BitSet FOLLOW_51_in_ruleLiens2417 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleLiens2438 = new BitSet(new long[]{0x0030000000010000L});
        public static final BitSet FOLLOW_52_in_ruleLiens2453 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleLiens2474 = new BitSet(new long[]{0x0020000000010000L});
        public static final BitSet FOLLOW_53_in_ruleLiens2489 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleLiens2510 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleLiens2524 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePhoto_in_entryRulePhoto2560 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePhoto2570 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_54_in_rulePhoto2616 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_rulePhoto2628 = new BitSet(new long[]{0x0080000200210000L});
        public static final BitSet FOLLOW_33_in_rulePhoto2641 = new BitSet(new long[]{0x0000400004000040L});
        public static final BitSet FOLLOW_ruleEFloat_in_rulePhoto2662 = new BitSet(new long[]{0x0080000000210000L});
        public static final BitSet FOLLOW_55_in_rulePhoto2677 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_rulePhoto2698 = new BitSet(new long[]{0x0000000000210000L});
        public static final BitSet FOLLOW_21_in_rulePhoto2713 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_rulePhoto2734 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_rulePhoto2748 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEFloat_in_entryRuleEFloat2787 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEFloat2798 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_46_in_ruleEFloat2837 = new BitSet(new long[]{0x0000000004000040L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEFloat2855 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_26_in_ruleEFloat2875 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEFloat2890 = new BitSet(new long[]{0x0300000000000002L});
        public static final BitSet FOLLOW_56_in_ruleEFloat2910 = new BitSet(new long[]{0x0000400000000040L});
        public static final BitSet FOLLOW_57_in_ruleEFloat2929 = new BitSet(new long[]{0x0000400000000040L});
        public static final BitSet FOLLOW_46_in_ruleEFloat2944 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEFloat2961 = new BitSet(new long[]{0x0000000000000002L});
    }


}