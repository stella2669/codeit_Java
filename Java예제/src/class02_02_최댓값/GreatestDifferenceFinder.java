package class02_02_�ִ�;

public class GreatestDifferenceFinder {
    int greatestDifference(int[] intArray) { //�� ������ ���� ���� ū�� => �ִ� - �ּڰ�
        if(intArray.length < 2){
            return 0;
        }
        
        int max = intArray[0];
        int min = intArray[0]; //�ʱ�ȭ
        
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
