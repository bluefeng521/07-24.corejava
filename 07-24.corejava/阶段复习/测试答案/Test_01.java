package ���Դ�;

public class Test_01 {
	static public void main(String  args) {

		loop1: for (int i = 0; i < 3; i++) {
			loop2: for (int j = 0; j < 3; j++) {
				if (i == j) {
					continue loop2;
				}
				System.out.println("i = " + i + " j = " + j);
			}
		}
	}
}
