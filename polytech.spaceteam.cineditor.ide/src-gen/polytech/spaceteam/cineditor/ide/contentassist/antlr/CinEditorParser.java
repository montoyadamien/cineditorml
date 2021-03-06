/*
 * generated by Xtext 2.14.0
 */
package polytech.spaceteam.cineditor.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import polytech.spaceteam.cineditor.ide.contentassist.antlr.internal.InternalCinEditorParser;
import polytech.spaceteam.cineditor.services.CinEditorGrammarAccess;

public class CinEditorParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(CinEditorGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, CinEditorGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getElementAccess().getAlternatives(), "rule__Element__Alternatives");
			builder.put(grammarAccess.getEStringAccess().getAlternatives(), "rule__EString__Alternatives");
			builder.put(grammarAccess.getItemPositionAccess().getAlternatives(), "rule__ItemPosition__Alternatives");
			builder.put(grammarAccess.getItemPositionStringAccess().getPositionAlternatives_0(), "rule__ItemPositionString__PositionAlternatives_0");
			builder.put(grammarAccess.getTemporalPositionAccess().getAlternatives(), "rule__TemporalPosition__Alternatives");
			builder.put(grammarAccess.getTemporalPositionAccess().getAlternatives_1(), "rule__TemporalPosition__Alternatives_1");
			builder.put(grammarAccess.getGraphicalElementAccess().getAlternatives(), "rule__GraphicalElement__Alternatives");
			builder.put(grammarAccess.getEFloatAccess().getAlternatives_2_0(), "rule__EFloat__Alternatives_2_0");
			builder.put(grammarAccess.getEBooleanAccess().getAlternatives(), "rule__EBoolean__Alternatives");
			builder.put(grammarAccess.getMARGIN_NAMEAccess().getAlternatives(), "rule__MARGIN_NAME__Alternatives");
			builder.put(grammarAccess.getMovieAccess().getGroup(), "rule__Movie__Group__0");
			builder.put(grammarAccess.getMovieAccess().getGroup_3(), "rule__Movie__Group_3__0");
			builder.put(grammarAccess.getLayerAccess().getGroup(), "rule__Layer__Group__0");
			builder.put(grammarAccess.getPositionAccess().getGroup(), "rule__Position__Group__0");
			builder.put(grammarAccess.getPositionAccess().getGroup_1(), "rule__Position__Group_1__0");
			builder.put(grammarAccess.getDimensionAccess().getGroup(), "rule__Dimension__Group__0");
			builder.put(grammarAccess.getHexadecimalColorAccess().getGroup(), "rule__HexadecimalColor__Group__0");
			builder.put(grammarAccess.getTemporalPositionAccess().getGroup_0(), "rule__TemporalPosition__Group_0__0");
			builder.put(grammarAccess.getTemporalPositionAccess().getGroup_1_0(), "rule__TemporalPosition__Group_1_0__0");
			builder.put(grammarAccess.getTemporalPositionAccess().getGroup_1_1(), "rule__TemporalPosition__Group_1_1__0");
			builder.put(grammarAccess.getMarginAccess().getGroup(), "rule__Margin__Group__0");
			builder.put(grammarAccess.getMarginAccess().getGroup_4(), "rule__Margin__Group_4__0");
			builder.put(grammarAccess.getEIntAccess().getGroup(), "rule__EInt__Group__0");
			builder.put(grammarAccess.getEFloatAccess().getGroup(), "rule__EFloat__Group__0");
			builder.put(grammarAccess.getEFloatAccess().getGroup_2(), "rule__EFloat__Group_2__0");
			builder.put(grammarAccess.getAudioElementAccess().getGroup(), "rule__AudioElement__Group__0");
			builder.put(grammarAccess.getAudioElementAccess().getGroup_4(), "rule__AudioElement__Group_4__0");
			builder.put(grammarAccess.getAudioElementAccess().getGroup_5(), "rule__AudioElement__Group_5__0");
			builder.put(grammarAccess.getAudioElementAccess().getGroup_6(), "rule__AudioElement__Group_6__0");
			builder.put(grammarAccess.getAudioElementAccess().getGroup_8(), "rule__AudioElement__Group_8__0");
			builder.put(grammarAccess.getTextAccess().getGroup(), "rule__Text__Group__0");
			builder.put(grammarAccess.getTextAccess().getGroup_4(), "rule__Text__Group_4__0");
			builder.put(grammarAccess.getTextAccess().getGroup_6(), "rule__Text__Group_6__0");
			builder.put(grammarAccess.getTextAccess().getGroup_8(), "rule__Text__Group_8__0");
			builder.put(grammarAccess.getPictureAccess().getGroup(), "rule__Picture__Group__0");
			builder.put(grammarAccess.getPictureAccess().getGroup_6(), "rule__Picture__Group_6__0");
			builder.put(grammarAccess.getPictureAccess().getGroup_8(), "rule__Picture__Group_8__0");
			builder.put(grammarAccess.getVideoAccess().getGroup(), "rule__Video__Group__0");
			builder.put(grammarAccess.getVideoAccess().getGroup_4(), "rule__Video__Group_4__0");
			builder.put(grammarAccess.getVideoAccess().getGroup_7(), "rule__Video__Group_7__0");
			builder.put(grammarAccess.getVideoAccess().getGroup_9(), "rule__Video__Group_9__0");
			builder.put(grammarAccess.getRectangleAccess().getGroup(), "rule__Rectangle__Group__0");
			builder.put(grammarAccess.getRectangleAccess().getGroup_6(), "rule__Rectangle__Group_6__0");
			builder.put(grammarAccess.getRectangleAccess().getGroup_8(), "rule__Rectangle__Group_8__0");
			builder.put(grammarAccess.getFadeInAccess().getGroup(), "rule__FadeIn__Group__0");
			builder.put(grammarAccess.getFadeInAccess().getGroup_9(), "rule__FadeIn__Group_9__0");
			builder.put(grammarAccess.getFadeOutAccess().getGroup(), "rule__FadeOut__Group__0");
			builder.put(grammarAccess.getFadeOutAccess().getGroup_9(), "rule__FadeOut__Group_9__0");
			builder.put(grammarAccess.getTranslateAccess().getGroup(), "rule__Translate__Group__0");
			builder.put(grammarAccess.getTranslateAccess().getGroup_6(), "rule__Translate__Group_6__0");
			builder.put(grammarAccess.getTranslateAccess().getGroup_10(), "rule__Translate__Group_10__0");
			builder.put(grammarAccess.getMovieAccess().getNameAssignment_1(), "rule__Movie__NameAssignment_1");
			builder.put(grammarAccess.getMovieAccess().getDimensionAssignment_2(), "rule__Movie__DimensionAssignment_2");
			builder.put(grammarAccess.getMovieAccess().getFpsAssignment_3_1(), "rule__Movie__FpsAssignment_3_1");
			builder.put(grammarAccess.getMovieAccess().getLayersAssignment_4(), "rule__Movie__LayersAssignment_4");
			builder.put(grammarAccess.getLayerAccess().getElementsAssignment_2(), "rule__Layer__ElementsAssignment_2");
			builder.put(grammarAccess.getPositionAccess().getXAssignment_1_1(), "rule__Position__XAssignment_1_1");
			builder.put(grammarAccess.getPositionAccess().getYAssignment_1_3(), "rule__Position__YAssignment_1_3");
			builder.put(grammarAccess.getItemPositionIntAccess().getPositionAssignment(), "rule__ItemPositionInt__PositionAssignment");
			builder.put(grammarAccess.getItemPositionStringAccess().getPositionAssignment(), "rule__ItemPositionString__PositionAssignment");
			builder.put(grammarAccess.getDimensionAccess().getWidthAssignment_1(), "rule__Dimension__WidthAssignment_1");
			builder.put(grammarAccess.getDimensionAccess().getHeightAssignment_3(), "rule__Dimension__HeightAssignment_3");
			builder.put(grammarAccess.getHexadecimalColorAccess().getHexadecimalValueAssignment_1(), "rule__HexadecimalColor__HexadecimalValueAssignment_1");
			builder.put(grammarAccess.getTemporalPositionAccess().getBeginTimeAssignment_0_1(), "rule__TemporalPosition__BeginTimeAssignment_0_1");
			builder.put(grammarAccess.getTemporalPositionAccess().getElementToStartAfterAssignment_0_3(), "rule__TemporalPosition__ElementToStartAfterAssignment_0_3");
			builder.put(grammarAccess.getTemporalPositionAccess().getBeginTimeAssignment_1_0_1(), "rule__TemporalPosition__BeginTimeAssignment_1_0_1");
			builder.put(grammarAccess.getTemporalPositionAccess().getElementToStartAfterAssignment_1_1_1(), "rule__TemporalPosition__ElementToStartAfterAssignment_1_1_1");
			builder.put(grammarAccess.getMarginAccess().getTypeAssignment_0(), "rule__Margin__TypeAssignment_0");
			builder.put(grammarAccess.getMarginAccess().getSizeAssignment_2(), "rule__Margin__SizeAssignment_2");
			builder.put(grammarAccess.getMarginAccess().getMarginColorAssignment_3(), "rule__Margin__MarginColorAssignment_3");
			builder.put(grammarAccess.getMarginAccess().getMarginColorOpacityAssignment_4_1(), "rule__Margin__MarginColorOpacityAssignment_4_1");
			builder.put(grammarAccess.getAudioElementAccess().getNameAssignment_1(), "rule__AudioElement__NameAssignment_1");
			builder.put(grammarAccess.getAudioElementAccess().getUrlAssignment_3(), "rule__AudioElement__UrlAssignment_3");
			builder.put(grammarAccess.getAudioElementAccess().getVolumeAssignment_4_1(), "rule__AudioElement__VolumeAssignment_4_1");
			builder.put(grammarAccess.getAudioElementAccess().getFadeInAssignment_5_1(), "rule__AudioElement__FadeInAssignment_5_1");
			builder.put(grammarAccess.getAudioElementAccess().getFadeOutAssignment_6_1(), "rule__AudioElement__FadeOutAssignment_6_1");
			builder.put(grammarAccess.getAudioElementAccess().getTemporalPositionAssignment_7(), "rule__AudioElement__TemporalPositionAssignment_7");
			builder.put(grammarAccess.getAudioElementAccess().getBeginCropTimeAssignment_8_1(), "rule__AudioElement__BeginCropTimeAssignment_8_1");
			builder.put(grammarAccess.getAudioElementAccess().getDurationAssignment_10(), "rule__AudioElement__DurationAssignment_10");
			builder.put(grammarAccess.getTextAccess().getNameAssignment_1(), "rule__Text__NameAssignment_1");
			builder.put(grammarAccess.getTextAccess().getTextAssignment_3(), "rule__Text__TextAssignment_3");
			builder.put(grammarAccess.getTextAccess().getFontSizeAssignment_4_1(), "rule__Text__FontSizeAssignment_4_1");
			builder.put(grammarAccess.getTextAccess().getPositionAssignment_5(), "rule__Text__PositionAssignment_5");
			builder.put(grammarAccess.getTextAccess().getMarginsAssignment_6_1(), "rule__Text__MarginsAssignment_6_1");
			builder.put(grammarAccess.getTextAccess().getTemporalPositionAssignment_7(), "rule__Text__TemporalPositionAssignment_7");
			builder.put(grammarAccess.getTextAccess().getDurationAssignment_8_1(), "rule__Text__DurationAssignment_8_1");
			builder.put(grammarAccess.getTextAccess().getColorAssignment_9(), "rule__Text__ColorAssignment_9");
			builder.put(grammarAccess.getPictureAccess().getNameAssignment_1(), "rule__Picture__NameAssignment_1");
			builder.put(grammarAccess.getPictureAccess().getUrlAssignment_3(), "rule__Picture__UrlAssignment_3");
			builder.put(grammarAccess.getPictureAccess().getPositionAssignment_4(), "rule__Picture__PositionAssignment_4");
			builder.put(grammarAccess.getPictureAccess().getDimensionAssignment_5(), "rule__Picture__DimensionAssignment_5");
			builder.put(grammarAccess.getPictureAccess().getMarginsAssignment_6_1(), "rule__Picture__MarginsAssignment_6_1");
			builder.put(grammarAccess.getPictureAccess().getTemporalPositionAssignment_7(), "rule__Picture__TemporalPositionAssignment_7");
			builder.put(grammarAccess.getPictureAccess().getDurationAssignment_8_1(), "rule__Picture__DurationAssignment_8_1");
			builder.put(grammarAccess.getVideoAccess().getNameAssignment_1(), "rule__Video__NameAssignment_1");
			builder.put(grammarAccess.getVideoAccess().getUrlAssignment_3(), "rule__Video__UrlAssignment_3");
			builder.put(grammarAccess.getVideoAccess().getEnableAudioAssignment_4_1(), "rule__Video__EnableAudioAssignment_4_1");
			builder.put(grammarAccess.getVideoAccess().getPositionAssignment_5(), "rule__Video__PositionAssignment_5");
			builder.put(grammarAccess.getVideoAccess().getDimensionAssignment_6(), "rule__Video__DimensionAssignment_6");
			builder.put(grammarAccess.getVideoAccess().getMarginsAssignment_7_1(), "rule__Video__MarginsAssignment_7_1");
			builder.put(grammarAccess.getVideoAccess().getTemporalPositionAssignment_8(), "rule__Video__TemporalPositionAssignment_8");
			builder.put(grammarAccess.getVideoAccess().getBeginCropTimeAssignment_9_1(), "rule__Video__BeginCropTimeAssignment_9_1");
			builder.put(grammarAccess.getVideoAccess().getDurationAssignment_11(), "rule__Video__DurationAssignment_11");
			builder.put(grammarAccess.getRectangleAccess().getNameAssignment_1(), "rule__Rectangle__NameAssignment_1");
			builder.put(grammarAccess.getRectangleAccess().getColorAssignment_3(), "rule__Rectangle__ColorAssignment_3");
			builder.put(grammarAccess.getRectangleAccess().getPositionAssignment_4(), "rule__Rectangle__PositionAssignment_4");
			builder.put(grammarAccess.getRectangleAccess().getDimensionAssignment_5(), "rule__Rectangle__DimensionAssignment_5");
			builder.put(grammarAccess.getRectangleAccess().getMarginsAssignment_6_1(), "rule__Rectangle__MarginsAssignment_6_1");
			builder.put(grammarAccess.getRectangleAccess().getTemporalPositionAssignment_7(), "rule__Rectangle__TemporalPositionAssignment_7");
			builder.put(grammarAccess.getRectangleAccess().getDurationAssignment_8_1(), "rule__Rectangle__DurationAssignment_8_1");
			builder.put(grammarAccess.getFadeInAccess().getNameAssignment_1(), "rule__FadeIn__NameAssignment_1");
			builder.put(grammarAccess.getFadeInAccess().getDurationAssignment_5(), "rule__FadeIn__DurationAssignment_5");
			builder.put(grammarAccess.getFadeInAccess().getElementsAssignment_8(), "rule__FadeIn__ElementsAssignment_8");
			builder.put(grammarAccess.getFadeInAccess().getElementsAssignment_9_1(), "rule__FadeIn__ElementsAssignment_9_1");
			builder.put(grammarAccess.getFadeOutAccess().getNameAssignment_1(), "rule__FadeOut__NameAssignment_1");
			builder.put(grammarAccess.getFadeOutAccess().getDurationAssignment_5(), "rule__FadeOut__DurationAssignment_5");
			builder.put(grammarAccess.getFadeOutAccess().getElementsAssignment_8(), "rule__FadeOut__ElementsAssignment_8");
			builder.put(grammarAccess.getFadeOutAccess().getElementsAssignment_9_1(), "rule__FadeOut__ElementsAssignment_9_1");
			builder.put(grammarAccess.getTranslateAccess().getNameAssignment_1(), "rule__Translate__NameAssignment_1");
			builder.put(grammarAccess.getTranslateAccess().getPositionToTranslateAssignment_4(), "rule__Translate__PositionToTranslateAssignment_4");
			builder.put(grammarAccess.getTranslateAccess().getTemporalPositionAssignment_5(), "rule__Translate__TemporalPositionAssignment_5");
			builder.put(grammarAccess.getTranslateAccess().getDurationAssignment_6_1(), "rule__Translate__DurationAssignment_6_1");
			builder.put(grammarAccess.getTranslateAccess().getElementsAssignment_9(), "rule__Translate__ElementsAssignment_9");
			builder.put(grammarAccess.getTranslateAccess().getElementsAssignment_10_1(), "rule__Translate__ElementsAssignment_10_1");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private CinEditorGrammarAccess grammarAccess;

	@Override
	protected InternalCinEditorParser createParser() {
		InternalCinEditorParser result = new InternalCinEditorParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public CinEditorGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(CinEditorGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
