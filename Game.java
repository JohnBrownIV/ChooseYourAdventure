import java.util.Scanner;

public class Game {

  static void options(String optionList) {
    //Defining Things
    String optionRemain = optionList;
    String optionPart = "An issue occured";
    int optionCut = 0;
    int optionsLeft = 1;
    int optionsCount = 0;
    System.out.println(optionList);
    //Reading Loop
    while (optionsLeft > 0) {
      optionPart = optionRemain.substring(0, optionRemain.indexOf(","));
      optionCut = optionPart.length() + 1;
      optionRemain = optionRemain.substring(optionCut, optionRemain.length());
      optionsLeft = optionRemain.indexOf(",");
      optionsCount = optionsCount + 1;
      System.out.println(optionsCount + " - " + optionPart);
    }
    //Print The Last one
    System.out.println((optionsCount + 1) + " - " + optionRemain);
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("     Welcome to\n THE ADVENTURE ZONE\n--------------------");
    System.out.println("What is your name?");
    String userName = in.nextLine();
    System.out.println(userName + ", are you ready to begin?");
    options("Yes,No");
    int choice = Integer.parseInt(in.nextLine());

    //first choice
    if (choice == 1) {
      System.out.println("Then let's begin.\nYou find yourself standing in a clearing. Around you is a forest. Behind you is a cliff. Ahead of you there are two paths.");
      options("Look around,")
    } else {
      System.out.println("Then what the hell are you doing here " + userName + "?");
      System.exit(0);
    }

  }
}
