package javaAssignment;

import java.util.Random;

public class PasswordGenerator{
    public static void main(String[] args) {

       char [] password = {'a','1','b','c','0','d','e','f','g','6','h','i','j','k',
                'l','m','A','8','B','C','D','2','E','F','G','H','5','I','J','K','L',
               'M','n','9','o','p','7','q','r','s','t','u','v','4','w','x','y','z','N',
               'O','P','Q','R','8','S','T','U','V','W','3','X','Y','Z'}   ;

        Random pass = new Random();
       char random = ' ';
        for(int i = 0;i < 12; i++) {
            random = password[pass.nextInt(61)];
            // random.Max
            System.out.print(random);
        }


    }
}






