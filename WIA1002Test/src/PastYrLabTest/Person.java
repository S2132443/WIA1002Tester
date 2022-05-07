package PastYrLabTest;

/*Create another “Person” class to store information about contact person and
employees, including name and contact number. Contact number can be null. 
*/
public class Person {

    String contactPerson;
    String contactNumber;

    public Person(String contactPerson, String contactNumber) {
        this.contactPerson = contactPerson;
        this.contactNumber = contactNumber;
    }

    public String getContactPerson() {
        return contactPerson;
    }

    public String getContactNumber() {
        return contactNumber;
    }

}
