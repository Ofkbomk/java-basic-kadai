package text.kadai_00018;

public class KatoExec_Chapter18 {
 public static void main(String[] args) {
     // インスタンスを作成
     KatoTaro_Chapter18 taro = new KatoTaro_Chapter18("加藤", "東京都中野区〇×");
     KatoIchiro_Chapter18 ichiro = new KatoIchiro_Chapter18("加藤", "東京都中野区〇×");
     KatoHanako_Chapter18 hanako = new KatoHanako_Chapter18("加藤", "東京都中野区〇×");

     // 紹介を実行
     taro.execIntroduce();
     System.out.println(); 
     ichiro.execIntroduce();
     System.out.println(); 
     hanako.execIntroduce();
 }
}
