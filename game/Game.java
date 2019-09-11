package game;

public class Game {
  public static void main(String[] args) {
    DotCom dot = new DotCom();
    int[] locs = {2, 3, 4};
    dot.setLocationCells(locs);
    dot.checkYourself("1");
    dot.checkYourself("2");
    dot.checkYourself("3");
    dot.checkYourself("4");
  }
}

class DotCom {
  int[] locationCells;
  int numOfHits;

  String checkYourself(String guess) {
    int input = Integer.parseInt(guess);
    String res = "miss";

    for(int cell : locationCells) {
      if(input == cell) {
        res = "hit";
        numOfHits++;
        break;
      }
    }
    if(numOfHits == locationCells.length) {
      res = "kill";
    }
    System.out.println(res);
    return res;
  }
  void setLocationCells(int[] locs) {
    locationCells = locs;
  }
}
