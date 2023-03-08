package assignments.GenericsProblem;

public class MaximumTest<T extends Comparable<T>> {
	public static <E extends Comparable<E>> E maximum(E firstVariable,E secondVariable,E thirdVariable) {
		E max = firstVariable;
		if(secondVariable.compareTo(max) > 0)
		{
			max = secondVariable;
		}
		if(thirdVariable.compareTo(max) > 0)
		{
			max = thirdVariable;
		}
		return max;
	}
}



