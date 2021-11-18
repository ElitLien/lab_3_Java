package Task1;

import java.util.ArrayList;
import java.util.List;

public class User {
    String firstName;
    String lastName;
    Address address;
    Sex sex;
    int age;
    String phoneNumber;

    public User(String firstName, String lastName, Address address, Sex sex, int age, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.sex = sex;
        this.age = age;
        this.phoneNumber = phoneNumber;

        validate();
    }

    public void validate() {
        final List<String> list = new ArrayList<>();

        if (firstName.matches(".*\\d+.*") || firstName.matches(".*\\s+.*") || !firstName.matches(".+")){
            list.add("error in firstname");
        }

        if (lastName.matches(".*\\d+.*") || lastName.matches(".*\\s+.*") || !lastName.matches(".+")){
            list.add("error in lastname");
        }

        if (age < 0){
            list.add("error in age");
        }

        if (!phoneNumber.matches(".*\\d+.*") || phoneNumber.matches(".*\\w+.*")){
            list.add("error in phone number");
        }

        if (!list.isEmpty()){
            throw new Exception(list,HttpCode.BAD_REQUEST_400);
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
        validate();
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
        validate();
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
        validate();
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        validate();
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address=" + address +
                ", sex=" + sex +
                ", age=" + age +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
