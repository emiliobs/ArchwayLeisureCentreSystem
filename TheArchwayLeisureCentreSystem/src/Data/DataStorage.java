package Data;

import Businness.Booking;
import Businness.Member;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Emilio
 */
public class DataStorage
{
    public static  List<Member> members = new ArrayList<>();
    public  static  List<Booking> bookings = new ArrayList<>();
    
    public  static  void addMember(Member member)
    {
        members.add(member);
    }
    
    public  static  void addBooking(Booking booking)
    {
        bookings.add(booking);
    }
    
    
}
