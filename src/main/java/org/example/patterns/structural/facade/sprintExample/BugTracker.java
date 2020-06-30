package org.example.patterns.structural.facade.sprintExample;

public class BugTracker {

    private Boolean activeSprint;

    public Boolean isActiveSprint() {
        return activeSprint;
    }

    public void startSprint() {
        System.out.println("Sprint is starting...");
        this.activeSprint = true;
    }

    public void finishSprint() {
        System.out.println("Sprint is finishing...");
        this.activeSprint = false;
    }
}
