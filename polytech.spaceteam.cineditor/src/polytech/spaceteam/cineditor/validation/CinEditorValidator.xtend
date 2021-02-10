/*
 * generated by Xtext 2.14.0
 */
package polytech.spaceteam.cineditor.validation

import org.eclipse.xtext.validation.Check
import CinEditorML.CinEditorMLPackage
import java.util.regex.Pattern
import CinEditorML.HexadecimalColor
import CinEditorML.Dimension
import CinEditorML.Movie
import java.util.HashSet

/**
 * This class contains custom validation rules. 
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
class CinEditorValidator extends AbstractCinEditorValidator {
	
	public static val INVALID_POSITION = 'invalidPosition'
	public static val INVALID_COLOR = 'invalidColor'
	public static val INVALID_DURATION = 'invalidDuration'

	@Check
	def checkElementNames(Movie movie) {
		val names = new HashSet<String>();
		for (var i = 0; i < movie.layers.size; i++) {
			val layer = movie.layers.get(i);
			for (var j = 0; j < layer.elements.size; j++) {
				val element = layer.elements.get(j);
				if (!names.contains(element.name)) {
					names.add(element.name);
				} else {
					error('Element name "' + element.name + '" must be unique', 
					CinEditorMLPackage.Literals.MOVIE__LAYERS,
					i,
					INVALID_POSITION)
				}
			}
		}
	}

	@Check
	def checkDimension(Dimension element) {
		if (element.width < 0) {
			error('Movie width must be > 0', 
					CinEditorMLPackage.Literals.MOVIE__DIMENSION,
					INVALID_POSITION)
		}
		if (element.height < 0) {
			error('Movie height must be > 0', 
					CinEditorMLPackage.Literals.MOVIE__DIMENSION,
					INVALID_POSITION)
		}
	}
	
	@Check
	def checkShapeColor(HexadecimalColor color) {
		val p = Pattern.compile("^([a-fA-F0-9]{6}|[a-fA-F0-9]{3})$");      
		val m = p.matcher(color.hexadecimalValue) ;    
 		var b = m.matches();
 		if (!b) {
 			error('Shape color must be in hexadecimal', 
					CinEditorMLPackage.Literals.HEXADECIMAL_COLOR__HEXADECIMAL_VALUE,
					INVALID_COLOR)
 		}
	}
	
}
