package net.htlgkr.gattermannk190189;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class NumberTester {
    private String fileName;
    private NumberTest oddTester;
    private NumberTest primeTester;
    private NumberTest palindromeTester;

    public NumberTester(String fileName){
        this.fileName = fileName;
    }

    public void setOddEvenTester(NumberTest oddTester){
        this.oddTester = oddTester;
    }

    public void setPrimeTester(NumberTest primeTester){
        this.primeTester = primeTester;
    }

    public void setPalindromeTester(NumberTest palindromeTester){
        this.palindromeTester = palindromeTester;
    }

    public void testFile(){
        try(BufferedReader br = new BufferedReader(new FileReader(fileName))){
            int cases = Integer.parseInt(br.readLine());

            for(int i = 0; i < cases; i++){
                String[] parts = br.readLine().split(" ");

                switch(Integer.parseInt(parts[0])){
                    case 1:
                       if(oddTester.testNumber(Integer.parseInt(parts[1]))) System.out.println("EVEN");
                       else System.out.println("ODD");
                       break;

                    case 2:
                        if(primeTester.testNumber(Integer.parseInt(parts[1]))) System.out.println("PRIME");
                        else System.out.println("NO PRIME");
                        break;

                    case 3:
                        if(palindromeTester.testNumber(Integer.parseInt(parts[1]))) System.out.println("PALINDROME");
                        else System.out.println("NO PALINDROME");
                        break;
                }
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }

}
