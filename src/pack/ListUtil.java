package pack;

import java.util.ArrayList;
import java.util.List;

/**
 *  Count the number of distinct elements in a list.
 * @author Korawit Rupanya
 *
 */
public class ListUtil {
	 /**
     * Count the number of distinct elements in a list.
     * The list may be empty but not null.
     * TODO: can the list contain null values? Does null count as a unique element?
     *
     * @param list a list of elements
     * @return the number of distinct elements in list
     */
    public static int countUnique(List<?> list) {
    	List<Object> tmp = new ArrayList<>();
    	
    	for(int i = 0 ; i <list.size();i++) {
    		if(!tmp.contains(list.get(i))) {
    			tmp.add(list.get(i));
    		}
    	}
		return tmp.size() ;	
    }
}