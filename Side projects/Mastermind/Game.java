import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Game {
  private String colors;
  private boolean isWinner;
  private String userInp;
  private int correctGuessCount;
  private int guessCount;

  public Game() {
    this.colors = "";
    this.isWinner = false;
    this.correctGuessCount = 0;
    this.guessCount = 0;
  }

  public void play() {
    System.out.println("Welcome player! You have to guess the 4 colors I have on my mind.");
    System.out.println("The 4 colors are: R-ed, G-reen, B-lue and Y-ellow.");
    System.out.println("Good luck!");
    this.generateColorSequence();
    System.out.println(this.getColors());
    while(this.getGuessCount()<10 && !this.getIsWinner()){
      this.setUserInp();
      System.out.println();
      this.checkGuess();
    }
    this.gameOver();
  }

  public String getColors() {
    return this.colors;
  }

  public String getUserInp() {
    return this.userInp;
  }

  public boolean getIsWinner() {
    return this.isWinner;
  }

  public int getCorrectGuessCount() {
    return this.correctGuessCount;
  }

  public int getGuessCount() {
    return this.guessCount;
  }

  public void generateColorSequence() {
    char[] colors = {'R', 'G', 'B', 'Y'};
    StringBuilder stringBuilder = new StringBuilder();
    Random random = new Random();
    for (char c : colors) {
        stringBuilder.append(colors[random.nextInt(colors.length)]);
    }
    this.colors = stringBuilder.toString();
  }

  public void setUserInp() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("> ");
    this.userInp = scanner.next();
  }

  public void checkGuess() {
    char[] colors = this.getColors().toCharArray();
    char[] userInp = this.getUserInp().toCharArray();
    int correctanswer = countCorrectAnswers(colors, userInp);
    this.correctGuessCount = correctanswer;
    if (this.getCorrectGuessCount() <= 1) {
      System.out.println(this.getCorrectGuessCount()+" correct answer");
    } else {
      System.out.println(this.getCorrectGuessCount()+" correct answers");
    }
    if (this.getCorrectGuessCount() == 4) {
      this.isWinner = true;
    }
    this.guessCount++;
  }

  public int countCorrectAnswers(char[] colors, char[] userinp) {
    Arrays.sort(colors);
    Arrays.sort(userinp);
    int correctOnes = 0;
    for (int i = 0; i < colors.length; i++) {
      if (userinp[i] == colors[i]) {
        correctOnes++;
      }
    }
    return correctOnes;
  }

  public void gameOver() {
    if (this.getIsWinner()) {
      System.out.println("Congratulations! You have won in "+this.getGuessCount()+" guesses!");
    } else {
      System.out.println("Oh you have lost! But don't worry, you can play again anytime!");
    }
  }

}