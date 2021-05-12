package ro.ase.acs.football;

import java.util.Date;

public class FootballMatch {
    private String team1;
    private String team2;
    private int team1Goals;
    private int team2Goals;
    private Date date;
    private String referee;
    private int attendance;

    public FootballMatch(String team1, String team2) {
        this.team1 = team1;
        this.team2 = team2;
    }

    public FootballMatch(String team1, String team2, int team1Goals, int team2Goals, Date date, String referee, int attendance) {
        this.team1 = team1;
        this.team2 = team2;
        this.team1Goals = team1Goals;
        this.team2Goals = team2Goals;
        this.date = date;
        this.referee = referee;
        this.attendance = attendance;
    }

    public int getTeam1Goals() {
        return team1Goals;
    }

    public void setTeam1Goals(int team1Goals) {
        this.team1Goals = team1Goals;
    }

    public int getTeam2Goals() {
        return team2Goals;
    }

    public void setTeam2Goals(int team2Goals) {
        this.team2Goals = team2Goals;
    }
}
