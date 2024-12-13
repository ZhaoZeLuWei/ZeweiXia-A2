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

    // Getter and Setter
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
            System.out.printf("Set new ride name:%s success!\n", newRideName);
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

    //Part3 Add a visitor into the waiting queue
    @Override
    public void addVisitorToQueue(Visitor visitor) {
        if(visitor == null) {
            System.out.println("Visitor is null , please check the input object value");
            throw new IllegalArgumentException("Please provide a visitor");
        }
        this.waitingLine.add(visitor);
        System.out.printf("Visitor: %s add into Waiting Queue success!\n", visitor.getName());
    }

    //Part3 remove a visitor from the waiting queue(if they want to join the line or not)
    @Override
    public void removeVisitorFromQueue(Visitor v){
        boolean found = false;
        if(this.waitingLine.isEmpty()) {
            System.out.println("No visitor is in the waiting line! Can't remove.");
            throw new IllegalArgumentException("No visitor in the queue!");
        }
        for (Visitor visitor : this.waitingLine) {
            if(visitor.equals(v)) {
                this.waitingLine.remove(v);
                System.out.printf("Visitor: %s remove form Queue success!\n",v.getName());
                found = true;
                return;
            }
        }
        if(!found) {
            System.out.printf("Not found this visitor: %s in the waiting line.\n", v.getName());
        }  
    };

    //Part3 print the waiting queue
    @Override
    public void printQueue(){
        Iterator<Visitor> printQ = this.waitingLine.iterator();
        if(this.waitingLine.isEmpty()) {
            System.out.println("No visitor is in the waiting line!");
            return;
        }
        System.out.println("The following visitors are showing below.\n");
        while(printQ.hasNext()){
            Visitor getV = printQ.next();
            getV.selfIntroduce();
            System.out.println("\n");
        }
    };

    @Override
    public void runOneCycle(){
        
    };

    //Part4A add a visitor to the ride history list
    @Override
    public void addVisitorToHistory(){
        if(this.waitingLine.isEmpty()) {
            System.out.println("No visitor is waiting.");
            throw new IllegalArgumentException("No visitor in the queue!");
        }
        Visitor addHistory = this.waitingLine.poll();
        this.rideHistory.add(addHistory);
        System.out.printf("Add a visitor: %s to the ride history list SUCCESS!\n", addHistory.getName());
    };

    //Part4A check a visiter is in the ride history or not
    @Override
    public void checkVisitorFromHistory(Visitor checkVisitor){
        boolean found = false;
        if(this.rideHistory.isEmpty()) {
            System.out.println("Empty list, no need to check.");
            throw new IllegalArgumentException("No visitor in the queue!");
        }
        for(Visitor v : this.rideHistory) {
            //I use v == checkVisitor to check two object is the same or not is a wrong way
            //Use equals() to check is the correct way
            if (v.equals(checkVisitor)) {
                System.out.printf("Visitor: %s is already in the ride history.\n", checkVisitor.getName());
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.printf("Visitor: %s is not in the ride history.\n", checkVisitor.getName());
        }
    };

    //Part4A return the length of the list
    @Override
    public void numberOfVisitors(){
        System.out.println(this.rideHistory.size());
    };

    //part4A print the ride history one by one <USE Iterator>
    @Override
    public void printRideHistory(){
        Iterator<Visitor> forPrint = this.rideHistory.iterator();
        System.out.println("Ride History:\n");
        while(forPrint.hasNext()) {
            Visitor v = forPrint.next();
            v.selfIntroduce();
            System.out.println("\n");
        }
    };

}