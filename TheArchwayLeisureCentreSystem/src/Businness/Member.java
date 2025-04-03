package Businness; // Defines the package name where this class belongs


import java.util.ArrayList; // Imports ArrayList for managing bookings
import java.util.List; // Imports List interface to store multiple bookings

/**
 * Member class represents a sports club member with personal details, team
 * affiliation, and booking history.
 *
 * @author Emilio
 */
public class Member
{

    // Attributes of the Member class
    private String memberNumber;    // Unique identifier for the member
    private String firstName;       // First name of the member
    private String LastName;        // Last name of the member
    private String password;        // Password for member login
    private String isTeamOrganiser; // Indicates if the member is a team organizer (Yes/No)
    private String teamName;        // Name of the team the member belongs to
    private String phone;           // Member's phone number
    private String email;           // Member's email address
    private String joinDate;        // Date when the member joined the club
    private String address;         // Member's home address
    private String DateOfBirth;     // Member's date of birth
    private List<Booking> bookings; // List to store the member's bookings

    // Default constructor (creates an empty member object)
    public Member()
    {
    }

    /**
     * Parameterized constructor to initialize a Member object with given
     * details.
     */
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
        this.bookings = new ArrayList<>(); // Initializes an empty booking list
    }

    // Getter and Setter methods to access and modify member attributes
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
    { // Returns "Yes" or "No"
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

    /**
     * Retrieves the list of bookings made by the member.
     *
     * @return List of bookings
     */
    public List<Booking> getBookings()
    {
        return bookings;
    }

    /**
     * Sets the member's booking list.
     *
     * @param bookings List of bookings
     */
    public void setBookings(List<Booking> bookings)
    {
        this.bookings = bookings;
    }

    /**
     * Adds a booking to the member's booking list.
     *
     * @param booking The booking to be added
     */
    public void addBooking(Booking booking)
    {
        bookings.add(booking);
    }

    /**
     * Validates if the provided password matches the member's password.
     *
     * @param inputPassword Password entered by the user
     * @return True if the password matches, false otherwise
     */
    public boolean validatePassword(String inputPassword)
    {
        return this.password.equals(inputPassword);
    }
}
