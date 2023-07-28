package VotingMachine;
import java.util.*;
public class VotingMachine {
    private String name;
    private double votes;
    private List<String> candidates;
//creating the constructor
    public VotingMachine(String name, double votes) {
        this.name = name;
        this.votes = votes;
        this.candidates = new ArrayList<>();
    }
//Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getVotes() {
        return votes;
    }

    public void setVotes(double votes) {
        this.votes = votes;
    }

    public List<String> getCandidates() {
        return candidates;
    }

    public void setCandidates(List<String> candidates) {
        this.candidates = candidates;
    }
    //method for adding candidate
    public void addCandidate(String name){
        candidates.add(name);
    }

    public void castVote(String name){
        candidates.add(name);
    }
}
