package Businness;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Emilio
 */
public class Member
{
    private String memberNumber;
    private String firstName;
    private String LastName;
    private String password;
    private String isTeamOrganiser;
    private String teamName;
    private String  phone;
    private String email;
    private String joinDate;
    private String address;
    private String  DateOfBirth;
    private List<Booking> bookings; 

    public Member()
    {
    }

    public Member(String memberNumber, String firstName, String LastName, String password, 
                            String isTeamOrganiser, String teamName, String phone, String email, String joinDate, 
                             String address, String DateOfBirth)
    {
        this.memberNumber = memberNumber;
        this.firstName = firstName;
        this.LastName = LastName;
        this.password = password;
        this.isTeamOrganiser = isTeamOrganiser;
        this.teamName = teamName;
        this.phone = phone;
        this.email = email;
        this.joinDate = joinDate;
        this.address = address;
        this.DateOfBirth = DateOfBirth;
        this.bookings =  new ArrayList<>();
    }

    public String getMemberNumber()
    {
        return memberNumber;
    }

    public void setMemberNumber(String memberNumber)
    {
        this.memberNumber = memberNumber;
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
        return LastName;
    }

    public void setLastName(String LastName)
    {
        this.LastName = LastName;
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

    public String isIsTeamOrganiser()
    {
        return isTeamOrganiser;
    }

    public void setIsTeamOrganiser(String isTeamOrganiser)
    {
        this.isTeamOrganiser = isTeamOrganiser;
    }

    public String getTeamName()
    {
        return teamName;
    }

    public void setTeamName(String teamName)
    {
        this.teamName = teamName;
    }

    public String getPhone()
    {
        return phone;
    }

    public void setPhone(String phone)
    {
        this.phone = phone;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public String getJoinDate()
    {
        return joinDate;
    }

    public void setJoinDate(String joinDate)
    {
        this.joinDate = joinDate;
    }

    public String getAddress()
    {
        return address;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }

    public String getDateOfBirth()
    {
        return DateOfBirth;
    }

    public void setDateOfBirth(String DateOfBirth)
    {
        this.DateOfBirth = DateOfBirth;
    }

    public List<Booking> getBookings()
    {
        return bookings;
    }

    public void setBookings(List<Booking> bookings)
    {
        this.bookings = bookings;
    }
    
    
    public void addBooking(Booking booking)
    {
        bookings.add(booking);
    }
    
    public  boolean validatePassword(String inputPassword)
    {
        return this.password.equals(inputPassword);
    }
    
    
   
}
