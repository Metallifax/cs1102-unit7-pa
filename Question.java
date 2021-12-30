import javax.swing.*;
import java.awt.*;

public class Question {
  public static int nCorrect = 0;
  public static int nQuestions = 0;
  QuestionDialog question;
  String correctAnswer;

  Question(String question) {
    this.question = new QuestionDialog();
    this.question.setLayout(new GridLayout(0, 1));
    this.question.add(new JLabel("     " + question + "     ", JLabel.CENTER));
  }

  void initQuestionDialog() {
    question.setModal(true);
    question.pack();
    question.setLocationRelativeTo(null);
  }

  static void showResults() { // class method
    String score = "Your score was\nCorrect: " + nCorrect + "\nNumber of questions: " + nQuestions;
    JOptionPane.showMessageDialog(null, score);
  }

  String ask() {
    question.setVisible(true);
    return question.answer;
  }

  void check() {
    nQuestions++;
    String answer = ask();
    if (answer.equals(correctAnswer)) {
      JOptionPane.showMessageDialog(null, "Yes, the answer is indeed " + correctAnswer + ".");
      nCorrect++;
    } else {
      JOptionPane.showMessageDialog(null, "Incorrect. The correct answer is " + correctAnswer + ".");
    }
  }
}
