package BoundaryValue;

public class Value {

	public int[] bvaValue = new int[5];
	public int[] rbvaValue = new int[7];

	public void setNumbers(int max, int min) {
		bvaValue[0] = min;
		bvaValue[1] = min + 1;
		bvaValue[2] = (min + max) / 2;
		bvaValue[3] = max - 1;
		bvaValue[4] = max;

		rbvaValue[0] = min - 1;
		rbvaValue[1] = min;
		rbvaValue[2] = min + 1;
		rbvaValue[3] = (min + max) / 2;
		rbvaValue[4] = max - 1;
		rbvaValue[5] = max;
		rbvaValue[6] = max + 1;

	}

	public int[] getbvaValue() {
		return this.bvaValue;
	}

	public int[] getrbvaValue() {
		return this.rbvaValue;
	}

	public static int findNominalValue(int max, int min) {
		return (max + min) / 2;
	}
}
