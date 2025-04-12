package package3;

import java.util.ArrayList;
import java.util.LinkedList;

public class EventManagementSystem {
    public static void main(String[] args) {
        ArrayList<Session> sessions = new ArrayList<>();

        sessions.add(new Session("Introduction to Java", "Dr. James Brown", "9:00 AM"));
        sessions.add(new Session("Advanced Database Design", "Prof. Sarah Johnson", "10:30 AM"));
        sessions.add(new Session("Machine Learning Fundamentals", "Dr. Michael Chen", "1:00 PM"));
        sessions.add(new Session("Web Development with Spring", "Jessica Miller", "2:30 PM"));
        sessions.add(new Session("Cloud Computing Essentials", "Robert Wilson", "4:00 PM"));
        sessions.add(new Session("Cybersecurity Best Practices", "Emma Davis", "5:30 PM"));

        displaySessions(sessions);

        System.out.println("First Session:");
        System.out.println(sessions.get(0));

        System.out.println("Last Session:");
        System.out.println(sessions.get(sessions.size() - 1));

        System.out.println("Canceling session: " + sessions.get(2));
        sessions.remove(2);

        System.out.println("Updated Session List After Cancellation:");
        displaySessions(sessions);

        System.out.println("Updating the speaker and time for session: " + sessions.get(1));
        sessions.set(1, new Session("DevOps Best Practices", "Ms. Emma", "02:30 PM"));


        System.out.println("Updated Session List:");
        displaySessions(sessions);



        LinkedList<Attendee> attendeeList = new LinkedList<>();
        String sessionTitle = "Java for Beginners";
        String sessionTitle2 = "Java for Adavnced";

        System.out.println("Registering attendees for session: " + sessionTitle);
        attendeeList.add(new Attendee("John Smith", "john.smith@email.com", sessionTitle));
        attendeeList.add(new Attendee("Mary Johnson", "mary.johnson@email.com", sessionTitle2));
        attendeeList.add(new Attendee("David Lee", "david.lee@email.com", sessionTitle));
        attendeeList.add(new Attendee("Susan Brown", "susan.brown@email.com", sessionTitle2));
        attendeeList.add(new Attendee("Thomas Wilson", "thomas.wilson@email.com", sessionTitle));

        System.out.println("All Registered Attendees:");
        attendenceList(attendeeList);

        System.out.println("New attendee registering for session: " + sessionTitle);
        Attendee newAttendee = new Attendee("Karen Young", "karen.young@email.com", sessionTitle);
        attendeeList.addLast(newAttendee);
        System.out.println("Added: " + newAttendee);

        System.out.println("Updated Attendee List:");
        attendenceList(attendeeList);


        System.out.println("Check-in Process:");
        while (!attendeeList.isEmpty()) {
            Attendee checkedIn = attendeeList.removeFirst();
            System.out.println( checkedIn.getName() + " checked in for " + checkedIn.getSessionTitle());
        }

        System.out.println("All attendees have checked in. The session is full.");

    }

    public static void displaySessions(ArrayList<Session> sessions) {
        System.out.println("Updated Session List:");
        for (Session session : sessions) {
            System.out.println(session);
        }

    }
    public static void attendenceList(LinkedList<Attendee> attendees) {
        System.out.println("Updated Attendee List:");
        for (Attendee attendee : attendees) {
            System.out.println(attendee);
        }

    }


}
