import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Visitor extends Person {
    private LocalDateTime enterTime;
    private LocalDateTime exitTime;
    private boolean isInPark = false;
    public static DateTimeFormatter DF = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");

    public Visitor(String FirstName,String LastName,int Age,LocalDateTime enterTime,LocalDateTime exitTime) {
        super(FirstName, LastName, Age);
        this.enterTime = enterTime;
        this.exitTime = exitTime;
    } 

    public Visitor() {
        super();
        this.enterTime = null;
        this.exitTime = null;
    }

    public String getEnterTime() {
        return this.enterTime.format(DF);
    }

    public String getExitTime() {
        return this.exitTime.format(DF);
    }

    public boolean getIsInPark() {
        return this.isInPark;
    }

    public void setEnterTime(LocalDateTime newEnterTime) {
        if(newEnterTime == null) {
            throw new IllegalArgumentException("Can't enter a null value");
        }
        if(newEnterTime.isAfter(LocalDateTime.now())) {
            throw new IllegalArgumentException("Cannot enter future time");
        }
        this.enterTime = newEnterTime;
        this.isInPark = true;
        System.out.printf("New enter time set: " + newEnterTime);
    }

    public void setExitTime(LocalDateTime newExitTime) {
        if(newExitTime == null) {
            throw new IllegalArgumentException("Can't enter a null value");
        }
        if (newExitTime.isAfter(this.enterTime)) {
            throw new IllegalArgumentException("Exit time cannot be before enter time");
        }
        this.exitTime = newExitTime;
        this.isInPark = false;
        System.out.printf("New exit time set: " + newExitTime);
    }

    @Override
    public void selfIntroduce() {
        System.out.printf("Name: %s\t ",this.getName());
        System.out.printf("Age: %d\t ",this.getAge());
        System.out.printf("Enter Time: %s\t ",DF.format(this.enterTime));
        if(!this.isInPark) {
            System.out.printf("Exit Time: %s\t ",DF.format(this.exitTime));
        }
    }    
}
