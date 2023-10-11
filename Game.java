import java.util.Scanner;

public class Game {

  static void Options(String optionList) {
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
      printTime(optionsCount + " - " + optionPart);
    }
    //Print The Last one
    printTime((optionsCount + 1) + " - " + optionRemain);
    System.out.print("Choice: ");
  }

  static void printTime(String text) {
    for ( int nowAt = 0; nowAt < text.length(); nowAt++) {
      System.out.print(text.charAt(nowAt));
      try {
    Thread.sleep(50); // delay for 1 second
    } catch (InterruptedException e) {
    e.printStackTrace();
    }
    }
    System.out.println("");
   }

  static int Response() {
    Scanner response = new Scanner(System.in);
    return Integer.parseInt(response.nextLine());
  }

  static void CallOption(String loadOption) {
    switch (loadOption) {
      case "startPlatform":
        StartPlatform();
        break;
      case "leftPath":
        LeftPath();
        break;
      case "rightPath":
        LeftPath();
        break;
      default:
        NotAnOption();
    }

  }

  static void StartPlatform() {
    printTime("You find yourself standing on a mysterious platform in a clearing. Behind you is a cliff. Ahead of you there are two paths.");
    Options("Go Left,Go Right,Approach Cliff");
    switch(Response()) {
      case 1:
        CallOption("leftPath");
        break;
      case 2:
        CallOption("rightPath");
        break;
      default:
        NotAnOption();
    }
    
  }

  static void LeftPath() {
    printTime("You take the path to your left.");
    printTime("As you continue down the path, you begin to see a fort appear in the distance");
    printTime("When you approach thhe fort, you hear a man call down from the stone walls");
    CharacterSpeak("GUARD", "Who goes there?!");
    Options("Reply \"I am but a weary traveler!\",Reply \"I am death!\",Stay Silent");
    switch(Response()) {
      case 1:
        CharacterSpeak("GUARD", "What does that have to do with anything?");
        break;
      default:
        NotAnOption();
    }
  }

  static void RightPath() {
    printTime("You take the path to your left");
  }


  static void NotAnOption() {
    printTime("That was not an option. Quitting game.");
    System.exit(0);
  }

  static void CharacterSpeak(String speaker, String saying) {
    printTime(speaker + " - " + "\"" + saying + "\"");
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("     Welcome to\n THE ADVENTURE ZONE\n--------------------");
    printTime("What is your name?");
    String userName = in.nextLine();
    printTime(userName + ", are you ready to begin?");
    Options("Yes,No");
    int choice = Integer.parseInt(in.nextLine());

    //first choice
    if (choice == 1) {
      printTime("Then let us begin.");
      //begining the game
      CallOption("startPlatform");
      }
    else {
      printTime("Then what the hell are you doing here " + userName + "?");
      System.exit(0);
    }

  }
}
