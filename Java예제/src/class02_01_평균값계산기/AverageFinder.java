package class02_01_평균값계산기;

public class AverageFinder {
	double computeAverage(int[] intArray) {
		int total = 0;
		for(int i = 0; i < intArray.length; i++) {
			total += intArray[i];
		}
		return (double)total / intArray.length;
	}
}
