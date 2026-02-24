package service;

import java.util.LinkedList;
import java.util.Iterator;

public class AppointmentService {

    private LinkedList<String> appointments = new LinkedList<>();

    public void initializeAppointments() {
        // TODO: Add 3 normal appointments
        // TODO: Add 1 urgent appointment at the beginning
        appointments.add("appointment 1");
        appointments.add("appointement 2");
        appointments.add("appointment 3");

        appointments.addFirst("urgent appointment");

        System.out.println("appointments initialized");
    }

    public void cancelLast() {
        // TODO: Remove last appointment
        if (!appointments.isEmpty()) {
            String cancelled = appointments.removeLast();
            System.out.println("removed appointment :"+ cancelled);
        } else {
            System.out.println("no appointments found");
        }

    }

    public void showFirstAndLast() {
        // TODO: Print first and last appointment
        if (!appointments.isEmpty()) {
        String first = appointments.peekFirst();
        String last = appointments.peekLast();
            System.out.println("first :" +first);
            System.out.println("last :"+ last); }

    }

    public void printAppointments() {
        // TODO: Traverse using Iterator
        Iterator<String> it = appointments.iterator();

        while (it.hasNext()) {
            System.out.println("--" + it.next());
        }
    }
}
