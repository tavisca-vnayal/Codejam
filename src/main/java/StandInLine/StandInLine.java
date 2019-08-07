package StandInLine;

public class StandInLine {
    public int[] reconstruct(int[] left) {
        int lengthOfArray = left.length;
        int[] reconstructLeft = new int[lengthOfArray];
        int index;
        for(index = 0; index < lengthOfArray; index++) {
            reconstructLeft[index] = -1;
        }
        for(index = 0; index < lengthOfArray; index++) {
            int leftCount = left[index];
            for(int i = 0; i < lengthOfArray; i++) {
                if(reconstructLeft[i] == -1) {
                    if(leftCount == 0) {
                        reconstructLeft[i] = index + 1;
                        break;
                    }
                    else {
                        leftCount -= 1;
                    }
                }
            }
        }
        return reconstructLeft;
    }
}
