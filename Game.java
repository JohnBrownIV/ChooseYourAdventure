import java.util.Scanner;

public class Game {

  static void Options(String optionList) {
    String optionRemain = optionList;
    String optionPart = "An issue occured";
    int optionCut = 0;
    int optionsLeft = 1;
    System.out.println(optionList);

    

    while (optionsLeft > 0) {
       optionPart = optionRemain.substring(0, optionRemain.indexOf(","));
    System.out.println(optionPart);
    optionCut = optionPart.length() + 1;
    optionRemain = optionRemain.substring(optionCut, optionRemain.length());
    optionsLeft = optionRemain.indexOf(",");

    }
  
  
  }

  public static void main(String[] args) {
    System.out.println("making sure ths part works.");
    Options("Whosits,Whatnots,Whysits,Stuff,That's All");
  }
}
