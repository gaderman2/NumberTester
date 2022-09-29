package net.htlgkr.gattermannk190189;

public class NumberTester {
    private String fileName;
    private NumberTest oddTester;
    private NumberTest primeTester;
    private NumberTest palindroneTester;

    public NumberTester(String fileName){
        this.fileName = fileName;
    }

    public void setOddEvenTester(NumberTest oddTester){
        this.oddTester = oddTester;
    }

    public void setPrimeTester(NumberTest primeTester){
        this.primeTester = primeTester;
    }

    public void setPalindroneTester(NumberTest palindroneTester){
        this.palindroneTester = palindroneTester;
    }

    public void testFile(){
        //TODO
    }

}
