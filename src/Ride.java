import java.util.LinkedList;
import java.util.Queue;
import java.util.Iterator;

public class Ride implements RideInterface {
    private String rideName;
    private boolean isRunning; 
    private Employee employeeInfo;
    private int maxSeat;
    private LinkedList<Visitor> rideHistory = new LinkedList<Visitor>();
    private Queue<Visitor> waitingLine = new LinkedList<Visitor>();

    public Ride(String RideName, boolean IsRunning, Employee EmployeeInfo, int MaxSeat) {
        this.rideName = RideName;
        this.isRunning = IsRunning;
        this.employeeInfo = EmployeeInfo;
        this.maxSeat = MaxSeat;
    }

    public Ride() {
        this.rideName = "NULL-rideName";
        this.isRunning = false;
        this.employeeInfo = new Employee();
        this.maxSeat = 0;
    }

    public String getRideName() {
        return this.rideName;
    }

    public boolean getIsRunning() {
        return this.isRunning;
    }

    public Employee employeeInfo() {
        return this.employeeInfo;
    }

    public int getMaxSeat() {
        return this.maxSeat;
    }

    public void setRideName(String newRideName) {
        if(newRideName != null) {
            this.rideName = newRideName;
        } else {
            throw new IllegalArgumentException("RideName cannot be null");
        }
    }

    public void setRunning(boolean newRuning) {
        if(this.isRunning == newRuning) {
            throw new IllegalArgumentException(String.format("Ride is already %s", newRuning ? "running" : "not running"));
        }
        this.isRunning = newRuning;
    }

    public void setEmployee(Employee newEmployee) {
        if (newEmployee == null) {
            throw new IllegalArgumentException("RideName cannot be null");
        }
        this.employeeInfo = newEmployee;
    }

    public void setMaxSeat(int newMaxSeat) {
        if(newMaxSeat <= 0) {
            throw new IllegalArgumentException("Set seat number must be greater than 0");
        }
        this.maxSeat = newMaxSeat;
    }

    @Override
    public void addVisitorToQueue(Visitor visitor) {
        if(visitor == null) {
            throw new IllegalArgumentException("Please provide a visitor");
        }
        this.waitingLine.add(visitor);
    }

    @Override
    public void removeVisitorFromQueue(){
        if(this.waitingLine.isEmpty()) {
            throw new IllegalArgumentException("No visitor in the queue!");
        }
        this.waitingLine.poll();
    };

    @Override
    public void printQueue(){
        Iterator<Visitor> printQ = this.waitingLine.iterator();
        while(printQ.hasNext()){
            System.out.println(printQ.next());
        }
    };

    @Override
    public void runOneCycle(){
        
    };

    @Override
    public void addVisitorToHistory(){

    };

    @Override
    public void checkVisitorFromHistory(){

    };

    @Override
    public void numberOfVisitors(){

    };

    @Override
    public void printRideHistory(){
        
    };

}