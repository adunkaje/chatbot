package de.uni_passau.fim.infosun.se.chatbot.action;

import java.io.PrintStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * This <code>Action</code> reacts to requests that include time or date relevant keywords.<br/>
 * If run, it simply responds with the current date and time.
 */
public class DateTimeAction implements Action {
    @Override
    public boolean accept(String request) {
        return request.contains("time")
                || request.contains("day")
                || request.contains("Time")
                || request.contains("The day")
                || request.contains("The Day")
                || request.contains("late")
                || request.contains("Clock")
                || request.contains("date");
    }

    @Override
    public boolean run(String request, PrintStream out) {
        DateFormat dateFormat = new SimpleDateFormat("EEEE, 'of the' dd.MM.yyyy. 'It is' HH:mm 'Clock.'");
        out.format("The Day is %s\n", dateFormat.format(Calendar.getInstance().getTime()));
        return true;
    }
}
