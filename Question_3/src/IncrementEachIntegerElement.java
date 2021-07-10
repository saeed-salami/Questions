import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IncrementEachIntegerElement {

    public ArrayList<Integer> incrementEachInteger(List<Integer> asList, int incrementNumber) {
        Iterator<Integer> iteratedList = asList.iterator();
        ArrayList<Integer> results = new ArrayList<>();
        while (iteratedList.hasNext()) {
            results.add(iteratedList.next() + incrementNumber);
        }
        return results;
    }
}
