package codeTest;

import java.util.Collection;
import java.util.Iterator;

/**
 * Implement an iterator that iterates all the elements of a collection of collections
 * @param <E>
 */
public class CodeTestExerciseCollectionOfCollectionsIterator<E> implements Iterator<E> {

	private Collection<Collection<E>> _collOfColl = null;
	
	private Iterator<Collection<E>> outerIterator;
	private Iterator<E> innerIterator;
	private E next;
	
	
	/**
	 * Constructor takes in the collection of collections that should be iterated
	 * @param collofColl collection of collections
	 */
	public CodeTestExerciseCollectionOfCollectionsIterator(Collection<Collection<E>> collofColl) {
		_collOfColl = collofColl;
		outerIterator = _collOfColl.iterator();
		// other fields default to null.
	}
	
	/**
	 * Returns true if the iteration has more elements
	 */
	public boolean hasNext() {
		if(outerIterator.hasNext()) {
			innerIterator = outerIterator.next().iterator();
			if(innerIterator != null || innerIterator.hasNext()) {
				//update next field
				next = innerIterator.next();
				return true;
			}
		}
		return false;
	}

	/**
	 * Returns the next element in the iteration
	 */
	public E next() {
		// TODO implement this method
		return next;
	}

	/**
	 * Removes from the underlying collection the last element returned by the iterator
	 * For the code test, this does not need to be implemented. 
	 */
	public void remove() {
		throw new UnsupportedOperationException();
	}

}



//package codeTest;
//
//import java.util.Collection;
//import java.util.Iterator;
//
///**
// * Implement an iterator that iterates all the elements of a collection of collections
// * @param <E>
// */
//public class CodeTestExerciseCollectionOfCollectionsIterator<E> implements Iterator<E> {
//
//	private Collection<Collection<E>> _collOfColl = null;
//	
//	private Iterator<Collection<E>> outerIterator;
//	private Iterator<E> innerIterator;
//	private E next;
//	
//	
//	/**
//	 * Constructor takes in the collection of collections that should be iterated
//	 * @param collofColl collection of collections
//	 */
//	public CodeTestExerciseCollectionOfCollectionsIterator(Collection<Collection<E>> collofColl) {
//		_collOfColl = collofColl;
//		outerIterator = _collOfColl.iterator();	
//	}
//	
//	/**
//	 * Returns true if the iteration has more elements
//	 */
//	public boolean hasNext() {
//		// TODO implement this method
//		if(outerIterator.hasNext()) {
//			innerIterator = outerIterator.next().iterator();
//			if(innerIterator != null || innerIterator.hasNext()) {
////				next = innerIterator.next();
//				return true;
//			}
//		}
//		return false;
//	}
//
//	/**
//	 * Returns the next element in the iteration
//	 */
//	public E next() {
//		// TODO implement this method
//		if(hasNext()) {
//			E element = next;
//		}
//		return null;
//	}
//
//	/**
//	 * Removes from the underlying collection the last element returned by the iterator
//	 * For the code test, this does not need to be implemented. 
//	 */
//	public void remove() {
//		throw new UnsupportedOperationException();
//	}
//
//}
