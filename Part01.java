public class Part01 {


  static String[] team = {"王様", "召喚士", "勇者"};
  static String[] enemy = {"ドラゴン", "魔王", "竜王"};
  static String[] magic = {"ファイヤ", "サンダー", "ブリザード"};
  static String[] end = {"HAPPY END", "TRUE END", "BAD END"};


  static int lv = (int)(Math.random() * 100 + 1);
  static int hit =  (int)(Math.random() * 1000 + 1);

  public static void main (String[] args) {
    prologue();
    summon();
    attack();
  }

  static void prologue() {
    System.out.println(enemy[1] + "世界を滅ぼそうとしています！");
    System.out.println(enemy[1] + "は、姫をさらって行った");
    System.out.println("姫を攫われて" + team[0] + "は、頭を抱えている");
  }

  static void summon() {
    System.out.println(team[0] + "は、世界を救うため" + team[1] + "に命令を下した！！");
    System.out.println(team[1] + "はレベル" + lv + "の" + team[2] + "を召喚した");

  }

  static void attack() {
    System.out.println(enemy[1] +  "が現れた！！" + team[2] + "は、" + magic[0] + "を唱えた！！！！");

    if(lv > 50) {
      System.out.println("レベル" + lv + "なので余裕でした！！！");
      System.out.println(team[2] + "は、姫を救い、影で" + team[0] + "を暗殺して、姫と結婚し王国を乗っ取った！");
      System.out.println(end[0]);

    } else if(lv == 25){
      System.out.println("レベル" + lv + "なので苦戦しましたが、なんとか倒せました！！！");
      System.out.println(team[0] + "に、用済みと宣告を受け暗殺されました");
      System.out.println(end[1]);

    } else {
      System.out.println("レベル" + lv + "なので負けました(ぴえん)");
      System.out.println(end[2]);
    }

  }
}
