package ro.ase.acs.main;

import ro.ase.acs.football.FootballMatch;
import ro.ase.acs.football.SoccerMatch;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
	// write your code here

        //varianta fara dp -> constructor cu parametri
        //FootballMatch match = new FootballMatch("Armenia", "Romania", 0,0,null,null,0);

        //1.creare
        FootballMatch match = new FootballMatch("Armenia", "Romania");

        //2.initializare
        match.setTeam1Goals(0);
        //...
        match.setTeam2Goals(0);

        //da eroare ca nu am constructor
        //SoccerMatch soccerMatch = new SoccerMatch();

        SoccerMatch soccerMatch =
                new SoccerMatch.Builder("Armenia", "Romania")
                .addDate(new Date())
                .addGoalsForTeam1(0)
                .addGoalsForTeam2(0)
                .build();
        //fluet api => . de mai multe ori si acelasi tip de obiect

        SoccerMatch.Builder builder = new SoccerMatch.Builder("Germania", "Macedonia de Nord");
        builder.addDate(new Date());
        //...
        SoccerMatch match2 = builder.build();
        //...
    }
}
