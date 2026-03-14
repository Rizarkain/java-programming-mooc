
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("File:");
        String file = scan.nextLine();
        
        System.out.println("Team:");
        String team = scan.nextLine();        
        
        ArrayList<Match> matches = readMatchesFromFile(file);
        
        int games = 0;
        int wins = 0;
        int losses = 0;
        
        for (Match match: matches) {
            if (match.getHomeTeam().equals(team) || match.getVisitingTeam().equals(team)) {
                games++;
                if (match.getWinner().equals(team)) {
                    wins++;
                } else {
                    losses++;
                }
            }
        }
        System.out.println("Games: " + games);
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);
    }
                  
    public static ArrayList<Match> readMatchesFromFile(String file) {
        ArrayList<Match> matches = new ArrayList<>();
        
        try (Scanner reader = new Scanner(Paths.get(file))) {
            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                
                String[] parts = line.split(",");
                String homeTeam = parts[0];
                String visitingTeam = parts[1];
                int homeTeamPoints = Integer.valueOf(parts[2]);
                int visitingTeamPoints = Integer.valueOf(parts[3]);
                
                matches.add(new Match(homeTeam, visitingTeam, homeTeamPoints, visitingTeamPoints));
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return matches;   
    }
}
