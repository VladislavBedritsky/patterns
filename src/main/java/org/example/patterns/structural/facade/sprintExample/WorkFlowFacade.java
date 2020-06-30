package org.example.patterns.structural.facade.sprintExample;

public class WorkFlowFacade {

    private Job job;
    private Developer developer;
    private BugTracker bugTracker;

    public WorkFlowFacade() {
        job = new Job();
        developer = new Developer();
        bugTracker = new BugTracker();
    }

    public void startWorkProcess() {
        job.doJob();
        bugTracker.startSprint();
        developer.doJobBeforeDeadline(bugTracker);
    }

    public void stopWorkProcess() {
        bugTracker.finishSprint();
        developer.doJobBeforeDeadline(bugTracker);
    }

}
