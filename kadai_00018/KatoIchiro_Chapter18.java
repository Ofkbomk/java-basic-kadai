package text.kadai_00018;

public class KatoIchiro_Chapter18 extends Kato_Chapter18 {
//	コンストラクタで設定
	   public KatoIchiro_Chapter18(String familyName, String address) {
	        this.familyName = familyName;
	        this.address = address;
	        setGivenName();  // givenName の設定
	    }
	   
	   public void setGivenName() {
		   this.givenName = "一郎";
	   }
	   
	   @Override
	   public void eachIntroduce () {
		   System.out.println("好きな食べ物はリンゴです");
	   }

}
