package text.kadai_00018;

public abstract class Kato_Chapter18 {

	
	//フィールド
	public String familyName;
	public String givenName;
	public String address;
	
	//共通
	public void commonIntroduce() {
		System.out.println("名前は"+ familyName + givenName + "です");
		System.out.println("住所は" + address + "です");
	}
	
	//個別
	public abstract void eachIntroduce();
	
	//
    public void execIntroduce() {
        commonIntroduce();  // まず共通の紹介を呼び出す
        eachIntroduce();    // 次に個別の紹介を呼び出す
    }

}
