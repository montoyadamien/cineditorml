/*
 * generated by Xtext 2.14.0
 */
package polytech.spaceteam.cineditor.serializer;

import CinEditorML.AudioElement;
import CinEditorML.CinEditorMLPackage;
import CinEditorML.Dimension;
import CinEditorML.FadeIn;
import CinEditorML.FadeOut;
import CinEditorML.HexadecimalColor;
import CinEditorML.ItemPositionInt;
import CinEditorML.ItemPositionString;
import CinEditorML.Layer;
import CinEditorML.Movie;
import CinEditorML.Picture;
import CinEditorML.Position;
import CinEditorML.Rectangle;
import CinEditorML.Text;
import CinEditorML.Translate;
import CinEditorML.Video;
import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import polytech.spaceteam.cineditor.services.CinEditorGrammarAccess;

@SuppressWarnings("all")
public class CinEditorSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private CinEditorGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == CinEditorMLPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case CinEditorMLPackage.AUDIO_ELEMENT:
				sequence_AudioElement(context, (AudioElement) semanticObject); 
				return; 
			case CinEditorMLPackage.DIMENSION:
				sequence_Dimension(context, (Dimension) semanticObject); 
				return; 
			case CinEditorMLPackage.FADE_IN:
				sequence_FadeIn(context, (FadeIn) semanticObject); 
				return; 
			case CinEditorMLPackage.FADE_OUT:
				sequence_FadeOut(context, (FadeOut) semanticObject); 
				return; 
			case CinEditorMLPackage.HEXADECIMAL_COLOR:
				sequence_HexadecimalColor(context, (HexadecimalColor) semanticObject); 
				return; 
			case CinEditorMLPackage.ITEM_POSITION_INT:
				sequence_ItemPositionInt(context, (ItemPositionInt) semanticObject); 
				return; 
			case CinEditorMLPackage.ITEM_POSITION_STRING:
				sequence_ItemPositionString(context, (ItemPositionString) semanticObject); 
				return; 
			case CinEditorMLPackage.LAYER:
				sequence_Layer(context, (Layer) semanticObject); 
				return; 
			case CinEditorMLPackage.MOVIE:
				sequence_Movie(context, (Movie) semanticObject); 
				return; 
			case CinEditorMLPackage.PICTURE:
				sequence_Picture(context, (Picture) semanticObject); 
				return; 
			case CinEditorMLPackage.POSITION:
				sequence_Position(context, (Position) semanticObject); 
				return; 
			case CinEditorMLPackage.RECTANGLE:
				sequence_Rectangle(context, (Rectangle) semanticObject); 
				return; 
			case CinEditorMLPackage.TEXT:
				sequence_Text(context, (Text) semanticObject); 
				return; 
			case CinEditorMLPackage.TRANSLATE:
				sequence_Translate(context, (Translate) semanticObject); 
				return; 
			case CinEditorMLPackage.VIDEO:
				sequence_Video(context, (Video) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Element returns AudioElement
	 *     AudioElement returns AudioElement
	 *
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         url=EString 
	 *         volume=EFloat? 
	 *         fadeIn=EInt? 
	 *         fadeOut=EInt? 
	 *         beginTime=EInt? 
	 *         beginCropTime=EInt? 
	 *         duration=EInt? 
	 *         element=[GraphicalElement|ID]
	 *     )
	 */
	protected void sequence_AudioElement(ISerializationContext context, AudioElement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Dimension returns Dimension
	 *
	 * Constraint:
	 *     (width=EInt height=EInt)
	 */
	protected void sequence_Dimension(ISerializationContext context, Dimension semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, CinEditorMLPackage.Literals.DIMENSION__WIDTH) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CinEditorMLPackage.Literals.DIMENSION__WIDTH));
			if (transientValues.isValueTransient(semanticObject, CinEditorMLPackage.Literals.DIMENSION__HEIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CinEditorMLPackage.Literals.DIMENSION__HEIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getDimensionAccess().getWidthEIntParserRuleCall_1_0(), semanticObject.getWidth());
		feeder.accept(grammarAccess.getDimensionAccess().getHeightEIntParserRuleCall_3_0(), semanticObject.getHeight());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Element returns FadeIn
	 *     FadeIn returns FadeIn
	 *
	 * Constraint:
	 *     (name=EString duration=EInt element=[GraphicalElement|ID])
	 */
	protected void sequence_FadeIn(ISerializationContext context, FadeIn semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, CinEditorMLPackage.Literals.ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CinEditorMLPackage.Literals.ELEMENT__NAME));
			if (transientValues.isValueTransient(semanticObject, CinEditorMLPackage.Literals.ELEMENT__DURATION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CinEditorMLPackage.Literals.ELEMENT__DURATION));
			if (transientValues.isValueTransient(semanticObject, CinEditorMLPackage.Literals.EFFECT__ELEMENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CinEditorMLPackage.Literals.EFFECT__ELEMENT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getFadeInAccess().getNameEStringParserRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getFadeInAccess().getDurationEIntParserRuleCall_5_0(), semanticObject.getDuration());
		feeder.accept(grammarAccess.getFadeInAccess().getElementGraphicalElementIDTerminalRuleCall_7_0_1(), semanticObject.eGet(CinEditorMLPackage.Literals.EFFECT__ELEMENT, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Element returns FadeOut
	 *     FadeOut returns FadeOut
	 *
	 * Constraint:
	 *     (name=EString duration=EInt element=[GraphicalElement|ID])
	 */
	protected void sequence_FadeOut(ISerializationContext context, FadeOut semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, CinEditorMLPackage.Literals.ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CinEditorMLPackage.Literals.ELEMENT__NAME));
			if (transientValues.isValueTransient(semanticObject, CinEditorMLPackage.Literals.ELEMENT__DURATION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CinEditorMLPackage.Literals.ELEMENT__DURATION));
			if (transientValues.isValueTransient(semanticObject, CinEditorMLPackage.Literals.EFFECT__ELEMENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CinEditorMLPackage.Literals.EFFECT__ELEMENT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getFadeOutAccess().getNameEStringParserRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getFadeOutAccess().getDurationEIntParserRuleCall_5_0(), semanticObject.getDuration());
		feeder.accept(grammarAccess.getFadeOutAccess().getElementGraphicalElementIDTerminalRuleCall_7_0_1(), semanticObject.eGet(CinEditorMLPackage.Literals.EFFECT__ELEMENT, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     HexadecimalColor returns HexadecimalColor
	 *
	 * Constraint:
	 *     hexadecimalValue=EString
	 */
	protected void sequence_HexadecimalColor(ISerializationContext context, HexadecimalColor semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, CinEditorMLPackage.Literals.HEXADECIMAL_COLOR__HEXADECIMAL_VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CinEditorMLPackage.Literals.HEXADECIMAL_COLOR__HEXADECIMAL_VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getHexadecimalColorAccess().getHexadecimalValueEStringParserRuleCall_1_0(), semanticObject.getHexadecimalValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ItemPosition returns ItemPositionInt
	 *     ItemPositionInt returns ItemPositionInt
	 *
	 * Constraint:
	 *     position=EInt
	 */
	protected void sequence_ItemPositionInt(ISerializationContext context, ItemPositionInt semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, CinEditorMLPackage.Literals.ITEM_POSITION_INT__POSITION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CinEditorMLPackage.Literals.ITEM_POSITION_INT__POSITION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getItemPositionIntAccess().getPositionEIntParserRuleCall_0(), semanticObject.getPosition());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ItemPosition returns ItemPositionString
	 *     ItemPositionString returns ItemPositionString
	 *
	 * Constraint:
	 *     (position='center' | position='left' | position='right' | position='bottom' | position='top')
	 */
	protected void sequence_ItemPositionString(ISerializationContext context, ItemPositionString semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Layer returns Layer
	 *
	 * Constraint:
	 *     elements+=Element+
	 */
	protected void sequence_Layer(ISerializationContext context, Layer semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Movie returns Movie
	 *
	 * Constraint:
	 *     (name=EString dimension=Dimension fps=EInt? layers+=Layer+)
	 */
	protected void sequence_Movie(ISerializationContext context, Movie semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Element returns Picture
	 *     GraphicalElement returns Picture
	 *     Picture returns Picture
	 *
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         url=EString 
	 *         position=Position? 
	 *         dimension=Dimension? 
	 *         beginTime=EInt? 
	 *         duration=EInt?
	 *     )
	 */
	protected void sequence_Picture(ISerializationContext context, Picture semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Position returns Position
	 *
	 * Constraint:
	 *     (x=ItemPosition y=ItemPosition)
	 */
	protected void sequence_Position(ISerializationContext context, Position semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, CinEditorMLPackage.Literals.POSITION__X) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CinEditorMLPackage.Literals.POSITION__X));
			if (transientValues.isValueTransient(semanticObject, CinEditorMLPackage.Literals.POSITION__Y) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CinEditorMLPackage.Literals.POSITION__Y));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getPositionAccess().getXItemPositionParserRuleCall_1_1_0(), semanticObject.getX());
		feeder.accept(grammarAccess.getPositionAccess().getYItemPositionParserRuleCall_1_3_0(), semanticObject.getY());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Element returns Rectangle
	 *     GraphicalElement returns Rectangle
	 *     Rectangle returns Rectangle
	 *
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         color=HexadecimalColor 
	 *         position=Position? 
	 *         dimension=Dimension? 
	 *         beginTime=EInt? 
	 *         duration=EInt?
	 *     )
	 */
	protected void sequence_Rectangle(ISerializationContext context, Rectangle semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Element returns Text
	 *     GraphicalElement returns Text
	 *     Text returns Text
	 *
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         text=EString 
	 *         fontSize=EInt? 
	 *         position=Position? 
	 *         beginTime=EInt? 
	 *         duration=EInt? 
	 *         color=HexadecimalColor
	 *     )
	 */
	protected void sequence_Text(ISerializationContext context, Text semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Element returns Translate
	 *     Translate returns Translate
	 *
	 * Constraint:
	 *     (name=EString positionToTranslate=Position beginTime=EInt? duration=EInt? element=[GraphicalElement|ID])
	 */
	protected void sequence_Translate(ISerializationContext context, Translate semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Element returns Video
	 *     GraphicalElement returns Video
	 *     Video returns Video
	 *
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         url=EString 
	 *         enableAudio=EBoolean? 
	 *         position=Position? 
	 *         dimension=Dimension 
	 *         beginTime=EInt? 
	 *         beginCropTime=EInt? 
	 *         duration=EInt?
	 *     )
	 */
	protected void sequence_Video(ISerializationContext context, Video semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
