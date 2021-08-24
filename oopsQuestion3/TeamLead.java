package oopsQuestion3;

public class TeamLead extends Role {

    public void doWork(){

        System.out.println("Team Leads are responsible for the following tasks:-"  + "\n\n" +
                "Communicating goals and targets" + "\n" +
                "Lead and motivate the team" +"\n" +
                "Manage performance"  +"\n" +
                "Coaching and mentoring"+"\n" +
                "Clearly define and separate tasks to avoid overlap and clashing "+"\n" +
                "Delegating tasks and set deadlines for your internal team"+"\n"
        );

    }
    @Override
    public void showOrganisation(){
        System.out.println("Team Lead is from GenX");

    }
}
