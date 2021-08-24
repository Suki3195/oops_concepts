package oopsQuestion3;

public class MainClass {

    public static void main (String args []){

        TeamLead teamLead = new TeamLead();
        ProjectManager projectManager = new ProjectManager();
        ModuleLead moduleLead = new ModuleLead();

        System.out.println("*****************************************" +"\n" );
        projectManager.doWork();
        System.out.println("\n" + "*****************************************" + "\n" );
        moduleLead.doWork();
        System.out.println("\n" + "*****************************************" + "\n" );
        teamLead.doWork();
        System.out.println("\n" + "*****************************************" + "\n" );

    }
}
