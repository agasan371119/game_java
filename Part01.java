public class Part01 {
  public static void main (String[] args) {

    putJyosyou();

    int lv = (int)(Math.random()) * 1 + 100;

    if(lv > 50) {
      System.out.println("レベル" + lv + "なので倒せました！！！");
    } else if(lv == 25){
      System.out.println("レベル" + lv + "なので苦戦しました！！！");
    } else {
      System.out.println("レベル" + lv + "なので負けました(ぴえん)");
    }
    System.out.println("GAME CLAER!");
  }

  static void putJyosyou() {
    String name = "王子";

    System.out.println("魔王が" + "世界を滅ぼそうとしています！");
    System.out.println(name + "はレベル" + 300 + "の勇者を召喚した");
  }
}