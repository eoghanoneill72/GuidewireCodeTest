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
	private Iterator<E> innerIterator = null;
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
	 * 
	 */
	
	public boolean hasNext() {
		//if inner iterator null
		if(innerIterator == null) {
			//make an inner iterator from outerIterator
			
			//if the outer iterator has another element 
			if(outerIterator.hasNext()) {
				innerIterator = outerIterator.next().iterator();
			}else {
				// the outer iterator is exhausted
				return false;
			}
		}
		
		if(innerIterator.hasNext()) {
			next = innerIterator.next();
			return true;
		}else {
		//existing inner iterator is exhausted attempt to advance outer iterator
			//if the outer iterator is not exhausted
			if(outerIterator.hasNext()) {
				innerIterator = outerIterator.next().iterator();
				if(innerIterator.hasNext()) {
					next = innerIterator.next();
					return true;
				}else{
					return false;
				}
				
			}else{
			//the outer iterator is exhausted
				return false;
			}
				
		}
		
	}


	/**
	 * Returns the next element in the iteration
	 */
	public E next() {
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
