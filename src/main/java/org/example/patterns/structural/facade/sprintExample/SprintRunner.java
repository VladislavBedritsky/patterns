package org.example.patterns.structural.facade.sprintExample;

public class SprintRunner {
    public static void main(String[] args) throws InterruptedException {
        WorkFlowFacade workFlowFacade = new WorkFlowFacade();
        workFlowFacade.startWorkProcess();

        Thread.sleep(1000);
        System.out.println("\n");

        workFlowFacade.stopWorkProcess();
    }
}
