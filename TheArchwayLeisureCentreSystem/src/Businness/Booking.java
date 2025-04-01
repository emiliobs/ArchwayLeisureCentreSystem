package Businness;
/**
 *
 * @author Emilio
 */
public class Booking
{
    private String time;
    private String  pitch;
    private String memberNumber;
    private String memberFullname;

    public Booking()
    {
    }

    public Booking(String time, String pitch, String memberNumber, String memberFullname)
    {
        this.time = time;
        this.pitch = pitch;
        this.memberNumber = memberNumber;
        this.memberFullname = memberFullname;
    }

    public String getMemberFullname()
    {
        return memberFullname;
    }

    public void setMemberFullname(String memberFullname)
    {
        this.memberFullname = memberFullname;
    }

    public String getTime()
    {
        return time;
    }

    public void setTime(String time)
    {
        this.time = time;
    }

    public String getPitch()
    {
        return pitch;
    }

    public void setPitch(String pitch)
    {
        this.pitch = pitch;
    }

    public String getMemberNumber()
    {
        return memberNumber;
    }

    public void setMemberNumber(String memberNumber)
    {
        this.memberNumber = memberNumber;
    }
    
    
    
}
