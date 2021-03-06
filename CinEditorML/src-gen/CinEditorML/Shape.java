/**
 */
package CinEditorML;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Shape</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CinEditorML.Shape#getColor <em>Color</em>}</li>
 * </ul>
 *
 * @see CinEditorML.CinEditorMLPackage#getShape()
 * @model abstract="true"
 * @generated
 */
public interface Shape extends GraphicalElement {
	/**
	 * Returns the value of the '<em><b>Color</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Color</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Color</em>' containment reference.
	 * @see #setColor(HexadecimalColor)
	 * @see CinEditorML.CinEditorMLPackage#getShape_Color()
	 * @model containment="true"
	 * @generated
	 */
	HexadecimalColor getColor();

	/**
	 * Sets the value of the '{@link CinEditorML.Shape#getColor <em>Color</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color</em>' containment reference.
	 * @see #getColor()
	 * @generated
	 */
	void setColor(HexadecimalColor value);

} // Shape
