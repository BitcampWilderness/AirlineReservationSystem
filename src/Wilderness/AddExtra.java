package Wilderness;

import java.util.Scanner;

public class AddExtra {

	static String Food = "堅腦雖 彊懊蝗棲棻." ;
	static String Baggage = "堅腦雖 彊懊蝗棲棻." ;

	public Scanner sc = new Scanner(System.in);

	
	static int addPrice  = 0;
	
//	System.out.println("牟收收收收收收收收收收收收收收收收收收收收收收收收收收收Gwangya AirLine收收收收收收收收收收收收收收收收收收收收收收收收收收收汕"); 
//	System.out.println("汎收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收汛");	
	
	//晦頂衝 蹺陛
	//晦頂衝擊 蹺陛ж賊 高檜 addPrice縑 盪濰脹棻 
	//addPrice 朝 Total 贗楚蝶縑憮 識 唸營旎擋 allPrice縑 渦п霞棻.
	public void addFood()	{
		try {
		System.out.println("晦頂衝擊 蹺陛м棲棻.");
			
		System.out.println("牟收收收收收收收收收收收收收收收收收收收收收收收收收收收收收恇撖    AirLine收收收收收收收收收收收收收收收收收收收收收收收收收收收收收汕"); 
		System.out.println();
		System.out.println("   1.> 橾奩衝  |2.> 橫萼檜衝 |3.> 盪膩衝 |4.> й塒衝 |5.> 綠勒衝|6.>蹺陛ж雖彊朝棻.");
		System.out.println();
		System.out.println("汎收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收汛");
		System.out.printf("摹鷗 >");
		
		

		
		
		String num2 =sc.nextLine();
		
		if(num2.equals("1")||num2.contains("橾奩")) {
			Food = "橾奩衝";
			System.out.println("牟收收收收收收收收收收收收收收收收收收收收收收收收收收收收收恇撖    AirLine收收收收收收收收收收收收收收收收收收收收收收收收收收收收收汕"); 
			System.out.println();
			System.out.println("		           橾奩衝擊 蹺陛м棲棻  price : 10000錳");
			System.out.println();
			System.out.println("汎收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收汛");
			addPrice += 10000;
			
			
		}else if(num2.equals("2")||num2.contains("橫萼檜")) {
			Food = "橫萼檜衝";
			System.out.println("牟收收收收收收收收收收收收收收收收收收收收收收收收收收收收收恇撖    AirLine收收收收收收收收收收收收收收收收收收收收收收收收收收收收收汕");
			System.out.println();
			System.out.println("			橫萼檜衝擊 蹺陛м棲棻  price : 8000錳");
			System.out.println();
			System.out.println("汎收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收汛");
			addPrice += 8000;
			
		}else if(num2.equals("3")||num2.contains("盪膩")) {
			Food = "盪膩衝";
			System.out.println("牟收收收收收收收收收收收收收收收收收收收收收收收收收收收收收恇撖    AirLine收收收收收收收收收收收收收收收收收收收收收收收收收收收收收汕"); 
			System.out.println();
			System.out.println("			盪膩衝擊 蹺陛м棲棻  price : 11000錳");
			System.out.println();
			System.out.println("汎收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收汛");
			addPrice += 11000;
			
		}else if(num2.equals("4")||num2.contains("й塒")) {
			Food = "й塒衝";
			System.out.println("牟收收收收收收收收收收收收收收收收收收收收收收收收收收收收收恇撖    AirLine收收收收收收收收收收收收收收收收收收收收收收收收收收收收收汕"); 
			System.out.println();
			System.out.println("			й塒衝擊 蹺陛м棲棻  price : 9000錳");
			System.out.println();
			System.out.println("汎收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收汛");
			addPrice += 9000;
			
		}else if(num2.equals("5")||num2.contains("綠勒")) {
			Food = "綠勒衝";
			System.out.println("牟收收收收收收收收收收收收收收收收收收收收收收收收收收收收收恇撖    AirLine收收收收收收收收收收收收收收收收收收收收收收收收收收收收收汕");
			System.out.println();
			System.out.println("			綠勒衝擊 蹺陛м棲棻  price : 8000錳");
			System.out.println();
			System.out.println("汎收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收汛");
			addPrice += 8000;
		}else {
			Food = "晦頂衝 蹺陛 橈擠";
			System.out.println(">蹺陛ж雖 彊朝棻.");
		
			}
	
	}catch(Exception e) {e.printStackTrace();}
	}
		

	public void addBaggage()	{
		try {
			System.out.println();
			System.out.println();
		System.out.println("NEXT");
		System.out.println();
		System.out.println();
		System.out.println("熱�食偯� 蹺陛 м棲棻.");
		System.out.println("牟收收收收收收收收收收收收收收收收收收收收收收收收收收收收收恇撖    AirLine收收收收收收收收收收收收收收收收收收收收收收收收收收收收收汕");
		System.out.println();
		System.out.println("		1. 蹺陛 熱�食� 10kg |2. 蹺陛 熱�食� 15kg |3. 摹鷗ж雖 彊朝棻.");
		System.out.println();
		System.out.println("汎收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收汛");

		
		String num3 =sc.nextLine();
		if(num3.equals("1")||num3.contains("10")) {
			Baggage = "蹺陛 熱�食� 10kg" ;
			System.out.println("牟收收收收收收收收收收收收收收收收收收收收收收收收收收收收收恇撖    AirLine收收收收收收收收收收收收收收收收收收收收收收收收收收收收收汕");
			System.out.println();
			System.out.println("		蹺陛熱�食� 10kg擊 蹺陛м棲棻. price : 50000錳");
			System.out.println();
			System.out.println("汎收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收汛");
			addPrice += 50000;
		}else if(num3.equals("2")||num3.contains("15")) {
			Baggage = "蹺陛 熱�食� 15kg" ;
			System.out.println("牟收收收收收收收收收收收收收收收收收收收收收收收收收收收收收恇撖    AirLine收收收收收收收收收收收收收收收收收收收收收收收收收收收收收汕");
			System.out.println();
			System.out.println("		蹺陛熱�食� 15kg擊 蹺陛м棲棻. price : 70000錳");
			System.out.println();
			System.out.println("汎收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收汛");
			addPrice += 70000;
		}else{
			Baggage = "蹺陛 熱�食� 橈擠" ;
			System.out.println(">熱�食偯� 蹺陛ж雖 彊蝗棲棻.");
		}
		
	}catch(Exception e) {e.printStackTrace();}
	}
	
	
	public void total()	{	
	System.out.println();
	System.out.println();
	System.out.println();
	System.out.println("忙				忖");
	System.out.println("	蹺陛蹂旎擎 "+addPrice+ "錳 殮棲棻.");
	System.out.println("戌				戎");
	System.out.println();
	
	
}
	static void runSeat() {
		Seat st = new Seat();
		st.upSeat();
		Seat.total();
}
	
}


