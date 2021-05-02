package baseball.domain;

import java.util.List;

public class Judgement {
    public int correctCount(List<Integer> computer, List<Integer> player) {

        int result=0;

        for (int i = 0; i < player.size(); i++) {
            if (computer.contains(player.get(i))) {
                result = result + 1;
            }
        }
        return result;
    }

    public boolean hasPlace(List<Integer> computer, int placeIdx, int number) {
        return computer.get(placeIdx) == number;
    }
}
