package text.kadai_00018;

public class KatoHanako_Chapter18 extends Kato_Chapter18 {
	//コンストラクタで設定
	  public KatoHanako_Chapter18(String familyName, String address) {
	        this.familyName = familyName;
	        this.address = address;
	        setGivenName();  // givenName の設定
	    }
	  
	  public void setGivenName() {
		  this.givenName = "花子";
	  }
	  
	  @Override
	  public void eachIntroduce() {
		  System.out.println("趣味は読書です");
	  }

}
