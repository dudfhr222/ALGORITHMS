import java.util.LinkedList;
import java.util.Scanner;

//0 1 1 3 2
//4 2 5 3 1

//시작을 왼쪽이 아닌 오른쪽에서 바라봄
//1 
//12
//132
//1324
//13524

public class b2605 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		
		LinkedList<Integer> list = new LinkedList<>();
		for (int i = 0; i < count; i++) {
			int num = sc.nextInt();
			list.add(num,i+1);
		}
		for (int i = count-1; i >= 0; i--) {
			System.out.print(list.get(i) + " ");
		}
		
	}
}