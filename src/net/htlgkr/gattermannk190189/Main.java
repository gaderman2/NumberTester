package net.htlgkr.gattermannk190189;

public class Main {
    public static void main(String[] args) {
        NumberTester numberTester = new NumberTester("C:\\Users\\user\\Documents\\Schule\\3. Klasse\\POS\\NumberTester\\src\\numbers.txt");
        numberTester.setOddEvenTester(x -> x % 2 == 0);
        numberTester.setPrimeTester(x -> {

            boolean[] var = new boolean[x + 1];

            for(int i = 2; i <= Math.sqrt(x); i++){
                if(!var[i]){
                    for(int j = i*i; j <= x; j += i)
                        var[j] = true;
                }

                if(var[x])
                    return false;

            }

            return true;
        });

        numberTester.setPalindromeTester(x -> {
            StringBuilder s = new StringBuilder(x);
            s.reverse();
            StringBuilder s1 = new StringBuilder(x);
            return s.compareTo(new StringBuilder(x)) == 0;
        });

        numberTester.testFile();
    }
}