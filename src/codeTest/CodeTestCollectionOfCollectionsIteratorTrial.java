package codeTest;

import java.util.*;

public class CodeTestCollectionOfCollectionsIteratorTrial {

	public static void main(String[] args) {
		
		List<List<String>> Nestedlist = new ArrayList<List<String>>();
	    List<String> l = new ArrayList<String>();
	    l.add("1");
	    l.add("2");
	    Nestedlist.add(l);
	    l = new ArrayList<String>();
	    l.add("3");
	    l.add("4");
	    Nestedlist.add(l);
	    l = new ArrayList<String>();
	    l.add("5");
	    l.add("6");
	    Nestedlist.add(l);
	    
	    System.out.println(Nestedlist);

	    @SuppressWarnings("rawtypes")
		CodeTestExerciseCollectionOfCollectionsIterator cc = new CodeTestExerciseCollectionOfCollectionsIterator(Nestedlist);

	    while(cc.hasNext()){
	        System.out.println(cc.next());
	    }

		
	}

}
