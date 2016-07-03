/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mohit.urlgrabberwithgui;

import com.mohit.urlgrabberwithgui.ui.GuiUrlGrabber;

/**
 *
 * @author Mohit
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GuiUrlGrabber grabber = new GuiUrlGrabber();
        grabber.setTitle("Comparing two url");
        grabber.setVisible(true);
    }

}
