package text.kadai_00018;

public class KatoTaro_Chapter18 extends Kato_Chapter18 {
//	コンストラクタで名前と住所を設定
	public KatoTaro_Chapter18(String familyName, String address) {
		this.familyName = familyName;
		this.address = address;
		setGivenName();//★
}
	//★
	public void setGivenName() {
		this.givenName = "太郎";
	}
	
	@Override
	public void eachIntroduce() {
		System.out.println("Javaが得意です");
	}
	
}
