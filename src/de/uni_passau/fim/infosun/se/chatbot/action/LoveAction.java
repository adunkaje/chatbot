/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.uni_passau.fim.infosun.se.chatbot.action;

import java.io.PrintStream;

/**
 *
 * @author User
 */
public class LoveAction implements Action {
    @Override
    public boolean accept(String request) {
        return request.contains("i love you");
    }

    @Override
    public boolean run(String request, PrintStream out) {
        out.println("love you too!");
        return true;
    }
}