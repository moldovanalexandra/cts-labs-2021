package ro.ase.acs.football;

public class MatchDirector {
    private SoccerMatch.Builder builder =  null;

    public SoccerMatch construct(String team1, String team2, int score1, int score2) {
        builder = new SoccerMatch.Builder(team1, team2);
        builder.addGoalsForTeam1(0);
        builder.addGoalsForTeam2(0);
        return builder.build();
    }

}
