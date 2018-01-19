package codeTest;

import java.util.*;

public class CodeTestCollectionOfCollectionsIteratorTrial {

	public static void main(String[] args) {
		
		List<List<String>> nestedList = new ArrayList<List<String>>();
		
	    List<String> tempList = new ArrayList<String>();
	    tempList.add("a");
	    tempList.add("b");
	    nestedList.add(tempList);
	    
	    tempList = new ArrayList<String>();
	    tempList.add("c");
	    nestedList.add(tempList);
	    
	    tempList = new ArrayList<String>();
	    tempList.add("d");
	    tempList.add("e");
	    tempList.add("f");
	    nestedList.add(tempList);
	    
	    System.out.println(nestedList);

	    @SuppressWarnings("rawtypes")
		CodeTestExerciseCollectionOfCollectionsIterator nestedCollection = new CodeTestExerciseCollectionOfCollectionsIterator(nestedList);

	    while(nestedCollection.hasNext()){
	        System.out.println(nestedCollection.next());
	    }
	    
	}

}
