package Wilderness;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class ImplementsClass implements Payment {
	Field fd = new Field();
	Scanner sc = new Scanner(System.in);
	CustomerSign custSign = new CustomerSign();

	/*
	 * 1.����ī��������� 2.balance - price 3.�Ϸ�ȭ�� ī������� ���������� ����Ǿ����ϴ�. -- ī��������� -- �װ��� :
	 * ���� : ī���ȣ : �Һΰ��� :
	 */
	@Override
	public void card() {
		while (true) {
			try {
				System.out.println("�����Ͻ� ī�� ������ ������ּ���");
				System.out.print("ī���(����,����)�� �Է����ּ��� ex) > ");
				fd.setCardCompany(sc.nextLine());
				System.out.print("ī���ȣ(-���� ���ڸ�)�� �Է����ּ��� > ");
				fd.setCardNum(Long.parseLong(sc.nextLine()));
				System.out.print("ī��޸��� CVC��ȣ 3�ڸ��� �Է����ּ��� > ");
				fd.setCvcNum(Integer.parseInt(sc.nextLine()));
				System.out.println("ī�� ��ȿ�Ⱓ�� �Է����ּ���(mmYY) > ");
				fd.setValidity(Integer.parseInt(sc.nextLine()));
				System.out.print("�Һ� ������ �Է��� �ּ��� > ");
				fd.setInstallment(Integer.parseInt(sc.nextLine()));
			} catch (Exception e) {
				System.out.println("�Է°��� ������ �߸��Ǿ����ϴ�. ���ڷ� �Է����ּ��� ");
				continue;
			}
			break;
		}

		while (true) {
			System.out.println("=======================���� ����=======================");
			System.out.println("�װ���     : ");
			System.out.println("����        : " + fd.getPrice());
			System.out.println("ī���     : " + fd.getCardCompany());
			System.out.println("ī���ȣ  : " + fd.getCardNum());
			System.out.println("CVC��ȣ :" + fd.getCvcNum());
			System.out.println("��ȿ�Ⱓ  : " + fd.getValidity());
			System.out.println("�Һΰ���  : " + fd.getInstallment());
			System.out.println("���������� �Ͻðڽ��ϱ�?");
			System.out.println("  1.Yes   2.No");
			System.out.print("���� > ");

			switch (sc.nextLine()) {
			case "1":
				if (fd.getBalance() < fd.getPrice()) {
					System.out.println("�ܾ��� �����մϴ�. �ٸ� ī��� �������ּ���");
				} else {
					System.out.println("������ �������Դϴ�...");
					fd.setBalance(fd.getBalance() - fd.getPrice());
					System.out.println("������ �Ϸ�Ǿ����ϴ�.");

					System.out.println("=======================���� ����=======================");
					System.out.println("�װ���     : ");// �װ���
					System.out.println("����        :");//
					System.out.println("ī���     : " + fd.getCardCompany());
					System.out.println("ī���ȣ  : " + fd.getCardNum());
					System.out.println("CVC��ȣ :" + fd.getCvcNum());
					System.out.println("��ȿ�Ⱓ  : " + fd.getValidity());
					System.out.println("�Һΰ���  : " + fd.getInstallment());
					System.out.println("���� ���� : " + TimeStamp());
					System.out.println("�������ּż� �����մϴ� �ູ�� ���� �Ǽ���^^");
				}
				break;
			case "2":
				break;
			default:
				System.out.println("�Է°��� �߸��Ǿ����ϴ�. �ٽ��ѹ� Ȯ�����ּ���");
				continue;
			}
			break;
		}
		System.out.println("�����ý����� ����Ǿ����ϴ�.");
		while (true) {
			System.out.println("=====================================================");
			System.out.println("    1.�ѷ�����                   2.����");
			System.out.print("���� > ");
			switch (sc.nextLine()) {
			case "1":
				// ����Ȩ������ ȭ�� �޼ҵ�
				break;
			case "2":
				break;
			default:
				System.out.println("�Է°��� �߸��Ǿ����ϴ�. �ٽ��ѹ� Ȯ�����ּ���");
				continue;
			}
			break;
		}
	}

	/*
	 * �������Ա�
	 */
	@Override
	public void account() {
		Calendar cal = Calendar.getInstance();
		cal.setTime(new Date());
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		cal.add(Calendar.DATE, +3); //3�ϵ� �ð�

		System.out.println("=======================���� ����=======================");
		System.out.println("�Աݰ���     : " + fd.COMPANY_ACCOUNT);
		System.out.println("����           : ");
		System.out.println("�װ���        : ");
		System.out.print("ž���� �̸� : ");
		custSign.informationList(); //�Է¹��� �������� �̸� ��� 
		System.out.println("�Աݱ���     : " + df.format(cal.getTime()) + "����");
		System.out.println();
		System.out.println("��ſ� ���࿡ ���� ���߿� �Բ��� �ּż� �����մϴ�.");
		System.out.println("���� ���õ� ���ѱ��� �Ա����� ���� ��� �ڵ����� ���� ��� ó�� �˴ϴ�.");
		while (true) {
			System.out.println("=====================================================");
			System.out.println("    1.�ѷ�����                   2.����");
			System.out.print("���� > ");
			switch (sc.nextLine()) {
			case "1":
				// ����Ȩ������ ȭ�� �޼ҵ�
				break;
			case "2":
				break;
			default:
				System.out.println("�Է°��� �߸��Ǿ����ϴ�. �ٽ��ѹ� Ȯ�����ּ���");
				continue;
			}
			break;
		}
	}

	//���� ùȭ�� �޼ҵ�
	public void paymentFirstView() {
		System.out.println("----------------------------");
		System.out.println("     �ڡڡڰ��� ����� �����ϼ���ڡڡ�");
		System.out.println();
		System.out.println("    1.ī�����     2.�������Ա�");
		System.out.println("----------------------------");
		System.out.print("���� > ");
	}

	//����ð� ����ִ� �޼ҵ�
	private static String TimeStamp() {
		SimpleDateFormat format = new SimpleDateFormat("yyyy�� MM�� dd�� hh�� mm�� ss��");
		return format.format(new Date());// ���� �ð��� ������ �� �ִ�.
	}
}