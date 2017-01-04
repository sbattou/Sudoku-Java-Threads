class RowThread extends Thread {

	private boolean duplicates = false;

	public void run() {
		int[][] array;
		int some = 0;
		Sudoku obj = new Sudoku();
		array = obj.create();

		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				some = array[i][j] + some;
			}

			for (int j = i + 1; j < 9; j++) {
				if (array[i] == array[j]) {
					duplicates = true;
				}
			}
			if (some == 45 && duplicates == false) {
				System.out.println("row: " + i + " is: " + "Good");
			} else {
				System.out.println("row: " + i + " is: " + "Bad");

			}
			some = 0;

		}

	}
}
