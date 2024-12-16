import java.io.*;
public class AssignmentTwo {
    public static void main(String[] args) throws IOException{
        AssignmentTwo assignment = new AssignmentTwo();
        assignment.partThree();
        assignment.partFourA();
        assignment.partFourB();
        assignment.partFive();
        assignment.partSix();
        assignment.partSeven();
    }

    public void partThree(){
        System.out.println("=-=-=-=-=-=Part Three Below=-=-=-=-=-=");
        //Create an employee and Ride object
        Employee Bob = new Employee("Zewei","Xia",20,24517199,"operator");
        Ride rollerCoaster = new Ride("Roller Coaster",false,Bob,2);
        //Create a minimum of 5 visitors to the waiting queue
        Visitor Nehemia = new Visitor("Nehemia", "Smith", 25 );
        Visitor Jason = new Visitor("Jason", "Lee", 30);
        Visitor Jack = new Visitor("Jack", "Brown", 28);
        Visitor Sharon = new Visitor("Sharon", "Davis", 22);
        Visitor Benny = new Visitor("Benny", "Miller", 35);
        rollerCoaster.addVisitorToQueue(Nehemia);
        rollerCoaster.addVisitorToQueue(Jason);
        rollerCoaster.addVisitorToQueue(Jack);
        rollerCoaster.addVisitorToQueue(Sharon);
        rollerCoaster.addVisitorToQueue(Benny);
        //remove Jack from the waiting queue
        rollerCoaster.removeVisitorFromQueue(Jack);
        //print all visitors in the queue
        rollerCoaster.printQueue();
        
    }

    public void partFourA(){
        System.out.println("=-=-=-=-=-=Part Four A Below=-=-=-=-=-=");
        //Create an employee and Ride object
        Employee Bobby = new Employee("Zewei","Xia",20,24517199,"operator");
        Ride thunderstormPart4A = new Ride("ThunderstormPart4A",false,Bobby,4);
        Visitor Nehemia = new Visitor("Nehemia", "Smith", 25);
        Visitor Jason = new Visitor("Jason", "Lee", 30);
        Visitor Jack = new Visitor("Jack", "Brown", 28);
        Visitor Sharon = new Visitor("Sharon", "Davis", 22);
        Visitor Benny = new Visitor("Benny", "Miller", 35);
        thunderstormPart4A.addVisitorToQueue(Nehemia);
        thunderstormPart4A.addVisitorToQueue(Jason);
        thunderstormPart4A.addVisitorToQueue(Jack);
        thunderstormPart4A.addVisitorToQueue(Sharon);
        thunderstormPart4A.addVisitorToQueue(Benny);
        //add a minimun of 5 visitors to the history list
        thunderstormPart4A.addVisitorToHistory();
        thunderstormPart4A.addVisitorToHistory();
        thunderstormPart4A.addVisitorToHistory();
        thunderstormPart4A.addVisitorToHistory();
        thunderstormPart4A.addVisitorToHistory();
        //Check visitor Sharon is in the history list or not
        thunderstormPart4A.checkVisitorFromHistory(Sharon);
        //print the number of visitors in the history list
        thunderstormPart4A.numberOfVisitors();
        //print all visitors in the collection
        thunderstormPart4A.printRideHistory();
    }

    public void partFourB(){
        System.out.println("=-=-=-=-=-=Part Four B Below=-=-=-=-=-=");
        // Create a new Ride object
        Employee Bobby = new Employee("Zewei","Xia",20,24517199,"operator");
        Ride thunderstormPart4B = new Ride("ThunderstormPart4B",false,Bobby,4);
        Visitor Nehemia = new Visitor("Nehemia", "Smith", 25);
        Visitor Jason = new Visitor("Jason", "Lee", 30);
        Visitor Jack = new Visitor("Jack", "Brown", 25);
        Visitor Sharon = new Visitor("Sharon", "Davis", 35);
        Visitor Benny = new Visitor("Benny", "Miller", 35);
        thunderstormPart4B.addVisitorToQueue(Nehemia);
        thunderstormPart4B.addVisitorToQueue(Jason);
        thunderstormPart4B.addVisitorToQueue(Jack);
        thunderstormPart4B.addVisitorToQueue(Sharon);
        thunderstormPart4B.addVisitorToQueue(Benny);
        //add a minimum of 5 visitors to the history list
        thunderstormPart4B.addVisitorToHistory();
        thunderstormPart4B.addVisitorToHistory();
        thunderstormPart4B.addVisitorToHistory();
        thunderstormPart4B.addVisitorToHistory();
        thunderstormPart4B.addVisitorToHistory();
        //print all visitors in the collcetion (befor sorting)
        System.out.println("The history list before sorting:\n");
        thunderstormPart4B.printRideHistory();
        //Sort the collection by Age firstly and the by enter time
        thunderstormPart4B.compareAndSort();
        //print all visitors in the collcetion (after been sorted)
        System.out.println("The history list after sorting:\n");
        thunderstormPart4B.printRideHistory();
    }

