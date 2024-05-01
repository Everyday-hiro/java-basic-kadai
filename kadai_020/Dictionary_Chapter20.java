package kadai_020;

import java.util.HashMap;

public class Dictionary_Chapter20 {
	
	HashMap<String,String> dictinaoryMap = new HashMap<String,String>();
	
public void searchArray(String[] words) {
	dictinaoryMap.put("apple","りんご");
	dictinaoryMap.put("peach","桃");
	dictinaoryMap.put("banana","バナナ");
	dictinaoryMap.put("lemon","レモン");
	dictinaoryMap.put("pear","梨");
	dictinaoryMap.put("kiwi","キウィ");
	dictinaoryMap.put("strawberry","いちご");
	dictinaoryMap.put("grape","ぶどう");
	dictinaoryMap.put("muscat","マスカット");
	dictinaoryMap.put("cherry","さくらんぼ");
	
	for(int i=0; i<words.length; i++) {
		if(dictinaoryMap.containsKey(words[i])) {
			System.out.println(words[i]+"の意味は"+dictinaoryMap.get(words[i]));
		} else {
			System.out.println(words[i]+"は辞書には存在しません");
		}
	}
  }

}
