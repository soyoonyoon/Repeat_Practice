package code;

public class MainDrive {
	
	public static void main(String[] args) {
		
// 	1. 12345를 5번 반복
		
//		12345
//		12345
//		12345
//		12345
//		12345
		
//		for (int j = 0; j < 5; j++) {
//			for (int i= 0; i<5; i++) {
//			
//				System.out.print(i+1);
//			
//			}
//			System.out.println();
//			
//		}
		
		
		/*
		 * // 바깥에 위치하는 for문 => 상대적으로 느리게 반복. // 문제에서는 가로세로 중 => 세로 줄바꿈을 담당! for (int i =
		 * 0; i < 5; i++) {
		 * 
		 * // 바쁘게 돌아가는 반복을 안쪽에 중첩. // 문제에서는 가로로 숫자를 찍는 역할을 담당. for (int j = 0; j < 5;
		 * j++) { System.out.print(j+1); }
		 * 
		 * // 가로로 1~5를 찍고나면, 줄을 바꿈. System.out.println();
		 * 
		 * }
		 */
		
		
		
//		2. 구구단 2단까지 찍기 => 2~9단까지 출력하기
//		2 x 1 = 2
//		2 x 2 = 4
//		2 x 3 = 6
//		...
//		9 x 9 =81
		
//		반복요소 2개.
//		1)각 단의 내용을 출력
//		 - 2 * 1 = 2, 2 * 2 = 4 
//		2)단 자체를 출력
//		 - 3 * 1 = 3, 4 * 1 =4
//		둘중 뭐가 더 바쁜가? 1) 반복이 더 바쁨 => 안으로 들어감. : j
//		2) 반복을 먼저 작성 : i
		
//		단 자체를 담당. i
		for (int i = 2; i <= 9; i++) {
			
//			각 단의 내용을 출력 :j
			for (int j = 1; j <= 9 ; j++) {
//				String.format과 i,j를 이용해서 상황에 맞는 문장 출력.
				System.out.println(String.format("%d x %d = %d", i, j, i*j));
				
			}
			
		}
		
		
		
	}

}
