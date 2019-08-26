/**
 */
package ovgu.pave.model.algorithmObjects.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import ovgu.pave.model.algorithmObjects.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see ovgu.pave.model.algorithmObjects.AlgorithmObjectsPackage
 * @generated
 */
public class AlgorithmObjectsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AlgorithmObjectsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlgorithmObjectsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = AlgorithmObjectsPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AlgorithmObjectsSwitch<Adapter> modelSwitch =
		new AlgorithmObjectsSwitch<Adapter>() {
			@Override
			public Adapter caseSearchStatistics(SearchStatistics object) {
				return createSearchStatisticsAdapter();
			}
			@Override
			public Adapter caseInsertionInformation(InsertionInformation object) {
				return createInsertionInformationAdapter();
			}
			@Override
			public Adapter caseInsertionOption(InsertionOption object) {
				return createInsertionOptionAdapter();
			}
			@Override
			public Adapter caseRemovalOption(RemovalOption object) {
				return createRemovalOptionAdapter();
			}
			@Override
			public Adapter caseRemovalInformation(RemovalInformation object) {
				return createRemovalInformationAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link ovgu.pave.model.algorithmObjects.SearchStatistics <em>Search Statistics</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ovgu.pave.model.algorithmObjects.SearchStatistics
	 * @generated
	 */
	public Adapter createSearchStatisticsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ovgu.pave.model.algorithmObjects.InsertionInformation <em>Insertion Information</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ovgu.pave.model.algorithmObjects.InsertionInformation
	 * @generated
	 */
	public Adapter createInsertionInformationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ovgu.pave.model.algorithmObjects.InsertionOption <em>Insertion Option</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ovgu.pave.model.algorithmObjects.InsertionOption
	 * @generated
	 */
	public Adapter createInsertionOptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ovgu.pave.model.algorithmObjects.RemovalOption <em>Removal Option</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ovgu.pave.model.algorithmObjects.RemovalOption
	 * @generated
	 */
	public Adapter createRemovalOptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ovgu.pave.model.algorithmObjects.RemovalInformation <em>Removal Information</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ovgu.pave.model.algorithmObjects.RemovalInformation
	 * @generated
	 */
	public Adapter createRemovalInformationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //AlgorithmObjectsAdapterFactory
