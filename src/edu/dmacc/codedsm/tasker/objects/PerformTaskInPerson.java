package edu.dmacc.codedsm.tasker.objects;
import java.util.List;

public class PerformTaskInPerson extends TaskPerformer {

    public PerformTaskInPerson() {
        System.out.println("This is from the PerformTaskInPerson.");
    }


        @Override
  public void performTask(User Assigner, User FirstName) {
       super.performTask(Assigner, FirstName);
        System.out.printf("%s", "performTask");

    }

        @Override
   public void performTask(Task Task, List<String>users) {
       super.performTask(Task, users);
       System.out.printf("%s", "performTask");
    }

}
