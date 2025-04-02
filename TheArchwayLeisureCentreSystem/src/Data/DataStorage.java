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

    public static List<Member> members = new ArrayList<>();
    public static List<Booking> bookings = new ArrayList<>();

    public static void addMember(Member member)
    {
        members.add(member);
    }

    public static void addBooking(Booking booking)
    {
        bookings.add(booking);
    }

    public static Member findMemberByNumber(String inputNumberNumber)
    {
        for (Member member : members)
        {
            if (member.getMemberNumber().equals(inputNumberNumber))
            {
                return member;
            }

        }

        return null;
    }

    public static List<Member> getMembers()
    {
        return members;
    }

    public static void preloadMembers()
    {
        members.add(new Member("E55555", "Emilio", "Barrera", "55555", "Yes", "Team Strong", "1234567890", "emilio@mail.com", "2023-01-15", "55555 Street, London", "1995/05/20"));
        members.add(new Member("M001", "Alice", "Johnson", "pass123", "No", "Team Alpha", "1234567890", "alice@mail.com", "2023-01-15", "123 Street, London", "1995/05/20"));
        members.add(new Member("M002", "Bob", "Smith", "bobpass", "No", "Team Beta", "0987654321", "bob@mail.com", "2022-03-10", "456 Avenue, Manchester", "1992/07/11"));
        members.add(new Member("M003", "Charlie", "Brown", "charlie321", "No", "Team Gamma", "1112223333", "charlie@mail.com", "2021-06-25", "789 Road, Birmingham", "1998/09/30"));
        members.add(new Member("M004", "David", "Miller", "davidPass", "No", "Team Delta", "2223334444", "david@mail.com", "2020-05-18", "234 Lane, Liverpool", "1990/11/15"));
        members.add(new Member("M005", "Ella", "Davis", "ellaSecure", "No", "Team Omega", "3334445555", "ella@mail.com", "2019-08-12", "567 Blvd, Glasgow", "1997/02/22"));
        members.add(new Member("M006", "Frank", "Wilson", "frankPass", "Yes", "Team Alpha", "4445556666", "frank@mail.com", "2023-02-20", "890 Terrace, Edinburgh", "1991/06/10"));
        members.add(new Member("M007", "Grace", "Anderson", "grace123", "Yes", "Team Beta", "5556667777", "grace@mail.com", "2022-11-05", "321 Square, Cardiff", "1996/12/08"));
        members.add(new Member("M008", "Henry", "Moore", "henrySecure", "Yes", "Team Gamma", "6667778888", "henry@mail.com", "2021-07-30", "654 Court, Belfast", "1993/03/14"));
        members.add(new Member("M009", "Isla", "Thomas", "islaPass", "Yes", "Team Delta", "7778889999", "isla@mail.com", "2020-04-25", "987 Drive, Newcastle", "1999/01/05"));
        members.add(new Member("M010", "Jack", "White", "jack321", "Yes", "Team Omega", "8889990000", "jack@mail.com", "2018-12-10", "159 Walk, Bristol", "1989/10/29"));
    }

}
