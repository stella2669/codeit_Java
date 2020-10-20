package class02_02_최댓값;

public class GreatestDifferenceFinder {
    int greatestDifference(int[] intArray) { //두 정수의 차가 가장 큰값 => 최댓값 - 최솟값
        if(intArray.length < 2){
            return 0;
        }
        
        int max = intArray[0];
        int min = intArray[0]; //초기화
        
        for(int i = 0; i < intArray.length; i++) {
        	if(max < intArray[i]) {
        		max = intArray[i];
        	}
        	if(min > intArray[i]) {
        		min = intArray[i];
        	}
        }
        return max - min;
    }
}
