import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class GreaterThan<T> {
    public int greaterThan;

    public GreaterThan(int number) {
        this.greaterThan = number;
    }

    public ArrayList<Integer> greaterThan(List<Integer> asList) {
        return (ArrayList<Integer>) asList.stream().filter(val -> val.intValue() > greaterThan).collect(Collectors.toList());
    }
}
