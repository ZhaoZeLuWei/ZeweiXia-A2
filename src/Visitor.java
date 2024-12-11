import java.time.LocalDateTime;

public class Visitor extends Person {
    private LocalDateTime enterTime;
    private LocalDateTime exitTime;

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

    public LocalDateTime getEnterTime() {
        return this.enterTime;
    }

    public LocalDateTime getExitTime() {
        return this.exitTime;
    }

    public void setEnterTime(LocalDateTime newEnterTime) {
        if(newEnterTime == null) {
            throw new IllegalArgumentException("Can't enter a null value");
        }
        if(newEnterTime.isAfter(LocalDateTime.now())) {
            throw new IllegalArgumentException("Cannot enter future time");
        }
        this.enterTime = newEnterTime;
        System.out.printf("New enter time set: " + newEnterTime);
    }

    public void setExitTime(LocalDateTime newExitTime) {
        if(newExitTime == null) {
            throw new IllegalArgumentException("Can't enter a null value");
        }
        this.exitTime = newExitTime;
        System.out.printf("New exit time set: " + newExitTime);
    }

}
