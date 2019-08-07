package TriFibonacci;

public class TriFibonacci {

    public int findMissingNumber(int[] numbers) {
        int result = -1;
        for (int index = 0; index < numbers.length ; index++) {
            if(numbers[index] == -1) {
                if(index > 2) {
                    numbers[index] = numbers[index - 1] + numbers[index - 2] + numbers[index - 3];
                }
                else {
                    switch (index) {
                        case 0 :
                            numbers[0] = numbers[3] - (numbers[1] + numbers[2]);
                            break;
                        case 1:
                            numbers[1] = numbers[3] - (numbers[0] + numbers[2]);
                            break;
                        case  2:
                            numbers[2] = numbers[3] - (numbers[1] + numbers[0]);
                            break;
                    }
                }
                result = numbers[index];
                break;
            }
        }
        if(result > 0 && isTriFibonacciSeriesValid(numbers))
            return result;
        return -1;
    }

    private boolean isTriFibonacciSeriesValid(int[] numbers) {
        for (int index = 3; index < numbers.length; index++) {
            if(numbers[index] != (numbers[index - 1] + numbers[index - 2] + numbers[index - 3])) {
                return false;
            }
        }
        return true;
    }
}
