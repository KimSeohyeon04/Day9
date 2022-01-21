import java.util.Scanner;

public class ATM {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int MAX = 5;

		int[] arId = new int[MAX]; // 아이디
		int[] arPw = new int[MAX]; // 비번
		int[] arMoney = new int[MAX];

		int count = 0;
		int log = -1;

		while (true) {
			String menu = "=== 메가IT ATM ===\n";
			menu += "1.회원가입\n2.회원탈퇴\n3.로그인\n4.로그아웃\n";
			menu += "5.입금\n6.이체\n7.잔액조회\n8.개인정보\n0.종료";
			System.out.println(menu);

			System.out.println("메뉴를 선택해주세요.");

			int select = sc.nextInt();

			if (select == 1) // 회원가입
			{
				System.out.println("Id를 입력해주세요.");
				int Id = sc.nextInt();

				int check = 1;

				for (int i = 0; i < count; i++) {
					if (arId[i] == Id) {
						check = -1;
					}
				}
				if (check == -1) {
					System.out.println("중복되어있는 Id입니다.");
				} else {
					System.out.println("Pw를 입력해주세요.");
					int Pw = sc.nextInt();

					for (int i = 0; i < count; i++) {
						if (arPw[i] == Pw) {
							check = -1;
						}
					}
					arId[count] = Id;
					arPw[count] = Pw;
					arMoney[count] = 1000; // 가입 시 돈 1000원 부여
					count++;
					System.out.println(Id + " 님 회원가입이 정상적으로 이루어졌습니다.");
				}
			}
			else if (select == 2) // 회원탈퇴
			{
				if (log == -1) // 로그인 아닐 때
				{
					System.out.println("로그인 후 사용 바랍니다.");
					System.out.println();
				} else { // 로그인 일 때
					for (int i = log; i < count-1; i++) {
						arId[i] = arId[i + 1];
						arPw[i] = arPw[i + 1];
						arMoney[i] = arMoney[i + 1];
					}
					System.out.println("회원이 탈퇴되었습니다.");
					System.out.println();
					count--;
					log = -1;
				}
			}
			else if (select == 3) // 로그인
			{
				if(log == -1)
				{
					System.out.println("Id를 입력해주세요");
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
