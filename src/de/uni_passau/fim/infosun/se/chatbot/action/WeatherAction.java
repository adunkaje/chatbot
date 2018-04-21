package de.uni_passau.fim.infosun.se.chatbot.action;

import java.io.PrintStream;

/**
 * This <code>Action</code> accepts keywords that indicate inquiries about the weather forecast.<br/>
 * <br/>
 * TODO: Respond with current information retrieved from a suitable online service.
 */
public class WeatherAction implements Action {
    @Override
    public boolean accept(String request) {
        return request.contains("Weather")
                || request.contains("Air")
                || request.contains("air")
                || request.contains("Temperature")
                || request.contains("temperature")
                || request.contains("weather");
        
    }

    @Override
    public boolean run(String request, PrintStream out) {
        out.println("Unfortunately, today, meteorologists do not work. :(");
        return true;
    }
}
