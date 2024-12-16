import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Comparator;

public class historyComparator implements Comparator<Visitor> {
    @Override
    public int compare(Visitor a,Visitor b) {
        //turn thr string time data into local date time type
        String aEnterTime = a.getEnterTime();
        String bEnterTime = b.getEnterTime();
        if(aEnterTime == null || bEnterTime == null) {
            System.out.println("Can't compare null value!");
            throw new IllegalArgumentException("Please check if there is a null value.");
        }
        DateTimeFormatter df = DateTimeFormatter.ofPattern("yyy-MM-dd HH:mm");
        LocalDateTime aET = LocalDateTime.parse(aEnterTime, df);
        LocalDateTime bET = LocalDateTime.parse(bEnterTime, df);
        //firstly compare the enter time
        int enterDateCompare = aET.compareTo(bET);

        //if the enter time is same ,then compare the age of visitor
        if (enterDateCompare != 0) {
            return enterDateCompare;
        }
        //I use the basic compare way
        int ageCompare = 0;
        if(a.getAge() > b.getAge()) {ageCompare = 1;}
        if(a.getAge() < b.getAge()) {ageCompare = -1;}
        return ageCompare;
        //I am lazy , I don't want to sort the Name ;) 
    }
}
