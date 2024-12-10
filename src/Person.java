public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public Person(String FirstName, String LastName, int Age) {
        this.firstName = FirstName;
        this.lastName = LastName;
        this.age = Age;
    }

    public Person() {
        this.firstName = "NULL-FirstName";
        this.lastName = "NULL-LastName";
        this.age = 0;
    }

    public String getName(){
        return this.firstName + " " + this.lastName;
    }

    public int getAge(){
        return this.age;
    }
    
    public void setFirstName(String newFirstName) {
        if (newFirstName == null) {
            throw new IllegalArgumentException("Name can't be NULL!");
        }
        if (newFirstName.length() < 2 || newFirstName.length() > 30) {
            throw new IllegalArgumentException("input first name is at a range of 2 - 30!");
        }
        this.firstName = newFirstName;
        System.out.printf("Your first name: %s set success!", newFirstName);
    }
    
    public void setLastName(String newLastName) {
        if (newLastName == null) {
            throw new IllegalArgumentException("Name can't be NULL!");
        }
        if (newLastName.length() < 2 || newLastName.length() > 30) {
            throw new IllegalArgumentException("input last name is at a range of 2 - 30!");
        }
        this.lastName = newLastName;
        System.out.printf("Your last name: %s set success!", newLastName);
    }

    public void setAge(int newAge) {
        if (newAge <= 0 || newAge >100) {
            throw new IllegalArgumentException("Age out of range!");
        }
        this.age = newAge;
        System.out.printf("Changing age into: %d", newAge);
    }  
}
