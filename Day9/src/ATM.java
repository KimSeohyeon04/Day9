import java.util.Scanner;

public class ATM {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int MAX = 5;

		int[] arId = new int[MAX]; // ���̵�
		int[] arPw = new int[MAX]; // ���
		int[] arMoney = new int[MAX];

		int count = 0;
		int log = -1;

		while (true) {
			String menu = "=== �ް�IT ATM ===\n";
			menu += "1.ȸ������\n2.ȸ��Ż��\n3.�α���\n4.�α׾ƿ�\n";
			menu += "5.�Ա�\n6.��ü\n7.�ܾ���ȸ\n8.��������\n0.����";
			System.out.println(menu);

			System.out.println("�޴��� �������ּ���.");

			int select = sc.nextInt();

			if (select == 1) // ȸ������
			{
				System.out.println("Id�� �Է����ּ���.");
				int Id = sc.nextInt();

				int check = 1;

				for (int i = 0; i < count; i++) {
					if (arId[i] == Id) {
						check = -1;
					}
				}
				if (check == -1) {
					System.out.println("�ߺ��Ǿ��ִ� Id�Դϴ�.");
				} else {
					System.out.println("Pw�� �Է����ּ���.");
					int Pw = sc.nextInt();

					for (int i = 0; i < count; i++) {
						if (arPw[i] == Pw) {
							check = -1;
						}
					}
					arId[count] = Id;
					arPw[count] = Pw;
					arMoney[count] = 1000; // ���� �� �� 1000�� �ο�
					count++;
					System.out.println(Id + " �� ȸ�������� ���������� �̷�������ϴ�.");
				}
			}
			else if (select == 2) // ȸ��Ż��
			{
				if (log == -1) // �α��� �ƴ� ��
				{
					System.out.println("�α��� �� ��� �ٶ��ϴ�.");
					System.out.println();
				} else { // �α��� �� ��
					for (int i = log; i < count-1; i++) {
						arId[i] = arId[i + 1];
						arPw[i] = arPw[i + 1];
						arMoney[i] = arMoney[i + 1];
					}
					System.out.println("ȸ���� Ż��Ǿ����ϴ�.");
					System.out.println();
					count--;
					log = -1;
				}
			}
			else if (select == 3) // �α���
			{
				if(log == -1)
				{
					System.out.println("Id�� �Է����ּ���");
					int Id = sc.nextInt();
					
					int check = -1;
					
					for (int i = 0; i < count; i++) {
						if (arId[i] == Id) {
							check = 1;
						}
					}
				}
				else
				{
					
				}
			}
		}
	}
}
