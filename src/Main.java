import com.sun.source.util.SourcePositions;

public class Main {
    public static void main(String[] args) {
        int startingScore = 100;
        int addingAmount = 1100;
        int amountRubleBonus = addingAmount / 100;

        int totalScore = startingScore + addingAmount;
        int totalScoreBonus = startingScore + addingAmount + amountRubleBonus;

        if (addingAmount >= 1000) {
            System.out.println(totalScoreBonus);
        } else {
            System.out.println(totalScore);
        }
    }
}
