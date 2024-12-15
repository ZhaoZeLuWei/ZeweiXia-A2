import java.time.LocalDateTime;

public class AssignmentTwo {
    public static void main(String[] args){
        AssignmentTwo assignment = new AssignmentTwo();
        assignment.partThree();
        assignment.partFourA();
        assignment.partFourB();
    }

    public void partThree(){
        System.out.println("=-=-=-=-=-=Part Three Below=-=-=-=-=-=");
        //Create an employee and Ride object
        Employee Bob = new Employee("Zewei","Xia",20,24517199,"operator");
        Ride rollerCoaster = new Ride("Roller Coaster",false,Bob,2);
        //Create a minimum of 5 visitors to the waiting queue
        Visitor Nehemia = new Visitor("Nehemia", "Smith", 25, LocalDateTime.of(2024, 12, 13, 9, 0), LocalDateTime.of(2024, 12, 13, 17, 0));
        Visitor Jason = new Visitor("Jason", "Lee", 30, LocalDateTime.of(2024, 12, 13, 10, 15), LocalDateTime.of(2024, 12, 13, 15, 30));
        Visitor Jack = new Visitor("Jack", "Brown", 28, LocalDateTime.of(2024, 12, 13, 11, 0), LocalDateTime.of(2024, 12, 13, 18, 0));
        Visitor Sharon = new Visitor("Sharon", "Davis", 22, LocalDateTime.of(2024, 12, 13, 8, 45), LocalDateTime.of(2024, 12, 13, 14, 0));
        Visitor Benny = new Visitor("Benny", "Miller", 35, LocalDateTime.of(2024, 12, 13, 9, 30), LocalDateTime.of(2024, 12, 13, 16, 45));
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
        Ride thunderstorm = new Ride("Thunderstorm",false,Bobby,4);
        Visitor Nehemia = new Visitor("Nehemia", "Smith", 25, LocalDateTime.of(2024, 12, 13, 9, 0), LocalDateTime.of(2024, 12, 13, 17, 0));
        Visitor Jason = new Visitor("Jason", "Lee", 30, LocalDateTime.of(2024, 12, 13, 10, 15), LocalDateTime.of(2024, 12, 13, 15, 30));
        Visitor Jack = new Visitor("Jack", "Brown", 28, LocalDateTime.of(2024, 12, 13, 11, 0), LocalDateTime.of(2024, 12, 13, 18, 0));
        Visitor Sharon = new Visitor("Sharon", "Davis", 22, LocalDateTime.of(2024, 12, 13, 8, 45), LocalDateTime.of(2024, 12, 13, 14, 0));
        Visitor Benny = new Visitor("Benny", "Miller", 35, LocalDateTime.of(2024, 12, 13, 9, 30), LocalDateTime.of(2024, 12, 13, 16, 45));
        thunderstorm.addVisitorToQueue(Nehemia);
        thunderstorm.addVisitorToQueue(Jason);
        thunderstorm.addVisitorToQueue(Jack);
        thunderstorm.addVisitorToQueue(Sharon);
        thunderstorm.addVisitorToQueue(Benny);
        //add a minimun of 5 visitors to the history list
        thunderstorm.addVisitorToHistory();
        thunderstorm.addVisitorToHistory();
        thunderstorm.addVisitorToHistory();
        thunderstorm.addVisitorToHistory();
        thunderstorm.addVisitorToHistory();
        //Check visitor Sharon is in the history list or not
        thunderstorm.checkVisitorFromHistory(Sharon);
        //print the number of visitors in the history list
        thunderstorm.numberOfVisitors();
        //print all visitors in the collection
        thunderstorm.printRideHistory();
    }

    public void partFourB(){
        System.out.println("=-=-=-=-=-=Part Four B Below=-=-=-=-=-=");
        // Create a new Ride object
        Employee Bobby = new Employee("Zewei","Xia",20,24517199,"operator");
        Ride thunderstorm = new Ride("Thunderstorm",false,Bobby,4);
        Visitor Nehemia = new Visitor("Nehemia", "Smith", 25, LocalDateTime.of(2024, 12, 13, 9, 0), LocalDateTime.of(2024, 12, 13, 9, 30));
        Visitor Jason = new Visitor("Jason", "Lee", 30, LocalDateTime.of(2024, 12, 13, 10, 15), LocalDateTime.of(2024, 12, 13, 10, 45));
        Visitor Jack = new Visitor("Jack", "Brown", 25, LocalDateTime.of(2024, 12, 13, 11, 0), LocalDateTime.of(2024, 12, 13, 11, 30));
        Visitor Sharon = new Visitor("Sharon", "Davis", 35, LocalDateTime.of(2024, 12, 13, 8, 45), LocalDateTime.of(2024, 12, 13, 9, 45));
        Visitor Benny = new Visitor("Benny", "Miller", 35, LocalDateTime.of(2024, 12, 13, 9, 30), LocalDateTime.of(2024, 12, 13, 10, 0));
        thunderstorm.addVisitorToQueue(Nehemia);
        thunderstorm.addVisitorToQueue(Jason);
        thunderstorm.addVisitorToQueue(Jack);
        thunderstorm.addVisitorToQueue(Sharon);
        thunderstorm.addVisitorToQueue(Benny);
        //add a minimum of 5 visitors to the history list
        thunderstorm.addVisitorToHistory();
        thunderstorm.addVisitorToHistory();
        thunderstorm.addVisitorToHistory();
        thunderstorm.addVisitorToHistory();
        thunderstorm.addVisitorToHistory();
        //print all visitors in the collcetion (befor sorting)
        System.out.println("The history list before sorting:\n");
        thunderstorm.printRideHistory();
        //Sort the collection by Age firstly and the by enter time
        thunderstorm.compareAndSort();
        //print all visitors in the collcetion (after been sorted)
        System.out.println("The history list after sorting:\n");
        thunderstorm.printRideHistory();
    }

    public void partFive(){
    }

    public void partSix(){
    }

    public void partSeven() {
    }
}
