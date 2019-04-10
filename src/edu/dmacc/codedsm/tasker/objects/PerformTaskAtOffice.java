package edu.dmacc.codedsm.tasker.objects;

public class PerformTaskAtOffice extends TaskPerformer {
    @Override
    public void performTask(User Assigner, User FirstName) {
        super.performTask(Assigner, FirstName);
        System.out.printf("%s", "performTask");
    }

    @Override
    public void performTask(User Assigner, User FirstName, User LastName, User ContactInfo) {
        super.performTask(Assigner, FirstName, LastName, ContactInfo);
        System.out.printf("%s", "performTask");
    }
}


