
public class RightTriangle {
	public static void main(String args[]) {
		int row = 5;
		for (int i = row; i >= 1; i--) {
			for (int j = row; j > i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		for (int i = 0; i  <  5; i++) {
            for (int j = 5; j  >  i; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k  <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
	}
}
