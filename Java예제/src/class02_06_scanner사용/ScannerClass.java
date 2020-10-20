package class02_06_scanner사용;

import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		boolean inMainMenu = true;
		while(inMainMenu) {
			System.out.println("(I)ntro (C)ourse (E)xit");
			String ch = s.next();
			
			switch(ch) {
				case "I":
				case "i":
					System.out.println("안녕하세요! 우리는 코드잇입니다.");
					System.out.println("함께 공부합시다!");
					break;
				case "C":
				case "c":
					
					boolean inCourseMenu = true;
					while(inCourseMenu) {
						System.out.println("코드잇 수업을 소개합니다.");
						System.out.println("(P)ython (J)ava (i)OS (B)ack");
						String ch2 = s.next();
						
						switch(ch2) {
							case "p":
							case "P":
								System.out.println("Python 언어를 통해 컴퓨터 사이언스의 기초를 배웁니다.");
								System.out.println("강사: 강영훈");
								System.out.println("추천 선수과목: 없음");
							break;
						
							case "J":
							case "j":
								System.out.println("Java의 기본 문법과 객체지향적 프로그래밍을 배웁니다.");
								System.out.println("강사: 김신의");
								System.out.println("추천 선수과목: Python");
							break;
						
							case "I":
							case "i":
								System.out.println("최신 Swift언어를 통해 iOS 개발을 시작할 수 있습니다.");
								System.out.println("강사: 성태호");
								System.out.println("추천 선수과목: Python, Java");
							break;
						
							case "B":
							case "b":
								inCourseMenu = false;
								break;
							default:
								System.out.println("다시 입력해 주세요.");
								break;
						}
					}
				case "E":
				case "e":
					System.out.println("안녕히 가세요.");
					inMainMenu = false;
				break;
					}

			}
		}
}