
public class Match {
    
    private String homeTeam;
    private String visitingTeam;
    private int homeTeamPoints;
    private int visitingTeamPoints;
    
    public Match(String homeTeam, String visitingTeam, int homeTeamPoints, int visitingTeamPoints) {
        this.homeTeam = homeTeam;
        this.visitingTeam = visitingTeam;
        this.homeTeamPoints = homeTeamPoints;
        this.visitingTeamPoints = visitingTeamPoints;   
    }
    
    public String getHomeTeam() {
        return homeTeam;
    }
    
    public String getVisitingTeam() {
        return visitingTeam;
    }
    
    public int getHomeTeamPoints() {
        return homeTeamPoints;
    }
    
    public int getVisitingTeamPoints() {
        return visitingTeamPoints;
    }
    
    public String getWinner() {
        if (homeTeamPoints > visitingTeamPoints) {
            return homeTeam;
        } else {
            return visitingTeam;
        }
    }
    
    public String getLoser() {
        if (homeTeamPoints < visitingTeamPoints) {
            return homeTeam;
        } else {
            return visitingTeam;
        }
    }
}
