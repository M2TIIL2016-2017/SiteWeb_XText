package org.xtext.example.siteWeb.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.xtext.example.siteWeb.services.MyDslGrammarAccess;
import siteWeb.ConfigurationPage;
import siteWeb.Contact;
import siteWeb.Fichiers;
import siteWeb.Liens;
import siteWeb.PageInterne;
import siteWeb.PagePrincipale;
import siteWeb.Photo;
import siteWeb.Rubriques;
import siteWeb.SiteWebPackage;
import siteWeb.Types;

@SuppressWarnings("all")
public abstract class AbstractMyDslSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private MyDslGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == SiteWebPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case SiteWebPackage.CONFIGURATION_PAGE:
				if(context == grammarAccess.getConfigurationPageRule()) {
					sequence_ConfigurationPage(context, (ConfigurationPage) semanticObject); 
					return; 
				}
				else break;
			case SiteWebPackage.CONTACT:
				if(context == grammarAccess.getContactRule()) {
					sequence_Contact(context, (Contact) semanticObject); 
					return; 
				}
				else break;
			case SiteWebPackage.FICHIERS:
				if(context == grammarAccess.getFichiersRule()) {
					sequence_Fichiers(context, (Fichiers) semanticObject); 
					return; 
				}
				else break;
			case SiteWebPackage.LIENS:
				if(context == grammarAccess.getLiensRule()) {
					sequence_Liens(context, (Liens) semanticObject); 
					return; 
				}
				else break;
			case SiteWebPackage.PAGE_INTERNE:
				if(context == grammarAccess.getPageInterneRule()) {
					sequence_PageInterne(context, (PageInterne) semanticObject); 
					return; 
				}
				else break;
			case SiteWebPackage.PAGE_PRINCIPALE:
				if(context == grammarAccess.getPagePrincipaleRule()) {
					sequence_PagePrincipale(context, (PagePrincipale) semanticObject); 
					return; 
				}
				else break;
			case SiteWebPackage.PHOTO:
				if(context == grammarAccess.getPhotoRule()) {
					sequence_Photo(context, (Photo) semanticObject); 
					return; 
				}
				else break;
			case SiteWebPackage.RUBRIQUES:
				if(context == grammarAccess.getRubriquesRule()) {
					sequence_Rubriques(context, (Rubriques) semanticObject); 
					return; 
				}
				else break;
			case SiteWebPackage.TYPES:
				if(context == grammarAccess.getTypesRule()) {
					sequence_Types(context, (Types) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (couleurFond=EString? titreSite=EString? auteurs=EString? couleurPolice=EString? taillePolice=EInt?)
	 */
	protected void sequence_ConfigurationPage(EObject context, ConfigurationPage semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (nom=EString? prenom=EString? adresse=EString? mail=EString+ telephone=EString?)
	 */
	protected void sequence_Contact(EObject context, Contact semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (type=EString? taille=EInt? nom=EString? emplacement=EString?)
	 */
	protected void sequence_Fichiers(EObject context, Fichiers semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (fichier=EString? adresseWeb=EString? pageInterne=EString?)
	 */
	protected void sequence_Liens(EObject context, Liens semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (titrePage=EString? texte=EString? types=Types? liens=Liens? photo=Photo)
	 */
	protected void sequence_PageInterne(EObject context, PageInterne semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         configurationPage=ConfigurationPage 
	 *         contacts+=Contact 
	 *         contacts+=Contact* 
	 *         pages+=PageInterne 
	 *         pages+=PageInterne* 
	 *         rubriques=Rubriques? 
	 *         (fichiers+=Fichiers fichiers+=Fichiers*)?
	 *     )
	 */
	protected void sequence_PagePrincipale(EObject context, PagePrincipale semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (taille=EFloat? extension=EString? nom=EString?)
	 */
	protected void sequence_Photo(EObject context, Photo semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (texte=EString? lien=EString?)
	 */
	protected void sequence_Rubriques(EObject context, Rubriques semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (gras?='gras'? italique?='italique'?)
	 */
	protected void sequence_Types(EObject context, Types semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
