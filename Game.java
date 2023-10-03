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
      System.out.println(optionsCount + " - " + optionPart);
    }
    //Print The Last one
    System.out.println((optionsCount + 1) + " - " + optionRemain);
    System.out.print("Choice: ");
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
        //load method
        break;
      default:
        NotAnOption();
    }

  }

  static void StartPlatform() {
    System.out.println("You find yourself standing on a mysterious platform in a clearing. Behind you is a cliff. Ahead of you there are two paths.");
    Options("Go Left,Go Right,Approach Cliff");
    switch(Response()) {
      case 1:
        CallOption("leftPath")
        break;
      default:
        NotAnOption();
    }
    
  }

  static void LeftPath() {
    System.out.println("You take the path to your left.");
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
    Options("Yes,No");
    int choice = Integer.parseInt(in.nextLine());

    //first choice
    if (choice == 1) {
      System.out.println("Then let us begin.");
      //begining the game
      CallOption("startPlatform");
      }
    else {
      System.out.println("Then what the hell are you doing here " + userName + "?");
      System.exit(0);
    }

  }
}
