package Wilderness;

import java.util.Scanner;

public class SSS2 {
	static int price = 0;
	
	Scanner sc = new Scanner(System.in);
	static String Go = "���� �������� �ʾҽ��ϴ�.";
	static String Back = "���� �������� �ʾҽ��ϴ�.";
	
	String f1 = "��� 7:00~ ���� 9:00";
	String f2 = "��� 10:00~ ���� 13:00";
	String f3 = "��� 16:00~ ���� 18:00";
	String g = "�����������";
	String c = "�����������";
	int p1 = 70000;
	int p2 = 80000;
	int p3 = 90000;
	int p4 = 100000;
	int p5 = 110000;
	
	

	
	//������ �����	
	//����� ������ price �� ����ȴ�.
	//price�� Total Ŭ�������� �� ����ݾ� allPrice�� ��������. 
	public void Plane() {
		try {
		System.out.println();
		System.out.println();
		System.out.println("������ ����� ");
		System.out.println("time table");
		System.out.println("1.");
		System.out.println("�Ǧ���������������������������������������������������������������������������������������");
		System.out.println("	��� 7:00~ ���� 9:00"         );
		System.out.println("�Ŧ���������������������������������������������������������������������������������������");
		System.out.println("2.");
		System.out.println("�Ǧ���������������������������������������������������������������������������������������");
		System.out.println("	��� 10:00~ ���� 13:00");
		System.out.println("�Ŧ���������������������������������������������������������������������������������������");
		System.out.println("3.");
		System.out.println("�Ǧ���������������������������������������������������������������������������������������");
		System.out.println("	��� 16:00~ ���� 18:00");
		System.out.println("�Ŧ���������������������������������������������������������������������������������������");
		
		System.out.println();
		System.out.println("�̿��Ͻ� �������� ������ �ּ���");
		String num=sc.nextLine();
		if(num.equals("1")) {
			Go = "��� 7:00~ ���� 9:00";
			price += 100000;
			
			System.out.println();
			System.out.println("��� 7:00~ ���� 9:00 ���� �̿��մϴ�. ����:"+price+"��");
		}else if (num.equals("2")){
			Go = "��� 10:00~ ���� 13:00";
			price += 110000;
		
			System.out.println();
			System.out.println("��� 7:00~ ���� 9:00 ���� �̿��մϴ�. ����:"+price+"��");
		}else if (num.equals("3")){
			Go = "��� 16:00~ ���� 18:00";
			price += 90000;
			
			System.out.println();
			System.out.println("��� 7:00~ ���� 9:00 ���� �̿��մϴ�. ����:"+price+"��");
		}
		}catch(Exception e) {e.printStackTrace();}
	}
	
	//������ ����� 
	//����� ������ price �� ����ȴ�.
	//price�� Total Ŭ�������� �� ����ݾ� allPrice�� ��������. 
	public void BackPlane() {
		try {
		System.out.println();
		System.out.println();
		System.out.println("������ ����� ");
		System.out.println("time table");
		System.out.println("1.");
		System.out.println("�Ǧ���������������������������������������������������������������������������������������");
		System.out.println("	��� 7:00~ ���� 9:00"         );
		System.out.println("�Ŧ���������������������������������������������������������������������������������������");
		System.out.println("2.");
		System.out.println("�Ǧ���������������������������������������������������������������������������������������");
		System.out.println("	��� 10:00~ ���� 13:00");
		System.out.println("�Ŧ���������������������������������������������������������������������������������������");
		System.out.println("3.");
		System.out.println("�Ǧ���������������������������������������������������������������������������������������");
		System.out.println("	��� 16:00~ ���� 18:00");
		System.out.println("�Ŧ���������������������������������������������������������������������������������������");
		
		System.out.println();
		System.out.println("�̿��Ͻ� �������� ������ �ּ���");
		String num=sc.nextLine();
		if(num.equals("1")) {
			Back = "��� 7:00~ ���� 9:00";
			price += 100000;
			
			System.out.println();
			System.out.println("��� 7:00~ ���� 9:00 ���� �̿��մϴ�. ����:"+price+"��");
		}else if (num.equals("2")){
			Back = "��� 10:00~ ���� 13:00";
			price += 110000;
		
			System.out.println();
			System.out.println("��� 7:00~ ���� 9:00 ���� �̿��մϴ�. ����:"+price+"��");
		}else if (num.equals("3")){
			Back = "��� 16:00~ ���� 18:00";
			price += 90000;
			
			System.out.println();
			System.out.println("��� 7:00~ ���� 9:00 ���� �̿��մϴ�. ����:"+price+"��");
		}
		}catch(Exception e) {e.printStackTrace();}
	}
		
		void GBPlane () {
		System.out.println();
		System.out.println("");
		System.out.println("�̿��Ͻô� ��������\n������ �����"+Go+"\n������ �����"+Back+"�Դϴ�.");
		System.out.println();
		System.out.println("�� �����ݾ��� "+price+"�� �Դϴ�.");
		System.out.println("�߰�����â���� �Ѿ�ϴ�.");
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		}
		
		static void runAddExtra() {
			AddExtra ae= new AddExtra();
			ae.addFood();
			ae.addBaggage();
			ae.total();
			AddExtra.runSeat();
	}
	}




	