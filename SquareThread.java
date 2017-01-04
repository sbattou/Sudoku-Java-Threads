public class SquareThread extends Thread {
	private boolean duplicates = false;

	public void run() {
		int[][] array;
		int some = 0;
		Sudoku obj = new Sudoku();
		array = obj.create();

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				some = array[j][i] + some;
			}
		}
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (array[(i * 3)][(j * 3)] == array[(i * 3)][(j * 3) + 1]
						|| array[(i * 3)][(j * 3)] == array[(i * 3)][(j * 3) + 2]
						|| array[(i * 3)][(j * 3)] == array[(i * 3) + 1][(j * 3)]
						|| array[(i * 3)][(j * 3)] == array[(i * 3) + 1][(j * 3) + 1]
						|| array[(i * 3)][(j * 3)] == array[(i * 3) + 1][(j * 3) + 2]
						|| array[(i * 3)][(j * 3)] == array[(i * 3) + 2][(j * 3)]
						|| array[(i * 3)][(j * 3)] == array[(i * 3) + 2][(j * 3) + 1]
						|| array[(i * 3)][(j * 3)] == array[(i * 3) + 2][(j * 3) + 2]
						||

						array[(i * 3)][(j * 3) + 1] == array[(i * 3)][(j * 3) + 2]
						|| array[(i * 3)][(j * 3) + 1] == array[(i * 3) + 1][(j * 3)]
						|| array[(i * 3)][(j * 3) + 1] == array[(i * 3) + 1][(j * 3) + 1]
						|| array[(i * 3)][(j * 3) + 1] == array[(i * 3) + 1][(j * 3) + 2]
						|| array[(i * 3)][(j * 3) + 1] == array[(i * 3) + 2][(j * 3)]
						|| array[(i * 3)][(j * 3) + 1] == array[(i * 3) + 2][(j * 3) + 1]
						|| array[(i * 3)][(j * 3) + 1] == array[(i * 3) + 2][(j * 3) + 2]
						||

						array[(i * 3)][(j * 3) + 2] == array[(i * 3) + 1][(j * 3)]
						|| array[(i * 3)][(j * 3) + 2] == array[(i * 3) + 1][(j * 3) + 1]
						|| array[(i * 3)][(j * 3) + 2] == array[(i * 3) + 1][(j * 3) + 2]
						|| array[(i * 3)][(j * 3) + 2] == array[(i * 3) + 2][(j * 3)]
						|| array[(i * 3)][(j * 3) + 2] == array[(i * 3) + 2][(j * 3) + 1]
						|| array[(i * 3)][(j * 3) + 2] == array[(i * 3) + 2][(j * 3) + 2]
						||

						array[(i * 3) + 1][(j * 3)] == array[(i * 3) + 1][(j * 3) + 1]
						|| array[(i * 3) + 1][(j * 3)] == array[(i * 3) + 1][(j * 3) + 2]
						|| array[(i * 3) + 1][(j * 3)] == array[(i * 3) + 2][(j * 3)]
						|| array[(i * 3) + 1][(j * 3)] == array[(i * 3) + 2][(j * 3) + 1]
						|| array[(i * 3) + 1][(j * 3)] == array[(i * 3) + 2][(j * 3) + 2]
						||

						array[(i * 3) + 1][(j * 3) + 1] == array[(i * 3) + 1][(j * 3) + 2]
						|| array[(i * 3) + 1][(j * 3) + 1] == array[(i * 3) + 2][(j * 3)]
						|| array[(i * 3) + 1][(j * 3) + 1] == array[(i * 3) + 2][(j * 3) + 1]
						|| array[(i * 3) + 1][(j * 3) + 1] == array[(i * 3) + 2][(j * 3) + 2]
						||

						array[(i * 3) + 1][(j * 3) + 2] == array[(i * 3) + 2][(j * 3)]
						|| array[(i * 3) + 1][(j * 3) + 2] == array[(i * 3) + 2][(j * 3) + 1]
						|| array[(i * 3) + 1][(j * 3) + 2] == array[(i * 3) + 2][(j * 3) + 2]
						||

						array[(i * 3) + 2][(j * 3)] == array[(i * 3) + 2][(j * 3) + 1]
						|| array[(i * 3) + 2][(j * 3)] == array[(i * 3) + 2][(j * 3) + 2]
						|| array[(i * 3) + 2][(j * 3) + 1] == array[(i * 3) + 2][(j * 3) + 2]) {
					duplicates = true;
				}
			}
		}
		if (some == 45 && duplicates == false) {
			System.out.println("Square is Good");
		} else {
			System.out.println("Square is Bad");

		}
		some = 0;
	}
}
