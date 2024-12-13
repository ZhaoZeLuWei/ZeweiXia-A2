import java.time.LocalDateTime;

public class AssignmentTwo {
    public static void main(String[] args){
        AssignmentTwo assignment = new AssignmentTwo();
        assignment.partThree();
        assignment.partFourA();
    }

    public void partThree(){
        System.out.println("=-=-=-=-=-=Part Three Below=-=-=-=-=-=");
        Employee Bob = new Employee("Zewei","Xia",20,24517199,"operator");
        Ride rollerCoaster = new Ride("Roller Coaster",false,Bob,2);
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
        rollerCoaster.removeVisitorFromQueue(Jack);
        rollerCoaster.printQueue();
        
    }

    public void partFourA(){
        System.out.println("=-=-=-=-=-=Part Four A Below=-=-=-=-=-=");
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
        thunderstorm.addVisitorToHistory();
        thunderstorm.addVisitorToHistory();
        thunderstorm.addVisitorToHistory();
        thunderstorm.addVisitorToHistory();
        thunderstorm.addVisitorToHistory();
        thunderstorm.checkVisitorFromHistory(Sharon);
        thunderstorm.printRideHistory();
    }

    public void partFourB(){
    }

    public void partFive(){
    }

    public void partSix(){
    }

    public void partSeven() {
    }
}
