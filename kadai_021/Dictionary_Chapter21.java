package kadai_021;

import java.util.HashMap;

public class Dictionary_Chapter21 {

		public void referer(String[] word) {
			HashMap<String, String> dictionary = new HashMap<>();
			
			String result = "";
			
			dictionary.put("apple", "りんご");
			dictionary.put("peach", "桃");
			dictionary.put("banana", "バナナ");
			dictionary.put("lemon", "レモン");
			dictionary.put("pear", "梨");
			dictionary.put("kiwi", "キウィ");
			dictionary.put("strawberry", "いちご");
			dictionary.put("grape", "ぶどう");
			dictionary.put("muscat", "マスカット");
			dictionary.put("cherry", "さくらんぼ");

			//辞書で調べる
			for (int i = 0; i < word.length; i++) {
				result = dictionary.get(word[i]);

				if (result == null) {
					//調べる英単語が辞書に存在しない場合
					result = word[i] + "は辞書に存在しません";
				} else {
					//調べる英単語が辞書に存在する場合
					result = word[i] + "の意味は" + result;
				}

				System.out.println(result);
			}
		}
}