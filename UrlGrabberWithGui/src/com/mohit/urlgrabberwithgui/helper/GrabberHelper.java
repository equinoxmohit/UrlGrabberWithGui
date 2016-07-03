/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mohit.urlgrabberwithgui.helper;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import javax.swing.JTextArea;

/**
 *
 * @author Mohit
 */
public class GrabberHelper extends Thread {

    private String link;
    private JTextArea txtArea;

    public GrabberHelper(String link, JTextArea txtArea) {
        this.link = link;
        this.txtArea = txtArea;
    }

    public String grabber() throws IOException {
        URLConnection connection = new URL(link).openConnection();
        BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        String line = "";
        StringBuilder content = new StringBuilder();
        while ((line = reader.readLine()) != null) {
            content.append(line).append("\r\n");
        }
        reader.close();
        return content.toString();

    }

    @Override
    public void run() {
        try {
            txtArea.setText(grabber());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

}
