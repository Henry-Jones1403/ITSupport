package com.company;

import java.util.ArrayList;

public class laptop extends Device{
    private ArrayList<String> Components;

    public laptop(String identificationCode, String makeAndModel, String owner, String problemDescription, String repairNotes, int priority, ArrayList<String> components) {
        super(identificationCode, makeAndModel, owner, problemDescription, repairNotes, priority);
        Components = components;
    }

    public ArrayList<String> getComponents() {
        return Components;
    }
}
