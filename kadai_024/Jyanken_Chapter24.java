package kadai_024;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter24 {

	//自分のじゃんけんの手を入力する
	public String getMyChoice() {
		
		Scanner scanner = new Scanner(System.in);
		String janken;
		
		while(true) {
			
			System.out.println("自分のじゃんけんの手を入力しましょう");
			System.out.println("グーはrockのrを入力しましょう");
			System.out.println("チョキはscissorsのsを入力しましょう");
			System.out.println("パーはpaperのpを入力しましょう");
			
			janken = scanner.next();
			System.out.println(janken);
			
			if(janken.equals("r") || janken.equals("s") || janken.equals("p"))	{
				break;
			}else {
				System.out.println("エラー");
			}
		}
		
		scanner.close();
		return janken;
	}
	
	//対戦相手のじゃんけんの手を乱数で選ぶ
	public String getRandom() {
		String[] yourJyanken = {"r", "s", "p"};
		
		String Rondom = yourJyanken[(int)Math.floor(Math.random()*3)];
		
		return Rondom;
	}
	
	//じゃんけんを行う
	public void playGame() {
		
		String choice = getMyChoice();
		String random = getRandom();
		
		HashMap<String,String> goJyanken = new HashMap<String,String>();
			
		goJyanken.put("r","グー");
		goJyanken.put("s", "チョキ");
		goJyanken.put("p", "パー");
		
		System.out.println("自分の手は"+goJyanken.get(choice)+",対戦相手の手は"+goJyanken.get(random));
	    if(choice.equals("r") && random.equals("r") || choice.equals("s") && random.equals("s")
	    		|| choice.equals("p") && random.equals("p")) {
	    	System.out.println("あいこです");
	    } else if (choice.equals("r") && random.equals("s")) {
	    	System.out.println("自分の勝ちです");
	    }else if (choice.equals("r") && random.equals("p")) {
	    	System.out.println("自分の負けです");
	    }else if (choice.equals("s") && random.equals("r")) {
	    	System.out.println("自分の負けです");
	    }else if (choice.equals("s") && random.equals("p")) {
	    	System.out.println("自分の勝ちです");
	    }else if (choice.equals("p") && random.equals("r")) {
	    	System.out.println("自分の勝ちです");
	    }else if (choice.equals("p") && random.equals("s")) {
	        System.out.println("自分の負けです");
	    }
	};
}
