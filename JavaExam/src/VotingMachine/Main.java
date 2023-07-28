package VotingMachine;

public class Main {
    public static void main(String[] args) {
        VotingMachine votingMachine = new VotingMachine("Sheilah Nahabwe", 0);
        System.out.println("Candidate name: " + votingMachine.getName());
        System.out.println("Votes: " + votingMachine.getVotes());
        //adding candidate

        votingMachine.addCandidate("Sheilah Nahabwe");
        votingMachine.addCandidate("Maria Johns");
        votingMachine.addCandidate("Jude Ashaba");
        votingMachine.addCandidate("Gladys Amanda");
        votingMachine.addCandidate("Annet Nanyanzi");
        System.out.println("\nAdding candidates");
        System.out.println("Candidates: " + votingMachine.getCandidates());
        //casting a vote

        votingMachine.castVote("Sheilah Nahabwe");
        votingMachine.setVotes(34);
        System.out.println("\nCasting votes to the candidate");
        System.out.println("Candidate " + votingMachine.getName() +" has " + votingMachine.getVotes() + "Votes.");
    }
}
