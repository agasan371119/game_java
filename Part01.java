public class Part01 {

  static String[] team = {"王様", "召喚士", "勇者"};
  static String[] enemy = {"ドラゴン", "魔王", "竜王"};
  static String[] magic = {"ファイヤ", "サンダー", "ブリザード"};

  static int lv = (int)(Math.random() * 100 + 1);
  static int hit =  (int)(Math.random() * 1000 + 1);

  public static void main (String[] args) {
    prologue();
    summon();
    attack();
  }

  static void prologue() {
    System.out.println(enemy[1] + "世界を滅ぼそうとしています！");
  }

  static void summon() {
    System.out.println(team[0] + "は、世界を救うため" + team[1] + "に命令を下した！！");
    System.out.println(team[1] + "はレベル" + lv + "の" + team[2] + "を召喚した");

  }

  static void attack() {
    System.out.println(enemy[1] +  "が現れた！！" + team[2] + "は、" + magic[0] + "を唱えた！！！！");

    if(lv > 50) {
      System.out.println("レベル" + lv + "なので余裕で倒せました！！！");
      System.out.println("HAPPY END!");

    } else if(lv == 25){
      System.out.println("レベル" + lv + "なので苦戦しましたが、なんとか倒せました！！！");
      System.out.println("TRUE END!");

    } else {
      System.out.println("レベル" + lv + "なので負けました(ぴえん)");
      System.out.println("BAD END");
    }

  }
}
