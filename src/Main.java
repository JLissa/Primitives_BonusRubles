import com.sun.source.util.SourcePositions;

public class Main {
    public static void main(String[] args) {
        int startingScore = 500;
        int addingAmount = 1100;
        int amountRubleBonus = addingAmount / 100;

        int totalScore;
        int totalScoreBonus;

        if (addingAmount > 1000) {
            totalScoreBonus = startingScore + addingAmount + amountRubleBonus;
            System.out.println(totalScoreBonus);
        } else {
            totalScore = startingScore + addingAmount;
            System.out.println(totalScore);
        }
    }
}
