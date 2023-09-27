import java.util.Scanner;

public class Game {

  static void options(String optionList) {
    //Defining Things
    String optionRemain = optionList;
    String optionPart = "An issue occured";
    int optionCut = 0;
    int optionsLeft = 1;
    int optionsCount = 0;
    System.out.println("-----------");
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
    System.out.print("Choice: ");
  }

  static void NotAnOption() {
    System.out.println("That was not an option. Quitting game.");
    System.exit(0);
  }

  static void CharacterSpeak(String speaker, String saying) {
    System.out.println(speaker + " - " + "\"" + saying + "\"");
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
      System.out.println("Then let us begin.");
      //begining the game
      System.out.println("You find yourself on a stone platform in the middle of a clearing. Behind you there is a cliff. Ahead of you there are two paths.");
      options("Go Right,Go Left,Approach Cliff");
      choice = Integer.parseInt(in.nextLine());
      switch (choice) {
        case 1:
          System.out.println("You chose to go right");
          System.out.println("After walking down the path for a while, you start to see a stone wall ahead.\nThe wall is too high to see above. On the other side you can see a few pillars of smoke.");
          options("Scale Wall,Call up to wall,walk around the wall");
          choice = Integer.parseInt(in.nextLine());
          switch (choice) {
            case 1:
              System.out.println("You attempt to scale the wall.\nAs you begin to climb, You hear a voice shout down at you.");
              CharacterSpeak("Voice", "OI! What do you think you're doing?");
              options("Reply: Climbing?,Reply: Slaying Dragons,Introduce Yourself,Stay Silent,Jump Down");
              choice = Integer.parseInt(in.nextLine());
              //Unfinished
              break;
            case 2:
              System.out.println("You shout up to the wall. What do you shout?");
              options("Hello?,Anyone Up There?,Who Dares Build A Wall In My Path?")
              choice = Integer.parseInt(in.nextLine());
              switch (choice)
              //Unfinished
              break;
            case 3:
              System.out.println("Walk left or right?");
              options("Left,Right");
              //Unfinished
              break;
            default:
              NotAnOption();
          }
          break;
        case 2:
          System.out.println("You chose to go left");
          break;
        case 3:
          System.out.println("You chose to approach the cliff");
          break;
        default:
          NotAnOption();
      }
    } else {
      System.out.println("Then what the hell are you doing here " + userName + "?");
      System.exit(0);
    }

  }
}
