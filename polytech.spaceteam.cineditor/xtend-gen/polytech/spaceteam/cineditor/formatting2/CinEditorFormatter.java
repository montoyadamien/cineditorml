/**
 * generated by Xtext 2.14.0
 */
package polytech.spaceteam.cineditor.formatting2;

import CinEditorML.Dimension;
import CinEditorML.Element;
import CinEditorML.Layer;
import CinEditorML.Movie;
import com.google.inject.Inject;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.formatting2.AbstractFormatter2;
import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.xbase.lib.Extension;
import polytech.spaceteam.cineditor.services.CinEditorGrammarAccess;

@SuppressWarnings("all")
public class CinEditorFormatter extends AbstractFormatter2 {
  @Inject
  @Extension
  private CinEditorGrammarAccess _cinEditorGrammarAccess;
  
  protected void _format(final Movie movie, @Extension final IFormattableDocument document) {
    document.<Dimension>format(movie.getDimension());
    EList<Layer> _layers = movie.getLayers();
    for (final Layer layer : _layers) {
      document.<Layer>format(layer);
    }
  }
  
  protected void _format(final Layer layer, @Extension final IFormattableDocument document) {
    EList<Element> _elements = layer.getElements();
    for (final Element element : _elements) {
      document.<Element>format(element);
    }
  }
  
  public void format(final Object layer, final IFormattableDocument document) {
    if (layer instanceof XtextResource) {
      _format((XtextResource)layer, document);
      return;
    } else if (layer instanceof Layer) {
      _format((Layer)layer, document);
      return;
    } else if (layer instanceof Movie) {
      _format((Movie)layer, document);
      return;
    } else if (layer instanceof EObject) {
      _format((EObject)layer, document);
      return;
    } else if (layer == null) {
      _format((Void)null, document);
      return;
    } else if (layer != null) {
      _format(layer, document);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(layer, document).toString());
    }
  }
}
