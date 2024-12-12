public class Employee extends Person {
    private int employeeID;
    private String position;
    
    public Employee(String FirstName, String LastName, int Age, int EmployeeID, String Position) {
        super(FirstName, LastName, Age);
        this.employeeID = EmployeeID;
        this.position = Position;
    }

    public Employee() {
        super();
        this.employeeID = 0;
        this.position = "NULL-position";
    }

    public int getEmployeeID() {
        return this.employeeID;
    }

    public String getPosition() {
        return this.position;
    }

    public void setEmployeeID(int newId) {
        if(newId == 0){
            throw new IllegalArgumentException("Input new employee id can't be 0!");
        }
        if(newId < 0 || newId > 99999) {
            throw new IllegalArgumentException("Input id out of range!");
        }
        this.employeeID = newId;
        System.out.printf("Employee id set to: %d",newId);
    }

    public void setPosition(String newPosition) {
        if(newPosition == null) {
            throw new IllegalArgumentException("Input employee position can't be NULL!");
        }
        int strLength = newPosition.length();
        if(strLength < 1 || strLength > 50) {
            throw new IllegalArgumentException("Input string range 1-50");
        }
        this.position = newPosition;
        System.out.printf("Employee position set to: %s",newPosition);
    } 

    @Override
    public void selfIntroduce() {
        System.out.printf("Name: %s",this.getName());
        System.out.printf("Age: %d",this.getAge());
        System.out.printf("Employee ID: %d",this.employeeID);
        System.out.printf("Position: %s",this.position);
    }
}
