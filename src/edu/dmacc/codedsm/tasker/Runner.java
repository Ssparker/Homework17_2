package edu.dmacc.codedsm.tasker;

import edu.dmacc.codedsm.tasker.objects.*;

public class Runner {

    private static Task inPersonAssigner;

    public static void main(String[] args) {
        System.out.println("Starting Runner....");

        TaskAssigner emailAssigner = new EmailTaskAssigner();
        TaskAssigner phoneAssigner = new PhoneTaskAssigner();
        TaskAssigner inPersonAssigner = new InPersonTaskAssigner();
        User name = newUser("Sheryl Parker");

        emailAssigner.TaskAssinger(name, 10);
        phoneAssigner.TaskAssigner(name, 5);
        inPersonAssigner.TaskAssigner(name, 3);
    }

    private static User newUser(String sheryl_parker) {
        return null;
    }
}





