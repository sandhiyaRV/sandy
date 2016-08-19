public class TargetArray {
	public static void main(String[] args) {
		int array[] = { 2, 7, 11, 13 };
		int result = 0;
		int result1 = 0;
		int target=9;
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] + array[i + 1] == target) {
				     result = array[i];
					 result1 = array[i + 1];
				}
			}
		}
		System.out.println(result+"+"+result1 + " "  + "is" + " "+target);
	}
}
