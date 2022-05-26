/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package palindrom;

/**
 *
 * @author Samsung
 */
public class Palindrom {

    /**
     * @param args the command line arguments
     */
    static boolean ispalindrom(int number){
        int temp=number,reverseNumber=0,lastNumber;
        while(temp!=0){
        lastNumber=temp%10;
        reverseNumber=(reverseNumber*10)+lastNumber;
        temp/=10;
        
    }
        if(reverseNumber==number)
            return true;
        else
            return false;
    }    
        
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(ispalindrom(123454321));
    }
    
}
