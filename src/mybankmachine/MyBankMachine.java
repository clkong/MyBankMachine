/*
 *Sean Luo 03/10/2018
 *MyBankMachine.java
 *This is progrem calculates the MyBankMachine.
 */
package mybankmachine;

import javax.swing.JOptionPane;

/**
 *
 * @author clkon
 */
public class MyBankMachine {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String bank = JOptionPane.showInputDialog("Please enter your bank's name.For example BMO,Royal Bank,etc.");
        String balanceStr = JOptionPane.showInputDialog("Please enter a starting balance.");
        double balance = Double.parseDouble(balanceStr);
        ATM ATM = new ATM(bank,balance);
        boolean done = false;
        String menu;
        while(!done){
        menu = JOptionPane.showInputDialog("Please select from the following menu:\n"
                +"1.display balance\n"           
                + "2.deposit money\n"
                + "3.withdraw money\n"
       +"4.add daily interest\n"
        +"5.Exit");
       if(menu.equalsIgnoreCase("1")){
          ATM.displayBalance();
       }
       else if (menu.equals("2")){
         String amountStr = JOptionPane.showInputDialog("How much will you deposit?");
         double amount = Double.parseDouble(amountStr);
         ATM.deposit(amount);
    }
    else if (menu.equals("3")){
           String amountStr = JOptionPane.showInputDialog("How much will you withdraw?");
         double amount = Double.parseDouble(amountStr);
         ATM.withdraw(amount);
    }
    else if (menu.equals("4")){
        String rateStr = JOptionPane.showInputDialog("What is the annual interest rate as a percentage?");
        String daysStr = JOptionPane.showInputDialog("How many days will you leave the balance invested?");
        double rate = Double.parseDouble(rateStr);
        int days = Integer.parseInt(daysStr);
        ATM.addDailyInterest(rate,days);
    }
    else if (menu.equals("5")){
        done = true;
    }
    else{   
        JOptionPane.showMessageDialog(null,"Invalid selection!");
    }
}
}
}
   


    
    
