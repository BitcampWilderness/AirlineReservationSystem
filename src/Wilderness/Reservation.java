package Wilderness;

import java.util.Scanner;

class Reservation {
	static String startplace = "QQQ" ;
	static String arrplace ="ZZZ";
	 static void Reserve(){
		
		//���� ���α׷� ���� ���ϱ� 
		//������ ���ÿ� �°� startplace �� arrplace�� �⺻ �ּҿ��� 3���� ���� �ּҷιٲ� 
		Scanner sc = new Scanner(System.in);
		

		System.out.println("[���� ���α׷�]                                           ");	
		System.out.println("                                             ");	
		System.out.println("            ��� ����                                                ���� ���� ");	
		System.out.println("����������������������������������         ����������������������������������");
		System.out.println("��      "+startplace+"      ��  ---->  ��      "+arrplace+"      ��");    
		System.out.println("����������������������������������         ����������������������������������");
		System.out.println("		                                                        ");

		System.out.println("��ߵ��� ����> 1.��õ 2.����");
		System.out.println("---------------------------------------------------------��");

		String Scity = sc.nextLine();
		if (Scity.equals("1")||Scity.contains("��")) {
			startplace = "ICN";
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println("                                             ");	
			System.out.println("            ��� ����                                                ���� ���� ");	
			System.out.println("����������������������������������         ����������������������������������");
			System.out.println("��      "+startplace+"      ��  ---->  ��      "+arrplace+"      ��");    
			System.out.println("����������������������������������         ����������������������������������");
			System.out.println("		                                                        ");

			
			System.out.println("�������� ����> 1.���� 2.�λ�");
			System.out.println("---------------------------------------------------------��");
			String Acity = sc.nextLine();

			if (Acity.equals("1")||Acity.contains("��")) {
				arrplace = "CJU";
				System.out.println();
				System.out.println();
				System.out.println();
				System.out.println("                                             ");	
				System.out.println("            ��� ����                                                ���� ���� ");	
				System.out.println("����������������������������������         ����������������������������������");
				System.out.println("��      "+startplace+"      ��  ---->  ��      "+arrplace+"      ��");    
				System.out.println("����������������������������������         ����������������������������������");
				System.out.println("		                                                        ");
				
			}
			else if (Acity.equals("2")||Acity.contains("��")) {
				arrplace = "PUS";
				System.out.println();
				System.out.println();
				System.out.println();
				System.out.println("                                             ");	
				System.out.println("            ��� ����                                                ���� ���� ");	
				System.out.println("����������������������������������         ����������������������������������");
				System.out.println("��      "+startplace+"      ��  ---->  ��      "+arrplace+"      ��");    
				System.out.println("����������������������������������         ����������������������������������");
				System.out.println("		                                                        ");
			
			}
		}
		if (Scity.equals("2")||Scity.contains("��")) {
			startplace = "GMP";
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println("                                             ");	
			System.out.println("            ��� ����                                                ���� ���� ");	
			System.out.println("����������������������������������         ����������������������������������");
			System.out.println("��      "+startplace+"      ��  ---->  ��      "+arrplace+"      ��");    
			System.out.println("����������������������������������         ����������������������������������");
			System.out.println("		                                                        ");
			
			System.out.println("�������� ����> 1.���� 2.�λ�");
			System.out.println("---------------------------------------------------------��");
			String Acity2 = sc.nextLine();
			if (Acity2.equals("1")||Acity2.contains("��")) {

				arrplace = "CJU";
				System.out.println();
				System.out.println();
				System.out.println();
				System.out.println("                                             ");	
				System.out.println("            ��� ����                                                ���� ���� ");	
				System.out.println("����������������������������������         ����������������������������������");
				System.out.println("��      "+startplace+"      ��  ---->  ��      "+arrplace+"      ��");    
				System.out.println("����������������������������������         ����������������������������������");
				System.out.println("		                                                        ");
				
				
				System.out.println("---------------------------------------------------------��");

			}else if(Acity2.equals("2")||Acity2.contains("��")) {
					
					arrplace = "PUS";
					System.out.println();
					System.out.println();
					System.out.println();
					System.out.println("                                             ");	
					System.out.println("            ��� ����                                                ���� ���� ");	
					System.out.println("����������������������������������         ����������������������������������");
					System.out.println("��      "+startplace+"      ��  ---->  ��      "+arrplace+"      ��");    
					System.out.println("����������������������������������         ����������������������������������");
					System.out.println("		                                                        ");
				
				}else {
				System.out.println("�ٽ� �Է��� �ּ���");
			}

		
		
		}
		
	
		System.out.println("�����ϱ�->");
		runplane();
}
	static void runplane() {
		SSS2 s = new SSS2();
		s.Plane();
		s.BackPlane();
		s.GBPlane();
		SSS2.runAddExtra();
}
}



