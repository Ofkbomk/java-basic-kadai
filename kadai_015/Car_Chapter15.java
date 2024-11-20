package kadai_015;

public class Car_Chapter15 {

    private int gear = 1;  // 初期ギアは1速
    private int speed = 10; // 初期速度は10km/h

    // ギアチェンジメソッド
    public void gearChange(int afterGear) {
        gear = afterGear;  // ギアを変更

        switch (gear) {
            case 1:
                speed = 10;
                break;
            case 2:
                speed = 20;
                break;
            case 3:
                speed = 30;
                break;
            case 4:
                speed = 40;
                break;
            case 5:
                speed = 50;
                break;
            default:
                speed = 10; // 1〜5以外のギア デフォルトで時速10km
                break;
        }
    }

    // 走行メソッド（速度を表示）
    public void run() {
        System.out.println("ギアは " + gear + " 速で、時速 " + speed + " km で走行中");
    }
}
