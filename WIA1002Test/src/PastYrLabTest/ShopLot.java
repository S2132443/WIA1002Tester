package PastYrLabTest;

public class ShopLot {
    
    /* Create a class named “ShopLot”. It should have information including the shop name,
    contact person, and all employee’s detail.*/

    String shopName;
    Person contactPerson;
    Person [] employee;

    public ShopLot(String shopName, Person contactPerson, Person [] employee) {
        this.shopName = shopName;
        this.contactPerson = contactPerson;
        this.employee = employee;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public Person getContactPerson() {
        return contactPerson;
    }

    public Person [] getEmployee() {
        return employee;
    }

    public String printShopName() {
        return "shopName=" + getShopName();
    }

    public String printContactPerson() {
        return "contact=Person{name=" + getContactPerson().contactPerson +
                ", contactNo=" + getContactPerson().contactNumber + "}";
    }

    public StringBuilder printEmployee() {
        StringBuilder result = new StringBuilder("employees=[");
        for (int i = 0; i < getEmployee().length; i++) {
            result.append("Person{name=").append(getEmployee()[i].getContactPerson()).append(", ").append("contactNo=").append(getEmployee()[i].getContactNumber()).append("}, ");
        }
        result.replace(result.length()-2,result.length(),"");
        result.append("]");
        return result;
    }
}
