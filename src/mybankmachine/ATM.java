/*
 *Sean Luo 15/10/2018
 *ATM.java
 *This is progrem calculates the ATM.
 */
package mybankmachine;

import javax.swing.JOptionPane;

/**
 *
 * @author clkon
 */
public class ATM {
    String bankName;
    double balance;
    
public ATM(String bankName1, double balance1){
    bankName = bankName1;
    balance = balance1;
}    
public void displayBalance(){
    balance = Math.rint(balance*100)/100;
    JOptionPane.showMessageDialog(null,"The current balance = " + balance);
}
    
public void deposit(double amount){
         if(amount > 0 ){
         balance +=amount;
}
          else{
          JOptionPane.showMessageDialog(null,"Your input should be greater than 0");  
                 }

}
public void withdraw(double amount){
        if(amount <0){
    JOptionPane.showMessageDialog(null,"Your input should be greater than 0");
}        
        else if (balance < amount){
                JOptionPane.showMessageDialog(null,"You don't have enough money to withdraw.");
                }
                else{
                balance -=amount;
                }
    
}
    public void addDailyInterest(double intRate,int numDays){
        if(intRate >= 0 && numDays >=0){
            double i =(intRate/100)/365;
            double A = balance * Math.pow((1.0 + i),numDays);
            JOptionPane.showMessageDialog(null,"The intereset earned in " + numDays + " = " +
                    (A - balance));
            balance = A;
        }
        else{
            JOptionPane.showMessageDialog(null,"There is a problem with your interest"
                    + "rate or the number of days");
            JOptionPane.showMessageDialog(null,"Your input should be greater than 0");
        }


    
}

}

