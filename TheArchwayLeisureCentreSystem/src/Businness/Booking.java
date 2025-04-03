package Businness; // Defines the package name where this class belongs

/**
 * Booking class represents a booking made by a member for a sports facility.
 * It includes details such as the member's information, booking date, time, and pitch.
 *
 * @author Emilio
 */
public class Booking {

    // Attributes of the Booking class
    private String time;            // Time slot of the booking
    private String pitch;           // Pitch or facility booked
    private String memberNumber;    // Unique identifier of the member making the booking
    private String memberFullname;  // Full name of the member making the booking
    private String bookingDate;     // Date when the booking is scheduled

    // Default constructor (creates an empty booking object)
    public Booking() {
    }

    /**
     * Parameterized constructor to initialize a Booking object with given details.
     * 
     * @param memberNumber   Unique ID of the member making the booking
     * @param memberFullname Full name of the member
     * @param bookingDate    Date of the booking
     * @param time           Time slot for the booking
     * @param pitch          Pitch or facility being booked
     */
    public Booking(String memberNumber, String memberFullname, String bookingDate, String time, String pitch) {
        this.time = time;
        this.pitch = pitch;
        this.memberNumber = memberNumber;
        this.memberFullname = memberFullname;
        this.bookingDate = bookingDate;
    }

    // Getter and Setter methods to access and modify booking attributes
    
    public String getMemberFullname() {
        return memberFullname;
    }

    public void setMemberFullname(String memberFullname) {
        this.memberFullname = memberFullname;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getPitch() {
        return pitch;
    }

    public void setPitch(String pitch) {
        this.pitch = pitch;
    }

    public String getMemberNumber() {
        return memberNumber;
    }

    public void setMemberNumber(String memberNumber) {
        this.memberNumber = memberNumber;
    }

    public String getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(String bookingDate) {
        this.bookingDate = bookingDate;
    }
}