    public void partFive(){
        System.out.println("=-=-=-=-=-=Part Five Below=-=-=-=-=-=");
        // Create a new Ride object
        Employee Bobby = new Employee("Zewei","Xia",20,24517199,"operator");
        Ride thunderstormPart5 = new Ride("ThunderstormPart5",false,Bobby,4);
        // The data creation with the help of AI tools
        Visitor Sharon = new Visitor("Sharon", "Davis", 35);
        Visitor Nehemia = new Visitor("Nehemia", "Smith", 25);
        Visitor Benny = new Visitor("Benny", "Miller", 35);
        Visitor Jason = new Visitor("Jason", "Lee", 30);
        Visitor Jack = new Visitor("Jack", "Brown", 25);
        Visitor Emily = new Visitor("Emily", "Taylor", 25);
        Visitor Chris = new Visitor("Chris", "Wilson", 22);
        Visitor Lucy = new Visitor("Lucy", "Johnson", 28);
        Visitor Samuel = new Visitor("Samuel", "Anderson", 35);
        Visitor Olivia = new Visitor("Olivia", "Martinez", 27);
        thunderstormPart5.addVisitorToQueue(Sharon);
        thunderstormPart5.addVisitorToQueue(Nehemia);
        thunderstormPart5.addVisitorToQueue(Benny);
        thunderstormPart5.addVisitorToQueue(Jason);
        thunderstormPart5.addVisitorToQueue(Jack);
        thunderstormPart5.addVisitorToQueue(Emily);
        thunderstormPart5.addVisitorToQueue(Chris);
        thunderstormPart5.addVisitorToQueue(Lucy);
        thunderstormPart5.addVisitorToQueue(Samuel);
        thunderstormPart5.addVisitorToQueue(Olivia);
        //print all visitors in the queue
        thunderstormPart5.printQueue();
        //Run on cycle 
        thunderstormPart5.runOneCycle(Bobby);
        //print the waiting queue after one cycle
        thunderstormPart5.printQueue();
        //print the history list after one cycle
        thunderstormPart5.compareAndSort();
        thunderstormPart5.printRideHistory();
    }

    public void partSix() throws IOException{
        System.out.println("=-=-=-=-=-=Part Six Below=-=-=-=-=-=");
        // Create a new Ride object
        Employee Bobby = new Employee("Zewei","Xia",20,24517199,"operator");
        Ride thunderstormPart6 = new Ride("ThunderstormPart6",false,Bobby,4);
        Visitor Sharon = new Visitor("Sharon", "Davis", 35);
        Visitor Nehemia = new Visitor("Nehemia", "Smith", 25);
        Visitor Benny = new Visitor("Benny", "Miller", 35);
        Visitor Jason = new Visitor("Jason", "Lee", 30);
        Visitor Jack = new Visitor("Jack", "Brown", 25);
        thunderstormPart6.addVisitorToQueue(Sharon);
        thunderstormPart6.addVisitorToQueue(Nehemia);
        thunderstormPart6.addVisitorToQueue(Benny);
        thunderstormPart6.addVisitorToQueue(Jason);
        thunderstormPart6.addVisitorToQueue(Jack);
        //let all visitors to ride the ride
        thunderstormPart6.runOneCycle(Bobby);
        thunderstormPart6.runOneCycle(Bobby);
        //Export the ride history into a csv file
        thunderstormPart6.exportRideHistory();
    }

    public void partSeven() throws IOException {
        System.out.println("\n=-=-=-=-=-=Part Seven Below=-=-=-=-=-=\n");
        // Create a new Ride object
        Employee Bobby = new Employee("Zewei","Xia",20,24517199,"operator");
        Ride thunderstormPart7 = new Ride("ThunderstormPart7",false,Bobby,4);
        thunderstormPart7.importRideHistory("ThunderstormPart6HistoryList.csv");
        thunderstormPart7.numberOfVisitors();
        thunderstormPart7.printRideHistory();
    }
}
