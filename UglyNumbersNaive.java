public class UglyNumbersNaive {
    public static long getUglyNumber(long[] given, int n) {
        long[] uglyNumbers = new long[n+1];
        uglyNumbers[0] = 1;
        long maxnumber = Integer.MAX_VALUE;
        int startingValue = 2;
        long temp = 2;

    for(int j=1;j<uglyNumbers.length;){
        temp=startingValue;
        for(int i=0;i<given.length;i++){
            while(temp%given[i]==0){
                temp=temp/given[i];
            }
            if(temp==1){
                uglyNumbers[j]=startingValue;
                j++;
                break;

            }
        }
        startingValue++;}
   
        return uglyNumbers[uglyNumbers.length - 1];
    }

}
