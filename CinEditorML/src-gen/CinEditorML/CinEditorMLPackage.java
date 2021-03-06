/**
 */
package CinEditorML;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see CinEditorML.CinEditorMLFactory
 * @model kind="package"
 * @generated
 */
public interface CinEditorMLPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "CinEditorML";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/CinEditorML";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "CinEditorML";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CinEditorMLPackage eINSTANCE = CinEditorML.impl.CinEditorMLPackageImpl.init();

	/**
	 * The meta object id for the '{@link CinEditorML.impl.MovieImpl <em>Movie</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CinEditorML.impl.MovieImpl
	 * @see CinEditorML.impl.CinEditorMLPackageImpl#getMovie()
	 * @generated
	 */
	int MOVIE = 0;

	/**
	 * The feature id for the '<em><b>Layers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVIE__LAYERS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVIE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Dimension</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVIE__DIMENSION = 2;

	/**
	 * The feature id for the '<em><b>Fps</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVIE__FPS = 3;

	/**
	 * The number of structural features of the '<em>Movie</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVIE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Movie</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVIE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link CinEditorML.impl.LayerImpl <em>Layer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CinEditorML.impl.LayerImpl
	 * @see CinEditorML.impl.CinEditorMLPackageImpl#getLayer()
	 * @generated
	 */
	int LAYER = 1;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER__ELEMENTS = 0;

	/**
	 * The number of structural features of the '<em>Layer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Layer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link CinEditorML.impl.ElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CinEditorML.impl.ElementImpl
	 * @see CinEditorML.impl.CinEditorMLPackageImpl#getElement()
	 * @generated
	 */
	int ELEMENT = 5;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__DURATION = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__NAME = 1;

	/**
	 * The feature id for the '<em><b>Temporal Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__TEMPORAL_POSITION = 2;

	/**
	 * The feature id for the '<em><b>Ending Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__ENDING_TIME = 3;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link CinEditorML.impl.GraphicalElementImpl <em>Graphical Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CinEditorML.impl.GraphicalElementImpl
	 * @see CinEditorML.impl.CinEditorMLPackageImpl#getGraphicalElement()
	 * @generated
	 */
	int GRAPHICAL_ELEMENT = 15;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHICAL_ELEMENT__DURATION = ELEMENT__DURATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHICAL_ELEMENT__NAME = ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Temporal Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHICAL_ELEMENT__TEMPORAL_POSITION = ELEMENT__TEMPORAL_POSITION;

	/**
	 * The feature id for the '<em><b>Ending Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHICAL_ELEMENT__ENDING_TIME = ELEMENT__ENDING_TIME;

	/**
	 * The feature id for the '<em><b>Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHICAL_ELEMENT__POSITION = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Dimension</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHICAL_ELEMENT__DIMENSION = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Margins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHICAL_ELEMENT__MARGINS = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Graphical Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHICAL_ELEMENT_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Graphical Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHICAL_ELEMENT_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CinEditorML.impl.TextImpl <em>Text</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CinEditorML.impl.TextImpl
	 * @see CinEditorML.impl.CinEditorMLPackageImpl#getText()
	 * @generated
	 */
	int TEXT = 2;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__DURATION = GRAPHICAL_ELEMENT__DURATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__NAME = GRAPHICAL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Temporal Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__TEMPORAL_POSITION = GRAPHICAL_ELEMENT__TEMPORAL_POSITION;

	/**
	 * The feature id for the '<em><b>Ending Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__ENDING_TIME = GRAPHICAL_ELEMENT__ENDING_TIME;

	/**
	 * The feature id for the '<em><b>Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__POSITION = GRAPHICAL_ELEMENT__POSITION;

	/**
	 * The feature id for the '<em><b>Dimension</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__DIMENSION = GRAPHICAL_ELEMENT__DIMENSION;

	/**
	 * The feature id for the '<em><b>Margins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__MARGINS = GRAPHICAL_ELEMENT__MARGINS;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__TEXT = GRAPHICAL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Font Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__FONT_SIZE = GRAPHICAL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Color</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__COLOR = GRAPHICAL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FEATURE_COUNT = GRAPHICAL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_OPERATION_COUNT = GRAPHICAL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CinEditorML.impl.PictureImpl <em>Picture</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CinEditorML.impl.PictureImpl
	 * @see CinEditorML.impl.CinEditorMLPackageImpl#getPicture()
	 * @generated
	 */
	int PICTURE = 3;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICTURE__DURATION = GRAPHICAL_ELEMENT__DURATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICTURE__NAME = GRAPHICAL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Temporal Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICTURE__TEMPORAL_POSITION = GRAPHICAL_ELEMENT__TEMPORAL_POSITION;

	/**
	 * The feature id for the '<em><b>Ending Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICTURE__ENDING_TIME = GRAPHICAL_ELEMENT__ENDING_TIME;

	/**
	 * The feature id for the '<em><b>Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICTURE__POSITION = GRAPHICAL_ELEMENT__POSITION;

	/**
	 * The feature id for the '<em><b>Dimension</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICTURE__DIMENSION = GRAPHICAL_ELEMENT__DIMENSION;

	/**
	 * The feature id for the '<em><b>Margins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICTURE__MARGINS = GRAPHICAL_ELEMENT__MARGINS;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICTURE__URL = GRAPHICAL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Picture</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICTURE_FEATURE_COUNT = GRAPHICAL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Picture</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICTURE_OPERATION_COUNT = GRAPHICAL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CinEditorML.impl.VideoImpl <em>Video</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CinEditorML.impl.VideoImpl
	 * @see CinEditorML.impl.CinEditorMLPackageImpl#getVideo()
	 * @generated
	 */
	int VIDEO = 4;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO__DURATION = GRAPHICAL_ELEMENT__DURATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO__NAME = GRAPHICAL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Temporal Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO__TEMPORAL_POSITION = GRAPHICAL_ELEMENT__TEMPORAL_POSITION;

	/**
	 * The feature id for the '<em><b>Ending Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO__ENDING_TIME = GRAPHICAL_ELEMENT__ENDING_TIME;

	/**
	 * The feature id for the '<em><b>Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO__POSITION = GRAPHICAL_ELEMENT__POSITION;

	/**
	 * The feature id for the '<em><b>Dimension</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO__DIMENSION = GRAPHICAL_ELEMENT__DIMENSION;

	/**
	 * The feature id for the '<em><b>Margins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO__MARGINS = GRAPHICAL_ELEMENT__MARGINS;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO__URL = GRAPHICAL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Begin Crop Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO__BEGIN_CROP_TIME = GRAPHICAL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Enable Audio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO__ENABLE_AUDIO = GRAPHICAL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Video</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_FEATURE_COUNT = GRAPHICAL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Video</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_OPERATION_COUNT = GRAPHICAL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CinEditorML.impl.EffectImpl <em>Effect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CinEditorML.impl.EffectImpl
	 * @see CinEditorML.impl.CinEditorMLPackageImpl#getEffect()
	 * @generated
	 */
	int EFFECT = 6;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFFECT__DURATION = ELEMENT__DURATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFFECT__NAME = ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Temporal Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFFECT__TEMPORAL_POSITION = ELEMENT__TEMPORAL_POSITION;

	/**
	 * The feature id for the '<em><b>Ending Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFFECT__ENDING_TIME = ELEMENT__ENDING_TIME;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFFECT__ELEMENTS = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Effect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFFECT_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Effect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFFECT_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CinEditorML.impl.FadeInImpl <em>Fade In</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CinEditorML.impl.FadeInImpl
	 * @see CinEditorML.impl.CinEditorMLPackageImpl#getFadeIn()
	 * @generated
	 */
	int FADE_IN = 7;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FADE_IN__DURATION = EFFECT__DURATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FADE_IN__NAME = EFFECT__NAME;

	/**
	 * The feature id for the '<em><b>Temporal Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FADE_IN__TEMPORAL_POSITION = EFFECT__TEMPORAL_POSITION;

	/**
	 * The feature id for the '<em><b>Ending Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FADE_IN__ENDING_TIME = EFFECT__ENDING_TIME;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FADE_IN__ELEMENTS = EFFECT__ELEMENTS;

	/**
	 * The number of structural features of the '<em>Fade In</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FADE_IN_FEATURE_COUNT = EFFECT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Fade In</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FADE_IN_OPERATION_COUNT = EFFECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CinEditorML.impl.FadeOutImpl <em>Fade Out</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CinEditorML.impl.FadeOutImpl
	 * @see CinEditorML.impl.CinEditorMLPackageImpl#getFadeOut()
	 * @generated
	 */
	int FADE_OUT = 8;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FADE_OUT__DURATION = EFFECT__DURATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FADE_OUT__NAME = EFFECT__NAME;

	/**
	 * The feature id for the '<em><b>Temporal Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FADE_OUT__TEMPORAL_POSITION = EFFECT__TEMPORAL_POSITION;

	/**
	 * The feature id for the '<em><b>Ending Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FADE_OUT__ENDING_TIME = EFFECT__ENDING_TIME;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FADE_OUT__ELEMENTS = EFFECT__ELEMENTS;

	/**
	 * The number of structural features of the '<em>Fade Out</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FADE_OUT_FEATURE_COUNT = EFFECT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Fade Out</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FADE_OUT_OPERATION_COUNT = EFFECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CinEditorML.impl.TranslateImpl <em>Translate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CinEditorML.impl.TranslateImpl
	 * @see CinEditorML.impl.CinEditorMLPackageImpl#getTranslate()
	 * @generated
	 */
	int TRANSLATE = 9;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSLATE__DURATION = EFFECT__DURATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSLATE__NAME = EFFECT__NAME;

	/**
	 * The feature id for the '<em><b>Temporal Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSLATE__TEMPORAL_POSITION = EFFECT__TEMPORAL_POSITION;

	/**
	 * The feature id for the '<em><b>Ending Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSLATE__ENDING_TIME = EFFECT__ENDING_TIME;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSLATE__ELEMENTS = EFFECT__ELEMENTS;

	/**
	 * The feature id for the '<em><b>Position To Translate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSLATE__POSITION_TO_TRANSLATE = EFFECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Translate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSLATE_FEATURE_COUNT = EFFECT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Translate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSLATE_OPERATION_COUNT = EFFECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CinEditorML.impl.ShapeImpl <em>Shape</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CinEditorML.impl.ShapeImpl
	 * @see CinEditorML.impl.CinEditorMLPackageImpl#getShape()
	 * @generated
	 */
	int SHAPE = 10;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__DURATION = GRAPHICAL_ELEMENT__DURATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__NAME = GRAPHICAL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Temporal Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__TEMPORAL_POSITION = GRAPHICAL_ELEMENT__TEMPORAL_POSITION;

	/**
	 * The feature id for the '<em><b>Ending Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__ENDING_TIME = GRAPHICAL_ELEMENT__ENDING_TIME;

	/**
	 * The feature id for the '<em><b>Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__POSITION = GRAPHICAL_ELEMENT__POSITION;

	/**
	 * The feature id for the '<em><b>Dimension</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__DIMENSION = GRAPHICAL_ELEMENT__DIMENSION;

	/**
	 * The feature id for the '<em><b>Margins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__MARGINS = GRAPHICAL_ELEMENT__MARGINS;

	/**
	 * The feature id for the '<em><b>Color</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__COLOR = GRAPHICAL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Shape</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE_FEATURE_COUNT = GRAPHICAL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Shape</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE_OPERATION_COUNT = GRAPHICAL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CinEditorML.impl.PositionImpl <em>Position</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CinEditorML.impl.PositionImpl
	 * @see CinEditorML.impl.CinEditorMLPackageImpl#getPosition()
	 * @generated
	 */
	int POSITION = 11;

	/**
	 * The feature id for the '<em><b>X</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION__X = 0;

	/**
	 * The feature id for the '<em><b>Y</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION__Y = 1;

	/**
	 * The number of structural features of the '<em>Position</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Position</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link CinEditorML.impl.RectangleImpl <em>Rectangle</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CinEditorML.impl.RectangleImpl
	 * @see CinEditorML.impl.CinEditorMLPackageImpl#getRectangle()
	 * @generated
	 */
	int RECTANGLE = 12;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE__DURATION = SHAPE__DURATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE__NAME = SHAPE__NAME;

	/**
	 * The feature id for the '<em><b>Temporal Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE__TEMPORAL_POSITION = SHAPE__TEMPORAL_POSITION;

	/**
	 * The feature id for the '<em><b>Ending Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE__ENDING_TIME = SHAPE__ENDING_TIME;

	/**
	 * The feature id for the '<em><b>Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE__POSITION = SHAPE__POSITION;

	/**
	 * The feature id for the '<em><b>Dimension</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE__DIMENSION = SHAPE__DIMENSION;

	/**
	 * The feature id for the '<em><b>Margins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE__MARGINS = SHAPE__MARGINS;

	/**
	 * The feature id for the '<em><b>Color</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE__COLOR = SHAPE__COLOR;

	/**
	 * The number of structural features of the '<em>Rectangle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE_FEATURE_COUNT = SHAPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Rectangle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE_OPERATION_COUNT = SHAPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CinEditorML.impl.DimensionImpl <em>Dimension</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CinEditorML.impl.DimensionImpl
	 * @see CinEditorML.impl.CinEditorMLPackageImpl#getDimension()
	 * @generated
	 */
	int DIMENSION = 13;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION__WIDTH = 0;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION__HEIGHT = 1;

	/**
	 * The number of structural features of the '<em>Dimension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Dimension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link CinEditorML.impl.HexadecimalColorImpl <em>Hexadecimal Color</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CinEditorML.impl.HexadecimalColorImpl
	 * @see CinEditorML.impl.CinEditorMLPackageImpl#getHexadecimalColor()
	 * @generated
	 */
	int HEXADECIMAL_COLOR = 14;

	/**
	 * The feature id for the '<em><b>Hexadecimal Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEXADECIMAL_COLOR__HEXADECIMAL_VALUE = 0;

	/**
	 * The number of structural features of the '<em>Hexadecimal Color</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEXADECIMAL_COLOR_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Hexadecimal Color</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEXADECIMAL_COLOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link CinEditorML.impl.ItemPositionImpl <em>Item Position</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CinEditorML.impl.ItemPositionImpl
	 * @see CinEditorML.impl.CinEditorMLPackageImpl#getItemPosition()
	 * @generated
	 */
	int ITEM_POSITION = 17;

	/**
	 * The number of structural features of the '<em>Item Position</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_POSITION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Item Position</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_POSITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link CinEditorML.impl.ItemPositionIntImpl <em>Item Position Int</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CinEditorML.impl.ItemPositionIntImpl
	 * @see CinEditorML.impl.CinEditorMLPackageImpl#getItemPositionInt()
	 * @generated
	 */
	int ITEM_POSITION_INT = 16;

	/**
	 * The feature id for the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_POSITION_INT__POSITION = ITEM_POSITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Item Position Int</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_POSITION_INT_FEATURE_COUNT = ITEM_POSITION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Item Position Int</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_POSITION_INT_OPERATION_COUNT = ITEM_POSITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CinEditorML.impl.ItemPositionStringImpl <em>Item Position String</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CinEditorML.impl.ItemPositionStringImpl
	 * @see CinEditorML.impl.CinEditorMLPackageImpl#getItemPositionString()
	 * @generated
	 */
	int ITEM_POSITION_STRING = 18;

	/**
	 * The feature id for the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_POSITION_STRING__POSITION = ITEM_POSITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Item Position String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_POSITION_STRING_FEATURE_COUNT = ITEM_POSITION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Item Position String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_POSITION_STRING_OPERATION_COUNT = ITEM_POSITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CinEditorML.impl.AudioElementImpl <em>Audio Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CinEditorML.impl.AudioElementImpl
	 * @see CinEditorML.impl.CinEditorMLPackageImpl#getAudioElement()
	 * @generated
	 */
	int AUDIO_ELEMENT = 19;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO_ELEMENT__DURATION = ELEMENT__DURATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO_ELEMENT__NAME = ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Temporal Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO_ELEMENT__TEMPORAL_POSITION = ELEMENT__TEMPORAL_POSITION;

	/**
	 * The feature id for the '<em><b>Ending Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO_ELEMENT__ENDING_TIME = ELEMENT__ENDING_TIME;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO_ELEMENT__URL = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Fade In</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO_ELEMENT__FADE_IN = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Fade Out</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO_ELEMENT__FADE_OUT = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Volume</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO_ELEMENT__VOLUME = ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Begin Crop Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO_ELEMENT__BEGIN_CROP_TIME = ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Audio Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO_ELEMENT_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Audio Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO_ELEMENT_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CinEditorML.impl.MarginImpl <em>Margin</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CinEditorML.impl.MarginImpl
	 * @see CinEditorML.impl.CinEditorMLPackageImpl#getMargin()
	 * @generated
	 */
	int MARGIN = 20;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARGIN__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARGIN__SIZE = 1;

	/**
	 * The feature id for the '<em><b>Margin Color</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARGIN__MARGIN_COLOR = 2;

	/**
	 * The feature id for the '<em><b>Margin Color Opacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARGIN__MARGIN_COLOR_OPACITY = 3;

	/**
	 * The number of structural features of the '<em>Margin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARGIN_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Margin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARGIN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link CinEditorML.impl.TemporalPositionImpl <em>Temporal Position</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CinEditorML.impl.TemporalPositionImpl
	 * @see CinEditorML.impl.CinEditorMLPackageImpl#getTemporalPosition()
	 * @generated
	 */
	int TEMPORAL_POSITION = 21;

	/**
	 * The feature id for the '<em><b>Begin Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_POSITION__BEGIN_TIME = 0;

	/**
	 * The feature id for the '<em><b>Element To Start After</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_POSITION__ELEMENT_TO_START_AFTER = 1;

	/**
	 * The number of structural features of the '<em>Temporal Position</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_POSITION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Temporal Position</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_POSITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link CinEditorML.MARGIN_NAME <em>MARGIN NAME</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CinEditorML.MARGIN_NAME
	 * @see CinEditorML.impl.CinEditorMLPackageImpl#getMARGIN_NAME()
	 * @generated
	 */
	int MARGIN_NAME = 22;

	/**
	 * Returns the meta object for class '{@link CinEditorML.Movie <em>Movie</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Movie</em>'.
	 * @see CinEditorML.Movie
	 * @generated
	 */
	EClass getMovie();

	/**
	 * Returns the meta object for the containment reference list '{@link CinEditorML.Movie#getLayers <em>Layers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Layers</em>'.
	 * @see CinEditorML.Movie#getLayers()
	 * @see #getMovie()
	 * @generated
	 */
	EReference getMovie_Layers();

	/**
	 * Returns the meta object for the attribute '{@link CinEditorML.Movie#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see CinEditorML.Movie#getName()
	 * @see #getMovie()
	 * @generated
	 */
	EAttribute getMovie_Name();

	/**
	 * Returns the meta object for the containment reference '{@link CinEditorML.Movie#getDimension <em>Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dimension</em>'.
	 * @see CinEditorML.Movie#getDimension()
	 * @see #getMovie()
	 * @generated
	 */
	EReference getMovie_Dimension();

	/**
	 * Returns the meta object for the attribute '{@link CinEditorML.Movie#getFps <em>Fps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fps</em>'.
	 * @see CinEditorML.Movie#getFps()
	 * @see #getMovie()
	 * @generated
	 */
	EAttribute getMovie_Fps();

	/**
	 * Returns the meta object for class '{@link CinEditorML.Layer <em>Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Layer</em>'.
	 * @see CinEditorML.Layer
	 * @generated
	 */
	EClass getLayer();

	/**
	 * Returns the meta object for the containment reference list '{@link CinEditorML.Layer#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see CinEditorML.Layer#getElements()
	 * @see #getLayer()
	 * @generated
	 */
	EReference getLayer_Elements();

	/**
	 * Returns the meta object for class '{@link CinEditorML.Text <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text</em>'.
	 * @see CinEditorML.Text
	 * @generated
	 */
	EClass getText();

	/**
	 * Returns the meta object for the attribute '{@link CinEditorML.Text#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see CinEditorML.Text#getText()
	 * @see #getText()
	 * @generated
	 */
	EAttribute getText_Text();

	/**
	 * Returns the meta object for the attribute '{@link CinEditorML.Text#getFontSize <em>Font Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Font Size</em>'.
	 * @see CinEditorML.Text#getFontSize()
	 * @see #getText()
	 * @generated
	 */
	EAttribute getText_FontSize();

	/**
	 * Returns the meta object for the containment reference '{@link CinEditorML.Text#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Color</em>'.
	 * @see CinEditorML.Text#getColor()
	 * @see #getText()
	 * @generated
	 */
	EReference getText_Color();

	/**
	 * Returns the meta object for class '{@link CinEditorML.Picture <em>Picture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Picture</em>'.
	 * @see CinEditorML.Picture
	 * @generated
	 */
	EClass getPicture();

	/**
	 * Returns the meta object for the attribute '{@link CinEditorML.Picture#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see CinEditorML.Picture#getUrl()
	 * @see #getPicture()
	 * @generated
	 */
	EAttribute getPicture_Url();

	/**
	 * Returns the meta object for class '{@link CinEditorML.Video <em>Video</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Video</em>'.
	 * @see CinEditorML.Video
	 * @generated
	 */
	EClass getVideo();

	/**
	 * Returns the meta object for the attribute '{@link CinEditorML.Video#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see CinEditorML.Video#getUrl()
	 * @see #getVideo()
	 * @generated
	 */
	EAttribute getVideo_Url();

	/**
	 * Returns the meta object for the attribute '{@link CinEditorML.Video#getBeginCropTime <em>Begin Crop Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Begin Crop Time</em>'.
	 * @see CinEditorML.Video#getBeginCropTime()
	 * @see #getVideo()
	 * @generated
	 */
	EAttribute getVideo_BeginCropTime();

	/**
	 * Returns the meta object for the attribute '{@link CinEditorML.Video#isEnableAudio <em>Enable Audio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enable Audio</em>'.
	 * @see CinEditorML.Video#isEnableAudio()
	 * @see #getVideo()
	 * @generated
	 */
	EAttribute getVideo_EnableAudio();

	/**
	 * Returns the meta object for class '{@link CinEditorML.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see CinEditorML.Element
	 * @generated
	 */
	EClass getElement();

	/**
	 * Returns the meta object for the attribute '{@link CinEditorML.Element#getDuration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duration</em>'.
	 * @see CinEditorML.Element#getDuration()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Duration();

	/**
	 * Returns the meta object for the attribute '{@link CinEditorML.Element#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see CinEditorML.Element#getName()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Name();

	/**
	 * Returns the meta object for the containment reference '{@link CinEditorML.Element#getTemporalPosition <em>Temporal Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Temporal Position</em>'.
	 * @see CinEditorML.Element#getTemporalPosition()
	 * @see #getElement()
	 * @generated
	 */
	EReference getElement_TemporalPosition();

	/**
	 * Returns the meta object for the attribute '{@link CinEditorML.Element#getEndingTime <em>Ending Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ending Time</em>'.
	 * @see CinEditorML.Element#getEndingTime()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_EndingTime();

	/**
	 * Returns the meta object for class '{@link CinEditorML.Effect <em>Effect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Effect</em>'.
	 * @see CinEditorML.Effect
	 * @generated
	 */
	EClass getEffect();

	/**
	 * Returns the meta object for the reference list '{@link CinEditorML.Effect#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Elements</em>'.
	 * @see CinEditorML.Effect#getElements()
	 * @see #getEffect()
	 * @generated
	 */
	EReference getEffect_Elements();

	/**
	 * Returns the meta object for class '{@link CinEditorML.FadeIn <em>Fade In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fade In</em>'.
	 * @see CinEditorML.FadeIn
	 * @generated
	 */
	EClass getFadeIn();

	/**
	 * Returns the meta object for class '{@link CinEditorML.FadeOut <em>Fade Out</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fade Out</em>'.
	 * @see CinEditorML.FadeOut
	 * @generated
	 */
	EClass getFadeOut();

	/**
	 * Returns the meta object for class '{@link CinEditorML.Translate <em>Translate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Translate</em>'.
	 * @see CinEditorML.Translate
	 * @generated
	 */
	EClass getTranslate();

	/**
	 * Returns the meta object for the containment reference '{@link CinEditorML.Translate#getPositionToTranslate <em>Position To Translate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Position To Translate</em>'.
	 * @see CinEditorML.Translate#getPositionToTranslate()
	 * @see #getTranslate()
	 * @generated
	 */
	EReference getTranslate_PositionToTranslate();

	/**
	 * Returns the meta object for class '{@link CinEditorML.Shape <em>Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shape</em>'.
	 * @see CinEditorML.Shape
	 * @generated
	 */
	EClass getShape();

	/**
	 * Returns the meta object for the containment reference '{@link CinEditorML.Shape#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Color</em>'.
	 * @see CinEditorML.Shape#getColor()
	 * @see #getShape()
	 * @generated
	 */
	EReference getShape_Color();

	/**
	 * Returns the meta object for class '{@link CinEditorML.Position <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Position</em>'.
	 * @see CinEditorML.Position
	 * @generated
	 */
	EClass getPosition();

	/**
	 * Returns the meta object for the containment reference '{@link CinEditorML.Position#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>X</em>'.
	 * @see CinEditorML.Position#getX()
	 * @see #getPosition()
	 * @generated
	 */
	EReference getPosition_X();

	/**
	 * Returns the meta object for the containment reference '{@link CinEditorML.Position#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Y</em>'.
	 * @see CinEditorML.Position#getY()
	 * @see #getPosition()
	 * @generated
	 */
	EReference getPosition_Y();

	/**
	 * Returns the meta object for class '{@link CinEditorML.Rectangle <em>Rectangle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rectangle</em>'.
	 * @see CinEditorML.Rectangle
	 * @generated
	 */
	EClass getRectangle();

	/**
	 * Returns the meta object for class '{@link CinEditorML.Dimension <em>Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dimension</em>'.
	 * @see CinEditorML.Dimension
	 * @generated
	 */
	EClass getDimension();

	/**
	 * Returns the meta object for the attribute '{@link CinEditorML.Dimension#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see CinEditorML.Dimension#getWidth()
	 * @see #getDimension()
	 * @generated
	 */
	EAttribute getDimension_Width();

	/**
	 * Returns the meta object for the attribute '{@link CinEditorML.Dimension#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see CinEditorML.Dimension#getHeight()
	 * @see #getDimension()
	 * @generated
	 */
	EAttribute getDimension_Height();

	/**
	 * Returns the meta object for class '{@link CinEditorML.HexadecimalColor <em>Hexadecimal Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hexadecimal Color</em>'.
	 * @see CinEditorML.HexadecimalColor
	 * @generated
	 */
	EClass getHexadecimalColor();

	/**
	 * Returns the meta object for the attribute '{@link CinEditorML.HexadecimalColor#getHexadecimalValue <em>Hexadecimal Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hexadecimal Value</em>'.
	 * @see CinEditorML.HexadecimalColor#getHexadecimalValue()
	 * @see #getHexadecimalColor()
	 * @generated
	 */
	EAttribute getHexadecimalColor_HexadecimalValue();

	/**
	 * Returns the meta object for class '{@link CinEditorML.GraphicalElement <em>Graphical Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Graphical Element</em>'.
	 * @see CinEditorML.GraphicalElement
	 * @generated
	 */
	EClass getGraphicalElement();

	/**
	 * Returns the meta object for the containment reference '{@link CinEditorML.GraphicalElement#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Position</em>'.
	 * @see CinEditorML.GraphicalElement#getPosition()
	 * @see #getGraphicalElement()
	 * @generated
	 */
	EReference getGraphicalElement_Position();

	/**
	 * Returns the meta object for the containment reference '{@link CinEditorML.GraphicalElement#getDimension <em>Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dimension</em>'.
	 * @see CinEditorML.GraphicalElement#getDimension()
	 * @see #getGraphicalElement()
	 * @generated
	 */
	EReference getGraphicalElement_Dimension();

	/**
	 * Returns the meta object for the containment reference list '{@link CinEditorML.GraphicalElement#getMargins <em>Margins</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Margins</em>'.
	 * @see CinEditorML.GraphicalElement#getMargins()
	 * @see #getGraphicalElement()
	 * @generated
	 */
	EReference getGraphicalElement_Margins();

	/**
	 * Returns the meta object for class '{@link CinEditorML.ItemPositionInt <em>Item Position Int</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Item Position Int</em>'.
	 * @see CinEditorML.ItemPositionInt
	 * @generated
	 */
	EClass getItemPositionInt();

	/**
	 * Returns the meta object for the attribute '{@link CinEditorML.ItemPositionInt#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Position</em>'.
	 * @see CinEditorML.ItemPositionInt#getPosition()
	 * @see #getItemPositionInt()
	 * @generated
	 */
	EAttribute getItemPositionInt_Position();

	/**
	 * Returns the meta object for class '{@link CinEditorML.ItemPosition <em>Item Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Item Position</em>'.
	 * @see CinEditorML.ItemPosition
	 * @generated
	 */
	EClass getItemPosition();

	/**
	 * Returns the meta object for class '{@link CinEditorML.ItemPositionString <em>Item Position String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Item Position String</em>'.
	 * @see CinEditorML.ItemPositionString
	 * @generated
	 */
	EClass getItemPositionString();

	/**
	 * Returns the meta object for the attribute '{@link CinEditorML.ItemPositionString#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Position</em>'.
	 * @see CinEditorML.ItemPositionString#getPosition()
	 * @see #getItemPositionString()
	 * @generated
	 */
	EAttribute getItemPositionString_Position();

	/**
	 * Returns the meta object for class '{@link CinEditorML.AudioElement <em>Audio Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Audio Element</em>'.
	 * @see CinEditorML.AudioElement
	 * @generated
	 */
	EClass getAudioElement();

	/**
	 * Returns the meta object for the attribute '{@link CinEditorML.AudioElement#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see CinEditorML.AudioElement#getUrl()
	 * @see #getAudioElement()
	 * @generated
	 */
	EAttribute getAudioElement_Url();

	/**
	 * Returns the meta object for the attribute '{@link CinEditorML.AudioElement#getFadeIn <em>Fade In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fade In</em>'.
	 * @see CinEditorML.AudioElement#getFadeIn()
	 * @see #getAudioElement()
	 * @generated
	 */
	EAttribute getAudioElement_FadeIn();

	/**
	 * Returns the meta object for the attribute '{@link CinEditorML.AudioElement#getFadeOut <em>Fade Out</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fade Out</em>'.
	 * @see CinEditorML.AudioElement#getFadeOut()
	 * @see #getAudioElement()
	 * @generated
	 */
	EAttribute getAudioElement_FadeOut();

	/**
	 * Returns the meta object for the attribute '{@link CinEditorML.AudioElement#getVolume <em>Volume</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Volume</em>'.
	 * @see CinEditorML.AudioElement#getVolume()
	 * @see #getAudioElement()
	 * @generated
	 */
	EAttribute getAudioElement_Volume();

	/**
	 * Returns the meta object for the attribute '{@link CinEditorML.AudioElement#getBeginCropTime <em>Begin Crop Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Begin Crop Time</em>'.
	 * @see CinEditorML.AudioElement#getBeginCropTime()
	 * @see #getAudioElement()
	 * @generated
	 */
	EAttribute getAudioElement_BeginCropTime();

	/**
	 * Returns the meta object for class '{@link CinEditorML.Margin <em>Margin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Margin</em>'.
	 * @see CinEditorML.Margin
	 * @generated
	 */
	EClass getMargin();

	/**
	 * Returns the meta object for the attribute '{@link CinEditorML.Margin#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see CinEditorML.Margin#getType()
	 * @see #getMargin()
	 * @generated
	 */
	EAttribute getMargin_Type();

	/**
	 * Returns the meta object for the attribute '{@link CinEditorML.Margin#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see CinEditorML.Margin#getSize()
	 * @see #getMargin()
	 * @generated
	 */
	EAttribute getMargin_Size();

	/**
	 * Returns the meta object for the containment reference '{@link CinEditorML.Margin#getMarginColor <em>Margin Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Margin Color</em>'.
	 * @see CinEditorML.Margin#getMarginColor()
	 * @see #getMargin()
	 * @generated
	 */
	EReference getMargin_MarginColor();

	/**
	 * Returns the meta object for the attribute '{@link CinEditorML.Margin#getMarginColorOpacity <em>Margin Color Opacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Margin Color Opacity</em>'.
	 * @see CinEditorML.Margin#getMarginColorOpacity()
	 * @see #getMargin()
	 * @generated
	 */
	EAttribute getMargin_MarginColorOpacity();

	/**
	 * Returns the meta object for class '{@link CinEditorML.TemporalPosition <em>Temporal Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Temporal Position</em>'.
	 * @see CinEditorML.TemporalPosition
	 * @generated
	 */
	EClass getTemporalPosition();

	/**
	 * Returns the meta object for the attribute '{@link CinEditorML.TemporalPosition#getBeginTime <em>Begin Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Begin Time</em>'.
	 * @see CinEditorML.TemporalPosition#getBeginTime()
	 * @see #getTemporalPosition()
	 * @generated
	 */
	EAttribute getTemporalPosition_BeginTime();

	/**
	 * Returns the meta object for the reference '{@link CinEditorML.TemporalPosition#getElementToStartAfter <em>Element To Start After</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Element To Start After</em>'.
	 * @see CinEditorML.TemporalPosition#getElementToStartAfter()
	 * @see #getTemporalPosition()
	 * @generated
	 */
	EReference getTemporalPosition_ElementToStartAfter();

	/**
	 * Returns the meta object for enum '{@link CinEditorML.MARGIN_NAME <em>MARGIN NAME</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>MARGIN NAME</em>'.
	 * @see CinEditorML.MARGIN_NAME
	 * @generated
	 */
	EEnum getMARGIN_NAME();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CinEditorMLFactory getCinEditorMLFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link CinEditorML.impl.MovieImpl <em>Movie</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CinEditorML.impl.MovieImpl
		 * @see CinEditorML.impl.CinEditorMLPackageImpl#getMovie()
		 * @generated
		 */
		EClass MOVIE = eINSTANCE.getMovie();

		/**
		 * The meta object literal for the '<em><b>Layers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MOVIE__LAYERS = eINSTANCE.getMovie_Layers();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOVIE__NAME = eINSTANCE.getMovie_Name();

		/**
		 * The meta object literal for the '<em><b>Dimension</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MOVIE__DIMENSION = eINSTANCE.getMovie_Dimension();

		/**
		 * The meta object literal for the '<em><b>Fps</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOVIE__FPS = eINSTANCE.getMovie_Fps();

		/**
		 * The meta object literal for the '{@link CinEditorML.impl.LayerImpl <em>Layer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CinEditorML.impl.LayerImpl
		 * @see CinEditorML.impl.CinEditorMLPackageImpl#getLayer()
		 * @generated
		 */
		EClass LAYER = eINSTANCE.getLayer();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAYER__ELEMENTS = eINSTANCE.getLayer_Elements();

		/**
		 * The meta object literal for the '{@link CinEditorML.impl.TextImpl <em>Text</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CinEditorML.impl.TextImpl
		 * @see CinEditorML.impl.CinEditorMLPackageImpl#getText()
		 * @generated
		 */
		EClass TEXT = eINSTANCE.getText();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT__TEXT = eINSTANCE.getText_Text();

		/**
		 * The meta object literal for the '<em><b>Font Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT__FONT_SIZE = eINSTANCE.getText_FontSize();

		/**
		 * The meta object literal for the '<em><b>Color</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEXT__COLOR = eINSTANCE.getText_Color();

		/**
		 * The meta object literal for the '{@link CinEditorML.impl.PictureImpl <em>Picture</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CinEditorML.impl.PictureImpl
		 * @see CinEditorML.impl.CinEditorMLPackageImpl#getPicture()
		 * @generated
		 */
		EClass PICTURE = eINSTANCE.getPicture();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PICTURE__URL = eINSTANCE.getPicture_Url();

		/**
		 * The meta object literal for the '{@link CinEditorML.impl.VideoImpl <em>Video</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CinEditorML.impl.VideoImpl
		 * @see CinEditorML.impl.CinEditorMLPackageImpl#getVideo()
		 * @generated
		 */
		EClass VIDEO = eINSTANCE.getVideo();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIDEO__URL = eINSTANCE.getVideo_Url();

		/**
		 * The meta object literal for the '<em><b>Begin Crop Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIDEO__BEGIN_CROP_TIME = eINSTANCE.getVideo_BeginCropTime();

		/**
		 * The meta object literal for the '<em><b>Enable Audio</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIDEO__ENABLE_AUDIO = eINSTANCE.getVideo_EnableAudio();

		/**
		 * The meta object literal for the '{@link CinEditorML.impl.ElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CinEditorML.impl.ElementImpl
		 * @see CinEditorML.impl.CinEditorMLPackageImpl#getElement()
		 * @generated
		 */
		EClass ELEMENT = eINSTANCE.getElement();

		/**
		 * The meta object literal for the '<em><b>Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__DURATION = eINSTANCE.getElement_Duration();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__NAME = eINSTANCE.getElement_Name();

		/**
		 * The meta object literal for the '<em><b>Temporal Position</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT__TEMPORAL_POSITION = eINSTANCE.getElement_TemporalPosition();

		/**
		 * The meta object literal for the '<em><b>Ending Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__ENDING_TIME = eINSTANCE.getElement_EndingTime();

		/**
		 * The meta object literal for the '{@link CinEditorML.impl.EffectImpl <em>Effect</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CinEditorML.impl.EffectImpl
		 * @see CinEditorML.impl.CinEditorMLPackageImpl#getEffect()
		 * @generated
		 */
		EClass EFFECT = eINSTANCE.getEffect();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EFFECT__ELEMENTS = eINSTANCE.getEffect_Elements();

		/**
		 * The meta object literal for the '{@link CinEditorML.impl.FadeInImpl <em>Fade In</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CinEditorML.impl.FadeInImpl
		 * @see CinEditorML.impl.CinEditorMLPackageImpl#getFadeIn()
		 * @generated
		 */
		EClass FADE_IN = eINSTANCE.getFadeIn();

		/**
		 * The meta object literal for the '{@link CinEditorML.impl.FadeOutImpl <em>Fade Out</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CinEditorML.impl.FadeOutImpl
		 * @see CinEditorML.impl.CinEditorMLPackageImpl#getFadeOut()
		 * @generated
		 */
		EClass FADE_OUT = eINSTANCE.getFadeOut();

		/**
		 * The meta object literal for the '{@link CinEditorML.impl.TranslateImpl <em>Translate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CinEditorML.impl.TranslateImpl
		 * @see CinEditorML.impl.CinEditorMLPackageImpl#getTranslate()
		 * @generated
		 */
		EClass TRANSLATE = eINSTANCE.getTranslate();

		/**
		 * The meta object literal for the '<em><b>Position To Translate</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSLATE__POSITION_TO_TRANSLATE = eINSTANCE.getTranslate_PositionToTranslate();

		/**
		 * The meta object literal for the '{@link CinEditorML.impl.ShapeImpl <em>Shape</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CinEditorML.impl.ShapeImpl
		 * @see CinEditorML.impl.CinEditorMLPackageImpl#getShape()
		 * @generated
		 */
		EClass SHAPE = eINSTANCE.getShape();

		/**
		 * The meta object literal for the '<em><b>Color</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHAPE__COLOR = eINSTANCE.getShape_Color();

		/**
		 * The meta object literal for the '{@link CinEditorML.impl.PositionImpl <em>Position</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CinEditorML.impl.PositionImpl
		 * @see CinEditorML.impl.CinEditorMLPackageImpl#getPosition()
		 * @generated
		 */
		EClass POSITION = eINSTANCE.getPosition();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POSITION__X = eINSTANCE.getPosition_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POSITION__Y = eINSTANCE.getPosition_Y();

		/**
		 * The meta object literal for the '{@link CinEditorML.impl.RectangleImpl <em>Rectangle</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CinEditorML.impl.RectangleImpl
		 * @see CinEditorML.impl.CinEditorMLPackageImpl#getRectangle()
		 * @generated
		 */
		EClass RECTANGLE = eINSTANCE.getRectangle();

		/**
		 * The meta object literal for the '{@link CinEditorML.impl.DimensionImpl <em>Dimension</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CinEditorML.impl.DimensionImpl
		 * @see CinEditorML.impl.CinEditorMLPackageImpl#getDimension()
		 * @generated
		 */
		EClass DIMENSION = eINSTANCE.getDimension();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIMENSION__WIDTH = eINSTANCE.getDimension_Width();

		/**
		 * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIMENSION__HEIGHT = eINSTANCE.getDimension_Height();

		/**
		 * The meta object literal for the '{@link CinEditorML.impl.HexadecimalColorImpl <em>Hexadecimal Color</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CinEditorML.impl.HexadecimalColorImpl
		 * @see CinEditorML.impl.CinEditorMLPackageImpl#getHexadecimalColor()
		 * @generated
		 */
		EClass HEXADECIMAL_COLOR = eINSTANCE.getHexadecimalColor();

		/**
		 * The meta object literal for the '<em><b>Hexadecimal Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEXADECIMAL_COLOR__HEXADECIMAL_VALUE = eINSTANCE.getHexadecimalColor_HexadecimalValue();

		/**
		 * The meta object literal for the '{@link CinEditorML.impl.GraphicalElementImpl <em>Graphical Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CinEditorML.impl.GraphicalElementImpl
		 * @see CinEditorML.impl.CinEditorMLPackageImpl#getGraphicalElement()
		 * @generated
		 */
		EClass GRAPHICAL_ELEMENT = eINSTANCE.getGraphicalElement();

		/**
		 * The meta object literal for the '<em><b>Position</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRAPHICAL_ELEMENT__POSITION = eINSTANCE.getGraphicalElement_Position();

		/**
		 * The meta object literal for the '<em><b>Dimension</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRAPHICAL_ELEMENT__DIMENSION = eINSTANCE.getGraphicalElement_Dimension();

		/**
		 * The meta object literal for the '<em><b>Margins</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRAPHICAL_ELEMENT__MARGINS = eINSTANCE.getGraphicalElement_Margins();

		/**
		 * The meta object literal for the '{@link CinEditorML.impl.ItemPositionIntImpl <em>Item Position Int</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CinEditorML.impl.ItemPositionIntImpl
		 * @see CinEditorML.impl.CinEditorMLPackageImpl#getItemPositionInt()
		 * @generated
		 */
		EClass ITEM_POSITION_INT = eINSTANCE.getItemPositionInt();

		/**
		 * The meta object literal for the '<em><b>Position</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM_POSITION_INT__POSITION = eINSTANCE.getItemPositionInt_Position();

		/**
		 * The meta object literal for the '{@link CinEditorML.impl.ItemPositionImpl <em>Item Position</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CinEditorML.impl.ItemPositionImpl
		 * @see CinEditorML.impl.CinEditorMLPackageImpl#getItemPosition()
		 * @generated
		 */
		EClass ITEM_POSITION = eINSTANCE.getItemPosition();

		/**
		 * The meta object literal for the '{@link CinEditorML.impl.ItemPositionStringImpl <em>Item Position String</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CinEditorML.impl.ItemPositionStringImpl
		 * @see CinEditorML.impl.CinEditorMLPackageImpl#getItemPositionString()
		 * @generated
		 */
		EClass ITEM_POSITION_STRING = eINSTANCE.getItemPositionString();

		/**
		 * The meta object literal for the '<em><b>Position</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM_POSITION_STRING__POSITION = eINSTANCE.getItemPositionString_Position();

		/**
		 * The meta object literal for the '{@link CinEditorML.impl.AudioElementImpl <em>Audio Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CinEditorML.impl.AudioElementImpl
		 * @see CinEditorML.impl.CinEditorMLPackageImpl#getAudioElement()
		 * @generated
		 */
		EClass AUDIO_ELEMENT = eINSTANCE.getAudioElement();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUDIO_ELEMENT__URL = eINSTANCE.getAudioElement_Url();

		/**
		 * The meta object literal for the '<em><b>Fade In</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUDIO_ELEMENT__FADE_IN = eINSTANCE.getAudioElement_FadeIn();

		/**
		 * The meta object literal for the '<em><b>Fade Out</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUDIO_ELEMENT__FADE_OUT = eINSTANCE.getAudioElement_FadeOut();

		/**
		 * The meta object literal for the '<em><b>Volume</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUDIO_ELEMENT__VOLUME = eINSTANCE.getAudioElement_Volume();

		/**
		 * The meta object literal for the '<em><b>Begin Crop Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUDIO_ELEMENT__BEGIN_CROP_TIME = eINSTANCE.getAudioElement_BeginCropTime();

		/**
		 * The meta object literal for the '{@link CinEditorML.impl.MarginImpl <em>Margin</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CinEditorML.impl.MarginImpl
		 * @see CinEditorML.impl.CinEditorMLPackageImpl#getMargin()
		 * @generated
		 */
		EClass MARGIN = eINSTANCE.getMargin();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MARGIN__TYPE = eINSTANCE.getMargin_Type();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MARGIN__SIZE = eINSTANCE.getMargin_Size();

		/**
		 * The meta object literal for the '<em><b>Margin Color</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MARGIN__MARGIN_COLOR = eINSTANCE.getMargin_MarginColor();

		/**
		 * The meta object literal for the '<em><b>Margin Color Opacity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MARGIN__MARGIN_COLOR_OPACITY = eINSTANCE.getMargin_MarginColorOpacity();

		/**
		 * The meta object literal for the '{@link CinEditorML.impl.TemporalPositionImpl <em>Temporal Position</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CinEditorML.impl.TemporalPositionImpl
		 * @see CinEditorML.impl.CinEditorMLPackageImpl#getTemporalPosition()
		 * @generated
		 */
		EClass TEMPORAL_POSITION = eINSTANCE.getTemporalPosition();

		/**
		 * The meta object literal for the '<em><b>Begin Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEMPORAL_POSITION__BEGIN_TIME = eINSTANCE.getTemporalPosition_BeginTime();

		/**
		 * The meta object literal for the '<em><b>Element To Start After</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEMPORAL_POSITION__ELEMENT_TO_START_AFTER = eINSTANCE.getTemporalPosition_ElementToStartAfter();

		/**
		 * The meta object literal for the '{@link CinEditorML.MARGIN_NAME <em>MARGIN NAME</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CinEditorML.MARGIN_NAME
		 * @see CinEditorML.impl.CinEditorMLPackageImpl#getMARGIN_NAME()
		 * @generated
		 */
		EEnum MARGIN_NAME = eINSTANCE.getMARGIN_NAME();

	}

} //CinEditorMLPackage
