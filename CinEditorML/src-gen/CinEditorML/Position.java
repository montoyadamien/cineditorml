/**
 */
package CinEditorML;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Position</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CinEditorML.Position#getX <em>X</em>}</li>
 *   <li>{@link CinEditorML.Position#getY <em>Y</em>}</li>
 * </ul>
 *
 * @see CinEditorML.CinEditorMLPackage#getPosition()
 * @model
 * @generated
 */
public interface Position extends EObject {
	/**
	 * Returns the value of the '<em><b>X</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>X</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>X</em>' containment reference.
	 * @see #setX(ItemPosition)
	 * @see CinEditorML.CinEditorMLPackage#getPosition_X()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ItemPosition getX();

	/**
	 * Sets the value of the '{@link CinEditorML.Position#getX <em>X</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>X</em>' containment reference.
	 * @see #getX()
	 * @generated
	 */
	void setX(ItemPosition value);

	/**
	 * Returns the value of the '<em><b>Y</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Y</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Y</em>' containment reference.
	 * @see #setY(ItemPosition)
	 * @see CinEditorML.CinEditorMLPackage#getPosition_Y()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ItemPosition getY();

	/**
	 * Sets the value of the '{@link CinEditorML.Position#getY <em>Y</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Y</em>' containment reference.
	 * @see #getY()
	 * @generated
	 */
	void setY(ItemPosition value);

} // Position
