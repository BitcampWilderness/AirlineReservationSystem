package Wilderness;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class csQA {

	static void customercenter() throws IOException {
		int num = 0;
		boolean play = true;
				System.out.println(" 1. Ȩ���������� �̸� �¼��� ������ �� �ֳ���?\n " + "2. ���� ��� ��û, ����, ������ ��� �ؾ� �ϳ���?\n "
						+ "3. Ȩ���������� ���� ���ϸ����� �ջ��ϴ� ����� �˰� �;��\n " + "4. Ȩ���������� �¼� ������ ��𿡼� �� �� �ֳ���?\n "
						+ "5. ��ī���н� ���ϸ����� ����ϸ� � ���񽺳� ��ǰ�� �̿��� �� �ֳ���?\n " + "6. 1:1�����ϱ�\n" + " 7. ����\n");
				while (play) {
					try {
				Scanner sc = new Scanner(System.in);

				System.out.println();
				System.out.print("������ �������ּ���> ");
				num = sc.nextInt();

				switch (num) {

				case 1:

					System.out.println("1. Ȩ���������� �̸� �¼��� ������ �� �ֳ���?");
					System.out.println("��, �����մϴ�.");
					break;
				case 2:
					System.out.println("2. ���� ��� ��û, ����, ������ ��� �ؾ� �ϳ���?");
					System.out.println("��, �����մϴ�.");
					break;
				case 3:
					System.out.println("3. Ȩ���������� ���� ���ϸ����� �ջ��ϴ� ����� �˰� �;��.");
					System.out.println("��, �����մϴ�.");
					break;
				case 4:
					System.out.println("4. Ȩ���������� �¼� ������ ��𿡼� �� �� �ֳ���?");
					System.out.println("��, �����մϴ�.");
					break;
				case 5:
					System.out.println("5. ��ī���н� ���ϸ����� ����ϸ� � ���񽺳� ��ǰ�� �̿��� �� �ֳ���?");
					System.out.println("��, �����մϴ�.");
					break;
				case 6:

					BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
					String str;

					System.out.print("������ �Է��Ͽ� �ּ��� >");

					str = br.readLine();
					// System.out.println(str);

					BufferedOutputStream bs = null;
					try {
						bs = new BufferedOutputStream(new FileOutputStream("C:\\Temp\\Output.txt"));

						bs.write(str.getBytes()); // Byte�����θ� ���� �� ����

					} catch (IOException e) {
						System.out.println("�߸��� �Է��Դϴ�. �ٽ� �����Ͽ� �ּ���");
						// e.getStackTrace();

					} finally {
						System.out.println("����ó���Ǿ����ϴ�. ");
						bs.close();
					}
					break;
				case 7:
					play = false;
				}
			} catch (Exception e) {
				System.out.println("�߸��� �Է��Դϴ�. �ٽ� �Է��ϼ���.");
			}

		}

	}
	public static void main(String[] args) throws IOException {
		customercenter();
	}
}