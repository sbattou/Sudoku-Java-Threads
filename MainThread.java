public class MainThread {
	public static void main(String args[]) {

		RowThread row = new RowThread();
		row.start();
		ColumnThread col = new ColumnThread();
		col.start();
		SquareThread sqr = new SquareThread();
		sqr.start();
		try {
			row.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			col.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			sqr.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
