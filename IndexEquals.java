import java.util.Arrays;

public class IndexEquals {

	public static void main(String[] args) {
		int[] array = { -3, -1, 1, 3, 0, 5 };
		String result = "";
		int i = 0;
		for (int index = 0; index < array.length; index++) {

			if (array[i] == index) {
				result += Integer.toString(array[i]);

			}
			i++;
		}
		System.out.println(result);

	}

}
