public class Part01 {
  public static void main (String[] args) {
    putJyosyou();
  }

  static void putJyosyou() {
    String name1 = "王様";
    String name2 = "召喚士";
    
    int lv = (int)(Math.random() * 100 + 1);

    System.out.println("魔王が" + "世界を滅ぼそうとしています！");

    System.out.println(name1 + "は、世界を救うため" + name2 + "に命令を下した！！");
    System.out.println(name2 + "はレベル" + lv + "の勇者を召喚した");

    if(lv > 50) {
      System.out.println("レベル" + lv + "なので余裕で倒せました！！！");
      System.out.println("GAME CLAER!");

    } else if(lv == 25){
      System.out.println("レベル" + lv + "なので苦戦しましたが、なんとか倒せました！！！");
      System.out.println("GAME CLAER!");

    } else {
      System.out.println("レベル" + lv + "なので負けました(ぴえん)");
      System.out.println("GAME OVER!");
    }
  }
}