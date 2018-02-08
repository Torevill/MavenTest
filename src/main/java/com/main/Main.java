package com.main;

import com.sources.SimpleGUI;

import java.lang.management.ManagementFactory;

public class Main {
    public static void main(String[] args) {
        System.out.println("========================");
        System.out.println(ManagementFactory.getRuntimeMXBean().getInputArguments());
        System.out.println("========================");

        SimpleGUI gui = new SimpleGUI();
        gui.setVisible(true);

    }
}
