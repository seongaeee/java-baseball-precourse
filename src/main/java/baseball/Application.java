package baseball;

import baseball.domain.Judgement;
import baseball.domain.NumberGenerator;
import baseball.domain.Referee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        final NumberGenerator generator = new NumberGenerator();
        final List<Integer> computer = generator.createRandomNumbers();

        Referee referee = new Referee();
        String result = referee.compare(computer, askNumbers());


        System.out.println(result);
    }

    public static List<Integer> askNumbers() {
        Scanner scanner = new Scanner(System.in);
        String input=scanner.next();

        List<Integer> numbers = new ArrayList<>();
        for (String number : input.split("")){
            numbers.add(Integer.valueOf(number));
        }
        return numbers;
    }
}
