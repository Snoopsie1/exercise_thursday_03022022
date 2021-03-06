package facade;

import java.util.ArrayList;
import java.util.List;

public class User
{
    private String firstName;
    private String lastName;
    private String password;
    private String phoneNumber;
    private String address;

    //Constructor for getting names
    public User(String firstName, String lastName)
    {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    //Constructor for getting all details
    public User(String firstName, String lastName, String password, String phoneNumber, String address)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    @Override
    public String toString()
    {
        return  firstName + " " + lastName + " " + password + " " + phoneNumber + " " + address;
    }

    public String getFullName()
    {
        return this.firstName + " " + this.lastName;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

    public String getPhoneNumber()
    {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber)
    {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress()
    {
        return address;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }
}
