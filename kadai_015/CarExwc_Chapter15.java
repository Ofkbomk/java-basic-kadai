package kadai_015;

public class CarExwc_Chapter15 {
    public static void main(String[] args) {
        // 車クラスのインスタンス
        Car_Chapter15 car = new Car_Chapter15();

        // ギア変更
        car.gearChange(3);

        // ギアチェンジ後の速度を表示
        car.run();
    }
}