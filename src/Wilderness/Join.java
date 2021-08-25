package Wilderness;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Join {

	Scanner sc = new Scanner(System.in);
	List<MemberMNG> members = new ArrayList<>();
	
	encryption secret = new encryption();
	
//	public Join() {
//		members.add(new MemberMNG("admin", "admin", "Nam Ju"));
//	}

	//����޼ҵ�
	public void run() {
		int key = 0;
		while (true) {
			try {
				key = menu();
				switch (key) {
				case 1:
					Login();
					break;
				case 2:
					MemberJoin();
					break;
				case 0:
					System.out.println("~~~~~~~�߰���~~~~~~~���� �ؾ��~~~~~");
					break;
				default:
					System.out.println("�߸��� �Է°��Դϴ�.�ٽ� �Է��ϼ���");

				}
			} catch (Exception e) {
				System.out.println("�߸��Է��Ͽ����ϴ�. �ٽ� �Է��ϼ���");
				continue;
			}
				break;
		}

	}

	//ȸ������
	private void MemberJoin() {
		//int count =0;
		while(true) {
			String id = getStrInput("              ID : ");
			if (idCheck(id)) {
				System.out.println("�ߺ��� ID�Դϴ�.");
				continue;
			}
			
			String pw = getStrInput("         PassWord : ");
			String pw2 = getStrInput("Password Confirm : ");
			
			//pw, pwcheck�� �������� Ȯ��
			if(pw.equals(pw2)) {
				String name = getStrInput("           Name : ");
				
				String salt = secret.Salt();
				//System.out.println("(salt ���� �Ϸ�=" + salt + ")");
				String pw_encrypt = secret.SHA512(pw, salt);
				
				
				members.add(new MemberMNG(id, pw_encrypt, name));
				System.out.println(id + "�� ������ ���ϵ帳�ϴ�.");
				break;
				//���� ui�� ������ ��
			}else {
				System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�. Ȯ�����ּ���.");
			}
		}
	}

	//id �ߺ��˻� �� check�� ��ȯ
	private boolean idCheck(String id) {
		boolean check = true;
		MemberMNG member = FindById(id);
		if (member == null)
			check = false;
		return check;
	}

	private int Login() {
		int count=0;
		String id = getStrInput("      ID : ");
		String pw = getStrInput("PassWord : ");
		String salt = secret.Salt();
		// ��ȣȭ
		String pw_decrypt = secret.SHA512(pw, salt);
		
		MemberMNG member = FindById(id);
		if (member == null) {
			System.out.println("��ϵ��� ���� ID�Դϴ�.");
			Login();
			
		} else if (member.getPW().equals(pw_decrypt)) {
			System.out.println("[" + member.getID() + "]�Բ��� �α��� �ϼ̽��ϴ�.");
			
			count++;
			// ���� ui�� ������ ��
		} else {
			System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�.");
			pw = getStrInput("PassWord : ");
			if(member.getPW().equals(pw_decrypt)|| member.getPW().equals(pw)) {
				System.out.println("[" + member.getID() + "]�Բ��� �α��� �ϼ̽��ϴ�.");
				count++;
				// ���� ui�� ������ ��
			}
		}
		return count;
	}

	//id�� �ߺ��� �����ִٸ� �װ��� return �ƴ϶��null
	private MemberMNG FindById(String id) {
		for (MemberMNG memberDTO : members) {
			if (memberDTO.getID().equals(id)) {
				return memberDTO;
			}
		}
		return null;
	}

	//������� �Է��� �޾��ִ� �޼ҵ�
	private String getStrInput(String msg) {
		System.out.print(msg);
		return sc.nextLine();
	}
	
	//�޴��� �޴����� ����� �Է±��� �޾ƿͼ� choice�� return
	private int menu() throws NumberFormatException {
		System.out.println("       [1]�α��� [2]ȸ������ [0]����");
		int choice = 0;
		choice = Integer.parseInt(sc.nextLine());
		return choice;
	}
}