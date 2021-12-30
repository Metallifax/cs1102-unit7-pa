import java.util.ArrayList;
import java.util.List;

import static java.util.List.of;

public class Quiz {

  public static void main(String[] args) {
    List<Question> questionList = new ArrayList<>(of(
        new MultipleChoiceQuestion(
            "What is the capitol city of Russia?",
            "Minsk",
            "Berlin",
            "Moscow",
            "Saint Petersburg",
            "Leningrad",
            "c"
        ),
        new TrueFalseQuestion("Fear is the mind killer", "TRUE"),
        new MultipleChoiceQuestion(
            "The guitar player for Led Zeppelin",
            "Jimi Hendrix",
            "Sir Patrick Stewart",
            "John Paul Jones",
            "Jimmy Page",
            "Frank Zappa",
            "d"
        ),
        new TrueFalseQuestion("Bicycles have one tire", "FALSE")
    ));

    for (Question question : questionList) {
      question.check();
      Question.showResults();
    }
  }
}
