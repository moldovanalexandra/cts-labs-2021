package ro.ase.acs.football;

import java.util.Date;

public class SoccerMatch {
    private String team1;
    private String team2;
    private int team1Goals;
    private int team2Goals;
    private Date date;
    private String referee;
    private int attendance;

    //1 fac constructor privat
    //2 sterg getter si setteri
    //3 fac metoda statica


    //private pt ca il apelez doar din interiorul clasei
    private SoccerMatch(String team1, String team2) {
        this.team1 = team1;
        this.team2 = team2;
    }

    //daca era clasa de sine statatoare nu mai putea sa acceseze constructorul
    //poate sa mai fie package (mai risky)
    public static class Builder{
        private SoccerMatch match = null;
        public Builder(String team1, String team2){
           match = new SoccerMatch(team1, team2);
        }

        //am nevoie pt apel in cascada
        public Builder addGoalsForTeam1(int goals){
            match.team1Goals = goals;
            return this;
        }

        public Builder addGoalsForTeam2(int goals){
            match.team2Goals = goals;
            return this;
        }

        public Builder addReferee(String referee){
            match.referee = referee;
            return this;
        }

        public Builder addDate(Date date){
            match.date = date;
            return this;
        }

        public SoccerMatch build(){
            return match;
        }

    }

}
