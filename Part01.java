public class Part01 {
  public static void main (String[] args) {
    putJyosyou();
  }

  static void putJyosyou() {
    String[] team = {"王様", "召喚士", "勇者"};
    String[] enemy = {"ドラゴン", "魔王", "竜王"};

    int lv = (int)(Math.random() * 50 + 1);

    System.out.println(enemy[1] + "世界を滅ぼそうとしています！");

    System.out.println(team[0] + "は、世界を救うため" + team[1] + "に命令を下した！！");
    System.out.println(team[1] + "はレベル" + lv + "の" + team[2] + "を召喚した");

    System.out.println("魔王が現れた！！" + team[2] + "は、聖剣エクスカリバーを構えた！！！！");

    if(lv > 50) {
      System.out.println("レベル" + lv + "なので余裕で倒せました！！！");
      System.out.println("GAME CLAER!");

    } else if(lv == 25){
      System.out.println("レベル" + lv + "なので苦戦しましたが、なんとか倒せました！！！");
      System.out.println("TRUE END!");

    } else {
      System.out.println("レベル" + lv + "なので負けました(ぴえん)");
      System.out.println("BAD END");
    }
  }
}