public class UglyNumbersDP {
    public static long getUglyNumber(long[] given, int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return given[0];
        }
        int[] multiples = new int[given.length]; //create a arr of multiples
        for (int i = 0; i < multiples.length; i++) {
            multiples[i] = 0; //fill the arr with 0
        }

        long[] uglyNumbers = new long[n+1]; //create a arr to save ugly numbers
        uglyNumbers[0] = 1; //first element is 1
        long[] temp = new long[given.length];
        long min = Integer.MAX_VALUE;

        for (int i = 1; i < uglyNumbers.length; i++) { //iterate through ugly numbers
            for (int j = 0; j < given.length; j++) { //iterate through the given arr ,fill the values in temp
                temp[j] = given[j] * uglyNumbers[multiples[j]];
            }
            min=temp[0];
            for(int z=0;z< temp.length;z++){  //find the min in temp arr
                if(temp[z]<=min){
                    min=temp[z];

                }

            }
            for(int z=0;z< temp.length;z++){
                if(temp[z]==min){
                    multiples[z]++;// increase the multiplies element by one
                                    }

            }

            uglyNumbers[i] = min; // add the min to ugly numbers



        }
        return uglyNumbers[n];
    }
}