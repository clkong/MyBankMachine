/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
       String choice = JOptionPane.showInputDialog("Creating ATM object:\n"
                + "1.deposit money\n"
                + "2.withdraw money\n"
       +"3.add daily interest");
       if(choice.equalsIgnoreCase("1")){
          ATM ATM1 = new ATM();
       }
       else if (choice.equalsIgnoreCase("2")){
         ATM ATM2 = new ATM();
    }
    else if (choice.equalsIgnoreCase("3")){
          ATM ATM3= new ATM();
    }
    else{
        System.out.println("Invalid selection!");
}
}
}
   


    
    
