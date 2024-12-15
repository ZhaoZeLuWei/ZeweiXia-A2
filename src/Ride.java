import java.io.IOException;
import java.time.LocalDateTime;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Iterator;
import java.util.Collections;
import java.io.*;

public class Ride implements RideInterface {
    private String rideName;
    private boolean isRunning; 
    private Employee employeeInfo;
    private int maxSeat;
    private int numOfCycles = 0;
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

    public LinkedList<Visitor> getRideHistory() {
        return this.rideHistory;
    }

    public Queue<Visitor> getWaitingLine() {
        return this.waitingLine;
    }

    public int getNumberOfCycles() {
        return this.numOfCycles;
    }

    public void setRideName(String newRideName) {
        //检查是否为空
        if(newRideName == null) {
            System.out.println("Ride name cannot be null!");
            throw new IllegalArgumentException("RideName cannot be null");
        }
        this.rideName = newRideName;
        System.out.printf("Set new ride name:%s success!\n", newRideName);
    }

    public void setRunning(boolean newRuning) {
        //检查是否为空
        if(this.isRunning == newRuning) {
            throw new IllegalArgumentException(String.format("Ride is already %s", newRuning ? "running" : "not running"));
        }
        this.isRunning = newRuning;
    }

    public void setEmployee(Employee newEmployee) {
        //检查是否为空
        if (newEmployee == null) {
            throw new IllegalArgumentException("RideName cannot be null");
        }
        this.employeeInfo = newEmployee;
    }

    public void setMaxSeat(int newMaxSeat) {
        //检查传入参数合法性
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
        visitor.setEnterTime(LocalDateTime.now());
        System.out.printf("\nVisitor: %s add into Waiting Queue success!\n", visitor.getName());
    }

    //Part3 remove a visitor from the waiting queue(if they want to join the line or not)
    //作业文件说，队列中的人可以自行决定是否退出队伍。与加入到历史记录不同，这里是自行决定
    //也就是说，这里需要删除指定的目标，而不是先进先出的顺序删除
    @Override
    public void removeVisitorFromQueue(Visitor v){
        boolean found = false;
        //检查等待队列中是否有人在等待
        if(this.waitingLine.isEmpty()) {
            System.out.println("No visitor is in the waiting line! Can't remove.");
            throw new IllegalArgumentException("No visitor in the queue!");
        }
        //使用for-each循环，如果找到目标就删除
        for (Visitor visitor : this.waitingLine) {
            if(visitor.equals(v)) {
                this.waitingLine.remove(v);
                System.out.printf("Visitor: %s remove form Queue success!\n",v.getName());
                found = true;
                return;
            }
        }
        //经过遍历循环后未找到对象，输出错误信息
        if(!found) {
            System.out.printf("Not found this visitor: %s in the waiting line.\n", v.getName());
        }  
    };

    //Part3 print the waiting queue
    @Override
    public void printQueue(){
        Iterator<Visitor> printQ = this.waitingLine.iterator();
        //检查队列是否为空
        if(this.waitingLine.isEmpty()) {
            System.out.println("No visitor is in the waiting line!");
            return;
        }
        //使用迭代器遍历队列
        System.out.println("The following visitors are showing below.\n");
        while(printQ.hasNext()){
            Visitor getV = printQ.next();
            getV.selfIntroduce();
            System.out.println("\n");
        }
    };


    //Part5 Run a ride cycle
    @Override
    public void runOneCycle(Employee e){
        //没有设置最大座位数，输出信息
        if(this.maxSeat <= 0) {
            System.out.println("This ride is unavaliable to run due to no seat.");
            return;
        }
        //检查是否有员工可以进行操作
        if(e == null) {
            System.out.println("Need assigned a ride operator to run the ride.");
            return;
        }
        //检查是否有人正在排队等待
        if(this.waitingLine.isEmpty()) {
            System.out.println("No visitor is waiting. Can't run this ride.");
            return;
        }
        //查看队列中的具体情况并处理
        int waitingTotal = this.waitingLine.size();
        //如果队列很长，每次按照最大人数处理
        if(waitingTotal >= this.maxSeat) {
            for(int i = 0; i< this.maxSeat; i++) {
                try {
                    addVisitorToHistory();
                } catch (Exception Except) {
                    System.out.println("Fall to add visitor into history list." + Except.getMessage());
                    break;
                }
            }
            System.out.printf("Run one cycle with max seat: %d visitors.", this.maxSeat);
        }
        //如果队列人数小于最大人数，则根据实际人数进行遍历
        else {
            for(int i = 0; i < waitingTotal; i++) {
                try {
                    addVisitorToHistory();
                } catch (Exception Except) {
                    System.out.println("Fall to add visitor into history list." + Except.getMessage());
                    break;
                }
            }
            System.out.printf("Run one cycle with %d visitors.\n", waitingTotal);
        }
        //成功运行结束后增加一次运行记录
        this.numOfCycles++;
    };

    //Part4A add a visitor to the ride history list
    @Override
    public void addVisitorToHistory(){
        //检查等待队列是否为空
        if(this.waitingLine.isEmpty()) {
            System.out.println("No visitor is waiting.");
            throw new IllegalArgumentException("No visitor in the queue!");
        }
        //将等待队列中的第一个人加入到历史记录中,并移出等待队列
        Visitor addHistory = this.waitingLine.poll();
        LocalDateTime exitTime = LocalDateTime.now().plusMinutes(10);
        this.rideHistory.add(addHistory);
        addHistory.setExitTime(exitTime);
        System.out.printf("\nAdd a visitor: %s to the ride history list SUCCESS!\n", addHistory.getName());
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
        System.out.printf("Today's visitor total number is: %d", this.rideHistory.size());
    };

    //part4A print the ride history one by one <USE Iterator>
    @Override
    public void printRideHistory(){
        //如果没有访客在历史记录中，直接输出特殊情况的信息
        if(this.rideHistory.isEmpty()) {
            System.out.println("No visitor in the ride history.");
            return;
        }
        //遍历输出
        Iterator<Visitor> forPrint = this.rideHistory.iterator();
        System.out.println("\nRide History:\n");
        while(forPrint.hasNext()) {
            Visitor v = forPrint.next();
            v.selfIntroduce();
            System.out.println("\n");
        }
    };

    //Part4B sort the list by compare Age & Enter time
    public void compareAndSort() {
        //检查是否为空
        if(this.rideHistory.isEmpty()) {
            System.out.println("No visitor in the ride history.");
            throw new IllegalArgumentException("No visitor in the queue!");
        }
        Collections.sort(this.rideHistory, new historyComparator());
    }

    //Part6 Writing to a file
    public void exportRideHistory() throws IOException {
        this.compareAndSort();
        String fileName = this.rideName + "HistoryList.csv";
        try(BufferedWriter bfw = new BufferedWriter(new FileWriter(fileName))) {
            for(Visitor v: this.rideHistory) {
                bfw.write(v.getName() + "," + v.getAge() + "," + v.getEnterTime() + "," + v.getExitTime() + "\n");
                System.out.printf("\nWrite %s to the file success!",v.getName());
            }
            System.out.println("Problem writing to the file" + fileName);
            throw e;
        }
    }
}