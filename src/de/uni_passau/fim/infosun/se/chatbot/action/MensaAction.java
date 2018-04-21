package de.uni_passau.fim.infosun.se.chatbot.action;

import java.io.PrintStream;
import java.util.Calendar;

/**
 * This <code>Action</code> responds to keywords related to food.<br/>
 * It determines whether the canteen is within its opening hours and provides a link to the menu.
 */
public class MensaAction implements Action {
    @Override
    public boolean accept(String request) {
        return request.contains("hunger")
                || request.contains("canteen")
                || request.contains("eat")
                || request.contains("food");
    }

    @Override
    public boolean run(String request, PrintStream out) {
        int hour = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);

        if (hour >= 15  || hour <= 14) {
            out.println("Have a look https://www.google.co.th/search?q=food&tbm=isch&tbo=u&source=univ&sa=X&ved=0ahUKEwjeicPi78raAhWFtY8KHayrDVwQsAQIUw&biw=1366&bih=662");
        } else {
            out.println("I'm so sorry :(");
        }

        return false;
    }
}
