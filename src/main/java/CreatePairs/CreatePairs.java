package CreatePairs;

import java.util.Arrays;

public class CreatePairs {
    public int maximalSum(int[] data) {
        if (data.length < 2)
            return -1;
        int sum = 0;
        Arrays.sort(data);
        int lengthOfArray = data.length;
        int backwardIndex;
        int flag = 0;
        for (backwardIndex = (lengthOfArray - 1); backwardIndex >= 0 && data[backwardIndex] > 0;) {
            if ((backwardIndex - 1) >= 0 && data[backwardIndex - 1] > 0) {
                if (data[backwardIndex] > 1 && data[backwardIndex - 1] > 1) {
                    sum += data[backwardIndex] * data[backwardIndex - 1];
                } else {
                    sum += data[backwardIndex] + data[backwardIndex - 1];
                }
                backwardIndex -= 2;
            }
            else {
                flag = 1;
                sum += data[backwardIndex];
                break;
            }
        }
        if(flag == 0) {
            backwardIndex += 1;
        }
        int forwardIndex;
        for(forwardIndex = 0; forwardIndex < lengthOfArray && data[forwardIndex] <= 0;) {
            if ((forwardIndex + 1) < backwardIndex && data[forwardIndex + 1] <= 0) {
                sum += data[forwardIndex] * data[forwardIndex + 1];
                forwardIndex += 2;
            }
            else {
                sum += data[forwardIndex];
                forwardIndex += 1;
                break;
            }
        }
        for(int i = forwardIndex; i < backwardIndex; i++) {
            sum += data[i];
        }
        return sum;
    }
}
