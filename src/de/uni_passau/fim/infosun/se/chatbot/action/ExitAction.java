package de.uni_passau.fim.infosun.se.chatbot.action;

import java.io.PrintStream;

/**
 * This <code>Action</code> accepts keywords that indicate a wish to terminate the conversation.
 */
public class ExitAction implements Action {
    @Override
    public boolean accept(String request) {
        return request.contains("meet again")
                || request.contains("exit")
                || request.contains("see ya")
                || request.contains("see u again")
                || request.contains("see you again")
                || request.contains("good night")
                || request.contains("bye");
    }

    @Override
    public boolean run(String request, PrintStream out) {
        out.println("Goodbye!");
        return false;
    }
}
