package codewars;

public class Rockps {

    public static String rps(String p1, String p2) {
        String scissors = "scissors";
        String rock = "rock";
        String paper = "paper";
        String won1 = "Player 1 won!";
        String won2 = "Player 2 won!";
        String allDraw = "Draw!";

        if (p1.equals(scissors) && p2.equals(rock)) {
            return won2;
        } else if (p1.equals(scissors) && p2.equals(paper)) {
            return won1;
        } else if (p1.equals(scissors) && p2.equals(scissors)) {
            return allDraw;
        } else if (p1.equals(paper) && p2.equals(paper)) {
            return allDraw;
        } else if (p1.equals(paper) && p2.equals(scissors)) {
            return won2;
        } else if (p1.equals(paper) && p2.equals(rock)) {
            return won1;
        } else if (p1.equals(rock) && p2.equals(paper)) {
            return won2;
        } else if (p1.equals(rock) && p2.equals(scissors)) {
            return won1;
        } else if (p1.equals(rock) && p2.equals(rock)) {
            return allDraw;
        }

        return "";
    }
}