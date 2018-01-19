package codeTest;

import java.util.Collection;
import java.util.Iterator;

/**
 * Implement an iterator that iterates all the elements of a collection of collections
 */
public class CodeTestExerciseCollectionOfCollectionsIterator implements Iterator<Object> {

	private Collection<Collection<Object>> _collOfColl = null;
	
	/**
	 * Constructor takes in the collection of collections that should be iterated
	 * @param collofColl collection of collections
	 */
	public CodeTestExerciseCollectionOfCollectionsIterator(Collection<Collection<Object>> collofColl) {
		_collOfColl = collofColl;
	}
	
	/**
	 * Returns true if the iteration has more elements
	 */
	public boolean hasNext() {
		// TODO implement this method
		return false;
	}

	/**
	 * Returns the next element in the iteration
	 */
	public Object next() {
		// TODO implement this method
		return null;
	}

	/**
	 * Removes from the underlying collection the last element returned by the iterator
	 * For the code test, this does not need to be implemented. 
	 */
	public void remove() {
		throw new UnsupportedOperationException();
	}

}
