/**
 */
package CinEditorML;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Text</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CinEditorML.Text#getText <em>Text</em>}</li>
 *   <li>{@link CinEditorML.Text#getFontSize <em>Font Size</em>}</li>
 *   <li>{@link CinEditorML.Text#getColor <em>Color</em>}</li>
 * </ul>
 *
 * @see CinEditorML.CinEditorMLPackage#getText()
 * @model
 * @generated
 */
public interface Text extends GraphicalElement {
	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * The default value is <code>"Sample text"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #setText(String)
	 * @see CinEditorML.CinEditorMLPackage#getText_Text()
	 * @model default="Sample text" required="true"
	 * @generated
	 */
	String getText();

	/**
	 * Sets the value of the '{@link CinEditorML.Text#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(String value);

	/**
	 * Returns the value of the '<em><b>Font Size</b></em>' attribute.
	 * The default value is <code>"20"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Font Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Font Size</em>' attribute.
	 * @see #setFontSize(int)
	 * @see CinEditorML.CinEditorMLPackage#getText_FontSize()
	 * @model default="20" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 * @generated
	 */
	int getFontSize();

	/**
	 * Sets the value of the '{@link CinEditorML.Text#getFontSize <em>Font Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Font Size</em>' attribute.
	 * @see #getFontSize()
	 * @generated
	 */
	void setFontSize(int value);

	/**
	 * Returns the value of the '<em><b>Color</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Color</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Color</em>' containment reference.
	 * @see #setColor(HexadecimalColor)
	 * @see CinEditorML.CinEditorMLPackage#getText_Color()
	 * @model containment="true"
	 * @generated
	 */
	HexadecimalColor getColor();

	/**
	 * Sets the value of the '{@link CinEditorML.Text#getColor <em>Color</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color</em>' containment reference.
	 * @see #getColor()
	 * @generated
	 */
	void setColor(HexadecimalColor value);

} // Text
