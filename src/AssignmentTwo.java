
public class AssignmentTwo {
    public static void main(String[] args){
        AssignmentTwo assignment = new AssignmentTwo();
        assignment.partThree();
        assignment.partFourA();
        assignment.partFourB();
        assignment.partFive();
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
        Ride thunderstorm = new Ride("Thunderstorm",false,Bobby,4);
        Visitor Nehemia = new Visitor("Nehemia", "Smith", 25);
        Visitor Jason = new Visitor("Jason", "Lee", 30);
        Visitor Jack = new Visitor("Jack", "Brown", 28);
        Visitor Sharon = new Visitor("Sharon", "Davis", 22);
        Visitor Benny = new Visitor("Benny", "Miller", 35);
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
        Visitor Nehemia = new Visitor("Nehemia", "Smith", 25);
        Visitor Jason = new Visitor("Jason", "Lee", 30);
        Visitor Jack = new Visitor("Jack", "Brown", 25);
        Visitor Sharon = new Visitor("Sharon", "Davis", 35);
        Visitor Benny = new Visitor("Benny", "Miller", 35);
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
        System.out.println("=-=-=-=-=-=Part Five Below=-=-=-=-=-=");
        // Create a new Ride object
        Employee Bobby = new Employee("Zewei","Xia",20,24517199,"operator");
        Ride thunderstorm = new Ride("Thunderstorm",false,Bobby,4);
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
        thunderstorm.addVisitorToQueue(Sharon);
        thunderstorm.addVisitorToQueue(Nehemia);
        thunderstorm.addVisitorToQueue(Benny);
        thunderstorm.addVisitorToQueue(Jason);
        thunderstorm.addVisitorToQueue(Jack);
        thunderstorm.addVisitorToQueue(Emily);
        thunderstorm.addVisitorToQueue(Chris);
        thunderstorm.addVisitorToQueue(Lucy);
        thunderstorm.addVisitorToQueue(Samuel);
        thunderstorm.addVisitorToQueue(Olivia);
        //print all visitors in the queue
        thunderstorm.printQueue();
        //Run on cycle 
        thunderstorm.runOneCycle(Bobby);
        //print the waiting queue after one cycle
        thunderstorm.printQueue();
        //print the history list after one cycle
        thunderstorm.compareAndSort();
        thunderstorm.printRideHistory();
    }

    public void partSix(){
    }

    public void partSeven() {
    }
}
