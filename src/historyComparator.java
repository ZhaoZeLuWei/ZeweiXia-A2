import java.util.Comparator;

public class historyComparator implements Comparator<Visitor> {
    @Override
    public int compare(Visitor a,Visitor b) {
        int compareInt =  Integer.compare(a.getAge(), b.getAge());
        if(compareInt == 0) {
            return a.getEnterTime().compareTo(b.getEnterTime());
        }
        return compareInt;
    }
}
