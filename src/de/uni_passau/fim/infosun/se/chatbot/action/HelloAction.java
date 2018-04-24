package de.uni_passau.fim.infosun.se.chatbot.action;

import java.io.PrintStream;

/**
 * This <code>Action</code> tries to recognize attempts to greet the bot,
 * and responds with a greeting itself and offers its services by chaining
 * the <code>HelpAction</code>.
 */
public class HelloAction implements Action {
    @Override
    public boolean accept(String request) {
        return request.contains("hello")
                || request.contains("good morning")
                || request.contains("Hello")
                || request.contains("good evening")
                || request.contains("good afternoon")
                || request.contains("Good morning")
                || request.contains("yo")
                || request.contains("Good evening")
                || request.contains("Good afternoon")
        || request.contains("hi");
    }

    @Override
    public boolean run(String request, PrintStream out) {
        out.println("Hello!");
        return new HelpAction().run(request, out);
    }
    
    
}
