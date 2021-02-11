/*
 * generated by Xtext 2.14.0
 */
package polytech.spaceteam.cineditor.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import java.util.ArrayList
import javax.inject.Inject
import org.eclipse.xtext.naming.IQualifiedNameProvider
import CinEditorML.Movie
import java.util.List
import CinEditorML.Layer
import CinEditorML.Element
import CinEditorML.Text
import CinEditorML.GraphicalElement
import CinEditorML.Picture
import CinEditorML.Video
import CinEditorML.FadeOut
import CinEditorML.FadeIn
import CinEditorML.Translate
import CinEditorML.Effect

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class CinEditorGenerator extends AbstractGenerator {

	val varMovieHeight = "movie_height";
	val varMovieWidth = "movie_width";
	val elementsVarNames = new ArrayList();
	
	@Inject extension IQualifiedNameProvider
	
	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		for (movie : resource.allContents.toIterable.filter(Movie)) {
			val _fullyQualifiedName = this._iQualifiedNameProvider.getFullyQualifiedName(movie);
			fsa.generateFile(
            	_fullyQualifiedName + ".py",
            	compile(movie))
		}
	
	}
	
	private def String compile(Movie movie) {
		var movieString = loadImports();
		movieString += extractMovieSize(movie);
		movieString += extractLayers(movie.getLayers());
		movieString += extractFinalCut(movie);
		return movieString;
	}
	
	private def String extractFinalCut(Movie movie) {
		var sFinal = "\nvideo = CompositeVideoClip([";
		for (var i = 0; i < elementsVarNames.size(); i++) {
			if (i != 0) {
				sFinal += ", ";
			}
			sFinal += elementsVarNames.get(i);
		}
		sFinal += "], size=(" + varMovieWidth + "," + varMovieHeight + ")).set_duration(15)\n"; //TODO when no video set a calculated duration
		sFinal += "video.write_videofile('./" + movie.getName()  + ".avi', codec='mpeg4', fps=" + movie.getFps() +")";
		return sFinal;
	}
	
	private def String extractLayers(List<Layer> layers) {
		var s = "";
		for (Layer layer : layers) {
			s += extractElementsFromLayer(layer.getElements());
		}
		return s;
	}
	
	private def String extractElementInLayer(Element element) {
		var s = "";
		if (element instanceof Text) {
			s += extractElement(element as Text);
		 } else if (element instanceof Picture) {
			s += extractElement(element as Picture);
		} else if (element instanceof Video) {
			s += extractElement(element as Video);
		} else if (element instanceof Effect) {
			s += extractElement(element as Effect);
		}
		return s;
	}
	
	private def String extractBeginTimeFromElement(Element element) {
		var s = "";
		if (element.getBeginTime() > 0) {
			s += "\\\n\t.set_start(" + element.getBeginTime() + ")";
		}
		return s;
	}
	
	private def String extractDurationFromElement(Element element) {
		var s = "";
		if (element.getDuration() > 0) {
			s += "\\\n\t.set_duration(" + element.getDuration() + ")";
		}
		return s;
	}
	
	private def String extractPositionFromElement(GraphicalElement element) {
		var s = "";
		var marginRight = 0;
		var marginBottom = 0;
		var posX = "";
		var posY = "";
		if (element.position !== null) {
			posX = element.getPosition().getX() + "";
			posY = element.getPosition().getY() + "";
		} else {
			posX = "0";
			posY = "0";
		}

//		if (posX < 0) {
//			marginRight = -element.getPosition().getX();
//			posX = "'right'";
//		}
//		if (posY < 0) {
//			marginBottom = -element.getPosition().getY();
//			posY = "'bottom'";
//		}
//		if (!posX.equals("0") && !posY.equals("0")) {
//			s += "\\\n\t.set_pos((" + posX + ", " + posY + "))";
//		}
//		if (marginRight != 0 || marginBottom != 0) {
//			s += "\\\n\t.margin(bottom=" + marginBottom + ", right=" + marginRight + ")";
//		}
		return s;
	}
	
	
	private def String extractElement(Text element) {		
		var s = element.getName() 
				+ " = TextClip("
					+ "\"" +element.getText() + "\""
					+ ", color='#" + element.getColor().getHexadecimalValue() + "'"
					+ ", fontsize=" + element.getFontSize()
				+ ")"
				+ extractBeginTimeFromElement(element)
				+ extractDurationFromElement(element)
				+ extractPositionFromElement(element)
				+ "\n";
		elementsVarNames.add(element.getName());
		return s;
	}
	
	private def String extractElement(Picture element) {
		var s = element.getName() 
				+ " = ImageClip("
					+ "\"" +element.url + "\""
				+ ")"
				+ extractBeginTimeFromElement(element)
				+ extractDurationFromElement(element)
				+ extractPositionFromElement(element)
				+ "\n";
		elementsVarNames.add(element.getName());
		return s;
	}
	
	private def String extractElement(Video element) {
		var s = "";
		
		return s;
	}
	
	private def String extractElement(FadeIn element) {
		var s = "";
		
		return s;
	}
	
	private def String extractElement(FadeOut element) {
		var s = "";
		
		return s;
	}
	
	private def String extractElement(Translate element) {
		var s = "";
		
		return s;
	}
	
	private def String extractElement(Effect element) {
		var s = "";
		if (element instanceof FadeIn) {
			s += extractElement(element as FadeIn);
		} else if (element instanceof FadeOut) {
			s += extractElement(element as FadeOut);
		} else if (element instanceof Translate) {
			s += extractElement(element as Translate);
		} 
		return s;
	}
	
	private def String extractElementsFromLayer(List<Element> elements) {
		var s = "";
		for (Element element : elements) {
			s += extractElementInLayer(element);
		}
 		return s;
	}

	private def String extractMovieSize(Movie movie) {
		var s = varMovieHeight + " = " + movie.getDimension().getHeight() + "\n";
		s += varMovieWidth + " = " + movie.getDimension().getWidth() + "\n";
		s += "\n";
		return s;
	}
	
	private def String loadImports() {
		var s = "from moviepy.editor import *\n";
		s += "\n";
		return s;
	}
}
