public class Part01 {
  public static void main (String[] args) {
    String name = "王子";
    int lv = 29;
      System.out.println("魔王が" + "世界を滅ぼそうとしています！");
      System.out.println(name + "はレベル" + lv + "の勇者を召喚した");
      System.out.println(name + "は、魔王を倒した");
    if(lv > 50) {
      System.out.println("レベル" + lv + "なので倒せました！！！");
    } else {
      System.out.println("レベル" + lv + "なので苦戦しました！！！");
    }
    System.out.println("GAME CLAER!");
  }
}