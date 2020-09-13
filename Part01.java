public class Part01 {

  static String[] team = {"王様","召喚士", "勇者", "王子", "魔法使い"};
  static String[] enemy = {"ドラゴン", "魔王", "竜王", "雑魚"};
  static String[] magic = {"ファイヤ", "サンダー", "ブリザード"};
  static String[] end = {"HAPPY END", "TRUE END", "BAD END"};

  static int lv = (int)(Math.random() * 100 + 1);
  static int hit =  (int)(Math.random() * 100 + 80);
  static int en = (int)(Math.random() * 3 + 0);
  static int mg = (int)(Math.random() * 2 + 0);

  public static void main (String[] args) {
    prologue();
    summon();
    attack();
    end();
  }

  static void prologue() {
    System.out.println(enemy[1] + "は、世界を滅ぼそうとしています！");
    System.out.println(enemy[1] + "の配下は、姫をさらって行った");
    System.out.println("姫を攫われて" + team[0] + "は、頭を抱えている");
  }

  static void summon() {
    System.out.println(team[0] + "は、世界を救うため" + team[1] + "に召喚の指示を出した！！");
    System.out.println(team[1] + "はレベル" + lv + "の" + team[2] + "を召喚した");

  }

  static void attack() {
    System.out.println(enemy[en] +  "が現れた！！" + team[2] + "は、" + magic[mg] + "を唱えた！！！！");
    
    }
    
  //エンド集
  static void end() {
    if(lv > 50) {
      System.out.println("レベル" + lv + "のため、ダメージを" + hit * 10000 + "与えて一瞬で倒しました！！！");
      System.out.println(team[2] + "は、姫と結婚して、裏では" + team[0] + "を暗殺して王国を乗っ取った！");
      System.out.println(end[0]);

    } else if(lv < 25 && lv > 10){
      System.out.println("レベル" + lv + "なので苦戦しましたが、なんとか倒せました！！！");
      System.out.println(team[1] + "に、用済みと暗殺されました");
      System.out.println(end[1]);

    } else {
      System.out.println("レベル" + lv + "なので負けました");
      System.out.println(end[2]);
    }
  }
}
